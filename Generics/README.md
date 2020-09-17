# Generics
https://www.tutorialspoint.com/java/java_generics.htm <br>
Jedná sa o triedy a metódy, ktoré umožňujú definovať jednou metódou niekoľko konkrétných metód, alebo
jednou triedou niekoľko podobných tried. Taktiež umožňujú počas runtime chytiť invalid types. <br>
**Generic methods:** <br>
Metóda, ktorá môže byť zavolaná s argumentami z rôznych metód. Na základe typu argumentu, kompiler
narába vhodne s danou metódou.
- pri deklarácií metódy je potrebné aby mali zobáčíkové zátvorky *< a >*
```java
public class GenericMethodTest {
   public static < E > void printArray( E[] inputArray ) {
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }

   public static void main(String args[]) {
      Integer[] intArray = { 1, 2, 3, 4, 5 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };

      printArray(intArray);   //zobrazí Integer array
      printArray(doubleArray);   //zobrazí Double array
   }
}
```
**Bounded Type Parameters**:<br>
Je možné aj určiť typy parametrov ktoré sú použité v metóde. Pomocou key-wordu *extends*.
```java
public class MaximumTest {
   public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
      T max = x;   // nastaví x ako najväčší
      
      if(y.compareTo(max) > 0) {
         max = y;   // y je zatiaľ najväčší
      }
      
      if(z.compareTo(max) > 0) {
         max = z;   // z je teraz najväčší              
      }
      return max;   //vráti najväčší objekt 
   }
   
   public static void main(String args[]) {
      System.out.println(maximum(3, 4, 5)); //ret 5
      System.out.println(maximum(6.6, 8.8, 7.7)); //ret 8.8
      System.out.println(maximum("pear", "apple", "orange")); //ret pear
   }
}
```
**Generic Classes**: <br>
Deklarácia takejto triedy vyzerá tak isto ako deklarácia klasickej triedy, s tým rozdielom že táto za jej názvom má *druh parametra*. 
```java
public class Box<T> {
   private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }

   public static void main(String[] args) {
      Box<Integer> integerBox = new Box<Integer>();
      Box<String> stringBox = new Box<String>();
    
      integerBox.add(new Integer(10));
      stringBox.add(new String("Hello World"));

      System.out.printf("Integer Value :%d\n\n", integerBox.get());
      System.out.printf("String Value :%s\n", stringBox.get());
   }
```
