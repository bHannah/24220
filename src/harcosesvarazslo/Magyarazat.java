package harcosesvarazslo;

public class Magyarazat {
    public static void main(String[] args){
        String s = "abc.12x";
        String uj = s.substring(4, 6);
        System.out.println(uj);
        
        int szam = Integer.parseInt(uj);
        System.out.println(szam + 2);
        
        int hossz = s.length();
        System.out.println("első: " + s.charAt(0));
        System.out.println("utolsó: " + s.charAt(hossz-1));
        
        System.out.println("Eredeti abcvel kezdődik: " +s.startsWith("abc"));
        /*az abc.12x legyen abc.12q*/
        String csere = s.replaceAll("12x", "hu");
        
    }
    
}
