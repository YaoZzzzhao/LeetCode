package Practice;

import java.util.List;

class Et{
    public String value="parent";
    public String sayHi(){
        return value;
    }
    // for(int i :a){
    // 	System.out.println(a);
    // }

}

 class Datastruc extends Et{
    public String value="child";
    public String sayHi(){
        return value;
    }

//    <T> void addd(List<T> list){
//        list.add("foo");
//    }

    public static void main(String[] args) {
        Et a = new Datastruc();
        System.out.println(a.value+a.sayHi());
    }

}
