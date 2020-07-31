# Composition
Dizajnová technika, využíva **has-a** (má niečo, niekoho, ...) relation. Umožňuje vytvárať *objekty* **tvorené** *objektami*
```java
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
}    
```
