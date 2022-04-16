package encapsulation;

public class CarTest {
    public static void main(String[] args) {

       Car car1 = new Car();
       //Setting info for make
       car1.make = "BMW";

       //Getting info of make
        System.out.println(car1.make); // if u don't set information you get null

        //get info for year

        car1.setYear(2020);

        //Getting info for year
        System.out.println(car1.getYear()); // no info ->return will be 0

        car1.setPrice(5000, "abc123");

        System.out.println(car1.getIsConvertible());

 }
}
