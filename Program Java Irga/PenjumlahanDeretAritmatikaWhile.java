package Praktek2;
import java.util.*;
public class PenjumlahanDeretAritmatikaWhile {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        int nilaiAwal,nilaiAkhir,total;
        System.out.print("Masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();
        
        total  =0;
        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
        
    }
}
