import java.util.*;

class ResistorColor {
    HashMap<String, Integer> colorEncoding;

    public ResistorColor() {
        colorEncoding = new HashMap<>();
        colorEncoding.put("black", 0);
        colorEncoding.put("brown", 1);
        colorEncoding.put("red", 2);
        colorEncoding.put("orange", 3);
        colorEncoding.put("yellow", 4);
        colorEncoding.put("green", 5);
        colorEncoding.put("blue", 6);
        colorEncoding.put("violet", 7);
        colorEncoding.put("grey", 8);
        colorEncoding.put("white", 9);
    }

    int colorCode(String color) {
        return colorEncoding.get(color);
    }

    String[] colors() {
        String[] key = new String[colorEncoding.size()];

        for (Map.Entry<String, Integer> mapEntry : colorEncoding.entrySet()) {
            key[mapEntry.getValue()] = mapEntry.getKey();
        }

        return key;
    }
}
