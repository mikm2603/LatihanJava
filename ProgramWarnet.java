package programwarnet;
import java.util.*;
public class ProgramWarnet {
    public static void main(String[] args) {
        
        int angkaAwal,
            angkaAwal2,
            jumlahPc,
            pcBenar,
            adaPcRusak,
            jumlahPcRusak,
            adaYangDiperbaiki,
            pcDiperbaiki,
            waktuPerbaikan;
        int[] nomorPcBenar;
        
        System.out.println("Selamat Datang Di Program Pendataan Pc Warnet!");
        Scanner inputUser = new Scanner(System.in);
        
        System.out.println("Masukan jumlah pc :");
        jumlahPc = inputUser.nextInt();
        
        System.out.println("Apakah ada yang rusak? (Masukan angka)");
        System.out.println("1.Iya");
        System.out.println("2.Tidak");
        adaPcRusak = inputUser.nextInt();
        
        if (adaPcRusak == 1){
            System.out.println("Masukan jumlah pc yang rusak :");
            jumlahPcRusak = inputUser.nextInt();
            
            angkaAwal = 0;
            while(angkaAwal < jumlahPcRusak ){
                int[] nomorPcRusak = new int[jumlahPc];
                System.out.println("Masukan nomor yang sedang rusak ");
                nomorPcRusak[angkaAwal] = inputUser.nextInt();
                angkaAwal++;
            }
            
            System.out.println("Apakah ada yang diperbaiki? (Masukan angka)");
            System.out.println("1.Iya");
            System.out.println("2.Tidak");
            adaYangDiperbaiki = inputUser.nextInt();
            
            if (adaYangDiperbaiki == 1){
                System.out.println("Masukan jumlah pc yang sedang dalam perbaikan :");
                pcDiperbaiki = inputUser.nextInt();
                
                angkaAwal2 = pcDiperbaiki-1;
                while(angkaAwal2 < jumlahPcRusak ){
                        int[] nomorPcDiperbaiki = new int[jumlahPc];
                        angkaAwal2++;

                        System.out.println("Masukan nomor pc yang sedang dalam perbaikan");
                        nomorPcDiperbaiki[angkaAwal2] = inputUser.nextInt();
                    }
                System.out.println("Masukan jumlah waktu perbaikan pc (dalam hari) :");
                waktuPerbaikan = inputUser.nextInt();
                
                pcBenar = jumlahPc-jumlahPcRusak;
                System.out.println("Jumlah ada " + jumlahPc);
                System.out.println("Jumlah pc benar ada " + pcBenar);
                System.out.println("Jumlah pc yang rusak ada " + jumlahPcRusak);     
                /* System.out.println("Pc yang rusak adalah nomor :");
                for (int i=0;i<jumlahPcRusak;i++){
                   System.out.println("Nomor -" + nomorPcRusak[i]);
                }*/  
                System.out.println("Jumlah pc dalam perbaikan ada " + pcDiperbaiki + "buah dan diperbaiki dalam " + waktuPerbaikan + " hari");
                /* System.out.println("Nomor pc yang sedang di perbaiki adalah : ");
                for (int i=0;i<jumlahPcRusak;i++){
                   System.out.println("Nomor -" + nomorPcDiperbaiki[i]);
               }*/
            } else {
                
            }
            
            
            
            
        } else if (adaPcRusak == 2){
            pcBenar = 1;
            while (pcBenar <= jumlahPc){
                System.out.println("Pc " + pcBenar + " sedang beroperasi dengan baik");
                pcBenar++;
            }
        }
        
        
        
        
       
        
        
        
    }
    
}
