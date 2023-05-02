public class Item {
    private String name_;
    private double price_;
    private static int idStatic_ = 0;
    private int idNonStatic_;

    private ExpirationDate expirationDate_;

    public Item() {
        name_ = "ERROR";
        price_ = -1;
        idStatic_++;
        idNonStatic_ = idStatic_;
    }

    public Item(String name, double price) {
        name_ = name;
        price_ = price;
        idStatic_++;
        idNonStatic_ = idStatic_;
    }

    public Item(Item other) {
        name_ = other.name_;
        price_ = other.price_;
        idStatic_++;
        idNonStatic_ = idStatic_;
    }

    public void display() {
        System.out.println("Item name: " + name_);
        System.out.println("Item price: " + price_);
        System.out.println("Item static ID: " + idStatic_);
        System.out.println("Item non-static ID: " + idNonStatic_);
        if (expirationDate_ != null) {
            expirationDate_.display();
        }
        System.out.println();
    }
    public static int getIdStatic() {
        return idStatic_;
    }
}
