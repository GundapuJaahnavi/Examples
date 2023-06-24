public class Vehicle implements VehicleInterface{

    public void Start(){
        System.out.println("Vehicle Started");
    }
    public void Stop(){
        System.out.println("Vehicle Stop");
    }
    @Override
    public void starts(){
        System.out.println("Bike Starting.....");
    }

    @Override
    public void stops() {
        System.out.println("Bike Stopping....");
    }

    public static void main(String[] args){
        Car myObject = new Car("Kia", "K5");
        myObject.Start();
        myObject.navigation("Texas");
        System.out.println(myObject.make);
        System.out.println(myObject.model);
        myObject.Stop();
        Cycle cycle1 = new Cycle();
        cycle1.Start();
        cycle1.Stop();
        Car camry = new Car();
        System.out.println(camry.make);
        System.out.println(camry.model);

    }
}
