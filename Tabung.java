/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan61_bangunruang;

/**
 *
 * @author syhar
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Tabung extends BangunRuang {
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
    
        System.out.println("###Perhitungan Volume Tabung###");
        System.out.print("Masukan jari Jari Tabung : ");
        jariJari = scan.nextDouble();  
         System.out.print("Masukan Tinggi Tabung : ");
         tinggi = scan.nextDouble();
         System.out.println("");
        System.out.println("Sebuah Tabung memiliki jari-jari berukuran"
                + "\n"+jariJari+" cm. Jika Tinggya "+tinggi+" cm");
        double volume = getPhi()*jariJari*jariJari*tinggi;
        System.out.println("Hasil : V = "+df.format(volume)+" cm3");
    }
    
    
    
    
}
