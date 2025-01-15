// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class24 implements Serializable, Cloneable
{
    public static final long field66 = 3644296204459140589L;
    public double field67;
    public double field68;
    public double field69;
    public double field70;
    public static final double field71 = 1.0E-6;
    
    public Class24(final double field67, final double field68, final double field69, final double field70) {
        this.field67 = field67;
        this.field68 = field68;
        this.field69 = field69;
        this.field70 = field70;
    }
    
    public Class24(final double[] array) {
        this.field67 = array[0];
        this.field68 = array[1];
        this.field69 = array[2];
        this.field70 = array[3];
    }
    
    public Class24(final Class24 class24) {
        this.field67 = class24.field67;
        this.field68 = class24.field68;
        this.field69 = class24.field69;
        this.field70 = class24.field70;
    }
    
    public Class24(final Class2307 class2307) {
        this.field67 = class2307.field13985;
        this.field68 = class2307.field13986;
        this.field69 = class2307.field13987;
        this.field70 = class2307.field13988;
    }
    
    public Class24(final Class2273 class2273, final double field70) {
        this.field67 = class2273.field13839;
        this.field68 = class2273.field13840;
        this.field69 = class2273.field13841;
        this.field70 = field70;
    }
    
    public Class24() {
        this.field67 = 0.0;
        this.field68 = 0.0;
        this.field69 = 1.0;
        this.field70 = 0.0;
    }
    
    public final void method235(final double field67, final double field68, final double field69, final double field70) {
        this.field67 = field67;
        this.field68 = field68;
        this.field69 = field69;
        this.field70 = field70;
    }
    
    public final void method236(final double[] array) {
        this.field67 = array[0];
        this.field68 = array[1];
        this.field69 = array[2];
        this.field70 = array[3];
    }
    
    public final void method237(final Class24 class24) {
        this.field67 = class24.field67;
        this.field68 = class24.field68;
        this.field69 = class24.field69;
        this.field70 = class24.field70;
    }
    
    public final void method238(final Class2307 class2307) {
        this.field67 = class2307.field13985;
        this.field68 = class2307.field13986;
        this.field69 = class2307.field13987;
        this.field70 = class2307.field13988;
    }
    
    public final void method239(final Class2273 class2273, final double field70) {
        this.field67 = class2273.field13839;
        this.field68 = class2273.field13840;
        this.field69 = class2273.field13841;
        this.field70 = field70;
    }
    
    public final void method240(final double[] array) {
        array[0] = this.field67;
        array[1] = this.field68;
        array[2] = this.field69;
        array[3] = this.field70;
    }
    
    public final void method241(final Class2284 class2284) {
        final Class2274 class2285 = new Class2274();
        class2284.method8840(class2285);
        this.field67 = (float)(class2285.field13852 - class2285.field13850);
        this.field68 = (float)(class2285.field13847 - class2285.field13851);
        this.field69 = (float)(class2285.field13848 - class2285.field13846);
        final double a = this.field67 * this.field67 + this.field68 * this.field68 + this.field69 * this.field69;
        if (a <= 1.0E-6) {
            this.field67 = 0.0;
            this.field68 = 1.0;
            this.field69 = 0.0;
            this.field70 = 0.0;
        }
        else {
            final double sqrt = Math.sqrt(a);
            this.field70 = (float)Math.atan2(0.5 * sqrt, 0.5 * (class2285.field13845 + class2285.field13849 + class2285.field13853 - 1.0));
            final double n = 1.0 / sqrt;
            this.field67 *= n;
            this.field68 *= n;
            this.field69 *= n;
        }
    }
    
    public final void method242(final Class2304 class2304) {
        final Class2274 class2305 = new Class2274();
        class2304.method9226(class2305);
        this.field67 = (float)(class2305.field13852 - class2305.field13850);
        this.field68 = (float)(class2305.field13847 - class2305.field13851);
        this.field69 = (float)(class2305.field13848 - class2305.field13846);
        final double a = this.field67 * this.field67 + this.field68 * this.field68 + this.field69 * this.field69;
        if (a <= 1.0E-6) {
            this.field67 = 0.0;
            this.field68 = 1.0;
            this.field69 = 0.0;
            this.field70 = 0.0;
        }
        else {
            final double sqrt = Math.sqrt(a);
            this.field70 = (float)Math.atan2(0.5 * sqrt, 0.5 * (class2305.field13845 + class2305.field13849 + class2305.field13853 - 1.0));
            final double n = 1.0 / sqrt;
            this.field67 *= n;
            this.field68 *= n;
            this.field69 *= n;
        }
    }
    
    public final void method243(final Class2296 class2296) {
        this.field67 = class2296.field13942 - class2296.field13940;
        this.field68 = class2296.field13937 - class2296.field13941;
        this.field69 = class2296.field13938 - class2296.field13936;
        final double a = this.field67 * this.field67 + this.field68 * this.field68 + this.field69 * this.field69;
        if (a <= 1.0E-6) {
            this.field67 = 0.0;
            this.field68 = 1.0;
            this.field69 = 0.0;
            this.field70 = 0.0;
        }
        else {
            final double sqrt = Math.sqrt(a);
            this.field70 = (float)Math.atan2(0.5 * sqrt, 0.5 * (class2296.field13935 + class2296.field13939 + class2296.field13943 - 1.0));
            final double n = 1.0 / sqrt;
            this.field67 *= n;
            this.field68 *= n;
            this.field69 *= n;
        }
    }
    
    public final void method244(final Class2274 class2274) {
        this.field67 = (float)(class2274.field13852 - class2274.field13850);
        this.field68 = (float)(class2274.field13847 - class2274.field13851);
        this.field69 = (float)(class2274.field13848 - class2274.field13846);
        final double a = this.field67 * this.field67 + this.field68 * this.field68 + this.field69 * this.field69;
        if (a <= 1.0E-6) {
            this.field67 = 0.0;
            this.field68 = 1.0;
            this.field69 = 0.0;
            this.field70 = 0.0;
        }
        else {
            final double sqrt = Math.sqrt(a);
            this.field70 = (float)Math.atan2(0.5 * sqrt, 0.5 * (class2274.field13845 + class2274.field13849 + class2274.field13853 - 1.0));
            final double n = 1.0 / sqrt;
            this.field67 *= n;
            this.field68 *= n;
            this.field69 *= n;
        }
    }
    
    public final void method245(final Class2278 class2278) {
        final double a = class2278.field13863 * class2278.field13863 + class2278.field13864 * class2278.field13864 + class2278.field13865 * class2278.field13865;
        if (a <= 1.0E-6) {
            this.field67 = 0.0;
            this.field68 = 1.0;
            this.field69 = 0.0;
            this.field70 = 0.0;
        }
        else {
            final double sqrt = Math.sqrt(a);
            final double n = 1.0 / sqrt;
            this.field67 = class2278.field13863 * n;
            this.field68 = class2278.field13864 * n;
            this.field69 = class2278.field13865 * n;
            this.field70 = 2.0 * Math.atan2(sqrt, class2278.field13866);
        }
    }
    
    public final void method246(final Class8 class8) {
        final double a = class8.field18 * class8.field18 + class8.field19 * class8.field19 + class8.field20 * class8.field20;
        if (a <= 1.0E-6) {
            this.field67 = 0.0;
            this.field68 = 1.0;
            this.field69 = 0.0;
            this.field70 = 0.0;
        }
        else {
            final double sqrt = Math.sqrt(a);
            final double n = 1.0 / sqrt;
            this.field67 = class8.field18 * n;
            this.field68 = class8.field19 * n;
            this.field69 = class8.field20 * n;
            this.field70 = 2.0 * Math.atan2(sqrt, class8.field21);
        }
    }
    
    @Override
    public String toString() {
        return "(" + this.field67 + ", " + this.field68 + ", " + this.field69 + ", " + this.field70 + ")";
    }
    
    public boolean equals(final Class24 class24) {
        try {
            return this.field67 == class24.field67 && this.field68 == class24.field68 && this.field69 == class24.field69 && this.field70 == class24.field70;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class24 class24 = (Class24)o;
            return this.field67 == class24.field67 && this.field68 == class24.field68 && this.field69 == class24.field69 && this.field70 == class24.field70;
        }
        catch (final NullPointerException ex) {
            return false;
        }
        catch (final ClassCastException ex2) {
            return false;
        }
    }
    
    public boolean method247(final Class24 class24, final double n) {
        final double n2 = this.field67 - class24.field67;
        if (((n2 >= 0.0) ? n2 : (-n2)) > n) {
            return false;
        }
        final double n3 = this.field68 - class24.field68;
        if (((n3 >= 0.0) ? n3 : (-n3)) > n) {
            return false;
        }
        final double n4 = this.field69 - class24.field69;
        if (((n4 >= 0.0) ? n4 : (-n4)) <= n) {
            final double n5 = this.field70 - class24.field70;
            return ((n5 >= 0.0) ? n5 : (-n5)) <= n;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long n = 31L * (31L * (31L * (31L * 1L + Class9427.method35031(this.field67)) + Class9427.method35031(this.field68)) + Class9427.method35031(this.field69)) + Class9427.method35031(this.field70);
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
    
    public final double method248() {
        return this.field70;
    }
    
    public final void method249(final double field70) {
        this.field70 = field70;
    }
    
    public double method250() {
        return this.field67;
    }
    
    public final void method251(final double field67) {
        this.field67 = field67;
    }
    
    public final double method252() {
        return this.field68;
    }
    
    public final void method253(final double field68) {
        this.field68 = field68;
    }
    
    public double method254() {
        return this.field69;
    }
    
    public final void method255(final double field69) {
        this.field69 = field69;
    }
}
