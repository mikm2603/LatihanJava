package Praktek1;
import java.util.Scanner;
public class ProgramKasirSederhana {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        int uang,total,kembalian,kurang;
        System.out.print("Masukan total barang = ");
        int totalBarang = inputUser.nextInt();
        int[] nomorBarang = new int[totalBarang];
        int angkaAwal = 0;
            while(angkaAwal < totalBarang ){
                System.out.print("Masukan harga barang = ");
                nomorBarang[angkaAwal] = inputUser.nextInt();
                angkaAwal++;
            }
        int sum = 0;
        for(int num : nomorBarang){
            sum = sum+num;
        }
        total = sum;
        System.out.println("Total harganya adalah Rp." + total );
        System.out.println("Masukan uang yang berikan : ");
        uang = inputUser.nextInt();
        
        kembalian = uang-total;
        kurang = total-uang;
        System.out.println("Uang yang anda berikan adalah Rp." + uang);
        if(uang>total){
            System.out.println("Jadi kembaliannya dalah Rp." + kembalian);
        }else if(uang==total){
            System.out.println("Uang anda pas");
        }else if(uang < total){
            System.out.println("Uang anda kurang Rp." + kurang + " untuk membayarnya!");
        }else {
            System.out.println("Anda belum memasukan uang, anda miskin bitch!");
        }
        System.out.println("Terima Kasih...");
    }
}
