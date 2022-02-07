/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelulusan;



/**
 *
 * @author USER
 */
public class Kelulusan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Siswa lulus = new Siswa();
        
        System.out.println("Kelulusan Siswa");
        System.out.println(" ");
        
        System.out.println("Biodata");
        lulus.Biodata();
        
        System.out.println("=================================");
        
        lulus.Seleksi();
    }

}
