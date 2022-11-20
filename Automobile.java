public class Automobile {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Automobile(String brand, String model, double engineVolume, String color, int year, String country){
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString(){
        return "Brand: " + this.brand + ". Model: " + this.model + ". Engine volume: "
                + this.engineVolume + ". Color: " + this.color + ". Year: "
                + this.year + ". Country: " + this.country;
    }
}
