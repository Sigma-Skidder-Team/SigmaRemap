// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.util.Supplier;
import javax.annotation.Nullable;
import org.apache.logging.log4j.Logger;

public abstract class Class436
{
    private static final Logger field2654;
    private final Class5412<?> field2655;
    public Class1847 field2656;
    public Class354 field2657;
    public boolean field2658;
    private Class7096 field2659;
    private boolean field2660;
    
    public Class436(final Class5412<?> field2655) {
        this.field2657 = Class354.field2173;
        this.field2655 = field2655;
    }
    
    @Nullable
    public Class1847 method2186() {
        return this.field2656;
    }
    
    public void method2187(final Class1847 field2656, final Class354 class354) {
        this.field2656 = field2656;
        this.field2657 = class354.method1153();
    }
    
    public boolean method2188() {
        return this.field2656 != null;
    }
    
    public void method2179(final Class51 class51) {
        this.field2657 = new Class354(class51.method319("x"), class51.method319("y"), class51.method319("z"));
    }
    
    public Class51 method2180(final Class51 class51) {
        return this.method2189(class51);
    }
    
    private Class51 method2189(final Class51 class51) {
        final Class1932 method16520 = Class5412.method16520(this.method2206());
        if (method16520 != null) {
            class51.method306("id", method16520.toString());
            class51.method298("x", this.field2657.method1074());
            class51.method298("y", this.field2657.method1075());
            class51.method298("z", this.field2657.method1076());
            return class51;
        }
        throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
    }
    
    @Nullable
    public static Class436 method2190(final Class51 class51) {
        return Class90.field224.method506(new Class1932(class51.method323("id"))).map(class52 -> {
            try {
                return class52.method16522();
            }
            catch (final Throwable t) {
                Class436.field2654.error("Failed to create block entity {}", (Object)s, (Object)t);
                return null;
            }
        }).map(class54 -> {
            try {
                class54.method2179(class53);
                return class54;
            }
            catch (final Throwable t2) {
                Class436.field2654.error("Failed to load data for block entity {}", (Object)s2, (Object)t2);
                return null;
            }
        }).orElseGet(() -> {
            Class436.field2654.warn("Skipping BlockEntity with id {}", (Object)s3);
            return null;
        });
    }
    
    public void method2161() {
        if (this.field2656 != null) {
            this.field2659 = this.field2656.method6701(this.field2657);
            this.field2656.method6742(this.field2657, this);
            if (!this.field2659.method21706()) {
                this.field2656.method6783(this.field2657, this.field2659.method21696());
            }
        }
    }
    
    public double method2191(final double n, final double n2, final double n3) {
        final double n4 = this.field2657.method1074() + 0.5 - n;
        final double n5 = this.field2657.method1075() + 0.5 - n2;
        final double n6 = this.field2657.method1076() + 0.5 - n3;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }
    
    public double method2192() {
        return 4096.0;
    }
    
    public Class354 method2193() {
        return this.field2657;
    }
    
    public Class7096 method2194() {
        if (this.field2659 == null) {
            this.field2659 = this.field2656.method6701(this.field2657);
        }
        return this.field2659;
    }
    
    @Nullable
    public Class4357 method2195() {
        return null;
    }
    
    public Class51 method2196() {
        return this.method2189(new Class51());
    }
    
    public boolean method2197() {
        return this.field2658;
    }
    
    public void method2198() {
        this.field2658 = true;
    }
    
    public void method2199() {
        this.field2658 = false;
    }
    
    public boolean method2200(final int n, final int n2) {
        return false;
    }
    
    public void method2201() {
        this.field2659 = null;
    }
    
    public void method2202(final Class5204 class5204) {
        class5204.method16296("Name", () -> Class90.field224.method503(this.method2206()) + " // " + this.getClass().getCanonicalName());
        if (this.field2656 != null) {
            Class5204.method16304(class5204, this.field2657, this.method2194());
            Class5204.method16304(class5204, this.field2657, this.field2656.method6701(this.field2657));
        }
    }
    
    public void method2203(final Class354 class354) {
        this.field2657 = class354.method1153();
    }
    
    public boolean method2178() {
        return false;
    }
    
    public void method2204(final Class2052 class2052) {
    }
    
    public void method2205(final Class2181 class2181) {
    }
    
    public Class5412<?> method2206() {
        return this.field2655;
    }
    
    public void method2207() {
        if (!this.field2660) {
            this.field2660 = true;
            Class436.field2654.warn("Block entity invalid: {} @ {}", new Supplier[] { () -> Class90.field224.method503(this.method2206()), this::method2193 });
        }
    }
    
    static {
        field2654 = LogManager.getLogger();
    }
}
