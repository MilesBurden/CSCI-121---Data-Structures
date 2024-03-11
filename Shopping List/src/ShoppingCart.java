import java.util.ArrayList;

public class ShoppingCart {
    static ArrayList<ItemOrder> list = new ArrayList<ItemOrder>();

    public static void addToList(ItemOrder item){
        list.add(item);
    }

    public void removeFromList(int item){
        list.remove(item);
    }

    public static int searchInList(ItemOrder item){
        return list.indexOf(item);
    }

    public void reportPrice(){
        double total = 0;
        for (ItemOrder i : list) {
           total += i.currentItem.itemPrice;
        }
    }
}
