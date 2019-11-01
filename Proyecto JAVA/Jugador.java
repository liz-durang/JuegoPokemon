import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner; 

public class Jugador {

    public String nombre;
    ArrayList <String> pokebola= new ArrayList <String> ();

    Scanner entrada = new Scanner (System.in);  
    int victorias = 0; 
    int derrotas = 0;

    //constructor 

    public Jugador ()
    {
    }

    //setters
    public void setNombre(String nombre)
    {
        this.nombre = nombre; 
    }

    //getters 
    public String getNombre ()
    {
        return nombre;
    }

    //Elegir 6 pokemones por jugador 

    public void ArmarPokebola(ArrayList <Pokemon> pokedex)
    {
        System.out.println("\nHola  " + nombre + "!! ");

        System.out.println("Antes de iniciar,debes elegir 6 Pokemones.\n");

        //mostrar Pokemones disponibles, seleccionarlos y agregarlos al jugador. 

       for (Pokemon pokemon : pokedex) 
        {    
           System.out.print ( pokemon.getNombre() + "    ");  
        }    

        for (int i = 1; i < 7; i++) 
        {   
        System.out.print ("\n\nIngresa el nombre del Pokemon" + i + " --> ");
            String namePoke = entrada.nextLine (); 
            pokebola.add(namePoke);
        }

       
    }

    public void ElegirPokemon ()
    {
        //imprimir los pokemon y se seleccionara con el que se iniciara, 
        //poniendo con el que se iniciara al inicio de la lista
        System.out.println( "\n" + nombre + " elige el Pokemon con el que iniciaras \n");

        for (String pokemon : pokebola) 
        {
            System.out.print (pokemon + "  ");
        }
        int bandera = 0; 
        while (bandera == 0) 
        {
        System.out.print("\n---> ");
        
        String name = entrada.nextLine ();
        
            if (pokebola.contains(name))
            {
                bandera = 1 ;

                String auxPoke = pokebola.get(0); //obtiene el nombre del primer pokemon en la lista
                int auxIndex = pokebola.indexOf(name); //obtiene el indice en donde se encuentra actualmente el pokemon con el que se iniciara
                pokebola.set(0, name); //el pokemon elegido se pone en primer lugar
                pokebola.set(auxIndex,auxPoke); //el pokemon que estaba en primer lugar se pasa al lugar del pokemon elegido. 
              
                System.out.println("Perfecto, continuemos.");
            }
            else
            {
                System.out.print("Ese pokemon no es parte de tu equipo. Intenta de nuevo");
                bandera = 0;
            }
        }
        
    }

 
    
}