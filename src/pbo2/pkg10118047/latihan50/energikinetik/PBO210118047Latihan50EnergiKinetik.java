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
public class PBO210118047Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        energiKinetik kinetik=new energiKinetik();
        kinetik.setM(0.025);
        kinetik.setV1(0);
        kinetik.setV2(25);
        System.out.println("=====Program Menghitung energi Kinetik=====");
        System.out.println("Massa : " + kinetik.getM());
        System.out.println("Kecepatan : " + kinetik.getV2());
        System.out.println("Energi Kinetik : " + kinetik.menghitungEnergiKinetik());
        System.out.println("Usaha : " + kinetik.menghitungUsaha());
    }
    
}
