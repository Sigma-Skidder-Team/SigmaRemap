// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.Serializable;

public class Class2304 implements Serializable, Cloneable
{
    public static final long field13960 = 8223903484171633710L;
    public double field13961;
    public double field13962;
    public double field13963;
    public double field13964;
    public double field13965;
    public double field13966;
    public double field13967;
    public double field13968;
    public double field13969;
    public double field13970;
    public double field13971;
    public double field13972;
    public double field13973;
    public double field13974;
    public double field13975;
    public double field13976;
    private static final double field13977 = 1.0E-10;
    
    public Class2304(final double field13961, final double field13962, final double field13963, final double field13964, final double field13965, final double field13966, final double field13967, final double field13968, final double field13969, final double field13970, final double field13971, final double field13972, final double field13973, final double field13974, final double field13975, final double field13976) {
        this.field13961 = field13961;
        this.field13962 = field13962;
        this.field13963 = field13963;
        this.field13964 = field13964;
        this.field13965 = field13965;
        this.field13966 = field13966;
        this.field13967 = field13967;
        this.field13968 = field13968;
        this.field13969 = field13969;
        this.field13970 = field13970;
        this.field13971 = field13971;
        this.field13972 = field13972;
        this.field13973 = field13973;
        this.field13974 = field13974;
        this.field13975 = field13975;
        this.field13976 = field13976;
    }
    
    public Class2304(final double[] array) {
        this.field13961 = array[0];
        this.field13962 = array[1];
        this.field13963 = array[2];
        this.field13964 = array[3];
        this.field13965 = array[4];
        this.field13966 = array[5];
        this.field13967 = array[6];
        this.field13968 = array[7];
        this.field13969 = array[8];
        this.field13970 = array[9];
        this.field13971 = array[10];
        this.field13972 = array[11];
        this.field13973 = array[12];
        this.field13974 = array[13];
        this.field13975 = array[14];
        this.field13976 = array[15];
    }
    
    public Class2304(final Class8 class8, final Class2273 class9, final double n) {
        this.field13961 = n * (1.0 - 2.0 * class8.field19 * class8.field19 - 2.0 * class8.field20 * class8.field20);
        this.field13965 = n * (2.0 * (class8.field18 * class8.field19 + class8.field21 * class8.field20));
        this.field13969 = n * (2.0 * (class8.field18 * class8.field20 - class8.field21 * class8.field19));
        this.field13962 = n * (2.0 * (class8.field18 * class8.field19 - class8.field21 * class8.field20));
        this.field13966 = n * (1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field20 * class8.field20);
        this.field13970 = n * (2.0 * (class8.field19 * class8.field20 + class8.field21 * class8.field18));
        this.field13963 = n * (2.0 * (class8.field18 * class8.field20 + class8.field21 * class8.field19));
        this.field13967 = n * (2.0 * (class8.field19 * class8.field20 - class8.field21 * class8.field18));
        this.field13971 = n * (1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field19 * class8.field19);
        this.field13964 = class9.field13839;
        this.field13968 = class9.field13840;
        this.field13972 = class9.field13841;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public Class2304(final Class2278 class2278, final Class2273 class2279, final double n) {
        this.field13961 = n * (1.0 - 2.0 * class2278.field13864 * class2278.field13864 - 2.0 * class2278.field13865 * class2278.field13865);
        this.field13965 = n * (2.0 * (class2278.field13863 * class2278.field13864 + class2278.field13866 * class2278.field13865));
        this.field13969 = n * (2.0 * (class2278.field13863 * class2278.field13865 - class2278.field13866 * class2278.field13864));
        this.field13962 = n * (2.0 * (class2278.field13863 * class2278.field13864 - class2278.field13866 * class2278.field13865));
        this.field13966 = n * (1.0 - 2.0 * class2278.field13863 * class2278.field13863 - 2.0 * class2278.field13865 * class2278.field13865);
        this.field13970 = n * (2.0 * (class2278.field13864 * class2278.field13865 + class2278.field13866 * class2278.field13863));
        this.field13963 = n * (2.0 * (class2278.field13863 * class2278.field13865 + class2278.field13866 * class2278.field13864));
        this.field13967 = n * (2.0 * (class2278.field13864 * class2278.field13865 - class2278.field13866 * class2278.field13863));
        this.field13971 = n * (1.0 - 2.0 * class2278.field13863 * class2278.field13863 - 2.0 * class2278.field13864 * class2278.field13864);
        this.field13964 = class2279.field13839;
        this.field13968 = class2279.field13840;
        this.field13972 = class2279.field13841;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public Class2304(final Class2304 class2304) {
        this.field13961 = class2304.field13961;
        this.field13962 = class2304.field13962;
        this.field13963 = class2304.field13963;
        this.field13964 = class2304.field13964;
        this.field13965 = class2304.field13965;
        this.field13966 = class2304.field13966;
        this.field13967 = class2304.field13967;
        this.field13968 = class2304.field13968;
        this.field13969 = class2304.field13969;
        this.field13970 = class2304.field13970;
        this.field13971 = class2304.field13971;
        this.field13972 = class2304.field13972;
        this.field13973 = class2304.field13973;
        this.field13974 = class2304.field13974;
        this.field13975 = class2304.field13975;
        this.field13976 = class2304.field13976;
    }
    
    public Class2304(final Class2284 class2284) {
        this.field13961 = class2284.field13891;
        this.field13962 = class2284.field13892;
        this.field13963 = class2284.field13893;
        this.field13964 = class2284.field13894;
        this.field13965 = class2284.field13895;
        this.field13966 = class2284.field13896;
        this.field13967 = class2284.field13897;
        this.field13968 = class2284.field13898;
        this.field13969 = class2284.field13899;
        this.field13970 = class2284.field13900;
        this.field13971 = class2284.field13901;
        this.field13972 = class2284.field13902;
        this.field13973 = class2284.field13903;
        this.field13974 = class2284.field13904;
        this.field13975 = class2284.field13905;
        this.field13976 = class2284.field13906;
    }
    
    public Class2304(final Class2296 class2296, final Class2273 class2297, final double n) {
        this.field13961 = class2296.field13935 * n;
        this.field13962 = class2296.field13936 * n;
        this.field13963 = class2296.field13937 * n;
        this.field13964 = class2297.field13839;
        this.field13965 = class2296.field13938 * n;
        this.field13966 = class2296.field13939 * n;
        this.field13967 = class2296.field13940 * n;
        this.field13968 = class2297.field13840;
        this.field13969 = class2296.field13941 * n;
        this.field13970 = class2296.field13942 * n;
        this.field13971 = class2296.field13943 * n;
        this.field13972 = class2297.field13841;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public Class2304(final Class2274 class2274, final Class2273 class2275, final double n) {
        this.field13961 = class2274.field13845 * n;
        this.field13962 = class2274.field13846 * n;
        this.field13963 = class2274.field13847 * n;
        this.field13964 = class2275.field13839;
        this.field13965 = class2274.field13848 * n;
        this.field13966 = class2274.field13849 * n;
        this.field13967 = class2274.field13850 * n;
        this.field13968 = class2275.field13840;
        this.field13969 = class2274.field13851 * n;
        this.field13970 = class2274.field13852 * n;
        this.field13971 = class2274.field13853 * n;
        this.field13972 = class2275.field13841;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public Class2304() {
        this.field13961 = 0.0;
        this.field13962 = 0.0;
        this.field13963 = 0.0;
        this.field13964 = 0.0;
        this.field13965 = 0.0;
        this.field13966 = 0.0;
        this.field13967 = 0.0;
        this.field13968 = 0.0;
        this.field13969 = 0.0;
        this.field13970 = 0.0;
        this.field13971 = 0.0;
        this.field13972 = 0.0;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 0.0;
    }
    
    @Override
    public String toString() {
        return this.field13961 + ", " + this.field13962 + ", " + this.field13963 + ", " + this.field13964 + "\n" + this.field13965 + ", " + this.field13966 + ", " + this.field13967 + ", " + this.field13968 + "\n" + this.field13969 + ", " + this.field13970 + ", " + this.field13971 + ", " + this.field13972 + "\n" + this.field13973 + ", " + this.field13974 + ", " + this.field13975 + ", " + this.field13976 + "\n";
    }
    
    public final void method9219() {
        this.field13961 = 1.0;
        this.field13962 = 0.0;
        this.field13963 = 0.0;
        this.field13964 = 0.0;
        this.field13965 = 0.0;
        this.field13966 = 1.0;
        this.field13967 = 0.0;
        this.field13968 = 0.0;
        this.field13969 = 0.0;
        this.field13970 = 0.0;
        this.field13971 = 1.0;
        this.field13972 = 0.0;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9220(final int n, final int n2, final double n3) {
        Label_0381: {
            switch (n) {
                case 0: {
                    switch (n2) {
                        case 0: {
                            this.field13961 = n3;
                            break Label_0381;
                        }
                        case 1: {
                            this.field13962 = n3;
                            break Label_0381;
                        }
                        case 2: {
                            this.field13963 = n3;
                            break Label_0381;
                        }
                        case 3: {
                            this.field13964 = n3;
                            break Label_0381;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d0"));
                        }
                    }
                    break;
                }
                case 1: {
                    switch (n2) {
                        case 0: {
                            this.field13965 = n3;
                            break Label_0381;
                        }
                        case 1: {
                            this.field13966 = n3;
                            break Label_0381;
                        }
                        case 2: {
                            this.field13967 = n3;
                            break Label_0381;
                        }
                        case 3: {
                            this.field13968 = n3;
                            break Label_0381;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d0"));
                        }
                    }
                    break;
                }
                case 2: {
                    switch (n2) {
                        case 0: {
                            this.field13969 = n3;
                            break Label_0381;
                        }
                        case 1: {
                            this.field13970 = n3;
                            break Label_0381;
                        }
                        case 2: {
                            this.field13971 = n3;
                            break Label_0381;
                        }
                        case 3: {
                            this.field13972 = n3;
                            break Label_0381;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d0"));
                        }
                    }
                    break;
                }
                case 3: {
                    switch (n2) {
                        case 0: {
                            this.field13973 = n3;
                            break Label_0381;
                        }
                        case 1: {
                            this.field13974 = n3;
                            break Label_0381;
                        }
                        case 2: {
                            this.field13975 = n3;
                            break Label_0381;
                        }
                        case 3: {
                            this.field13976 = n3;
                            break Label_0381;
                        }
                        default: {
                            throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d0"));
                        }
                    }
                    break;
                }
                default: {
                    throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d0"));
                }
            }
        }
    }
    
    public final double method9221(final int n, final int n2) {
        Label_0269: {
            switch (n) {
                case 0: {
                    switch (n2) {
                        case 0: {
                            return this.field13961;
                        }
                        case 1: {
                            return this.field13962;
                        }
                        case 2: {
                            return this.field13963;
                        }
                        case 3: {
                            return this.field13964;
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
                            return this.field13965;
                        }
                        case 1: {
                            return this.field13966;
                        }
                        case 2: {
                            return this.field13967;
                        }
                        case 3: {
                            return this.field13968;
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
                            return this.field13969;
                        }
                        case 1: {
                            return this.field13970;
                        }
                        case 2: {
                            return this.field13971;
                        }
                        case 3: {
                            return this.field13972;
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
                            return this.field13973;
                        }
                        case 1: {
                            return this.field13974;
                        }
                        case 2: {
                            return this.field13975;
                        }
                        case 3: {
                            return this.field13976;
                        }
                        default: {
                            break Label_0269;
                        }
                    }
                    break;
                }
            }
        }
        throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d1"));
    }
    
    public final void method9222(final int n, final Class9 class9) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d2"));
                    }
                    class9.field18 = this.field13973;
                    class9.field19 = this.field13974;
                    class9.field20 = this.field13975;
                    class9.field21 = this.field13976;
                }
                else {
                    class9.field18 = this.field13969;
                    class9.field19 = this.field13970;
                    class9.field20 = this.field13971;
                    class9.field21 = this.field13972;
                }
            }
            else {
                class9.field18 = this.field13965;
                class9.field19 = this.field13966;
                class9.field20 = this.field13967;
                class9.field21 = this.field13968;
            }
        }
        else {
            class9.field18 = this.field13961;
            class9.field19 = this.field13962;
            class9.field20 = this.field13963;
            class9.field21 = this.field13964;
        }
    }
    
