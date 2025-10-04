package overriding;
class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meong meong");
    }
}

class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk guk");
    }
    
    void lari() {
        System.out.println("Anjing lari");
    }
}

public class DemoOverriding {
    public static void main(String[] args) {
        // Polymorphism - parent class reference, child class object
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();
        
        h1.bersuara();  // Meong meong
        h2.bersuara();  // Guk guk
        
        // Akses method khusus child class
        Anjing a = (Anjing) h2;
        a.lari();       // Anjing lari
    }
}
