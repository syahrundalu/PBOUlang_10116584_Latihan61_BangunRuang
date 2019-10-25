/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan61_bangunruang;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author
 * NIM : 10116584
 * NAMA : Muhammad Syahrun Dalu
 */
public class Kerucut extends BangunRuang{
    Scanner scan = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.##");
    
    public double getJariJari() {
        return jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getPhi() {
        return 3.14;
    }
    
    @Override
    public void hitungVolume(double jariJari, double tinggi, double phi) {
    
        System.out.println("###Perhitungan Volume Kerucut###");
        System.out.print("Masukan jari Jari Kerucut : ");
        jariJari = scan.nextDouble(); 
        System.out.print("Masukan Tinggi Kerucut : ");
        tinggi = scan.nextDouble();
        System.out.println("");
        System.out.println("Diketahui tinggi sebuah kerucut "+tinggi+" cm. Jika"
                + "\nJari-Jarinya "+jariJari+" cm");
        double volume = (getPhi()*jariJari*jariJari*tinggi)/3;
        System.out.println("Hasil : V = "+df.format(volume)+" cm3");
    
    
}
}