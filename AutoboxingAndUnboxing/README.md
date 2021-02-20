# Autoboxing and unboxing
https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html <br>
Automatická **konverzia** robená Java kompilerom, ktorá konvertuje primitive data-types na objekty.
```java
Character znak = 'a';
```
Potom je ich možné pridávať do **List**-ov. 
```java
ArrayList<Character> zoznamZnakov = new ArrayList<>();

zoznamZnakov.add('a');
zoznamZnakov.add('b');
zoznamZnakov.add('c');
```
Použitie bez autoboxingu:
```java
ArrayList<Character> zoznamZnakov = new ArrayList<>();

zoznamZnakov.add(Character.valueOf('a'));
zoznamZnakov.add(Character.valueOf('b'));
zoznamZnakov.add(Character.valueOf('c'));
```
Autoboxing nastáva keď:
- ak je parameter posunutý metódy, od ktorého sa očakáva správanie objektu
- ak je parameter pridelený ku konkrétnej *wrapper* class.

**Umožňuje** písanie prehladnejšie ho kódu, jednoduchšieho na čítanie. <br>

![](https://github.com/absolutty/javaDocs/blob/master/AutoboxingAndUnboxing/autobox-unbox.png)
