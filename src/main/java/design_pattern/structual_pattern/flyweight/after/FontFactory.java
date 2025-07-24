package design_pattern.structual_pattern.flyweight.after;

import java.util.HashMap;
import java.util.Map;

// Font(공통부문) 이 제대로 됐는지 검증해주는 역할
public class FontFactory {
    private Map<String,Font> cache = new HashMap<>();

    public Font getFont(String font){
        if (cache.containsKey(font)){
            return cache.get(font);
        }else{
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }
}
