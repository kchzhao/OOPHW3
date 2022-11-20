public class Automobile {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Automobile(String brand, String model, double engineVolume, String color, int year, String country){
        this.brand = brand;
        if(brand == null || brand.equals(" ")){
            this.brand = "default";
        }
        this.model = model;
        if(model == null || model.equals(" ")){
            this.model = "default";
        }
        this.engineVolume = engineVolume;
        if(engineVolume <= 0){
            this.engineVolume = 1.5;
        }
        this.color = color;
        if(color == null || color.equals(" ")){
            this.color = "White";
        }
        this.year = year;
        if(year <= 0){
            this.year = 2000;
        }
        this.country = country;
        if( country == null || country.equals(" ")){
            this.country = "default";
        }
    }

    @Override
    public String toString(){
        return "Brand: " + this.brand + ". Model: " + this.model + ". Engine volume: "
                + this.engineVolume + ". Color: " + this.color + ". Year: "
                + this.year + ". Country: " + this.country;
    }
}
