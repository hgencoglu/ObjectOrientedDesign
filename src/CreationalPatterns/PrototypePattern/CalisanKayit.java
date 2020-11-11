package CreationalPatterns.PrototypePattern;

public class CalisanKayit  implements Prototip{

    private int id;
    private String ad, atama;
    private double maas;
    private String adres;

    public CalisanKayit(){
        System.out.println("   İzu Çalışan Kayıtları ");
        System.out.println("---------------------------------------------");
        System.out.println("Eid"+"\t"+"Ead"+"\t"+"Eatama"+"\t"+"Emaas"+"\t\t"+"Eadres");

    }

    public  CalisanKayit(int id, String ad, String atama, double maas, String adres) {

        this();
        this.id = id;
        this.ad = ad;
        this.atama = atama;
        this.maas = maas;
        this.adres = adres;
    }

    public void showRecord(){

        System.out.println(id+"\t"+ad+"\t"+atama+"\t"+maas+"\t"+adres);
    }

    @Override
    public Prototip getClone() {

        return new CalisanKayit(id,ad,atama,maas,adres);
    }
}//End of EmployeeRecord class.