package the_thing;

import java.util.Date;

public class MenuItem {
    private static int nextItemId = 0;
    private String name;
    private int price;
    private String description;
    private String category;
    private Date dateAdded = new Date();

    public MenuItem(int nextItemId, String name, int price, String description, String category, Date dateAdded) {
        nextItemId = nextItemId;
        nextItemId++;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = dateAdded;
        //Menu.setLastEditDate();
    }
    public MenuItem(String name,int price, String description, String category){
        this(nextItemId, name, price, description, category, new Date());
    }
    //getters
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public Date getDateAdded() {
        return dateAdded;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setCategory(String category) {
        this.category = category;
    }

}