/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Muhammad Ihsan
 *  NAMA       : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM          : 10118037
 * Deskripsi Program   : Program ini berisi program menampilkan  Kekerabatan conan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Serial Detective Conan");
        System.out.println("\nKarakter Utama");
        Conan conan = new Conan();
        conan.tampilNama();
        conan.Pakaian();
        
        //Team Detektif Cilik
        System.out.println("\nTeam Detektif Cilik");
        TeamDefektifCilik tCilik = new TeamDefektifCilik();
        
        //Team Kogoro Mouri
        System.out.println("\nTeam Kogoro Mouri");
        TeamKogoro tKogoro = new TeamKogoro();
        
        //Sahabat Shinichi
        System.out.println("\nSahabat Shinichi");
        SahabatShinichi sShinici = new SahabatShinichi();
    }
    
}
