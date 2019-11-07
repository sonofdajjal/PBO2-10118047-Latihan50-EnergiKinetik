/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118047.latihan50.energikinetik;

/**
 *
 * @author 
 * Nama : Abdullah Margani
 * Nim : 10118047
 * Kelas: IF-2
 */
public class energiKinetik {
    public double m,v1,v2;

    public energiKinetik() {
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    

    public double menghitungEnergiKinetik(){
        return 0.5*m*(v2*v2);
    }
    public double menghitungUsaha(){
        return 0.5*m*((v2*v2)-(v1*v1));
    }
    
    
    
    
}
