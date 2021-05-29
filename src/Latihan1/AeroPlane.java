package Latihan1;
public class AeroPlane extends Vehicle {

    @Override
    public void walk(){
        System.out.println("Aeroplane is Flying");
    }
  
    @Override
    public void fuel(){
        System.out.println("Avtur");
    }
    
    public static void main(String[] args) {
        
        AeroPlane garuda = new AeroPlane();
        garuda.function();
        garuda.fuel();
    }
    
}
