package me.whiteship.designpatterns._02_structural_patterns._11_flyweight._02_after;

import java.util.HashMap;
import java.util.Map;

// Font 라는 객체를 캐싱하게 해주는 클래스
// 플라이웨이트 패턴에 해당함
// 인스턴스를 만이 만들 때 사용할 수 있음
public class FontFactory {

    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }
}
