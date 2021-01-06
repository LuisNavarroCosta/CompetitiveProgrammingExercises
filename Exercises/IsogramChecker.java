import java.util.HashSet;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        var chars = new HashSet<Character>();
        for (var c : phrase.toCharArray()) {
            var ch = Character.toLowerCase(c);
            if (!Character.isWhitespace(ch) && c != '-' && chars.contains(ch)) {
                return false;
            }
            chars.add(ch);
        }
        return true;
    }

}
