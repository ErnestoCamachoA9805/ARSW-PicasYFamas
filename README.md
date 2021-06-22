# ARSW-**PicasYFamas**
## Autor 
Ernesto Camacho Arroyave 

Loc: 272 lines in 12 hours 22.6Loc

Date 21/06/21

## Descripcion de la idea 
El proyecto cuenta como una implementacion del juego de picas y famas, deplegado en heroku, y usando el famework de spring boot, el juego es uno basico con el numero a adividar de cuatro cifras. Inicia con una pagina simple de index que te lleva al juego con una pegina poco mas sofisticada,
el link de la pagina es: 

![](https://github.com/ErnestoCamachoA9805/ARSW-PicasYFamas/blob/master/recursos/Informe%20index.PNG)
pagina de index
![](https://github.com/ErnestoCamachoA9805/ARSW-PicasYFamas/blob/master/recursos/informe%20Gamepage.PNG)
pagina de Juego

## Despliege local
Si se desea correr el proyecto en la maquia local:
- es necesario que maven este instalado
- es necesario que java esta instalado
- tenga en cuenta que por default el proyecto corre por el puerto: 8080

si se cumple todo solo es necesario ejecutar el comando de maven, desde la carpeta en donde se encuentra el pom:
- mvn clean install

Y para correr el proyecto, el comando:
- mvn exec:java -D"exec.mainClass"="edu.escuelaing.PicasFamas.PicasyFamasApp"
## Test
![](https://github.com/ErnestoCamachoA9805/ARSW-PicasYFamas/blob/master/recursos/Reporte%20pruebas.PNG)
## Javadoc
El java doc se encunetra en la carpeta de recursos siguiendo el link de 
