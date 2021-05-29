package Latihan4;
public class Shape {

    
    
    
    private String color;
    public Shape(String color){
        this.color = color;
    }
    
    @Override
    public String toString(){
        return "Shape[color = " + color + "]" ;
    }
    
    //All shapes must have a method called getArea()
    public double getArea(){
        //we need to return some value to compile the program.
        System.err.println("Shape unknown ! Cannot compute area !");
        return 0 ;
    }
    
}
