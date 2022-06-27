package conversisuhu;
import java.util.Scanner;
/**
 *
 * @author I Gusti Ngurah Angga Putra Sukanta 19103028
 */
public class Conversisuhu {

    public static void main(String[] args) {
    float C = 0, F = 0;
        int pilih, pilihku;
       
        Scanner scan = new Scanner(System.in);
        suhu konversi = new suhu();
        System.out.print("Pilih Menu Konversi Suhu Berikut ini : "
                + "\n1. Celcius"
                + "\n2. Fahrenheit"
                + "\n:");
        pilih = scan.nextInt();
        
        switch(pilih){
            
            case 1:
                System.out.print("Pilih konversi dari Celcius ke - "
                     + "\n1. Fahrenheit"
                     + "\n:");
                
                pilihku = scan.nextInt();
                
                if (pilihku == 1 ){
                    konversi.celciuskefahrenheit(C, F);
                } else
                    System.out.println("pilihan anda salah");
                
                break;
                
            case 2 :
                 System.out.print("Pilih konversi dari Fahrenheit ke"
                        
                        + "\n1. Celcius"
                        + "\n:");
                 pilihku = scan.nextInt();
                 
                 if (pilihku == 1){
                     konversi.fahrenheitkecelcius(F, C);
                 } else
                break;
            
               
            default : System.out.println("Konversi suhu yang di masukan tidak tersedia");
        
        }     
    }
    
}
