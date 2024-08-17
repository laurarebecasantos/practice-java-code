package dia5.car;

public class Main {
    public static void main(String[] args){
        dia5.car.Car car = new dia5.car.Car("BMW", "X6", 2024, 125000);
        car.setModel("X5");

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
