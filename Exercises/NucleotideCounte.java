import java.util.HashMap;
import java.util.Map;

class NucleotideCounter {

  private final Map<Character, Integer> nucleotideCounts = new HashMap<>() {{
    put('A', 0);
    put('C', 0);
    put('G', 0);
    put('T', 0);
  }};

  public NucleotideCounter(String dna) {
    dna.chars()
        .mapToObj(c -> (char) c)
        .forEach(c -> {
          if (nucleotideCounts.containsKey(c)) {
            nucleotideCounts.put(c, nucleotideCounts.get(c) + 1);
          } else {
            throw new IllegalArgumentException();
          }
        });
  }

  public Map<Character, Integer> nucleotideCounts() {
    return nucleotideCounts;
  }
}
