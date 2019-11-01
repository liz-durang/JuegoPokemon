import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner; 

public class Main {

    public static void main(String[] args)
     {
        Scanner entrada = new Scanner (System.in);  

//Declarar Pokemones a usar y los metemos a una lista
ArrayList <Pokemon> pokedex = new ArrayList <Pokemon> ();
                // nombre,  numPokedex,  tipo,  PS,  ataque,  defensa,   velocidad
    /*1*/   Pokemon Squirtle = new Pokemon("Squirtle", 7,"agua", 44, 48, 65, 43);
            pokedex.add(Squirtle);
    /*2*/   Pokemon Arbok = new Pokemon("Arbok", 24, "veneno", 60, 95, 69, 80);
            pokedex.add(Arbok);
    /*3*/   Pokemon Vulpix = new Pokemon("Vulpix", 37, "fuego", 38, 41, 40, 65);
            pokedex.add(Vulpix);
    /*4*/   Pokemon Pikachu = new Pokemon("Pikachu", 25, "electrico",35, 55, 40, 90); 
            pokedex.add(Pikachu);
    /*5*/   Pokemon Nidorina = new Pokemon("Nidorina", 30, "veneno", 70, 62, 67, 56);
            pokedex.add(Nidorina);
    /*6*/   Pokemon Arcanine = new Pokemon("Arcanine", 59, "fuego",  90, 110, 80, 95);  
            pokedex.add(Arcanine);
    /*7*/   Pokemon Machamp = new Pokemon("Machamp", 68, "lucha", 90, 130, 80, 55); 
            pokedex.add(Machamp);
    /*8*/   Pokemon Voltorb = new Pokemon("Voltorb", 100, "electrico", 40, 30, 50, 100);  
            pokedex.add(Voltorb);
    /*9*/   Pokemon Ditto = new Pokemon("Ditto", 132, "normal", 48, 48, 48, 48);  
            pokedex.add(Ditto);
    /*10*/  Pokemon Mew = new Pokemon("	Mew", 151,"psiquico", 100, 100, 100, 100);  
            pokedex.add(Mew);

//Declarar ataques
        // nombre,  tipo, PP,  potencia,nivel
        Ataque Placaje = new Ataque("Placaje", "normal", 35, 40, 1);
        Ataque Latigo = new Ataque("Latigo", "normal", 30, 40, 1);
        Ataque Burbuja = new Ataque("Burbuja", "agua", 30, 40, 8);
        Ataque 





  
        //Cuando 2 entrenadores se encuentran... 

        Jugador j1 = new Jugador (); 
        System.out.print( "Jugador 1. Ingresa tu nombre: ");
        String name1 = entrada.nextLine ();
        j1.setNombre(name1);

        Jugador j2 = new Jugador(); 
        System.out.print("Jugador 2. Ingresa tu nombre: ");
        String name2 = entrada.nextLine ();
        j2.setNombre(name2);

        //seleccionar equipo 
        j1.ArmarPokebola(pokedex);
        j2.ArmarPokebola(pokedex);

        //elegir Pokemon con el que se iniciara
        j1.ElegirPokemon();
        j2.ElegirPokemon();


        //Inicia la batalla
        //mientras todavia ambos tengan pokemones 
        //while (j1.pokebola.size() > 0 && j2.pokebola.size() > 0) 
        //{
                //Elegir turno. 
                //Genera numeros aleatorios de 1 al 10. Si es un numero mayor o igual que 5 es turno de J1, si no, es turno de J2
                if( (int)(Math.random()*10+1) >= 5 )
                {
                        System.out.println(j1.getNombre() + " es tu turno.");
                }
                else 
                {
                        System.out.println(j2.getNombre() + " es tu turno."); 
                }


                //Se elige el nombre del pokemon a jugar de la pokedex de cada jugador y se hace un nuevo pokemon con ese nombre
                Pokemon turnJ1 = new Pokemon (j1.pokebola.remove(0));
                Pokemon turnJ2 = new Pokemon (j2.pokebola.remove(0));
               
                
                //Se busca en la pokedex EL Indice del pokemon que se llame asi. Para J1
                int index = 0;
                for (int i = 0; i < pokedex.size() ; i++) 
                {
                        Pokemon p = pokedex.get(i);
                        if (p.getNombre().equals(turnJ1.getNombre()))
                        {
                                index = pokedex.indexOf(p);
                                break;
                        }
                }
                //Obtienes al pokemon de la pokedex 
                Pokemon poke1Aux = pokedex.get(index);

                 //Se busca en la pokedex EL Indice del pokemon que se llame asi. Para J2
                for (int i = 0; i < pokedex.size() ; i++) 
                {
                        Pokemon p = pokedex.get(i);
                        if (p.getNombre().equals(turnJ1.getNombre()))
                        {
                                index = pokedex.indexOf(p);
                                break;
                        }
                }
                //Obtienes al pokemon de la pokedex 
                Pokemon poke2Aux = pokedex.get(index);

                //Haces una copia de el, este es con el que se jugara
                Pokemon poke1Jugando = turnJ1.ClonePoke(poke1Aux);
                Pokemon poke2Jugando = turnJ2.ClonePoke(poke2Aux);

                //Mientras cada pokemon aun tenga vida 
                while (poke1Jugando.getPS() > 0 && poke2Jugando.getPS() > 0 )
                {

                        
                }

     



        
        //}



        entrada.close();
    }


}


