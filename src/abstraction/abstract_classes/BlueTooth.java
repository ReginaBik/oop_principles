package abstraction.abstract_classes;

public interface BlueTooth {
    void connectBlueTooth();

    //static method
    static int getYear(){
        return 2022;
    }

    //default method(non-static method that has body)
    public default boolean isConnected(){
        return true;
    }



}
