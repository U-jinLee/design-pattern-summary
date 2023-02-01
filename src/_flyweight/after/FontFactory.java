package _flyweight.after;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private static final Map<String, Font> cache = new HashMap<>();


    public static Font getFont(String font) {
        if(cache.containsKey(font)) {
            System.out.println(cache.get(font).getSize()+" "+ cache.get(font).getFamily());
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            System.out.println("-------새로운 값 추가--------");
            return newFont;
        }
    }
}
