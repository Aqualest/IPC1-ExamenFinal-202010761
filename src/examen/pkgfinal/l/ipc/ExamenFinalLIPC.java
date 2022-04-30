/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.pkgfinal.l.ipc;
import java.util.Scanner;
/**
 *
 * @author aqual
 */
public class ExamenFinalLIPC {

    public static void main(String[] args) {
        
        Scanner op = new Scanner(System.in);
        int opcion = 4; //inicializar while
        
        while (opcion != 0) {
        
            System.out.println("""
                           [1] Ejercicio 1
                           [2] Ejercicio 2
                           [3] Ejercicio 3
                           [0] Salir""");
            opcion = op.nextInt();
            
            
            switch (opcion) {
                //Ejercicio 1
                case 1:
                    Scanner numero1 = new Scanner(System.in);
                    System.out.println("Ingrese el primer numero: ");
                    int num1 = numero1.nextInt();
                    Scanner numero2 = new Scanner(System.in);
                    System.out.println("Ingrese el segundo numero: ");
                    int num2 = numero2.nextInt();
                    
                    if (num1 > num2) {
                        System.out.println("El primer numero ["+ num1 +"] es mayor que el segundo ["+ num2+"]");
                    } else {
                    System.out.println("El segundo numero ["+ num2 +"] es mayor que el primero ["+ num1+"]");
                    }
                    break;
                
                //Ejercicio 2
                case 2:
                    int n = 1; // Servira para iterar filas de la piramide.
                    int contadorFilas = 1; // Servira para saber cuantas filas seran.
                    Scanner impar = new Scanner(System.in);
                    System.out.println("Ingrese un numero impar positivo.");
                    int imp = impar.nextInt();
                    if (imp%2 == 0 || imp<1) {
                        System.out.println("Debe escribir un numero impar y positivo. Intente de nuevo");
                        break;
                    }
                    while (contadorFilas<imp) { // Se detiene hasta llegar al numero deseado
                    contadorFilas += 2; // Para contar entre cada fila impar que se imprimira hasta llegar al numero ingresado
                    n += 1; // Va contando las filas necesarias
                    }
                    // System.out.println(n);        ** prueba
                    int espacios = n-1;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < espacios; j++) {
                            System.out.print(" ");
                        }
                        espacios -= 1;
                        for (int k = 0; k < 1+(2*i); k++) {
                        System.out.print("*");
                        }
                        System.out.println("");
                    }
                    
                    break;
                
                
                
                
                //Ejercicio 3
                case 3:
                    int maxLeche; 
                    
                    Scanner numeroVacas = new Scanner(System.in);
                    System.out.println("Ingrese el numero de Vacas disponibles: ");
                    int num = numeroVacas.nextInt();
                    Scanner pesoSoportado = new Scanner(System.in);
                    System.out.println("Ingrese el peso maximo soportado: ");
                    int peso = pesoSoportado.nextInt();
                    
                    Scanner pesosVacas = new Scanner(System.in);
                    System.out.println("Ingrese el peso de las vacas separados por comas: ");
                    String pesos = pesosVacas.nextLine();
                    
                    Scanner producionLeche = new Scanner(System.in);
                    System.out.println("Ingrese la produccion de leche correspondiente a las vacas de antes separadas por comas: ");
                    String produccion = pesosVacas.nextLine();
                    
                    String[] pesoVacaString = pesos.split(",");
                    String[] lecheVacaString = produccion.split(",");  
                    int[] pesoVaca = new int[pesoVacaString.length];
                    int[] lecheVaca = new int[lecheVacaString.length];
                    
                    for (int i = 0; i < lecheVaca.length; i++) {
                        pesoVaca[i] = Integer.parseInt(pesoVacaString[i]);
                        lecheVaca[i] = Integer.parseInt(lecheVacaString[i]);
                    }
                    
                    // Por si ya caben todas las vacas
                    int sumaPesos = 0;
                    int sumaLeche = 0;
                    for (int i = 0; i < lecheVaca.length; i++) {
                        sumaPesos += pesoVaca[i];
                        sumaLeche += lecheVaca[i];
                    }
                    if (sumaPesos < peso) {
                        System.out.println(sumaLeche + "Litros");}
                    
                    // Evaluar todas las combinaciones posibles con el mayoer numero de vacas posible primero.
                    
                    for (int i = 0; i < lecheVaca.length-1; i++) {
                        // La suma de los pesos sera la maxima posible y luego se restaran hasta 
                        // encontrar la maxima leche con peso aceptable. Se usara sumaPesos ya calculado antes.
                        int sumaPesosIteracion = 0;
                        maxLeche = 0;
                        for (int k = 0; k < lecheVaca.length; k++) {
                            sumaPesosIteracion = 0;
                            for (int j = 0; j < lecheVaca.length; j++) {
                                sumaPesosIteracion = sumaPesos-pesoVaca[k];
                                if (sumaPesosIteracion<=peso){
                                    maxLeche = sumaLeche - lecheVaca[k];
                                }}    
                         
                            
                            
                        }
                    }
                    // RAYOS, SOLO TENIA QUE PROBAR CON CADA POSIBILIDAD PARA ENCONTRAR LA MAXIMA LECHE QUE SE PODIA LLEVAR
                    // PERO ME QUEDE SIN TIEMPO PARA CODIFICARLO, AAHHHHHH
                    
                    
                    
                    
                    
                    // Prueba para ver si se pasaron bien los datos
                    for (int i = 0; i < lecheVaca.length; i++) {
                    System.out.println("peso " + i + " " + pesoVaca[i]);
                    System.out.println("produccion " + i + " " + lecheVaca[i]);
                    }
                    //
                    break;
                    
                default:
                    break;
            
            }
        }
        
    }
    
}
