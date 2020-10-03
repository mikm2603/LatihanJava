package Praktek1;
import java.util.*;
public class KepoinIrga {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Kepoin irga yuk!");
        System.out.println("1.Nama lengkap");
        System.out.println("2.Tanggal lahir");
        System.out.println("3.Alamat rumah");
        System.out.println("4.Instagram");
        System.out.println("5.Nomor whatsapp");
        System.out.println("6.Alamat email");
        System.out.println(" ");
        System.out.println("Ketikan pilihanmu :");
        int pilihan = inputUser.nextInt();
        switch (pilihan){
            case 1 :
            System.out.println("Nama lengkapnya adalah Muhamad Irga Khoirul Mahfis");
            break;
            case 2 :
            System.out.println("Dia lahir pada 26 Maret 2004");
            break;
            case 3 :
            System.out.println("Dia tinggal di Pasir Kidul RT 01 RW 03");
            break;
            case 4 :
            System.out.println("Username instagramnya adalah @puisi.mikm");
            break;
            case 5:
            System.out.println("Nomor whatsappnya adalah 087726030401");
            break;
            case 6 :
            System.out.println("Alamat emailnya adalah muhamadirga2@gmail.com");
            break;





        }
    }
}
