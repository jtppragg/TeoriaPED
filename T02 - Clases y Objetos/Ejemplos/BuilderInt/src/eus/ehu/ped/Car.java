package eus.ehu.ped;

public class Car {
    private final int wheels;
    private final String color;
    
    public static class Builder {
        private int wheels = 4;
        private String color = "white";
        
        public Builder() {
        }
        
        public Builder wheels(int val) {
            wheels = val;
            return this;
        }
        
        public Builder color(String val) {
            color = val;
            return this;
        }
        
        public Car build() {
            return new Car(this);
        }
    }
    
    private Car(Builder builder) {
        this.wheels = builder.wheels;
        this.color = builder.color;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }   
}
