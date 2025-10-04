// CLASS DIAGRAM: Kalkulator dengan Method Overloading
class Kalkulator {
    
    // Overloading 1: parameter int
    public int tambah(int a, int b) {
        System.out.println("Memanggil tambah(int, int)");
        return a + b;
    }
    
    // Overloading 2: parameter double
    public double tambah(double a, double b) {
        System.out.println("Memanggil tambah(double, double)");
        return a + b;
    }
    
    // Overloading 3: jumlah parameter berbeda
    public int tambah(int a, int b, int c) {
        System.out.println("Memanggil tambah(int, int, int)");
        return a + b + c;
    }
    
    // Overloading 4: tipe parameter berbeda
    public String tambah(String teks1, String teks2) {
        System.out.println("Memanggil tambah(String, String)");
        return teks1 + teks2;
    }
}

// Demo Method Overloading
public class DemoOverloading {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        // COMPILE-TIME POLYMORPHISM
        // Compiler memutuskan method mana yang dipilih berdasarkan parameter
        System.out.println("=== METHOD OVERLOADING ===");
        
        int hasil1 = kalkulator.tambah(5, 3);
        System.out.println("Hasil: " + hasil1);
        
        double hasil2 = kalkulator.tambah(5.5, 3.2);
        System.out.println("Hasil: " + hasil2);
        
        int hasil3 = kalkulator.tambah(5, 3, 2);
        System.out.println("Hasil: " + hasil3);
        
        String hasil4 = kalkulator.tambah("Hello", " World");
        System.out.println("Hasil: " + hasil4);
    }
}