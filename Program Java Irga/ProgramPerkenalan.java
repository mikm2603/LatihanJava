package Praktek1;
import java.util.Scanner;
public class ProgramPerkenalan {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Masukan Nama");
        String inputNama =  userInput.next();      
        System.out.println("Masukan Umur");
        int inputUmur = userInput.nextInt();
        
        System.out.println("Hai kawan-kawan, perkenalkan nama saya " + inputNama + " Saya berumur " + inputUmur + " tahun");
        
        
        
    }
}
