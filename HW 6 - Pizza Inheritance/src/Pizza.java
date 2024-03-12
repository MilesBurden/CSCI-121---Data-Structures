public class Pizza {
    //topping array with size 10
    String[] toppingList = new String[10];
    //price field
    double price = 12.00;
    //list of toppings as a string
    String stringList = "";

    //constructor sets list
    public Pizza(String[] list){
        toppingList = list;
        //using foreach loop, so you don't need to pass in length of list
        for (String i : toppingList){
            if(i != null) {
                price += 2;
                stringList += i + ", ";
            }
        }
    }

    public String toString(){
        return stringList + ": $" + String.valueOf(price);
    }
}
