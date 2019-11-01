/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Muhammad Ihsan
 */
public class SahabatShinichi extends Conan{

    public SahabatShinichi() {
        tampilNama();
        Pakaian();
        Team();
    }

    @Override
    public void Pakaian() {
        System.out.println("\nPakaian anggota team : ");
        System.out.println("1. Heiji Hattori : Berjaket jeans dengan dalaman kaos hitam");
        System.out.println("2. Kazuha Toyama : Menggunakan baju oranye dengan rambut diikat tali putih");
    }

    @Override
    public void Team() {
        System.out.println("\nKarateristik Anggota Team : ");
        System.out.println("\n1. Heiji Hattori ");
        System.out.println("\t1. Cerdas");
        System.out.println("\t2. Berpikir Kritis");
        System.out.println("\t3. Ramah");
        System.out.println("\t4. Kuat");
        System.out.println("\n2. Kazuha Toyama ");
        System.out.println("\t1. Setia");
        System.out.println("\t2. Kuat");
        System.out.println("\t3. Pintar");
        
        
    }

    @Override
    public void tampilNama() {
        System.out.println("1. Heiji Hattori");
        System.out.println("2. Kazuha Toyama");
    }
    
    
}