    public final void method9223(final int n, final double[] array) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d2"));
                    }
                    array[0] = this.field13973;
                    array[1] = this.field13974;
                    array[2] = this.field13975;
                    array[3] = this.field13976;
                }
                else {
                    array[0] = this.field13969;
                    array[1] = this.field13970;
                    array[2] = this.field13971;
                    array[3] = this.field13972;
                }
            }
            else {
                array[0] = this.field13965;
                array[1] = this.field13966;
                array[2] = this.field13967;
                array[3] = this.field13968;
            }
        }
        else {
            array[0] = this.field13961;
            array[1] = this.field13962;
            array[2] = this.field13963;
            array[3] = this.field13964;
        }
    }
    
    public final void method9224(final int n, final Class9 class9) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d3"));
                    }
                    class9.field18 = this.field13964;
                    class9.field19 = this.field13968;
                    class9.field20 = this.field13972;
                    class9.field21 = this.field13976;
                }
                else {
                    class9.field18 = this.field13963;
                    class9.field19 = this.field13967;
                    class9.field20 = this.field13971;
                    class9.field21 = this.field13975;
                }
            }
            else {
                class9.field18 = this.field13962;
                class9.field19 = this.field13966;
                class9.field20 = this.field13970;
                class9.field21 = this.field13974;
            }
        }
        else {
            class9.field18 = this.field13961;
            class9.field19 = this.field13965;
            class9.field20 = this.field13969;
            class9.field21 = this.field13973;
        }
    }
    
    public final void method9225(final int n, final double[] array) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d3"));
                    }
                    array[0] = this.field13964;
                    array[1] = this.field13968;
                    array[2] = this.field13972;
                    array[3] = this.field13976;
                }
                else {
                    array[0] = this.field13963;
                    array[1] = this.field13967;
                    array[2] = this.field13971;
                    array[3] = this.field13975;
                }
            }
            else {
                array[0] = this.field13962;
                array[1] = this.field13966;
                array[2] = this.field13970;
                array[3] = this.field13974;
            }
        }
        else {
            array[0] = this.field13961;
            array[1] = this.field13965;
            array[2] = this.field13969;
            array[3] = this.field13973;
        }
    }
    
    public final void method9226(final Class2274 class2274) {
        final double[] array = new double[9];
        this.method9310(new double[3], array);
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
    
    public final void method9227(final Class2296 class2296) {
        final double[] array = new double[9];
        this.method9310(new double[3], array);
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
    
    public final double method9228(final Class2274 class2274, final Class2273 class2275) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method9310(array2, array);
        class2274.field13845 = array[0];
        class2274.field13846 = array[1];
        class2274.field13847 = array[2];
        class2274.field13848 = array[3];
        class2274.field13849 = array[4];
        class2274.field13850 = array[5];
        class2274.field13851 = array[6];
        class2274.field13852 = array[7];
        class2274.field13853 = array[8];
        class2275.field13839 = this.field13964;
        class2275.field13840 = this.field13968;
        class2275.field13841 = this.field13972;
        return Class2274.method8636(array2);
    }
    
    public final double method9229(final Class2296 class2296, final Class2273 class2297) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method9310(array2, array);
        class2296.field13935 = (float)array[0];
        class2296.field13936 = (float)array[1];
        class2296.field13937 = (float)array[2];
        class2296.field13938 = (float)array[3];
        class2296.field13939 = (float)array[4];
        class2296.field13940 = (float)array[5];
        class2296.field13941 = (float)array[6];
        class2296.field13942 = (float)array[7];
        class2296.field13943 = (float)array[8];
        class2297.field13839 = this.field13964;
        class2297.field13840 = this.field13968;
        class2297.field13841 = this.field13972;
        return Class2274.method8636(array2);
    }
    
    public final void method9230(final Class2278 class2278) {
        final double[] array = new double[9];
        this.method9310(new double[3], array);
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
    
    public final void method9231(final Class8 class8) {
        final double[] array = new double[9];
        this.method9310(new double[3], array);
        final double a = 0.25 * (1.0 + array[0] + array[4] + array[8]);
        if (((a >= 0.0) ? a : (-a)) >= 1.0E-30) {
            class8.field21 = Math.sqrt(a);
            final double n = 0.25 / class8.field21;
            class8.field18 = (array[7] - array[5]) * n;
            class8.field19 = (array[2] - array[6]) * n;
            class8.field20 = (array[3] - array[1]) * n;
            return;
        }
        class8.field21 = 0.0;
        final double a2 = -0.5 * (array[4] + array[8]);
        if (((a2 >= 0.0) ? a2 : (-a2)) >= 1.0E-30) {
            class8.field18 = Math.sqrt(a2);
            final double n2 = 0.5 / class8.field18;
            class8.field19 = array[3] * n2;
            class8.field20 = array[6] * n2;
            return;
        }
        class8.field18 = 0.0;
        final double a3 = 0.5 * (1.0 - array[8]);
        if (((a3 >= 0.0) ? a3 : (-a3)) < 1.0E-30) {
            class8.field19 = 0.0;
            class8.field20 = 1.0;
            return;
        }
        class8.field19 = Math.sqrt(a3);
        class8.field20 = array[7] / (2.0 * class8.field19);
    }
    
    public final void method9232(final Class2273 class2273) {
        class2273.field13839 = this.field13964;
        class2273.field13840 = this.field13968;
        class2273.field13841 = this.field13972;
    }
    
    public final void method9233(final Class2296 class2296) {
        class2296.field13935 = (float)this.field13961;
        class2296.field13936 = (float)this.field13962;
        class2296.field13937 = (float)this.field13963;
        class2296.field13938 = (float)this.field13965;
        class2296.field13939 = (float)this.field13966;
        class2296.field13940 = (float)this.field13967;
        class2296.field13941 = (float)this.field13969;
        class2296.field13942 = (float)this.field13970;
        class2296.field13943 = (float)this.field13971;
    }
    
    public final void method9234(final Class2274 class2274) {
        class2274.field13845 = this.field13961;
        class2274.field13846 = this.field13962;
        class2274.field13847 = this.field13963;
        class2274.field13848 = this.field13965;
        class2274.field13849 = this.field13966;
        class2274.field13850 = this.field13967;
        class2274.field13851 = this.field13969;
        class2274.field13852 = this.field13970;
        class2274.field13853 = this.field13971;
    }
    
    public final double method9235() {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method9310(array2, array);
        return Class2274.method8636(array2);
    }
    
    public final void method9236(final Class2274 class2274) {
        this.field13961 = class2274.field13845;
        this.field13962 = class2274.field13846;
        this.field13963 = class2274.field13847;
        this.field13965 = class2274.field13848;
        this.field13966 = class2274.field13849;
        this.field13967 = class2274.field13850;
        this.field13969 = class2274.field13851;
        this.field13970 = class2274.field13852;
        this.field13971 = class2274.field13853;
    }
    
    public final void method9237(final Class2296 class2296) {
        this.field13961 = class2296.field13935;
        this.field13962 = class2296.field13936;
        this.field13963 = class2296.field13937;
        this.field13965 = class2296.field13938;
        this.field13966 = class2296.field13939;
        this.field13967 = class2296.field13940;
        this.field13969 = class2296.field13941;
        this.field13970 = class2296.field13942;
        this.field13971 = class2296.field13943;
    }
    
    public final void method9238(final double n) {
        final double[] array = new double[9];
        this.method9310(new double[3], array);
        this.field13961 = array[0] * n;
        this.field13962 = array[1] * n;
        this.field13963 = array[2] * n;
        this.field13965 = array[3] * n;
        this.field13966 = array[4] * n;
        this.field13967 = array[5] * n;
        this.field13969 = array[6] * n;
        this.field13970 = array[7] * n;
        this.field13971 = array[8] * n;
    }
    
    public final void method9239(final int n, final double n2, final double n3, final double n4, final double n5) {
        switch (n) {
            case 0: {
                this.field13961 = n2;
                this.field13962 = n3;
                this.field13963 = n4;
                this.field13964 = n5;
                break;
            }
            case 1: {
                this.field13965 = n2;
                this.field13966 = n3;
                this.field13967 = n4;
                this.field13968 = n5;
                break;
            }
            case 2: {
                this.field13969 = n2;
                this.field13970 = n3;
                this.field13971 = n4;
                this.field13972 = n5;
                break;
            }
            case 3: {
                this.field13973 = n2;
                this.field13974 = n3;
                this.field13975 = n4;
                this.field13976 = n5;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d4"));
            }
        }
    }
    
    public final void method9240(final int n, final Class9 class9) {
        switch (n) {
            case 0: {
                this.field13961 = class9.field18;
                this.field13962 = class9.field19;
                this.field13963 = class9.field20;
                this.field13964 = class9.field21;
                break;
            }
            case 1: {
                this.field13965 = class9.field18;
                this.field13966 = class9.field19;
                this.field13967 = class9.field20;
                this.field13968 = class9.field21;
                break;
            }
            case 2: {
                this.field13969 = class9.field18;
                this.field13970 = class9.field19;
                this.field13971 = class9.field20;
                this.field13972 = class9.field21;
                break;
            }
            case 3: {
                this.field13973 = class9.field18;
                this.field13974 = class9.field19;
                this.field13975 = class9.field20;
                this.field13976 = class9.field21;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d4"));
            }
        }
    }
    
    public final void method9241(final int n, final double[] array) {
        switch (n) {
            case 0: {
                this.field13961 = array[0];
                this.field13962 = array[1];
                this.field13963 = array[2];
                this.field13964 = array[3];
                break;
            }
            case 1: {
                this.field13965 = array[0];
                this.field13966 = array[1];
                this.field13967 = array[2];
                this.field13968 = array[3];
                break;
            }
            case 2: {
                this.field13969 = array[0];
                this.field13970 = array[1];
                this.field13971 = array[2];
                this.field13972 = array[3];
                break;
            }
            case 3: {
                this.field13973 = array[0];
                this.field13974 = array[1];
                this.field13975 = array[2];
                this.field13976 = array[3];
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d4"));
            }
        }
    }
    
    public final void method9242(final int n, final double n2, final double n3, final double n4, final double n5) {
        switch (n) {
            case 0: {
                this.field13961 = n2;
                this.field13965 = n3;
                this.field13969 = n4;
                this.field13973 = n5;
                break;
            }
            case 1: {
                this.field13962 = n2;
                this.field13966 = n3;
                this.field13970 = n4;
                this.field13974 = n5;
                break;
            }
            case 2: {
                this.field13963 = n2;
                this.field13967 = n3;
                this.field13971 = n4;
                this.field13975 = n5;
                break;
            }
            case 3: {
                this.field13964 = n2;
                this.field13968 = n3;
                this.field13972 = n4;
                this.field13976 = n5;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d7"));
            }
        }
    }
    
    public final void method9243(final int n, final Class9 class9) {
        switch (n) {
            case 0: {
                this.field13961 = class9.field18;
                this.field13965 = class9.field19;
                this.field13969 = class9.field20;
                this.field13973 = class9.field21;
                break;
            }
            case 1: {
                this.field13962 = class9.field18;
                this.field13966 = class9.field19;
                this.field13970 = class9.field20;
                this.field13974 = class9.field21;
                break;
            }
            case 2: {
                this.field13963 = class9.field18;
                this.field13967 = class9.field19;
                this.field13971 = class9.field20;
                this.field13975 = class9.field21;
                break;
            }
            case 3: {
                this.field13964 = class9.field18;
                this.field13968 = class9.field19;
                this.field13972 = class9.field20;
                this.field13976 = class9.field21;
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d7"));
            }
        }
    }
    
    public final void method9244(final int n, final double[] array) {
        switch (n) {
            case 0: {
                this.field13961 = array[0];
                this.field13965 = array[1];
                this.field13969 = array[2];
                this.field13973 = array[3];
                break;
            }
            case 1: {
                this.field13962 = array[0];
                this.field13966 = array[1];
                this.field13970 = array[2];
                this.field13974 = array[3];
                break;
            }
            case 2: {
                this.field13963 = array[0];
                this.field13967 = array[1];
                this.field13971 = array[2];
                this.field13975 = array[3];
                break;
            }
            case 3: {
                this.field13964 = array[0];
                this.field13968 = array[1];
                this.field13972 = array[2];
                this.field13976 = array[3];
                break;
            }
            default: {
                throw new ArrayIndexOutOfBoundsException(Class9531.method35584("Matrix4d7"));
            }
        }
    }
    
    public final void method9245(final double n) {
        this.field13961 += n;
        this.field13962 += n;
        this.field13963 += n;
        this.field13964 += n;
        this.field13965 += n;
        this.field13966 += n;
        this.field13967 += n;
        this.field13968 += n;
        this.field13969 += n;
        this.field13970 += n;
        this.field13971 += n;
        this.field13972 += n;
        this.field13973 += n;
        this.field13974 += n;
        this.field13975 += n;
        this.field13976 += n;
    }
    
    public final void method9246(final double n, final Class2304 class2304) {
        this.field13961 = class2304.field13961 + n;
        this.field13962 = class2304.field13962 + n;
        this.field13963 = class2304.field13963 + n;
        this.field13964 = class2304.field13964 + n;
        this.field13965 = class2304.field13965 + n;
        this.field13966 = class2304.field13966 + n;
        this.field13967 = class2304.field13967 + n;
        this.field13968 = class2304.field13968 + n;
        this.field13969 = class2304.field13969 + n;
        this.field13970 = class2304.field13970 + n;
        this.field13971 = class2304.field13971 + n;
        this.field13972 = class2304.field13972 + n;
        this.field13973 = class2304.field13973 + n;
        this.field13974 = class2304.field13974 + n;
        this.field13975 = class2304.field13975 + n;
        this.field13976 = class2304.field13976 + n;
    }
    
    public final void method9247(final Class2304 class2304, final Class2304 class2305) {
        this.field13961 = class2304.field13961 + class2305.field13961;
        this.field13962 = class2304.field13962 + class2305.field13962;
        this.field13963 = class2304.field13963 + class2305.field13963;
        this.field13964 = class2304.field13964 + class2305.field13964;
        this.field13965 = class2304.field13965 + class2305.field13965;
        this.field13966 = class2304.field13966 + class2305.field13966;
        this.field13967 = class2304.field13967 + class2305.field13967;
        this.field13968 = class2304.field13968 + class2305.field13968;
        this.field13969 = class2304.field13969 + class2305.field13969;
        this.field13970 = class2304.field13970 + class2305.field13970;
        this.field13971 = class2304.field13971 + class2305.field13971;
        this.field13972 = class2304.field13972 + class2305.field13972;
        this.field13973 = class2304.field13973 + class2305.field13973;
        this.field13974 = class2304.field13974 + class2305.field13974;
        this.field13975 = class2304.field13975 + class2305.field13975;
        this.field13976 = class2304.field13976 + class2305.field13976;
    }
    
    public final void method9248(final Class2304 class2304) {
        this.field13961 += class2304.field13961;
        this.field13962 += class2304.field13962;
        this.field13963 += class2304.field13963;
        this.field13964 += class2304.field13964;
        this.field13965 += class2304.field13965;
        this.field13966 += class2304.field13966;
        this.field13967 += class2304.field13967;
        this.field13968 += class2304.field13968;
        this.field13969 += class2304.field13969;
        this.field13970 += class2304.field13970;
        this.field13971 += class2304.field13971;
        this.field13972 += class2304.field13972;
        this.field13973 += class2304.field13973;
        this.field13974 += class2304.field13974;
        this.field13975 += class2304.field13975;
        this.field13976 += class2304.field13976;
    }
    
    public final void method9249(final Class2304 class2304, final Class2304 class2305) {
        this.field13961 = class2304.field13961 - class2305.field13961;
        this.field13962 = class2304.field13962 - class2305.field13962;
        this.field13963 = class2304.field13963 - class2305.field13963;
        this.field13964 = class2304.field13964 - class2305.field13964;
        this.field13965 = class2304.field13965 - class2305.field13965;
        this.field13966 = class2304.field13966 - class2305.field13966;
        this.field13967 = class2304.field13967 - class2305.field13967;
        this.field13968 = class2304.field13968 - class2305.field13968;
        this.field13969 = class2304.field13969 - class2305.field13969;
        this.field13970 = class2304.field13970 - class2305.field13970;
        this.field13971 = class2304.field13971 - class2305.field13971;
        this.field13972 = class2304.field13972 - class2305.field13972;
        this.field13973 = class2304.field13973 - class2305.field13973;
        this.field13974 = class2304.field13974 - class2305.field13974;
        this.field13975 = class2304.field13975 - class2305.field13975;
        this.field13976 = class2304.field13976 - class2305.field13976;
    }
    
    public final void method9250(final Class2304 class2304) {
        this.field13961 -= class2304.field13961;
        this.field13962 -= class2304.field13962;
        this.field13963 -= class2304.field13963;
        this.field13964 -= class2304.field13964;
        this.field13965 -= class2304.field13965;
        this.field13966 -= class2304.field13966;
        this.field13967 -= class2304.field13967;
        this.field13968 -= class2304.field13968;
        this.field13969 -= class2304.field13969;
        this.field13970 -= class2304.field13970;
        this.field13971 -= class2304.field13971;
        this.field13972 -= class2304.field13972;
        this.field13973 -= class2304.field13973;
        this.field13974 -= class2304.field13974;
        this.field13975 -= class2304.field13975;
        this.field13976 -= class2304.field13976;
    }
    
    public final void method9251() {
        final double field13965 = this.field13965;
        this.field13965 = this.field13962;
        this.field13962 = field13965;
        final double field13966 = this.field13969;
        this.field13969 = this.field13963;
        this.field13963 = field13966;
        final double field13967 = this.field13973;
        this.field13973 = this.field13964;
        this.field13964 = field13967;
        final double field13968 = this.field13970;
        this.field13970 = this.field13967;
        this.field13967 = field13968;
        final double field13969 = this.field13974;
        this.field13974 = this.field13968;
        this.field13968 = field13969;
        final double field13970 = this.field13975;
        this.field13975 = this.field13972;
        this.field13972 = field13970;
    }
    
    public final void method9252(final Class2304 class2304) {
        if (this == class2304) {
            this.method9251();
        }
        else {
            this.field13961 = class2304.field13961;
            this.field13962 = class2304.field13965;
            this.field13963 = class2304.field13969;
            this.field13964 = class2304.field13973;
            this.field13965 = class2304.field13962;
            this.field13966 = class2304.field13966;
            this.field13967 = class2304.field13970;
            this.field13968 = class2304.field13974;
            this.field13969 = class2304.field13963;
            this.field13970 = class2304.field13967;
            this.field13971 = class2304.field13971;
            this.field13972 = class2304.field13975;
            this.field13973 = class2304.field13964;
            this.field13974 = class2304.field13968;
            this.field13975 = class2304.field13972;
            this.field13976 = class2304.field13976;
        }
    }
    
    public final void method9253(final double[] array) {
        this.field13961 = array[0];
        this.field13962 = array[1];
        this.field13963 = array[2];
        this.field13964 = array[3];
        this.field13965 = array[4];
        this.field13966 = array[5];
        this.field13967 = array[6];
        this.field13968 = array[7];
        this.field13969 = array[8];
        this.field13970 = array[9];
        this.field13971 = array[10];
        this.field13972 = array[11];
        this.field13973 = array[12];
        this.field13974 = array[13];
        this.field13975 = array[14];
        this.field13976 = array[15];
    }
    
    public final void method9254(final Class2296 class2296) {
        this.field13961 = class2296.field13935;
        this.field13962 = class2296.field13936;
        this.field13963 = class2296.field13937;
        this.field13964 = 0.0;
        this.field13965 = class2296.field13938;
        this.field13966 = class2296.field13939;
        this.field13967 = class2296.field13940;
        this.field13968 = 0.0;
        this.field13969 = class2296.field13941;
        this.field13970 = class2296.field13942;
        this.field13971 = class2296.field13943;
        this.field13972 = 0.0;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9255(final Class2274 class2274) {
        this.field13961 = class2274.field13845;
        this.field13962 = class2274.field13846;
        this.field13963 = class2274.field13847;
        this.field13964 = 0.0;
        this.field13965 = class2274.field13848;
        this.field13966 = class2274.field13849;
        this.field13967 = class2274.field13850;
        this.field13968 = 0.0;
        this.field13969 = class2274.field13851;
        this.field13970 = class2274.field13852;
        this.field13971 = class2274.field13853;
        this.field13972 = 0.0;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9256(final Class8 class8) {
        this.field13961 = 1.0 - 2.0 * class8.field19 * class8.field19 - 2.0 * class8.field20 * class8.field20;
        this.field13965 = 2.0 * (class8.field18 * class8.field19 + class8.field21 * class8.field20);
        this.field13969 = 2.0 * (class8.field18 * class8.field20 - class8.field21 * class8.field19);
        this.field13962 = 2.0 * (class8.field18 * class8.field19 - class8.field21 * class8.field20);
        this.field13966 = 1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field20 * class8.field20;
        this.field13970 = 2.0 * (class8.field19 * class8.field20 + class8.field21 * class8.field18);
        this.field13963 = 2.0 * (class8.field18 * class8.field20 + class8.field21 * class8.field19);
        this.field13967 = 2.0 * (class8.field19 * class8.field20 - class8.field21 * class8.field18);
        this.field13971 = 1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field19 * class8.field19;
        this.field13964 = 0.0;
        this.field13968 = 0.0;
        this.field13972 = 0.0;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9257(final Class24 class24) {
        final double sqrt = Math.sqrt(class24.field67 * class24.field67 + class24.field68 * class24.field68 + class24.field69 * class24.field69);
        if (sqrt >= 1.0E-10) {
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
            this.field13961 = n5 * n2 * n2 + cos;
            this.field13962 = n5 * n7 - sin * n4;
            this.field13963 = n5 * n6 + sin * n3;
            this.field13965 = n5 * n7 + sin * n4;
            this.field13966 = n5 * n3 * n3 + cos;
            this.field13967 = n5 * n8 - sin * n2;
            this.field13969 = n5 * n6 - sin * n3;
            this.field13970 = n5 * n8 + sin * n2;
            this.field13971 = n5 * n4 * n4 + cos;
        }
        else {
            this.field13961 = 1.0;
            this.field13962 = 0.0;
            this.field13963 = 0.0;
            this.field13965 = 0.0;
            this.field13966 = 1.0;
            this.field13967 = 0.0;
            this.field13969 = 0.0;
            this.field13970 = 0.0;
            this.field13971 = 1.0;
        }
        this.field13964 = 0.0;
        this.field13968 = 0.0;
        this.field13972 = 0.0;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9258(final Class2278 class2278) {
        this.field13961 = 1.0 - 2.0 * class2278.field13864 * class2278.field13864 - 2.0 * class2278.field13865 * class2278.field13865;
        this.field13965 = 2.0 * (class2278.field13863 * class2278.field13864 + class2278.field13866 * class2278.field13865);
        this.field13969 = 2.0 * (class2278.field13863 * class2278.field13865 - class2278.field13866 * class2278.field13864);
        this.field13962 = 2.0 * (class2278.field13863 * class2278.field13864 - class2278.field13866 * class2278.field13865);
        this.field13966 = 1.0 - 2.0 * class2278.field13863 * class2278.field13863 - 2.0 * class2278.field13865 * class2278.field13865;
        this.field13970 = 2.0 * (class2278.field13864 * class2278.field13865 + class2278.field13866 * class2278.field13863);
        this.field13963 = 2.0 * (class2278.field13863 * class2278.field13865 + class2278.field13866 * class2278.field13864);
        this.field13967 = 2.0 * (class2278.field13864 * class2278.field13865 - class2278.field13866 * class2278.field13863);
        this.field13971 = 1.0 - 2.0 * class2278.field13863 * class2278.field13863 - 2.0 * class2278.field13864 * class2278.field13864;
        this.field13964 = 0.0;
        this.field13968 = 0.0;
        this.field13972 = 0.0;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9259(final Class2307 class2307) {
        final double sqrt = Math.sqrt(class2307.field13985 * class2307.field13985 + class2307.field13986 * class2307.field13986 + class2307.field13987 * class2307.field13987);
        if (sqrt >= 1.0E-10) {
            final double n = 1.0 / sqrt;
            final double n2 = class2307.field13985 * n;
            final double n3 = class2307.field13986 * n;
            final double n4 = class2307.field13987 * n;
            final double sin = Math.sin(class2307.field13988);
            final double cos = Math.cos(class2307.field13988);
            final double n5 = 1.0 - cos;
            final double n6 = n2 * n4;
            final double n7 = n2 * n3;
            final double n8 = n3 * n4;
            this.field13961 = n5 * n2 * n2 + cos;
            this.field13962 = n5 * n7 - sin * n4;
            this.field13963 = n5 * n6 + sin * n3;
            this.field13965 = n5 * n7 + sin * n4;
            this.field13966 = n5 * n3 * n3 + cos;
            this.field13967 = n5 * n8 - sin * n2;
            this.field13969 = n5 * n6 - sin * n3;
            this.field13970 = n5 * n8 + sin * n2;
            this.field13971 = n5 * n4 * n4 + cos;
        }
        else {
            this.field13961 = 1.0;
            this.field13962 = 0.0;
            this.field13963 = 0.0;
            this.field13965 = 0.0;
            this.field13966 = 1.0;
            this.field13967 = 0.0;
            this.field13969 = 0.0;
            this.field13970 = 0.0;
            this.field13971 = 1.0;
        }
        this.field13964 = 0.0;
        this.field13968 = 0.0;
        this.field13972 = 0.0;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9260(final Class8 class8, final Class2273 class9, final double n) {
        this.field13961 = n * (1.0 - 2.0 * class8.field19 * class8.field19 - 2.0 * class8.field20 * class8.field20);
        this.field13965 = n * (2.0 * (class8.field18 * class8.field19 + class8.field21 * class8.field20));
        this.field13969 = n * (2.0 * (class8.field18 * class8.field20 - class8.field21 * class8.field19));
        this.field13962 = n * (2.0 * (class8.field18 * class8.field19 - class8.field21 * class8.field20));
        this.field13966 = n * (1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field20 * class8.field20);
        this.field13970 = n * (2.0 * (class8.field19 * class8.field20 + class8.field21 * class8.field18));
        this.field13963 = n * (2.0 * (class8.field18 * class8.field20 + class8.field21 * class8.field19));
        this.field13967 = n * (2.0 * (class8.field19 * class8.field20 - class8.field21 * class8.field18));
        this.field13971 = n * (1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field19 * class8.field19);
        this.field13964 = class9.field13839;
        this.field13968 = class9.field13840;
        this.field13972 = class9.field13841;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9261(final Class2278 class2278, final Class2273 class2279, final double n) {
        this.field13961 = n * (1.0 - 2.0 * class2278.field13864 * class2278.field13864 - 2.0 * class2278.field13865 * class2278.field13865);
        this.field13965 = n * (2.0 * (class2278.field13863 * class2278.field13864 + class2278.field13866 * class2278.field13865));
        this.field13969 = n * (2.0 * (class2278.field13863 * class2278.field13865 - class2278.field13866 * class2278.field13864));
        this.field13962 = n * (2.0 * (class2278.field13863 * class2278.field13864 - class2278.field13866 * class2278.field13865));
        this.field13966 = n * (1.0 - 2.0 * class2278.field13863 * class2278.field13863 - 2.0 * class2278.field13865 * class2278.field13865);
        this.field13970 = n * (2.0 * (class2278.field13864 * class2278.field13865 + class2278.field13866 * class2278.field13863));
        this.field13963 = n * (2.0 * (class2278.field13863 * class2278.field13865 + class2278.field13866 * class2278.field13864));
        this.field13967 = n * (2.0 * (class2278.field13864 * class2278.field13865 - class2278.field13866 * class2278.field13863));
        this.field13971 = n * (1.0 - 2.0 * class2278.field13863 * class2278.field13863 - 2.0 * class2278.field13864 * class2278.field13864);
        this.field13964 = class2279.field13839;
        this.field13968 = class2279.field13840;
        this.field13972 = class2279.field13841;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9262(final Class2278 class2278, final Class2288 class2279, final float n) {
        this.field13961 = n * (1.0 - 2.0 * class2278.field13864 * class2278.field13864 - 2.0 * class2278.field13865 * class2278.field13865);
        this.field13965 = n * (2.0 * (class2278.field13863 * class2278.field13864 + class2278.field13866 * class2278.field13865));
        this.field13969 = n * (2.0 * (class2278.field13863 * class2278.field13865 - class2278.field13866 * class2278.field13864));
        this.field13962 = n * (2.0 * (class2278.field13863 * class2278.field13864 - class2278.field13866 * class2278.field13865));
        this.field13966 = n * (1.0 - 2.0 * class2278.field13863 * class2278.field13863 - 2.0 * class2278.field13865 * class2278.field13865);
        this.field13970 = n * (2.0 * (class2278.field13864 * class2278.field13865 + class2278.field13866 * class2278.field13863));
        this.field13963 = n * (2.0 * (class2278.field13863 * class2278.field13865 + class2278.field13866 * class2278.field13864));
        this.field13967 = n * (2.0 * (class2278.field13864 * class2278.field13865 - class2278.field13866 * class2278.field13863));
        this.field13971 = n * (1.0 - 2.0 * class2278.field13863 * class2278.field13863 - 2.0 * class2278.field13864 * class2278.field13864);
        this.field13964 = class2279.field13909;
        this.field13968 = class2279.field13910;
        this.field13972 = class2279.field13911;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9263(final Class2284 class2284) {
        this.field13961 = class2284.field13891;
        this.field13962 = class2284.field13892;
        this.field13963 = class2284.field13893;
        this.field13964 = class2284.field13894;
        this.field13965 = class2284.field13895;
        this.field13966 = class2284.field13896;
        this.field13967 = class2284.field13897;
        this.field13968 = class2284.field13898;
        this.field13969 = class2284.field13899;
        this.field13970 = class2284.field13900;
        this.field13971 = class2284.field13901;
        this.field13972 = class2284.field13902;
        this.field13973 = class2284.field13903;
        this.field13974 = class2284.field13904;
        this.field13975 = class2284.field13905;
        this.field13976 = class2284.field13906;
    }
    
    public final void method9264(final Class2304 class2304) {
        this.field13961 = class2304.field13961;
        this.field13962 = class2304.field13962;
        this.field13963 = class2304.field13963;
        this.field13964 = class2304.field13964;
        this.field13965 = class2304.field13965;
        this.field13966 = class2304.field13966;
        this.field13967 = class2304.field13967;
        this.field13968 = class2304.field13968;
        this.field13969 = class2304.field13969;
        this.field13970 = class2304.field13970;
        this.field13971 = class2304.field13971;
        this.field13972 = class2304.field13972;
        this.field13973 = class2304.field13973;
        this.field13974 = class2304.field13974;
        this.field13975 = class2304.field13975;
        this.field13976 = class2304.field13976;
    }
    
    public final void method9265(final Class2304 class2304) {
        this.method9267(class2304);
    }
    
    public final void method9266() {
        this.method9267(this);
    }
    
    public final void method9267(final Class2304 class2304) {
        final double[] array = new double[16];
        final int[] array2 = new int[4];
        final double[] array3 = { class2304.field13961, class2304.field13962, class2304.field13963, class2304.field13964, class2304.field13965, class2304.field13966, class2304.field13967, class2304.field13968, class2304.field13969, class2304.field13970, class2304.field13971, class2304.field13972, class2304.field13973, class2304.field13974, class2304.field13975, class2304.field13976 };
        if (method9268(array3, array2)) {
            for (int i = 0; i < 16; ++i) {
                array[i] = 0.0;
            }
            array[5] = (array[0] = 1.0);
            array[15] = (array[10] = 1.0);
            method9269(array3, array2, array);
            this.field13961 = array[0];
            this.field13962 = array[1];
            this.field13963 = array[2];
            this.field13964 = array[3];
            this.field13965 = array[4];
            this.field13966 = array[5];
            this.field13967 = array[6];
            this.field13968 = array[7];
            this.field13969 = array[8];
            this.field13970 = array[9];
            this.field13971 = array[10];
            this.field13972 = array[11];
            this.field13973 = array[12];
            this.field13974 = array[13];
            this.field13975 = array[14];
            this.field13976 = array[15];
            return;
        }
        throw new Class2383(Class9531.method35584("Matrix4d10"));
    }
    
    public static boolean method9268(final double[] array, final int[] array2) {
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
                throw new RuntimeException(Class9531.method35584("Matrix4d11"));
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
    
    public static void method9269(final double[] array, final int[] array2, final double[] array3) {
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
            array3[n2 + 0] = (array3[n2 + 0] - array[n7 + 1] * array3[n2 + 4] - array[n7 + 2] * array3[n2 + 8] - array[n7 + 3] * array3[n2 + 12]) / array[n7 + 0];
        }
    }
    
    public final double method9270() {
        return this.field13961 * (this.field13966 * this.field13971 * this.field13976 + this.field13967 * this.field13972 * this.field13974 + this.field13968 * this.field13970 * this.field13975 - this.field13968 * this.field13971 * this.field13974 - this.field13966 * this.field13972 * this.field13975 - this.field13967 * this.field13970 * this.field13976) - this.field13962 * (this.field13965 * this.field13971 * this.field13976 + this.field13967 * this.field13972 * this.field13973 + this.field13968 * this.field13969 * this.field13975 - this.field13968 * this.field13971 * this.field13973 - this.field13965 * this.field13972 * this.field13975 - this.field13967 * this.field13969 * this.field13976) + this.field13963 * (this.field13965 * this.field13970 * this.field13976 + this.field13966 * this.field13972 * this.field13973 + this.field13968 * this.field13969 * this.field13974 - this.field13968 * this.field13970 * this.field13973 - this.field13965 * this.field13972 * this.field13974 - this.field13966 * this.field13969 * this.field13976) - this.field13964 * (this.field13965 * this.field13970 * this.field13975 + this.field13966 * this.field13971 * this.field13973 + this.field13967 * this.field13969 * this.field13974 - this.field13967 * this.field13970 * this.field13973 - this.field13965 * this.field13971 * this.field13974 - this.field13966 * this.field13969 * this.field13975);
    }
    
    public final void method9271(final double field13971) {
        this.field13961 = field13971;
        this.field13962 = 0.0;
        this.field13963 = 0.0;
        this.field13964 = 0.0;
        this.field13965 = 0.0;
        this.field13966 = field13971;
        this.field13967 = 0.0;
        this.field13968 = 0.0;
        this.field13969 = 0.0;
        this.field13970 = 0.0;
        this.field13971 = field13971;
        this.field13972 = 0.0;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9272(final Class2273 class2273) {
        this.field13961 = 1.0;
        this.field13962 = 0.0;
        this.field13963 = 0.0;
        this.field13964 = class2273.field13839;
        this.field13965 = 0.0;
        this.field13966 = 1.0;
        this.field13967 = 0.0;
        this.field13968 = class2273.field13840;
        this.field13969 = 0.0;
        this.field13970 = 0.0;
        this.field13971 = 1.0;
        this.field13972 = class2273.field13841;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9273(final double field13971, final Class2273 class2273) {
        this.field13961 = field13971;
        this.field13962 = 0.0;
        this.field13963 = 0.0;
        this.field13964 = class2273.field13839;
        this.field13965 = 0.0;
        this.field13966 = field13971;
        this.field13967 = 0.0;
        this.field13968 = class2273.field13840;
        this.field13969 = 0.0;
        this.field13970 = 0.0;
        this.field13971 = field13971;
        this.field13972 = class2273.field13841;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9274(final Class2273 class2273, final double field13971) {
        this.field13961 = field13971;
        this.field13962 = 0.0;
        this.field13963 = 0.0;
        this.field13964 = field13971 * class2273.field13839;
        this.field13965 = 0.0;
        this.field13966 = field13971;
        this.field13967 = 0.0;
        this.field13968 = field13971 * class2273.field13840;
        this.field13969 = 0.0;
        this.field13970 = 0.0;
        this.field13971 = field13971;
        this.field13972 = field13971 * class2273.field13841;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9275(final Class2296 class2296, final Class2288 class2297, final float n) {
        this.field13961 = class2296.field13935 * n;
        this.field13962 = class2296.field13936 * n;
        this.field13963 = class2296.field13937 * n;
        this.field13964 = class2297.field13909;
        this.field13965 = class2296.field13938 * n;
        this.field13966 = class2296.field13939 * n;
        this.field13967 = class2296.field13940 * n;
        this.field13968 = class2297.field13910;
        this.field13969 = class2296.field13941 * n;
        this.field13970 = class2296.field13942 * n;
        this.field13971 = class2296.field13943 * n;
        this.field13972 = class2297.field13911;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9276(final Class2274 class2274, final Class2273 class2275, final double n) {
        this.field13961 = class2274.field13845 * n;
        this.field13962 = class2274.field13846 * n;
        this.field13963 = class2274.field13847 * n;
        this.field13964 = class2275.field13839;
        this.field13965 = class2274.field13848 * n;
        this.field13966 = class2274.field13849 * n;
        this.field13967 = class2274.field13850 * n;
        this.field13968 = class2275.field13840;
        this.field13969 = class2274.field13851 * n;
        this.field13970 = class2274.field13852 * n;
        this.field13971 = class2274.field13853 * n;
        this.field13972 = class2275.field13841;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9277(final Class2273 class2273) {
        this.field13964 = class2273.field13839;
        this.field13968 = class2273.field13840;
        this.field13972 = class2273.field13841;
    }
    
    public final void method9278(final double n) {
        final double sin = Math.sin(n);
        final double cos = Math.cos(n);
        this.field13961 = 1.0;
        this.field13962 = 0.0;
        this.field13963 = 0.0;
        this.field13964 = 0.0;
        this.field13965 = 0.0;
        this.field13966 = cos;
        this.field13967 = -sin;
        this.field13968 = 0.0;
        this.field13969 = 0.0;
        this.field13970 = sin;
        this.field13971 = cos;
        this.field13972 = 0.0;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9279(final double n) {
        final double sin = Math.sin(n);
        final double cos = Math.cos(n);
        this.field13961 = cos;
        this.field13962 = 0.0;
        this.field13963 = sin;
        this.field13964 = 0.0;
        this.field13965 = 0.0;
        this.field13966 = 1.0;
        this.field13967 = 0.0;
        this.field13968 = 0.0;
        this.field13969 = -sin;
        this.field13970 = 0.0;
        this.field13971 = cos;
        this.field13972 = 0.0;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9280(final double n) {
        final double sin = Math.sin(n);
        final double cos = Math.cos(n);
        this.field13961 = cos;
        this.field13962 = -sin;
        this.field13963 = 0.0;
        this.field13964 = 0.0;
        this.field13965 = sin;
        this.field13966 = cos;
        this.field13967 = 0.0;
        this.field13968 = 0.0;
        this.field13969 = 0.0;
        this.field13970 = 0.0;
        this.field13971 = 1.0;
        this.field13972 = 0.0;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 1.0;
    }
    
    public final void method9281(final double n) {
        this.field13961 *= n;
        this.field13962 *= n;
        this.field13963 *= n;
        this.field13964 *= n;
        this.field13965 *= n;
        this.field13966 *= n;
        this.field13967 *= n;
        this.field13968 *= n;
        this.field13969 *= n;
        this.field13970 *= n;
        this.field13971 *= n;
        this.field13972 *= n;
        this.field13973 *= n;
        this.field13974 *= n;
        this.field13975 *= n;
        this.field13976 *= n;
    }
    
    public final void method9282(final double n, final Class2304 class2304) {
        this.field13961 = class2304.field13961 * n;
        this.field13962 = class2304.field13962 * n;
        this.field13963 = class2304.field13963 * n;
        this.field13964 = class2304.field13964 * n;
        this.field13965 = class2304.field13965 * n;
        this.field13966 = class2304.field13966 * n;
        this.field13967 = class2304.field13967 * n;
        this.field13968 = class2304.field13968 * n;
        this.field13969 = class2304.field13969 * n;
        this.field13970 = class2304.field13970 * n;
        this.field13971 = class2304.field13971 * n;
        this.field13972 = class2304.field13972 * n;
        this.field13973 = class2304.field13973 * n;
        this.field13974 = class2304.field13974 * n;
        this.field13975 = class2304.field13975 * n;
        this.field13976 = class2304.field13976 * n;
    }
    
    public final void method9283(final Class2304 class2304) {
        final double field13961 = this.field13961 * class2304.field13961 + this.field13962 * class2304.field13965 + this.field13963 * class2304.field13969 + this.field13964 * class2304.field13973;
        final double field13962 = this.field13961 * class2304.field13962 + this.field13962 * class2304.field13966 + this.field13963 * class2304.field13970 + this.field13964 * class2304.field13974;
        final double field13963 = this.field13961 * class2304.field13963 + this.field13962 * class2304.field13967 + this.field13963 * class2304.field13971 + this.field13964 * class2304.field13975;
        final double field13964 = this.field13961 * class2304.field13964 + this.field13962 * class2304.field13968 + this.field13963 * class2304.field13972 + this.field13964 * class2304.field13976;
        final double field13965 = this.field13965 * class2304.field13961 + this.field13966 * class2304.field13965 + this.field13967 * class2304.field13969 + this.field13968 * class2304.field13973;
        final double field13966 = this.field13965 * class2304.field13962 + this.field13966 * class2304.field13966 + this.field13967 * class2304.field13970 + this.field13968 * class2304.field13974;
        final double field13967 = this.field13965 * class2304.field13963 + this.field13966 * class2304.field13967 + this.field13967 * class2304.field13971 + this.field13968 * class2304.field13975;
        final double field13968 = this.field13965 * class2304.field13964 + this.field13966 * class2304.field13968 + this.field13967 * class2304.field13972 + this.field13968 * class2304.field13976;
        final double field13969 = this.field13969 * class2304.field13961 + this.field13970 * class2304.field13965 + this.field13971 * class2304.field13969 + this.field13972 * class2304.field13973;
        final double field13970 = this.field13969 * class2304.field13962 + this.field13970 * class2304.field13966 + this.field13971 * class2304.field13970 + this.field13972 * class2304.field13974;
        final double field13971 = this.field13969 * class2304.field13963 + this.field13970 * class2304.field13967 + this.field13971 * class2304.field13971 + this.field13972 * class2304.field13975;
        final double field13972 = this.field13969 * class2304.field13964 + this.field13970 * class2304.field13968 + this.field13971 * class2304.field13972 + this.field13972 * class2304.field13976;
        final double field13973 = this.field13973 * class2304.field13961 + this.field13974 * class2304.field13965 + this.field13975 * class2304.field13969 + this.field13976 * class2304.field13973;
        final double field13974 = this.field13973 * class2304.field13962 + this.field13974 * class2304.field13966 + this.field13975 * class2304.field13970 + this.field13976 * class2304.field13974;
        final double field13975 = this.field13973 * class2304.field13963 + this.field13974 * class2304.field13967 + this.field13975 * class2304.field13971 + this.field13976 * class2304.field13975;
        final double field13976 = this.field13973 * class2304.field13964 + this.field13974 * class2304.field13968 + this.field13975 * class2304.field13972 + this.field13976 * class2304.field13976;
        this.field13961 = field13961;
        this.field13962 = field13962;
        this.field13963 = field13963;
        this.field13964 = field13964;
        this.field13965 = field13965;
        this.field13966 = field13966;
        this.field13967 = field13967;
        this.field13968 = field13968;
        this.field13969 = field13969;
        this.field13970 = field13970;
        this.field13971 = field13971;
        this.field13972 = field13972;
        this.field13973 = field13973;
        this.field13974 = field13974;
        this.field13975 = field13975;
        this.field13976 = field13976;
    }
    
    public final void method9284(final Class2304 class2304, final Class2304 class2305) {
        if (this != class2304 && this != class2305) {
            this.field13961 = class2304.field13961 * class2305.field13961 + class2304.field13962 * class2305.field13965 + class2304.field13963 * class2305.field13969 + class2304.field13964 * class2305.field13973;
            this.field13962 = class2304.field13961 * class2305.field13962 + class2304.field13962 * class2305.field13966 + class2304.field13963 * class2305.field13970 + class2304.field13964 * class2305.field13974;
            this.field13963 = class2304.field13961 * class2305.field13963 + class2304.field13962 * class2305.field13967 + class2304.field13963 * class2305.field13971 + class2304.field13964 * class2305.field13975;
            this.field13964 = class2304.field13961 * class2305.field13964 + class2304.field13962 * class2305.field13968 + class2304.field13963 * class2305.field13972 + class2304.field13964 * class2305.field13976;
            this.field13965 = class2304.field13965 * class2305.field13961 + class2304.field13966 * class2305.field13965 + class2304.field13967 * class2305.field13969 + class2304.field13968 * class2305.field13973;
            this.field13966 = class2304.field13965 * class2305.field13962 + class2304.field13966 * class2305.field13966 + class2304.field13967 * class2305.field13970 + class2304.field13968 * class2305.field13974;
            this.field13967 = class2304.field13965 * class2305.field13963 + class2304.field13966 * class2305.field13967 + class2304.field13967 * class2305.field13971 + class2304.field13968 * class2305.field13975;
            this.field13968 = class2304.field13965 * class2305.field13964 + class2304.field13966 * class2305.field13968 + class2304.field13967 * class2305.field13972 + class2304.field13968 * class2305.field13976;
            this.field13969 = class2304.field13969 * class2305.field13961 + class2304.field13970 * class2305.field13965 + class2304.field13971 * class2305.field13969 + class2304.field13972 * class2305.field13973;
            this.field13970 = class2304.field13969 * class2305.field13962 + class2304.field13970 * class2305.field13966 + class2304.field13971 * class2305.field13970 + class2304.field13972 * class2305.field13974;
            this.field13971 = class2304.field13969 * class2305.field13963 + class2304.field13970 * class2305.field13967 + class2304.field13971 * class2305.field13971 + class2304.field13972 * class2305.field13975;
            this.field13972 = class2304.field13969 * class2305.field13964 + class2304.field13970 * class2305.field13968 + class2304.field13971 * class2305.field13972 + class2304.field13972 * class2305.field13976;
            this.field13973 = class2304.field13973 * class2305.field13961 + class2304.field13974 * class2305.field13965 + class2304.field13975 * class2305.field13969 + class2304.field13976 * class2305.field13973;
            this.field13974 = class2304.field13973 * class2305.field13962 + class2304.field13974 * class2305.field13966 + class2304.field13975 * class2305.field13970 + class2304.field13976 * class2305.field13974;
            this.field13975 = class2304.field13973 * class2305.field13963 + class2304.field13974 * class2305.field13967 + class2304.field13975 * class2305.field13971 + class2304.field13976 * class2305.field13975;
            this.field13976 = class2304.field13973 * class2305.field13964 + class2304.field13974 * class2305.field13968 + class2304.field13975 * class2305.field13972 + class2304.field13976 * class2305.field13976;
        }
        else {
            final double field13961 = class2304.field13961 * class2305.field13961 + class2304.field13962 * class2305.field13965 + class2304.field13963 * class2305.field13969 + class2304.field13964 * class2305.field13973;
            final double field13962 = class2304.field13961 * class2305.field13962 + class2304.field13962 * class2305.field13966 + class2304.field13963 * class2305.field13970 + class2304.field13964 * class2305.field13974;
            final double field13963 = class2304.field13961 * class2305.field13963 + class2304.field13962 * class2305.field13967 + class2304.field13963 * class2305.field13971 + class2304.field13964 * class2305.field13975;
            final double field13964 = class2304.field13961 * class2305.field13964 + class2304.field13962 * class2305.field13968 + class2304.field13963 * class2305.field13972 + class2304.field13964 * class2305.field13976;
            final double field13965 = class2304.field13965 * class2305.field13961 + class2304.field13966 * class2305.field13965 + class2304.field13967 * class2305.field13969 + class2304.field13968 * class2305.field13973;
            final double field13966 = class2304.field13965 * class2305.field13962 + class2304.field13966 * class2305.field13966 + class2304.field13967 * class2305.field13970 + class2304.field13968 * class2305.field13974;
            final double field13967 = class2304.field13965 * class2305.field13963 + class2304.field13966 * class2305.field13967 + class2304.field13967 * class2305.field13971 + class2304.field13968 * class2305.field13975;
            final double field13968 = class2304.field13965 * class2305.field13964 + class2304.field13966 * class2305.field13968 + class2304.field13967 * class2305.field13972 + class2304.field13968 * class2305.field13976;
            final double field13969 = class2304.field13969 * class2305.field13961 + class2304.field13970 * class2305.field13965 + class2304.field13971 * class2305.field13969 + class2304.field13972 * class2305.field13973;
            final double field13970 = class2304.field13969 * class2305.field13962 + class2304.field13970 * class2305.field13966 + class2304.field13971 * class2305.field13970 + class2304.field13972 * class2305.field13974;
            final double field13971 = class2304.field13969 * class2305.field13963 + class2304.field13970 * class2305.field13967 + class2304.field13971 * class2305.field13971 + class2304.field13972 * class2305.field13975;
            final double field13972 = class2304.field13969 * class2305.field13964 + class2304.field13970 * class2305.field13968 + class2304.field13971 * class2305.field13972 + class2304.field13972 * class2305.field13976;
            final double field13973 = class2304.field13973 * class2305.field13961 + class2304.field13974 * class2305.field13965 + class2304.field13975 * class2305.field13969 + class2304.field13976 * class2305.field13973;
            final double field13974 = class2304.field13973 * class2305.field13962 + class2304.field13974 * class2305.field13966 + class2304.field13975 * class2305.field13970 + class2304.field13976 * class2305.field13974;
            final double field13975 = class2304.field13973 * class2305.field13963 + class2304.field13974 * class2305.field13967 + class2304.field13975 * class2305.field13971 + class2304.field13976 * class2305.field13975;
            final double field13976 = class2304.field13973 * class2305.field13964 + class2304.field13974 * class2305.field13968 + class2304.field13975 * class2305.field13972 + class2304.field13976 * class2305.field13976;
            this.field13961 = field13961;
            this.field13962 = field13962;
            this.field13963 = field13963;
            this.field13964 = field13964;
            this.field13965 = field13965;
            this.field13966 = field13966;
            this.field13967 = field13967;
            this.field13968 = field13968;
            this.field13969 = field13969;
            this.field13970 = field13970;
            this.field13971 = field13971;
            this.field13972 = field13972;
            this.field13973 = field13973;
            this.field13974 = field13974;
            this.field13975 = field13975;
            this.field13976 = field13976;
        }
    }
    
    public final void method9285(final Class2304 class2304, final Class2304 class2305) {
        if (this != class2304 && this != class2305) {
            this.field13961 = class2304.field13961 * class2305.field13961 + class2304.field13965 * class2305.field13962 + class2304.field13969 * class2305.field13963 + class2304.field13973 * class2305.field13964;
            this.field13962 = class2304.field13961 * class2305.field13965 + class2304.field13965 * class2305.field13966 + class2304.field13969 * class2305.field13967 + class2304.field13973 * class2305.field13968;
            this.field13963 = class2304.field13961 * class2305.field13969 + class2304.field13965 * class2305.field13970 + class2304.field13969 * class2305.field13971 + class2304.field13973 * class2305.field13972;
            this.field13964 = class2304.field13961 * class2305.field13973 + class2304.field13965 * class2305.field13974 + class2304.field13969 * class2305.field13975 + class2304.field13973 * class2305.field13976;
            this.field13965 = class2304.field13962 * class2305.field13961 + class2304.field13966 * class2305.field13962 + class2304.field13970 * class2305.field13963 + class2304.field13974 * class2305.field13964;
            this.field13966 = class2304.field13962 * class2305.field13965 + class2304.field13966 * class2305.field13966 + class2304.field13970 * class2305.field13967 + class2304.field13974 * class2305.field13968;
            this.field13967 = class2304.field13962 * class2305.field13969 + class2304.field13966 * class2305.field13970 + class2304.field13970 * class2305.field13971 + class2304.field13974 * class2305.field13972;
            this.field13968 = class2304.field13962 * class2305.field13973 + class2304.field13966 * class2305.field13974 + class2304.field13970 * class2305.field13975 + class2304.field13974 * class2305.field13976;
            this.field13969 = class2304.field13963 * class2305.field13961 + class2304.field13967 * class2305.field13962 + class2304.field13971 * class2305.field13963 + class2304.field13975 * class2305.field13964;
            this.field13970 = class2304.field13963 * class2305.field13965 + class2304.field13967 * class2305.field13966 + class2304.field13971 * class2305.field13967 + class2304.field13975 * class2305.field13968;
            this.field13971 = class2304.field13963 * class2305.field13969 + class2304.field13967 * class2305.field13970 + class2304.field13971 * class2305.field13971 + class2304.field13975 * class2305.field13972;
            this.field13972 = class2304.field13963 * class2305.field13973 + class2304.field13967 * class2305.field13974 + class2304.field13971 * class2305.field13975 + class2304.field13975 * class2305.field13976;
            this.field13973 = class2304.field13964 * class2305.field13961 + class2304.field13968 * class2305.field13962 + class2304.field13972 * class2305.field13963 + class2304.field13976 * class2305.field13964;
            this.field13974 = class2304.field13964 * class2305.field13965 + class2304.field13968 * class2305.field13966 + class2304.field13972 * class2305.field13967 + class2304.field13976 * class2305.field13968;
            this.field13975 = class2304.field13964 * class2305.field13969 + class2304.field13968 * class2305.field13970 + class2304.field13972 * class2305.field13971 + class2304.field13976 * class2305.field13972;
            this.field13976 = class2304.field13964 * class2305.field13973 + class2304.field13968 * class2305.field13974 + class2304.field13972 * class2305.field13975 + class2304.field13976 * class2305.field13976;
        }
        else {
            final double field13961 = class2304.field13961 * class2305.field13961 + class2304.field13965 * class2305.field13962 + class2304.field13969 * class2305.field13963 + class2304.field13973 * class2305.field13964;
            final double field13962 = class2304.field13961 * class2305.field13965 + class2304.field13965 * class2305.field13966 + class2304.field13969 * class2305.field13967 + class2304.field13973 * class2305.field13968;
            final double field13963 = class2304.field13961 * class2305.field13969 + class2304.field13965 * class2305.field13970 + class2304.field13969 * class2305.field13971 + class2304.field13973 * class2305.field13972;
            final double field13964 = class2304.field13961 * class2305.field13973 + class2304.field13965 * class2305.field13974 + class2304.field13969 * class2305.field13975 + class2304.field13973 * class2305.field13976;
            final double field13965 = class2304.field13962 * class2305.field13961 + class2304.field13966 * class2305.field13962 + class2304.field13970 * class2305.field13963 + class2304.field13974 * class2305.field13964;
            final double field13966 = class2304.field13962 * class2305.field13965 + class2304.field13966 * class2305.field13966 + class2304.field13970 * class2305.field13967 + class2304.field13974 * class2305.field13968;
            final double field13967 = class2304.field13962 * class2305.field13969 + class2304.field13966 * class2305.field13970 + class2304.field13970 * class2305.field13971 + class2304.field13974 * class2305.field13972;
            final double field13968 = class2304.field13962 * class2305.field13973 + class2304.field13966 * class2305.field13974 + class2304.field13970 * class2305.field13975 + class2304.field13974 * class2305.field13976;
            final double field13969 = class2304.field13963 * class2305.field13961 + class2304.field13967 * class2305.field13962 + class2304.field13971 * class2305.field13963 + class2304.field13975 * class2305.field13964;
            final double field13970 = class2304.field13963 * class2305.field13965 + class2304.field13967 * class2305.field13966 + class2304.field13971 * class2305.field13967 + class2304.field13975 * class2305.field13968;
            final double field13971 = class2304.field13963 * class2305.field13969 + class2304.field13967 * class2305.field13970 + class2304.field13971 * class2305.field13971 + class2304.field13975 * class2305.field13972;
            final double field13972 = class2304.field13963 * class2305.field13973 + class2304.field13967 * class2305.field13974 + class2304.field13971 * class2305.field13975 + class2304.field13975 * class2305.field13976;
            final double field13973 = class2304.field13964 * class2305.field13961 + class2304.field13968 * class2305.field13962 + class2304.field13972 * class2305.field13963 + class2304.field13976 * class2305.field13964;
            final double field13974 = class2304.field13964 * class2305.field13965 + class2304.field13968 * class2305.field13966 + class2304.field13972 * class2305.field13967 + class2304.field13976 * class2305.field13968;
            final double field13975 = class2304.field13964 * class2305.field13969 + class2304.field13968 * class2305.field13970 + class2304.field13972 * class2305.field13971 + class2304.field13976 * class2305.field13972;
            final double field13976 = class2304.field13964 * class2305.field13973 + class2304.field13968 * class2305.field13974 + class2304.field13972 * class2305.field13975 + class2304.field13976 * class2305.field13976;
            this.field13961 = field13961;
            this.field13962 = field13962;
            this.field13963 = field13963;
            this.field13964 = field13964;
            this.field13965 = field13965;
            this.field13966 = field13966;
            this.field13967 = field13967;
            this.field13968 = field13968;
            this.field13969 = field13969;
            this.field13970 = field13970;
            this.field13971 = field13971;
            this.field13972 = field13972;
            this.field13973 = field13973;
            this.field13974 = field13974;
            this.field13975 = field13975;
            this.field13976 = field13976;
        }
    }
    
    public final void method9286(final Class2304 class2304, final Class2304 class2305) {
        if (this != class2304 && this != class2305) {
            this.field13961 = class2304.field13961 * class2305.field13961 + class2304.field13962 * class2305.field13962 + class2304.field13963 * class2305.field13963 + class2304.field13964 * class2305.field13964;
            this.field13962 = class2304.field13961 * class2305.field13965 + class2304.field13962 * class2305.field13966 + class2304.field13963 * class2305.field13967 + class2304.field13964 * class2305.field13968;
            this.field13963 = class2304.field13961 * class2305.field13969 + class2304.field13962 * class2305.field13970 + class2304.field13963 * class2305.field13971 + class2304.field13964 * class2305.field13972;
            this.field13964 = class2304.field13961 * class2305.field13973 + class2304.field13962 * class2305.field13974 + class2304.field13963 * class2305.field13975 + class2304.field13964 * class2305.field13976;
            this.field13965 = class2304.field13965 * class2305.field13961 + class2304.field13966 * class2305.field13962 + class2304.field13967 * class2305.field13963 + class2304.field13968 * class2305.field13964;
            this.field13966 = class2304.field13965 * class2305.field13965 + class2304.field13966 * class2305.field13966 + class2304.field13967 * class2305.field13967 + class2304.field13968 * class2305.field13968;
            this.field13967 = class2304.field13965 * class2305.field13969 + class2304.field13966 * class2305.field13970 + class2304.field13967 * class2305.field13971 + class2304.field13968 * class2305.field13972;
            this.field13968 = class2304.field13965 * class2305.field13973 + class2304.field13966 * class2305.field13974 + class2304.field13967 * class2305.field13975 + class2304.field13968 * class2305.field13976;
            this.field13969 = class2304.field13969 * class2305.field13961 + class2304.field13970 * class2305.field13962 + class2304.field13971 * class2305.field13963 + class2304.field13972 * class2305.field13964;
            this.field13970 = class2304.field13969 * class2305.field13965 + class2304.field13970 * class2305.field13966 + class2304.field13971 * class2305.field13967 + class2304.field13972 * class2305.field13968;
            this.field13971 = class2304.field13969 * class2305.field13969 + class2304.field13970 * class2305.field13970 + class2304.field13971 * class2305.field13971 + class2304.field13972 * class2305.field13972;
            this.field13972 = class2304.field13969 * class2305.field13973 + class2304.field13970 * class2305.field13974 + class2304.field13971 * class2305.field13975 + class2304.field13972 * class2305.field13976;
            this.field13973 = class2304.field13973 * class2305.field13961 + class2304.field13974 * class2305.field13962 + class2304.field13975 * class2305.field13963 + class2304.field13976 * class2305.field13964;
            this.field13974 = class2304.field13973 * class2305.field13965 + class2304.field13974 * class2305.field13966 + class2304.field13975 * class2305.field13967 + class2304.field13976 * class2305.field13968;
            this.field13975 = class2304.field13973 * class2305.field13969 + class2304.field13974 * class2305.field13970 + class2304.field13975 * class2305.field13971 + class2304.field13976 * class2305.field13972;
            this.field13976 = class2304.field13973 * class2305.field13973 + class2304.field13974 * class2305.field13974 + class2304.field13975 * class2305.field13975 + class2304.field13976 * class2305.field13976;
        }
        else {
            final double field13961 = class2304.field13961 * class2305.field13961 + class2304.field13962 * class2305.field13962 + class2304.field13963 * class2305.field13963 + class2304.field13964 * class2305.field13964;
            final double field13962 = class2304.field13961 * class2305.field13965 + class2304.field13962 * class2305.field13966 + class2304.field13963 * class2305.field13967 + class2304.field13964 * class2305.field13968;
            final double field13963 = class2304.field13961 * class2305.field13969 + class2304.field13962 * class2305.field13970 + class2304.field13963 * class2305.field13971 + class2304.field13964 * class2305.field13972;
            final double field13964 = class2304.field13961 * class2305.field13973 + class2304.field13962 * class2305.field13974 + class2304.field13963 * class2305.field13975 + class2304.field13964 * class2305.field13976;
            final double field13965 = class2304.field13965 * class2305.field13961 + class2304.field13966 * class2305.field13962 + class2304.field13967 * class2305.field13963 + class2304.field13968 * class2305.field13964;
            final double field13966 = class2304.field13965 * class2305.field13965 + class2304.field13966 * class2305.field13966 + class2304.field13967 * class2305.field13967 + class2304.field13968 * class2305.field13968;
            final double field13967 = class2304.field13965 * class2305.field13969 + class2304.field13966 * class2305.field13970 + class2304.field13967 * class2305.field13971 + class2304.field13968 * class2305.field13972;
            final double field13968 = class2304.field13965 * class2305.field13973 + class2304.field13966 * class2305.field13974 + class2304.field13967 * class2305.field13975 + class2304.field13968 * class2305.field13976;
            final double field13969 = class2304.field13969 * class2305.field13961 + class2304.field13970 * class2305.field13962 + class2304.field13971 * class2305.field13963 + class2304.field13972 * class2305.field13964;
            final double field13970 = class2304.field13969 * class2305.field13965 + class2304.field13970 * class2305.field13966 + class2304.field13971 * class2305.field13967 + class2304.field13972 * class2305.field13968;
            final double field13971 = class2304.field13969 * class2305.field13969 + class2304.field13970 * class2305.field13970 + class2304.field13971 * class2305.field13971 + class2304.field13972 * class2305.field13972;
            final double field13972 = class2304.field13969 * class2305.field13973 + class2304.field13970 * class2305.field13974 + class2304.field13971 * class2305.field13975 + class2304.field13972 * class2305.field13976;
            final double field13973 = class2304.field13973 * class2305.field13961 + class2304.field13974 * class2305.field13962 + class2304.field13975 * class2305.field13963 + class2304.field13976 * class2305.field13964;
            final double field13974 = class2304.field13973 * class2305.field13965 + class2304.field13974 * class2305.field13966 + class2304.field13975 * class2305.field13967 + class2304.field13976 * class2305.field13968;
            final double field13975 = class2304.field13973 * class2305.field13969 + class2304.field13974 * class2305.field13970 + class2304.field13975 * class2305.field13971 + class2304.field13976 * class2305.field13972;
            final double field13976 = class2304.field13973 * class2305.field13973 + class2304.field13974 * class2305.field13974 + class2304.field13975 * class2305.field13975 + class2304.field13976 * class2305.field13976;
            this.field13961 = field13961;
            this.field13962 = field13962;
            this.field13963 = field13963;
            this.field13964 = field13964;
            this.field13965 = field13965;
            this.field13966 = field13966;
            this.field13967 = field13967;
            this.field13968 = field13968;
            this.field13969 = field13969;
            this.field13970 = field13970;
            this.field13971 = field13971;
            this.field13972 = field13972;
            this.field13973 = field13973;
            this.field13974 = field13974;
            this.field13975 = field13975;
            this.field13976 = field13976;
        }
    }
    
    public final void method9287(final Class2304 class2304, final Class2304 class2305) {
        if (this != class2304 && this != class2305) {
            this.field13961 = class2304.field13961 * class2305.field13961 + class2304.field13965 * class2305.field13965 + class2304.field13969 * class2305.field13969 + class2304.field13973 * class2305.field13973;
            this.field13962 = class2304.field13961 * class2305.field13962 + class2304.field13965 * class2305.field13966 + class2304.field13969 * class2305.field13970 + class2304.field13973 * class2305.field13974;
            this.field13963 = class2304.field13961 * class2305.field13963 + class2304.field13965 * class2305.field13967 + class2304.field13969 * class2305.field13971 + class2304.field13973 * class2305.field13975;
            this.field13964 = class2304.field13961 * class2305.field13964 + class2304.field13965 * class2305.field13968 + class2304.field13969 * class2305.field13972 + class2304.field13973 * class2305.field13976;
            this.field13965 = class2304.field13962 * class2305.field13961 + class2304.field13966 * class2305.field13965 + class2304.field13970 * class2305.field13969 + class2304.field13974 * class2305.field13973;
            this.field13966 = class2304.field13962 * class2305.field13962 + class2304.field13966 * class2305.field13966 + class2304.field13970 * class2305.field13970 + class2304.field13974 * class2305.field13974;
            this.field13967 = class2304.field13962 * class2305.field13963 + class2304.field13966 * class2305.field13967 + class2304.field13970 * class2305.field13971 + class2304.field13974 * class2305.field13975;
            this.field13968 = class2304.field13962 * class2305.field13964 + class2304.field13966 * class2305.field13968 + class2304.field13970 * class2305.field13972 + class2304.field13974 * class2305.field13976;
            this.field13969 = class2304.field13963 * class2305.field13961 + class2304.field13967 * class2305.field13965 + class2304.field13971 * class2305.field13969 + class2304.field13975 * class2305.field13973;
            this.field13970 = class2304.field13963 * class2305.field13962 + class2304.field13967 * class2305.field13966 + class2304.field13971 * class2305.field13970 + class2304.field13975 * class2305.field13974;
            this.field13971 = class2304.field13963 * class2305.field13963 + class2304.field13967 * class2305.field13967 + class2304.field13971 * class2305.field13971 + class2304.field13975 * class2305.field13975;
            this.field13972 = class2304.field13963 * class2305.field13964 + class2304.field13967 * class2305.field13968 + class2304.field13971 * class2305.field13972 + class2304.field13975 * class2305.field13976;
            this.field13973 = class2304.field13964 * class2305.field13961 + class2304.field13968 * class2305.field13965 + class2304.field13972 * class2305.field13969 + class2304.field13976 * class2305.field13973;
            this.field13974 = class2304.field13964 * class2305.field13962 + class2304.field13968 * class2305.field13966 + class2304.field13972 * class2305.field13970 + class2304.field13976 * class2305.field13974;
            this.field13975 = class2304.field13964 * class2305.field13963 + class2304.field13968 * class2305.field13967 + class2304.field13972 * class2305.field13971 + class2304.field13976 * class2305.field13975;
            this.field13976 = class2304.field13964 * class2305.field13964 + class2304.field13968 * class2305.field13968 + class2304.field13972 * class2305.field13972 + class2304.field13976 * class2305.field13976;
        }
        else {
            final double field13961 = class2304.field13961 * class2305.field13961 + class2304.field13965 * class2305.field13965 + class2304.field13969 * class2305.field13969 + class2304.field13973 * class2305.field13973;
            final double field13962 = class2304.field13961 * class2305.field13962 + class2304.field13965 * class2305.field13966 + class2304.field13969 * class2305.field13970 + class2304.field13973 * class2305.field13974;
            final double field13963 = class2304.field13961 * class2305.field13963 + class2304.field13965 * class2305.field13967 + class2304.field13969 * class2305.field13971 + class2304.field13973 * class2305.field13975;
            final double field13964 = class2304.field13961 * class2305.field13964 + class2304.field13965 * class2305.field13968 + class2304.field13969 * class2305.field13972 + class2304.field13973 * class2305.field13976;
            final double field13965 = class2304.field13962 * class2305.field13961 + class2304.field13966 * class2305.field13965 + class2304.field13970 * class2305.field13969 + class2304.field13974 * class2305.field13973;
            final double field13966 = class2304.field13962 * class2305.field13962 + class2304.field13966 * class2305.field13966 + class2304.field13970 * class2305.field13970 + class2304.field13974 * class2305.field13974;
            final double field13967 = class2304.field13962 * class2305.field13963 + class2304.field13966 * class2305.field13967 + class2304.field13970 * class2305.field13971 + class2304.field13974 * class2305.field13975;
            final double field13968 = class2304.field13962 * class2305.field13964 + class2304.field13966 * class2305.field13968 + class2304.field13970 * class2305.field13972 + class2304.field13974 * class2305.field13976;
            final double field13969 = class2304.field13963 * class2305.field13961 + class2304.field13967 * class2305.field13965 + class2304.field13971 * class2305.field13969 + class2304.field13975 * class2305.field13973;
            final double field13970 = class2304.field13963 * class2305.field13962 + class2304.field13967 * class2305.field13966 + class2304.field13971 * class2305.field13970 + class2304.field13975 * class2305.field13974;
            final double field13971 = class2304.field13963 * class2305.field13963 + class2304.field13967 * class2305.field13967 + class2304.field13971 * class2305.field13971 + class2304.field13975 * class2305.field13975;
            final double field13972 = class2304.field13963 * class2305.field13964 + class2304.field13967 * class2305.field13968 + class2304.field13971 * class2305.field13972 + class2304.field13975 * class2305.field13976;
            final double field13973 = class2304.field13964 * class2305.field13961 + class2304.field13968 * class2305.field13965 + class2304.field13972 * class2305.field13969 + class2304.field13976 * class2305.field13973;
            final double field13974 = class2304.field13964 * class2305.field13962 + class2304.field13968 * class2305.field13966 + class2304.field13972 * class2305.field13970 + class2304.field13976 * class2305.field13974;
            final double field13975 = class2304.field13964 * class2305.field13963 + class2304.field13968 * class2305.field13967 + class2304.field13972 * class2305.field13971 + class2304.field13976 * class2305.field13975;
            final double field13976 = class2304.field13964 * class2305.field13964 + class2304.field13968 * class2305.field13968 + class2304.field13972 * class2305.field13972 + class2304.field13976 * class2305.field13976;
            this.field13961 = field13961;
            this.field13962 = field13962;
            this.field13963 = field13963;
            this.field13964 = field13964;
            this.field13965 = field13965;
            this.field13966 = field13966;
            this.field13967 = field13967;
            this.field13968 = field13968;
            this.field13969 = field13969;
            this.field13970 = field13970;
            this.field13971 = field13971;
            this.field13972 = field13972;
            this.field13973 = field13973;
            this.field13974 = field13974;
            this.field13975 = field13975;
            this.field13976 = field13976;
        }
    }
    
    public boolean equals(final Class2304 class2304) {
        try {
            return this.field13961 == class2304.field13961 && this.field13962 == class2304.field13962 && this.field13963 == class2304.field13963 && this.field13964 == class2304.field13964 && this.field13965 == class2304.field13965 && this.field13966 == class2304.field13966 && this.field13967 == class2304.field13967 && this.field13968 == class2304.field13968 && this.field13969 == class2304.field13969 && this.field13970 == class2304.field13970 && this.field13971 == class2304.field13971 && this.field13972 == class2304.field13972 && this.field13973 == class2304.field13973 && this.field13974 == class2304.field13974 && this.field13975 == class2304.field13975 && this.field13976 == class2304.field13976;
        }
        catch (final NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final Class2304 class2304 = (Class2304)o;
            return this.field13961 == class2304.field13961 && this.field13962 == class2304.field13962 && this.field13963 == class2304.field13963 && this.field13964 == class2304.field13964 && this.field13965 == class2304.field13965 && this.field13966 == class2304.field13966 && this.field13967 == class2304.field13967 && this.field13968 == class2304.field13968 && this.field13969 == class2304.field13969 && this.field13970 == class2304.field13970 && this.field13971 == class2304.field13971 && this.field13972 == class2304.field13972 && this.field13973 == class2304.field13973 && this.field13974 == class2304.field13974 && this.field13975 == class2304.field13975 && this.field13976 == class2304.field13976;
        }
        catch (final ClassCastException ex) {
            return false;
        }
        catch (final NullPointerException ex2) {
            return false;
        }
    }
    
    @Deprecated
    public boolean method9288(final Class2304 class2304, final float n) {
        return this.method9289(class2304, n);
    }
    
    public boolean method9289(final Class2304 class2304, final double n) {
        final double n2 = this.field13961 - class2304.field13961;
        if (((n2 >= 0.0) ? n2 : (-n2)) > n) {
            return false;
        }
        final double n3 = this.field13962 - class2304.field13962;
        if (((n3 >= 0.0) ? n3 : (-n3)) > n) {
            return false;
        }
        final double n4 = this.field13963 - class2304.field13963;
        if (((n4 >= 0.0) ? n4 : (-n4)) > n) {
            return false;
        }
        final double n5 = this.field13964 - class2304.field13964;
        if (((n5 >= 0.0) ? n5 : (-n5)) > n) {
            return false;
        }
        final double n6 = this.field13965 - class2304.field13965;
        if (((n6 >= 0.0) ? n6 : (-n6)) > n) {
            return false;
        }
        final double n7 = this.field13966 - class2304.field13966;
        if (((n7 >= 0.0) ? n7 : (-n7)) > n) {
            return false;
        }
        final double n8 = this.field13967 - class2304.field13967;
        if (((n8 >= 0.0) ? n8 : (-n8)) > n) {
            return false;
        }
        final double n9 = this.field13968 - class2304.field13968;
        if (((n9 >= 0.0) ? n9 : (-n9)) > n) {
            return false;
        }
        final double n10 = this.field13969 - class2304.field13969;
        if (((n10 >= 0.0) ? n10 : (-n10)) > n) {
            return false;
        }
        final double n11 = this.field13970 - class2304.field13970;
        if (((n11 >= 0.0) ? n11 : (-n11)) > n) {
            return false;
        }
        final double n12 = this.field13971 - class2304.field13971;
        if (((n12 >= 0.0) ? n12 : (-n12)) > n) {
            return false;
        }
        final double n13 = this.field13972 - class2304.field13972;
        if (((n13 >= 0.0) ? n13 : (-n13)) > n) {
            return false;
        }
        final double n14 = this.field13973 - class2304.field13973;
        if (((n14 >= 0.0) ? n14 : (-n14)) > n) {
            return false;
        }
        final double n15 = this.field13974 - class2304.field13974;
        if (((n15 >= 0.0) ? n15 : (-n15)) > n) {
            return false;
        }
        final double n16 = this.field13975 - class2304.field13975;
        if (((n16 >= 0.0) ? n16 : (-n16)) <= n) {
            final double n17 = this.field13976 - class2304.field13976;
            return ((n17 >= 0.0) ? n17 : (-n17)) <= n;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long n = 31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * (31L * 1L + Class9427.method35031(this.field13961)) + Class9427.method35031(this.field13962)) + Class9427.method35031(this.field13963)) + Class9427.method35031(this.field13964)) + Class9427.method35031(this.field13965)) + Class9427.method35031(this.field13966)) + Class9427.method35031(this.field13967)) + Class9427.method35031(this.field13968)) + Class9427.method35031(this.field13969)) + Class9427.method35031(this.field13970)) + Class9427.method35031(this.field13971)) + Class9427.method35031(this.field13972)) + Class9427.method35031(this.field13973)) + Class9427.method35031(this.field13974)) + Class9427.method35031(this.field13975)) + Class9427.method35031(this.field13976);
        return (int)(n ^ n >> 32);
    }
    
    public final void method9290(final Class7 class7, final Class7 class8) {
        final double field18 = this.field13961 * class7.field18 + this.field13962 * class7.field19 + this.field13963 * class7.field20 + this.field13964 * class7.field21;
        final double field19 = this.field13965 * class7.field18 + this.field13966 * class7.field19 + this.field13967 * class7.field20 + this.field13968 * class7.field21;
        final double field20 = this.field13969 * class7.field18 + this.field13970 * class7.field19 + this.field13971 * class7.field20 + this.field13972 * class7.field21;
        class8.field21 = this.field13973 * class7.field18 + this.field13974 * class7.field19 + this.field13975 * class7.field20 + this.field13976 * class7.field21;
        class8.field18 = field18;
        class8.field19 = field19;
        class8.field20 = field20;
    }
    
    public final void method9291(final Class7 class7) {
        final double field18 = this.field13961 * class7.field18 + this.field13962 * class7.field19 + this.field13963 * class7.field20 + this.field13964 * class7.field21;
        final double field19 = this.field13965 * class7.field18 + this.field13966 * class7.field19 + this.field13967 * class7.field20 + this.field13968 * class7.field21;
        final double field20 = this.field13969 * class7.field18 + this.field13970 * class7.field19 + this.field13971 * class7.field20 + this.field13972 * class7.field21;
        class7.field21 = this.field13973 * class7.field18 + this.field13974 * class7.field19 + this.field13975 * class7.field20 + this.field13976 * class7.field21;
        class7.field18 = field18;
        class7.field19 = field19;
        class7.field20 = field20;
    }
    
    public final void method9292(final Class2275 class2275, final Class2275 class2276) {
        final float field13863 = (float)(this.field13961 * class2275.field13863 + this.field13962 * class2275.field13864 + this.field13963 * class2275.field13865 + this.field13964 * class2275.field13866);
        final float field13864 = (float)(this.field13965 * class2275.field13863 + this.field13966 * class2275.field13864 + this.field13967 * class2275.field13865 + this.field13968 * class2275.field13866);
        final float field13865 = (float)(this.field13969 * class2275.field13863 + this.field13970 * class2275.field13864 + this.field13971 * class2275.field13865 + this.field13972 * class2275.field13866);
        class2276.field13866 = (float)(this.field13973 * class2275.field13863 + this.field13974 * class2275.field13864 + this.field13975 * class2275.field13865 + this.field13976 * class2275.field13866);
        class2276.field13863 = field13863;
        class2276.field13864 = field13864;
        class2276.field13865 = field13865;
    }
    
    public final void method9293(final Class2275 class2275) {
        final float field13863 = (float)(this.field13961 * class2275.field13863 + this.field13962 * class2275.field13864 + this.field13963 * class2275.field13865 + this.field13964 * class2275.field13866);
        final float field13864 = (float)(this.field13965 * class2275.field13863 + this.field13966 * class2275.field13864 + this.field13967 * class2275.field13865 + this.field13968 * class2275.field13866);
        final float field13865 = (float)(this.field13969 * class2275.field13863 + this.field13970 * class2275.field13864 + this.field13971 * class2275.field13865 + this.field13972 * class2275.field13866);
        class2275.field13866 = (float)(this.field13973 * class2275.field13863 + this.field13974 * class2275.field13864 + this.field13975 * class2275.field13865 + this.field13976 * class2275.field13866);
        class2275.field13863 = field13863;
        class2275.field13864 = field13864;
        class2275.field13865 = field13865;
    }
    
    public final void method9294(final Class2272 class2272, final Class2272 class2273) {
        final double field13839 = this.field13961 * class2272.field13839 + this.field13962 * class2272.field13840 + this.field13963 * class2272.field13841 + this.field13964;
        final double field13840 = this.field13965 * class2272.field13839 + this.field13966 * class2272.field13840 + this.field13967 * class2272.field13841 + this.field13968;
        class2273.field13841 = this.field13969 * class2272.field13839 + this.field13970 * class2272.field13840 + this.field13971 * class2272.field13841 + this.field13972;
        class2273.field13839 = field13839;
        class2273.field13840 = field13840;
    }
    
    public final void method9295(final Class2272 class2272) {
        final double field13839 = this.field13961 * class2272.field13839 + this.field13962 * class2272.field13840 + this.field13963 * class2272.field13841 + this.field13964;
        final double field13840 = this.field13965 * class2272.field13839 + this.field13966 * class2272.field13840 + this.field13967 * class2272.field13841 + this.field13968;
        class2272.field13841 = this.field13969 * class2272.field13839 + this.field13970 * class2272.field13840 + this.field13971 * class2272.field13841 + this.field13972;
        class2272.field13839 = field13839;
        class2272.field13840 = field13840;
    }
    
    public final void method9296(final Class2286 class2286, final Class2286 class2287) {
        final float field13909 = (float)(this.field13961 * class2286.field13909 + this.field13962 * class2286.field13910 + this.field13963 * class2286.field13911 + this.field13964);
        final float field13910 = (float)(this.field13965 * class2286.field13909 + this.field13966 * class2286.field13910 + this.field13967 * class2286.field13911 + this.field13968);
        class2287.field13911 = (float)(this.field13969 * class2286.field13909 + this.field13970 * class2286.field13910 + this.field13971 * class2286.field13911 + this.field13972);
        class2287.field13909 = field13909;
        class2287.field13910 = field13910;
    }
    
    public final void method9297(final Class2286 class2286) {
        final float field13909 = (float)(this.field13961 * class2286.field13909 + this.field13962 * class2286.field13910 + this.field13963 * class2286.field13911 + this.field13964);
        final float field13910 = (float)(this.field13965 * class2286.field13909 + this.field13966 * class2286.field13910 + this.field13967 * class2286.field13911 + this.field13968);
        class2286.field13911 = (float)(this.field13969 * class2286.field13909 + this.field13970 * class2286.field13910 + this.field13971 * class2286.field13911 + this.field13972);
        class2286.field13909 = field13909;
        class2286.field13910 = field13910;
    }
    
    public final void method9298(final Class2273 class2273, final Class2273 class2274) {
        final double field13839 = this.field13961 * class2273.field13839 + this.field13962 * class2273.field13840 + this.field13963 * class2273.field13841;
        final double field13840 = this.field13965 * class2273.field13839 + this.field13966 * class2273.field13840 + this.field13967 * class2273.field13841;
        class2274.field13841 = this.field13969 * class2273.field13839 + this.field13970 * class2273.field13840 + this.field13971 * class2273.field13841;
        class2274.field13839 = field13839;
        class2274.field13840 = field13840;
    }
    
    public final void method9299(final Class2273 class2273) {
        final double field13839 = this.field13961 * class2273.field13839 + this.field13962 * class2273.field13840 + this.field13963 * class2273.field13841;
        final double field13840 = this.field13965 * class2273.field13839 + this.field13966 * class2273.field13840 + this.field13967 * class2273.field13841;
        class2273.field13841 = this.field13969 * class2273.field13839 + this.field13970 * class2273.field13840 + this.field13971 * class2273.field13841;
        class2273.field13839 = field13839;
        class2273.field13840 = field13840;
    }
    
    public final void method9300(final Class2288 class2288, final Class2288 class2289) {
        final float field13909 = (float)(this.field13961 * class2288.field13909 + this.field13962 * class2288.field13910 + this.field13963 * class2288.field13911);
        final float field13910 = (float)(this.field13965 * class2288.field13909 + this.field13966 * class2288.field13910 + this.field13967 * class2288.field13911);
        class2289.field13911 = (float)(this.field13969 * class2288.field13909 + this.field13970 * class2288.field13910 + this.field13971 * class2288.field13911);
        class2289.field13909 = field13909;
        class2289.field13910 = field13910;
    }
    
    public final void method9301(final Class2288 class2288) {
        final float field13909 = (float)(this.field13961 * class2288.field13909 + this.field13962 * class2288.field13910 + this.field13963 * class2288.field13911);
        final float field13910 = (float)(this.field13965 * class2288.field13909 + this.field13966 * class2288.field13910 + this.field13967 * class2288.field13911);
        class2288.field13911 = (float)(this.field13969 * class2288.field13909 + this.field13970 * class2288.field13910 + this.field13971 * class2288.field13911);
        class2288.field13909 = field13909;
        class2288.field13910 = field13910;
    }
    
    public final void method9302(final Class2274 class2274) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method9310(array2, array);
        this.field13961 = class2274.field13845 * array2[0];
        this.field13962 = class2274.field13846 * array2[1];
        this.field13963 = class2274.field13847 * array2[2];
        this.field13965 = class2274.field13848 * array2[0];
        this.field13966 = class2274.field13849 * array2[1];
        this.field13967 = class2274.field13850 * array2[2];
        this.field13969 = class2274.field13851 * array2[0];
        this.field13970 = class2274.field13852 * array2[1];
        this.field13971 = class2274.field13853 * array2[2];
    }
    
    public final void method9303(final Class2296 class2296) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method9310(array2, array);
        this.field13961 = class2296.field13935 * array2[0];
        this.field13962 = class2296.field13936 * array2[1];
        this.field13963 = class2296.field13937 * array2[2];
        this.field13965 = class2296.field13938 * array2[0];
        this.field13966 = class2296.field13939 * array2[1];
        this.field13967 = class2296.field13940 * array2[2];
        this.field13969 = class2296.field13941 * array2[0];
        this.field13970 = class2296.field13942 * array2[1];
        this.field13971 = class2296.field13943 * array2[2];
    }
    
    public final void method9304(final Class2278 class2278) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method9310(array2, array);
        this.field13961 = (1.0 - 2.0f * class2278.field13864 * class2278.field13864 - 2.0f * class2278.field13865 * class2278.field13865) * array2[0];
        this.field13965 = 2.0 * (class2278.field13863 * class2278.field13864 + class2278.field13866 * class2278.field13865) * array2[0];
        this.field13969 = 2.0 * (class2278.field13863 * class2278.field13865 - class2278.field13866 * class2278.field13864) * array2[0];
        this.field13962 = 2.0 * (class2278.field13863 * class2278.field13864 - class2278.field13866 * class2278.field13865) * array2[1];
        this.field13966 = (1.0 - 2.0f * class2278.field13863 * class2278.field13863 - 2.0f * class2278.field13865 * class2278.field13865) * array2[1];
        this.field13970 = 2.0 * (class2278.field13864 * class2278.field13865 + class2278.field13866 * class2278.field13863) * array2[1];
        this.field13963 = 2.0 * (class2278.field13863 * class2278.field13865 + class2278.field13866 * class2278.field13864) * array2[2];
        this.field13967 = 2.0 * (class2278.field13864 * class2278.field13865 - class2278.field13866 * class2278.field13863) * array2[2];
        this.field13971 = (1.0 - 2.0f * class2278.field13863 * class2278.field13863 - 2.0f * class2278.field13864 * class2278.field13864) * array2[2];
    }
    
    public final void method9305(final Class8 class8) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method9310(array2, array);
        this.field13961 = (1.0 - 2.0 * class8.field19 * class8.field19 - 2.0 * class8.field20 * class8.field20) * array2[0];
        this.field13965 = 2.0 * (class8.field18 * class8.field19 + class8.field21 * class8.field20) * array2[0];
        this.field13969 = 2.0 * (class8.field18 * class8.field20 - class8.field21 * class8.field19) * array2[0];
        this.field13962 = 2.0 * (class8.field18 * class8.field19 - class8.field21 * class8.field20) * array2[1];
        this.field13966 = (1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field20 * class8.field20) * array2[1];
        this.field13970 = 2.0 * (class8.field19 * class8.field20 + class8.field21 * class8.field18) * array2[1];
        this.field13963 = 2.0 * (class8.field18 * class8.field20 + class8.field21 * class8.field19) * array2[2];
        this.field13967 = 2.0 * (class8.field19 * class8.field20 - class8.field21 * class8.field18) * array2[2];
        this.field13971 = (1.0 - 2.0 * class8.field18 * class8.field18 - 2.0 * class8.field19 * class8.field19) * array2[2];
    }
    
    public final void method9306(final Class24 class24) {
        final double[] array = new double[9];
        final double[] array2 = new double[3];
        this.method9310(array2, array);
        final double n = 1.0 / Math.sqrt(class24.field67 * class24.field67 + class24.field68 * class24.field68 + class24.field69 * class24.field69);
        final double n2 = class24.field67 * n;
        final double n3 = class24.field68 * n;
        final double n4 = class24.field69 * n;
        final double sin = Math.sin(class24.field70);
        final double cos = Math.cos(class24.field70);
        final double n5 = 1.0 - cos;
        final double n6 = class24.field67 * class24.field69;
        final double n7 = class24.field67 * class24.field68;
        final double n8 = class24.field68 * class24.field69;
        this.field13961 = (n5 * n2 * n2 + cos) * array2[0];
        this.field13962 = (n5 * n7 - sin * n4) * array2[1];
        this.field13963 = (n5 * n6 + sin * n3) * array2[2];
        this.field13965 = (n5 * n7 + sin * n4) * array2[0];
        this.field13966 = (n5 * n3 * n3 + cos) * array2[1];
        this.field13967 = (n5 * n8 - sin * n2) * array2[2];
        this.field13969 = (n5 * n6 - sin * n3) * array2[0];
        this.field13970 = (n5 * n8 + sin * n2) * array2[1];
        this.field13971 = (n5 * n4 * n4 + cos) * array2[2];
    }
    
    public final void method9307() {
        this.field13961 = 0.0;
        this.field13962 = 0.0;
        this.field13963 = 0.0;
        this.field13964 = 0.0;
        this.field13965 = 0.0;
        this.field13966 = 0.0;
        this.field13967 = 0.0;
        this.field13968 = 0.0;
        this.field13969 = 0.0;
        this.field13970 = 0.0;
        this.field13971 = 0.0;
        this.field13972 = 0.0;
        this.field13973 = 0.0;
        this.field13974 = 0.0;
        this.field13975 = 0.0;
        this.field13976 = 0.0;
    }
    
    public final void method9308() {
        this.field13961 = -this.field13961;
        this.field13962 = -this.field13962;
        this.field13963 = -this.field13963;
        this.field13964 = -this.field13964;
        this.field13965 = -this.field13965;
        this.field13966 = -this.field13966;
        this.field13967 = -this.field13967;
        this.field13968 = -this.field13968;
        this.field13969 = -this.field13969;
        this.field13970 = -this.field13970;
        this.field13971 = -this.field13971;
        this.field13972 = -this.field13972;
        this.field13973 = -this.field13973;
        this.field13974 = -this.field13974;
        this.field13975 = -this.field13975;
        this.field13976 = -this.field13976;
    }
    
    public final void method9309(final Class2304 class2304) {
        this.field13961 = -class2304.field13961;
        this.field13962 = -class2304.field13962;
        this.field13963 = -class2304.field13963;
        this.field13964 = -class2304.field13964;
        this.field13965 = -class2304.field13965;
        this.field13966 = -class2304.field13966;
        this.field13967 = -class2304.field13967;
        this.field13968 = -class2304.field13968;
        this.field13969 = -class2304.field13969;
        this.field13970 = -class2304.field13970;
        this.field13971 = -class2304.field13971;
        this.field13972 = -class2304.field13972;
        this.field13973 = -class2304.field13973;
        this.field13974 = -class2304.field13974;
        this.field13975 = -class2304.field13975;
        this.field13976 = -class2304.field13976;
    }
    
    private final void method9310(final double[] array, final double[] array2) {
        Class2274.method8623(new double[] { this.field13961, this.field13962, this.field13963, this.field13965, this.field13966, this.field13967, this.field13969, this.field13970, this.field13971 }, array, array2);
    }
    
    public Object clone() {
        Class2304 class2304;
        try {
            class2304 = (Class2304)super.clone();
        }
        catch (final CloneNotSupportedException ex) {
            throw new InternalError();
        }
        return class2304;
    }
    
    public final double method9311() {
        return this.field13961;
    }
    
    public final void method9312(final double field13961) {
        this.field13961 = field13961;
    }
    
    public final double method9313() {
        return this.field13962;
    }
    
    public final void method9314(final double field13962) {
        this.field13962 = field13962;
    }
    
    public final double method9315() {
        return this.field13963;
    }
    
    public final void method9316(final double field13963) {
        this.field13963 = field13963;
    }
    
    public final double method9317() {
        return this.field13965;
    }
    
    public final void method9318(final double field13965) {
        this.field13965 = field13965;
    }
    
    public final double method9319() {
        return this.field13966;
    }
    
    public final void method9320(final double field13966) {
        this.field13966 = field13966;
    }
    
    public final double method9321() {
        return this.field13967;
    }
    
    public final void method9322(final double field13967) {
        this.field13967 = field13967;
    }
    
    public final double method9323() {
        return this.field13969;
    }
    
    public final void method9324(final double field13969) {
        this.field13969 = field13969;
    }
    
    public final double method9325() {
        return this.field13970;
    }
    
    public final void method9326(final double field13970) {
        this.field13970 = field13970;
    }
    
    public final double method9327() {
        return this.field13971;
    }
    
    public final void method9328(final double field13971) {
        this.field13971 = field13971;
    }
    
    public final double method9329() {
        return this.field13964;
    }
    
    public final void method9330(final double field13964) {
        this.field13964 = field13964;
    }
    
    public final double method9331() {
        return this.field13968;
    }
    
    public final void method9332(final double field13968) {
        this.field13968 = field13968;
    }
    
    public final double method9333() {
        return this.field13972;
    }
    
    public final void method9334(final double field13972) {
        this.field13972 = field13972;
    }
    
    public final double method9335() {
        return this.field13973;
    }
    
    public final void method9336(final double field13973) {
        this.field13973 = field13973;
    }
    
    public final double method9337() {
        return this.field13974;
    }
    
    public final void method9338(final double field13974) {
        this.field13974 = field13974;
    }
    
    public final double method9339() {
        return this.field13975;
    }
    
    public final void method9340(final double field13975) {
        this.field13975 = field13975;
    }
    
    public final double method9341() {
        return this.field13976;
    }
    
    public final void method9342(final double field13976) {
        this.field13976 = field13976;
    }
}
