import java.util.ArrayList;
import java.util.Scanner; 

public class Main {

    public static void main(String[] args)
     {
        Scanner entrada = new Scanner (System.in);  

//Declarar Pokemones a usar y los metemos a una lista
ArrayList <Pokemon> pokedex = new ArrayList <Pokemon> ();
                // nombre,  numPokedex,  tipo,  PS,  ataque,  defensa,   velocidad
    /*0*/   Pokemon Squirtle = new Pokemon("Squirtle", 7,"agua", 44, 48, 65, 43);
            pokedex.add(Squirtle);
    /*1*/   Pokemon Arbok = new Pokemon("Arbok", 24, "veneno", 60, 95, 69, 80);
            pokedex.add(Arbok);
    /*2*/   Pokemon Vulpix = new Pokemon("Vulpix", 37, "fuego", 38, 41, 40, 65);
            pokedex.add(Vulpix);
    /*3*/   Pokemon Pikachu = new Pokemon("Pikachu", 25, "electrico",35, 55, 40, 90); 
            pokedex.add(Pikachu);
    /*4*/   Pokemon Nidorina = new Pokemon("Nidorina", 30, "veneno", 70, 62, 67, 56);
            pokedex.add(Nidorina);
    /*5*/   Pokemon Arcanine = new Pokemon("Arcanine", 59, "fuego",  90, 110, 80, 95);  
            pokedex.add(Arcanine);
    /*6*/   Pokemon Machamp = new Pokemon("Machamp", 68, "lucha", 90, 130, 80, 55); 
            pokedex.add(Machamp);
    /*7*/   Pokemon Voltorb = new Pokemon("Voltorb", 100, "electrico", 40, 30, 50, 100);  
            pokedex.add(Voltorb);
    /*8*/   Pokemon Ponyta = new Pokemon("Ponyta", 77, "fuego", 50, 85, 55, 90);  
            pokedex.add(Ponyta);
    /*9*/  Pokemon Mew = new Pokemon("Mew", 151,"psiquico", 100, 100, 100, 100);  
            pokedex.add(Mew);

//Declarar ataques
        // nombre,  tipo, PP,  potencia
        Ataque Placaje = new Ataque("Placaje", "normal", 35, 40);
        Ataque Latigo = new Ataque("Latigo", "normal", 30, 40);
        Ataque Burbuja = new Ataque("Burbuja", "agua", 30, 40);
        Ataque PistolaAgua = new Ataque("Pistola Agua", "agua", 25, 40);
        Ataque PicotazoVeneno = new Ataque("Picotazo Veneno", "veneno", 35, 15);
        Ataque ColmilloIgneo = new Ataque("Colmillo Igneo", "fuego", 15, 65);
        Ataque Mordisco = new Ataque("Mordisco", "Sinistro", 25, 60);
        Ataque ColmilloHielo = new Ataque("Colmillo Hielo", "hielo", 15, 65);
        Ataque Ascuas = new Ataque("Ascuas", "fuego", 25, 40);
        Ataque GiroFuego = new Ataque("Giro Fuego", "fuego", 15, 35);
        Ataque Impactrueno = new Ataque("Impactrueno", "electrico", 30, 40);
        Ataque AtaqueRapido = new Ataque("Ataque Rapido", "normal", 30, 40);
        Ataque Chispa = new Ataque("Chispa", "electrico", 20, 65);
        Ataque Arañazo = new Ataque("Arañazo", "normal", 35, 40);
        Ataque Derribo = new Ataque("Derribo", "normal", 20, 90);
        Ataque GolpeKarate = new Ataque("Golpe Karate", "lucha", 25, 50);
        Ataque FuerzaBruta = new Ataque("Fuerza Bruta", "lucha", 5, 120);
        Ataque Puntapie = new Ataque("Puntapie", "lucha", 20, 65);
        Ataque Explosion = new Ataque("Explosion", "normal", 5, 250);
        Ataque RayoCarga = new Ataque("Rayo carga", "electrico", 10, 50);
        Ataque Destructor = new Ataque("Destructor", "normal", 35, 40);
        Ataque MegaPuño = new Ataque("Mega Puño", "normal", 20, 80);
        Ataque Psiquico = new Ataque("Psiquico", "psiquico", 10, 90);
        Ataque EsferaAural = new Ataque("Esfera Aural", "lucha", 20, 80);
        Ataque Espabila = new Ataque("Espabila", "lucha", 10, 70);
        
        //Agregar movimientos a cada pokemon
        Squirtle.movimientos.add(Placaje); Squirtle.movimientos.add(Latigo); Squirtle.movimientos.add(Burbuja); Squirtle.movimientos.add(PistolaAgua);    
        Arbok.movimientos.add(PicotazoVeneno); Arbok.movimientos.add(ColmilloIgneo); Arbok.movimientos.add(Mordisco); Arbok.movimientos.add(ColmilloHielo);
        Vulpix.movimientos.add(Ascuas); Vulpix.movimientos.add(Latigo); Vulpix.movimientos.add(Placaje); Vulpix.movimientos.add(GiroFuego);
        Pikachu.movimientos.add(Impactrueno); Pikachu.movimientos.add(AtaqueRapido); Pikachu.movimientos.add(Latigo); Pikachu.movimientos.add(Chispa);
        Nidorina.movimientos.add(Arañazo); Nidorina.movimientos.add(Placaje); Nidorina.movimientos.add(Latigo); Nidorina.movimientos.add(PicotazoVeneno);
        Arcanine.movimientos.add(Mordisco); Arcanine.movimientos.add(Ascuas); Arcanine.movimientos.add(ColmilloIgneo); Arcanine.movimientos.add(Derribo);
        Machamp.movimientos.add(GolpeKarate); Machamp.movimientos.add(FuerzaBruta); Machamp.movimientos.add(Espabila); Machamp.movimientos.add(Puntapie);
        Voltorb.movimientos.add(Placaje); Voltorb.movimientos.add(Impactrueno); Voltorb.movimientos.add(Explosion); Voltorb.movimientos.add(RayoCarga); 
        Ponyta.movimientos.add(Ascuas); Ponyta.movimientos.add(Placaje); Ponyta.movimientos.add(Latigo); Ponyta.movimientos.add(AtaqueRapido);
        Mew.movimientos.add(Destructor); Mew.movimientos.add(MegaPuño); Mew.movimientos.add(Psiquico); Mew.movimientos.add(EsferaAural);
  
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

                //contador d cuantos pokemones han usado y si hubo cambio de poke
                
                int cambioPoke1 = 0;
                int cambioPoke2 = 0;

                Pokemon poke1Jugando = new Pokemon();
                Pokemon poke2Jugando = new Pokemon();
                
                //Elegir turno. //Genera numeros aleatorios de 1 al 2. 
                int turno = ((int)(Math.random()*1+1) ) ; 

                //mientras todavia ambos tengan pokemones 
                while (j1.pokebola.size() > 0 && j2.pokebola.size() > 0) 
                { 
                        if (cambioPoke1 == 0)
                        {
                                //Se elige el nombre del pokemon a jugar de la pokedex de cada jugador y se hace un nuevo pokemon con ese nombre
                                Pokemon turnJ1 = new Pokemon (j1.pokebola.get(0));
                                //System.out.println(  "Pokemon en j1.pokebola.get(0)" +turnJ1.getNombre());
                        
                                //Se busca en la pokedex EL Indice del pokemon que se llame asi.
                                int index1 = 0;
                                for (int i = 0; i < pokedex.size() ; i++) 
                                {
                                        Pokemon p = pokedex.get(i);
                                        if (p.getNombre().equals(turnJ1.getNombre()))
                                        {
                                                index1 = pokedex.indexOf(p);
                                                break;
                                        }
                                }
                                //Obtienes al pokemon de la pokedex 
                                Pokemon poke1Aux = pokedex.get(index1);

                                //Haces una copia de el, este es con el que se jugara
                                poke1Jugando = turnJ1.clonePoke(poke1Aux); 
                        }

                        if (cambioPoke2 == 0)
                        {
                                //Se elige el nombre del pokemon a jugar de la pokedex de cada jugador y se hace un nuevo pokemon con ese nombre
                                Pokemon turnJ2 = new Pokemon (j2.pokebola.get(0));
                                //System.out.println(  "Pokemon en j2.pokebola.get(0)" +turnJ2.getNombre());

                                //Se busca en la pokedex EL Indice del pokemon que se llame asi. Para J2
                                int index2 = 0;
                                for (int i = 0; i < pokedex.size() ; i++) 
                                {
                                        Pokemon p = pokedex.get(i);
                                        if (p.getNombre().equals(turnJ2.getNombre()))
                                        {
                                                index2 = pokedex.indexOf(p);
                                                break;
                                        }
                                }
                                //System.out.println("IndexAux2: "+index2);
                                //Obtienes al pokemon de la pokedex 
                                Pokemon poke2Aux = pokedex.get(index2);
                                //System.out.println("Poke2Aux: "+poke2Aux.getNombre());
                                
                                //Haces una copia de el, este es con el que se jugara
                                poke2Jugando = turnJ2.clonePoke(poke2Aux);
                                System.out.println("Poke2Jugando: "+poke2Jugando.getNombre());

                        }
                
                        int PSpoke1Init = poke1Jugando.getPS();
                        int PSpoke2Init = poke2Jugando.getPS();
                        //Mientras cada pokemon aun tenga vida 
                        while (poke1Jugando.getPS() > 0 && poke2Jugando.getPS() > 0 )
                        {     

                
                                //si int turno == 1 ataca pokemon1 del j1, si int turno == 2 ataca pokemon2 del j2
                                Ataque ataqueAux = new Ataque();
                                System.out.println("\n" + poke1Jugando.getNombre()+ " vs "+ poke2Jugando.getNombre());
                                if( turno == 1 )
                                {       
                                        System.out.println("\n" + j1.getNombre() + " es tu turno.");
                                        //Se selecciona el ataque que usara el pokemon.
                                        System.out.println("Elige un ataque para " + poke1Jugando.getNombre()+"\n");
                                        Ataque ataqueUsado = ataqueAux.clonarAtaque(poke1Jugando.ElegirAtaque());
                                        
                                        int danio =(int) poke1Jugando.hacerDaño (poke2Jugando, ataqueUsado);
                                        System.out.println("PDanio " + danio);
                                        poke2Jugando.setPS( poke2Jugando.getPS()- danio);
                                        System.out.println("PS de " + poke2Jugando.getNombre()+ " son: " +poke2Jugando.getPS()+"/"+PSpoke2Init);

                                        turno ++;

                                }
                                else 
                                {
                                        System.out.println("\n" + j2.getNombre() + " es tu turno."); 
                                        System.out.println("Elige un ataque para " + poke2Jugando.getNombre()+"\n");
                                        Ataque ataqueUsado = ataqueAux.clonarAtaque(poke2Jugando.ElegirAtaque());
                                        
                                        int danio =(int) poke2Jugando.hacerDaño (poke1Jugando, ataqueUsado);
                                        System.out.println("PDanio " + danio);

                                        poke1Jugando.setPS( poke1Jugando.getPS() - danio);
                                        System.out.println("PS de " + poke1Jugando.getNombre()+ " son: " +poke1Jugando.getPS()+"/"+PSpoke1Init);

                                
                                        turno --;
                                
                                }
                        }
                        //si se acaba la vida de algun pokemon, se quita de la lista de la pokebola del jugador y se pasa al siguiente pokemon
                        if (poke1Jugando.getPS() <= 0)
                        {
                                j1.pokebola.remove(0);
                                System.out.println("Oh No!! " + poke1Jugando.getNombre() +" hasta la proxima");
                                //indicadores de si se tiene que hacer una nueva copia de un pokemon o no. 0 es si, porque perdio, 1 es no para que siga siendo el mismo pokemon.
                                cambioPoke1 = 0;
                                cambioPoke2 = 1;
                                
                                
                        }
                        else if (poke2Jugando.getPS() <= 0)
                        {       
                                j2.pokebola.remove(0);
                                System.out.println("Oh No!!! " + poke2Jugando.getNombre() +" hasta la proxima");
                                cambioPoke1 = 1; //1 no crea un nuevo objeto
                                cambioPoke2 = 0; // 0 Si lo hace. 
                        
                        }
                }

                //Si j1 perdio, aumenta una derrota y  j2 aumenta una vistoria,Si no, alreves.
                if (j1.pokebola.size() == 0)
                {
                        j2.victoria ++;
                        j1.derrota ++;
                        System.out.println(j2.getNombre() + " Felicidades! Eres el ganador");
                }
                else{
                        j2.derrota ++;
                        j1.victoria ++;
                        System.out.println(j1.getNombre() + " Felicidades! Eres el ganador");
                }
                entrada.close();
        }


}
