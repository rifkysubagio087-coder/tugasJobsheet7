/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semester2.tugas.jobsheet7;

/**
 *
 * @author HYPE AMD
 */
public class Laptop extends Komputer {
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