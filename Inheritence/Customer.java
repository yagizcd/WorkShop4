package Inheritence;

public class Customer extends User{
    private String phoneNumber;

    private String address;

    public Customer(String phoneNumber,String address){
        this.phoneNumber = phoneNumber;
        this.address = address;

    }
    public Customer(){

    }
}
