import java.util.Objects;
import java.util.Scanner;

public class DemoPizza {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] topping = new String[10];
        topping[0] = "Plain cheese";
        String address;
        //for loop prompts for
        for(int i = 0; i < 10; i++){
            System.out.println("Write down a topping: ");
            String in = sc.nextLine();
            if(Objects.equals(in, "QUIT")){
                break;
            }
            else{
                topping[i] = in;
            }
        }

        System.out.println("Delivery? (Y/N): ");
        if(sc.next().contains("Y")){
            System.out.println("Delivery address: ");
            sc.nextLine();
            address = sc.nextLine();
            DeliveryPizza pizza = new DeliveryPizza(topping, address);
            System.out.println(pizza.toString());
            System.out.println(address);
        }
        else{
            Pizza pizza = new Pizza(topping);
            System.out.println(pizza.toString());
        }
    }
}
