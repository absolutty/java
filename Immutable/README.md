# Immutable object
https://www.geeksforgeeks.org/create-immutable-class-java/ <br>
https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html <br>

- jedná sa o triedy, ktoré sú raz vytvorené ich obsah nemôže byť zmenený
- v Jave, všetky *wrapper* triedy (napr. Integer, Boolean, Byte, Short a String) sú **immutable** (nemenné)
- podmienky ktoré **by mali** (nemusia) byť splnené pri dosiahnutí nemennosti triedy:
  - nie sú poskytnuté **setter** metódy, kt. upravujú jednotlivé polia alebo objekty referujúce na ne
  - všetky *polia* (atribúty) sú **final** a **private**
  - deklarovanie *triedy* ako **final** --> zakazuje overridnúť subtriedam jednotlivé metódy
  - nie sú poskytnuté metódy, kt. uprauvujú mutable objekty
  - nie sú zdielané referencie na mutable objekty
