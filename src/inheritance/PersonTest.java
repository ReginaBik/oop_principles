package inheritance;

import package5.Singer;

import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Tester tester1 = new Tester();
        Singer singer1 = new Singer();
        Dancer dancer1 = new Dancer();

        person1.setfName("John");
        person1.setlName("Doe");
        person1.setAge(45);
        person1.setGender("Male");
        person1.setDOB("01/01/1977");
        person1.setSSN("000-00-0000");


        tester1.setfName("Abe");
        tester1.setlName("Kin");
        tester1.setAge(20);
        tester1.setGender("Male");
        tester1.setDOB("01/12/2002");
        tester1.setSSN("111-11-1111");

        singer1.setfName("Kaly");
        singer1.setlName("Ngo");
        singer1.setAge(15);
        singer1.setGender("Female");
        singer1.setDOB("05/10/2007");
        singer1.setSSN("222-22-2222");

        dancer1.setfName("Alona");
        dancer1.setlName("Q");
        dancer1.setAge(15);
        dancer1.setGender("Female");
        dancer1.setDOB("10/10/2007");
        dancer1.setSSN("333-33-3333");

        System.out.println(person1);
        System.out.println(tester1);
        System.out.println(singer1);
        System.out.println(dancer1);

        Person person2 = new Person("Jane", "Doe", 45, "Female");
        person2.setSSN("555-55-5555");
        person2.setDOB("01/01/1997");

        Tester tester2 = new Tester("Young", "Kim", 20, "Male");
        tester2.setSSN("777-77-7777");
        tester2.setDOB("01/12/2002");

        Singer singer2 = new Singer("Jessie", "J", 15, "Female");
        singer2.setSSN("666-66-6666");
        singer2.setDOB("05/10/2007");

        Dancer dancer2 = new Dancer("B", "Q", 15, "Female");
        dancer2.setSSN("999-99-9999");
        dancer2.setDOB("10/10/2007");

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person2);
        personList.add(tester2);
        personList.add(singer2);
        personList.add(dancer2);

        //personList.forEach(System.out::println);

        System.out.println("_______Person arrayList________");

        personList.forEach(element -> System.out.println(element));
        Person[] personArr = {person2, singer2, tester2, dancer2};

        for(Person person : personArr){
            System.out.println(person);
        }

        tester1.code();
        dancer2.dance();
        singer2.sing();



 }
}
