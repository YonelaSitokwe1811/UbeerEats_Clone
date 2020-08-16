import java.util.ArrayList;

public class Restaurant implements UberEatsResturant {
    private String name;
    private double Account;
    private Dish[] signatureDishes;
    private String location;

    private Customer client;
    private double cost;

    public Restaurant(String name, Dish[] sigDishes,String location){
        this.name = name;
        this.signatureDishes = sigDishes;
        this.location = location;
        this.cost = 0.95;
    }
    public void setClient(Customer client) {
        this.client = client;
    }
    public double getCost() {
        return this.cost;
    }

    @Override
    public Dish[] getSignatureDishes() {  return this.signatureDishes;    }

    @Override
    public String getLocation() {    return this.location;   }

    @Override
    public String getName() {   return this.name;   }

    //Class Methods
    public void displayMenu() {
        for (int i = 1; i < 4; i++){
            System.out.println(i+".  "+ signatureDishes[i-1]);
        }
    }
    public ArrayList<Dish> getOrderedCart(){
        return client.getOrder();
    }
    public void calculateCost (){
        for(Dish d : client.getOrder()){
            this.cost += d.getCost();
        }
    }

    public void checkout(){
        int fee = 50;
        Driver courierDriver = new Driver("Yamaha","Lice123","Rodney","Noah","0783905457");
        courierDriver.setPickUp(this.location);
        courierDriver.setDropOff(client.getAddress());

        client.setCash(client.getCash() - this.cost);
        this.Account += this.cost - fee;
        courierDriver.setCash(7000 + fee);
        System.out.println(courierDriver);
    }
}