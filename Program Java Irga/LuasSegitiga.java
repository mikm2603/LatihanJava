package Praktek1;
import java.util.Scanner;
public class LuasSegitiga {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Menghitung luas segitiga ");
        System.out.println("Masukan alas :");
        int alas = userInput.nextInt();
        System.out.println("Masukan tinggi :");
        int tinggi = userInput.nextInt();
        
        double hasil = 0.5*alas*tinggi;
        System.out.println("Luas segitiga ini adalah " + hasil + " cm");
        
        
    }
}
