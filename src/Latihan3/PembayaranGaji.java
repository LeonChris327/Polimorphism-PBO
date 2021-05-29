package Latihan3;
public class PembayaranGaji {
    
    
    
    
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji();
        if(peg instanceof Direktur){
            uang += ((Direktur)peg).tunjangan();
        }
        if(peg instanceof Staf){
            uang+=((Staf)peg).Bonus();
        }
        return uang;
            
    }
    public static void main(String[] args) {
        // TODO code application logic here
        PembayaranGaji pg = new PembayaranGaji();
        Staf ali = new Staf();
        Direktur tony = new Direktur();
        
        System.out.println("Gaji yang dibayarkan untuk staf : " + pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan kepada Direktur : " + pg.hitungGaji(tony));
       
    }
    
}
