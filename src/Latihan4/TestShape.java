package Latihan4;
public class TestShape {


    public static void main(String[] args) {
        // TODO code application logic here
        Shape s1 = new Rectangle("red", 4, 5); //membuat objek rectangle 
        System.out.println(s1); // (compiler writes here s1.toString()) memanggil method toString 
        System.out.println("Area is " + s1.getArea()); // menampilkan method getArea 
        
        Shape s2 = new Triangle("blue", 4, 5);//membuat objek triangle
        System.out.println(s2);// (compiler writes here s2.toString()) memanggil method toString 
        System.out.println("Area is " + s2.getArea());// memanggil dan menampilkan method getArea 
    }
    
}
