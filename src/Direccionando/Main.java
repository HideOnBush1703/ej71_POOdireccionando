
package Direccionando;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args){
        
            Movimiento objeto = new Movimiento(0,0); //Dando argumentos al constructor (ejex=0, ejey=0)
            
            char proxiMov='0'; //inicializando la variable, para comenzar con el juego sin problemas, ayudin
          
            System.out.println("Tu posicion inicial es ("+objeto.getEjeX()+" ; "+objeto.getEjeY()+")");//La posición inicial es (0,0)
           
            while(proxiMov!='E'){ //Bucle para continuar el juego hasta que se decida finalizarlo
              
            //Para evitar problemas a la hora de digitar el movimiento, pero si se dicta correctamente se salta al switch
            do{   
            proxiMov=Character.toUpperCase(JOptionPane.showInputDialog("DIGITE EL MOVIMIENTO QUE QUIERE REALIZAR\nDigite 'W' para arriba\nDigite 'S' para abajo\nDigite 'A' para la izquierda\nDigite 'D' para la derecha\nDigite 'E' para salir del juego").charAt(0));
                
            }while((proxiMov != 'W')&& (proxiMov != 'S') && (proxiMov != 'A') && (proxiMov != 'D') && (proxiMov !='E')); //solo permite presionar lo que se debe
            
            //instanciando los métodos de la clase Movimiento
            switch(proxiMov){
                case 'W':
                    objeto.moverArriba();
                    break;
                case 'S':
                    objeto.moverAbajo();
                    break;
                case 'D': 
                    objeto.moverDerecha();
                    break;
                case 'A':
                    objeto.moverIzquierda();
                    break;
                case 'E':
                    objeto.Salir();
                    break;
                
                default: System.out.println("Movimiento no reconocido"); //No es necesario, ya se cubrieron muchos casos.
                
                System.out.println("Haz la prueba 2");
                   
            }
            }
     
            
    }   
}