https://docs.oracle.com/javase/tutorial/essential/exceptions/handling.html 
# try
```java
try {
    //kód
}
//catch and finally blocks . . .
```
- vnútro bloku **try** (*//kód*) obsahuje riadky kódu, ktoré potencionálne môžu **vyhodiť** exception
- musí byť nasledovaná **catch**-om

# catch
```java
try {
  //kód
} catch (DruhException ex) {
  //zachytenie výnimky kód
} catch (DruhException ex) {
  //zachytenie výnimky kód
}
```
- rieši výnimku (na základe jej typu), ktorá je zadaná ako jeho parameter
- vnútro bloku **catch** (*//zachytenie výnimky kód*) obsahuje riadky kódu, ktoré sú vykonané keď nastane výnimka
- následuje po bloku **try**
- jeden try môže obsahovať *neobmedzený* počet catchov
- od verzie Javy SE 7, dokonca aj jeden catch blok môže obsahovať viacej typov výnimiek
- tie sú oddelené v parametroch catch-u znakom **|** 
```java
catch (IOException|SQLException ex) {
    logger.log(ex);
    throw ex;
}
```

# finally
```java
try {
  //kód
} catch (DruhException ex) {
  //zachytenie výnimky kód 
} finally {
  //vykonané vždy
}
```
- vnútro bloku **finally** je vykonané vždy, nezáležiac od vyhodenia výnimky
