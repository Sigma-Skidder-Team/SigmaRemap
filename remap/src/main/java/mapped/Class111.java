// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Random;
import javax.annotation.Nullable;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;

public enum Class111 implements Class103, Predicate<Class179>
{
    field351("X", 0, "x") {
        public Class113(final String s, final int n, final String s2) {
        }
        
        @Override
        public int method604(final int n, final int n2, final int n3) {
            return n;
        }
        
        @Override
        public double method605(final double n, final double n2, final double n3) {
            return n;
        }
    }, 
    field352("Y", 1, "y") {
        public Class112(final String s, final int n, final String s2) {
        }
        
        @Override
        public int method604(final int n, final int n2, final int n3) {
            return n2;
        }
        
        @Override
        public double method605(final double n, final double n2, final double n3) {
            return n2;
        }
    }, 
    field353("Z", 2, "z") {
        public Class177(final String s, final int n, final String s2) {
        }
        
        @Override
        public int method604(final int n, final int n2, final int n3) {
            return n3;
        }
        
        @Override
        public double method605(final double n, final double n2, final double n3) {
            return n3;
        }
    };
    
    private static final Map<String, Class111> field354;
    private final String field355;
    
    private Class111(final String field355) {
        this.field355 = field355;
    }
    
    @Nullable
    public static Class111 method598(final String s) {
        return Class111.field354.get(s.toLowerCase(Locale.ROOT));
    }
    
    public String method599() {
        return this.field355;
    }
    
    public boolean method600() {
        return this == Class111.field352;
    }
    
    public boolean method601() {
        return this == Class111.field351 || this == Class111.field353;
    }
    
    @Override
    public String toString() {
        return this.field355;
    }
    
    public static Class111 method602(final Random random) {
        return values()[random.nextInt(values().length)];
    }
    
    @Override
    public boolean test(final Class179 class179) {
        return class179 != null && class179.method790() == this;
    }
    
    public Class98 method603() {
        switch (Class8085.field33305[this.ordinal()]) {
            case 1:
            case 3: {
                return Class98.field268;
            }
            case 2: {
                return Class98.field269;
            }
            default: {
                throw new Error("Someone's been tampering with the universe!");
            }
        }
    }
    
    @Override
    public String method596() {
        return this.field355;
    }
    
    public abstract int method604(final int p0, final int p1, final int p2);
    
    public abstract double method605(final double p0, final double p1, final double p2);
    
    static {
        field354 = Arrays.stream(values()).collect(Collectors.toMap((Function<? super Class111, ? extends String>)Class111::method599, class111 -> class111));
    }
}
