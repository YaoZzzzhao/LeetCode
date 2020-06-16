package Shape;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    public String name;
    private String sex;

//    @Getter
//    @Setter
    private int age;

    public Person(){};


//    public String getName() {
////        return name;
////    }
////
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    public String getSex() {
////        return sex;
////    }
////
////    public void setSex(String sex) {
////        this.sex = sex;
////    }
////
////    public int getAge() {
////        return age;
////    }
////
////    public void setAge(int age) {
////        this.age = age;
////    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
