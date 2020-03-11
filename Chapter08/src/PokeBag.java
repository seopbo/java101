import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {
    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();

    public ArrayList<Pokemon> getPokemons(String name) {
        return this.pokemons.get(name);
    }

    public void add(Pokemon pokemon) {
        if (this.getPokemons(pokemon.name) == null) {
            this.pokemons.put(pokemon.name, new ArrayList<>());
        }
        this.getPokemons(pokemon.name).add(pokemon);
    }

    public Pokemon getStrongest(String name) {
        if (this.getPokemons(name) == null){
            return null;
        }

        int maxIndex = 0;
        int maxCp = 0;
        ArrayList<Pokemon> pokemonList = this.getPokemons(name);

        for (int index = 0; index < pokemonList.size(); index++) {
            Pokemon pokemon = pokemonList.get(index);
            if (pokemon.cp >= maxCp) {
                maxIndex = index;
                maxCp = pokemon.cp;
            }
        }
      return pokemonList.get(maxIndex);
    }

    public Pokemon getStrongest() {
        ArrayList<Pokemon> pokemonList = new ArrayList<>();
        int maxIndex = 0;
        int maxCp = 0;

        for (String key: this.pokemons.keySet()){
            pokemonList.add(this.getStrongest(key));
        }

        for (int index = 0; index < pokemonList.size(); index++) {
            Pokemon pokemon = pokemonList.get(index);
            if (pokemon.cp >= maxCp) {
                maxIndex = index;
                maxCp = pokemon.cp;
            }
        }
        return pokemonList.get(maxIndex);
    }
}
