public class Ataque implements Cloneable{
    
    String nombre; 
    String tipo;
    int PP; //puntos de poder
    int potencia;
   

    //constructor
    public Ataque (String nombre, String tipo,int PP, int potencia)
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.PP = PP;
        this.potencia = potencia; 
    }

    public Ataque()
    {

    }

    //Setters
    public void setPP (int PP) {this.PP = PP;}


    //Getters
    public String getNombre () {return nombre;}
    public String getTipo () {return tipo;}
    public int getPP () {return PP;}
    public int getPotencia () {return potencia;}
    
    public Ataque clonarAtaque (Ataque ataqueAClonar)
    {
        Ataque copiaAtaque = null;
        try {
            copiaAtaque = (Ataque)ataqueAClonar.clone();
        } catch (Exception e) {
            System.out.println("NO se pudo clonar");
        }
        return copiaAtaque;
    }
}
