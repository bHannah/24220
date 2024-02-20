package harcosesvarazslo;

import static harcosesvarazslo.HarcosEsVarazslo.randomszam;
import java.util.Random;

public class harcosEsVarazslo2 {
    
    static Random randomszam = new Random();
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
        String palya = "___";
        int harcoshelye = randomszam.nextInt(0,3);
        int varazslohelye = randomszam.nextInt(0,3);
        /*Amikor ugyan azon a mezőn állnak*/
        if(harcoshelye == varazslohelye){
        palya = palya.substring(0, harcoshelye) + "X" + palya.substring(harcoshelye+1);
        } else {
        palya = palya.substring(0,harcoshelye) + "H" + palya.substring(harcoshelye+1);
        palya = palya.substring(0,varazslohelye) + "V" + palya.substring(varazslohelye+1);
        }
        System.out.println(palya);
        }
    } 
}
