package Practice;

/**
 * Prototype allows us to hide the complexity of making
 * new instances from the client. The concept is to copy
 * an existing object rather than creating a new instance
 * from scratch, something that may include costly operations.
 * The existing object acts as a prototype and contains
 * the state of the object. The newly copied object may
 * change same properties only if required. This approach
 * saves costly resources and time, especially when the
 * object creation is a heavy process.
 */

import java.util.Hashtable;
import java.util.Map;

public class PrototypeDesignPattern {
    public static void main(String ... args) {
        CloneStore.getCloneObject("Black").addShell();
        CloneStore.getCloneObject("Gold").addShell();
        CloneStore.getCloneObject("Gold").addShell();
        CloneStore.getCloneObject("Original").addShell();

//        String ... args =
    }
}

class Device implements Cloneable{
    protected String deviceColor;
    public void addShell(){
        System.out.println("Add an original shell^^^^^^^^");
    }
    public Object clone(){
        Object obj = null;
//        Object.class.getMethods();
//        obj.getClass().getMethods();
        try{
            obj = super.clone();
        }catch(CloneNotSupportedException e){
            e.getStackTrace();
        }
        return obj;
    }
}

class ApplePhone extends Device {
    public ApplePhone(){
        this.deviceColor = "Gold";
    }
    @Override
    public void addShell() throws RuntimeException{
        System.out.println("Add a blue one shell>>>>>");
    }
}

class OppoPhone extends Device{
    public OppoPhone(){
        this.deviceColor = "Black";
    }
    @Override
    public void addShell(){
        System.out.println("Add a white one shell**********");
    }
}

class CloneStore{
    public  static Map<String,Device> tableTest = new Hashtable<>();

    static{
        tableTest.put("Original", new Device());
        tableTest.put("Black", new OppoPhone());
        tableTest.put("Gold", new ApplePhone());
    }
//    public static void main(String[] args){
//        tableTest.put("Black", new OppoPhone());
//    }
//    int x = 5;
    public static Device getCloneObject(String deviceColor){
        return (Device)tableTest.get(deviceColor).clone();
    }

}
