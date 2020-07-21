/*
 * Run program to find a pokemon!
 * I used Factory and Delegation
 *
 * Factory was used to define class of an object at runtime
 * so object is encapsulagtted and object creation code
 * is in one place
 *
 * Delegate invokes a piece of code that isnt known at
 * runtime.
 */
package project01;
import java.util.Scanner;

/**
 *
 * @author AshleyRoselius
 */
public class Project01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PokemonFactory.Pokemon();
    }
    
}
