package Practice;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.DefaultResponseErrorHandler;

import java.io.IOException;

@Service
public class RestTemplateErrorHandler extends DefaultResponseErrorHandler {
    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
        return(
                clientHttpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR
                || clientHttpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR
                );
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        if(response.getStatusCode().is4xxClientError()){
            System.out.println("Client error");
        }else if(response.getStatusCode().is5xxServerError())
            System.out.println("Server error");
    }
}
