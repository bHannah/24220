package harcosesvarazslo;

import java.util.Random;

public class HarcosEsVarazslo {

    static Random randomszam = new Random();

    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
        String elso = "";
        String masodik = "";
        String harmadik = "";
        int harcoshelye = randomszam.nextInt(0,3);
        if (harcoshelye == 0){
            elso = "H";
        }
        else if(harcoshelye == 1){
            masodik = "H";
        }
        else if(harcoshelye == 2){
            harmadik = "H";
        }
        int varazslohelye = randomszam.nextInt(0,3);
        if(varazslohelye == 0 && harcoshelye != 0){
            elso = "V";
        }
        else if(varazslohelye == 0 && harcoshelye == 0) {
            elso = "X";
        }
        if(varazslohelye == 1 && harcoshelye != 1){
            masodik = "V";
        }
        else if(varazslohelye == 1 && harcoshelye == 1){
            masodik = "X";
        }
        if(varazslohelye == 2  && harcoshelye != 2){
            harmadik = "V";
        }
        else if(varazslohelye == 2 && harcoshelye == 2){
            harmadik = "X";
        }
        if (elso == ""){
            elso = "_";
        }
        if (masodik == ""){
            masodik = "_";
        }
        if (harmadik == ""){
            harmadik = "_";
        }
        System.out.println(elso + masodik + harmadik);
    
        }
    }
}
