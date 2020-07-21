/*
 * Delegates actual pokemon creation to other classes
 */
package project01;

/**
 *
 * @author AshleyRoselius
 */
public class PokemonType implements WildPokemon {
    WildPokemon pokemon;
    
    public PokemonType(WildPokemon pokemon) {
        this.pokemon = pokemon;
    }
    
    @Override
    public void Type() {
        pokemon.Type();
    }
}
