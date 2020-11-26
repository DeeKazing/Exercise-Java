import java.util.HashMap;
import java.util.Map;

class ResistorColorDuo {
    int value(String[] colors) {
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
        int c = Integer.parseInt(String.valueOf(resistors.get(colors[0])+""+resistors.get(colors[1])));
    return c;
    }

}
