# HttpURLConnection
https://docs.oracle.com/javase/8/docs/api/java/net/HttpURLConnection.html <br>
Jedná sa o *URLConnection* s podporou HTTP. Každá instancia tejto triedy tvorí jeden request, 
ale underlying network connection na HTTP server môže byť transparentne zdielaná ostatnými inštanciami.
```java
try {
  URL url = new URL("https://www.google.com/");
  HttpURLConnection connection = (HttpURLConnection) url.openConnection();
  int odozvaHTTP = connection.getResponseCode();//response code z HTTP connection

  System.out.println(odozvaHTTP);
} catch (IOException e) {
  e.printStackTrace();
}
```
