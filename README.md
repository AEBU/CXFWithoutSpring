# Que se va a realizar

Básicamente funciona de la siguiente forma:
 
-   Exponemos un servicio web, con CXF
-   Creamos la clase de implementación  del servicio para aceptar solicitud (hola/mundo), y generar respuestas
-   Registramos contenedor con CXF
-   Implementamos el servicio dentro de un contenedor web
-   Creamos el cliente para invocar métodos en el servicio



https://www.javacodegeeks.com/2013/07/developing-restful-services-using-apache-cxf.html


-   Cfx, web.xml

http://javajeedevelopment.blogspot.com/2014/07/restful-services-using-apache-cxf.html
   
   
   https://dzone.com/articles/rest-web-service-using-cxf
   
Config without Servlet
https://memorynotfound.com/configure-jersey-with-annotations-only/



Without Spring and xml
http://buraktas.com/resteasy-example-without-using-a-web-xml/


-   JAXRSServerFactoryBean creas un servidor dentro de CXF, que comienza a escuchar solicitudes dentro de la URL especificada
    -   Definimos el ciclo de vida de las clases 
    -   http://cxf.apache.org/docs/jaxrs-services-configuration.html
