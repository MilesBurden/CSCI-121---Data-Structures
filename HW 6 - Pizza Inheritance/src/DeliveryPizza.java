public class DeliveryPizza extends Pizza{
    String address;
    double deliveryFee;

    public DeliveryPizza(String[] list, String addressIn) {
        super(list);
        address = addressIn;
        if(this.price >= 18.0){
            deliveryFee = 3.0;
        }
        else{
            deliveryFee = 5.0;
        }
        price += deliveryFee;
    }
}
