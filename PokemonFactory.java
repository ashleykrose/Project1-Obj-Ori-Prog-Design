/*
 * This is a factory class that creates pokemon
 * This is the only place that modifications need to be made.
 */
package project01;
import java.util.Random;

/**
 *
 * @author AshleyRoselius
 */
public class PokemonFactory {
    //this is ship factory class
    public static void Pokemon() {
        Random random = new Random();
        int i = random.nextInt(4);
        String[] pokemonTypeArray = {"F", "W", "G", "E"};
        String type = pokemonTypeArray[i];
        
        //delegating pokemon typing to other classes
        if(type.equals("F")) {
            PokemonType pokemon = new PokemonType(new FireType());
            pokemon.Type();
        } else if(type.equals("W")){
            PokemonType pokemon = new PokemonType(new WaterType());
            pokemon.Type();
        } else if(type.equals("G")){
            PokemonType pokemon = new PokemonType(new GrassType());
            pokemon.Type();
        } else if(type.equals("E")){
            PokemonType pokemon = new PokemonType(new ElectricType());
            pokemon.Type();
        }
    }
}
