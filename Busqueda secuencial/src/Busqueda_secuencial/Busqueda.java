/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busqueda_secuencial;

// creamos un metodo de busqueda 
public class Busqueda {
    public int busquedasecuencial(int arreglo[],int elemento){// le mandamos de parametro 2 variables
        int i;
        boolean encontrado=false; // le damos un valor booleana
        for(i=0;i<arreglo.length && encontrado==false;i++){// est for se ocupara para  indicar que los datos no se encuentran
            if (elemento==arreglo[i]){// se ocupa el if para encontrar si los datos ya se encuentran 
                encontrado=true;
                return i;// se retorna en donde en donde se encuentra el arreglo 
                
            }
        }
        return -1;// si los datos no se encuentran 
    }
    public void mostrarArreglo(int[]arreglo){// se inserta un metodo para mostrar los datos
        int k; 
        for(k=0;k<arreglo.length;k++){// se utiliza un for cuando k vale 0 cuando sea menor que el arreglo que se incremente
            System.out.print("["+arreglo[k]+"]");
            }
        System.out.println();
        
    }
}

