// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2278 extends Class2275 implements Serializable
{
    private static String[] field13870;
    public static final long field13871 = 2675933778405442383L;
    public static final double field13872 = 1.0E-6;
    public static final double field13873 = 1.0E-30;
    public static final double field13874 = 1.57079632679;
    
    public Class2278(final float n, final float n2, final float n3, final float n4) {
        final float n5 = (float)(1.0 / Math.sqrt(n * n + n2 * n2 + n3 * n3 + n4 * n4));
        this.field13863 = n * n5;
        this.field13864 = n2 * n5;
        this.field13865 = n3 * n5;
        this.field13866 = n4 * n5;
    }
    
    public Class2278(final float[] array) {
        final float n = (float)(1.0 / Math.sqrt(array[0] * array[0] + array[1] * array[1] + array[2] * array[2] + array[3] * array[3]));
        this.field13863 = array[0] * n;
        this.field13864 = array[1] * n;
        this.field13865 = array[2] * n;
        this.field13866 = array[3] * n;
    }
    
    public Class2278(final Class2278 class2278) {
        super(class2278);
    }
    
    public Class2278(final Class8 class8) {
        super(class8);
    }
    
    public Class2278(final Class2275 class2275) {
        final float n = (float)(1.0 / Math.sqrt(class2275.field13863 * class2275.field13863 + class2275.field13864 * class2275.field13864 + class2275.field13865 * class2275.field13865 + class2275.field13866 * class2275.field13866));
        this.field13863 = class2275.field13863 * n;
        this.field13864 = class2275.field13864 * n;
        this.field13865 = class2275.field13865 * n;
        this.field13866 = class2275.field13866 * n;
    }
    
    public Class2278(final Class7 class7) {
        final double n = 1.0 / Math.sqrt(class7.field18 * class7.field18 + class7.field19 * class7.field19 + class7.field20 * class7.field20 + class7.field21 * class7.field21);
        this.field13863 = (float)(class7.field18 * n);
        this.field13864 = (float)(class7.field19 * n);
        this.field13865 = (float)(class7.field20 * n);
        this.field13866 = (float)(class7.field21 * n);
    }
    
    public Class2278() {
    }
    
    public final void method8698(final Class2278 class2278) {
        this.field13863 = -class2278.field13863;
        this.field13864 = -class2278.field13864;
        this.field13865 = -class2278.field13865;
        this.field13866 = class2278.field13866;
    }
    
    public final void method8699() {
        this.field13863 = -this.field13863;
        this.field13864 = -this.field13864;
        this.field13865 = -this.field13865;
    }
    
    public final void method8700(final Class2278 class2278, final Class2278 class2279) {
        if (this != class2278 && this != class2279) {
            this.field13866 = class2278.field13866 * class2279.field13866 - class2278.field13863 * class2279.field13863 - class2278.field13864 * class2279.field13864 - class2278.field13865 * class2279.field13865;
            this.field13863 = class2278.field13866 * class2279.field13863 + class2279.field13866 * class2278.field13863 + class2278.field13864 * class2279.field13865 - class2278.field13865 * class2279.field13864;
            this.field13864 = class2278.field13866 * class2279.field13864 + class2279.field13866 * class2278.field13864 - class2278.field13863 * class2279.field13865 + class2278.field13865 * class2279.field13863;
            this.field13865 = class2278.field13866 * class2279.field13865 + class2279.field13866 * class2278.field13865 + class2278.field13863 * class2279.field13864 - class2278.field13864 * class2279.field13863;
        }
        else {
            final float field13866 = class2278.field13866 * class2279.field13866 - class2278.field13863 * class2279.field13863 - class2278.field13864 * class2279.field13864 - class2278.field13865 * class2279.field13865;
            final float field13867 = class2278.field13866 * class2279.field13863 + class2279.field13866 * class2278.field13863 + class2278.field13864 * class2279.field13865 - class2278.field13865 * class2279.field13864;
            final float field13868 = class2278.field13866 * class2279.field13864 + class2279.field13866 * class2278.field13864 - class2278.field13863 * class2279.field13865 + class2278.field13865 * class2279.field13863;
            this.field13865 = class2278.field13866 * class2279.field13865 + class2279.field13866 * class2278.field13865 + class2278.field13863 * class2279.field13864 - class2278.field13864 * class2279.field13863;
            this.field13866 = field13866;
            this.field13863 = field13867;
            this.field13864 = field13868;
        }
    }
    
    public final void method8701(final Class2278 class2278) {
        final float field13866 = this.field13866 * class2278.field13866 - this.field13863 * class2278.field13863 - this.field13864 * class2278.field13864 - this.field13865 * class2278.field13865;
        final float field13867 = this.field13866 * class2278.field13863 + class2278.field13866 * this.field13863 + this.field13864 * class2278.field13865 - this.field13865 * class2278.field13864;
        final float field13868 = this.field13866 * class2278.field13864 + class2278.field13866 * this.field13864 - this.field13863 * class2278.field13865 + this.field13865 * class2278.field13863;
        this.field13865 = this.field13866 * class2278.field13865 + class2278.field13866 * this.field13865 + this.field13863 * class2278.field13864 - this.field13864 * class2278.field13863;
        this.field13866 = field13866;
        this.field13863 = field13867;
        this.field13864 = field13868;
    }
    
    public final void method8702(final Class2278 class2278, final Class2278 class2279) {
        final Class2278 class2280 = new Class2278(class2279);
        class2280.method8705();
        this.method8700(class2278, class2280);
    }
    
    public final void method8703(final Class2278 class2278) {
        final Class2278 class2279 = new Class2278(class2278);
        class2279.method8705();
        this.method8701(class2279);
    }
    
    public final void method8704(final Class2278 class2278) {
        final float n = 1.0f / (class2278.field13866 * class2278.field13866 + class2278.field13863 * class2278.field13863 + class2278.field13864 * class2278.field13864 + class2278.field13865 * class2278.field13865);
        this.field13866 = n * class2278.field13866;
        this.field13863 = -n * class2278.field13863;
        this.field13864 = -n * class2278.field13864;
        this.field13865 = -n * class2278.field13865;
    }
    
    public final void method8705() {
        final float n = 1.0f / (this.field13866 * this.field13866 + this.field13863 * this.field13863 + this.field13864 * this.field13864 + this.field13865 * this.field13865);
        this.field13866 *= n;
        this.field13863 *= -n;
        this.field13864 *= -n;
        this.field13865 *= -n;
    }
    
    public final void method8706(final Class2278 class2278) {
        final float n = class2278.field13863 * class2278.field13863 + class2278.field13864 * class2278.field13864 + class2278.field13865 * class2278.field13865 + class2278.field13866 * class2278.field13866;
        if (n <= 0.0f) {
            this.field13863 = 0.0f;
            this.field13864 = 0.0f;
            this.field13865 = 0.0f;
            this.field13866 = 0.0f;
        }
        else {
            final float n2 = 1.0f / (float)Math.sqrt(n);
            this.field13863 = n2 * class2278.field13863;
            this.field13864 = n2 * class2278.field13864;
            this.field13865 = n2 * class2278.field13865;
            this.field13866 = n2 * class2278.field13866;
        }
    }
    
    public final void method8707() {
        final float n = this.field13863 * this.field13863 + this.field13864 * this.field13864 + this.field13865 * this.field13865 + this.field13866 * this.field13866;
        if (n <= 0.0f) {
            this.field13863 = 0.0f;
            this.field13864 = 0.0f;
            this.field13865 = 0.0f;
            this.field13866 = 0.0f;
        }
        else {
            final float n2 = 1.0f / (float)Math.sqrt(n);
            this.field13863 *= n2;
            this.field13864 *= n2;
            this.field13865 *= n2;
            this.field13866 *= n2;
        }
    }
    
    public final void method8708(final Class2284 class2284) {
        final float n = 0.25f * (class2284.field13891 + class2284.field13896 + class2284.field13901 + class2284.field13906);
        if (n < 0.0f) {
            this.field13866 = 0.0f;
            this.field13863 = 0.0f;
            this.field13864 = 0.0f;
            this.field13865 = 1.0f;
            return;
        }
        if (n >= 1.0E-30) {
            this.field13866 = (float)Math.sqrt(n);
            final float n2 = 0.25f / this.field13866;
            this.field13863 = (class2284.field13900 - class2284.field13897) * n2;
            this.field13864 = (class2284.field13893 - class2284.field13899) * n2;
            this.field13865 = (class2284.field13895 - class2284.field13892) * n2;
            return;
        }
        this.field13866 = 0.0f;
        final float n3 = -0.5f * (class2284.field13896 + class2284.field13901);
        if (n3 < 0.0f) {
            this.field13863 = 0.0f;
            this.field13864 = 0.0f;
            this.field13865 = 1.0f;
            return;
        }
        if (n3 >= 1.0E-30) {
            this.field13863 = (float)Math.sqrt(n3);
            final float n4 = 1.0f / (2.0f * this.field13863);
            this.field13864 = class2284.field13895 * n4;
            this.field13865 = class2284.field13899 * n4;
            return;
        }
        this.field13863 = 0.0f;
        final float n5 = 0.5f * (1.0f - class2284.field13901);
        if (n5 < 1.0E-30) {
            this.field13864 = 0.0f;
            this.field13865 = 1.0f;
            return;
        }
        this.field13864 = (float)Math.sqrt(n5);
        this.field13865 = class2284.field13900 / (2.0f * this.field13864);
    }
    
    public final void method8709(final Class2304 class2304) {
        final double a = 0.25 * (class2304.field13961 + class2304.field13966 + class2304.field13971 + class2304.field13976);
        if (a < 0.0) {
            this.field13866 = 0.0f;
            this.field13863 = 0.0f;
            this.field13864 = 0.0f;
            this.field13865 = 1.0f;
            return;
        }
        if (a >= 1.0E-30) {
            this.field13866 = (float)Math.sqrt(a);
            final double n = 0.25 / this.field13866;
            this.field13863 = (float)((class2304.field13970 - class2304.field13967) * n);
            this.field13864 = (float)((class2304.field13963 - class2304.field13969) * n);
            this.field13865 = (float)((class2304.field13965 - class2304.field13962) * n);
            return;
        }
        this.field13866 = 0.0f;
        final double a2 = -0.5 * (class2304.field13966 + class2304.field13971);
        if (a2 < 0.0) {
            this.field13863 = 0.0f;
            this.field13864 = 0.0f;
            this.field13865 = 1.0f;
            return;
        }
        if (a2 >= 1.0E-30) {
            this.field13863 = (float)Math.sqrt(a2);
            final double n2 = 0.5 / this.field13863;
            this.field13864 = (float)(class2304.field13965 * n2);
            this.field13865 = (float)(class2304.field13969 * n2);
            return;
        }
        this.field13863 = 0.0f;
        final double a3 = 0.5 * (1.0 - class2304.field13971);
        if (a3 < 1.0E-30) {
            this.field13864 = 0.0f;
            this.field13865 = 1.0f;
            return;
        }
        this.field13864 = (float)Math.sqrt(a3);
        this.field13865 = (float)(class2304.field13970 / (2.0 * this.field13864));
    }
    
    public final void method8710(final Class2296 class2296) {
        final float n = 0.25f * (class2296.field13935 + class2296.field13939 + class2296.field13943 + 1.0f);
        if (n < 0.0f) {
            this.field13866 = 0.0f;
            this.field13863 = 0.0f;
            this.field13864 = 0.0f;
            this.field13865 = 1.0f;
            return;
        }
        if (n >= 1.0E-30) {
            this.field13866 = (float)Math.sqrt(n);
            final float n2 = 0.25f / this.field13866;
            this.field13863 = (class2296.field13942 - class2296.field13940) * n2;
            this.field13864 = (class2296.field13937 - class2296.field13941) * n2;
            this.field13865 = (class2296.field13938 - class2296.field13936) * n2;
            return;
        }
        this.field13866 = 0.0f;
        final float n3 = -0.5f * (class2296.field13939 + class2296.field13943);
        if (n3 < 0.0f) {
            this.field13863 = 0.0f;
            this.field13864 = 0.0f;
            this.field13865 = 1.0f;
            return;
        }
        if (n3 >= 1.0E-30) {
            this.field13863 = (float)Math.sqrt(n3);
            final float n4 = 0.5f / this.field13863;
            this.field13864 = class2296.field13938 * n4;
            this.field13865 = class2296.field13941 * n4;
            return;
        }
        this.field13863 = 0.0f;
        final float n5 = 0.5f * (1.0f - class2296.field13943);
        if (n5 < 1.0E-30) {
            this.field13864 = 0.0f;
            this.field13865 = 1.0f;
            return;
        }
        this.field13864 = (float)Math.sqrt(n5);
        this.field13865 = class2296.field13942 / (2.0f * this.field13864);
    }
    
    public final void method8711(final Class2274 class2274) {
        final double a = 0.25 * (class2274.field13845 + class2274.field13849 + class2274.field13853 + 1.0);
        if (a < 0.0) {
            this.field13866 = 0.0f;
            this.field13863 = 0.0f;
            this.field13864 = 0.0f;
            this.field13865 = 1.0f;
            return;
        }
        if (a >= 1.0E-30) {
            this.field13866 = (float)Math.sqrt(a);
            final double n = 0.25 / this.field13866;
            this.field13863 = (float)((class2274.field13852 - class2274.field13850) * n);
            this.field13864 = (float)((class2274.field13847 - class2274.field13851) * n);
            this.field13865 = (float)((class2274.field13848 - class2274.field13846) * n);
            return;
        }
        this.field13866 = 0.0f;
        final double a2 = -0.5 * (class2274.field13849 + class2274.field13853);
        if (a2 < 0.0) {
            this.field13863 = 0.0f;
            this.field13864 = 0.0f;
            this.field13865 = 1.0f;
            return;
        }
        if (a2 >= 1.0E-30) {
            this.field13863 = (float)Math.sqrt(a2);
            final double n2 = 0.5 / this.field13863;
            this.field13864 = (float)(class2274.field13848 * n2);
            this.field13865 = (float)(class2274.field13851 * n2);
            return;
        }
        this.field13863 = 0.0f;
        final double a3 = 0.5 * (1.0 - class2274.field13853);
        if (a3 < 1.0E-30) {
            this.field13864 = 0.0f;
            this.field13865 = 1.0f;
            return;
        }
        this.field13864 = (float)Math.sqrt(a3);
        this.field13865 = (float)(class2274.field13852 / (2.0 * this.field13864));
    }
    
    public final void method8712(final Class2307 class2307) {
        final float n = (float)Math.sqrt(class2307.field13985 * class2307.field13985 + class2307.field13986 * class2307.field13986 + class2307.field13987 * class2307.field13987);
        if (n >= 1.0E-6) {
            final float n2 = 1.0f / n;
            final float n3 = (float)Math.sin(class2307.field13988 / 2.0);
            this.field13866 = (float)Math.cos(class2307.field13988 / 2.0);
            this.field13863 = class2307.field13985 * n2 * n3;
            this.field13864 = class2307.field13986 * n2 * n3;
            this.field13865 = class2307.field13987 * n2 * n3;
        }
        else {
            this.field13866 = 0.0f;
            this.field13863 = 0.0f;
            this.field13864 = 0.0f;
            this.field13865 = 0.0f;
        }
    }
    
    public final void method8713(final Class24 class24) {
        final float n = (float)(1.0 / Math.sqrt(class24.field67 * class24.field67 + class24.field68 * class24.field68 + class24.field69 * class24.field69));
        if (n >= 1.0E-6) {
            final float n2 = 1.0f / n;
            final float n3 = (float)Math.sin(class24.field70 / 2.0);
            this.field13866 = (float)Math.cos(class24.field70 / 2.0);
            this.field13863 = (float)class24.field67 * n2 * n3;
            this.field13864 = (float)class24.field68 * n2 * n3;
            this.field13865 = (float)class24.field69 * n2 * n3;
        }
        else {
            this.field13866 = 0.0f;
            this.field13863 = 0.0f;
            this.field13864 = 0.0f;
            this.field13865 = 0.0f;
        }
    }
    
    public final void method8714(final Class2278 class2278, final float n) {
        double a = this.field13863 * class2278.field13863 + this.field13864 * class2278.field13864 + this.field13865 * class2278.field13865 + this.field13866 * class2278.field13866;
        if (a < 0.0) {
            class2278.field13863 = -class2278.field13863;
            class2278.field13864 = -class2278.field13864;
            class2278.field13865 = -class2278.field13865;
            class2278.field13866 = -class2278.field13866;
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
        this.field13866 = (float)(n2 * this.field13866 + n3 * class2278.field13866);
        this.field13863 = (float)(n2 * this.field13863 + n3 * class2278.field13863);
        this.field13864 = (float)(n2 * this.field13864 + n3 * class2278.field13864);
        this.field13865 = (float)(n2 * this.field13865 + n3 * class2278.field13865);
    }
    
    public final void method8715(final Class2278 class2278, final Class2278 class2279, final float n) {
        double a = class2279.field13863 * class2278.field13863 + class2279.field13864 * class2278.field13864 + class2279.field13865 * class2278.field13865 + class2279.field13866 * class2278.field13866;
        if (a < 0.0) {
            class2278.field13863 = -class2278.field13863;
            class2278.field13864 = -class2278.field13864;
            class2278.field13865 = -class2278.field13865;
            class2278.field13866 = -class2278.field13866;
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
        this.field13866 = (float)(n2 * class2278.field13866 + n3 * class2279.field13866);
        this.field13863 = (float)(n2 * class2278.field13863 + n3 * class2279.field13863);
        this.field13864 = (float)(n2 * class2278.field13864 + n3 * class2279.field13864);
        this.field13865 = (float)(n2 * class2278.field13865 + n3 * class2279.field13865);
    }
}
