import java.util.ArrayList;
import java.util.Arrays;

public class Store {
    public static void main(String[] args) {
        // objects created separately
        System.out.println("\n\nCreated separately objects output: ");
        Item itemDefault = new Item();
        itemDefault.display();
        Item itemParameter = new Item("banana", 3.5);
        itemParameter.display();
        Item itemCopy = new Item(itemParameter);
        itemCopy.display();


        // using an array
        Item[] tab = new Item[3];
        Arrays.fill(tab, new Item());
        System.out.println("\n\nAn array output: ");
        for (Item item : tab) {
            item.display();
        }

        // using a collection
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item());
        list.add(new Item("Apple", 2.1));
        list.add(new Item(itemParameter));
        System.out.println("\n\nA collection output: ");
        for (Item item : list) {
            item.display();
        }

        System.out.println("Number of Item objects printed: " + Item.getIdStatic());
        System.out.println();

        ExpirationDate expirationDate = new ExpirationDate("2023-04-30");
        expirationDate.display();
    }
}