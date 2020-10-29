# Objektovo orientované programovanie
**Objekt**:
- základný pojem objektovo orientovaného programovania
- sú dva pohľady na objekty
  - *vonkajší*:
    - k čomu nám slúži?
    - ako sa používa?
  - *vnútorný*:
    - jeho zloženie
    - charakteristika
    - fungovanie
- **teoretický model objektu**:
  - *rozhranie*
  - *verejné časti*: sú viditeľné všetkými objektami v okolí
  - *neverejná časť*: sú viditeľné iba objektom samotným
  - *atribúty* 
  - *metódy*
  
- **rozhranie objektu**:
  - zoznam všetkých správ, kt. objekt príjma
  - ponuka služieb poskytovaných objektom
  - jeden objekt komunikuje s iným objektom cez jeho rozhranie
  
- **atribúty objektu**:
  - modelujú jeho vlastnosti a štruktúru
  - kazdý atribút má názov a hodnotu
  
- **stav objektu**:
  - jedná sa o aktuálne hodnoty všetkých atribútov
  - zmenou hodnoty hocijakého atribútu sa mení aj **stav objektu**
  - objekt *zachováva* stav, pokiaľ nie je nútený zmeniť stav na základe prijatej 
  správy
  
- **metódy objektu**:
  - *reakcia objektu* na doručenú správu, predom určeným spôsobom
  - metódy určujú možné **správanie objektu**
  - **adresát**: objekt, ktorému je správa určená
  - **selektor**: naznačuje o ktorú metódu adresáta žiadame
  - **parametre**: metóda ich môže ale aj nemusí mať, používajú sa v metóde
  - **návratová hodnota**: metóda ju môže ale aj nemusí mať, výsledok algoritmu v metode
  
- **správa --> metóda**:
  - každej správe z rozhrania objektu je priradená práve jedna metóda objektu  
  
[**Trieda**](https://github.com/absolutty/javaDocs/tree/master/Triedy)
- objekt, ktorý vytvára rovnaké objekty

**Inštancia**
  - objekt, ktorý vyrobila trieda

[**Asociácia**](https://github.com/absolutty/javaDocs/tree/master/Asoci%C3%A1cia)
  - spolupráca dvoch objektov

[**Kompozícia**](https://github.com/absolutty/javaDocs/tree/master/Kompozicia)
  - tvorba objektov, kt. sú tvorené objektami
  
**Správa**:
- základný pojem objektovo orientovaného programovania
- slúži na *komunikáciu* medzi objektami
- vzhľad správy: **adresát.selektor(parametre)**
- jediná ktorá je zapísaná inak je správa *new*




**Garbage collector**:
- zberná služba, ktorá sa stará o automatické rušenie nepotrebných objektov
