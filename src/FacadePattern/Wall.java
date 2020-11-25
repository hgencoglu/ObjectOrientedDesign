package FacadePattern;

//Müşteri Temsilcisi
public class Wall {

    private IMobile iphone;
    private IMobile samsung;
    public  Wall(){
        iphone = new IPhone();
        samsung = new Samsung();
    }

    public void IPhoneS(){
        iphone.model();
        iphone.price();
    }

    public void SamsungS(){
        samsung.price();
        samsung.model();
    }

}
