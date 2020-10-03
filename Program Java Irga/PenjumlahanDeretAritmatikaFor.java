package Praktek2;
import java.util.*;
public class PenjumlahanDeretAritmatikaFor {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        int nilaiAwal,nilaiAkhir;
        System.out.print("Masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukan nilai akhir = ");
        nilaiAkhir= inputUser.nextInt();
        
        for (int total = 0;nilaiAwal<=nilaiAkhir;nilaiAwal++){
            total = total + nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + " menjadi " + total);
        }
            
    }
}
