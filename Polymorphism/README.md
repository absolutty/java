# Polymorphism
https://www.geeksforgeeks.org/polymorphism-in-java/ <br>
- slovo polymorfizmus znaméená mať viacej foriem (podôb)
- jedna z najdôležitejších foriem OOP
- umožňuje uskutočniť jednu akciu rôznymi spôsobmi. Inak povedané, polymorfizmus umožňuje definovať jeden interface ktorý môže mať niekoľko implementícií
- odosielateľ správy sa nestará o typ adresáta
- postačuje, že adresát je schopný správu prijať
- polymorfyzmus sa dá dosiahnúť pomocou [Interface](https://github.com/absolutty/javaDocs/tree/master/Interface), kt. implementuje

V Jave je tento mechanizmus rozdelený na dva základné typy:
1. **compile time polymorphism**: taktiež známy ako *static* polymorphism. Dá sa dosiahnúť overloading-om
funkcie.
2. **Runtime polymorphism**: taktiež známy ako *Dynamic Method Dispatch*. Jedná sa o proces v ktorom 
zavolanie konkrétnej funkcie overridden metódy je rozhodnuté počas RunTime-u. Dá sa dosiahnúť pomocou 
**method overriding**.
