/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan28.gantikata;

/**
 *
 * @author 
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi program ganti kata
 */
import java.util.Scanner;

public class PBOULANG10114504Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String awal;
        String baru;
        String ganti;
        String jadi;
        Scanner scan = new Scanner (System.in);
        
        //input
        System.out.println("====Program Ganti Kata====");
        System.out.print("Masukan Kalimat : ");
        awal = scan.nextLine();
        System.out.print("Ganti Kata   : ");
        ganti = scan.next();
        System.out.print("Menjadi Kata : ");
        jadi = scan.next();
        
        //proses
        baru = (awal).replaceAll(ganti, jadi);
        //output
        System.out.println("");
        System.out.println("====Hasil Formating====");
        System.out.println("Kata awal : "+awal);
        System.out.println("Kata baru : "+baru);
    }
    
}
