# InputStreamReader
Obaľuje triedu InputStream, to zn. mení byte-based charaktery na obyčajné charaktery
(mení čísla na znaky na základe ich ASCII hodnôt, UTF-8).

```java
InputStream inpStr = new FileInputStream("D:\\doc.txt");

InputStreamReader inpStrRead = new InputStreamReader(inpStr);

int hodnota = inpStrRead.read();

while(hodnota != -1){
  char znak = (char) hodnota;
  System.out.print(znak);
  hodnota = inpStrRead.read();
}
```
