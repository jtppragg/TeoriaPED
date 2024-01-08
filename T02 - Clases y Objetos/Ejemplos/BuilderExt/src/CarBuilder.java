
public class CarBuilder {
    private Car car;

    public CarBuilder setWheels(int wheels) {
        car.setWheels(wheels);
        return this;
    }

    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }
    
    public Car build() {
        return car;
    }
}
