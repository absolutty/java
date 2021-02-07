# Collection
https://dzone.com/articles/an-introduction-to-the-java-collections-framework <br>
<br>![Screenshot](https://github.com/absolutty/javaDocs/blob/master/Collection/class-and-interface-hierarchy.png)
- *Interface* **Collection** je *extendnutý* a *implementovaný* niekoľkými triedamy a interfaceami
- existujú tri základné typy, ktorými môžu byť skupiny inštancií objektov držané pokope: 
  - **Set**: skupina unikátnych(rozdielnych) objektov. T.j. nejedná sa o rovnaké inštancie objektov. Rozhoduje sa či sú unikátne na základe *equals* metódy danej triedy.
  - **List**: sekvencia za sebou nasledujúcich objektov. Poradie je určované tým, ako sú objekty do neho pridávané. Môže obsahovať duplikáty inštancií objektov. 
  - **Queue**: Elementy ktoré sú **pridávané**, sú pridané jej chvost. Elementy ktoré sú **odstraňované**, sú odstránené v poradí v akom boli pridané. Jedná sa o *first-in, first-out*. Dá sa to predstaviť ako rada ľudí čakajúcich niekde v obchode. Prvá osoba ktorá príde do rady, prvá ju aj opustí. 
