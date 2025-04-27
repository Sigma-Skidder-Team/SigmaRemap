// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Class7906
{
    private static final Map<Integer, Class7906> field32450;
    public static final List<Class7906> field32451;
    public static final Class7906 field32452;
    public static final Class7906 field32453;
    public static final Class7906 field32454;
    public static final Class7906 field32455;
    public static final Class7906 field32456;
    public static final Class7906 field32457;
    public static final Class7906 field32458;
    public static final Class7906 field32459;
    public static final Class7906 field32460;
    public static final Class7906 field32461;
    public static final Class7906 field32462;
    public static final Class7906 field32463;
    public static final Class7906 field32464;
    public static final Class7906 field32465;
    public static final Class7906 field32466;
    public static final Class7906 field32467;
    public static final Class7906 field32468;
    public static final Class7906 field32469;
    public static final Class7906 field32470;
    public static final Class7906 field32471;
    public static final Class7906 field32472;
    public static final Class7906 field32473;
    public static final Class7906 field32474;
    private final int field32475;
    private final String field32476;
    
    public static void method25607(final Class7906 class7906) {
        if (class7906 != null) {
            Class7906.field32450.put(class7906.method25613(), class7906);
            Class7906.field32451.add(class7906);
            return;
        }
        throw new NullPointerException("protocol is marked non-null but is null");
    }
    
    public static boolean method25608(final int i) {
        return Class7906.field32450.containsKey(i);
    }
    
    public static Class7906 method25609(final int n) {
        final Class7906 class7906 = Class7906.field32450.get(n);
        if (class7906 == null) {
            return new Class7906(n, "Unknown (" + n + ")");
        }
        return class7906;
    }
    
    public static int method25610(final Class7906 class7906) {
        return Class7906.field32451.indexOf(class7906);
    }
    
    public static List<Class7906> method25611() {
        return Collections.unmodifiableList(new ArrayList<Class7906>(Class7906.field32450.values()));
    }
    
    public static Class7906 method25612(final String s) {
        for (final Class7906 class7906 : Class7906.field32450.values()) {
            if (class7906.method25614().equals(s)) {
                return class7906;
            }
            if (class7906.method25614().equals(s + ".x")) {
                return class7906;
            }
            for (final String s2 : class7906.method25614().split("-")) {
                if (s2.equalsIgnoreCase(s)) {
                    return class7906;
                }
                if (s2.equals(s + ".x")) {
                    return class7906;
                }
            }
        }
        return null;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.field32475 == ((Class7906)o).field32475);
    }
    
    @Override
    public int hashCode() {
        return this.field32475;
    }
    
    @Override
    public String toString() {
        return String.format("%s(%d)", this.method25614(), this.method25613());
    }
    
    public Class7906(final int field32475, final String field32476) {
        this.field32475 = field32475;
        this.field32476 = field32476;
    }
    
    public int method25613() {
        return this.field32475;
    }
    
    public String method25614() {
        return this.field32476;
    }
    
    static {
        field32450 = new HashMap<Integer, Class7906>();
        field32451 = new ArrayList<Class7906>();
        method25607(field32452 = new Class7906(47, "1.8.x"));
        method25607(field32453 = new Class7906(107, "1.9"));
        method25607(field32454 = new Class7906(108, "1.9.1"));
        method25607(field32455 = new Class7906(109, "1.9.2"));
        method25607(field32456 = new Class7906(110, "1.9.3/4"));
        method25607(field32457 = new Class7906(210, "1.10"));
        method25607(field32458 = new Class7906(315, "1.11"));
        method25607(field32459 = new Class7906(316, "1.11.1"));
        method25607(field32460 = new Class7906(335, "1.12"));
        method25607(field32461 = new Class7906(338, "1.12.1"));
        method25607(field32462 = new Class7906(340, "1.12.2"));
        method25607(field32463 = new Class7906(393, "1.13"));
        method25607(field32464 = new Class7906(401, "1.13.1"));
        method25607(field32465 = new Class7906(404, "1.13.2"));
        method25607(field32466 = new Class7906(477, "1.14"));
        method25607(field32467 = new Class7906(480, "1.14.1"));
        method25607(field32468 = new Class7906(485, "1.14.2"));
        method25607(field32469 = new Class7906(490, "1.14.3"));
        method25607(field32470 = new Class7906(498, "1.14.4"));
        method25607(field32471 = new Class7906(573, "1.15"));
        method25607(field32472 = new Class7906(575, "1.15.1"));
        method25607(field32473 = new Class7906(578, "1.15.2"));
        method25607(field32474 = new Class7906(-1, "UNKNOWN"));
    }
}
