# Algoritmus 
- konečná *presne definovaná postupnosť* nejakých príkazov na vyriešenie danej úlohy
- vlastnosti:
	- **determinovanosť**: pri vykonaní každého jedného kroku musí byť jednoznačne 
	jasné aký je nasledujúci krok
	- **rezultatívnosť**: pri zadaní rovnakých vstupov je potrebné aby nám vyšli rovnaké výsledky
	- **konečnosť**: má konečný počet krokov
	- **hromadnosť**: nie je riešením jednej úlohy, mal by byť *všeobecný*
	- **efektívnosť**: výsledok má byť dosiahnutý za použitia čo najmenej krokov
	- **elementárnosť**: je zložený z niekoľko za sebou nasledujúcich krokov
- je vykonávaný fyzickým objektom, kt. sa nazýva *procesor*
- procesor nerozmýšla sám, využíva predom určenú postupnosť krokov

Jeho prvkami sú príkazy:
- **postupnosť**(sekvencia):
  - určuje poradie vykonávania príkazov
  - príkazy mžu byť jednoduché alebo štrukturované
- **vetvenie**(výber jednej alternatívy):
	- alternatívne vetvy algoritmu
	- vetva sa uplatní, ak je splnená podmienka
	- príkaz [IF](https://github.com/absolutty/javaDocs/tree/master/If), príkaz [SWITCH](https://github.com/absolutty/javaDocs/tree/master/Switch)
- **cyklus**(opakovanie časti algoritmu):
	- opakovaná časť --> telo cyklu	
	- nazýva sa iterácia
	- opakuje sa na základe určenej podmienky
- program existuje v dvoch tvaroch:
	- **zdrojový kód**: zapisuje aj číta človek
	- **strojový kód(cieľový)**: pracuje podľa neho počítač, človek ho nevie jednoducho prečítať
- základné **druhy** algoritmov:
	- **brute-force** algorithm: skúša každú možnosť
	- **recursive** algorithm: počas jeho vykonávania invokuje sám seba
	- **divide an conquer** algorithm: rozdeľuje problémy do menších inštancií, vyrieši ich samostatne a potom zlúči výsledok
	- **backtracking** algorithm: vyskúša všetky možnosti a vráti sa naspäť ako náhle zistí že že ďalšie možnosti nie sú *validné*(neexistujú už)
	- **dynamic programming** algorithm: ideálne riešenie pre rekurzívne riešenia, kt. majú prelínajúce sa problémy
	- **greedy** algorithm: zvolí najviac optimálny krok pre každý krok
