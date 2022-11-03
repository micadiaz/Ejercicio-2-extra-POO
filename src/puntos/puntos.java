
package puntos;

import java.util.Scanner;

public class puntos {
    Scanner leer=new Scanner(System.in);
public double x1,x2,y1,y2; 

public puntos crearPuntos(){
    System.out.println("ingrese un numero para x1");
    x1=leer.nextDouble();
    System.out.println("ingrese un numero para y1");
    y1=leer.nextDouble();
    System.out.println("ingrese un numero para x2");
    x2=leer.nextDouble();
    System.out.println("ingrese un numero para y2");
    y2=leer.nextDouble();
        return new puntos();}

public puntos calcular(){
       double a=(Math.abs(x1));
       double b=(Math.abs(y1));
       double c=(Math.abs(x2));
       double d=(Math.abs(y2));
       double ra=(c-a);
       double re=(d-b);
       double raiz=(Math.sqrt((Math.pow(ra,2))+(Math.pow(re,2))));
       System.out.println("la distancia que hay entre los dos puntos es= "+raiz);
        return new puntos();     
}
}
/*Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html*/