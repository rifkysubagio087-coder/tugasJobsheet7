/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semester2.tugas.jobsheet7;

/**
 *
 * @author HYPE AMD
 */
// =============================================
// CLASS DIAGRAM: Inheritance (Pewarisan)
// Komputer -> Laptop -> Mac
//                    -> Windows (via Laptop)
// Komputer -> Pc
// =============================================

// ---- Superclass: Komputer ----
class Komputer {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;

    public Komputer() {}

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk        = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory  = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilData() {
        System.out.println("  Merk        : " + merk);
        System.out.println("  Kec Prosesor: " + kecProsesor + " GHz");
        System.out.println("  Size Memory : " + sizeMemory + " GB");
        System.out.println("  Jns Prosesor: " + jnsProsesor);
    }
}

// ---- Subclass: Laptop (extends Komputer) ----
class Laptop extends Komputer {
    public String jnsBatrei;

    public Laptop() {}

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilLaptop() {
        tampilData();
        System.out.println("  Jns Batrei  : " + jnsBatrei);
    }
}

// ---- Subclass: Mac (extends Laptop) ----
class Mac extends Laptop {
    public String security;

    public Mac() {}

    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security = security;
    }

    public void tampilMac() {
        tampilLaptop();
        System.out.println("  Security    : " + security);
    }
}

// ---- Subclass: Windows (extends Laptop) ----
class Windows extends Laptop {
    public String fitur;

    public Windows() {}

    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        tampilLaptop();
        System.out.println("  Fitur       : " + fitur);
    }
}

// ---- Subclass: Pc (extends Komputer) ----
class Pc extends Komputer {
    public int ukuranMonitor;

    public Pc() {}

    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPc() {
        tampilData();
        System.out.println("  Ukuran Monitor: " + ukuranMonitor + " inch");
    }
}

public class Komputer {
    public static void main(String[] args) {

        // --- Objek Mac ---
        Mac objMac = new Mac(
            "Apple MacBook Pro",  // merk
            3,                    // kecProsesor (GHz)
            16,                   // sizeMemory (GB)
            "Apple M3",           // jnsProsesor
            "Lithium-Polymer",    // jnsBatrei
            "Face ID & Touch ID"  // security
        );

        System.out.println("Data MAC");
        objMac.tampilMac();

        System.out.println();

        // --- Objek Windows ---
        Windows objWindows = new Windows(
            "ASUS VivoBook 15",   // merk
            2,                    // kecProsesor (GHz)
            8,                    // sizeMemory (GB)
            "Intel Core i5",      // jnsProsesor
            "Lithium-Ion",        // jnsBatrei
            "Windows 11 + BitLocker" // fitur
        );

        System.out.println("Data Windows");
        objWindows.tampilWindows();

        System.out.println();

        // --- Objek Pc ---
        Pc objPc = new Pc(
            "Dell OptiPlex 7090", // merk
            3,                    // kecProsesor (GHz)
            32,                   // sizeMemory (GB)
            "Intel Core i7",      // jnsProsesor
            27                    // ukuranMonitor (inch)
        );

        System.out.println("Data PC");
        objPc.tampilPc();
    }
}