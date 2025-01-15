// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import java.util.function.Supplier;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Random;
import javax.annotation.Nullable;
import java.util.Locale;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import java.util.Map;

public enum Class179 implements Class103
{
    field511(0, 1, -1, "down", Class288.field1602, Class111.field352, new Class352(0, -1, 0)), 
    field512(1, 0, -1, "up", Class288.field1601, Class111.field352, new Class352(0, 1, 0)), 
    field513(2, 3, 2, "north", Class288.field1602, Class111.field353, new Class352(0, 0, -1)), 
    field514(3, 2, 0, "south", Class288.field1601, Class111.field353, new Class352(0, 0, 1)), 
    field515(4, 5, 1, "west", Class288.field1602, Class111.field351, new Class352(-1, 0, 0)), 
    field516(5, 4, 3, "east", Class288.field1601, Class111.field351, new Class352(1, 0, 0));
    
    private final int field517;
    private final int field518;
    private final int field519;
    private final String field520;
    private final Class111 field521;
    private final Class288 field522;
    private final Class352 field523;
    public static final Class179[] field524;
    private static final Map<String, Class179> field525;
    public static final Class179[] field526;
    private static final Class179[] field527;
    private static final Long2ObjectMap<Class179> field528;
    
    private Class179(final int field517, final int field518, final int field519, final String field520, final Class288 field521, final Class111 field522, final Class352 field523) {
        this.field517 = field517;
        this.field519 = field519;
        this.field518 = field518;
        this.field520 = field520;
        this.field521 = field522;
        this.field522 = field521;
        this.field523 = field523;
    }
    
    public static Class179[] method775(final Class399 class399) {
        final float n = class399.method1742(1.0f) * 0.017453292f;
        final float n2 = -class399.method1743(1.0f) * 0.017453292f;
        final float method35638 = Class9546.method35638(n);
        final float method35639 = Class9546.method35639(n);
        final float method35640 = Class9546.method35638(n2);
        final float method35641 = Class9546.method35639(n2);
        final boolean b = method35640 > 0.0f;
        final boolean b2 = method35638 < 0.0f;
        final boolean b3 = method35641 > 0.0f;
        final float n3 = b ? method35640 : (-method35640);
        final float n4 = b2 ? (-method35638) : method35638;
        final float n5 = b3 ? method35641 : (-method35641);
        final float n6 = n3 * method35639;
        final float n7 = n5 * method35639;
        final Class179 class400 = b ? Class179.field516 : Class179.field515;
        final Class179 class401 = b2 ? Class179.field512 : Class179.field511;
        final Class179 class402 = b3 ? Class179.field514 : Class179.field513;
        if (n3 <= n5) {
            if (n4 <= n7) {
                return (n6 <= n4) ? method776(class402, class401, class400) : method776(class402, class400, class401);
            }
            return method776(class401, class402, class400);
        }
        else {
            if (n4 <= n6) {
                return (n7 <= n4) ? method776(class400, class401, class402) : method776(class400, class402, class401);
            }
            return method776(class401, class400, class402);
        }
    }
    
    private static Class179[] method776(final Class179 class179, final Class179 class180, final Class179 class181) {
        return new Class179[] { class179, class180, class181, class181.method782(), class180.method782(), class179.method782() };
    }
    
    public static Class179 method777(final Class6789 class6789, final Class179 class6790) {
        final Class352 method802 = class6790.method802();
        final Class8526 class6791 = new Class8526((float)method802.method1074(), (float)method802.method1075(), (float)method802.method1076(), 0.0f);
        class6791.method28603(class6789);
        return method800(class6791.method28595(), class6791.method28596(), class6791.method28597());
    }
    
    public Class9389 method778() {
        final Class9389 method33328 = Class9138.field38716.method33328(90.0f);
        switch (Class8085.field33304[this.ordinal()]) {
            case 1: {
                return Class9138.field38716.method33328(180.0f);
            }
            case 2: {
                return Class9389.field40291.method34910();
            }
            case 3: {
                method33328.method34903(Class9138.field38720.method33328(180.0f));
                return method33328;
            }
            case 4: {
                return method33328;
            }
            case 5: {
                method33328.method34903(Class9138.field38720.method33328(90.0f));
                return method33328;
            }
            default: {
                method33328.method34903(Class9138.field38720.method33328(-90.0f));
                return method33328;
            }
        }
    }
    
    public int method779() {
        return this.field517;
    }
    
    public int method780() {
        return this.field519;
    }
    
    public Class288 method781() {
        return this.field522;
    }
    
    public Class179 method782() {
        return Class179.field524[this.field518];
    }
    
