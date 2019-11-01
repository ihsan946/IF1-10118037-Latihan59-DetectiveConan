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
public class TeamDefektifCilik extends Conan{

    public TeamDefektifCilik() {
        tampilNama();
        Pakaian();
        Team();
               
    }
    
    
    @Override
    public void Pakaian() {
        System.out.println("\nPakaian Anggota Team");
        System.out.println("1. Ai Haibara : Menggunakan baju Hijau");
        System.out.println("2. Ayumi Yoshida : Menggunakan Baju Pink");
        System.out.println("3. Mitshuhiko Tsurubaya : Menggunakan baju cream berkerah biru");
        System.out.println("4. Genta Kojima : Menggunakan Baju Merah putih Berbadan Besar");
        System.out.println("5. Professor Agasa : Menggunakan kacamata Bulat dengan Jas Putih");
    }

    @Override
    public void Team() {
        System.out.println("\nKarateristik Anggota Team : ");
        System.out.println("\n1. Edogawa Conan");
        super.Team();
        System.out.println("\n2. Ai Haibara ");
        System.out.println("\t1. Cerdik");
        System.out.println("\t2. Berpikir Kritis");
        System.out.println("\t3. Pendiam");
        System.out.println("\t4. Selalu Menyendiri");
        System.out.println("\n3. Ayumi Yoshida");
        System.out.println("\t1. Selalu Riang");
        System.out.println("\t2. Cengeng ");
        System.out.println("\t3. Penakut");
        System.out.println("\n4. Mitsuhiko Tsuburaya");
        System.out.println("\t1. Pintar");
        System.out.println("\t2. Pengetahuan Luas");
        System.out.println("\t3. Usil");
        System.out.println("\n5. Genta Kojima");
        System.out.println("\t1. Usil");
        System.out.println("\t2. Konyol");
        System.out.println("\t3. Terkuat di teamnya");
        System.out.println("\n6. Professor Agasa");
        System.out.println("\t1. Inovatif");
        System.out.println("\t2. Selalu Ceroboh");
        System.out.println("\t3. Friendly");
    }

    @Override
    public void tampilNama() {
        System.out.println("\nKetua Team : Professor Agasa");
        System.out.println("Anggota : " );
        System.out.println("1. Conan Edogawa");
        System.out.println("2. Ai Haibara ");
        System.out.println("3. Ayumi Yoshida");
        System.out.println("4. Mitsuhiko Tsuburaya");
        System.out.println("5. Genta Kojima");
        
        
    }
    
}
