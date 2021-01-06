import java.util.HashSet;

public class PangramChecker {

    public boolean isPangram(String input) {
        HashSet<Character> alphabet = new HashSet<>();

        for(Character c : input.toCharArray()) {
            if(Character.isLetter(c)) {
                alphabet.add(Character.toLowerCase(c));
            }
        }        

        return alphabet.size() == 26;
    }

}