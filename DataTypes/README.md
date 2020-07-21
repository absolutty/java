# Dátové typy
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html<br>
Java programovací jazyk je tzv. *statically-typed*, čo znamená že všetky premenné musia byť deklarované predtým ako sú použíté.<br>
Poznáme 8 primitívnych dátových typov:

```java
byte b = Byte.MAX_VALUE; //od -128 do 127, veľkosť 1 bajt.
short s = Short.MAX_VALUE; //od -32768 do 32767, veľkosť 2 bajty.
int i = Integer.MAX_VALUE; //od 2,147,483,648 do 2,147,483,647, veľkosť 4 bajty.
long l = Long.MAX_VALUE; //od -9,223,372,036,854,775,808 do 9,223,372,036,854,775,807, veľkosť 8 bajtov.
float f = Float.MAX_VALUE; //od 3.4028235E38 do 1.4E-45, veľkosť 4 bajty.
double d = Double.MAX_VALUE; //od 1.7976931348623157E308 do 4.9E-324, veľkosť 8 bajtov.
boolean b; //true alebo false, veľkosť 1 bit.
char c; //ukladá jednotlivé písmená/znaky, veľkosť 2 bajty. 
```
