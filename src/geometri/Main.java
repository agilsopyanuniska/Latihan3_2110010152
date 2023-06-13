
package geometri;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(10);
        PersegiPanjang pp1 = new PersegiPanjang(10,20);
        
        System.out.println("Luas Lingkaran 1 : " + lingkaran1.luas());
        System.out.println("Keliling Lingkaran 1 : " + lingkaran1.keliling());
        
        System.out.println("Luas Persegi Panjang 1 : " + pp1.luas());
        System.out.println("Keliling Persegi Panjang 1 : " + pp1.keliling());
    }
}
