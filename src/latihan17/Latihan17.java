/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan17;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan ?\t: Rp. ");
        Scanner scanner = new Scanner(System.in);
        float gaji = scanner.nextFloat();
        System.out.print("Status Anda ? (Menikah/Belum)\t: ");
        String status = scanner.next();
        status = status.toLowerCase();
        float gaji_total, tunjangan = (status.equals("menikah"))?gaji*35/100:0;
        gaji_total = gaji+tunjangan;
        System.out.println("\n======Hasil Perhitungan Gaji Anda======");
        System.out.println("Gaji Pokok\t\t: Rp "+gaji);
        System.out.println("Tunjangan\t\t: Rp "+tunjangan);
        System.out.println("Total Gaji\t\t: Rp "+gaji_total);
        System.out.println("(Developed by : Lutfi Ramadhan)");
    }
    
}
