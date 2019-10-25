/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan61_bangunruang;

/**
 *
 * @author 
 * NIM : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class PBOUlang_10116584_Latihan61_BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======Perhitungan Volume Bangun Ruang======");
        System.out.println("___________________________________________");
        System.out.println("");
        Bola bola = new Bola();
        Tabung tabung = new Tabung();
        Kerucut kerucut = new Kerucut();
        bola.hitungVolume(bola.getJariJari(), bola.getTinggi(),bola.getPhi());
        System.out.println("");
        tabung.hitungVolume(tabung.getJariJari(), tabung.getTinggi(),tabung.getPhi());
        System.out.println("");
        kerucut.hitungVolume(kerucut.getJariJari(), kerucut.getTinggi(),kerucut.getPhi());
        
    }
    
}
