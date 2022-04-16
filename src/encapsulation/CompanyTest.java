package encapsulation;

public class CompanyTest {
    public static void main(String[] args) {

        Company comp1 = new Company();
        Company comp2 = new Company();

        comp1.setName("Apple");
        comp1.setAddress("California");
        comp1.setPhone("(123) 312-2345");

        comp2.setName("Google");
        comp2.setAddress("California");
        comp2.setPhone("(000) 055-5555");

        System.out.println("Company1 is -> " + comp1);
        System.out.println("Company2 is -> " + comp2);
        System.out.println("Company1 is = \"" + comp1.getName() +
                "\" and Company2 is = \"" + comp2.getName() + "\"");






    }
}
