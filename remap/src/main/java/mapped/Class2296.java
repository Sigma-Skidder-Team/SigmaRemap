// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2296 implements Serializable, Cloneable
{
    public static final long field13934 = 329697160112089834L;
    public float field13935;
    public float field13936;
    public float field13937;
    public float field13938;
    public float field13939;
    public float field13940;
    public float field13941;
    public float field13942;
    public float field13943;
    private static final double field13944 = 1.0E-8;
    
    public Class2296(final float field13935, final float field13936, final float field13937, final float field13938, final float field13939, final float field13940, final float field13941, final float field13942, final float field13943) {
        this.field13935 = field13935;
        this.field13936 = field13936;
        this.field13937 = field13937;
        this.field13938 = field13938;
        this.field13939 = field13939;
        this.field13940 = field13940;
        this.field13941 = field13941;
        this.field13942 = field13942;
        this.field13943 = field13943;
    }
    
    public Class2296(final float[] array) {
        this.field13935 = array[0];
        this.field13936 = array[1];
        this.field13937 = array[2];
        this.field13938 = array[3];
        this.field13939 = array[4];
        this.field13940 = array[5];
        this.field13941 = array[6];
        this.field13942 = array[7];
        this.field13943 = array[8];
    }
    
    public Class2296(final Class2274 class2274) {
        this.field13935 = (float)class2274.field13845;
        this.field13936 = (float)class2274.field13846;
        this.field13937 = (float)class2274.field13847;
        this.field13938 = (float)class2274.field13848;
        this.field13939 = (float)class2274.field13849;
        this.field13940 = (float)class2274.field13850;
        this.field13941 = (float)class2274.field13851;
        this.field13942 = (float)class2274.field13852;
        this.field13943 = (float)class2274.field13853;
    }
    
    public Class2296(final Class2296 class2296) {
        this.field13935 = class2296.field13935;
        this.field13936 = class2296.field13936;
        this.field13937 = class2296.field13937;
        this.field13938 = class2296.field13938;
        this.field13939 = class2296.field13939;
        this.field13940 = class2296.field13940;
        this.field13941 = class2296.field13941;
        this.field13942 = class2296.field13942;
        this.field13943 = class2296.field13943;
    }
    
    public Class2296() {
        this.field13935 = 0.0f;
        this.field13936 = 0.0f;
        this.field13937 = 0.0f;
        this.field13938 = 0.0f;
        this.field13939 = 0.0f;
        this.field13940 = 0.0f;
        this.field13941 = 0.0f;
        this.field13942 = 0.0f;
        this.field13943 = 0.0f;
    }
    
    @Override
    public String toString() {
        return this.field13935 + ", " + this.field13936 + ", " + this.field13937 + "\n" + this.field13938 + ", " + this.field13939 + ", " + this.field13940 + "\n" + this.field13941 + ", " + this.field13942 + ", " + this.field13943 + "\n";
    }
    
    public final void method9062() {
        this.field13935 = 1.0f;
        this.field13936 = 0.0f;
        this.field13937 = 0.0f;
        this.field13938 = 0.0f;
        this.field13939 = 1.0f;
        this.field13940 = 0.0f;
        this.field13941 = 0.0f;
        this.field13942 = 0.0f;
        this.field13943 = 1.0f;
    }
    
    public final void method9063(final float n) {
        final double[] array = new double[9];
        this.method9121(new double[3], array);
        this.field13935 = (float)(array[0] * n);
        this.field13936 = (float)(array[1] * n);
        this.field13937 = (float)(array[2] * n);
        this.field13938 = (float)(array[3] * n);
        this.field13939 = (float)(array[4] * n);
        this.field13940 = (float)(array[5] * n);
        this.field13941 = (float)(array[6] * n);
        this.field13942 = (float)(array[7] * n);
        this.field13943 = (float)(array[8] * n);
    }
    
    public final void method9064(final int n, final int n2, final float field13943) {
        Label_0248: {
            switch (n) {
                case 0: {
                    switch (n2) {
                        case 0: {
                            this.field13935 = field13943;
                            break Label_0248;
                        }
                        case 1: {
                            this.field13936 = field13943;
                            break Label_0248;
                        }
                        case 2: {
                            this.field13937 = field13943;
                            break Label_0248;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f0"));
                        }
                    }
                    break;
                }
                case 1: {
                    switch (n2) {
                        case 0: {
                            this.field13938 = field13943;
                            break Label_0248;
                        }
                        case 1: {
                            this.field13939 = field13943;
                            break Label_0248;
                        }
                        case 2: {
                            this.field13940 = field13943;
                            break Label_0248;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f0"));
                        }
                    }
                    break;
                }
                case 2: {
                    switch (n2) {
                        case 0: {
                            this.field13941 = field13943;
                            break Label_0248;
                        }
                        case 1: {
                            this.field13942 = field13943;
                            break Label_0248;
                        }
                        case 2: {
                            this.field13943 = field13943;
                            break Label_0248;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f0"));
                        }
                    }
                    break;
                }
                default: {
                    throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f0"));
                }
            }
        }
    }
    
    public final void method9065(final int n, final Class2288 class2288) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f1"));
                }
                class2288.field13909 = this.field13941;
                class2288.field13910 = this.field13942;
                class2288.field13911 = this.field13943;
            }
            else {
                class2288.field13909 = this.field13938;
                class2288.field13910 = this.field13939;
                class2288.field13911 = this.field13940;
            }
        }
        else {
            class2288.field13909 = this.field13935;
            class2288.field13910 = this.field13936;
            class2288.field13911 = this.field13937;
        }
    }
    
    public final void method9066(final int n, final float[] array) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f1"));
                }
                array[0] = this.field13941;
                array[1] = this.field13942;
                array[2] = this.field13943;
            }
            else {
                array[0] = this.field13938;
                array[1] = this.field13939;
                array[2] = this.field13940;
            }
        }
        else {
            array[0] = this.field13935;
            array[1] = this.field13936;
            array[2] = this.field13937;
        }
    }
    
    public final void method9067(final int n, final Class2288 class2288) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f3"));
                }
                class2288.field13909 = this.field13937;
                class2288.field13910 = this.field13940;
                class2288.field13911 = this.field13943;
            }
            else {
                class2288.field13909 = this.field13936;
                class2288.field13910 = this.field13939;
                class2288.field13911 = this.field13942;
            }
        }
        else {
            class2288.field13909 = this.field13935;
            class2288.field13910 = this.field13938;
            class2288.field13911 = this.field13941;
        }
    }
    
    public final void method9068(final int n, final float[] array) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f3"));
                }
                array[0] = this.field13937;
                array[1] = this.field13940;
                array[2] = this.field13943;
            }
            else {
                array[0] = this.field13936;
                array[1] = this.field13939;
                array[2] = this.field13942;
            }
        }
        else {
            array[0] = this.field13935;
            array[1] = this.field13938;
            array[2] = this.field13941;
        }
    }
    
    public final float method9069(final int n, final int n2) {
        Label_0179: {
            switch (n) {
                case 0: {
                    switch (n2) {
                        case 0: {
                            return this.field13935;
                        }
                        case 1: {
                            return this.field13936;
                        }
                        case 2: {
                            return this.field13937;
                        }
                        default: {
                            break Label_0179;
                        }
                    }
                    break;
                }
                case 1: {
                    switch (n2) {
                        case 0: {
                            return this.field13938;
                        }
                        case 1: {
                            return this.field13939;
                        }
                        case 2: {
                            return this.field13940;
                        }
                        default: {
                            break Label_0179;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (n2) {
                        case 0: {
                            return this.field13941;
                        }
                        case 1: {
                            return this.field13942;
                        }
                        case 2: {
                            return this.field13943;
                        }
                        default: {
                            break Label_0179;
                        }
                    }
                    break;
                }
            }
        }
        throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f5"));
    }
    
    public final void method9070(final int n, final float field13941, final float field13942, final float field13943) {
        switch (n) {
            case 0: {
                this.field13935 = field13941;
                this.field13936 = field13942;
                this.field13937 = field13943;
                break;
            }
            case 1: {
                this.field13938 = field13941;
                this.field13939 = field13942;
                this.field13940 = field13943;
                break;
            }
            case 2: {
                this.field13941 = field13941;
                this.field13942 = field13942;
                this.field13943 = field13943;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f6"));
            }
        }
    }
    
    public final void method9071(final int n, final Class2288 class2288) {
        switch (n) {
            case 0: {
                this.field13935 = class2288.field13909;
                this.field13936 = class2288.field13910;
                this.field13937 = class2288.field13911;
                break;
            }
            case 1: {
                this.field13938 = class2288.field13909;
                this.field13939 = class2288.field13910;
                this.field13940 = class2288.field13911;
                break;
            }
            case 2: {
                this.field13941 = class2288.field13909;
                this.field13942 = class2288.field13910;
                this.field13943 = class2288.field13911;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f6"));
            }
        }
    }
    
    public final void method9072(final int n, final float[] array) {
        switch (n) {
            case 0: {
                this.field13935 = array[0];
                this.field13936 = array[1];
                this.field13937 = array[2];
                break;
            }
            case 1: {
                this.field13938 = array[0];
                this.field13939 = array[1];
                this.field13940 = array[2];
                break;
            }
            case 2: {
                this.field13941 = array[0];
                this.field13942 = array[1];
                this.field13943 = array[2];
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f6"));
            }
        }
    }
    
    public final void method9073(final int n, final float field13937, final float field13938, final float field13939) {
        switch (n) {
            case 0: {
                this.field13935 = field13937;
                this.field13938 = field13938;
                this.field13941 = field13939;
                break;
            }
            case 1: {
                this.field13936 = field13937;
                this.field13939 = field13938;
                this.field13942 = field13939;
                break;
            }
            case 2: {
                this.field13937 = field13937;
                this.field13940 = field13938;
                this.field13943 = field13939;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f9"));
            }
        }
    }
    
    public final void method9074(final int n, final Class2288 class2288) {
        switch (n) {
            case 0: {
                this.field13935 = class2288.field13909;
                this.field13938 = class2288.field13910;
                this.field13941 = class2288.field13911;
                break;
            }
            case 1: {
                this.field13936 = class2288.field13909;
                this.field13939 = class2288.field13910;
                this.field13942 = class2288.field13911;
                break;
            }
            case 2: {
                this.field13937 = class2288.field13909;
                this.field13940 = class2288.field13910;
                this.field13943 = class2288.field13911;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f9"));
            }
        }
    }
    
    public final void method9075(final int n, final float[] array) {
        switch (n) {
            case 0: {
                this.field13935 = array[0];
                this.field13938 = array[1];
                this.field13941 = array[2];
                break;
            }
            case 1: {
                this.field13936 = array[0];
                this.field13939 = array[1];
                this.field13942 = array[2];
                break;
            }
            case 2: {
                this.field13937 = array[0];
                this.field13940 = array[1];
                this.field13943 = array[2];
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix3f9"));
            }
        }
    }
    
    public final float method9076() {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method9121(array2, array);
        return (float)Class2274.method8636(array2);
    }
    
    public final void method9077(final float n) {
        this.field13935 += n;
        this.field13936 += n;
        this.field13937 += n;
        this.field13938 += n;
        this.field13939 += n;
        this.field13940 += n;
        this.field13941 += n;
        this.field13942 += n;
        this.field13943 += n;
    }
    
    public final void method9078(final float n, final Class2296 class2296) {
        this.field13935 = class2296.field13935 + n;
        this.field13936 = class2296.field13936 + n;
        this.field13937 = class2296.field13937 + n;
        this.field13938 = class2296.field13938 + n;
        this.field13939 = class2296.field13939 + n;
        this.field13940 = class2296.field13940 + n;
        this.field13941 = class2296.field13941 + n;
        this.field13942 = class2296.field13942 + n;
        this.field13943 = class2296.field13943 + n;
    }
    
    public final void method9079(final Class2296 class2296, final Class2296 class2297) {
        this.field13935 = class2296.field13935 + class2297.field13935;
        this.field13936 = class2296.field13936 + class2297.field13936;
        this.field13937 = class2296.field13937 + class2297.field13937;
        this.field13938 = class2296.field13938 + class2297.field13938;
        this.field13939 = class2296.field13939 + class2297.field13939;
        this.field13940 = class2296.field13940 + class2297.field13940;
        this.field13941 = class2296.field13941 + class2297.field13941;
        this.field13942 = class2296.field13942 + class2297.field13942;
        this.field13943 = class2296.field13943 + class2297.field13943;
    }
    
    public final void method9080(final Class2296 class2296) {
        this.field13935 += class2296.field13935;
        this.field13936 += class2296.field13936;
        this.field13937 += class2296.field13937;
        this.field13938 += class2296.field13938;
        this.field13939 += class2296.field13939;
        this.field13940 += class2296.field13940;
        this.field13941 += class2296.field13941;
        this.field13942 += class2296.field13942;
        this.field13943 += class2296.field13943;
    }
    
    public final void method9081(final Class2296 class2296, final Class2296 class2297) {
        this.field13935 = class2296.field13935 - class2297.field13935;
        this.field13936 = class2296.field13936 - class2297.field13936;
        this.field13937 = class2296.field13937 - class2297.field13937;
        this.field13938 = class2296.field13938 - class2297.field13938;
        this.field13939 = class2296.field13939 - class2297.field13939;
        this.field13940 = class2296.field13940 - class2297.field13940;
        this.field13941 = class2296.field13941 - class2297.field13941;
        this.field13942 = class2296.field13942 - class2297.field13942;
        this.field13943 = class2296.field13943 - class2297.field13943;
    }
    
    public final void method9082(final Class2296 class2296) {
        this.field13935 -= class2296.field13935;
        this.field13936 -= class2296.field13936;
        this.field13937 -= class2296.field13937;
        this.field13938 -= class2296.field13938;
        this.field13939 -= class2296.field13939;
        this.field13940 -= class2296.field13940;
        this.field13941 -= class2296.field13941;
        this.field13942 -= class2296.field13942;
        this.field13943 -= class2296.field13943;
    }
    
    public final void method9083() {
        final float field13938 = this.field13938;
        this.field13938 = this.field13936;
        this.field13936 = field13938;
        final float field13939 = this.field13941;
        this.field13941 = this.field13937;
        this.field13937 = field13939;
        final float field13940 = this.field13942;
        this.field13942 = this.field13940;
        this.field13940 = field13940;
    }
    
    public final void method9084(final Class2296 class2296) {
        if (this == class2296) {
            this.method9083();
        }
        else {
            this.field13935 = class2296.field13935;
            this.field13936 = class2296.field13938;
            this.field13937 = class2296.field13941;
            this.field13938 = class2296.field13936;
            this.field13939 = class2296.field13939;
            this.field13940 = class2296.field13942;
            this.field13941 = class2296.field13937;
            this.field13942 = class2296.field13940;
            this.field13943 = class2296.field13943;
        }
    }
    
    public final void method9085(final Class2278 class2278) {
        this.field13935 = 1.0f - 2.0f * class2278.field13864 * class2278.field13864 - 2.0f * class2278.field13865 * class2278.field13865;
        this.field13938 = 2.0f * (class2278.field13863 * class2278.field13864 + class2278.field13866 * class2278.field13865);
        this.field13941 = 2.0f * (class2278.field13863 * class2278.field13865 - class2278.field13866 * class2278.field13864);
        this.field13936 = 2.0f * (class2278.field13863 * class2278.field13864 - class2278.field13866 * class2278.field13865);
        this.field13939 = 1.0f - 2.0f * class2278.field13863 * class2278.field13863 - 2.0f * class2278.field13865 * class2278.field13865;
        this.field13942 = 2.0f * (class2278.field13864 * class2278.field13865 + class2278.field13866 * class2278.field13863);
        this.field13937 = 2.0f * (class2278.field13863 * class2278.field13865 + class2278.field13866 * class2278.field13864);
        this.field13940 = 2.0f * (class2278.field13864 * class2278.field13865 - class2278.field13866 * class2278.field13863);
        this.field13943 = 1.0f - 2.0f * class2278.field13863 * class2278.field13863 - 2.0f * class2278.field13864 * class2278.field13864;
    }
    
    public final void method9086(final Class2307 class2307) {
        final float n = (float)Math.sqrt(class2307.field13985 * class2307.field13985 + class2307.field13986 * class2307.field13986 + class2307.field13987 * class2307.field13987);
        if (n >= 1.0E-8) {
            final float n2 = 1.0f / n;
            final float n3 = class2307.field13985 * n2;
            final float n4 = class2307.field13986 * n2;
            final float n5 = class2307.field13987 * n2;
            final float n6 = (float)Math.sin(class2307.field13988);
            final float n7 = (float)Math.cos(class2307.field13988);
            final float n8 = 1.0f - n7;
            final float n9 = n3 * n5;
            final float n10 = n3 * n4;
            final float n11 = n4 * n5;
            this.field13935 = n8 * n3 * n3 + n7;
            this.field13936 = n8 * n10 - n6 * n5;
            this.field13937 = n8 * n9 + n6 * n4;
            this.field13938 = n8 * n10 + n6 * n5;
            this.field13939 = n8 * n4 * n4 + n7;
            this.field13940 = n8 * n11 - n6 * n3;
            this.field13941 = n8 * n9 - n6 * n4;
            this.field13942 = n8 * n11 + n6 * n3;
            this.field13943 = n8 * n5 * n5 + n7;
        }
        else {
            this.field13935 = 1.0f;
            this.field13936 = 0.0f;
            this.field13937 = 0.0f;
            this.field13938 = 0.0f;
            this.field13939 = 1.0f;
            this.field13940 = 0.0f;
            this.field13941 = 0.0f;
            this.field13942 = 0.0f;
            this.field13943 = 1.0f;
        }
    }
    
    public final void method9087(final Class24 class24) {
        final double sqrt = Math.sqrt(class24.field67 * class24.field67 + class24.field68 * class24.field68 + class24.field69 * class24.field69);
        if (sqrt >= 1.0E-8) {
            final double n = 1.0 / sqrt;
            final double n2 = class24.field67 * n;
            final double n3 = class24.field68 * n;
            final double n4 = class24.field69 * n;
            final double sin = Math.sin(class24.field70);
            final double cos = Math.cos(class24.field70);
            final double n5 = 1.0 - cos;
            final double n6 = n2 * n4;
            final double n7 = n2 * n3;
            final double n8 = n3 * n4;
            this.field13935 = (float)(n5 * n2 * n2 + cos);
            this.field13936 = (float)(n5 * n7 - sin * n4);
            this.field13937 = (float)(n5 * n6 + sin * n3);
            this.field13938 = (float)(n5 * n7 + sin * n4);
            this.field13939 = (float)(n5 * n3 * n3 + cos);
            this.field13940 = (float)(n5 * n8 - sin * n2);
            this.field13941 = (float)(n5 * n6 - sin * n3);
            this.field13942 = (float)(n5 * n8 + sin * n2);
            this.field13943 = (float)(n5 * n4 * n4 + cos);
        }
        else {
            this.field13935 = 1.0f;
            this.field13936 = 0.0f;
            this.field13937 = 0.0f;
            this.field13938 = 0.0f;
            this.field13939 = 1.0f;
            this.field13940 = 0.0f;
            this.field13941 = 0.0f;
            this.field13942 = 0.0f;
            this.field13943 = 1.0f;
        }
    }
    
    public final void method9088(final Class8 class8) {
        this.field13935 = (float)(1.0 - 2.0 * class8.field19 * class8.field19 - 2.0 * class8.field20 * class8.field20);
        this.field13938 = (float)(2.0 * (class8.field18 * class8.field19 + class8.field21 * class8.field20));
        this.field13941 = (float)(2.0 * (class8.field18 * class8.field20 - class8.field21 * class8.field19));
        this.field13936 = (float)(2.0 * (class8.field18 * class8.field19 - class8.field21 * class8.field20));
        this.field13939 = (float)(1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field20 * class8.field20);
        this.field13942 = (float)(2.0 * (class8.field19 * class8.field20 + class8.field21 * class8.field18));
        this.field13937 = (float)(2.0 * (class8.field18 * class8.field20 + class8.field21 * class8.field19));
        this.field13940 = (float)(2.0 * (class8.field19 * class8.field20 - class8.field21 * class8.field18));
        this.field13943 = (float)(1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field19 * class8.field19);
    }
    
    public final void method9089(final float[] array) {
        this.field13935 = array[0];
        this.field13936 = array[1];
        this.field13937 = array[2];
        this.field13938 = array[3];
        this.field13939 = array[4];
        this.field13940 = array[5];
        this.field13941 = array[6];
        this.field13942 = array[7];
        this.field13943 = array[8];
    }
    
    public final void method9090(final Class2296 class2296) {
        this.field13935 = class2296.field13935;
        this.field13936 = class2296.field13936;
        this.field13937 = class2296.field13937;
        this.field13938 = class2296.field13938;
        this.field13939 = class2296.field13939;
        this.field13940 = class2296.field13940;
        this.field13941 = class2296.field13941;
        this.field13942 = class2296.field13942;
        this.field13943 = class2296.field13943;
    }
    
    public final void method9091(final Class2274 class2274) {
        this.field13935 = (float)class2274.field13845;
        this.field13936 = (float)class2274.field13846;
        this.field13937 = (float)class2274.field13847;
        this.field13938 = (float)class2274.field13848;
        this.field13939 = (float)class2274.field13849;
        this.field13940 = (float)class2274.field13850;
        this.field13941 = (float)class2274.field13851;
        this.field13942 = (float)class2274.field13852;
        this.field13943 = (float)class2274.field13853;
    }
    
    public final void method9092(final Class2296 class2296) {
        this.method9094(class2296);
    }
    
    public final void method9093() {
        this.method9094(this);
    }
    
    private final void method9094(final Class2296 class2296) {
        final double[] array = new double[9];
        final double[] array2 = new double[9];
        final int[] array3 = new int[3];
        array[0] = class2296.field13935;
        array[1] = class2296.field13936;
        array[2] = class2296.field13937;
        array[3] = class2296.field13938;
        array[4] = class2296.field13939;
        array[5] = class2296.field13940;
        array[6] = class2296.field13941;
        array[7] = class2296.field13942;
        array[8] = class2296.field13943;
        if (method9095(array, array3)) {
            for (int i = 0; i < 9; ++i) {
                array2[i] = 0.0;
            }
            array2[0] = 1.0;
            array2[8] = (array2[4] = 1.0);
            method9096(array, array3, array2);
            this.field13935 = (float)array2[0];
            this.field13936 = (float)array2[1];
            this.field13937 = (float)array2[2];
            this.field13938 = (float)array2[3];
            this.field13939 = (float)array2[4];
            this.field13940 = (float)array2[5];
            this.field13941 = (float)array2[6];
            this.field13942 = (float)array2[7];
            this.field13943 = (float)array2[8];
            return;
        }
        throw new Class2383(Class9531.method35584("Matrix3f12"));
    }
    
    public static boolean method9095(final double[] array, final int[] array2) {
        final double[] array3 = new double[3];
        int n = 0;
        int n2 = 0;
        int n3 = 3;
        while (n3-- != 0) {
            double n4 = 0.0;
            int n5 = 3;
            while (n5-- != 0) {
                final double abs = Math.abs(array[n++]);
                if (abs <= n4) {
                    continue;
                }
                n4 = abs;
            }
            if (n4 == 0.0) {
                return false;
            }
            array3[n2++] = 1.0 / n4;
        }
        final int n6 = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < i; ++j) {
                final int n7 = n6 + 3 * j + i;
                double n8 = array[n7];
                int n9 = j;
                int n10 = n6 + 3 * j;
                int n11 = n6 + i;
                while (n9-- != 0) {
                    n8 -= array[n10] * array[n11];
                    ++n10;
                    n11 += 3;
                }
                array[n7] = n8;
            }
            double n12 = 0.0;
            int n13 = -1;
            for (int k = i; k < 3; ++k) {
                final int n14 = n6 + 3 * k + i;
                double a = array[n14];
                int n15 = i;
                int n16 = n6 + 3 * k;
                int n17 = n6 + i;
                while (n15-- != 0) {
                    a -= array[n16] * array[n17];
                    ++n16;
                    n17 += 3;
                }
                array[n14] = a;
                final double n18;
                if ((n18 = array3[k] * Math.abs(a)) >= n12) {
                    n12 = n18;
                    n13 = k;
                }
            }
            if (n13 < 0) {
                throw new RuntimeException(Class9531.method35584("Matrix3f13"));
            }
            if (i != n13) {
                int n19 = 3;
                int n20 = n6 + 3 * n13;
                int n21 = n6 + 3 * i;
                while (n19-- != 0) {
                    final double n22 = array[n20];
                    array[n20++] = array[n21];
                    array[n21++] = n22;
                }
                array3[n13] = array3[i];
            }
            array2[i] = n13;
            if (array[n6 + 3 * i + i] == 0.0) {
                return false;
            }
            if (i != 2) {
                final double n23 = 1.0 / array[n6 + 3 * i + i];
                int n24 = n6 + 3 * (i + 1) + i;
                int n25 = 2 - i;
                while (n25-- != 0) {
                    final int n26 = n24;
                    array[n26] *= n23;
                    n24 += 3;
                }
            }
        }
        return true;
    }
    
    public static void method9096(final double[] array, final int[] array2, final double[] array3) {
        final int n = 0;
        for (int i = 0; i < 3; ++i) {
            final int n2 = i;
            int n3 = -1;
            for (int j = 0; j < 3; ++j) {
                final int n4 = array2[n + j];
                double n5 = array3[n2 + 3 * n4];
                array3[n2 + 3 * n4] = array3[n2 + 3 * j];
                if (n3 < 0) {
                    if (n5 != 0.0) {
                        n3 = j;
                    }
                }
                else {
                    final int n6 = j * 3;
                    for (int k = n3; k <= j - 1; ++k) {
                        n5 -= array[n6 + k] * array3[n2 + 3 * k];
                    }
                }
                array3[n2 + 3 * j] = n5;
            }
            int n7 = 6;
            final int n8 = n2 + 6;
            array3[n8] /= array[n7 + 2];
            n7 -= 3;
            array3[n2 + 3] = (array3[n2 + 3] - array[n7 + 2] * array3[n2 + 6]) / array[n7 + 1];
            n7 -= 3;
            array3[n2] = (array3[n2] - array[n7 + 1] * array3[n2 + 3] - array[n7 + 2] * array3[n2 + 6]) / array[n7];
        }
    }
    
    public final float method9097() {
        return this.field13935 * (this.field13939 * this.field13943 - this.field13940 * this.field13942) + this.field13936 * (this.field13940 * this.field13941 - this.field13938 * this.field13943) + this.field13937 * (this.field13938 * this.field13942 - this.field13939 * this.field13941);
    }
    
    public final void method9098(final float field13943) {
        this.field13935 = field13943;
        this.field13936 = 0.0f;
        this.field13937 = 0.0f;
        this.field13938 = 0.0f;
        this.field13939 = field13943;
        this.field13940 = 0.0f;
        this.field13941 = 0.0f;
        this.field13942 = 0.0f;
        this.field13943 = field13943;
    }
    
    public final void method9099(final float n) {
        final float field13942 = (float)Math.sin(n);
        final float n2 = (float)Math.cos(n);
        this.field13935 = 1.0f;
        this.field13936 = 0.0f;
        this.field13937 = 0.0f;
        this.field13938 = 0.0f;
        this.field13939 = n2;
        this.field13940 = -field13942;
        this.field13941 = 0.0f;
        this.field13942 = field13942;
        this.field13943 = n2;
    }
    
    public final void method9100(final float n) {
        final float field13937 = (float)Math.sin(n);
        final float n2 = (float)Math.cos(n);
        this.field13935 = n2;
        this.field13936 = 0.0f;
        this.field13937 = field13937;
        this.field13938 = 0.0f;
        this.field13939 = 1.0f;
        this.field13940 = 0.0f;
        this.field13941 = -field13937;
        this.field13942 = 0.0f;
        this.field13943 = n2;
    }
    
    public final void method9101(final float n) {
        final float field13938 = (float)Math.sin(n);
        final float n2 = (float)Math.cos(n);
        this.field13935 = n2;
        this.field13936 = -field13938;
        this.field13937 = 0.0f;
        this.field13938 = field13938;
        this.field13939 = n2;
        this.field13940 = 0.0f;
        this.field13941 = 0.0f;
        this.field13942 = 0.0f;
        this.field13943 = 1.0f;
    }
    
    public final void method9102(final float n) {
        this.field13935 *= n;
        this.field13936 *= n;
        this.field13937 *= n;
        this.field13938 *= n;
        this.field13939 *= n;
        this.field13940 *= n;
        this.field13941 *= n;
        this.field13942 *= n;
        this.field13943 *= n;
    }
    
    public final void method9103(final float n, final Class2296 class2296) {
        this.field13935 = n * class2296.field13935;
        this.field13936 = n * class2296.field13936;
        this.field13937 = n * class2296.field13937;
        this.field13938 = n * class2296.field13938;
        this.field13939 = n * class2296.field13939;
        this.field13940 = n * class2296.field13940;
        this.field13941 = n * class2296.field13941;
        this.field13942 = n * class2296.field13942;
        this.field13943 = n * class2296.field13943;
    }
    
    public final void method9104(final Class2296 class2296) {
        final float field13935 = this.field13935 * class2296.field13935 + this.field13936 * class2296.field13938 + this.field13937 * class2296.field13941;
        final float field13936 = this.field13935 * class2296.field13936 + this.field13936 * class2296.field13939 + this.field13937 * class2296.field13942;
        final float field13937 = this.field13935 * class2296.field13937 + this.field13936 * class2296.field13940 + this.field13937 * class2296.field13943;
        final float field13938 = this.field13938 * class2296.field13935 + this.field13939 * class2296.field13938 + this.field13940 * class2296.field13941;
        final float field13939 = this.field13938 * class2296.field13936 + this.field13939 * class2296.field13939 + this.field13940 * class2296.field13942;
        final float field13940 = this.field13938 * class2296.field13937 + this.field13939 * class2296.field13940 + this.field13940 * class2296.field13943;
        final float field13941 = this.field13941 * class2296.field13935 + this.field13942 * class2296.field13938 + this.field13943 * class2296.field13941;
        final float field13942 = this.field13941 * class2296.field13936 + this.field13942 * class2296.field13939 + this.field13943 * class2296.field13942;
        final float field13943 = this.field13941 * class2296.field13937 + this.field13942 * class2296.field13940 + this.field13943 * class2296.field13943;
        this.field13935 = field13935;
        this.field13936 = field13936;
        this.field13937 = field13937;
        this.field13938 = field13938;
        this.field13939 = field13939;
        this.field13940 = field13940;
        this.field13941 = field13941;
        this.field13942 = field13942;
        this.field13943 = field13943;
    }
    
    public final void method9105(final Class2296 class2296, final Class2296 class2297) {
        if (this != class2296 && this != class2297) {
            this.field13935 = class2296.field13935 * class2297.field13935 + class2296.field13936 * class2297.field13938 + class2296.field13937 * class2297.field13941;
            this.field13936 = class2296.field13935 * class2297.field13936 + class2296.field13936 * class2297.field13939 + class2296.field13937 * class2297.field13942;
            this.field13937 = class2296.field13935 * class2297.field13937 + class2296.field13936 * class2297.field13940 + class2296.field13937 * class2297.field13943;
            this.field13938 = class2296.field13938 * class2297.field13935 + class2296.field13939 * class2297.field13938 + class2296.field13940 * class2297.field13941;
            this.field13939 = class2296.field13938 * class2297.field13936 + class2296.field13939 * class2297.field13939 + class2296.field13940 * class2297.field13942;
            this.field13940 = class2296.field13938 * class2297.field13937 + class2296.field13939 * class2297.field13940 + class2296.field13940 * class2297.field13943;
            this.field13941 = class2296.field13941 * class2297.field13935 + class2296.field13942 * class2297.field13938 + class2296.field13943 * class2297.field13941;
            this.field13942 = class2296.field13941 * class2297.field13936 + class2296.field13942 * class2297.field13939 + class2296.field13943 * class2297.field13942;
            this.field13943 = class2296.field13941 * class2297.field13937 + class2296.field13942 * class2297.field13940 + class2296.field13943 * class2297.field13943;
        }
        else {
            final float field13935 = class2296.field13935 * class2297.field13935 + class2296.field13936 * class2297.field13938 + class2296.field13937 * class2297.field13941;
            final float field13936 = class2296.field13935 * class2297.field13936 + class2296.field13936 * class2297.field13939 + class2296.field13937 * class2297.field13942;
            final float field13937 = class2296.field13935 * class2297.field13937 + class2296.field13936 * class2297.field13940 + class2296.field13937 * class2297.field13943;
            final float field13938 = class2296.field13938 * class2297.field13935 + class2296.field13939 * class2297.field13938 + class2296.field13940 * class2297.field13941;
            final float field13939 = class2296.field13938 * class2297.field13936 + class2296.field13939 * class2297.field13939 + class2296.field13940 * class2297.field13942;
            final float field13940 = class2296.field13938 * class2297.field13937 + class2296.field13939 * class2297.field13940 + class2296.field13940 * class2297.field13943;
            final float field13941 = class2296.field13941 * class2297.field13935 + class2296.field13942 * class2297.field13938 + class2296.field13943 * class2297.field13941;
            final float field13942 = class2296.field13941 * class2297.field13936 + class2296.field13942 * class2297.field13939 + class2296.field13943 * class2297.field13942;
            final float field13943 = class2296.field13941 * class2297.field13937 + class2296.field13942 * class2297.field13940 + class2296.field13943 * class2297.field13943;
            this.field13935 = field13935;
            this.field13936 = field13936;
            this.field13937 = field13937;
            this.field13938 = field13938;
            this.field13939 = field13939;
            this.field13940 = field13940;
            this.field13941 = field13941;
            this.field13942 = field13942;
            this.field13943 = field13943;
        }
    }
    
    public final void method9106(final Class2296 class2296) {
        final double[] array = new double[9];
        final double[] array2 = new double[9];
        final double[] array3 = new double[3];
        array[0] = this.field13935 * class2296.field13935 + this.field13936 * class2296.field13938 + this.field13937 * class2296.field13941;
        array[1] = this.field13935 * class2296.field13936 + this.field13936 * class2296.field13939 + this.field13937 * class2296.field13942;
        array[2] = this.field13935 * class2296.field13937 + this.field13936 * class2296.field13940 + this.field13937 * class2296.field13943;
        array[3] = this.field13938 * class2296.field13935 + this.field13939 * class2296.field13938 + this.field13940 * class2296.field13941;
        array[4] = this.field13938 * class2296.field13936 + this.field13939 * class2296.field13939 + this.field13940 * class2296.field13942;
        array[5] = this.field13938 * class2296.field13937 + this.field13939 * class2296.field13940 + this.field13940 * class2296.field13943;
        array[6] = this.field13941 * class2296.field13935 + this.field13942 * class2296.field13938 + this.field13943 * class2296.field13941;
        array[7] = this.field13941 * class2296.field13936 + this.field13942 * class2296.field13939 + this.field13943 * class2296.field13942;
        array[8] = this.field13941 * class2296.field13937 + this.field13942 * class2296.field13940 + this.field13943 * class2296.field13943;
        Class2274.method8623(array, array3, array2);
        this.field13935 = (float)array2[0];
        this.field13936 = (float)array2[1];
        this.field13937 = (float)array2[2];
        this.field13938 = (float)array2[3];
        this.field13939 = (float)array2[4];
        this.field13940 = (float)array2[5];
        this.field13941 = (float)array2[6];
        this.field13942 = (float)array2[7];
        this.field13943 = (float)array2[8];
    }
    
    public final void method9107(final Class2296 class2296, final Class2296 class2297) {
        final double[] array = new double[9];
        final double[] array2 = new double[9];
        final double[] array3 = new double[3];
        array[0] = class2296.field13935 * class2297.field13935 + class2296.field13936 * class2297.field13938 + class2296.field13937 * class2297.field13941;
        array[1] = class2296.field13935 * class2297.field13936 + class2296.field13936 * class2297.field13939 + class2296.field13937 * class2297.field13942;
        array[2] = class2296.field13935 * class2297.field13937 + class2296.field13936 * class2297.field13940 + class2296.field13937 * class2297.field13943;
        array[3] = class2296.field13938 * class2297.field13935 + class2296.field13939 * class2297.field13938 + class2296.field13940 * class2297.field13941;
        array[4] = class2296.field13938 * class2297.field13936 + class2296.field13939 * class2297.field13939 + class2296.field13940 * class2297.field13942;
        array[5] = class2296.field13938 * class2297.field13937 + class2296.field13939 * class2297.field13940 + class2296.field13940 * class2297.field13943;
        array[6] = class2296.field13941 * class2297.field13935 + class2296.field13942 * class2297.field13938 + class2296.field13943 * class2297.field13941;
        array[7] = class2296.field13941 * class2297.field13936 + class2296.field13942 * class2297.field13939 + class2296.field13943 * class2297.field13942;
        array[8] = class2296.field13941 * class2297.field13937 + class2296.field13942 * class2297.field13940 + class2296.field13943 * class2297.field13943;
        Class2274.method8623(array, array3, array2);
        this.field13935 = (float)array2[0];
        this.field13936 = (float)array2[1];
        this.field13937 = (float)array2[2];
        this.field13938 = (float)array2[3];
        this.field13939 = (float)array2[4];
        this.field13940 = (float)array2[5];
        this.field13941 = (float)array2[6];
        this.field13942 = (float)array2[7];
        this.field13943 = (float)array2[8];
    }
    
    public final void method9108(final Class2296 class2296, final Class2296 class2297) {
        if (this != class2296 && this != class2297) {
            this.field13935 = class2296.field13935 * class2297.field13935 + class2296.field13938 * class2297.field13936 + class2296.field13941 * class2297.field13937;
            this.field13936 = class2296.field13935 * class2297.field13938 + class2296.field13938 * class2297.field13939 + class2296.field13941 * class2297.field13940;
            this.field13937 = class2296.field13935 * class2297.field13941 + class2296.field13938 * class2297.field13942 + class2296.field13941 * class2297.field13943;
            this.field13938 = class2296.field13936 * class2297.field13935 + class2296.field13939 * class2297.field13936 + class2296.field13942 * class2297.field13937;
            this.field13939 = class2296.field13936 * class2297.field13938 + class2296.field13939 * class2297.field13939 + class2296.field13942 * class2297.field13940;
            this.field13940 = class2296.field13936 * class2297.field13941 + class2296.field13939 * class2297.field13942 + class2296.field13942 * class2297.field13943;
            this.field13941 = class2296.field13937 * class2297.field13935 + class2296.field13940 * class2297.field13936 + class2296.field13943 * class2297.field13937;
            this.field13942 = class2296.field13937 * class2297.field13938 + class2296.field13940 * class2297.field13939 + class2296.field13943 * class2297.field13940;
            this.field13943 = class2296.field13937 * class2297.field13941 + class2296.field13940 * class2297.field13942 + class2296.field13943 * class2297.field13943;
        }
        else {
            final float field13935 = class2296.field13935 * class2297.field13935 + class2296.field13938 * class2297.field13936 + class2296.field13941 * class2297.field13937;
            final float field13936 = class2296.field13935 * class2297.field13938 + class2296.field13938 * class2297.field13939 + class2296.field13941 * class2297.field13940;
            final float field13937 = class2296.field13935 * class2297.field13941 + class2296.field13938 * class2297.field13942 + class2296.field13941 * class2297.field13943;
            final float field13938 = class2296.field13936 * class2297.field13935 + class2296.field13939 * class2297.field13936 + class2296.field13942 * class2297.field13937;
            final float field13939 = class2296.field13936 * class2297.field13938 + class2296.field13939 * class2297.field13939 + class2296.field13942 * class2297.field13940;
            final float field13940 = class2296.field13936 * class2297.field13941 + class2296.field13939 * class2297.field13942 + class2296.field13942 * class2297.field13943;
            final float field13941 = class2296.field13937 * class2297.field13935 + class2296.field13940 * class2297.field13936 + class2296.field13943 * class2297.field13937;
            final float field13942 = class2296.field13937 * class2297.field13938 + class2296.field13940 * class2297.field13939 + class2296.field13943 * class2297.field13940;
            final float field13943 = class2296.field13937 * class2297.field13941 + class2296.field13940 * class2297.field13942 + class2296.field13943 * class2297.field13943;
            this.field13935 = field13935;
            this.field13936 = field13936;
            this.field13937 = field13937;
            this.field13938 = field13938;
            this.field13939 = field13939;
            this.field13940 = field13940;
            this.field13941 = field13941;
            this.field13942 = field13942;
            this.field13943 = field13943;
        }
    }
    
    public final void method9109(final Class2296 class2296, final Class2296 class2297) {
        if (this != class2296 && this != class2297) {
            this.field13935 = class2296.field13935 * class2297.field13935 + class2296.field13936 * class2297.field13936 + class2296.field13937 * class2297.field13937;
            this.field13936 = class2296.field13935 * class2297.field13938 + class2296.field13936 * class2297.field13939 + class2296.field13937 * class2297.field13940;
            this.field13937 = class2296.field13935 * class2297.field13941 + class2296.field13936 * class2297.field13942 + class2296.field13937 * class2297.field13943;
            this.field13938 = class2296.field13938 * class2297.field13935 + class2296.field13939 * class2297.field13936 + class2296.field13940 * class2297.field13937;
            this.field13939 = class2296.field13938 * class2297.field13938 + class2296.field13939 * class2297.field13939 + class2296.field13940 * class2297.field13940;
            this.field13940 = class2296.field13938 * class2297.field13941 + class2296.field13939 * class2297.field13942 + class2296.field13940 * class2297.field13943;
            this.field13941 = class2296.field13941 * class2297.field13935 + class2296.field13942 * class2297.field13936 + class2296.field13943 * class2297.field13937;
            this.field13942 = class2296.field13941 * class2297.field13938 + class2296.field13942 * class2297.field13939 + class2296.field13943 * class2297.field13940;
            this.field13943 = class2296.field13941 * class2297.field13941 + class2296.field13942 * class2297.field13942 + class2296.field13943 * class2297.field13943;
        }
        else {
            final float field13935 = class2296.field13935 * class2297.field13935 + class2296.field13936 * class2297.field13936 + class2296.field13937 * class2297.field13937;
            final float field13936 = class2296.field13935 * class2297.field13938 + class2296.field13936 * class2297.field13939 + class2296.field13937 * class2297.field13940;
            final float field13937 = class2296.field13935 * class2297.field13941 + class2296.field13936 * class2297.field13942 + class2296.field13937 * class2297.field13943;
            final float field13938 = class2296.field13938 * class2297.field13935 + class2296.field13939 * class2297.field13936 + class2296.field13940 * class2297.field13937;
            final float field13939 = class2296.field13938 * class2297.field13938 + class2296.field13939 * class2297.field13939 + class2296.field13940 * class2297.field13940;
            final float field13940 = class2296.field13938 * class2297.field13941 + class2296.field13939 * class2297.field13942 + class2296.field13940 * class2297.field13943;
            final float field13941 = class2296.field13941 * class2297.field13935 + class2296.field13942 * class2297.field13936 + class2296.field13943 * class2297.field13937;
            final float field13942 = class2296.field13941 * class2297.field13938 + class2296.field13942 * class2297.field13939 + class2296.field13943 * class2297.field13940;
            final float field13943 = class2296.field13941 * class2297.field13941 + class2296.field13942 * class2297.field13942 + class2296.field13943 * class2297.field13943;
            this.field13935 = field13935;
            this.field13936 = field13936;
            this.field13937 = field13937;
            this.field13938 = field13938;
            this.field13939 = field13939;
            this.field13940 = field13940;
            this.field13941 = field13941;
            this.field13942 = field13942;
            this.field13943 = field13943;
        }
    }
    
    public final void method9110(final Class2296 class2296, final Class2296 class2297) {
        if (this != class2296 && this != class2297) {
            this.field13935 = class2296.field13935 * class2297.field13935 + class2296.field13938 * class2297.field13938 + class2296.field13941 * class2297.field13941;
            this.field13936 = class2296.field13935 * class2297.field13936 + class2296.field13938 * class2297.field13939 + class2296.field13941 * class2297.field13942;
            this.field13937 = class2296.field13935 * class2297.field13937 + class2296.field13938 * class2297.field13940 + class2296.field13941 * class2297.field13943;
            this.field13938 = class2296.field13936 * class2297.field13935 + class2296.field13939 * class2297.field13938 + class2296.field13942 * class2297.field13941;
            this.field13939 = class2296.field13936 * class2297.field13936 + class2296.field13939 * class2297.field13939 + class2296.field13942 * class2297.field13942;
            this.field13940 = class2296.field13936 * class2297.field13937 + class2296.field13939 * class2297.field13940 + class2296.field13942 * class2297.field13943;
            this.field13941 = class2296.field13937 * class2297.field13935 + class2296.field13940 * class2297.field13938 + class2296.field13943 * class2297.field13941;
            this.field13942 = class2296.field13937 * class2297.field13936 + class2296.field13940 * class2297.field13939 + class2296.field13943 * class2297.field13942;
            this.field13943 = class2296.field13937 * class2297.field13937 + class2296.field13940 * class2297.field13940 + class2296.field13943 * class2297.field13943;
        }
        else {
            final float field13935 = class2296.field13935 * class2297.field13935 + class2296.field13938 * class2297.field13938 + class2296.field13941 * class2297.field13941;
            final float field13936 = class2296.field13935 * class2297.field13936 + class2296.field13938 * class2297.field13939 + class2296.field13941 * class2297.field13942;
            final float field13937 = class2296.field13935 * class2297.field13937 + class2296.field13938 * class2297.field13940 + class2296.field13941 * class2297.field13943;
            final float field13938 = class2296.field13936 * class2297.field13935 + class2296.field13939 * class2297.field13938 + class2296.field13942 * class2297.field13941;
            final float field13939 = class2296.field13936 * class2297.field13936 + class2296.field13939 * class2297.field13939 + class2296.field13942 * class2297.field13942;
            final float field13940 = class2296.field13936 * class2297.field13937 + class2296.field13939 * class2297.field13940 + class2296.field13942 * class2297.field13943;
            final float field13941 = class2296.field13937 * class2297.field13935 + class2296.field13940 * class2297.field13938 + class2296.field13943 * class2297.field13941;
            final float field13942 = class2296.field13937 * class2297.field13936 + class2296.field13940 * class2297.field13939 + class2296.field13943 * class2297.field13942;
            final float field13943 = class2296.field13937 * class2297.field13937 + class2296.field13940 * class2297.field13940 + class2296.field13943 * class2297.field13943;
            this.field13935 = field13935;
            this.field13936 = field13936;
            this.field13937 = field13937;
            this.field13938 = field13938;
            this.field13939 = field13939;
            this.field13940 = field13940;
            this.field13941 = field13941;
            this.field13942 = field13942;
            this.field13943 = field13943;
        }
    }
    
    public final void method9111() {
        final double[] array = new double[9];
        this.method9121(new double[3], array);
        this.field13935 = (float)array[0];
        this.field13936 = (float)array[1];
        this.field13937 = (float)array[2];
        this.field13938 = (float)array[3];
        this.field13939 = (float)array[4];
        this.field13940 = (float)array[5];
        this.field13941 = (float)array[6];
        this.field13942 = (float)array[7];
        this.field13943 = (float)array[8];
    }
    
    public final void method9112(final Class2296 class2296) {
        final double[] array = new double[9];
        final double[] array2 = new double[9];
        final double[] array3 = new double[3];
        array[0] = class2296.field13935;
        array[1] = class2296.field13936;
        array[2] = class2296.field13937;
        array[3] = class2296.field13938;
        array[4] = class2296.field13939;
        array[5] = class2296.field13940;
        array[6] = class2296.field13941;
        array[7] = class2296.field13942;
        array[8] = class2296.field13943;
        Class2274.method8623(array, array3, array2);
        this.field13935 = (float)array2[0];
        this.field13936 = (float)array2[1];
        this.field13937 = (float)array2[2];
        this.field13938 = (float)array2[3];
        this.field13939 = (float)array2[4];
        this.field13940 = (float)array2[5];
        this.field13941 = (float)array2[6];
        this.field13942 = (float)array2[7];
        this.field13943 = (float)array2[8];
    }
    
    public final void method9113() {
        final float n = 1.0f / (float)Math.sqrt(this.field13935 * this.field13935 + this.field13938 * this.field13938 + this.field13941 * this.field13941);
        this.field13935 *= n;
        this.field13938 *= n;
        this.field13941 *= n;
        final float n2 = 1.0f / (float)Math.sqrt(this.field13936 * this.field13936 + this.field13939 * this.field13939 + this.field13942 * this.field13942);
        this.field13936 *= n2;
        this.field13939 *= n2;
        this.field13942 *= n2;
        this.field13937 = this.field13938 * this.field13942 - this.field13939 * this.field13941;
        this.field13940 = this.field13936 * this.field13941 - this.field13935 * this.field13942;
        this.field13943 = this.field13935 * this.field13939 - this.field13936 * this.field13938;
    }
    
    public final void method9114(final Class2296 class2296) {
        final float n = 1.0f / (float)Math.sqrt(class2296.field13935 * class2296.field13935 + class2296.field13938 * class2296.field13938 + class2296.field13941 * class2296.field13941);
        this.field13935 = class2296.field13935 * n;
        this.field13938 = class2296.field13938 * n;
        this.field13941 = class2296.field13941 * n;
        final float n2 = 1.0f / (float)Math.sqrt(class2296.field13936 * class2296.field13936 + class2296.field13939 * class2296.field13939 + class2296.field13942 * class2296.field13942);
        this.field13936 = class2296.field13936 * n2;
        this.field13939 = class2296.field13939 * n2;
        this.field13942 = class2296.field13942 * n2;
        this.field13937 = this.field13938 * this.field13942 - this.field13939 * this.field13941;
        this.field13940 = this.field13936 * this.field13941 - this.field13935 * this.field13942;
        this.field13943 = this.field13935 * this.field13939 - this.field13936 * this.field13938;
    }
    
    public boolean equals(final Class2296 class2296) {
        try {
            return this.field13935 == class2296.field13935 && this.field13936 == class2296.field13936 && this.field13937 == class2296.field13937 && this.field13938 == class2296.field13938 && this.field13939 == class2296.field13939 && this.field13940 == class2296.field13940 && this.field13941 == class2296.field13941 && this.field13942 == class2296.field13942 && this.field13943 == class2296.field13943;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2296 class2296 = (Class2296)o;
            return this.field13935 == class2296.field13935 && this.field13936 == class2296.field13936 && this.field13937 == class2296.field13937 && this.field13938 == class2296.field13938 && this.field13939 == class2296.field13939 && this.field13940 == class2296.field13940 && this.field13941 == class2296.field13941 && this.field13942 == class2296.field13942 && this.field13943 == class2296.field13943;
        }
        catch (final ClassCastException ex) {
            return false;
        }
        catch (final NullPointerException ex2) {
            return false;
        }
    }
    
    public boolean method9115(final Class2296 class2296, final float n) {
        boolean b = !(Math.abs(this.field13935 - class2296.field13935) > n);
        if (Math.abs(this.field13936 - class2296.field13936) > n) {
            b = false;
        }
        if (Math.abs(this.field13937 - class2296.field13937) > n) {
            b = false;
        }
        if (Math.abs(this.field13938 - class2296.field13938) > n) {
            b = false;
        }
        if (Math.abs(this.field13939 - class2296.field13939) > n) {
            b = false;
        }
        if (Math.abs(this.field13940 - class2296.field13940) > n) {
            b = false;
        }
        if (Math.abs(this.field13941 - class2296.field13941) > n) {
            b = false;
        }
        if (Math.abs(this.field13942 - class2296.field13942) > n) {
            b = false;
        }
        if (Math.abs(this.field13943 - class2296.field13943) > n) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        final long n = 31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L + Class9427.method35030(this.field13935)) + Class9427.method35030(this.field13936)) + Class9427.method35030(this.field13937)) + Class9427.method35030(this.field13938)) + Class9427.method35030(this.field13939)) + Class9427.method35030(this.field13940)) + Class9427.method35030(this.field13941)) + Class9427.method35030(this.field13942)) + Class9427.method35030(this.field13943);
        return (int)(n ^ n >> 32);
    }
    
    public final void method9116() {
        this.field13935 = 0.0f;
        this.field13936 = 0.0f;
        this.field13937 = 0.0f;
        this.field13938 = 0.0f;
        this.field13939 = 0.0f;
        this.field13940 = 0.0f;
        this.field13941 = 0.0f;
        this.field13942 = 0.0f;
        this.field13943 = 0.0f;
    }
    
    public final void method9117() {
        this.field13935 = -this.field13935;
        this.field13936 = -this.field13936;
        this.field13937 = -this.field13937;
        this.field13938 = -this.field13938;
        this.field13939 = -this.field13939;
        this.field13940 = -this.field13940;
        this.field13941 = -this.field13941;
        this.field13942 = -this.field13942;
        this.field13943 = -this.field13943;
    }
    
    public final void method9118(final Class2296 class2296) {
        this.field13935 = -class2296.field13935;
        this.field13936 = -class2296.field13936;
        this.field13937 = -class2296.field13937;
        this.field13938 = -class2296.field13938;
        this.field13939 = -class2296.field13939;
        this.field13940 = -class2296.field13940;
        this.field13941 = -class2296.field13941;
        this.field13942 = -class2296.field13942;
        this.field13943 = -class2296.field13943;
    }
    
    public final void method9119(final Class2285 class2285) {
        class2285.method8944(this.field13935 * class2285.field13909 + this.field13936 * class2285.field13910 + this.field13937 * class2285.field13911, this.field13938 * class2285.field13909 + this.field13939 * class2285.field13910 + this.field13940 * class2285.field13911, this.field13941 * class2285.field13909 + this.field13942 * class2285.field13910 + this.field13943 * class2285.field13911);
    }
    
    public final void method9120(final Class2285 class2285, final Class2285 class2286) {
        final float field13909 = this.field13935 * class2285.field13909 + this.field13936 * class2285.field13910 + this.field13937 * class2285.field13911;
        final float field13910 = this.field13938 * class2285.field13909 + this.field13939 * class2285.field13910 + this.field13940 * class2285.field13911;
        class2286.field13911 = this.field13941 * class2285.field13909 + this.field13942 * class2285.field13910 + this.field13943 * class2285.field13911;
        class2286.field13909 = field13909;
        class2286.field13910 = field13910;
    }
    
    public void method9121(final double[] array, final double[] array2) {
        Class2274.method8623(new double[] { this.field13935, this.field13936, this.field13937, this.field13938, this.field13939, this.field13940, this.field13941, this.field13942, this.field13943 }, array, array2);
    }
    
    public Object clone() {
        Class2296 class2296;
        try {
            class2296 = (Class2296)super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
        return class2296;
    }
    
    public final float method9122() {
        return this.field13935;
    }
    
    public final void method9123(final float field13935) {
        this.field13935 = field13935;
    }
    
    public final float method9124() {
        return this.field13936;
    }
    
    public final void method9125(final float field13936) {
        this.field13936 = field13936;
    }
    
    public final float method9126() {
        return this.field13937;
    }
    
    public final void method9127(final float field13937) {
        this.field13937 = field13937;
    }
    
    public final float method9128() {
        return this.field13938;
    }
    
    public final void method9129(final float field13938) {
        this.field13938 = field13938;
    }
    
    public final float method9130() {
        return this.field13939;
    }
    
    public final void method9131(final float field13939) {
        this.field13939 = field13939;
    }
    
    public final float method9132() {
        return this.field13940;
    }
    
    public final void method9133(final float field13940) {
        this.field13940 = field13940;
    }
    
    public final float method9134() {
        return this.field13941;
    }
    
    public final void method9135(final float field13941) {
        this.field13941 = field13941;
    }
    
    public final float method9136() {
        return this.field13942;
    }
    
    public final void method9137(final float field13942) {
        this.field13942 = field13942;
    }
    
    public final float method9138() {
        return this.field13943;
    }
    
    public final void method9139(final float field13943) {
        this.field13943 = field13943;
    }
}
