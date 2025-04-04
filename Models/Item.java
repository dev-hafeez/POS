public class Item {
    private String item;
    private Float quantity;
    private Float price;
    private Float amount;
    private String location;
    private long itemId;

    public Item() {
    }

    public Item(String item, Float quantity, Float price, Float amount, String location, long itemId) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
        this.amount = amount;
        this.location = location;
        this.itemId = itemId;
    }

    public String getItem() {
        return item;
    }

    public Float getQuantity() {
        return quantity;
    }

    public Float getPrice() {
        return price;
    }

    public Float getAmount() {
        return amount;
    }

    public String getLocation() {
        return location;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItem(String item) {
        this.item = item;
    }


    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }
}
