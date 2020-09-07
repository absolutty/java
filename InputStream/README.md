# InputStream
http://tutorials.jenkov.com/java-io/inputstream.html <br>
Reprezentuje usporiadaný stream byte-ov. Typicky je spojený s nejakým zdrojom dát, napr. súbor, 
network connection, pipe, atď.

```java
        InputStream inpStr = new FileInputStream("D:\\doc.txt");//cesta k súboru v PC

        int data = inpStr.read();//.read() vracia int ktorý obsahuje byte-value charakteru
        
        //ak chceme prečítať všetky charaktery ktoré obsahuje input stream, je potrebné čítať pokiaľ
        vrátená hodnota sa nerovná -1, čo znamená že nie je viacer byte-ov na čítanie 
        
        while(data != -1){
            System.out.print(Character.toChars(data));

            data = inpStr.read();
        }
```
