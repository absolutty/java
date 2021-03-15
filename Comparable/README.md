# Comparable 
https://www.javatpoint.com/Comparable-interface-in-collection-framework <br>
- interface slúži na **usporiadanie** užívateľom definovanej triedy. 
- obsahuje jedinú metódu s názvom *compareTo(Object o)*
- umožňuje usporiadať elementy na základe jedného dáta z objektu (napr. mena, veku, dátumu, ...)
- **public int compareTo(Object o)**: porovnáva daný objekt s určeným objektom
- vráti:
  - **kladný** integer ak je objekt *viacej* ako určený objekt
  - **záporny** integer, ak je objekt *menej* ako určený objekt
  - **nulu**, ak sa objekty rovnajú
```
