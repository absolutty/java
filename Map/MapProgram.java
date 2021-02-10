import com.example.funkcie.Rozdelenie;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> jazyky = new HashMap<>();
        jazyky.put("Java", "vyvíjaný spoločnosťou Oracle, jeho syntax vychádza z jazykov C a C++");
        jazyky.put("Python", "interpretovaný, interaktívny programovací jazyk, ktorý vytvoril Guido van Rossum");
        jazyky.put("C", "pôvodne bol určený pre použitie na operačných systémoch UNIX");

        if(jazyky.containsKey("Java")){//ak HashMap obsahuje key Java
            System.out.println("Java bola úspešne pridaná!");
        }
        if(jazyky.containsKey("Python")){//ak HashMap obsahuje key Python
            System.out.println("Python bol úspešne pridaný!");
        }
        if(jazyky.containsKey("C")){//ak HashMap obsahuje key C
            System.out.println("C bol úspešne pridaný!");
        }
        Rozdelenie.vypis();
        MapProgram.vypisHashMap(jazyky);

        Rozdelenie.vypis();
        if(jazyky.remove("Python", "interpretovaný, interaktívny programovací jazyk, ktorý vytvoril Guido van Rossum")){//odstráni daný jazyk na základe jeho key
            System.out.println("Jazyk Python úspešne odstránený");
        }
        else{
            System.out.println("Jazyk Python nebol odstránený");
        }
        Rozdelenie.vypis();
        MapProgram.vypisHashMap(jazyky);

        jazyky.replace("Java", "dá sa spustíť na hocijakom operačnom systéme, ak má správne JVM"); //nahradí ho na základe jeho key
        jazyky.replace("JavaScript", "tento jazyk nebude pridaný do zoznamu");//tento jazyk nie nahradený, lebo ani nie je pridaný v zozname
        Rozdelenie.vypis();
        MapProgram.vypisHashMap(jazyky);
    }

    /**
     * vypíše všetky keys z HashMap jazyky (nevypisujú sa v určenom poradí!!)
     * */
    private static void vypisHashMap(Map<String, String> map){
        for(String k : map.keySet()){
            System.out.printf("%s: %s%n", k, map.get(k));
        }
    }
}
