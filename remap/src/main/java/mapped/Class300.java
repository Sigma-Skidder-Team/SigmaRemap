// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public enum Class300
{
    field1718('0', "black"), 
    field1719('1', "dark_blue"), 
    field1720('2', "dark_green"), 
    field1721('3', "dark_aqua"), 
    field1722('4', "dark_red"), 
    field1723('5', "dark_purple"), 
    field1724('6', "gold"), 
    field1725('7', "gray"), 
    field1726('8', "dark_gray"), 
    field1727('9', "blue"), 
    field1728('a', "green"), 
    field1729('b', "aqua"), 
    field1730('c', "red"), 
    field1731('d', "light_purple"), 
    field1732('e', "yellow"), 
    field1733('f', "white"), 
    field1734('k', "obfuscated"), 
    field1735('l', "bold"), 
    field1736('m', "strikethrough"), 
    field1737('n', "underline"), 
    field1738('o', "italic"), 
    field1739('r', "reset");
    
    public static final char field1740 = '§';
    public static final String field1741 = "0123456789AaBbCcDdEeFfKkLlMmNnOoRr";
    public static final Pattern field1742;
    private static final Map<Character, Class300> field1743;
    private final char field1744;
    private final String field1745;
    private final String field1746;
    
    Class300(final char field1744, final String field1745) {
        this.field1744 = field1744;
        this.field1746 = field1745;
        this.field1745 = new String(new char[] { '§', field1744 });
    }
    
    @Override
    public String toString() {
        return this.field1745;
    }
    
    public static String method954(final String input) {
        if (input != null) {
            return Class300.field1742.matcher(input).replaceAll("");
        }
        return null;
    }
    
    public static String method955(final char c, final String s) {
        final char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length - 1; ++i) {
            if (charArray[i] == c) {
                if ("0123456789AaBbCcDdEeFfKkLlMmNnOoRr".indexOf(charArray[i + 1]) > -1) {
                    charArray[i] = '§';
                    charArray[i + 1] = Character.toLowerCase(charArray[i + 1]);
                }
            }
        }
        return new String(charArray);
    }
    
    public static Class300 method956(final char c) {
        return Class300.field1743.get(c);
    }
    
    public String method957() {
        return this.field1746;
    }
    
    static {
        field1742 = Pattern.compile("(?i)" + '§' + "[0-9A-FK-OR]");
        field1743 = new HashMap<Character, Class300>();
        for (final Class300 class300 : values()) {
            Class300.field1743.put(class300.field1744, class300);
        }
    }
}
