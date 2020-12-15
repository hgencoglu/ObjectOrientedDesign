package StructuralPatterns.FlyWeightPattern;

public class GuvenlikGorevlisi implements Player {
    private  final String gorevString;
    private String silah;
    public GuvenlikGorevlisi(String gorevString) {
        this.gorevString = gorevString;
    }
    @Override
    public void silahSec(String silah) {
        this.silah=silah;
    }
    @Override
    public void gorev() {
        System.out.println("Güvenlikçi silah: "+silah
                + " ve görevi: "+gorevString);
    }
}
