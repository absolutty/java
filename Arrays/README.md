# Array
https://www.tutorialspoint.com/java/java_arrays.htm <br>
Dátová sekvenčná štruktúra, má fixnú veľkosť a môže ukladať iba elementy rovnakého typu. <br>
Deklarovanie arrayu:
```java
datovyTyp[] nazov;   // preferovaný spôsob
alebo
datovyTyp nazov[];  // funguje, ale nevidel som to ešte nikoho používať v Jave 🙃
```
Vytváranie arrayu: <br>
Môže byť vytvorený použiťím keywordu new. 
```java
datovyTyp[] nazov = new datovyTyp[velkost];
//vytvára array použítím new --> datovyTyp[velkost]
//priradí reference k novo vytvorenému arrayu k premennej s názvom --> nazov
```
Array môže byť vytvorený aj týmto spôsobom:
```java
datovyTyp[] nazov = {hodnota1, hodnota2, ...};
//jeho veľkosť je definovaná počtom premenných
```
Array mojZoznam obsahuje 10 premenných, číslujú sa od **0-9**.
```java
double[] mojZoznam = new double[10];
```
