public class Sandwich {
    private String mainIngredient;
    private String breadType;
    private double price;

    // Constructor (optional, but good practice)
    public Sandwich(String mainIngredient, String breadType, double price) {
        this.mainIngredient = mainIngredient;
        this.breadType = breadType;
        this.price = price;
    }

    // Getter for mainIngredient
    public String getMainIngredient() {
        return mainIngredient;
    }

    // Setter for mainIngredient
    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    // Getter for breadType
    public String getBreadType() {
        return breadType;
    }

    // Setter for breadType
    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }
}