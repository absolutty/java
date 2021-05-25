# HashSet
https://www.geeksforgeeks.org/hashset-in-java/ <br>
https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html <br>
- trieda implementujúca *Set interface*, čo zn. že duplikujúce hodnoty (values) **nie sú** povolené
- objekty, kt. sú do neho vkladané nemajú zaručené to isté poradie v akom boli vložené (sú vkladané na základe ich hash code)
- táto vlastnosť umožňuje rýchlosť operácií ako sú napr. (*add(), remove(), contains(), size()*)
- null prvky sú povolené
- takto zlúčené objekty je možné prechádzať pomocou Iteratoru
- ten je typu **fail-fast--:
  - ak je Set nejakým spôsobom modifikovaný potom ako bol Iterator vytvorený (okrem Iteratorovej vlastnej metódy remove()), 
  je vyhodená výnimka **ConcurrentModificationException**
  - čo zn. že iterátor neuspeje a spadne rýchlo a čisto, bez možných budúcich problémov

![](https://github.com/absolutty/javaDocs/blob/master/HashSet/java-hashset-hierarchy.jpg)
