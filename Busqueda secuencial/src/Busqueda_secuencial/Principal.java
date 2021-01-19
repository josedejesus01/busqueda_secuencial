/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busqueda_secuencial;
import java.util.Scanner;


/**
 *
 * @author JOSE
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Busqueda encontrar=new Busqueda();
        int vector2[]={55,4,87,22,99,23,56,21};      
        encontrar.mostrarArreglo(vector2);// se manda a llamar los datos del arreglo
        // en este caso pedimos los datos a buscar desde el teclado
        System.out.println("introdusca en elemento que desea buscar :");
        int indice=leer.nextInt();// se almacena los datos en indice 
        // se manda a llamar el metodo de busquedad secuencial 
        indice=encontrar.busquedasecuencial(vector2, indice);
        if(indice!=-1){//quiere ecir su los datos existen 
            System.out.println("elemento encontrado en el indice [ "+ indice+"]");
            
         // si el elemento  no se encuentra 
        }else{
            System.out.println("elemento no encontrado");
        }
            
    }
    
}
