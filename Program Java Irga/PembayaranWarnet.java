package programwarnet;
import java.util.*;
public class PembayaranWarnet {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        int menit,jam,bayarPerMenit,bayarPerJam,bayar,total,kembalian,kurang;
        System.out.print("Masukan jam penyewaan Pc = ");
        jam = inputUser.nextInt();
        System.out.print("Masukan menit penyewaan Pc = ");
        menit = inputUser.nextInt();
        bayarPerMenit = 100;
        bayarPerJam = 6000;
        total = (jam*bayarPerJam)+(menit*bayarPerMenit);
        System.out.println("Jumlah uang yang harus di bayar adalah Rp." + total);
        System.out.print("Masukan uang pembayaran = ");
        bayar = inputUser.nextInt();
        kembalian = bayar-total;
        kurang = total-bayar;
        System.out.println("anda membayar Rp." + bayar);
        if(bayar>total){
            System.out.println("Jadi kembaliannya adalah Rp." + kembalian);
        }else if(bayar==total){
            System.out.println("Uang anda pas");
        }else if(bayar < total){
            System.out.println("Uang anda kurang Rp." + kurang + " untuk membayarnya!");
        }else {
            System.out.println("Anda belum memasukan uang, anda miskin bitch!");
        }
        System.out.println("Terima Kasih....");
    }
}
