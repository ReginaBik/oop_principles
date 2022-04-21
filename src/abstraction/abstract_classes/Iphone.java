package abstraction.abstract_classes;

public class Iphone extends Phone implements Camera, BlueTooth{

    public Iphone() {
    }

    public Iphone(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    public static final String OS = "IOS";

    @Override
    public void takesPhoto() {

        System.out.println("Iphone takes photo");

    }

    @Override
    public void call() {
        System.out.println("Iphone calls");
    }

    @Override
    public void ring() {
        System.out.println("Iphone rings");

    }

    @Override
    public void text() {
        System.out.println("Iphone texts");

    }

    @Override
    public boolean isConvertible() {
        return false;
    }

    @Override
    public void connectBlueTooth() {
        System.out.println("Iphone connects to BlueTooth");
    }


}
