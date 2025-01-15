// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.Map;

public enum Class2116
{
    field12309("BLACK", '0', 0, Integer.valueOf(0)), 
    field12310("DARK_BLUE", '1', 1, Integer.valueOf(170)), 
    field12311("DARK_GREEN", '2', 2, Integer.valueOf(43520)), 
    field12312("DARK_AQUA", '3', 3, Integer.valueOf(43690)), 
    field12313("DARK_RED", '4', 4, Integer.valueOf(11141120)), 
    field12314("DARK_PURPLE", '5', 5, Integer.valueOf(11141290)), 
    field12315("GOLD", '6', 6, Integer.valueOf(16755200)), 
    field12316("GRAY", '7', 7, Integer.valueOf(11184810)), 
    field12317("DARK_GRAY", '8', 8, Integer.valueOf(5592405)), 
    field12318("BLUE", '9', 9, Integer.valueOf(5592575)), 
    field12319("GREEN", 'a', 10, Integer.valueOf(5635925)), 
    field12320("AQUA", 'b', 11, Integer.valueOf(5636095)), 
    field12321("RED", 'c', 12, Integer.valueOf(16733525)), 
    field12322("LIGHT_PURPLE", 'd', 13, Integer.valueOf(16733695)), 
    field12323("YELLOW", 'e', 14, Integer.valueOf(16777045)), 
    field12324("WHITE", 'f', 15, Integer.valueOf(16777215)), 
    field12325("OBFUSCATED", 'k', true), 
    field12326("BOLD", 'l', true), 
    field12327("STRIKETHROUGH", 'm', true), 
    field12328("UNDERLINE", 'n', true), 
    field12329("ITALIC", 'o', true), 
    field12330("RESET", 'r', -1, (Integer)null);
    
    private static final Map<String, Class2116> field12331;
    private static final Pattern field12332;
    private final String field12333;
    private final char field12334;
    private final boolean field12335;
    private final String field12336;
    private final int field12337;
    private final Integer field12338;
    
    private static String method8251(final String s) {
        return s.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
    }
    
    private Class2116(final String s2, final char c, final int n2, final Integer n3) {
        this(s2, c, false, n2, n3);
    }
    
    private Class2116(final String s2, final char c, final boolean b) {
        this(s2, c, b, -1, null);
    }
    
    private Class2116(final String field12333, final char c, final boolean field12334, final int field12335, final Integer field12336) {
        this.field12333 = field12333;
        this.field12334 = c;
        this.field12335 = field12334;
        this.field12337 = field12335;
        this.field12338 = field12336;
        this.field12336 = "§" + c;
    }
    
    public static String method8252(final String s) {
        final StringBuilder sb = new StringBuilder();
        int index = -1;
        final int length = s.length();
        while ((index = s.indexOf(167, index + 1)) != -1) {
            if (index >= length - 1) {
                continue;
            }
            final Class2116 method8262 = method8262(s.charAt(index + 1));
            if (method8262 == null) {
                continue;
            }
            if (method8262.method8257()) {
                sb.setLength();
            }
            if (method8262 == Class2116.field12330) {
                continue;
            }
            sb.append(method8262);
        }
        return sb.toString();
    }
    
    public int method8253() {
        return this.field12337;
    }
    
    public boolean method8254() {
        return this.field12335;
    }
    
    public boolean method8255() {
        return !this.field12335 && this != Class2116.field12330;
    }
    
    @Nullable
    public Integer method8256() {
        return this.field12338;
    }
    
    public boolean method8257() {
        return !this.field12335;
    }
    
    public String method8258() {
        return this.name().toLowerCase(Locale.ROOT);
    }
    
    @Override
    public String toString() {
        return this.field12336;
    }
    
    @Nullable
    public static String method8259(final String input) {
        return (input != null) ? Class2116.field12332.matcher(input).replaceAll("") : null;
    }
    
    @Nullable
    public static Class2116 method8260(final String s) {
        return (s != null) ? Class2116.field12331.get(method8251(s)) : null;
    }
    
    @Nullable
    public static Class2116 method8261(final int n) {
        if (n >= 0) {
            for (final Class2116 class2116 : values()) {
                if (class2116.method8253() == n) {
                    return class2116;
                }
            }
            return null;
        }
        return Class2116.field12330;
    }
    
    @Nullable
    public static Class2116 method8262(final char c) {
        final char char1 = Character.toString(c).toLowerCase(Locale.ROOT).charAt(0);
        for (final Class2116 class2116 : values()) {
            if (class2116.field12334 == char1) {
                return class2116;
            }
        }
        return null;
    }
    
    public static Collection<String> method8263(final boolean b, final boolean b2) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class2116 class2116 : values()) {
            if (!class2116.method8255() || b) {
                if (!class2116.method8254() || b2) {
                    arrayList.add(class2116.method8258());
                }
            }
        }
        return arrayList;
    }
    
    static {
        field12331 = Arrays.stream(values()).collect(Collectors.toMap(class2116 -> method8251(class2116.field12333), class2117 -> class2117));
        field12332 = Pattern.compile("(?i)§[0-9A-FK-OR]");
    }
}
