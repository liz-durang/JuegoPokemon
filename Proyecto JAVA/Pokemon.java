import java.util.ArrayList;
import java.util.Iterator;

public class Pokemon implements Cloneable{

    public int PS; //puntos de salud  
    public int ataque; 
    public int defensa; 
    public int numPokedex;
    public int velocidad; 
    public String tipo; 
    public String nombre; 

    ArrayList <Ataque> movimientos = new ArrayList <Ataque> ();
    

    //constructor
    public Pokemon (String nombre, int numPokedex, String tipo, int PS, int ataque, int defensa,  int velocidad)
    {
        this.nombre = nombre; 
        this.numPokedex = numPokedex;
        this.tipo = tipo;
        this.PS = PS; 
        this.ataque= ataque; 
        this.defensa = defensa;
        this.velocidad = velocidad; 
    }

    public Pokemon (String name)
    {
       this.nombre = name;
    }

    public Pokemon(){}


    //Setters
    public void setPS (int PS) {this.PS = PS;}
    public void setAtaque (int ataque) {this.ataque = ataque;}
    public void setDefensa (int defensa) {this.defensa = defensa;}

    //getters
    public String getNombre () {return nombre;}
    public int getNumPokedex () {return numPokedex;}
    public String getTipo () {return tipo;}
    public int getPS () {return PS;}
    public int getAtaque () {return ataque;}
    public int getDefensa () {return defensa;}

    public Pokemon ClonePoke (Pokemon pokeAClonar)
    {
        Pokemon copiaPoke = null;
        try {
           copiaPoke = (Pokemon)pokeAClonar.clone();
        }catch (CloneNotSupportedException ex)
        {
            System.out.println("NO se pudo clonar");
        }

        return copiaPoke;
    }

    public String toString()
    {
    
        return  nombre; 
    }

    
    

}
