public class Car extends Vehicle {
    public String make;
    String model;
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public Car() {
        this.make = "Toyota";
        this.model = "Camry";
    }
    public void navigation(String location){
        System.out.println("Car is located in " +location);
    }
}
