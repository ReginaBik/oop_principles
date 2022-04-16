package encapsulation;

public class Car {

    //instance variables
    public String make;
    private int year;
    private double price; //require a password
    private boolean isConvertible = true;

    //getting boolean
    public boolean getIsConvertible(){
        return isConvertible;
    }


//set price
    public void setPrice(double price, String adminPassword){
        if(adminPassword.equals("abc123")) this.price = price;
        else throw new RuntimeException("The password entered is not valid!!!");
    }


    //get price
    public double getPrice(){
        return this.price; // or return price
    }


    //Providing indirect access to year to set and get info
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear(){
        return this.year;  //you can put return year as well
    }
}
