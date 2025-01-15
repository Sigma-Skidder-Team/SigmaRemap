// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class8 extends Class7 implements Serializable
{
    private static String[] field22;
    public static final long field17 = 7577479888820201099L;
    public static final double field23 = 1.0E-6;
    public static final double field24 = 1.0E-30;
    public static final double field25 = 1.57079632679;
    
    public Class8(final double n, final double n2, final double n3, final double n4) {
        final double n5 = 1.0 / Math.sqrt(n * n + n2 * n2 + n3 * n3 + n4 * n4);
        this.field18 = n * n5;
        this.field19 = n2 * n5;
        this.field20 = n3 * n5;
        this.field21 = n4 * n5;
    }
    
    public Class8(final double[] array) {
        final double n = 1.0 / Math.sqrt(array[0] * array[0] + array[1] * array[1] + array[2] * array[2] + array[3] * array[3]);
        this.field18 = array[0] * n;
        this.field19 = array[1] * n;
        this.field20 = array[2] * n;
        this.field21 = array[3] * n;
    }
    
    public Class8(final Class8 class8) {
        super(class8);
    }
    
    public Class8(final Class2278 class2278) {
        super(class2278);
    }
    
    public Class8(final Class2275 class2275) {
        final double n = 1.0 / Math.sqrt(class2275.field13863 * class2275.field13863 + class2275.field13864 * class2275.field13864 + class2275.field13865 * class2275.field13865 + class2275.field13866 * class2275.field13866);
        this.field18 = class2275.field13863 * n;
        this.field19 = class2275.field13864 * n;
        this.field20 = class2275.field13865 * n;
        this.field21 = class2275.field13866 * n;
    }
    
    public Class8(final Class7 class7) {
        final double n = 1.0 / Math.sqrt(class7.field18 * class7.field18 + class7.field19 * class7.field19 + class7.field20 * class7.field20 + class7.field21 * class7.field21);
        this.field18 = class7.field18 * n;
        this.field19 = class7.field19 * n;
        this.field20 = class7.field20 * n;
        this.field21 = class7.field21 * n;
    }
    
    public Class8() {
    }
    
    public final void method87(final Class8 class8) {
        this.field18 = -class8.field18;
        this.field19 = -class8.field19;
        this.field20 = -class8.field20;
        this.field21 = class8.field21;
    }
    
    public final void method88() {
        this.field18 = -this.field18;
        this.field19 = -this.field19;
        this.field20 = -this.field20;
    }
    
    public final void method89(final Class8 class8, final Class8 class9) {
        if (this != class8 && this != class9) {
            this.field21 = class8.field21 * class9.field21 - class8.field18 * class9.field18 - class8.field19 * class9.field19 - class8.field20 * class9.field20;
            this.field18 = class8.field21 * class9.field18 + class9.field21 * class8.field18 + class8.field19 * class9.field20 - class8.field20 * class9.field19;
            this.field19 = class8.field21 * class9.field19 + class9.field21 * class8.field19 - class8.field18 * class9.field20 + class8.field20 * class9.field18;
            this.field20 = class8.field21 * class9.field20 + class9.field21 * class8.field20 + class8.field18 * class9.field19 - class8.field19 * class9.field18;
        }
        else {
            final double field21 = class8.field21 * class9.field21 - class8.field18 * class9.field18 - class8.field19 * class9.field19 - class8.field20 * class9.field20;
            final double field22 = class8.field21 * class9.field18 + class9.field21 * class8.field18 + class8.field19 * class9.field20 - class8.field20 * class9.field19;
            final double field23 = class8.field21 * class9.field19 + class9.field21 * class8.field19 - class8.field18 * class9.field20 + class8.field20 * class9.field18;
            this.field20 = class8.field21 * class9.field20 + class9.field21 * class8.field20 + class8.field18 * class9.field19 - class8.field19 * class9.field18;
            this.field21 = field21;
            this.field18 = field22;
            this.field19 = field23;
        }
    }
    
    public final void method90(final Class8 class8) {
        final double field21 = this.field21 * class8.field21 - this.field18 * class8.field18 - this.field19 * class8.field19 - this.field20 * class8.field20;
        final double field22 = this.field21 * class8.field18 + class8.field21 * this.field18 + this.field19 * class8.field20 - this.field20 * class8.field19;
        final double field23 = this.field21 * class8.field19 + class8.field21 * this.field19 - this.field18 * class8.field20 + this.field20 * class8.field18;
        this.field20 = this.field21 * class8.field20 + class8.field21 * this.field20 + this.field18 * class8.field19 - this.field19 * class8.field18;
        this.field21 = field21;
        this.field18 = field22;
        this.field19 = field23;
    }
    
    public final void method91(final Class8 class8, final Class8 class9) {
        final Class8 class10 = new Class8(class9);
        class10.method94();
        this.method89(class8, class10);
    }
    
    public final void method92(final Class8 class8) {
        final Class8 class9 = new Class8(class8);
        class9.method94();
        this.method90(class9);
    }
    
    public final void method93(final Class8 class8) {
        final double n = 1.0 / (class8.field21 * class8.field21 + class8.field18 * class8.field18 + class8.field19 * class8.field19 + class8.field20 * class8.field20);
        this.field21 = n * class8.field21;
        this.field18 = -n * class8.field18;
        this.field19 = -n * class8.field19;
        this.field20 = -n * class8.field20;
    }
    
    public final void method94() {
        final double n = 1.0 / (this.field21 * this.field21 + this.field18 * this.field18 + this.field19 * this.field19 + this.field20 * this.field20);
        this.field21 *= n;
        this.field18 *= -n;
        this.field19 *= -n;
        this.field20 *= -n;
    }
    
    public final void method95(final Class8 class8) {
        final double a = class8.field18 * class8.field18 + class8.field19 * class8.field19 + class8.field20 * class8.field20 + class8.field21 * class8.field21;
        if (a <= 0.0) {
            this.field18 = 0.0;
            this.field19 = 0.0;
            this.field20 = 0.0;
            this.field21 = 0.0;
        }
        else {
            final double n = 1.0 / Math.sqrt(a);
            this.field18 = n * class8.field18;
            this.field19 = n * class8.field19;
            this.field20 = n * class8.field20;
            this.field21 = n * class8.field21;
        }
    }
    
    public final void method96() {
        final double a = this.field18 * this.field18 + this.field19 * this.field19 + this.field20 * this.field20 + this.field21 * this.field21;
        if (a <= 0.0) {
            this.field18 = 0.0;
            this.field19 = 0.0;
            this.field20 = 0.0;
            this.field21 = 0.0;
        }
        else {
            final double n = 1.0 / Math.sqrt(a);
            this.field18 *= n;
            this.field19 *= n;
            this.field20 *= n;
            this.field21 *= n;
        }
    }
    
    public final void method97(final Class2284 class2284) {
        final double a = 0.25 * (class2284.field13891 + class2284.field13896 + class2284.field13901 + class2284.field13906);
        if (a < 0.0) {
            this.field21 = 0.0;
            this.field18 = 0.0;
            this.field19 = 0.0;
            this.field20 = 1.0;
            return;
        }
        if (a >= 1.0E-30) {
            this.field21 = Math.sqrt(a);
            final double n = 0.25 / this.field21;
            this.field18 = (class2284.field13900 - class2284.field13897) * n;
            this.field19 = (class2284.field13893 - class2284.field13899) * n;
            this.field20 = (class2284.field13895 - class2284.field13892) * n;
            return;
        }
        this.field21 = 0.0;
        final double a2 = -0.5 * (class2284.field13896 + class2284.field13901);
        if (a2 < 0.0) {
            this.field18 = 0.0;
            this.field19 = 0.0;
            this.field20 = 1.0;
            return;
        }
        if (a2 >= 1.0E-30) {
            this.field18 = Math.sqrt(a2);
            final double n2 = 1.0 / (2.0 * this.field18);
            this.field19 = class2284.field13895 * n2;
            this.field20 = class2284.field13899 * n2;
            return;
        }
        this.field18 = 0.0;
        final double a3 = 0.5 * (1.0 - class2284.field13901);
        if (a3 < 1.0E-30) {
            this.field19 = 0.0;
            this.field20 = 1.0;
            return;
        }
        this.field19 = Math.sqrt(a3);
        this.field20 = class2284.field13900 / (2.0 * this.field19);
    }
    
    public final void method98(final Class2304 class2304) {
        final double a = 0.25 * (class2304.field13961 + class2304.field13966 + class2304.field13971 + class2304.field13976);
        if (a < 0.0) {
            this.field21 = 0.0;
            this.field18 = 0.0;
            this.field19 = 0.0;
            this.field20 = 1.0;
            return;
        }
        if (a >= 1.0E-30) {
            this.field21 = Math.sqrt(a);
            final double n = 0.25 / this.field21;
            this.field18 = (class2304.field13970 - class2304.field13967) * n;
            this.field19 = (class2304.field13963 - class2304.field13969) * n;
            this.field20 = (class2304.field13965 - class2304.field13962) * n;
            return;
        }
        this.field21 = 0.0;
        final double a2 = -0.5 * (class2304.field13966 + class2304.field13971);
        if (a2 < 0.0) {
            this.field18 = 0.0;
            this.field19 = 0.0;
            this.field20 = 1.0;
            return;
        }
        if (a2 >= 1.0E-30) {
            this.field18 = Math.sqrt(a2);
            final double n2 = 0.5 / this.field18;
            this.field19 = class2304.field13965 * n2;
            this.field20 = class2304.field13969 * n2;
            return;
        }
        this.field18 = 0.0;
        final double a3 = 0.5 * (1.0 - class2304.field13971);
        if (a3 < 1.0E-30) {
            this.field19 = 0.0;
            this.field20 = 1.0;
            return;
        }
        this.field19 = Math.sqrt(a3);
        this.field20 = class2304.field13970 / (2.0 * this.field19);
    }
    
    public final void method99(final Class2296 class2296) {
        final double a = 0.25 * (class2296.field13935 + class2296.field13939 + class2296.field13943 + 1.0);
        if (a < 0.0) {
            this.field21 = 0.0;
            this.field18 = 0.0;
            this.field19 = 0.0;
            this.field20 = 1.0;
            return;
        }
        if (a >= 1.0E-30) {
            this.field21 = Math.sqrt(a);
            final double n = 0.25 / this.field21;
            this.field18 = (class2296.field13942 - class2296.field13940) * n;
            this.field19 = (class2296.field13937 - class2296.field13941) * n;
            this.field20 = (class2296.field13938 - class2296.field13936) * n;
            return;
        }
        this.field21 = 0.0;
        final double a2 = -0.5 * (class2296.field13939 + class2296.field13943);
        if (a2 < 0.0) {
            this.field18 = 0.0;
            this.field19 = 0.0;
            this.field20 = 1.0;
            return;
        }
        if (a2 < 1.0E-30) {
            this.field18 = 0.0;
            final double a3 = 0.5 * (1.0 - class2296.field13943);
            if (a3 >= 1.0E-30) {
                this.field19 = Math.sqrt(a3);
                this.field20 = class2296.field13942 / (2.0 * this.field19);
            }
            this.field19 = 0.0;
            this.field20 = 1.0;
            return;
        }
        this.field18 = Math.sqrt(a2);
        final double n2 = 0.5 / this.field18;
        this.field19 = class2296.field13938 * n2;
        this.field20 = class2296.field13941 * n2;
    }
    
    public final void method100(final Class2274 class2274) {
        final double a = 0.25 * (class2274.field13845 + class2274.field13849 + class2274.field13853 + 1.0);
        if (a < 0.0) {
            this.field21 = 0.0;
            this.field18 = 0.0;
            this.field19 = 0.0;
            this.field20 = 1.0;
            return;
        }
        if (a >= 1.0E-30) {
            this.field21 = Math.sqrt(a);
            final double n = 0.25 / this.field21;
            this.field18 = (class2274.field13852 - class2274.field13850) * n;
            this.field19 = (class2274.field13847 - class2274.field13851) * n;
            this.field20 = (class2274.field13848 - class2274.field13846) * n;
            return;
        }
        this.field21 = 0.0;
        final double a2 = -0.5 * (class2274.field13849 + class2274.field13853);
        if (a2 < 0.0) {
            this.field18 = 0.0;
            this.field19 = 0.0;
            this.field20 = 1.0;
            return;
        }
        if (a2 >= 1.0E-30) {
            this.field18 = Math.sqrt(a2);
            final double n2 = 0.5 / this.field18;
            this.field19 = class2274.field13848 * n2;
            this.field20 = class2274.field13851 * n2;
            return;
        }
        this.field18 = 0.0;
        final double a3 = 0.5 * (1.0 - class2274.field13853);
        if (a3 < 1.0E-30) {
            this.field19 = 0.0;
            this.field20 = 1.0;
            return;
        }
        this.field19 = Math.sqrt(a3);
        this.field20 = class2274.field13852 / (2.0 * this.field19);
    }
    
    public final void method101(final Class2307 class2307) {
        final double sqrt = Math.sqrt(class2307.field13985 * class2307.field13985 + class2307.field13986 * class2307.field13986 + class2307.field13987 * class2307.field13987);
        if (sqrt >= 1.0E-6) {
            final double sin = Math.sin(class2307.field13988 / 2.0);
            final double n = 1.0 / sqrt;
            this.field21 = Math.cos(class2307.field13988 / 2.0);
            this.field18 = class2307.field13985 * n * sin;
            this.field19 = class2307.field13986 * n * sin;
            this.field20 = class2307.field13987 * n * sin;
        }
        else {
            this.field21 = 0.0;
            this.field18 = 0.0;
            this.field19 = 0.0;
            this.field20 = 0.0;
        }
    }
    
    public final void method102(final Class24 class24) {
        final double sqrt = Math.sqrt(class24.field67 * class24.field67 + class24.field68 * class24.field68 + class24.field69 * class24.field69);
        if (sqrt >= 1.0E-6) {
            final double n = 1.0 / sqrt;
            final double sin = Math.sin(class24.field70 / 2.0);
            this.field21 = Math.cos(class24.field70 / 2.0);
            this.field18 = class24.field67 * n * sin;
            this.field19 = class24.field68 * n * sin;
            this.field20 = class24.field69 * n * sin;
        }
        else {
            this.field21 = 0.0;
            this.field18 = 0.0;
            this.field19 = 0.0;
            this.field20 = 0.0;
        }
    }
    
    public final void method103(final Class8 class8, final double n) {
        double a = this.field18 * class8.field18 + this.field19 * class8.field19 + this.field20 * class8.field20 + this.field21 * class8.field21;
        if (a < 0.0) {
            class8.field18 = -class8.field18;
            class8.field19 = -class8.field19;
            class8.field20 = -class8.field20;
            class8.field21 = -class8.field21;
            a = -a;
        }
        double n2;
        double n3;
        if (1.0 - a <= 1.0E-6) {
            n2 = 1.0 - n;
            n3 = n;
        }
        else {
            final double acos = Math.acos(a);
            final double sin = Math.sin(acos);
            n2 = Math.sin((1.0 - n) * acos) / sin;
            n3 = Math.sin(n * acos) / sin;
        }
        this.field21 = n2 * this.field21 + n3 * class8.field21;
        this.field18 = n2 * this.field18 + n3 * class8.field18;
        this.field19 = n2 * this.field19 + n3 * class8.field19;
        this.field20 = n2 * this.field20 + n3 * class8.field20;
    }
    
    public final void method104(final Class8 class8, final Class8 class9, final double n) {
        double a = class9.field18 * class8.field18 + class9.field19 * class8.field19 + class9.field20 * class8.field20 + class9.field21 * class8.field21;
        if (a < 0.0) {
            class8.field18 = -class8.field18;
            class8.field19 = -class8.field19;
            class8.field20 = -class8.field20;
            class8.field21 = -class8.field21;
            a = -a;
        }
        double n2;
        double n3;
        if (1.0 - a <= 1.0E-6) {
            n2 = 1.0 - n;
            n3 = n;
        }
        else {
            final double acos = Math.acos(a);
            final double sin = Math.sin(acos);
            n2 = Math.sin((1.0 - n) * acos) / sin;
            n3 = Math.sin(n * acos) / sin;
        }
        this.field21 = n2 * class8.field21 + n3 * class9.field21;
        this.field18 = n2 * class8.field18 + n3 * class9.field18;
        this.field19 = n2 * class8.field19 + n3 * class9.field19;
        this.field20 = n2 * class8.field20 + n3 * class9.field20;
    }
}
