package Practice;

public interface DefaultMethodPractice {
    String screen = "17 inches";    // The properties defined in the interface are final;
    String fps = "244Hz";
    Double price = null;
    String CPU = null;

    static void startUp(String command) {       //you can define a static method in an interface but it must have a body which means abstract and static can not be at the same time
        System.out.println(command + " : I don't know what to type....");
    }

    void shutDown(String button);

    default String copy(String typeIn){
        return typeIn;
    }

}

abstract class AbstractClassTest implements DefaultMethodPractice{

}

class Macbook implements DefaultMethodPractice{

    String color;

    public void startUp(String command){
        System.out.println("The Macbook is starting....");
    }

    public void shutDown(String button){
        if(button.equals("shut down"))
            System.out.println("The Macbook is shutting down....");
    }

    Macbook() {
        this.color = "grey";
    }

    public static void main(String[] args) {
        Macbook mb = new Macbook();
        System.out.println(mb.copy("Just a test for default method>>>>>"));
    }

}
