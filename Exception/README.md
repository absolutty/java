# Exception
https://www.tutorialspoint.com/java/java_exceptions.htm <br>
- tzv. *výnimka* je problém, ktorý nastane počas vykonávania programu
- keď sa toto stane, normálny chod programu je **zastavený** nesprávnym spôsobom
- výnimky by mali byť odchytávané 
Poznáme tieto **druhy** výnimiek: 
- **CHECKED** exceptions:
  - výnimka, ktorá je oznámená kompilátorom počas *compilation-time*
  - je ich potrebné **ošetriť**
```java
File file = new File("E://txtSubor1.txt");
FileReader fr = new FileReader(file);
//java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
  ```
  
- **UNCHECKED** exceptions:
  - výnimka, ktorá nastane počas *execution-time*
  - tieto zahŕňajú behové chyby a logické chyby
  - nie sú overované počas kompilovania programu
```java
int[] zoznamCisel = {3, 2, 1};
System.out.println(zoznamCisel[7]);
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 3
```

- **Errors**:
  - problémy, ktoré sú mimo kontroly užívateľa alebo programátora
  - známy je StackOverflow error
 ```java
 public static void main(String[] args) {
    main(new String[1]);
}
 ```
 ![](https://github.com/absolutty/javaDocs/blob/master/Exception/exception-hierarchy.jpg)
