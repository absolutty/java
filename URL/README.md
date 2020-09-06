# URL
https://docs.oracle.com/javase/7/docs/api/java/net/URL.html <br>
https://www.geeksforgeeks.org/url-class-java-examples/ <br>
zn. *Uniform Resource Locator*, odkazuje na zdroj v World Wide Web.Zdroj môže byť niečo jednododuché 
ako je súbor alebo priečinok, ale môže ukazovať aj na komplexný objekt. 
```java
// vytvorí URL na základe vloženého stringu
URL url1 = new URL("https://www.google.co.in/?gfe_rd=cr&ei=ptYqWK26I4fT8gfth6CACg#q=geeks+for+geeks+java"); 
  
// vytvorí URL na základe protokolu, hostname a path
URL url2 = new URL("http", "www.geeksforgeeks.org", "/jvm-works-jvm-architecture/"); 
  
URL url3 = new URL("https://www.google.co.in/search?q=gnu&rlz=1C1CHZL_en"
            +"IN714IN715&oq=gnu&aqs=chrome..69i57j69i60l5.653j0j7&sourceid=chrome&ie=UTF-8#q=geeks+for+geeks+java"); 
```
