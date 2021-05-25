# List
- **extends** *Collection<E>* *Iterable<E>*
- **implementujú triedy**: AbstractList, AbstractSequentialList, ArrayList, AttributeList, CopyOnWriteArrayList, LinkedList, RoleList, RoleUnresolvedList, Stack, Vector <br>
  
https://docs.oracle.com/javase/8/docs/api/java/util/List.html <br>
Usporiadaná kolekcia, taktiež známa ako *sekvencia*. Užívateľ tohto interface-u má precíznu kontrolu toho, 
kde sú vložené jednotlivé objekty. Tento interaface pridáva pridané metódy k tým ktoré sú špecifikované 
v *Collection* (iterator(), add(), remove(), equals(), a hashCode() ). <br>
Poskytuje 4 metódy na *pozičný* (indexovaný) prístup k jeho elementom. Začíná číslom **0**. <br>
Pomocou ListIterator-a je možné sa posúvať dopredu a dozadu. <br>
![](https://github.com/absolutty/javaDocs/blob/master/List/list.png)
