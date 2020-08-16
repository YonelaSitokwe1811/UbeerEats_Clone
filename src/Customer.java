import java.net.PortUnreachableException;

/**
 * Ontefetse Ditsele
 * 13 August 2020
 * 
 * A Customer class: To add orders and return the
 */
import java.util.ArrayList;
//The Customer class(Subclass) inherits the attributes and method form the Person class(Superclass):

public class Customer extends Person{
    private ArrayList<Dish> Order;
    private String address;

    public Customer(String name, String surname, String phone_num,String location, double cash) {
        super(name, surname, phone_num, cash);
        Order = new ArrayList<Dish>();
        this.address = location;
    }

    //Orders
    public void addDish(Dish d){
        Order.add(d);
    }
    public void displayOrder(){
        for (Dish d: Order){
            System.out.println(d);
        }
    }
    public ArrayList<Dish> getOrder(){
        return Order;
    }
    //Address to deliver
    public String getAddress(){
        return this.address;
    }
    @Override
    public String toString(){
        return super.toString() + " I am a Customer.";
    }    
}