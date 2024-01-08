package eus.ehu.ped;

public class Aplication {
    public static void main(String[] args) {
        Car car = new Car.Builder()
            .color("red")
            .build();
        
        Car trunk = new Car.Builder()
            .color("black")
            .wheels(8)
            .build();
        
        print(car);
        print(trunk);
    }

    private static void print(Car car) {
        System.out.printf("Color: %s, wheels: %d\n",
            car.getColor(), car.getWheels());
    }
}
