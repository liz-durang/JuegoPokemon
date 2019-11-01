import java.util.ArrayList;
public class Ataque {
    
    String nombre; 
    String tipo;
    int PP; //puntos de poder
    int potencia;
    int nivel; 

    //constructor
    public Ataque (String nombre, String tipo,int PP, int potencia, int nivel)
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.PP = PP;
        this.potencia = potencia; 
        this.nivel = nivel;
    }

    //Setters
    public void setPP (int PP) {this.PP = PP;}


    //Getters
    public String getNombre () {return nombre;}
    public String getTipo () {return tipo;}
    public int getPP () {return PP;}
    public int getPotencia () {return potencia;}
    

   
  

}