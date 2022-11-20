import java.util.Arrays;
public class Main {
    public static Automobile[] automobiles = new Automobile[5];
    public static void main(String[] args) {
    automobiles = new Automobile[] {
                new Automobile("Lada","Granta", 1.7, "Yellow",2015,"Russia"),
                new Automobile("Audi","A8 50 L TDI quattro", 3.0,"Black",2020,"Germany"),
                new Automobile("BMW","Z8",3.0,"Black",2021,"Germany"),
                new Automobile("Kia","Sportage 4th generation",2.4,"Red",2018,"South Korea"),
                new Automobile("Hyundai","Avante",1.6, "Orange",2016,"South Korea")
                };

    printAutomobiles();
    }

    public static void printAutomobiles(){
        for(int i = 0; i < automobiles.length; i++) {
            System.out.println(automobiles[i].toString());
        }
    }




}