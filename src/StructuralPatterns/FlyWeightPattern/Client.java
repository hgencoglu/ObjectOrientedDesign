package StructuralPatterns.FlyWeightPattern;

import java.util.Random;

public class Client {

    //private static String[] playerType={"Guvenlikci","Terörist"};
    private static String[] playerType={"GuvenlikGorevlisi","Terorist"};
    private static String[] silah ={"Tabanca","Tüfek"};

    public static void main(String args[]){

        //Player p = PlayerFactory.getPlayer("GuvenlikGorevlisi");
        Player p = PlayerFactory.getPlayer(getRandPlayerType());
        p.silahSec("Tabanca");
        p.gorev();

    }

    public static String getRandPlayerType()
    {
        Random r = new Random();
        int randInt = r.nextInt(playerType.length);
        return playerType[randInt];
    }
    public static String getRandWeapon()
    {
        Random r = new Random();
        int randInt = r.nextInt(silah.length);
        return silah[randInt];
    }



}
