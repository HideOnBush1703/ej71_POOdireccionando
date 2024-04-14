
package Direccionando;

    public class Movimiento {
    
    //Atributos 
    private int ejeX;
    private int ejeY;
    
    //Métodos
    //Método constructor 
    public Movimiento(int ejeX, int ejeY) {
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }
    //Método para subir una unidad
    public void moverArriba(){
        ejeY=ejeY+1;
        System.out.println("Direccion hacia adelante:");
        System.out.println("Posicion: ("+ejeX+" ; "+ejeY+")");   
    }
    //Método para bajar una unidad
    public void moverAbajo(){
        ejeY=ejeY-1;
        System.out.println("Direccion hacia abajo:");
        System.out.println("Posicion: ("+ejeX+" ; "+ejeY+")");
    }
    //Método para mover derecha una unidad
    public void moverDerecha(){
        ejeX=ejeX+1;
        System.out.println("Direccion hacia derecha:");
        System.out.println("Posicion: ("+ejeX+" ; "+ejeY+")");
    }
    //Método para mover izquierda una unidad
    public void moverIzquierda(){
        ejeX=ejeX-1;
        System.out.println("Direccion hacia izquierda:");
        System.out.println("Posicion: ("+ejeX+" ; "+ejeY+")");
    }
    //Método para salir(E) dejando un mensaje
    public void Salir(){
        System.out.println("Saliste del juego");
    }
    
    //Lo usé únicamente para retornar y mostrar mis valores al inicio, igual getEjeY
    public int getEjeX(){
        return ejeX;
    }
    
    public int getEjeY(){
        return ejeY;
    }   
}


