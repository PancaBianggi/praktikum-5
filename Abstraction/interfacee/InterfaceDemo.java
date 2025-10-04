package Abstraction.interfacee;

// INTERFACE
interface Bentuk {
    // Secara otomatis public abstract
    double hitungLuas();
    double hitungKeliling();
}

// CLASS implement interface
class Persegi implements Bentuk {
    private double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
    
    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

class Lingkaran implements Bentuk {
    private double jariJari;
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
    
    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

// DEMO
public class InterfaceDemo {
    public static void main(String[] args) {
        Bentuk persegi = new Persegi(5);
        Bentuk lingkaran = new Lingkaran(3);
        
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
        
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
    }
}