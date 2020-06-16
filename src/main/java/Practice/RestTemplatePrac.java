package Practice;

import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class RestTemplatePrac {

//    @Autowired
    RestTemplateErrorHandler errorHandler = new RestTemplateErrorHandler();


    public static void main(String[] args) {
        String url = "http://192.168.1.16:8999/execute-BR-ta";
        Map<String, Object> map = new HashMap<>();
        map.put("data","taskJson");
        RestTemplatePrac r = new RestTemplatePrac();


        System.out.println(r.makeCall(url,HttpMethod.POST,String.class,"Anything").getBody());
    }

    public <T,K> ResponseEntity<T> makeCall(String url, HttpMethod method, Class<T> responseType, @Nullable K payload) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(errorHandler);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<K> requestEntity = new HttpEntity<K>(payload, headers);

        // JSONObject response = restTemplate.postForObject(url, requestEntity, JSONObject.class);
        //ResponseEntity<JSONObject> response = restTemplate.postForEntity(url, requestEntity, JSONObject.class);
        ResponseEntity<T> response =    restTemplate.exchange(url, method, requestEntity, responseType);
//        System.out.println(response.getBody());
        return response;

    }
}
