# Abstraction
https://www.w3schools.com/java/java_abstract.asp <br>
https://www.tutorialspoint.com/java/java_abstraction.htm <br>
> abstraction is the quality of dealing with ideas rather than events

*Data abstraction* je proces ukrýtia niektorých detailov a zobrazovania iba potrebných informácií 
užívateľovi --> vie *čo* to robí, nevie *ako* to robí. Môže byť dosiahnutá **abstraktnými** 
triedami alebo použitím **interface**-ov. <br>
Keyword abstract môže byť použitý pre *triedy* a *metódy*: 
- **abstract class**: z tejto triedy nie je možné vytvoriť objekty(pre jej použitie, je potrebné 
ju zdediť do inej triedy). Môže ale nemusí obsahovať abstraktné metódy.
```java
Animal myObj = new Animal(); // error
```
- **abstract method**: môže byť použitá jedine v abstraktnej triedy, nemá vlastné telo. 
```java
abstract class Animal {
  public abstract void animalSound();
}
```
![Screenshot](https://github.com/absolutty/javaDocs/blob/master/Abstraction/abstract-class-in-java.jpg)
