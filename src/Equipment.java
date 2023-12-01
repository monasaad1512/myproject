
import java.io.Serializable;
public class Equipment implements Serializable {
    private String name;
    private String code;
    private int quantity;
    private String photo;

    public Equipment(String name, String code, int quantity, String photo) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.photo = photo;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", quantity=" + quantity +
                ", photo='" + photo + '\'' +
                '}';
    }

    // Method to display equipment information
    public void display() {
        System.out.println("Equipment Name: " + name);
        System.out.println("Equipment Code: " + code);
        System.out.println("Quantity: " + quantity);
        System.out.println("Photo: " + photo);
    }
}