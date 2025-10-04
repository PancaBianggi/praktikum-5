package Abstraction.abstractclass;

// ABSTRACT CLASS
abstract class Hewan {
    String nama;
    
    // Constructor dalam abstract class
    public Hewan(String nama) {
        this.nama = nama;
    }
    
    // ABSTRACT METHOD - tidak ada implementasi
    abstract void suara();
    
    // CONCRETE METHOD - ada implementasi
    void makan() {
        System.out.println(nama + " sedang makan");
    }
}

// SUBCLASS harus implement abstract method
class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    void suara() {
        System.out.println(nama + " mengeong: Meong!");
    }
}

class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    void suara() {
        System.out.println(nama + " menggonggong: Guk guk!");
    }
}

// DEMO
public class AbstractClassDemo {
    public static void main(String[] args) {
        // Hewan hewan = new Hewan(); // ERROR: cannot instantiate abstract class
        
        Kucing kucing = new Kucing("Tom");
        Anjing anjing = new Anjing("Spike");
        
        kucing.suara();  // Tom mengeong: Meong!
        kucing.makan();  // Tom sedang makan
        
        anjing.suara();  // Spike menggonggong: Guk guk!
        anjing.makan();  // Spike sedang makan
    }
}