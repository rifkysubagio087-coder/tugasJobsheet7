/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semester2.tugas.jobsheet7;

/**
 *
 * @author HYPE AMD
 */
public class Main {

    public static void main(String[] args) {

        // Objek MAC
        Mac objMac = new Mac(
            "Apple MacBook Pro",   // merk
            3,                     // kecProsesor (GHz)
            16,                    // sizeMemory (GB)
            "Apple M3",            // jnsProsesor
            "Lithium-Polymer",     // jnsBatrei
            "Face ID & Touch ID"   // security
        );

        System.out.println("Data MAC");
        objMac.tampilMac();

        System.out.println();

        // Objek WINDOWS
        Windows objWindows = new Windows(
            "ASUS VivoBook 15",       // merk
            2,                        // kecProsesor (GHz)
            8,                        // sizeMemory (GB)
            "Intel Core i5",          // jnsProsesor
            "Lithium-Ion",            // jnsBatrei
            "Windows 11 + BitLocker"  // fitur
        );

        System.out.println("Data Windows");
        objWindows.tampilWindows();

        System.out.println();

        // Objek PC
        Pc objPc = new Pc(
            "Dell OptiPlex 7090",  // merk
            3,                     // kecProsesor (GHz)
            32,                    // sizeMemory (GB)
            "Intel Core i7",       // jnsProsesor
            27                     // ukuranMonitor (inch)
        );

        System.out.println("Data pc");
        objPc.tampilPc();
    }
}
