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
public class TeamKogoro extends Conan{

    public TeamKogoro() {
        tampilNama();
        Pakaian();
        Team();
     }

     
    @Override
    public void Pakaian() {
        System.out.println("\nPakaian anggota team : ");
        System.out.println("1. Kogoro mouri : Berjas biru dengan dasi coklat");
        System.out.println("2 Eri Kisaki : Menggunakan Kacamata dan jas putih ke biru-biruan");
        System.out.println("3. Ran Mouri : Menggunakan jas Biru berdasi hijau dan rambut panjang");
        System.out.println("4. Sonoko Suzuki : Menggunakan jas biru berdasi hijau dan menggunakan bando putih");
        
    }   
             

    @Override
    public void Team() {
        System.out.println("\nKarateristik Anggota Team : ");
        System.out.println("\n1. Kogoro Mouri");
        System.out.println("\t1. Ceroboh");
        System.out.println("\t2. So tau");
        System.out.println("\t3. Konyol");
        System.out.println("\n2. Eri Kisaki");
        System.out.println("\t1. Cerdik");
        System.out.println("\t2. Berpikir Kritis");
        System.out.println("\n3. Ran Mouri");
        System.out.println("\t1. Plin-plan");
        System.out.println("\t2. Jago Beladiri");
        System.out.println("\t3. Bergantung pada oranglain");
        System.out.println("\n4. Sonoko Suzuki");
        System.out.println("\t1. Centil");
        System.out.println("\t2. Sering ngegosip");
        
    }

    @Override
    public void tampilNama() {
        System.out.println("Ketua Team : Kogoro Mouri");
        System.out.println("Anggota : " );
        System.out.println("1. Eri Kisaki");
        System.out.println("2. Ran Mouri ");
        System.out.println("3. Sonoko Suzuki");
    }
    
    
}
