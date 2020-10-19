package Praktek3;
import Latihan2.Array;

import java.util.*;
public class ProgramPembuatanKelompok {
    public static void main(String[] args) {
        //Input
        int jumlahSiswaKelas;
        int jumlahAnggotaPerKelompok;
        int totalKelompok = 0;
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukan jumlah siswa dikelas :");
        jumlahSiswaKelas = inputUser.nextInt();
        System.out.println("Masukan jumlah siswa per kelompok :");
        jumlahAnggotaPerKelompok = inputUser.nextInt();

        //Variable
        String[] sisaAnak = new String[jumlahSiswaKelas%jumlahAnggotaPerKelompok];

        if (jumlahSiswaKelas%jumlahAnggotaPerKelompok == 0){
            totalKelompok = jumlahSiswaKelas/jumlahAnggotaPerKelompok;
            System.out.println("Totalnya ada " + totalKelompok + " kelompok");

            String[] namaKelompok = new String[totalKelompok];
            String[][] namaAnggotaKelompok = new String[totalKelompok][jumlahAnggotaPerKelompok];

            for (int i = 0;i<totalKelompok;i++){
                System.out.println("Masukan Nama Kelompok Ke -" + (i+1));
                namaKelompok[i] = inputUser.next();
                for (int j=0;j<jumlahAnggotaPerKelompok;j++){
                    System.out.println("Masukan nama anggota kelompok " + namaKelompok[i] + "Ke " + (j+1));
                    namaAnggotaKelompok[i][j] = inputUser.next();
                }
            }
            printKelompok(namaKelompok,namaAnggotaKelompok);
        }else if(jumlahSiswaKelas%jumlahAnggotaPerKelompok != 0){
            totalKelompok = (jumlahSiswaKelas-jumlahSiswaKelas%jumlahAnggotaPerKelompok)/jumlahAnggotaPerKelompok;
            System.out.println("Totalnya ada " + totalKelompok + " kelompok");
            System.out.println("Dengan sisa " + jumlahSiswaKelas%jumlahAnggotaPerKelompok + " siswa");
            for (int i = 0;i<jumlahSiswaKelas%jumlahAnggotaPerKelompok;i++){
                System.out.println("Masukan nama siswa yang tersisa");
                System.out.println("Nama siswa ke -" + (i+1));
                sisaAnak[i] = inputUser.next();
            }
            System.out.print("Siswa ");
            printArray(sisaAnak);
            System.out.print(" akan otomatis di tambahkan ke kelompok terakhir \n");

            String[] namaKelompok = new String[totalKelompok];
            String[][] namaAnggotaKelompok = new String[totalKelompok][jumlahAnggotaPerKelompok];

            for (int i = 0;i<totalKelompok;i++){
                System.out.println("Masukan Nama Kelompok Ke -" + (i+1));
                namaKelompok[i] = inputUser.next();
                for (int j=0;j<jumlahAnggotaPerKelompok;j++){
                    System.out.println("Masukan nama anggota kelompok " + namaKelompok[i] + "Ke " + (j+1));
                    namaAnggotaKelompok[i][j] = inputUser.next();
                }
            }
            printKelompok(namaKelompok,namaAnggotaKelompok);
            System.out.print("Di tambah dengan ");
            printArray(sisaAnak);
        }else {
            System.out.println("Anda tidak memasukan angka!");
        }

    }
    private static void printKelompok(String[] kelompok,String[][] namaAnggotaKelompok){
        for (int i = 0;i<kelompok.length;i++){
            System.out.println("Kelompok " + kelompok[i] + " anggotanya adalah :");
                System.out.println(Arrays.toString(namaAnggotaKelompok[i]));
        }
    }
    private static void printArray(String[] array){
        System.out.print(Arrays.toString(array));
    }
}
