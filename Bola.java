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
 * @author syhar
 */
public class Bola extends BangunRuang{
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
    
        System.out.println("###Perhitungan Volume Bola###");
        System.out.print("Masukan jari Jari Bola : ");
        jariJari = scan.nextDouble(); 
        System.out.println("");
        System.out.println("Jari Jari dari Sebuah Bola Basket adalah "+jariJari+" cm");
        double volume = 4/3*getPhi()*jariJari*jariJari*jariJari;
        System.out.println("Hasil : V = "+df.format(volume)+" cm3");
    }
    
    
}
