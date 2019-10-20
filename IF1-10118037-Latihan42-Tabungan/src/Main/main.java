/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.util.Scanner;

/**
 *
 * @author Muhammad Ihsan
 * NAMA       : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM          : 10118037
 * Deskripsi Program   : Program ini berisi program penarikan uang
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldo ;
        Scanner input = new Scanner(System.in);
       
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Anda : " );
        saldo = input.nextInt();
        Tabungan tabungan = new Tabungan(saldo);
        
       
    }
    
}
