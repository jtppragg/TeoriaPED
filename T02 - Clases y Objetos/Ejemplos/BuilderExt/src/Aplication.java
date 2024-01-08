
public class Aplication {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setColor("red")
                .setWheels(4)
                .build();
    }
}