    public Class179 method783() {
        switch (Class8085.field33304[this.ordinal()]) {
            case 3: {
                return Class179.field516;
            }
            case 4: {
                return Class179.field515;
            }
            case 5: {
                return Class179.field513;
            }
            case 6: {
                return Class179.field514;
            }
            default: {
                throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
            }
        }
    }
    
    public Class179 method784() {
        switch (Class8085.field33304[this.ordinal()]) {
            case 3: {
                return Class179.field515;
            }
            case 4: {
                return Class179.field516;
            }
            case 5: {
                return Class179.field514;
            }
            case 6: {
                return Class179.field513;
            }
            default: {
                throw new IllegalStateException("Unable to get CCW facing of " + this);
            }
        }
    }
    
    public int method785() {
        return this.field523.method1074();
    }
    
    public int method786() {
        return this.field523.method1075();
    }
    
    public int method787() {
        return this.field523.method1076();
    }
    
    public Class9138 method788() {
        return new Class9138((float)this.method785(), (float)this.method786(), (float)this.method787());
    }
    
    public String method789() {
        return this.field520;
    }
    
    public Class111 method790() {
        return this.field521;
    }
    
    @Nullable
    public static Class179 method791(final String s) {
        return (s != null) ? Class179.field525.get(s.toLowerCase(Locale.ROOT)) : null;
    }
    
    public static Class179 method792(final int n) {
        return Class179.field526[Class9546.method35648(n % Class179.field526.length)];
    }
    
    public static Class179 method793(final int n) {
        return Class179.field527[Class9546.method35648(n % Class179.field527.length)];
    }
    
    @Nullable
    public static Class179 method794(final int n, final int n2, final int n3) {
        return (Class179)Class179.field528.get(Class354.method1130(n, n2, n3));
    }
    
    public static Class179 method795(final double n) {
        return method793(Class9546.method35644(n / 90.0 + 0.5) & 0x3);
    }
    
    public static Class179 method796(final Class111 class111, final Class288 class112) {
        switch (Class8085.field33305[class111.ordinal()]) {
            case 1: {
                return (class112 == Class288.field1601) ? Class179.field516 : Class179.field515;
            }
            case 2: {
                return (class112 == Class288.field1601) ? Class179.field512 : Class179.field511;
            }
            default: {
                return (class112 == Class288.field1601) ? Class179.field514 : Class179.field513;
            }
        }
    }
    
    public float method797() {
        return (float)((this.field519 & 0x3) * 90);
    }
    
    public static Class179 method798(final Random random) {
        return values()[random.nextInt(values().length)];
    }
    
    public static Class179 method799(final double n, final double n2, final double n3) {
        return method800((float)n, (float)n2, (float)n3);
    }
    
    public static Class179 method800(final float n, final float n2, final float n3) {
        Class179 field513 = Class179.field513;
        float n4 = Float.MIN_VALUE;
        for (final Class179 class179 : Class179.field524) {
            final float n5 = n * class179.field523.method1074() + n2 * class179.field523.method1075() + n3 * class179.field523.method1076();
            if (n5 > n4) {
                n4 = n5;
                field513 = class179;
            }
        }
        return field513;
    }
    
    @Override
    public String toString() {
        return this.field520;
    }
    
    @Override
    public String method596() {
        return this.field520;
    }
    
    public static Class179 method801(final Class288 obj, final Class111 obj2) {
        for (final Class179 class179 : values()) {
            if (class179.method781() == obj && class179.method790() == obj2) {
                return class179;
            }
        }
        throw new IllegalArgumentException("No such direction: " + obj + " " + obj2);
    }
    
    public Class352 method802() {
        return this.field523;
    }
    
    static {
        field524 = values();
        field525 = Arrays.stream(Class179.field524).collect(Collectors.toMap((Function<? super Class179, ? extends String>)Class179::method789, class179 -> class179));
        field526 = Arrays.stream(Class179.field524).sorted(Comparator.comparingInt(class180 -> class180.field517)).toArray(Class179[]::new);
        field527 = Arrays.stream(Class179.field524).filter(class181 -> class181.method790().method601()).sorted(Comparator.comparingInt(class182 -> class182.field519)).toArray(Class179[]::new);
        field528 = Arrays.stream(Class179.field524).collect((Collector<? super Class179, ?, Long2ObjectMap>)Collectors.toMap(class183 -> new Class354(class183.method802()).method1132(), class184 -> class184, (p0, p1) -> {
            throw new IllegalArgumentException("Duplicate keys");
        }, (Supplier<R>)Long2ObjectOpenHashMap::new));
    }
}
