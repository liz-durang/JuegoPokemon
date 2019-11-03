import java.util.ArrayList;
import java.util.Scanner;
public class Pokemon implements Cloneable{

    private int PS; //puntos de salud  
    private int ataque; 
    private int defensa; 
    private int numPokedex;
    private int velocidad; 
    private String tipo; 
    private String nombre; 

    Scanner entrada = new Scanner (System.in);  
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

    public Pokemon clonePoke (Pokemon pokeAClonar)
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

    @Override
    public String toString()
    {
    
        return  nombre; 
    }


    public Ataque ElegirAtaque()
    {
        //imprimir los ataques del pokemon 
        //regresa elnombre del ataque
        Ataque ataqueElegido = new Ataque();
        for (Ataque ataque : this.movimientos) 
        {
            System.out.print (ataque.getNombre() + "  ");
        }
        int bandera = 0; 
        while (bandera == 0) 
        {
            System.out.print("\n---> ");
            String name = entrada.nextLine ();
            //se seleccionara con el que se jugara.
            for (Ataque ataque : this.movimientos) 
            {
                if (ataque.getNombre().equals(name))
                {
                    ataqueElegido = ataque; 
                    bandera = 1;
                    break;
                }
            }
        }
        return ataqueElegido; 
    }



    public double hacerDaño (Pokemon pokeDefensa, Ataque ataqueUsado)
    {
        //Bonificacion
        double B = 0; 
        if (ataqueUsado.getTipo().equals(this.tipo))
        {
            B = 1.5;
        }
        else{
            B = 1; 
        }

        System.out.println("\n B es: "+B);

        //Efectividad 
        double E  ;
        int random = ((int)(Math.random()*6+1) ) ; 
        if (random == 0) {E = 0;} 
        else if (random == 1){E = 0.25;}
        else if (random == 2){E = 0.5;}
        else if (random == 3) { E = 1;}
        else if (random == 4){E = 2;}
        else{E = 4;}

        System.out.println("\n E es: "+E);

        //Variacion //random()*cantidad de numeros en el rango + termino inicial del rango
        double V = ((int)(Math.random()*15+85)); 

        System.out.println("\n V es: "+V);

        //Cantidad Ataque
        double A = this.ataque;

        System.out.println("\n A es: "+A);

        //Potencial del ataque 
        double P = ataqueUsado.getPotencia();

        System.out.println("\n P es: "+P);
         
        //Defensa
        double D = pokeDefensa.defensa;

        System.out.println("\nD es: "+D);


        double daño = (0.01*B*E*V)*(    (((0.2*1)+1)*A*P)    / (25*D)  +2);

        return daño; 
    }
    

}
