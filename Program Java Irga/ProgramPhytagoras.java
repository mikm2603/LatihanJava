package Praktek1;
import java.util.*;
public class ProgramPhytagoras {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("== PROGRAM PHYTAGORAS SEGITIGA SIKU-SIKU ==");
        System.out.println("Rumus = a = akar pangkat b kuadrat + c kuadrat");
        System.out.println("a = sisi miring, b sisi pendek (Alas), c = sisi panjang (tinggi)");
        System.out.println("Silahkan masukan angka sebagai simbolis (Contoh : 1) :");
        System.out.println("1.Menghitung luas a");
        System.out.println("2.Menghitung luas b");
        System.out.println("3.Menghitung luas c");
        int masuk = inputUser.nextInt();
        int a,b,c,hasila,hasilb,hasilc;
        float pangkat,hasil;
        if (masuk == 1){
            System.out.println("Masukan nilai b (alas)");
            b = inputUser.nextInt();
            System.out.println("Masukan nilai c (tinggi)");
            c = inputUser.nextInt();
            pangkat = (b*b) + (c*c);
            hasil = (float) Math.sqrt(pangkat); 
            System.out.println("nilai alasnya adalah " + b + " tingginya adalah " +"c");
            System.out.println("Maka hasilnya adalah " + hasil);
            
        }else if (masuk == 2){
            System.out.println("Masukan nilai a");
            a = inputUser.nextInt();
            System.out.println("Masukan nilai c");
            c = inputUser.nextInt();
            pangkat = (a*a) - (c*c);
            hasil = (float) Math.sqrt(pangkat);
            
        }else if (masuk == 3){
             System.out.println("Masukan nilai a");
            a = inputUser.nextInt();
            System.out.println("Masukan nilai c");
            b = inputUser.nextInt();
            pangkat = (a*a) - (b*b);
            hasil = (float) Math.sqrt(pangkat);
        }else {
            System.out.println("Angka yang anda masukan salah!");
        }
    }
}
