package FacadePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public  static int choice;
    public static void main(String args[]) throws NumberFormatException, IOException {
        do{
            System.out.println("1. IPHONE");
            System.out.println("2. Samsung");
            System.out.println("3. Çıkış");
            System.out.println("Seçiminizi Giriniz: ");
            InputStreamReader isp = new InputStreamReader(System.in);
            BufferedReader br =new BufferedReader(isp);
            choice = Integer.parseInt(br.readLine());

            Wall w = new Wall();
            switch (choice){
                case 1: w.IPhoneS();
                break;
                case 2: w.SamsungS();
                break;
                default:
                    System.out.println("Seçiminizi gözden geçirin");
                    return;


            }

        }while(choice!=3);

    }
}
