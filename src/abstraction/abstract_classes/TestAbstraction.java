package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {
        Samsung s1 =
                new Samsung("Samsung", "Black", 64, 700);

        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        Iphone i1 = new Iphone("Apple", "Silver", 128, 1000);

        List<Phone> phones = new ArrayList<>();

        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        int counter = 0;
        int which = Integer.MIN_VALUE;
        Phone expensive = null;
        for(Phone phone : phones){
            System.out.println(phone);
            if(phone.price > which) expensive = phone;
            if(phone.isConvertible()) counter++;
  }
        System.out.println("The most expensive phone is " + expensive.getClass().getSimpleName() );
        System.out.println("Phones convertible = " + counter++);
        System.out.println("The color of the most expensive phone is = " + expensive.color);

        System.out.println(Iphone.OS);






    }
}
