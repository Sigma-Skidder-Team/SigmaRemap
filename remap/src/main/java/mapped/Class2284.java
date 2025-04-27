// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2284 implements Serializable, Cloneable
{
    public static final long field13890 = -8405036035410109353L;
    public float field13891;
    public float field13892;
    public float field13893;
    public float field13894;
    public float field13895;
    public float field13896;
    public float field13897;
    public float field13898;
    public float field13899;
    public float field13900;
    public float field13901;
    public float field13902;
    public float field13903;
    public float field13904;
    public float field13905;
    public float field13906;
    private static final double field13907 = 1.0E-8;
    
    public Class2284(final float field13891, final float field13892, final float field13893, final float field13894, final float field13895, final float field13896, final float field13897, final float field13898, final float field13899, final float field13900, final float field13901, final float field13902, final float field13903, final float field13904, final float field13905, final float field13906) {
        this.field13891 = field13891;
        this.field13892 = field13892;
        this.field13893 = field13893;
        this.field13894 = field13894;
        this.field13895 = field13895;
        this.field13896 = field13896;
        this.field13897 = field13897;
        this.field13898 = field13898;
        this.field13899 = field13899;
        this.field13900 = field13900;
        this.field13901 = field13901;
        this.field13902 = field13902;
        this.field13903 = field13903;
        this.field13904 = field13904;
        this.field13905 = field13905;
        this.field13906 = field13906;
    }
    
    public Class2284(final float[] array) {
        this.field13891 = array[0];
        this.field13892 = array[1];
        this.field13893 = array[2];
        this.field13894 = array[3];
        this.field13895 = array[4];
        this.field13896 = array[5];
        this.field13897 = array[6];
        this.field13898 = array[7];
        this.field13899 = array[8];
        this.field13900 = array[9];
        this.field13901 = array[10];
        this.field13902 = array[11];
        this.field13903 = array[12];
        this.field13904 = array[13];
        this.field13905 = array[14];
        this.field13906 = array[15];
    }
    
    public Class2284(final Class2278 class2278, final Class2288 class2279, final float n) {
        this.field13891 = (float)(n * (1.0 - 2.0 * class2278.field13864 * class2278.field13864 - 2.0 * class2278.field13865 * class2278.field13865));
        this.field13895 = (float)(n * (2.0 * (class2278.field13863 * class2278.field13864 + class2278.field13866 * class2278.field13865)));
        this.field13899 = (float)(n * (2.0 * (class2278.field13863 * class2278.field13865 - class2278.field13866 * class2278.field13864)));
        this.field13892 = (float)(n * (2.0 * (class2278.field13863 * class2278.field13864 - class2278.field13866 * class2278.field13865)));
        this.field13896 = (float)(n * (1.0 - 2.0 * class2278.field13863 * class2278.field13863 - 2.0 * class2278.field13865 * class2278.field13865));
        this.field13900 = (float)(n * (2.0 * (class2278.field13864 * class2278.field13865 + class2278.field13866 * class2278.field13863)));
        this.field13893 = (float)(n * (2.0 * (class2278.field13863 * class2278.field13865 + class2278.field13866 * class2278.field13864)));
        this.field13897 = (float)(n * (2.0 * (class2278.field13864 * class2278.field13865 - class2278.field13866 * class2278.field13863)));
        this.field13901 = (float)(n * (1.0 - 2.0 * class2278.field13863 * class2278.field13863 - 2.0 * class2278.field13864 * class2278.field13864));
        this.field13894 = class2279.field13909;
        this.field13898 = class2279.field13910;
        this.field13902 = class2279.field13911;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public Class2284(final Class2304 class2304) {
        this.field13891 = (float)class2304.field13961;
        this.field13892 = (float)class2304.field13962;
        this.field13893 = (float)class2304.field13963;
        this.field13894 = (float)class2304.field13964;
        this.field13895 = (float)class2304.field13965;
        this.field13896 = (float)class2304.field13966;
        this.field13897 = (float)class2304.field13967;
        this.field13898 = (float)class2304.field13968;
        this.field13899 = (float)class2304.field13969;
        this.field13900 = (float)class2304.field13970;
        this.field13901 = (float)class2304.field13971;
        this.field13902 = (float)class2304.field13972;
        this.field13903 = (float)class2304.field13973;
        this.field13904 = (float)class2304.field13974;
        this.field13905 = (float)class2304.field13975;
        this.field13906 = (float)class2304.field13976;
    }
    
    public Class2284(final Class2284 class2284) {
        this.field13891 = class2284.field13891;
        this.field13892 = class2284.field13892;
        this.field13893 = class2284.field13893;
        this.field13894 = class2284.field13894;
        this.field13895 = class2284.field13895;
        this.field13896 = class2284.field13896;
        this.field13897 = class2284.field13897;
        this.field13898 = class2284.field13898;
        this.field13899 = class2284.field13899;
        this.field13900 = class2284.field13900;
        this.field13901 = class2284.field13901;
        this.field13902 = class2284.field13902;
        this.field13903 = class2284.field13903;
        this.field13904 = class2284.field13904;
        this.field13905 = class2284.field13905;
        this.field13906 = class2284.field13906;
    }
    
    public Class2284(final Class2296 class2296, final Class2288 class2297, final float n) {
        this.field13891 = class2296.field13935 * n;
        this.field13892 = class2296.field13936 * n;
        this.field13893 = class2296.field13937 * n;
        this.field13894 = class2297.field13909;
        this.field13895 = class2296.field13938 * n;
        this.field13896 = class2296.field13939 * n;
        this.field13897 = class2296.field13940 * n;
        this.field13898 = class2297.field13910;
        this.field13899 = class2296.field13941 * n;
        this.field13900 = class2296.field13942 * n;
        this.field13901 = class2296.field13943 * n;
        this.field13902 = class2297.field13911;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public Class2284() {
        this.field13891 = 0.0f;
        this.field13892 = 0.0f;
        this.field13893 = 0.0f;
        this.field13894 = 0.0f;
        this.field13895 = 0.0f;
        this.field13896 = 0.0f;
        this.field13897 = 0.0f;
        this.field13898 = 0.0f;
        this.field13899 = 0.0f;
        this.field13900 = 0.0f;
        this.field13901 = 0.0f;
        this.field13902 = 0.0f;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 0.0f;
    }
    
    @Override
    public String toString() {
        return this.field13891 + ", " + this.field13892 + ", " + this.field13893 + ", " + this.field13894 + "\n" + this.field13895 + ", " + this.field13896 + ", " + this.field13897 + ", " + this.field13898 + "\n" + this.field13899 + ", " + this.field13900 + ", " + this.field13901 + ", " + this.field13902 + "\n" + this.field13903 + ", " + this.field13904 + ", " + this.field13905 + ", " + this.field13906 + "\n";
    }
    
    public final void method8832() {
        this.field13891 = 1.0f;
        this.field13892 = 0.0f;
        this.field13893 = 0.0f;
        this.field13894 = 0.0f;
        this.field13895 = 0.0f;
        this.field13896 = 1.0f;
        this.field13897 = 0.0f;
        this.field13898 = 0.0f;
        this.field13899 = 0.0f;
        this.field13900 = 0.0f;
        this.field13901 = 1.0f;
        this.field13902 = 0.0f;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8833(final int n, final int n2, final float n3) {
        Label_0381: {
            switch (n) {
                case 0: {
                    switch (n2) {
                        case 0: {
                            this.field13891 = n3;
                            break Label_0381;
                        }
                        case 1: {
                            this.field13892 = n3;
                            break Label_0381;
                        }
                        case 2: {
                            this.field13893 = n3;
                            break Label_0381;
                        }
                        case 3: {
                            this.field13894 = n3;
                            break Label_0381;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f0"));
                        }
                    }
                    break;
                }
                case 1: {
                    switch (n2) {
                        case 0: {
                            this.field13895 = n3;
                            break Label_0381;
                        }
                        case 1: {
                            this.field13896 = n3;
                            break Label_0381;
                        }
                        case 2: {
                            this.field13897 = n3;
                            break Label_0381;
                        }
                        case 3: {
                            this.field13898 = n3;
                            break Label_0381;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f0"));
                        }
                    }
                    break;
                }
                case 2: {
                    switch (n2) {
                        case 0: {
                            this.field13899 = n3;
                            break Label_0381;
                        }
                        case 1: {
                            this.field13900 = n3;
                            break Label_0381;
                        }
                        case 2: {
                            this.field13901 = n3;
                            break Label_0381;
                        }
                        case 3: {
                            this.field13902 = n3;
                            break Label_0381;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f0"));
                        }
                    }
                    break;
                }
                case 3: {
                    switch (n2) {
                        case 0: {
                            this.field13903 = n3;
                            break Label_0381;
                        }
                        case 1: {
                            this.field13904 = n3;
                            break Label_0381;
                        }
                        case 2: {
                            this.field13905 = n3;
                            break Label_0381;
                        }
                        case 3: {
                            this.field13906 = n3;
                            break Label_0381;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f0"));
                        }
                    }
                    break;
                }
                default: {
                    throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f0"));
                }
            }
        }
    }
    
    public final float method8834(final int n, final int n2) {
        Label_0269: {
            switch (n) {
                case 0: {
                    switch (n2) {
                        case 0: {
                            return this.field13891;
                        }
                        case 1: {
                            return this.field13892;
                        }
                        case 2: {
                            return this.field13893;
                        }
                        case 3: {
                            return this.field13894;
                        }
                        default: {
                            break Label_0269;
                        }
                    }
                    break;
                }
                case 1: {
                    switch (n2) {
                        case 0: {
                            return this.field13895;
                        }
                        case 1: {
                            return this.field13896;
                        }
                        case 2: {
                            return this.field13897;
                        }
                        case 3: {
                            return this.field13898;
                        }
                        default: {
                            break Label_0269;
                        }
                    }
                    break;
                }
                case 2: {
                    switch (n2) {
                        case 0: {
                            return this.field13899;
                        }
                        case 1: {
                            return this.field13900;
                        }
                        case 2: {
                            return this.field13901;
                        }
                        case 3: {
                            return this.field13902;
                        }
                        default: {
                            break Label_0269;
                        }
                    }
                    break;
                }
                case 3: {
                    switch (n2) {
                        case 0: {
                            return this.field13903;
                        }
                        case 1: {
                            return this.field13904;
                        }
                        case 2: {
                            return this.field13905;
                        }
                        case 3: {
                            return this.field13906;
                        }
                        default: {
                            break Label_0269;
                        }
                    }
                    break;
                }
            }
        }
        throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f1"));
    }
    
    public final void method8835(final int n, final Class2277 class2277) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f2"));
                    }
                    class2277.field13863 = this.field13903;
                    class2277.field13864 = this.field13904;
                    class2277.field13865 = this.field13905;
                    class2277.field13866 = this.field13906;
                }
                else {
                    class2277.field13863 = this.field13899;
                    class2277.field13864 = this.field13900;
                    class2277.field13865 = this.field13901;
                    class2277.field13866 = this.field13902;
                }
            }
            else {
                class2277.field13863 = this.field13895;
                class2277.field13864 = this.field13896;
                class2277.field13865 = this.field13897;
                class2277.field13866 = this.field13898;
            }
        }
        else {
            class2277.field13863 = this.field13891;
            class2277.field13864 = this.field13892;
            class2277.field13865 = this.field13893;
            class2277.field13866 = this.field13894;
        }
    }
    
    public final void method8836(final int n, final float[] array) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f2"));
                    }
                    array[0] = this.field13903;
                    array[1] = this.field13904;
                    array[2] = this.field13905;
                    array[3] = this.field13906;
                }
                else {
                    array[0] = this.field13899;
                    array[1] = this.field13900;
                    array[2] = this.field13901;
                    array[3] = this.field13902;
                }
            }
            else {
                array[0] = this.field13895;
                array[1] = this.field13896;
                array[2] = this.field13897;
                array[3] = this.field13898;
            }
        }
        else {
            array[0] = this.field13891;
            array[1] = this.field13892;
            array[2] = this.field13893;
            array[3] = this.field13894;
        }
    }
    
    public final void method8837(final int n, final Class2277 class2277) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f4"));
                    }
                    class2277.field13863 = this.field13894;
                    class2277.field13864 = this.field13898;
                    class2277.field13865 = this.field13902;
                    class2277.field13866 = this.field13906;
                }
                else {
                    class2277.field13863 = this.field13893;
                    class2277.field13864 = this.field13897;
                    class2277.field13865 = this.field13901;
                    class2277.field13866 = this.field13905;
                }
            }
            else {
                class2277.field13863 = this.field13892;
                class2277.field13864 = this.field13896;
                class2277.field13865 = this.field13900;
                class2277.field13866 = this.field13904;
            }
        }
        else {
            class2277.field13863 = this.field13891;
            class2277.field13864 = this.field13895;
            class2277.field13865 = this.field13899;
            class2277.field13866 = this.field13903;
        }
    }
    
    public final void method8838(final int n, final float[] array) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f4"));
                    }
                    array[0] = this.field13894;
                    array[1] = this.field13898;
                    array[2] = this.field13902;
                    array[3] = this.field13906;
                }
                else {
                    array[0] = this.field13893;
                    array[1] = this.field13897;
                    array[2] = this.field13901;
                    array[3] = this.field13905;
                }
            }
            else {
                array[0] = this.field13892;
                array[1] = this.field13896;
                array[2] = this.field13900;
                array[3] = this.field13904;
            }
        }
        else {
            array[0] = this.field13891;
            array[1] = this.field13895;
            array[2] = this.field13899;
            array[3] = this.field13903;
        }
    }
    
    public final void method8839(final float n) {
        final double[] array = new double[9];
        this.method8911(new double[3], array);
        this.field13891 = (float)(array[0] * n);
        this.field13892 = (float)(array[1] * n);
        this.field13893 = (float)(array[2] * n);
        this.field13895 = (float)(array[3] * n);
        this.field13896 = (float)(array[4] * n);
        this.field13897 = (float)(array[5] * n);
        this.field13899 = (float)(array[6] * n);
        this.field13900 = (float)(array[7] * n);
        this.field13901 = (float)(array[8] * n);
    }
    
    public final void method8840(final Class2274 class2274) {
        final double[] array = new double[9];
        this.method8911(new double[3], array);
        class2274.field13845 = array[0];
        class2274.field13846 = array[1];
        class2274.field13847 = array[2];
        class2274.field13848 = array[3];
        class2274.field13849 = array[4];
        class2274.field13850 = array[5];
        class2274.field13851 = array[6];
        class2274.field13852 = array[7];
        class2274.field13853 = array[8];
    }
    
    public final void method8841(final Class2296 class2296) {
        final double[] array = new double[9];
        this.method8911(new double[3], array);
        class2296.field13935 = (float)array[0];
        class2296.field13936 = (float)array[1];
        class2296.field13937 = (float)array[2];
        class2296.field13938 = (float)array[3];
        class2296.field13939 = (float)array[4];
        class2296.field13940 = (float)array[5];
        class2296.field13941 = (float)array[6];
        class2296.field13942 = (float)array[7];
        class2296.field13943 = (float)array[8];
    }
    
    public final float method8842(final Class2296 class2296, final Class2288 class2297) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method8911(array2, array);
        class2296.field13935 = (float)array[0];
        class2296.field13936 = (float)array[1];
        class2296.field13937 = (float)array[2];
        class2296.field13938 = (float)array[3];
        class2296.field13939 = (float)array[4];
        class2296.field13940 = (float)array[5];
        class2296.field13941 = (float)array[6];
        class2296.field13942 = (float)array[7];
        class2296.field13943 = (float)array[8];
        class2297.field13909 = this.field13894;
        class2297.field13910 = this.field13898;
        class2297.field13911 = this.field13902;
        return (float)Class2274.method8636(array2);
    }
    
    public final void method8843(final Class2278 class2278) {
        final double[] array = new double[9];
        this.method8911(new double[3], array);
        final double a = 0.25 * (1.0 + array[0] + array[4] + array[8]);
        if (((a >= 0.0) ? a : (-a)) >= 1.0E-30) {
            class2278.field13866 = (float)Math.sqrt(a);
            final double n = 0.25 / class2278.field13866;
            class2278.field13863 = (float)((array[7] - array[5]) * n);
            class2278.field13864 = (float)((array[2] - array[6]) * n);
            class2278.field13865 = (float)((array[3] - array[1]) * n);
            return;
        }
        class2278.field13866 = 0.0f;
        final double a2 = -0.5 * (array[4] + array[8]);
        if (((a2 >= 0.0) ? a2 : (-a2)) >= 1.0E-30) {
            class2278.field13863 = (float)Math.sqrt(a2);
            final double n2 = 0.5 / class2278.field13863;
            class2278.field13864 = (float)(array[3] * n2);
            class2278.field13865 = (float)(array[6] * n2);
            return;
        }
        class2278.field13863 = 0.0f;
        final double a3 = 0.5 * (1.0 - array[8]);
        if (((a3 >= 0.0) ? a3 : (-a3)) < 1.0E-30) {
            class2278.field13864 = 0.0f;
            class2278.field13865 = 1.0f;
            return;
        }
        class2278.field13864 = (float)Math.sqrt(a3);
        class2278.field13865 = (float)(array[7] / (2.0 * class2278.field13864));
    }
    
    public final void method8844(final Class2288 class2288) {
        class2288.field13909 = this.field13894;
        class2288.field13910 = this.field13898;
        class2288.field13911 = this.field13902;
    }
    
    public final void method8845(final Class2296 class2296) {
        class2296.field13935 = this.field13891;
        class2296.field13936 = this.field13892;
        class2296.field13937 = this.field13893;
        class2296.field13938 = this.field13895;
        class2296.field13939 = this.field13896;
        class2296.field13940 = this.field13897;
        class2296.field13941 = this.field13899;
        class2296.field13942 = this.field13900;
        class2296.field13943 = this.field13901;
    }
    
    public final float method8846() {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method8911(array2, array);
        return (float)Class2274.method8636(array2);
    }
    
    public final void method8847(final Class2296 class2296) {
        this.field13891 = class2296.field13935;
        this.field13892 = class2296.field13936;
        this.field13893 = class2296.field13937;
        this.field13895 = class2296.field13938;
        this.field13896 = class2296.field13939;
        this.field13897 = class2296.field13940;
        this.field13899 = class2296.field13941;
        this.field13900 = class2296.field13942;
        this.field13901 = class2296.field13943;
    }
    
    public final void method8848(final int n, final float n2, final float n3, final float n4, final float n5) {
        switch (n) {
            case 0: {
                this.field13891 = n2;
                this.field13892 = n3;
                this.field13893 = n4;
                this.field13894 = n5;
                break;
            }
            case 1: {
                this.field13895 = n2;
                this.field13896 = n3;
                this.field13897 = n4;
                this.field13898 = n5;
                break;
            }
            case 2: {
                this.field13899 = n2;
                this.field13900 = n3;
                this.field13901 = n4;
                this.field13902 = n5;
                break;
            }
            case 3: {
                this.field13903 = n2;
                this.field13904 = n3;
                this.field13905 = n4;
                this.field13906 = n5;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f6"));
            }
        }
    }
    
    public final void method8849(final int n, final Class2277 class2277) {
        switch (n) {
            case 0: {
                this.field13891 = class2277.field13863;
                this.field13892 = class2277.field13864;
                this.field13893 = class2277.field13865;
                this.field13894 = class2277.field13866;
                break;
            }
            case 1: {
                this.field13895 = class2277.field13863;
                this.field13896 = class2277.field13864;
                this.field13897 = class2277.field13865;
                this.field13898 = class2277.field13866;
                break;
            }
            case 2: {
                this.field13899 = class2277.field13863;
                this.field13900 = class2277.field13864;
                this.field13901 = class2277.field13865;
                this.field13902 = class2277.field13866;
                break;
            }
            case 3: {
                this.field13903 = class2277.field13863;
                this.field13904 = class2277.field13864;
                this.field13905 = class2277.field13865;
                this.field13906 = class2277.field13866;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f6"));
            }
        }
    }
    
    public final void method8850(final int n, final float[] array) {
        switch (n) {
            case 0: {
                this.field13891 = array[0];
                this.field13892 = array[1];
                this.field13893 = array[2];
                this.field13894 = array[3];
                break;
            }
            case 1: {
                this.field13895 = array[0];
                this.field13896 = array[1];
                this.field13897 = array[2];
                this.field13898 = array[3];
                break;
            }
            case 2: {
                this.field13899 = array[0];
                this.field13900 = array[1];
                this.field13901 = array[2];
                this.field13902 = array[3];
                break;
            }
            case 3: {
                this.field13903 = array[0];
                this.field13904 = array[1];
                this.field13905 = array[2];
                this.field13906 = array[3];
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f6"));
            }
        }
    }
    
    public final void method8851(final int n, final float n2, final float n3, final float n4, final float n5) {
        switch (n) {
            case 0: {
                this.field13891 = n2;
                this.field13895 = n3;
                this.field13899 = n4;
                this.field13903 = n5;
                break;
            }
            case 1: {
                this.field13892 = n2;
                this.field13896 = n3;
                this.field13900 = n4;
                this.field13904 = n5;
                break;
            }
            case 2: {
                this.field13893 = n2;
                this.field13897 = n3;
                this.field13901 = n4;
                this.field13905 = n5;
                break;
            }
            case 3: {
                this.field13894 = n2;
                this.field13898 = n3;
                this.field13902 = n4;
                this.field13906 = n5;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f9"));
            }
        }
    }
    
    public final void method8852(final int n, final Class2277 class2277) {
        switch (n) {
            case 0: {
                this.field13891 = class2277.field13863;
                this.field13895 = class2277.field13864;
                this.field13899 = class2277.field13865;
                this.field13903 = class2277.field13866;
                break;
            }
            case 1: {
                this.field13892 = class2277.field13863;
                this.field13896 = class2277.field13864;
                this.field13900 = class2277.field13865;
                this.field13904 = class2277.field13866;
                break;
            }
            case 2: {
                this.field13893 = class2277.field13863;
                this.field13897 = class2277.field13864;
                this.field13901 = class2277.field13865;
                this.field13905 = class2277.field13866;
                break;
            }
            case 3: {
                this.field13894 = class2277.field13863;
                this.field13898 = class2277.field13864;
                this.field13902 = class2277.field13865;
                this.field13906 = class2277.field13866;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f9"));
            }
        }
    }
    
    public final void method8853(final int n, final float[] array) {
        switch (n) {
            case 0: {
                this.field13891 = array[0];
                this.field13895 = array[1];
                this.field13899 = array[2];
                this.field13903 = array[3];
                break;
            }
            case 1: {
                this.field13892 = array[0];
                this.field13896 = array[1];
                this.field13900 = array[2];
                this.field13904 = array[3];
                break;
            }
            case 2: {
                this.field13893 = array[0];
                this.field13897 = array[1];
                this.field13901 = array[2];
                this.field13905 = array[3];
                break;
            }
            case 3: {
                this.field13894 = array[0];
                this.field13898 = array[1];
                this.field13902 = array[2];
                this.field13906 = array[3];
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4f9"));
            }
        }
    }
    
    public final void method8854(final float n) {
        this.field13891 += n;
        this.field13892 += n;
        this.field13893 += n;
        this.field13894 += n;
        this.field13895 += n;
        this.field13896 += n;
        this.field13897 += n;
        this.field13898 += n;
        this.field13899 += n;
        this.field13900 += n;
        this.field13901 += n;
        this.field13902 += n;
        this.field13903 += n;
        this.field13904 += n;
        this.field13905 += n;
        this.field13906 += n;
    }
    
    public final void method8855(final float n, final Class2284 class2284) {
        this.field13891 = class2284.field13891 + n;
        this.field13892 = class2284.field13892 + n;
        this.field13893 = class2284.field13893 + n;
        this.field13894 = class2284.field13894 + n;
        this.field13895 = class2284.field13895 + n;
        this.field13896 = class2284.field13896 + n;
        this.field13897 = class2284.field13897 + n;
        this.field13898 = class2284.field13898 + n;
        this.field13899 = class2284.field13899 + n;
        this.field13900 = class2284.field13900 + n;
        this.field13901 = class2284.field13901 + n;
        this.field13902 = class2284.field13902 + n;
        this.field13903 = class2284.field13903 + n;
        this.field13904 = class2284.field13904 + n;
        this.field13905 = class2284.field13905 + n;
        this.field13906 = class2284.field13906 + n;
    }
    
    public final void method8856(final Class2284 class2284, final Class2284 class2285) {
        this.field13891 = class2284.field13891 + class2285.field13891;
        this.field13892 = class2284.field13892 + class2285.field13892;
        this.field13893 = class2284.field13893 + class2285.field13893;
        this.field13894 = class2284.field13894 + class2285.field13894;
        this.field13895 = class2284.field13895 + class2285.field13895;
        this.field13896 = class2284.field13896 + class2285.field13896;
        this.field13897 = class2284.field13897 + class2285.field13897;
        this.field13898 = class2284.field13898 + class2285.field13898;
        this.field13899 = class2284.field13899 + class2285.field13899;
        this.field13900 = class2284.field13900 + class2285.field13900;
        this.field13901 = class2284.field13901 + class2285.field13901;
        this.field13902 = class2284.field13902 + class2285.field13902;
        this.field13903 = class2284.field13903 + class2285.field13903;
        this.field13904 = class2284.field13904 + class2285.field13904;
        this.field13905 = class2284.field13905 + class2285.field13905;
        this.field13906 = class2284.field13906 + class2285.field13906;
    }
    
    public final void method8857(final Class2284 class2284) {
        this.field13891 += class2284.field13891;
        this.field13892 += class2284.field13892;
        this.field13893 += class2284.field13893;
        this.field13894 += class2284.field13894;
        this.field13895 += class2284.field13895;
        this.field13896 += class2284.field13896;
        this.field13897 += class2284.field13897;
        this.field13898 += class2284.field13898;
        this.field13899 += class2284.field13899;
        this.field13900 += class2284.field13900;
        this.field13901 += class2284.field13901;
        this.field13902 += class2284.field13902;
        this.field13903 += class2284.field13903;
        this.field13904 += class2284.field13904;
        this.field13905 += class2284.field13905;
        this.field13906 += class2284.field13906;
    }
    
    public final void method8858(final Class2284 class2284, final Class2284 class2285) {
        this.field13891 = class2284.field13891 - class2285.field13891;
        this.field13892 = class2284.field13892 - class2285.field13892;
        this.field13893 = class2284.field13893 - class2285.field13893;
        this.field13894 = class2284.field13894 - class2285.field13894;
        this.field13895 = class2284.field13895 - class2285.field13895;
        this.field13896 = class2284.field13896 - class2285.field13896;
        this.field13897 = class2284.field13897 - class2285.field13897;
        this.field13898 = class2284.field13898 - class2285.field13898;
        this.field13899 = class2284.field13899 - class2285.field13899;
        this.field13900 = class2284.field13900 - class2285.field13900;
        this.field13901 = class2284.field13901 - class2285.field13901;
        this.field13902 = class2284.field13902 - class2285.field13902;
        this.field13903 = class2284.field13903 - class2285.field13903;
        this.field13904 = class2284.field13904 - class2285.field13904;
        this.field13905 = class2284.field13905 - class2285.field13905;
        this.field13906 = class2284.field13906 - class2285.field13906;
    }
    
    public final void method8859(final Class2284 class2284) {
        this.field13891 -= class2284.field13891;
        this.field13892 -= class2284.field13892;
        this.field13893 -= class2284.field13893;
        this.field13894 -= class2284.field13894;
        this.field13895 -= class2284.field13895;
        this.field13896 -= class2284.field13896;
        this.field13897 -= class2284.field13897;
        this.field13898 -= class2284.field13898;
        this.field13899 -= class2284.field13899;
        this.field13900 -= class2284.field13900;
        this.field13901 -= class2284.field13901;
        this.field13902 -= class2284.field13902;
        this.field13903 -= class2284.field13903;
        this.field13904 -= class2284.field13904;
        this.field13905 -= class2284.field13905;
        this.field13906 -= class2284.field13906;
    }
    
    public final void method8860() {
        final float field13895 = this.field13895;
        this.field13895 = this.field13892;
        this.field13892 = field13895;
        final float field13896 = this.field13899;
        this.field13899 = this.field13893;
        this.field13893 = field13896;
        final float field13897 = this.field13903;
        this.field13903 = this.field13894;
        this.field13894 = field13897;
        final float field13898 = this.field13900;
        this.field13900 = this.field13897;
        this.field13897 = field13898;
        final float field13899 = this.field13904;
        this.field13904 = this.field13898;
        this.field13898 = field13899;
        final float field13900 = this.field13905;
        this.field13905 = this.field13902;
        this.field13902 = field13900;
    }
    
    public final void method8861(final Class2284 class2284) {
        if (this == class2284) {
            this.method8860();
        }
        else {
            this.field13891 = class2284.field13891;
            this.field13892 = class2284.field13895;
            this.field13893 = class2284.field13899;
            this.field13894 = class2284.field13903;
            this.field13895 = class2284.field13892;
            this.field13896 = class2284.field13896;
            this.field13897 = class2284.field13900;
            this.field13898 = class2284.field13904;
            this.field13899 = class2284.field13893;
            this.field13900 = class2284.field13897;
            this.field13901 = class2284.field13901;
            this.field13902 = class2284.field13905;
            this.field13903 = class2284.field13894;
            this.field13904 = class2284.field13898;
            this.field13905 = class2284.field13902;
            this.field13906 = class2284.field13906;
        }
    }
    
    public final void method8862(final Class2278 class2278) {
        this.field13891 = 1.0f - 2.0f * class2278.field13864 * class2278.field13864 - 2.0f * class2278.field13865 * class2278.field13865;
        this.field13895 = 2.0f * (class2278.field13863 * class2278.field13864 + class2278.field13866 * class2278.field13865);
        this.field13899 = 2.0f * (class2278.field13863 * class2278.field13865 - class2278.field13866 * class2278.field13864);
        this.field13892 = 2.0f * (class2278.field13863 * class2278.field13864 - class2278.field13866 * class2278.field13865);
        this.field13896 = 1.0f - 2.0f * class2278.field13863 * class2278.field13863 - 2.0f * class2278.field13865 * class2278.field13865;
        this.field13900 = 2.0f * (class2278.field13864 * class2278.field13865 + class2278.field13866 * class2278.field13863);
        this.field13893 = 2.0f * (class2278.field13863 * class2278.field13865 + class2278.field13866 * class2278.field13864);
        this.field13897 = 2.0f * (class2278.field13864 * class2278.field13865 - class2278.field13866 * class2278.field13863);
        this.field13901 = 1.0f - 2.0f * class2278.field13863 * class2278.field13863 - 2.0f * class2278.field13864 * class2278.field13864;
        this.field13894 = 0.0f;
        this.field13898 = 0.0f;
        this.field13902 = 0.0f;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8863(final Class2307 class2307) {
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
            this.field13891 = n8 * n3 * n3 + n7;
            this.field13892 = n8 * n10 - n6 * n5;
            this.field13893 = n8 * n9 + n6 * n4;
            this.field13895 = n8 * n10 + n6 * n5;
            this.field13896 = n8 * n4 * n4 + n7;
            this.field13897 = n8 * n11 - n6 * n3;
            this.field13899 = n8 * n9 - n6 * n4;
            this.field13900 = n8 * n11 + n6 * n3;
            this.field13901 = n8 * n5 * n5 + n7;
        }
        else {
            this.field13891 = 1.0f;
            this.field13892 = 0.0f;
            this.field13893 = 0.0f;
            this.field13895 = 0.0f;
            this.field13896 = 1.0f;
            this.field13897 = 0.0f;
            this.field13899 = 0.0f;
            this.field13900 = 0.0f;
            this.field13901 = 1.0f;
        }
        this.field13894 = 0.0f;
        this.field13898 = 0.0f;
        this.field13902 = 0.0f;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8864(final Class8 class8) {
        this.field13891 = (float)(1.0 - 2.0 * class8.field19 * class8.field19 - 2.0 * class8.field20 * class8.field20);
        this.field13895 = (float)(2.0 * (class8.field18 * class8.field19 + class8.field21 * class8.field20));
        this.field13899 = (float)(2.0 * (class8.field18 * class8.field20 - class8.field21 * class8.field19));
        this.field13892 = (float)(2.0 * (class8.field18 * class8.field19 - class8.field21 * class8.field20));
        this.field13896 = (float)(1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field20 * class8.field20);
        this.field13900 = (float)(2.0 * (class8.field19 * class8.field20 + class8.field21 * class8.field18));
        this.field13893 = (float)(2.0 * (class8.field18 * class8.field20 + class8.field21 * class8.field19));
        this.field13897 = (float)(2.0 * (class8.field19 * class8.field20 - class8.field21 * class8.field18));
        this.field13901 = (float)(1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field19 * class8.field19);
        this.field13894 = 0.0f;
        this.field13898 = 0.0f;
        this.field13902 = 0.0f;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8865(final Class24 class24) {
        final double sqrt = Math.sqrt(class24.field67 * class24.field67 + class24.field68 * class24.field68 + class24.field69 * class24.field69);
        if (sqrt >= 1.0E-8) {
            final double n = 1.0 / sqrt;
            final double n2 = class24.field67 * n;
            final double n3 = class24.field68 * n;
            final double n4 = class24.field69 * n;
            final float n5 = (float)Math.sin(class24.field70);
            final float n6 = (float)Math.cos(class24.field70);
            final float n7 = 1.0f - n6;
            final float n8 = (float)(n2 * n4);
            final float n9 = (float)(n2 * n3);
            final float n10 = (float)(n3 * n4);
            this.field13891 = n7 * (float)(n2 * n2) + n6;
            this.field13892 = n7 * n9 - n5 * (float)n4;
            this.field13893 = n7 * n8 + n5 * (float)n3;
            this.field13895 = n7 * n9 + n5 * (float)n4;
            this.field13896 = n7 * (float)(n3 * n3) + n6;
            this.field13897 = n7 * n10 - n5 * (float)n2;
            this.field13899 = n7 * n8 - n5 * (float)n3;
            this.field13900 = n7 * n10 + n5 * (float)n2;
            this.field13901 = n7 * (float)(n4 * n4) + n6;
        }
        else {
            this.field13891 = 1.0f;
            this.field13892 = 0.0f;
            this.field13893 = 0.0f;
            this.field13895 = 0.0f;
            this.field13896 = 1.0f;
            this.field13897 = 0.0f;
            this.field13899 = 0.0f;
            this.field13900 = 0.0f;
            this.field13901 = 1.0f;
        }
        this.field13894 = 0.0f;
        this.field13898 = 0.0f;
        this.field13902 = 0.0f;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8866(final Class8 class8, final Class2273 class9, final double n) {
        this.field13891 = (float)(n * (1.0 - 2.0 * class8.field19 * class8.field19 - 2.0 * class8.field20 * class8.field20));
        this.field13895 = (float)(n * (2.0 * (class8.field18 * class8.field19 + class8.field21 * class8.field20)));
        this.field13899 = (float)(n * (2.0 * (class8.field18 * class8.field20 - class8.field21 * class8.field19)));
        this.field13892 = (float)(n * (2.0 * (class8.field18 * class8.field19 - class8.field21 * class8.field20)));
        this.field13896 = (float)(n * (1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field20 * class8.field20));
        this.field13900 = (float)(n * (2.0 * (class8.field19 * class8.field20 + class8.field21 * class8.field18)));
        this.field13893 = (float)(n * (2.0 * (class8.field18 * class8.field20 + class8.field21 * class8.field19)));
        this.field13897 = (float)(n * (2.0 * (class8.field19 * class8.field20 - class8.field21 * class8.field18)));
        this.field13901 = (float)(n * (1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field19 * class8.field19));
        this.field13894 = (float)class9.field13839;
        this.field13898 = (float)class9.field13840;
        this.field13902 = (float)class9.field13841;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8867(final Class2278 class2278, final Class2288 class2279, final float n) {
        this.field13891 = n * (1.0f - 2.0f * class2278.field13864 * class2278.field13864 - 2.0f * class2278.field13865 * class2278.field13865);
        this.field13895 = n * (2.0f * (class2278.field13863 * class2278.field13864 + class2278.field13866 * class2278.field13865));
        this.field13899 = n * (2.0f * (class2278.field13863 * class2278.field13865 - class2278.field13866 * class2278.field13864));
        this.field13892 = n * (2.0f * (class2278.field13863 * class2278.field13864 - class2278.field13866 * class2278.field13865));
        this.field13896 = n * (1.0f - 2.0f * class2278.field13863 * class2278.field13863 - 2.0f * class2278.field13865 * class2278.field13865);
        this.field13900 = n * (2.0f * (class2278.field13864 * class2278.field13865 + class2278.field13866 * class2278.field13863));
        this.field13893 = n * (2.0f * (class2278.field13863 * class2278.field13865 + class2278.field13866 * class2278.field13864));
        this.field13897 = n * (2.0f * (class2278.field13864 * class2278.field13865 - class2278.field13866 * class2278.field13863));
        this.field13901 = n * (1.0f - 2.0f * class2278.field13863 * class2278.field13863 - 2.0f * class2278.field13864 * class2278.field13864);
        this.field13894 = class2279.field13909;
        this.field13898 = class2279.field13910;
        this.field13902 = class2279.field13911;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8868(final Class2304 class2304) {
        this.field13891 = (float)class2304.field13961;
        this.field13892 = (float)class2304.field13962;
        this.field13893 = (float)class2304.field13963;
        this.field13894 = (float)class2304.field13964;
        this.field13895 = (float)class2304.field13965;
        this.field13896 = (float)class2304.field13966;
        this.field13897 = (float)class2304.field13967;
        this.field13898 = (float)class2304.field13968;
        this.field13899 = (float)class2304.field13969;
        this.field13900 = (float)class2304.field13970;
        this.field13901 = (float)class2304.field13971;
        this.field13902 = (float)class2304.field13972;
        this.field13903 = (float)class2304.field13973;
        this.field13904 = (float)class2304.field13974;
        this.field13905 = (float)class2304.field13975;
        this.field13906 = (float)class2304.field13976;
    }
    
    public final void method8869(final Class2284 class2284) {
        this.field13891 = class2284.field13891;
        this.field13892 = class2284.field13892;
        this.field13893 = class2284.field13893;
        this.field13894 = class2284.field13894;
        this.field13895 = class2284.field13895;
        this.field13896 = class2284.field13896;
        this.field13897 = class2284.field13897;
        this.field13898 = class2284.field13898;
        this.field13899 = class2284.field13899;
        this.field13900 = class2284.field13900;
        this.field13901 = class2284.field13901;
        this.field13902 = class2284.field13902;
        this.field13903 = class2284.field13903;
        this.field13904 = class2284.field13904;
        this.field13905 = class2284.field13905;
        this.field13906 = class2284.field13906;
    }
    
    public final void method8870(final Class2284 class2284) {
        this.method8872(class2284);
    }
    
    public final void method8871() {
        this.method8872(this);
    }
    
    public final void method8872(final Class2284 class2284) {
        final double[] array = new double[16];
        final double[] array2 = new double[16];
        final int[] array3 = new int[4];
        array[0] = class2284.field13891;
        array[1] = class2284.field13892;
        array[2] = class2284.field13893;
        array[3] = class2284.field13894;
        array[4] = class2284.field13895;
        array[5] = class2284.field13896;
        array[6] = class2284.field13897;
        array[7] = class2284.field13898;
        array[8] = class2284.field13899;
        array[9] = class2284.field13900;
        array[10] = class2284.field13901;
        array[11] = class2284.field13902;
        array[12] = class2284.field13903;
        array[13] = class2284.field13904;
        array[14] = class2284.field13905;
        array[15] = class2284.field13906;
        if (method8873(array, array3)) {
            for (int i = 0; i < 16; ++i) {
                array2[i] = 0.0;
            }
            array2[5] = (array2[0] = 1.0);
            array2[15] = (array2[10] = 1.0);
            method8874(array, array3, array2);
            this.field13891 = (float)array2[0];
            this.field13892 = (float)array2[1];
            this.field13893 = (float)array2[2];
            this.field13894 = (float)array2[3];
            this.field13895 = (float)array2[4];
            this.field13896 = (float)array2[5];
            this.field13897 = (float)array2[6];
            this.field13898 = (float)array2[7];
            this.field13899 = (float)array2[8];
            this.field13900 = (float)array2[9];
            this.field13901 = (float)array2[10];
            this.field13902 = (float)array2[11];
            this.field13903 = (float)array2[12];
            this.field13904 = (float)array2[13];
            this.field13905 = (float)array2[14];
            this.field13906 = (float)array2[15];
            return;
        }
        throw new Class2383(Class9531.method35584("Matrix4f12"));
    }
    
    public static boolean method8873(final double[] array, final int[] array2) {
        final double[] array3 = new double[4];
        int n = 0;
        int n2 = 0;
        int n3 = 4;
        while (n3-- != 0) {
            double n4 = 0.0;
            int n5 = 4;
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
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < i; ++j) {
                final int n7 = n6 + 4 * j + i;
                double n8 = array[n7];
                int n9 = j;
                int n10 = n6 + 4 * j;
                int n11 = n6 + i;
                while (n9-- != 0) {
                    n8 -= array[n10] * array[n11];
                    ++n10;
                    n11 += 4;
                }
                array[n7] = n8;
            }
            double n12 = 0.0;
            int n13 = -1;
            for (int k = i; k < 4; ++k) {
                final int n14 = n6 + 4 * k + i;
                double a = array[n14];
                int n15 = i;
                int n16 = n6 + 4 * k;
                int n17 = n6 + i;
                while (n15-- != 0) {
                    a -= array[n16] * array[n17];
                    ++n16;
                    n17 += 4;
                }
                array[n14] = a;
                final double n18;
                if ((n18 = array3[k] * Math.abs(a)) >= n12) {
                    n12 = n18;
                    n13 = k;
                }
            }
            if (n13 < 0) {
                throw new RuntimeException(Class9531.method35584("Matrix4f13"));
            }
            if (i != n13) {
                int n19 = 4;
                int n20 = n6 + 4 * n13;
                int n21 = n6 + 4 * i;
                while (n19-- != 0) {
                    final double n22 = array[n20];
                    array[n20++] = array[n21];
                    array[n21++] = n22;
                }
                array3[n13] = array3[i];
            }
            array2[i] = n13;
            if (array[n6 + 4 * i + i] == 0.0) {
                return false;
            }
            if (i != 3) {
                final double n23 = 1.0 / array[n6 + 4 * i + i];
                int n24 = n6 + 4 * (i + 1) + i;
                int n25 = 3 - i;
                while (n25-- != 0) {
                    final int n26 = n24;
                    array[n26] *= n23;
                    n24 += 4;
                }
            }
        }
        return true;
    }
    
    public static void method8874(final double[] array, final int[] array2, final double[] array3) {
        final int n = 0;
        for (int i = 0; i < 4; ++i) {
            final int n2 = i;
            int n3 = -1;
            for (int j = 0; j < 4; ++j) {
                final int n4 = array2[n + j];
                double n5 = array3[n2 + 4 * n4];
                array3[n2 + 4 * n4] = array3[n2 + 4 * j];
                if (n3 < 0) {
                    if (n5 != 0.0) {
                        n3 = j;
                    }
                }
                else {
                    final int n6 = j * 4;
                    for (int k = n3; k <= j - 1; ++k) {
                        n5 -= array[n6 + k] * array3[n2 + 4 * k];
                    }
                }
                array3[n2 + 4 * j] = n5;
            }
            int n7 = 12;
            final int n8 = n2 + 12;
            array3[n8] /= array[n7 + 3];
            n7 -= 4;
            array3[n2 + 8] = (array3[n2 + 8] - array[n7 + 3] * array3[n2 + 12]) / array[n7 + 2];
            n7 -= 4;
            array3[n2 + 4] = (array3[n2 + 4] - array[n7 + 2] * array3[n2 + 8] - array[n7 + 3] * array3[n2 + 12]) / array[n7 + 1];
            n7 -= 4;
            array3[n2] = (array3[n2] - array[n7 + 1] * array3[n2 + 4] - array[n7 + 2] * array3[n2 + 8] - array[n7 + 3] * array3[n2 + 12]) / array[n7];
        }
    }
    
    public final float method8875() {
        return this.field13891 * (this.field13896 * this.field13901 * this.field13906 + this.field13897 * this.field13902 * this.field13904 + this.field13898 * this.field13900 * this.field13905 - this.field13898 * this.field13901 * this.field13904 - this.field13896 * this.field13902 * this.field13905 - this.field13897 * this.field13900 * this.field13906) - this.field13892 * (this.field13895 * this.field13901 * this.field13906 + this.field13897 * this.field13902 * this.field13903 + this.field13898 * this.field13899 * this.field13905 - this.field13898 * this.field13901 * this.field13903 - this.field13895 * this.field13902 * this.field13905 - this.field13897 * this.field13899 * this.field13906) + this.field13893 * (this.field13895 * this.field13900 * this.field13906 + this.field13896 * this.field13902 * this.field13903 + this.field13898 * this.field13899 * this.field13904 - this.field13898 * this.field13900 * this.field13903 - this.field13895 * this.field13902 * this.field13904 - this.field13896 * this.field13899 * this.field13906) - this.field13894 * (this.field13895 * this.field13900 * this.field13905 + this.field13896 * this.field13901 * this.field13903 + this.field13897 * this.field13899 * this.field13904 - this.field13897 * this.field13900 * this.field13903 - this.field13895 * this.field13901 * this.field13904 - this.field13896 * this.field13899 * this.field13905);
    }
    
    public final void method8876(final Class2296 class2296) {
        this.field13891 = class2296.field13935;
        this.field13892 = class2296.field13936;
        this.field13893 = class2296.field13937;
        this.field13894 = 0.0f;
        this.field13895 = class2296.field13938;
        this.field13896 = class2296.field13939;
        this.field13897 = class2296.field13940;
        this.field13898 = 0.0f;
        this.field13899 = class2296.field13941;
        this.field13900 = class2296.field13942;
        this.field13901 = class2296.field13943;
        this.field13902 = 0.0f;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8877(final Class2274 class2274) {
        this.field13891 = (float)class2274.field13845;
        this.field13892 = (float)class2274.field13846;
        this.field13893 = (float)class2274.field13847;
        this.field13894 = 0.0f;
        this.field13895 = (float)class2274.field13848;
        this.field13896 = (float)class2274.field13849;
        this.field13897 = (float)class2274.field13850;
        this.field13898 = 0.0f;
        this.field13899 = (float)class2274.field13851;
        this.field13900 = (float)class2274.field13852;
        this.field13901 = (float)class2274.field13853;
        this.field13902 = 0.0f;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8878(final float field13901) {
        this.field13891 = field13901;
        this.field13892 = 0.0f;
        this.field13893 = 0.0f;
        this.field13894 = 0.0f;
        this.field13895 = 0.0f;
        this.field13896 = field13901;
        this.field13897 = 0.0f;
        this.field13898 = 0.0f;
        this.field13899 = 0.0f;
        this.field13900 = 0.0f;
        this.field13901 = field13901;
        this.field13902 = 0.0f;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8879(final float[] array) {
        this.field13891 = array[0];
        this.field13892 = array[1];
        this.field13893 = array[2];
        this.field13894 = array[3];
        this.field13895 = array[4];
        this.field13896 = array[5];
        this.field13897 = array[6];
        this.field13898 = array[7];
        this.field13899 = array[8];
        this.field13900 = array[9];
        this.field13901 = array[10];
        this.field13902 = array[11];
        this.field13903 = array[12];
        this.field13904 = array[13];
        this.field13905 = array[14];
        this.field13906 = array[15];
    }
    
    public final void method8880(final Class2288 class2288) {
        this.field13891 = 1.0f;
        this.field13892 = 0.0f;
        this.field13893 = 0.0f;
        this.field13894 = class2288.field13909;
        this.field13895 = 0.0f;
        this.field13896 = 1.0f;
        this.field13897 = 0.0f;
        this.field13898 = class2288.field13910;
        this.field13899 = 0.0f;
        this.field13900 = 0.0f;
        this.field13901 = 1.0f;
        this.field13902 = class2288.field13911;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8881(final float field13901, final Class2288 class2288) {
        this.field13891 = field13901;
        this.field13892 = 0.0f;
        this.field13893 = 0.0f;
        this.field13894 = class2288.field13909;
        this.field13895 = 0.0f;
        this.field13896 = field13901;
        this.field13897 = 0.0f;
        this.field13898 = class2288.field13910;
        this.field13899 = 0.0f;
        this.field13900 = 0.0f;
        this.field13901 = field13901;
        this.field13902 = class2288.field13911;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8882(final Class2288 class2288, final float field13901) {
        this.field13891 = field13901;
        this.field13892 = 0.0f;
        this.field13893 = 0.0f;
        this.field13894 = field13901 * class2288.field13909;
        this.field13895 = 0.0f;
        this.field13896 = field13901;
        this.field13897 = 0.0f;
        this.field13898 = field13901 * class2288.field13910;
        this.field13899 = 0.0f;
        this.field13900 = 0.0f;
        this.field13901 = field13901;
        this.field13902 = field13901 * class2288.field13911;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8883(final Class2296 class2296, final Class2288 class2297, final float n) {
        this.field13891 = class2296.field13935 * n;
        this.field13892 = class2296.field13936 * n;
        this.field13893 = class2296.field13937 * n;
        this.field13894 = class2297.field13909;
        this.field13895 = class2296.field13938 * n;
        this.field13896 = class2296.field13939 * n;
        this.field13897 = class2296.field13940 * n;
        this.field13898 = class2297.field13910;
        this.field13899 = class2296.field13941 * n;
        this.field13900 = class2296.field13942 * n;
        this.field13901 = class2296.field13943 * n;
        this.field13902 = class2297.field13911;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8884(final Class2274 class2274, final Class2273 class2275, final double n) {
        this.field13891 = (float)(class2274.field13845 * n);
        this.field13892 = (float)(class2274.field13846 * n);
        this.field13893 = (float)(class2274.field13847 * n);
        this.field13894 = (float)class2275.field13839;
        this.field13895 = (float)(class2274.field13848 * n);
        this.field13896 = (float)(class2274.field13849 * n);
        this.field13897 = (float)(class2274.field13850 * n);
        this.field13898 = (float)class2275.field13840;
        this.field13899 = (float)(class2274.field13851 * n);
        this.field13900 = (float)(class2274.field13852 * n);
        this.field13901 = (float)(class2274.field13853 * n);
        this.field13902 = (float)class2275.field13841;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8885(final Class2288 class2288) {
        this.field13894 = class2288.field13909;
        this.field13898 = class2288.field13910;
        this.field13902 = class2288.field13911;
    }
    
    public final void method8886(final float n) {
        final float field13900 = (float)Math.sin(n);
        final float n2 = (float)Math.cos(n);
        this.field13891 = 1.0f;
        this.field13892 = 0.0f;
        this.field13893 = 0.0f;
        this.field13894 = 0.0f;
        this.field13895 = 0.0f;
        this.field13896 = n2;
        this.field13897 = -field13900;
        this.field13898 = 0.0f;
        this.field13899 = 0.0f;
        this.field13900 = field13900;
        this.field13901 = n2;
        this.field13902 = 0.0f;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8887(final float n) {
        final float field13893 = (float)Math.sin(n);
        final float n2 = (float)Math.cos(n);
        this.field13891 = n2;
        this.field13892 = 0.0f;
        this.field13893 = field13893;
        this.field13894 = 0.0f;
        this.field13895 = 0.0f;
        this.field13896 = 1.0f;
        this.field13897 = 0.0f;
        this.field13898 = 0.0f;
        this.field13899 = -field13893;
        this.field13900 = 0.0f;
        this.field13901 = n2;
        this.field13902 = 0.0f;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8888(final float n) {
        final float field13895 = (float)Math.sin(n);
        final float n2 = (float)Math.cos(n);
        this.field13891 = n2;
        this.field13892 = -field13895;
        this.field13893 = 0.0f;
        this.field13894 = 0.0f;
        this.field13895 = field13895;
        this.field13896 = n2;
        this.field13897 = 0.0f;
        this.field13898 = 0.0f;
        this.field13899 = 0.0f;
        this.field13900 = 0.0f;
        this.field13901 = 1.0f;
        this.field13902 = 0.0f;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 1.0f;
    }
    
    public final void method8889(final float n) {
        this.field13891 *= n;
        this.field13892 *= n;
        this.field13893 *= n;
        this.field13894 *= n;
        this.field13895 *= n;
        this.field13896 *= n;
        this.field13897 *= n;
        this.field13898 *= n;
        this.field13899 *= n;
        this.field13900 *= n;
        this.field13901 *= n;
        this.field13902 *= n;
        this.field13903 *= n;
        this.field13904 *= n;
        this.field13905 *= n;
        this.field13906 *= n;
    }
    
    public final void method8890(final float n, final Class2284 class2284) {
        this.field13891 = class2284.field13891 * n;
        this.field13892 = class2284.field13892 * n;
        this.field13893 = class2284.field13893 * n;
        this.field13894 = class2284.field13894 * n;
        this.field13895 = class2284.field13895 * n;
        this.field13896 = class2284.field13896 * n;
        this.field13897 = class2284.field13897 * n;
        this.field13898 = class2284.field13898 * n;
        this.field13899 = class2284.field13899 * n;
        this.field13900 = class2284.field13900 * n;
        this.field13901 = class2284.field13901 * n;
        this.field13902 = class2284.field13902 * n;
        this.field13903 = class2284.field13903 * n;
        this.field13904 = class2284.field13904 * n;
        this.field13905 = class2284.field13905 * n;
        this.field13906 = class2284.field13906 * n;
    }
    
    public final void method8891(final Class2284 class2284) {
        final float field13891 = this.field13891 * class2284.field13891 + this.field13892 * class2284.field13895 + this.field13893 * class2284.field13899 + this.field13894 * class2284.field13903;
        final float field13892 = this.field13891 * class2284.field13892 + this.field13892 * class2284.field13896 + this.field13893 * class2284.field13900 + this.field13894 * class2284.field13904;
        final float field13893 = this.field13891 * class2284.field13893 + this.field13892 * class2284.field13897 + this.field13893 * class2284.field13901 + this.field13894 * class2284.field13905;
        final float field13894 = this.field13891 * class2284.field13894 + this.field13892 * class2284.field13898 + this.field13893 * class2284.field13902 + this.field13894 * class2284.field13906;
        final float field13895 = this.field13895 * class2284.field13891 + this.field13896 * class2284.field13895 + this.field13897 * class2284.field13899 + this.field13898 * class2284.field13903;
        final float field13896 = this.field13895 * class2284.field13892 + this.field13896 * class2284.field13896 + this.field13897 * class2284.field13900 + this.field13898 * class2284.field13904;
        final float field13897 = this.field13895 * class2284.field13893 + this.field13896 * class2284.field13897 + this.field13897 * class2284.field13901 + this.field13898 * class2284.field13905;
        final float field13898 = this.field13895 * class2284.field13894 + this.field13896 * class2284.field13898 + this.field13897 * class2284.field13902 + this.field13898 * class2284.field13906;
        final float field13899 = this.field13899 * class2284.field13891 + this.field13900 * class2284.field13895 + this.field13901 * class2284.field13899 + this.field13902 * class2284.field13903;
        final float field13900 = this.field13899 * class2284.field13892 + this.field13900 * class2284.field13896 + this.field13901 * class2284.field13900 + this.field13902 * class2284.field13904;
        final float field13901 = this.field13899 * class2284.field13893 + this.field13900 * class2284.field13897 + this.field13901 * class2284.field13901 + this.field13902 * class2284.field13905;
        final float field13902 = this.field13899 * class2284.field13894 + this.field13900 * class2284.field13898 + this.field13901 * class2284.field13902 + this.field13902 * class2284.field13906;
        final float field13903 = this.field13903 * class2284.field13891 + this.field13904 * class2284.field13895 + this.field13905 * class2284.field13899 + this.field13906 * class2284.field13903;
        final float field13904 = this.field13903 * class2284.field13892 + this.field13904 * class2284.field13896 + this.field13905 * class2284.field13900 + this.field13906 * class2284.field13904;
        final float field13905 = this.field13903 * class2284.field13893 + this.field13904 * class2284.field13897 + this.field13905 * class2284.field13901 + this.field13906 * class2284.field13905;
        final float field13906 = this.field13903 * class2284.field13894 + this.field13904 * class2284.field13898 + this.field13905 * class2284.field13902 + this.field13906 * class2284.field13906;
        this.field13891 = field13891;
        this.field13892 = field13892;
        this.field13893 = field13893;
        this.field13894 = field13894;
        this.field13895 = field13895;
        this.field13896 = field13896;
        this.field13897 = field13897;
        this.field13898 = field13898;
        this.field13899 = field13899;
        this.field13900 = field13900;
        this.field13901 = field13901;
        this.field13902 = field13902;
        this.field13903 = field13903;
        this.field13904 = field13904;
        this.field13905 = field13905;
        this.field13906 = field13906;
    }
    
    public final void method8892(final Class2284 class2284, final Class2284 class2285) {
        if (this != class2284 && this != class2285) {
            this.field13891 = class2284.field13891 * class2285.field13891 + class2284.field13892 * class2285.field13895 + class2284.field13893 * class2285.field13899 + class2284.field13894 * class2285.field13903;
            this.field13892 = class2284.field13891 * class2285.field13892 + class2284.field13892 * class2285.field13896 + class2284.field13893 * class2285.field13900 + class2284.field13894 * class2285.field13904;
            this.field13893 = class2284.field13891 * class2285.field13893 + class2284.field13892 * class2285.field13897 + class2284.field13893 * class2285.field13901 + class2284.field13894 * class2285.field13905;
            this.field13894 = class2284.field13891 * class2285.field13894 + class2284.field13892 * class2285.field13898 + class2284.field13893 * class2285.field13902 + class2284.field13894 * class2285.field13906;
            this.field13895 = class2284.field13895 * class2285.field13891 + class2284.field13896 * class2285.field13895 + class2284.field13897 * class2285.field13899 + class2284.field13898 * class2285.field13903;
            this.field13896 = class2284.field13895 * class2285.field13892 + class2284.field13896 * class2285.field13896 + class2284.field13897 * class2285.field13900 + class2284.field13898 * class2285.field13904;
            this.field13897 = class2284.field13895 * class2285.field13893 + class2284.field13896 * class2285.field13897 + class2284.field13897 * class2285.field13901 + class2284.field13898 * class2285.field13905;
            this.field13898 = class2284.field13895 * class2285.field13894 + class2284.field13896 * class2285.field13898 + class2284.field13897 * class2285.field13902 + class2284.field13898 * class2285.field13906;
            this.field13899 = class2284.field13899 * class2285.field13891 + class2284.field13900 * class2285.field13895 + class2284.field13901 * class2285.field13899 + class2284.field13902 * class2285.field13903;
            this.field13900 = class2284.field13899 * class2285.field13892 + class2284.field13900 * class2285.field13896 + class2284.field13901 * class2285.field13900 + class2284.field13902 * class2285.field13904;
            this.field13901 = class2284.field13899 * class2285.field13893 + class2284.field13900 * class2285.field13897 + class2284.field13901 * class2285.field13901 + class2284.field13902 * class2285.field13905;
            this.field13902 = class2284.field13899 * class2285.field13894 + class2284.field13900 * class2285.field13898 + class2284.field13901 * class2285.field13902 + class2284.field13902 * class2285.field13906;
            this.field13903 = class2284.field13903 * class2285.field13891 + class2284.field13904 * class2285.field13895 + class2284.field13905 * class2285.field13899 + class2284.field13906 * class2285.field13903;
            this.field13904 = class2284.field13903 * class2285.field13892 + class2284.field13904 * class2285.field13896 + class2284.field13905 * class2285.field13900 + class2284.field13906 * class2285.field13904;
            this.field13905 = class2284.field13903 * class2285.field13893 + class2284.field13904 * class2285.field13897 + class2284.field13905 * class2285.field13901 + class2284.field13906 * class2285.field13905;
            this.field13906 = class2284.field13903 * class2285.field13894 + class2284.field13904 * class2285.field13898 + class2284.field13905 * class2285.field13902 + class2284.field13906 * class2285.field13906;
        }
        else {
            final float field13891 = class2284.field13891 * class2285.field13891 + class2284.field13892 * class2285.field13895 + class2284.field13893 * class2285.field13899 + class2284.field13894 * class2285.field13903;
            final float field13892 = class2284.field13891 * class2285.field13892 + class2284.field13892 * class2285.field13896 + class2284.field13893 * class2285.field13900 + class2284.field13894 * class2285.field13904;
            final float field13893 = class2284.field13891 * class2285.field13893 + class2284.field13892 * class2285.field13897 + class2284.field13893 * class2285.field13901 + class2284.field13894 * class2285.field13905;
            final float field13894 = class2284.field13891 * class2285.field13894 + class2284.field13892 * class2285.field13898 + class2284.field13893 * class2285.field13902 + class2284.field13894 * class2285.field13906;
            final float field13895 = class2284.field13895 * class2285.field13891 + class2284.field13896 * class2285.field13895 + class2284.field13897 * class2285.field13899 + class2284.field13898 * class2285.field13903;
            final float field13896 = class2284.field13895 * class2285.field13892 + class2284.field13896 * class2285.field13896 + class2284.field13897 * class2285.field13900 + class2284.field13898 * class2285.field13904;
            final float field13897 = class2284.field13895 * class2285.field13893 + class2284.field13896 * class2285.field13897 + class2284.field13897 * class2285.field13901 + class2284.field13898 * class2285.field13905;
            final float field13898 = class2284.field13895 * class2285.field13894 + class2284.field13896 * class2285.field13898 + class2284.field13897 * class2285.field13902 + class2284.field13898 * class2285.field13906;
            final float field13899 = class2284.field13899 * class2285.field13891 + class2284.field13900 * class2285.field13895 + class2284.field13901 * class2285.field13899 + class2284.field13902 * class2285.field13903;
            final float field13900 = class2284.field13899 * class2285.field13892 + class2284.field13900 * class2285.field13896 + class2284.field13901 * class2285.field13900 + class2284.field13902 * class2285.field13904;
            final float field13901 = class2284.field13899 * class2285.field13893 + class2284.field13900 * class2285.field13897 + class2284.field13901 * class2285.field13901 + class2284.field13902 * class2285.field13905;
            final float field13902 = class2284.field13899 * class2285.field13894 + class2284.field13900 * class2285.field13898 + class2284.field13901 * class2285.field13902 + class2284.field13902 * class2285.field13906;
            final float field13903 = class2284.field13903 * class2285.field13891 + class2284.field13904 * class2285.field13895 + class2284.field13905 * class2285.field13899 + class2284.field13906 * class2285.field13903;
            final float field13904 = class2284.field13903 * class2285.field13892 + class2284.field13904 * class2285.field13896 + class2284.field13905 * class2285.field13900 + class2284.field13906 * class2285.field13904;
            final float field13905 = class2284.field13903 * class2285.field13893 + class2284.field13904 * class2285.field13897 + class2284.field13905 * class2285.field13901 + class2284.field13906 * class2285.field13905;
            final float field13906 = class2284.field13903 * class2285.field13894 + class2284.field13904 * class2285.field13898 + class2284.field13905 * class2285.field13902 + class2284.field13906 * class2285.field13906;
            this.field13891 = field13891;
            this.field13892 = field13892;
            this.field13893 = field13893;
            this.field13894 = field13894;
            this.field13895 = field13895;
            this.field13896 = field13896;
            this.field13897 = field13897;
            this.field13898 = field13898;
            this.field13899 = field13899;
            this.field13900 = field13900;
            this.field13901 = field13901;
            this.field13902 = field13902;
            this.field13903 = field13903;
            this.field13904 = field13904;
            this.field13905 = field13905;
            this.field13906 = field13906;
        }
    }
    
    public final void method8893(final Class2284 class2284, final Class2284 class2285) {
        if (this != class2284 && this != class2285) {
            this.field13891 = class2284.field13891 * class2285.field13891 + class2284.field13895 * class2285.field13892 + class2284.field13899 * class2285.field13893 + class2284.field13903 * class2285.field13894;
            this.field13892 = class2284.field13891 * class2285.field13895 + class2284.field13895 * class2285.field13896 + class2284.field13899 * class2285.field13897 + class2284.field13903 * class2285.field13898;
            this.field13893 = class2284.field13891 * class2285.field13899 + class2284.field13895 * class2285.field13900 + class2284.field13899 * class2285.field13901 + class2284.field13903 * class2285.field13902;
            this.field13894 = class2284.field13891 * class2285.field13903 + class2284.field13895 * class2285.field13904 + class2284.field13899 * class2285.field13905 + class2284.field13903 * class2285.field13906;
            this.field13895 = class2284.field13892 * class2285.field13891 + class2284.field13896 * class2285.field13892 + class2284.field13900 * class2285.field13893 + class2284.field13904 * class2285.field13894;
            this.field13896 = class2284.field13892 * class2285.field13895 + class2284.field13896 * class2285.field13896 + class2284.field13900 * class2285.field13897 + class2284.field13904 * class2285.field13898;
            this.field13897 = class2284.field13892 * class2285.field13899 + class2284.field13896 * class2285.field13900 + class2284.field13900 * class2285.field13901 + class2284.field13904 * class2285.field13902;
            this.field13898 = class2284.field13892 * class2285.field13903 + class2284.field13896 * class2285.field13904 + class2284.field13900 * class2285.field13905 + class2284.field13904 * class2285.field13906;
            this.field13899 = class2284.field13893 * class2285.field13891 + class2284.field13897 * class2285.field13892 + class2284.field13901 * class2285.field13893 + class2284.field13905 * class2285.field13894;
            this.field13900 = class2284.field13893 * class2285.field13895 + class2284.field13897 * class2285.field13896 + class2284.field13901 * class2285.field13897 + class2284.field13905 * class2285.field13898;
            this.field13901 = class2284.field13893 * class2285.field13899 + class2284.field13897 * class2285.field13900 + class2284.field13901 * class2285.field13901 + class2284.field13905 * class2285.field13902;
            this.field13902 = class2284.field13893 * class2285.field13903 + class2284.field13897 * class2285.field13904 + class2284.field13901 * class2285.field13905 + class2284.field13905 * class2285.field13906;
            this.field13903 = class2284.field13894 * class2285.field13891 + class2284.field13898 * class2285.field13892 + class2284.field13902 * class2285.field13893 + class2284.field13906 * class2285.field13894;
            this.field13904 = class2284.field13894 * class2285.field13895 + class2284.field13898 * class2285.field13896 + class2284.field13902 * class2285.field13897 + class2284.field13906 * class2285.field13898;
            this.field13905 = class2284.field13894 * class2285.field13899 + class2284.field13898 * class2285.field13900 + class2284.field13902 * class2285.field13901 + class2284.field13906 * class2285.field13902;
            this.field13906 = class2284.field13894 * class2285.field13903 + class2284.field13898 * class2285.field13904 + class2284.field13902 * class2285.field13905 + class2284.field13906 * class2285.field13906;
        }
        else {
            final float field13891 = class2284.field13891 * class2285.field13891 + class2284.field13895 * class2285.field13892 + class2284.field13899 * class2285.field13893 + class2284.field13903 * class2285.field13894;
            final float field13892 = class2284.field13891 * class2285.field13895 + class2284.field13895 * class2285.field13896 + class2284.field13899 * class2285.field13897 + class2284.field13903 * class2285.field13898;
            final float field13893 = class2284.field13891 * class2285.field13899 + class2284.field13895 * class2285.field13900 + class2284.field13899 * class2285.field13901 + class2284.field13903 * class2285.field13902;
            final float field13894 = class2284.field13891 * class2285.field13903 + class2284.field13895 * class2285.field13904 + class2284.field13899 * class2285.field13905 + class2284.field13903 * class2285.field13906;
            final float field13895 = class2284.field13892 * class2285.field13891 + class2284.field13896 * class2285.field13892 + class2284.field13900 * class2285.field13893 + class2284.field13904 * class2285.field13894;
            final float field13896 = class2284.field13892 * class2285.field13895 + class2284.field13896 * class2285.field13896 + class2284.field13900 * class2285.field13897 + class2284.field13904 * class2285.field13898;
            final float field13897 = class2284.field13892 * class2285.field13899 + class2284.field13896 * class2285.field13900 + class2284.field13900 * class2285.field13901 + class2284.field13904 * class2285.field13902;
            final float field13898 = class2284.field13892 * class2285.field13903 + class2284.field13896 * class2285.field13904 + class2284.field13900 * class2285.field13905 + class2284.field13904 * class2285.field13906;
            final float field13899 = class2284.field13893 * class2285.field13891 + class2284.field13897 * class2285.field13892 + class2284.field13901 * class2285.field13893 + class2284.field13905 * class2285.field13894;
            final float field13900 = class2284.field13893 * class2285.field13895 + class2284.field13897 * class2285.field13896 + class2284.field13901 * class2285.field13897 + class2284.field13905 * class2285.field13898;
            final float field13901 = class2284.field13893 * class2285.field13899 + class2284.field13897 * class2285.field13900 + class2284.field13901 * class2285.field13901 + class2284.field13905 * class2285.field13902;
            final float field13902 = class2284.field13893 * class2285.field13903 + class2284.field13897 * class2285.field13904 + class2284.field13901 * class2285.field13905 + class2284.field13905 * class2285.field13906;
            final float field13903 = class2284.field13894 * class2285.field13891 + class2284.field13898 * class2285.field13892 + class2284.field13902 * class2285.field13893 + class2284.field13906 * class2285.field13894;
            final float field13904 = class2284.field13894 * class2285.field13895 + class2284.field13898 * class2285.field13896 + class2284.field13902 * class2285.field13897 + class2284.field13906 * class2285.field13898;
            final float field13905 = class2284.field13894 * class2285.field13899 + class2284.field13898 * class2285.field13900 + class2284.field13902 * class2285.field13901 + class2284.field13906 * class2285.field13902;
            final float field13906 = class2284.field13894 * class2285.field13903 + class2284.field13898 * class2285.field13904 + class2284.field13902 * class2285.field13905 + class2284.field13906 * class2285.field13906;
            this.field13891 = field13891;
            this.field13892 = field13892;
            this.field13893 = field13893;
            this.field13894 = field13894;
            this.field13895 = field13895;
            this.field13896 = field13896;
            this.field13897 = field13897;
            this.field13898 = field13898;
            this.field13899 = field13899;
            this.field13900 = field13900;
            this.field13901 = field13901;
            this.field13902 = field13902;
            this.field13903 = field13903;
            this.field13904 = field13904;
            this.field13905 = field13905;
            this.field13906 = field13906;
        }
    }
    
    public final void method8894(final Class2284 class2284, final Class2284 class2285) {
        if (this != class2284 && this != class2285) {
            this.field13891 = class2284.field13891 * class2285.field13891 + class2284.field13892 * class2285.field13892 + class2284.field13893 * class2285.field13893 + class2284.field13894 * class2285.field13894;
            this.field13892 = class2284.field13891 * class2285.field13895 + class2284.field13892 * class2285.field13896 + class2284.field13893 * class2285.field13897 + class2284.field13894 * class2285.field13898;
            this.field13893 = class2284.field13891 * class2285.field13899 + class2284.field13892 * class2285.field13900 + class2284.field13893 * class2285.field13901 + class2284.field13894 * class2285.field13902;
            this.field13894 = class2284.field13891 * class2285.field13903 + class2284.field13892 * class2285.field13904 + class2284.field13893 * class2285.field13905 + class2284.field13894 * class2285.field13906;
            this.field13895 = class2284.field13895 * class2285.field13891 + class2284.field13896 * class2285.field13892 + class2284.field13897 * class2285.field13893 + class2284.field13898 * class2285.field13894;
            this.field13896 = class2284.field13895 * class2285.field13895 + class2284.field13896 * class2285.field13896 + class2284.field13897 * class2285.field13897 + class2284.field13898 * class2285.field13898;
            this.field13897 = class2284.field13895 * class2285.field13899 + class2284.field13896 * class2285.field13900 + class2284.field13897 * class2285.field13901 + class2284.field13898 * class2285.field13902;
            this.field13898 = class2284.field13895 * class2285.field13903 + class2284.field13896 * class2285.field13904 + class2284.field13897 * class2285.field13905 + class2284.field13898 * class2285.field13906;
            this.field13899 = class2284.field13899 * class2285.field13891 + class2284.field13900 * class2285.field13892 + class2284.field13901 * class2285.field13893 + class2284.field13902 * class2285.field13894;
            this.field13900 = class2284.field13899 * class2285.field13895 + class2284.field13900 * class2285.field13896 + class2284.field13901 * class2285.field13897 + class2284.field13902 * class2285.field13898;
            this.field13901 = class2284.field13899 * class2285.field13899 + class2284.field13900 * class2285.field13900 + class2284.field13901 * class2285.field13901 + class2284.field13902 * class2285.field13902;
            this.field13902 = class2284.field13899 * class2285.field13903 + class2284.field13900 * class2285.field13904 + class2284.field13901 * class2285.field13905 + class2284.field13902 * class2285.field13906;
            this.field13903 = class2284.field13903 * class2285.field13891 + class2284.field13904 * class2285.field13892 + class2284.field13905 * class2285.field13893 + class2284.field13906 * class2285.field13894;
            this.field13904 = class2284.field13903 * class2285.field13895 + class2284.field13904 * class2285.field13896 + class2284.field13905 * class2285.field13897 + class2284.field13906 * class2285.field13898;
            this.field13905 = class2284.field13903 * class2285.field13899 + class2284.field13904 * class2285.field13900 + class2284.field13905 * class2285.field13901 + class2284.field13906 * class2285.field13902;
            this.field13906 = class2284.field13903 * class2285.field13903 + class2284.field13904 * class2285.field13904 + class2284.field13905 * class2285.field13905 + class2284.field13906 * class2285.field13906;
        }
        else {
            final float field13891 = class2284.field13891 * class2285.field13891 + class2284.field13892 * class2285.field13892 + class2284.field13893 * class2285.field13893 + class2284.field13894 * class2285.field13894;
            final float field13892 = class2284.field13891 * class2285.field13895 + class2284.field13892 * class2285.field13896 + class2284.field13893 * class2285.field13897 + class2284.field13894 * class2285.field13898;
            final float field13893 = class2284.field13891 * class2285.field13899 + class2284.field13892 * class2285.field13900 + class2284.field13893 * class2285.field13901 + class2284.field13894 * class2285.field13902;
            final float field13894 = class2284.field13891 * class2285.field13903 + class2284.field13892 * class2285.field13904 + class2284.field13893 * class2285.field13905 + class2284.field13894 * class2285.field13906;
            final float field13895 = class2284.field13895 * class2285.field13891 + class2284.field13896 * class2285.field13892 + class2284.field13897 * class2285.field13893 + class2284.field13898 * class2285.field13894;
            final float field13896 = class2284.field13895 * class2285.field13895 + class2284.field13896 * class2285.field13896 + class2284.field13897 * class2285.field13897 + class2284.field13898 * class2285.field13898;
            final float field13897 = class2284.field13895 * class2285.field13899 + class2284.field13896 * class2285.field13900 + class2284.field13897 * class2285.field13901 + class2284.field13898 * class2285.field13902;
            final float field13898 = class2284.field13895 * class2285.field13903 + class2284.field13896 * class2285.field13904 + class2284.field13897 * class2285.field13905 + class2284.field13898 * class2285.field13906;
            final float field13899 = class2284.field13899 * class2285.field13891 + class2284.field13900 * class2285.field13892 + class2284.field13901 * class2285.field13893 + class2284.field13902 * class2285.field13894;
            final float field13900 = class2284.field13899 * class2285.field13895 + class2284.field13900 * class2285.field13896 + class2284.field13901 * class2285.field13897 + class2284.field13902 * class2285.field13898;
            final float field13901 = class2284.field13899 * class2285.field13899 + class2284.field13900 * class2285.field13900 + class2284.field13901 * class2285.field13901 + class2284.field13902 * class2285.field13902;
            final float field13902 = class2284.field13899 * class2285.field13903 + class2284.field13900 * class2285.field13904 + class2284.field13901 * class2285.field13905 + class2284.field13902 * class2285.field13906;
            final float field13903 = class2284.field13903 * class2285.field13891 + class2284.field13904 * class2285.field13892 + class2284.field13905 * class2285.field13893 + class2284.field13906 * class2285.field13894;
            final float field13904 = class2284.field13903 * class2285.field13895 + class2284.field13904 * class2285.field13896 + class2284.field13905 * class2285.field13897 + class2284.field13906 * class2285.field13898;
            final float field13905 = class2284.field13903 * class2285.field13899 + class2284.field13904 * class2285.field13900 + class2284.field13905 * class2285.field13901 + class2284.field13906 * class2285.field13902;
            final float field13906 = class2284.field13903 * class2285.field13903 + class2284.field13904 * class2285.field13904 + class2284.field13905 * class2285.field13905 + class2284.field13906 * class2285.field13906;
            this.field13891 = field13891;
            this.field13892 = field13892;
            this.field13893 = field13893;
            this.field13894 = field13894;
            this.field13895 = field13895;
            this.field13896 = field13896;
            this.field13897 = field13897;
            this.field13898 = field13898;
            this.field13899 = field13899;
            this.field13900 = field13900;
            this.field13901 = field13901;
            this.field13902 = field13902;
            this.field13903 = field13903;
            this.field13904 = field13904;
            this.field13905 = field13905;
            this.field13906 = field13906;
        }
    }
    
    public final void method8895(final Class2284 class2284, final Class2284 class2285) {
        if (this != class2284 && this != class2285) {
            this.field13891 = class2284.field13891 * class2285.field13891 + class2284.field13895 * class2285.field13895 + class2284.field13899 * class2285.field13899 + class2284.field13903 * class2285.field13903;
            this.field13892 = class2284.field13891 * class2285.field13892 + class2284.field13895 * class2285.field13896 + class2284.field13899 * class2285.field13900 + class2284.field13903 * class2285.field13904;
            this.field13893 = class2284.field13891 * class2285.field13893 + class2284.field13895 * class2285.field13897 + class2284.field13899 * class2285.field13901 + class2284.field13903 * class2285.field13905;
            this.field13894 = class2284.field13891 * class2285.field13894 + class2284.field13895 * class2285.field13898 + class2284.field13899 * class2285.field13902 + class2284.field13903 * class2285.field13906;
            this.field13895 = class2284.field13892 * class2285.field13891 + class2284.field13896 * class2285.field13895 + class2284.field13900 * class2285.field13899 + class2284.field13904 * class2285.field13903;
            this.field13896 = class2284.field13892 * class2285.field13892 + class2284.field13896 * class2285.field13896 + class2284.field13900 * class2285.field13900 + class2284.field13904 * class2285.field13904;
            this.field13897 = class2284.field13892 * class2285.field13893 + class2284.field13896 * class2285.field13897 + class2284.field13900 * class2285.field13901 + class2284.field13904 * class2285.field13905;
            this.field13898 = class2284.field13892 * class2285.field13894 + class2284.field13896 * class2285.field13898 + class2284.field13900 * class2285.field13902 + class2284.field13904 * class2285.field13906;
            this.field13899 = class2284.field13893 * class2285.field13891 + class2284.field13897 * class2285.field13895 + class2284.field13901 * class2285.field13899 + class2284.field13905 * class2285.field13903;
            this.field13900 = class2284.field13893 * class2285.field13892 + class2284.field13897 * class2285.field13896 + class2284.field13901 * class2285.field13900 + class2284.field13905 * class2285.field13904;
            this.field13901 = class2284.field13893 * class2285.field13893 + class2284.field13897 * class2285.field13897 + class2284.field13901 * class2285.field13901 + class2284.field13905 * class2285.field13905;
            this.field13902 = class2284.field13893 * class2285.field13894 + class2284.field13897 * class2285.field13898 + class2284.field13901 * class2285.field13902 + class2284.field13905 * class2285.field13906;
            this.field13903 = class2284.field13894 * class2285.field13891 + class2284.field13898 * class2285.field13895 + class2284.field13902 * class2285.field13899 + class2284.field13906 * class2285.field13903;
            this.field13904 = class2284.field13894 * class2285.field13892 + class2284.field13898 * class2285.field13896 + class2284.field13902 * class2285.field13900 + class2284.field13906 * class2285.field13904;
            this.field13905 = class2284.field13894 * class2285.field13893 + class2284.field13898 * class2285.field13897 + class2284.field13902 * class2285.field13901 + class2284.field13906 * class2285.field13905;
            this.field13906 = class2284.field13894 * class2285.field13894 + class2284.field13898 * class2285.field13898 + class2284.field13902 * class2285.field13902 + class2284.field13906 * class2285.field13906;
        }
        else {
            final float field13891 = class2284.field13891 * class2285.field13891 + class2284.field13895 * class2285.field13895 + class2284.field13899 * class2285.field13899 + class2284.field13903 * class2285.field13903;
            final float field13892 = class2284.field13891 * class2285.field13892 + class2284.field13895 * class2285.field13896 + class2284.field13899 * class2285.field13900 + class2284.field13903 * class2285.field13904;
            final float field13893 = class2284.field13891 * class2285.field13893 + class2284.field13895 * class2285.field13897 + class2284.field13899 * class2285.field13901 + class2284.field13903 * class2285.field13905;
            final float field13894 = class2284.field13891 * class2285.field13894 + class2284.field13895 * class2285.field13898 + class2284.field13899 * class2285.field13902 + class2284.field13903 * class2285.field13906;
            final float field13895 = class2284.field13892 * class2285.field13891 + class2284.field13896 * class2285.field13895 + class2284.field13900 * class2285.field13899 + class2284.field13904 * class2285.field13903;
            final float field13896 = class2284.field13892 * class2285.field13892 + class2284.field13896 * class2285.field13896 + class2284.field13900 * class2285.field13900 + class2284.field13904 * class2285.field13904;
            final float field13897 = class2284.field13892 * class2285.field13893 + class2284.field13896 * class2285.field13897 + class2284.field13900 * class2285.field13901 + class2284.field13904 * class2285.field13905;
            final float field13898 = class2284.field13892 * class2285.field13894 + class2284.field13896 * class2285.field13898 + class2284.field13900 * class2285.field13902 + class2284.field13904 * class2285.field13906;
            final float field13899 = class2284.field13893 * class2285.field13891 + class2284.field13897 * class2285.field13895 + class2284.field13901 * class2285.field13899 + class2284.field13905 * class2285.field13903;
            final float field13900 = class2284.field13893 * class2285.field13892 + class2284.field13897 * class2285.field13896 + class2284.field13901 * class2285.field13900 + class2284.field13905 * class2285.field13904;
            final float field13901 = class2284.field13893 * class2285.field13893 + class2284.field13897 * class2285.field13897 + class2284.field13901 * class2285.field13901 + class2284.field13905 * class2285.field13905;
            final float field13902 = class2284.field13893 * class2285.field13894 + class2284.field13897 * class2285.field13898 + class2284.field13901 * class2285.field13902 + class2284.field13905 * class2285.field13906;
            final float field13903 = class2284.field13894 * class2285.field13891 + class2284.field13898 * class2285.field13895 + class2284.field13902 * class2285.field13899 + class2284.field13906 * class2285.field13903;
            final float field13904 = class2284.field13894 * class2285.field13892 + class2284.field13898 * class2285.field13896 + class2284.field13902 * class2285.field13900 + class2284.field13906 * class2285.field13904;
            final float field13905 = class2284.field13894 * class2285.field13893 + class2284.field13898 * class2285.field13897 + class2284.field13902 * class2285.field13901 + class2284.field13906 * class2285.field13905;
            final float field13906 = class2284.field13894 * class2285.field13894 + class2284.field13898 * class2285.field13898 + class2284.field13902 * class2285.field13902 + class2284.field13906 * class2285.field13906;
            this.field13891 = field13891;
            this.field13892 = field13892;
            this.field13893 = field13893;
            this.field13894 = field13894;
            this.field13895 = field13895;
            this.field13896 = field13896;
            this.field13897 = field13897;
            this.field13898 = field13898;
            this.field13899 = field13899;
            this.field13900 = field13900;
            this.field13901 = field13901;
            this.field13902 = field13902;
            this.field13903 = field13903;
            this.field13904 = field13904;
            this.field13905 = field13905;
            this.field13906 = field13906;
        }
    }
    
    public boolean equals(final Class2284 class2284) {
        try {
            return this.field13891 == class2284.field13891 && this.field13892 == class2284.field13892 && this.field13893 == class2284.field13893 && this.field13894 == class2284.field13894 && this.field13895 == class2284.field13895 && this.field13896 == class2284.field13896 && this.field13897 == class2284.field13897 && this.field13898 == class2284.field13898 && this.field13899 == class2284.field13899 && this.field13900 == class2284.field13900 && this.field13901 == class2284.field13901 && this.field13902 == class2284.field13902 && this.field13903 == class2284.field13903 && this.field13904 == class2284.field13904 && this.field13905 == class2284.field13905 && this.field13906 == class2284.field13906;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2284 class2284 = (Class2284)o;
            return this.field13891 == class2284.field13891 && this.field13892 == class2284.field13892 && this.field13893 == class2284.field13893 && this.field13894 == class2284.field13894 && this.field13895 == class2284.field13895 && this.field13896 == class2284.field13896 && this.field13897 == class2284.field13897 && this.field13898 == class2284.field13898 && this.field13899 == class2284.field13899 && this.field13900 == class2284.field13900 && this.field13901 == class2284.field13901 && this.field13902 == class2284.field13902 && this.field13903 == class2284.field13903 && this.field13904 == class2284.field13904 && this.field13905 == class2284.field13905 && this.field13906 == class2284.field13906;
        }
        catch (final ClassCastException ex) {
            return false;
        }
        catch (final NullPointerException ex2) {
            return false;
        }
    }
    
    public boolean method8896(final Class2284 class2284, final float n) {
        boolean b = !(Math.abs(this.field13891 - class2284.field13891) > n);
        if (Math.abs(this.field13892 - class2284.field13892) > n) {
            b = false;
        }
        if (Math.abs(this.field13893 - class2284.field13893) > n) {
            b = false;
        }
        if (Math.abs(this.field13894 - class2284.field13894) > n) {
            b = false;
        }
        if (Math.abs(this.field13895 - class2284.field13895) > n) {
            b = false;
        }
        if (Math.abs(this.field13896 - class2284.field13896) > n) {
            b = false;
        }
        if (Math.abs(this.field13897 - class2284.field13897) > n) {
            b = false;
        }
        if (Math.abs(this.field13898 - class2284.field13898) > n) {
            b = false;
        }
        if (Math.abs(this.field13899 - class2284.field13899) > n) {
            b = false;
        }
        if (Math.abs(this.field13900 - class2284.field13900) > n) {
            b = false;
        }
        if (Math.abs(this.field13901 - class2284.field13901) > n) {
            b = false;
        }
        if (Math.abs(this.field13902 - class2284.field13902) > n) {
            b = false;
        }
        if (Math.abs(this.field13903 - class2284.field13903) > n) {
            b = false;
        }
        if (Math.abs(this.field13904 - class2284.field13904) > n) {
            b = false;
        }
        if (Math.abs(this.field13905 - class2284.field13905) > n) {
            b = false;
        }
        if (Math.abs(this.field13906 - class2284.field13906) > n) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        final long n = 31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L + Class9427.method35030(this.field13891)) + Class9427.method35030(this.field13892)) + Class9427.method35030(this.field13893)) + Class9427.method35030(this.field13894)) + Class9427.method35030(this.field13895)) + Class9427.method35030(this.field13896)) + Class9427.method35030(this.field13897)) + Class9427.method35030(this.field13898)) + Class9427.method35030(this.field13899)) + Class9427.method35030(this.field13900)) + Class9427.method35030(this.field13901)) + Class9427.method35030(this.field13902)) + Class9427.method35030(this.field13903)) + Class9427.method35030(this.field13904)) + Class9427.method35030(this.field13905)) + Class9427.method35030(this.field13906);
        return (int)(n ^ n >> 32);
    }
    
    public final void method8897(final Class2275 class2275, final Class2275 class2276) {
        final float field13863 = this.field13891 * class2275.field13863 + this.field13892 * class2275.field13864 + this.field13893 * class2275.field13865 + this.field13894 * class2275.field13866;
        final float field13864 = this.field13895 * class2275.field13863 + this.field13896 * class2275.field13864 + this.field13897 * class2275.field13865 + this.field13898 * class2275.field13866;
        final float field13865 = this.field13899 * class2275.field13863 + this.field13900 * class2275.field13864 + this.field13901 * class2275.field13865 + this.field13902 * class2275.field13866;
        class2276.field13866 = this.field13903 * class2275.field13863 + this.field13904 * class2275.field13864 + this.field13905 * class2275.field13865 + this.field13906 * class2275.field13866;
        class2276.field13863 = field13863;
        class2276.field13864 = field13864;
        class2276.field13865 = field13865;
    }
    
    public final void method8898(final Class2275 class2275) {
        final float field13863 = this.field13891 * class2275.field13863 + this.field13892 * class2275.field13864 + this.field13893 * class2275.field13865 + this.field13894 * class2275.field13866;
        final float field13864 = this.field13895 * class2275.field13863 + this.field13896 * class2275.field13864 + this.field13897 * class2275.field13865 + this.field13898 * class2275.field13866;
        final float field13865 = this.field13899 * class2275.field13863 + this.field13900 * class2275.field13864 + this.field13901 * class2275.field13865 + this.field13902 * class2275.field13866;
        class2275.field13866 = this.field13903 * class2275.field13863 + this.field13904 * class2275.field13864 + this.field13905 * class2275.field13865 + this.field13906 * class2275.field13866;
        class2275.field13863 = field13863;
        class2275.field13864 = field13864;
        class2275.field13865 = field13865;
    }
    
    public final void method8899(final Class2286 class2286, final Class2286 class2287) {
        final float field13909 = this.field13891 * class2286.field13909 + this.field13892 * class2286.field13910 + this.field13893 * class2286.field13911 + this.field13894;
        final float field13910 = this.field13895 * class2286.field13909 + this.field13896 * class2286.field13910 + this.field13897 * class2286.field13911 + this.field13898;
        class2287.field13911 = this.field13899 * class2286.field13909 + this.field13900 * class2286.field13910 + this.field13901 * class2286.field13911 + this.field13902;
        class2287.field13909 = field13909;
        class2287.field13910 = field13910;
    }
    
    public final void method8900(final Class2286 class2286) {
        final float field13909 = this.field13891 * class2286.field13909 + this.field13892 * class2286.field13910 + this.field13893 * class2286.field13911 + this.field13894;
        final float field13910 = this.field13895 * class2286.field13909 + this.field13896 * class2286.field13910 + this.field13897 * class2286.field13911 + this.field13898;
        class2286.field13911 = this.field13899 * class2286.field13909 + this.field13900 * class2286.field13910 + this.field13901 * class2286.field13911 + this.field13902;
        class2286.field13909 = field13909;
        class2286.field13910 = field13910;
    }
    
    public final void method8901(final Class2288 class2288, final Class2288 class2289) {
        final float field13909 = this.field13891 * class2288.field13909 + this.field13892 * class2288.field13910 + this.field13893 * class2288.field13911;
        final float field13910 = this.field13895 * class2288.field13909 + this.field13896 * class2288.field13910 + this.field13897 * class2288.field13911;
        class2289.field13911 = this.field13899 * class2288.field13909 + this.field13900 * class2288.field13910 + this.field13901 * class2288.field13911;
        class2289.field13909 = field13909;
        class2289.field13910 = field13910;
    }
    
    public final void method8902(final Class2288 class2288) {
        final float field13909 = this.field13891 * class2288.field13909 + this.field13892 * class2288.field13910 + this.field13893 * class2288.field13911;
        final float field13910 = this.field13895 * class2288.field13909 + this.field13896 * class2288.field13910 + this.field13897 * class2288.field13911;
        class2288.field13911 = this.field13899 * class2288.field13909 + this.field13900 * class2288.field13910 + this.field13901 * class2288.field13911;
        class2288.field13909 = field13909;
        class2288.field13910 = field13910;
    }
    
    public final void method8903(final Class2274 class2274) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method8911(array2, array);
        this.field13891 = (float)(class2274.field13845 * array2[0]);
        this.field13892 = (float)(class2274.field13846 * array2[1]);
        this.field13893 = (float)(class2274.field13847 * array2[2]);
        this.field13895 = (float)(class2274.field13848 * array2[0]);
        this.field13896 = (float)(class2274.field13849 * array2[1]);
        this.field13897 = (float)(class2274.field13850 * array2[2]);
        this.field13899 = (float)(class2274.field13851 * array2[0]);
        this.field13900 = (float)(class2274.field13852 * array2[1]);
        this.field13901 = (float)(class2274.field13853 * array2[2]);
    }
    
    public final void method8904(final Class2296 class2296) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method8911(array2, array);
        this.field13891 = (float)(class2296.field13935 * array2[0]);
        this.field13892 = (float)(class2296.field13936 * array2[1]);
        this.field13893 = (float)(class2296.field13937 * array2[2]);
        this.field13895 = (float)(class2296.field13938 * array2[0]);
        this.field13896 = (float)(class2296.field13939 * array2[1]);
        this.field13897 = (float)(class2296.field13940 * array2[2]);
        this.field13899 = (float)(class2296.field13941 * array2[0]);
        this.field13900 = (float)(class2296.field13942 * array2[1]);
        this.field13901 = (float)(class2296.field13943 * array2[2]);
    }
    
    public final void method8905(final Class2278 class2278) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method8911(array2, array);
        this.field13891 = (float)((1.0f - 2.0f * class2278.field13864 * class2278.field13864 - 2.0f * class2278.field13865 * class2278.field13865) * array2[0]);
        this.field13895 = (float)(2.0f * (class2278.field13863 * class2278.field13864 + class2278.field13866 * class2278.field13865) * array2[0]);
        this.field13899 = (float)(2.0f * (class2278.field13863 * class2278.field13865 - class2278.field13866 * class2278.field13864) * array2[0]);
        this.field13892 = (float)(2.0f * (class2278.field13863 * class2278.field13864 - class2278.field13866 * class2278.field13865) * array2[1]);
        this.field13896 = (float)((1.0f - 2.0f * class2278.field13863 * class2278.field13863 - 2.0f * class2278.field13865 * class2278.field13865) * array2[1]);
        this.field13900 = (float)(2.0f * (class2278.field13864 * class2278.field13865 + class2278.field13866 * class2278.field13863) * array2[1]);
        this.field13893 = (float)(2.0f * (class2278.field13863 * class2278.field13865 + class2278.field13866 * class2278.field13864) * array2[2]);
        this.field13897 = (float)(2.0f * (class2278.field13864 * class2278.field13865 - class2278.field13866 * class2278.field13863) * array2[2]);
        this.field13901 = (float)((1.0f - 2.0f * class2278.field13863 * class2278.field13863 - 2.0f * class2278.field13864 * class2278.field13864) * array2[2]);
    }
    
    public final void method8906(final Class8 class8) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method8911(array2, array);
        this.field13891 = (float)((1.0 - 2.0 * class8.field19 * class8.field19 - 2.0 * class8.field20 * class8.field20) * array2[0]);
        this.field13895 = (float)(2.0 * (class8.field18 * class8.field19 + class8.field21 * class8.field20) * array2[0]);
        this.field13899 = (float)(2.0 * (class8.field18 * class8.field20 - class8.field21 * class8.field19) * array2[0]);
        this.field13892 = (float)(2.0 * (class8.field18 * class8.field19 - class8.field21 * class8.field20) * array2[1]);
        this.field13896 = (float)((1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field20 * class8.field20) * array2[1]);
        this.field13900 = (float)(2.0 * (class8.field19 * class8.field20 + class8.field21 * class8.field18) * array2[1]);
        this.field13893 = (float)(2.0 * (class8.field18 * class8.field20 + class8.field21 * class8.field19) * array2[2]);
        this.field13897 = (float)(2.0 * (class8.field19 * class8.field20 - class8.field21 * class8.field18) * array2[2]);
        this.field13901 = (float)((1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field19 * class8.field19) * array2[2]);
    }
    
    public final void method8907(final Class2307 class2307) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method8911(array2, array);
        final double sqrt = Math.sqrt(class2307.field13985 * class2307.field13985 + class2307.field13986 * class2307.field13986 + class2307.field13987 * class2307.field13987);
        if (sqrt >= 1.0E-8) {
            final double n = 1.0 / sqrt;
            final double n2 = class2307.field13985 * n;
            final double n3 = class2307.field13986 * n;
            final double n4 = class2307.field13987 * n;
            final double sin = Math.sin(class2307.field13988);
            final double cos = Math.cos(class2307.field13988);
            final double n5 = 1.0 - cos;
            final double n6 = class2307.field13985 * class2307.field13987;
            final double n7 = class2307.field13985 * class2307.field13986;
            final double n8 = class2307.field13986 * class2307.field13987;
            this.field13891 = (float)((n5 * n2 * n2 + cos) * array2[0]);
            this.field13892 = (float)((n5 * n7 - sin * n4) * array2[1]);
            this.field13893 = (float)((n5 * n6 + sin * n3) * array2[2]);
            this.field13895 = (float)((n5 * n7 + sin * n4) * array2[0]);
            this.field13896 = (float)((n5 * n3 * n3 + cos) * array2[1]);
            this.field13897 = (float)((n5 * n8 - sin * n2) * array2[2]);
            this.field13899 = (float)((n5 * n6 - sin * n3) * array2[0]);
            this.field13900 = (float)((n5 * n8 + sin * n2) * array2[1]);
            this.field13901 = (float)((n5 * n4 * n4 + cos) * array2[2]);
        }
        else {
            this.field13891 = 1.0f;
            this.field13892 = 0.0f;
            this.field13893 = 0.0f;
            this.field13895 = 0.0f;
            this.field13896 = 1.0f;
            this.field13897 = 0.0f;
            this.field13899 = 0.0f;
            this.field13900 = 0.0f;
            this.field13901 = 1.0f;
        }
    }
    
    public final void method8908() {
        this.field13891 = 0.0f;
        this.field13892 = 0.0f;
        this.field13893 = 0.0f;
        this.field13894 = 0.0f;
        this.field13895 = 0.0f;
        this.field13896 = 0.0f;
        this.field13897 = 0.0f;
        this.field13898 = 0.0f;
        this.field13899 = 0.0f;
        this.field13900 = 0.0f;
        this.field13901 = 0.0f;
        this.field13902 = 0.0f;
        this.field13903 = 0.0f;
        this.field13904 = 0.0f;
        this.field13905 = 0.0f;
        this.field13906 = 0.0f;
    }
    
    public final void method8909() {
        this.field13891 = -this.field13891;
        this.field13892 = -this.field13892;
        this.field13893 = -this.field13893;
        this.field13894 = -this.field13894;
        this.field13895 = -this.field13895;
        this.field13896 = -this.field13896;
        this.field13897 = -this.field13897;
        this.field13898 = -this.field13898;
        this.field13899 = -this.field13899;
        this.field13900 = -this.field13900;
        this.field13901 = -this.field13901;
        this.field13902 = -this.field13902;
        this.field13903 = -this.field13903;
        this.field13904 = -this.field13904;
        this.field13905 = -this.field13905;
        this.field13906 = -this.field13906;
    }
    
    public final void method8910(final Class2284 class2284) {
        this.field13891 = -class2284.field13891;
        this.field13892 = -class2284.field13892;
        this.field13893 = -class2284.field13893;
        this.field13894 = -class2284.field13894;
        this.field13895 = -class2284.field13895;
        this.field13896 = -class2284.field13896;
        this.field13897 = -class2284.field13897;
        this.field13898 = -class2284.field13898;
        this.field13899 = -class2284.field13899;
        this.field13900 = -class2284.field13900;
        this.field13901 = -class2284.field13901;
        this.field13902 = -class2284.field13902;
        this.field13903 = -class2284.field13903;
        this.field13904 = -class2284.field13904;
        this.field13905 = -class2284.field13905;
        this.field13906 = -class2284.field13906;
    }
    
    private final void method8911(final double[] array, final double[] array2) {
        Class2274.method8623(new double[] { this.field13891, this.field13892, this.field13893, this.field13895, this.field13896, this.field13897, this.field13899, this.field13900, this.field13901 }, array, array2);
    }
    
    public Object clone() {
        Class2284 class2284;
        try {
            class2284 = (Class2284)super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
        return class2284;
    }
    
    public final float method8912() {
        return this.field13891;
    }
    
    public final void method8913(final float field13891) {
        this.field13891 = field13891;
    }
    
    public final float method8914() {
        return this.field13892;
    }
    
    public final void method8915(final float field13892) {
        this.field13892 = field13892;
    }
    
    public final float method8916() {
        return this.field13893;
    }
    
    public final void method8917(final float field13893) {
        this.field13893 = field13893;
    }
    
    public final float method8918() {
        return this.field13895;
    }
    
    public final void method8919(final float field13895) {
        this.field13895 = field13895;
    }
    
    public final float method8920() {
        return this.field13896;
    }
    
    public final void method8921(final float field13896) {
        this.field13896 = field13896;
    }
    
    public final float method8922() {
        return this.field13897;
    }
    
    public final void method8923(final float field13897) {
        this.field13897 = field13897;
    }
    
    public final float method8924() {
        return this.field13899;
    }
    
    public final void method8925(final float field13899) {
        this.field13899 = field13899;
    }
    
    public final float method8926() {
        return this.field13900;
    }
    
    public final void method8927(final float field13900) {
        this.field13900 = field13900;
    }
    
    public final float method8928() {
        return this.field13901;
    }
    
    public final void method8929(final float field13901) {
        this.field13901 = field13901;
    }
    
    public final float method8930() {
        return this.field13894;
    }
    
    public final void method8931(final float field13894) {
        this.field13894 = field13894;
    }
    
    public final float method8932() {
        return this.field13898;
    }
    
    public final void method8933(final float field13898) {
        this.field13898 = field13898;
    }
    
    public final float method8934() {
        return this.field13902;
    }
    
    public final void method8935(final float field13902) {
        this.field13902 = field13902;
    }
    
    public final float method8936() {
        return this.field13903;
    }
    
    public final void method8937(final float field13903) {
        this.field13903 = field13903;
    }
    
    public final float method8938() {
        return this.field13904;
    }
    
    public final void method8939(final float field13904) {
        this.field13904 = field13904;
    }
    
    public final float method8940() {
        return this.field13905;
    }
    
    public final void method8941(final float field13905) {
        this.field13905 = field13905;
    }
    
    public final float method8942() {
        return this.field13906;
    }
    
    public final void method8943(final float field13906) {
        this.field13906 = field13906;
    }
}
