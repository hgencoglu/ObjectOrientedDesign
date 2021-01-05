package BehavioralPatterns.DataAccessObjectPattern;

public class Student {
    private String adSoyad;
    private int ogrNo;

    Student (String adSoyad, int ogrNo){
        this.adSoyad=adSoyad;
        this.ogrNo=ogrNo;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public int getOgrNo() {
        return ogrNo;
    }
}
