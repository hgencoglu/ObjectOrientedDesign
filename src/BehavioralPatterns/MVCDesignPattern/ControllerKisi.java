package BehavioralPatterns.MVCDesignPattern;

public class ControllerKisi {
    private ModelKisi modelKisi;
    private ViewKisi viewKisi;

    public ControllerKisi(ModelKisi modelKisi, ViewKisi viewKisi){
        this.modelKisi=modelKisi;
        this.viewKisi=viewKisi;
    }

    public void setKisiAdi(String isim){
        modelKisi.setIsim(isim);
    }
    public String getKisiAdi(){
        return  modelKisi.getIsim();
    }

    public void updadetView(){
        viewKisi.KisiDetay(modelKisi.getIsim(),
                modelKisi.getSoyIsim(),modelKisi.getYas());
    }

}
