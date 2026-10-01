package day5;


public class car {
    String brand;
    int year;
    void carstart(){
        System.out.print("Car started");
    }   
    }
    class Main1{
        public static void main(String[] args){
            car mycar = new car();
            mycar.brand="range rover";
            mycar.year=2030;
            mycar.carstart();

        }
    }