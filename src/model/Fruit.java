package model;

public class Fruit {

    /*
    Commentator: LAMDTHE153097
    
    KHAI BÁO THUỘC TÍNH fruitId theo kiểu int theo đúng yêu cầu trong file Requirement_FruitShop.pdf:
    
    private int fruitId
     */
    //Sửa kiểu Id từ string -> int theo requirement
    //Đỗ Thành Trung - Lê Trung Thành
    private int fruitId;
    private String fruitName;
    private double price;
    private int quantity;
    private String origin;

    public Fruit() {
    }

    public Fruit(int fruitId, String fruitName, double price, int quantity, String origin) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

}
