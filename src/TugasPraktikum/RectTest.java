package TugasPraktikum;
public class RectTest {

    
    
    public static void main(String[] args) {

        Rect kotak1 = new Rect(2,3, 5,6);
        Rect kotak2 = new Rect(1,1, 4, 4);
        

        Rect intersection = kotak2.intersection(kotak1);
        Rect union = kotak2.union(kotak1);
        String koordinatKotak1 = String.format("[%d, %d ; %d,%d]", kotak1.x1, kotak1.y1, kotak1.x2, kotak1.y2);
        String koordinatKotak2 = String.format("[%d, %d ; %d,%d]", kotak2.x1, kotak2.y1, kotak2.x2, kotak2.y2);
        String koordinatUnion = String.format("[%d, %d ; %d,%d]", union.x1, union.y1, union.x2, union.y2);
        String koordinatIntersect = String.format("[%d, %d ; %d,%d]", intersection.x1, intersection.y1, intersection.x2, intersection.y2);
        
        System.out.println("<" + kotak1.x2 +","+ kotak1.y2 + ">" + " is inside the union");
        System.out.println(koordinatKotak2 + " union " + koordinatKotak1 + " = " + koordinatUnion );
        System.out.println(koordinatKotak2 + " union " + koordinatKotak1 + " = " + koordinatIntersect );
        
    }
    
}
