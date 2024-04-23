package model;

public class Toy {
    private long id;
    private String name;
    private String description;
    private double price;
    private String size;
    private String ageGroup;

    public Toy(long id, String name, double price, String description, String size, String ageGroup) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.size = size;
        this.ageGroup = ageGroup;
    }

    public Toy(String name, double price, String description, String size, String ageGroup) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.size = size;
        this.ageGroup = ageGroup;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }
}
