package Praktek1;
import java.util.Scanner;
public class ProgramKasirSederhana {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        int uang,total,kembalian;
        System.out.print("Masukan total barang = ");
        int totalBarang = inputUser.nextInt();
        int[] nomorBarang = new int[totalBarang];
        int angkaAwal = 0;
            while(angkaAwal < totalBarang ){
                System.out.print("Masukan harga barang = ");
                nomorBarang[angkaAwal] = inputUser.nextInt();
                angkaAwal++;
            }
            
        System.out.println("Masukan uang yang berikan : ");
        uang = inputUser.nextInt();
        int sum = 0;
        for(int num : nomorBarang){
            sum = sum+num;
        }
        total = sum;
        kembalian = uang-total;
        System.out.println("Total harganya adalah Rp." + total );
        System.out.println("Uang yang anda berikan adalah Rp." + uang);
        System.out.println("Jadi kembaliannya dalah Rp." + kembalian);
    }
}
