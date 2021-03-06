package Latihan4;
public class Triangle extends Shape{
     // private member variable
    private int base, height;
    
    //Constructor
    public Triangle(String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    }
    
    @Override
    public String toString(){
        return "Triangle[base + "+ base+ ", height = " + height + ", " + super.toString() +" ]";
    }
    
    @Override
    public double getArea(){
        return 0.5*this.base*this.height;
    }
    
}
