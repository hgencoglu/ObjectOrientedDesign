package StructuralPatterns.FlyWeightPattern;

import java.util.HashMap;

public class PlayerFactory {

    private static HashMap<String, Player> hm =
            new HashMap<String, Player>();

    public static Player getPlayer(String type){
        Player p=null;
        if(hm.containsKey(type))
            p=hm.get(type);

        else {
            switch(type)
            {
                case "GuvenlikGorevlisi":
                    System.out.println("Yeni Güvenlikçi atandı");
                    p=new GuvenlikGorevlisi("Bomba imha");

                case "Terorist":
                    System.out.println("Terorist tespit edildi");
                    p=new Terorist("Bombalama");

                    default:
                        System.out.println("Hata");
            }
            hm.put(type,p);
        }

        return p;
    }
}
