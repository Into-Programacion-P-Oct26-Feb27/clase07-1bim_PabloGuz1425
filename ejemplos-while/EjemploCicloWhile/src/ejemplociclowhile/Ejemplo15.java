/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

/**
 *
 * @author SALASC
 */
public class Ejemplo15 {
    
    public static void main(String[] args) {
    
        
        int contador = 1;
        int limite =1;
        while(contador < limite){
            System.out.printf("Valor %d\n", contador);
        }
        
    }
}
/*
nunca se va a poder ejecutar debido a que el contador y el limite comparten el mismo valor
haciendo, ademas el valor al ser la condicion menor que no se ejecutara nada.
*/