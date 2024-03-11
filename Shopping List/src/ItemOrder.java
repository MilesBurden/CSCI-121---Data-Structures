import java.util.ArrayList;

public class ItemOrder {
    public Item currentItem;
    public int itemAmount;

    public ItemOrder(Item item, int quantity){
        currentItem = item;
        itemAmount = quantity;
    }
}
