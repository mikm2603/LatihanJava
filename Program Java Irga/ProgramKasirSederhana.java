package Praktek1;
import java.util.Scanner;
public class ProgramKasirSederhana {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukan harga barang ");
        System.out.println("Harga barang ke-1 : ");
        int barang1 = inputUser.nextInt();
        System.out.println("Harga barang ke-2 : ");
        int barang2 = inputUser.nextInt();
        System.out.println("Harga barang ke-3 : ");
        int barang3 = inputUser.nextInt();
        System.out.println("Masukan uang yang berikan : ");
        int uang = inputUser.nextInt();
        
        int total = barang1+barang2+barang3;
        int kembalian = uang-total;
        
        System.out.println("Total harganya adalah Rp." + total );
        System.out.println("Uang yang anda berikan adalah Rp." + uang);
        System.out.println("Jadi kembaliannya dalah Rp." + kembalian);
    }
}
