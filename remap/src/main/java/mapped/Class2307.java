// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2307 implements Serializable, Cloneable
{
    public static final long field13984 = -163246355858070601L;
    public float field13985;
    public float field13986;
    public float field13987;
    public float field13988;
    public static final double field13989 = 1.0E-6;
    
    public Class2307(final float field13985, final float field13986, final float field13987, final float field13988) {
        this.field13985 = field13985;
        this.field13986 = field13986;
        this.field13987 = field13987;
        this.field13988 = field13988;
    }
    
    public Class2307(final float[] array) {
        this.field13985 = array[0];
        this.field13986 = array[1];
        this.field13987 = array[2];
        this.field13988 = array[3];
    }
    
    public Class2307(final Class2307 class2307) {
        this.field13985 = class2307.field13985;
        this.field13986 = class2307.field13986;
        this.field13987 = class2307.field13987;
        this.field13988 = class2307.field13988;
    }
    
    public Class2307(final Class24 class24) {
        this.field13985 = (float)class24.field67;
        this.field13986 = (float)class24.field68;
        this.field13987 = (float)class24.field69;
        this.field13988 = (float)class24.field70;
    }
    
    public Class2307(final Class2288 class2288, final float field13988) {
        this.field13985 = class2288.field13909;
        this.field13986 = class2288.field13910;
        this.field13987 = class2288.field13911;
        this.field13988 = field13988;
    }
    
    public Class2307() {
        this.field13985 = 0.0f;
        this.field13986 = 0.0f;
        this.field13987 = 1.0f;
        this.field13988 = 0.0f;
    }
    
    public final void method9354(final float field13985, final float field13986, final float field13987, final float field13988) {
        this.field13985 = field13985;
        this.field13986 = field13986;
        this.field13987 = field13987;
        this.field13988 = field13988;
    }
    
    public final void method9355(final float[] array) {
        this.field13985 = array[0];
        this.field13986 = array[1];
        this.field13987 = array[2];
        this.field13988 = array[3];
    }
    
    public final void method9356(final Class2307 class2307) {
        this.field13985 = class2307.field13985;
        this.field13986 = class2307.field13986;
        this.field13987 = class2307.field13987;
        this.field13988 = class2307.field13988;
    }
    
    public final void method9357(final Class24 class24) {
        this.field13985 = (float)class24.field67;
        this.field13986 = (float)class24.field68;
        this.field13987 = (float)class24.field69;
        this.field13988 = (float)class24.field70;
    }
    
    public final void method9358(final Class2288 class2288, final float field13988) {
        this.field13985 = class2288.field13909;
        this.field13986 = class2288.field13910;
        this.field13987 = class2288.field13911;
        this.field13988 = field13988;
    }
    
    public final void method9359(final float[] array) {
        array[0] = this.field13985;
        array[1] = this.field13986;
        array[2] = this.field13987;
        array[3] = this.field13988;
    }
    
    public final void method9360(final Class2278 class2278) {
        final double a = class2278.field13863 * class2278.field13863 + class2278.field13864 * class2278.field13864 + class2278.field13865 * class2278.field13865;
        if (a <= 1.0E-6) {
            this.field13985 = 0.0f;
            this.field13986 = 1.0f;
            this.field13987 = 0.0f;
            this.field13988 = 0.0f;
        }
        else {
            final double sqrt = Math.sqrt(a);
            final double n = 1.0 / sqrt;
            this.field13985 = (float)(class2278.field13863 * n);
            this.field13986 = (float)(class2278.field13864 * n);
            this.field13987 = (float)(class2278.field13865 * n);
            this.field13988 = (float)(2.0 * Math.atan2(sqrt, class2278.field13866));
        }
    }
    
    public final void method9361(final Class8 class8) {
        final double a = class8.field18 * class8.field18 + class8.field19 * class8.field19 + class8.field20 * class8.field20;
        if (a <= 1.0E-6) {
            this.field13985 = 0.0f;
            this.field13986 = 1.0f;
            this.field13987 = 0.0f;
            this.field13988 = 0.0f;
        }
        else {
            final double sqrt = Math.sqrt(a);
            final double n = 1.0 / sqrt;
            this.field13985 = (float)(class8.field18 * n);
            this.field13986 = (float)(class8.field19 * n);
            this.field13987 = (float)(class8.field20 * n);
            this.field13988 = (float)(2.0 * Math.atan2(sqrt, class8.field21));
        }
    }
    
    public final void method9362(final Class2284 class2284) {
        final Class2296 class2285 = new Class2296();
        class2284.method8841(class2285);
        this.field13985 = class2285.field13942 - class2285.field13940;
        this.field13986 = class2285.field13937 - class2285.field13941;
        this.field13987 = class2285.field13938 - class2285.field13936;
        final double a = this.field13985 * this.field13985 + this.field13986 * this.field13986 + this.field13987 * this.field13987;
        if (a <= 1.0E-6) {
            this.field13985 = 0.0f;
            this.field13986 = 1.0f;
            this.field13987 = 0.0f;
            this.field13988 = 0.0f;
        }
        else {
            final double sqrt = Math.sqrt(a);
            this.field13988 = (float)Math.atan2(0.5 * sqrt, 0.5 * (class2285.field13935 + class2285.field13939 + class2285.field13943 - 1.0));
            final double n = 1.0 / sqrt;
            this.field13985 *= (float)n;
            this.field13986 *= (float)n;
            this.field13987 *= (float)n;
        }
    }
    
    public final void method9363(final Class2304 class2304) {
        final Class2274 class2305 = new Class2274();
        class2304.method9226(class2305);
        this.field13985 = (float)(class2305.field13852 - class2305.field13850);
        this.field13986 = (float)(class2305.field13847 - class2305.field13851);
        this.field13987 = (float)(class2305.field13848 - class2305.field13846);
        final double a = this.field13985 * this.field13985 + this.field13986 * this.field13986 + this.field13987 * this.field13987;
        if (a <= 1.0E-6) {
            this.field13985 = 0.0f;
            this.field13986 = 1.0f;
            this.field13987 = 0.0f;
            this.field13988 = 0.0f;
        }
        else {
            final double sqrt = Math.sqrt(a);
            this.field13988 = (float)Math.atan2(0.5 * sqrt, 0.5 * (class2305.field13845 + class2305.field13849 + class2305.field13853 - 1.0));
            final double n = 1.0 / sqrt;
            this.field13985 *= (float)n;
            this.field13986 *= (float)n;
            this.field13987 *= (float)n;
        }
    }
    
    public final void method9364(final Class2296 class2296) {
        this.field13985 = class2296.field13942 - class2296.field13940;
        this.field13986 = class2296.field13937 - class2296.field13941;
        this.field13987 = class2296.field13938 - class2296.field13936;
        final double a = this.field13985 * this.field13985 + this.field13986 * this.field13986 + this.field13987 * this.field13987;
        if (a <= 1.0E-6) {
            this.field13985 = 0.0f;
            this.field13986 = 1.0f;
            this.field13987 = 0.0f;
            this.field13988 = 0.0f;
        }
        else {
            final double sqrt = Math.sqrt(a);
            this.field13988 = (float)Math.atan2(0.5 * sqrt, 0.5 * (class2296.field13935 + class2296.field13939 + class2296.field13943 - 1.0));
            final double n = 1.0 / sqrt;
            this.field13985 *= (float)n;
            this.field13986 *= (float)n;
            this.field13987 *= (float)n;
        }
    }
    
    public final void method9365(final Class2274 class2274) {
        this.field13985 = (float)(class2274.field13852 - class2274.field13850);
        this.field13986 = (float)(class2274.field13847 - class2274.field13851);
        this.field13987 = (float)(class2274.field13848 - class2274.field13846);
        final double a = this.field13985 * this.field13985 + this.field13986 * this.field13986 + this.field13987 * this.field13987;
        if (a <= 1.0E-6) {
            this.field13985 = 0.0f;
            this.field13986 = 1.0f;
            this.field13987 = 0.0f;
            this.field13988 = 0.0f;
        }
        else {
            final double sqrt = Math.sqrt(a);
            this.field13988 = (float)Math.atan2(0.5 * sqrt, 0.5 * (class2274.field13845 + class2274.field13849 + class2274.field13853 - 1.0));
            final double n = 1.0 / sqrt;
            this.field13985 *= (float)n;
            this.field13986 *= (float)n;
            this.field13987 *= (float)n;
        }
    }
    
    @Override
    public String toString() {
        return "(" + this.field13985 + ", " + this.field13986 + ", " + this.field13987 + ", " + this.field13988 + ")";
    }
    
    public boolean equals(final Class2307 class2307) {
        try {
            return this.field13985 == class2307.field13985 && this.field13986 == class2307.field13986 && this.field13987 == class2307.field13987 && this.field13988 == class2307.field13988;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2307 class2307 = (Class2307)o;
            return this.field13985 == class2307.field13985 && this.field13986 == class2307.field13986 && this.field13987 == class2307.field13987 && this.field13988 == class2307.field13988;
        }
        catch (final NullPointerException ex) {
            return false;
        }
        catch (final ClassCastException ex2) {
            return false;
        }
    }
    
    public boolean method9366(final Class2307 class2307, final float n) {
        final float n2 = this.field13985 - class2307.field13985;
        if (((n2 >= 0.0f) ? n2 : (-n2)) > n) {
            return false;
        }
        final float n3 = this.field13986 - class2307.field13986;
        if (((n3 >= 0.0f) ? n3 : (-n3)) > n) {
            return false;
        }
        final float n4 = this.field13987 - class2307.field13987;
        if (((n4 >= 0.0f) ? n4 : (-n4)) <= n) {
            final float n5 = this.field13988 - class2307.field13988;
            return ((n5 >= 0.0f) ? n5 : (-n5)) <= n;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long n = 31L * (31L * (31L * (31L + Class9427.method35030(this.field13985)) + Class9427.method35030(this.field13986)) + Class9427.method35030(this.field13987)) + Class9427.method35030(this.field13988);
        return (int)(n ^ n >> 32);
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final float method9367() {
        return this.field13988;
    }
    
    public final void method9368(final float field13988) {
        this.field13988 = field13988;
    }
    
    public final float method9369() {
        return this.field13985;
    }
    
    public final void method9370(final float field13985) {
        this.field13985 = field13985;
    }
    
    public final float method9371() {
        return this.field13986;
    }
    
    public final void method9372(final float field13986) {
        this.field13986 = field13986;
    }
    
    public final float method9373() {
        return this.field13987;
    }
    
    public final void method9374(final float field13987) {
        this.field13987 = field13987;
    }
}
