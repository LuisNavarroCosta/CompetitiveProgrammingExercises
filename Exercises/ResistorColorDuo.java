
import java.util.Map;

class ResistorColorDuo {
    private final Map<String, Integer> colorToCode = Map.of(
        "black", 0,
        "brown", 1,
        "red", 2,
        "orange", 3,
        "yellow", 4,
        "green", 5,
        "blue", 6,
        "violet", 7,
        "grey", 8,
        "white", 9
    );

    int value(String[] colors) {
        var digit1 = colorToCode.get(colors[0]);
        var digit2 = colorToCode.get(colors[1]);
        return digit1 * 10 + digit2;
    }
}
