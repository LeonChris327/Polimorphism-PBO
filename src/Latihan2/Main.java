package Latihan2;
public class Main {

    
    
    
    
    public static void main(String[] args) {
        
        
        Line dora = new Line(1, -3, 5, 5);
        Line masha = new Line(6, 6, -1, 3);
        
        System.out.println("Panjang garis dora : " + dora.getLength());
        System.out.println("Panjang garis masha : " + masha.getLength());
        
        if(masha.isGreater(masha, dora)){
            System.out.println("garis masha lebih panjang dari dora");
        }else if(masha.isLess(masha, dora)){
            System.out.println("garis masha lebih pendek dari dora");
        }else if(masha.isEquals(masha, dora)){
            System.out.println("garis masha sama panjang dengan dora");
        }
    }
    
}
