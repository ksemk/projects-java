class ExpirationDate {
    private String date_;

    public ExpirationDate(String date) {
        date_ = date;
    }

    public void display() {
        System.out.println("Items expiration date: " + date_);
    }
}