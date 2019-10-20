package Main;
import java.util.Scanner;


public class Tabungan {

	private int saldo;


	/**
	 * 
	 * @param saldo
	 */
	public Tabungan(int saldo) {
                            int jumlah;
                            Scanner input = new Scanner(System.in);
                            this.saldo = saldo;
                            System.out.print("Jumlah uang yang diambil : ");
                            jumlah = input.nextInt();
                            System.out.println("Saldo Anda Sekarang : " + ambilUang(jumlah));
                           
	}

	/**
	 * 
	 * @param jumlah
	 */
	public int ambilUang(int jumlah) {
		
		return saldo - jumlah;
	}

}