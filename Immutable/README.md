# Immutable object
https://www.geeksforgeeks.org/create-immutable-class-java/ <br>
https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html <br>
https://www.baeldung.com/java-string-immutable <br>

- jedná sa o triedy, ktoré sú raz vytvorené ich obsah nemôže byť zmenený
- v Jave, všetky *wrapper* triedy (napr. Integer, Boolean, Byte, Short a String) sú **immutable** (nemenné)
- podmienky ktoré **by mali** (nemusia) byť splnené pri dosiahnutí nemennosti triedy:
  - nie sú poskytnuté **setter** metódy, kt. upravujú jednotlivé polia alebo objekty referujúce na ne
  - všetky *polia* (atribúty) sú **final** a **private**
  - deklarovanie *triedy* ako **final** --> zakazuje overridnúť subtriedam jednotlivé metódy
  - nie sú poskytnuté metódy, kt. uprauvujú mutable objekty
  - nie sú zdielané referencie na mutable objekty
- trieda **String** je tiež Immutable object
  - pretože sa jedná o jednu z najviac používaných dátových štruktúr
  - uschovávanie String literálov a opätovné používanie šetrí veľa pamäte
  - Java String Pool je špeciálná oblasť v JVM, kde sú String-y uschovávané
  - keďže String-y sú nemenné (immutable), JVM šetri množstvo pamäte určenej pre nich tým že ukladá kópiu jednotlivých literálov do JSP <br>
![](https://github.com/absolutty/javaDocs/blob/master/Immutable/string-immutable.jpg)
