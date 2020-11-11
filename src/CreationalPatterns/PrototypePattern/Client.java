package CreationalPatterns.PrototypePattern;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Çalışanın ID'sini Giriniz: ");
        int Eid=Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Çalışanın Adını Giriniz: ");
        String Ead=br.readLine();
        System.out.print("\n");

        System.out.print("Çalışanın Atama Yapılacağı Birimi Giriniz: ");
        String Eatama=br.readLine();
        System.out.print("\n");

        System.out.print("Çalışanın Adresini Giriniz: ");
        String Eadres=br.readLine();
        System.out.print("\n");

        System.out.print("Çalışanın Maaşını Giriniz: ");
        double Emaas= Double.parseDouble(br.readLine());
        System.out.print("\n");

        CalisanKayit e1=new CalisanKayit(Eid,Ead,Eatama,Emaas,Eadres);

        e1.showRecord();
        System.out.println("\n");
        CalisanKayit e2=(CalisanKayit) e1.getClone();
        e2.showRecord();

        System.out.print("\n");
        System.out.print(e1);
        System.out.print("\n");
        System.out.print(e2);
        System.out.print("\n");

    }
}//End of the ProtoypeDemo class.
