# ArrayList
- **implements** *List<E>* 

https://www.w3schools.com/java/java_arraylist.asp <br>
- vytvára skupinu prvkov jedného druhu
- môže obsahovať ľubovoľný počet prvkov (pokiaľ jeho size nie je definovaná v constructor-e)
- elementy do ArrayList-u môžu byť pridávané aj odoberané
- ku prvkom sa dá pristupovať pomocou poradového čísla - indexu (počítanie začína od 0
Rozdiel medzi **array** a **ArrayList**  
  - array môže obsahovať iba **primitive types**
  - veľkosť array-u je nemenná
  - ArrayList môže obsahovať iba objektové typy(napr aj: Integer, Double, Float, ...)
  - jeho veľkosť je flexibilná
```java
import java.util.ArrayList; // importovanie ArrayList-u

ArrayList<String> zoznamMien = new ArrayList<String>(); // vytvorí nový ArrayList objekt
zoznamMien.add(String meno); //vráti void
zoznamMien.get(int index); //vráti daný String
zoznamMien.remove(int index); // odstráni z indexu a vráti daný String
zoznamMien.size(); //vráti int veľkosť ArrayListu

```
