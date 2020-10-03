package Praktek1;
import java.util.Scanner;
public class LuasPersegiPanjang {
    public static void main(String[] args){
        System.out.println("MENGHITUNG LUAS PERSEGI PANJANG");
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukan panjang :");
        int panjang = inputUser.nextInt();
        System.out.println("Masukan Lebar :");
        int lebar = inputUser.nextInt();
        
        int hasil = panjang*lebar;
        System.out.println("Luas persegi panjang adalah " + hasil + " cm" );
    }
}
