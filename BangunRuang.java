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
public abstract class BangunRuang {
    
    public double jariJari;
    public double tinggi;
    public double phi = 3.14 ;
    

    public double getJariJari() {
        return jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getPhi() {
        return phi;
    }
    
    
           
    public abstract void hitungVolume(double jariJari, double tinggi, double phi);
    
    
}
