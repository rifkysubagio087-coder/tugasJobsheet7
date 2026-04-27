/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semester2.tugas.jobsheet7;

/**
 *
 * @author HYPE AMD
 */
public class Windows extends Laptop {
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
