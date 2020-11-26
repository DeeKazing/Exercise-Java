import java.util.HashMap;
import java.util.Map;

class ResistorColor {

    int colorCode(String color) {
        Map<String, Integer> resistors = new HashMap<>();
        resistors.put("black", 0);
        resistors.put("brown", 1);
        resistors.put("red", 2);
        resistors.put("orange",3);
        resistors.put("yellow",4);
        resistors.put("green", 5);
        resistors.put("blue", 6);
        resistors.put("violet", 7);
        resistors.put("grey",8);
        resistors.put("white",9);
        return resistors.get(color);
    }

    String[] colors() {
        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return colors;
    }
}
