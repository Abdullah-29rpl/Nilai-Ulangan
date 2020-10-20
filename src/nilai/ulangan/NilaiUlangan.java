/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai.ulangan;

import java.util.Scanner;

/**
 *
 * @author apple
 */
public class NilaiUlangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double skorpilihanganda , skoruraian, skorisian;
        double pilihanganda , uraian, isian;
         Scanner input = new Scanner (System.in);
         
         System.out.println("    Masukkan Data    ");
         System.out.println("–––––––––––––––––––––");
         System.out.print ("Jumlah Soal Pilihan Ganda: ");
         pilihanganda = input.nextInt();
         System.out.print ("Jumlah Soal Isian: ");
         isian = input.nextInt();
         System.out.print ("Jumlah Soal Uraian: ");
         uraian = input.nextInt();
         
         System.out.println ("");
         
         System.out.print (" Skor Pilihan Ganda: ");
         skorpilihanganda = input.nextInt();
         System.out.print (" Skor Isian: ");
         skorisian = input.nextInt();
         System.out.print (" Skor Uraian: ");
         skoruraian = input.nextInt();
         
         System.out.println ("");
         
         System.out.print (" Pilihan Ganda yang benar : ");
         double benarpilihanganda = input.nextInt();
         System.out.print (" Isian yang benar: ");
         double benarisian = input.nextInt();
         System.out.print (" Uraian yang benar: ");
         double benaruraian = input.nextInt();
         
         double skorbenarpilihanganda = benarpilihanganda*skorpilihanganda;
         double skorbenarisian = benarisian*skorisian;
         double skorbenaruraian = benaruraian*skoruraian;
         
         System.out.println ("");
         
         double nilaimaksimalpilihanganda=skorpilihanganda*pilihanganda;
         double nilaimaksimalisian=skorisian*isian;
         double nilaimaksimaluraian=skoruraian*uraian;
         
         double nilaiakhirpilihanganda = skorbenarpilihanganda / nilaimaksimalpilihanganda*60;
         double nilaiakhirisian = skorbenarisian / nilaimaksimalisian*20 ;
         double nilaiakhiruraian = skorbenaruraian / nilaimaksimaluraian*20 ;
         
         System.out.println("    Nilai Ulangan    ");
         System.out.println("–––––––––––––––––––––");
         System.out.println("Nilai Pilihan ganda :" + nilaiakhirpilihanganda);
         System.out.println("Nilai Isian         :" + nilaiakhirisian);
         System.out.println("Nilai uraian        :" + nilaiakhiruraian);
         System.out.println("Nilai Ulangan       :" + (nilaiakhirpilihanganda+nilaiakhirisian+nilaiakhiruraian));
    }
    
}
