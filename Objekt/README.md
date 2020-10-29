# Objekt 
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
