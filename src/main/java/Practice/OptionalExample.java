package Practice;

import Shape.Person;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class OptionalExample {
    public static void main(String[] args) {

        Person p = new Person();
//        System.out.println(("Yao").equals(p.getName()));
         Integer a = null;
         Integer b = 10;
        Optional<Integer> aa = Optional.of(10);
        Optional<Integer> aaa = Optional.of(10);

        List<Person> list = new ArrayList<>();

//        System.out.println(Optional.ofNullable(new ArrayList<>()).isPresent());
        Integer integer;

        for(int i = 0;i<5;i++){
            Person person = new Person();
            person.setAge(i*9);
            list.add(person);
        }

        Long id = 10L;
        String message = "first"+(char)7+(char)7+"to";
//        Thread
        Person p2 = new Person();
        p2.setName("YaoZz");
        String[] strs = message.split(String.valueOf((char)7));
        Date d = new Date(1591907776797L);
        LocalDate now = LocalDate.now().minusDays(4);

        LocalDate firstDayOfQuarter = now.minusMonths((now.getMonthValue()+2)%3).withDayOfMonth(1);
//        System.out.println(now.minusDays(now.getDayOfWeek().getValue()-1));
        System.out.println(p2);
    }
}
