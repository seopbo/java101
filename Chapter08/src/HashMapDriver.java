import java.util.HashMap;

public class HashMapDriver {
    public static void main(String[] args) {
        HashMap<String, Poketmon> pokedex = new HashMap<>();
        pokedex.put("피카츄", new Poketmon("피카츄"));
        pokedex.put("파이리", new Poketmon("파이리"));
        pokedex.put("이상해씨", new Poketmon("이상해씨"));
        pokedex.put("이상해풀", new Poketmon("이상해풀"));
        pokedex.put("이상해꽃", new Poketmon("이상해꽃"));

        Poketmon pikachu = pokedex.get("피카츄");
        pokedex.put("피카츄", new Poketmon("라이츄"));

        for (String key: pokedex.keySet()) {
            System.out.println(pokedex.get(key).name);
        }
    }
}
