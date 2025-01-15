// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class9499
{
    private static String[] field40870;
    private static final int field40871;
    private static final int field40872;
    private static final int field40873;
    public static final int field40874 = 64;
    private static final Byte[] field40875;
    
    public static void method35368(final Class5207 class5207) {
        class5207.method16316(Class2044.field11648, 8, 8, new Class2824());
        class5207.method16316(Class2044.field11648, 9, 9, new Class2827());
        class5207.method16316(Class2044.field11648, 10, 10, new Class2791());
        class5207.method16316(Class2044.field11648, 11, 11, new Class3070());
        class5207.method16316(Class2044.field11648, 13, 13, new Class2849());
        class5207.method16316(Class2044.field11648, 15, 15, new Class2860());
        class5207.method16316(Class2044.field11648, 30, 28, new Class2811());
        class5207.method16316(Class2044.field11648, 34, 33, new Class3021());
        class5207.method16316(Class2044.field11648, 35, 34, new Class3080());
        class5207.method16316(Class2044.field11648, 36, 35, new Class2958());
        class5207.method16316(Class2044.field11648, 37, 37, new Class2925(class5207));
        class5207.method16316(Class2044.field11648, 38, 38, new Class2793());
        class5207.method16316(Class2044.field11648, 56, 58, new Class2962(class5207));
        class5207.method16316(Class2044.field11648, 73, 77, new Class2955());
    }
    
    private static long[] method35369(final int[] array) {
        final long n = 511L;
        final long[] array2 = new long[(int)Math.ceil(array.length * 9 / 64.0)];
        for (int i = 0; i < array.length; ++i) {
            final int n2 = array[i];
            final int n3 = i * 9;
            final int n4 = n3 / 64;
            final int n5 = ((i + 1) * 9 - 1) / 64;
            final int n6 = n3 % 64;
            array2[n4] = ((array2[n4] & ~(n << n6)) | ((long)n2 & n) << n6);
            if (n4 != n5) {
                final int n7 = 64 - n6;
                array2[n5] = (array2[n5] >>> n7 << n7 | ((long)n2 & n) >> n7);
            }
        }
        return array2;
    }
    
    private static void method35370(final Class6562 class6562, final Class7668 class6563, int n, final int n2, final int n3, final int n4) {
        int n5 = 0;
        int n6 = 0;
        for (final Class222 class6564 : Class222.values()) {
            Class8110 class6565 = class6563.method24339();
            Class8110 class6566 = class6563.method24337();
            final int n7 = n2 + class6564.method852();
            int n8 = n3 + class6564.method853();
            final int n9 = n4 + class6564.method854();
            Label_0120: {
                if (class6564.method852() == 0) {
                    if (class6564.method853() == 0) {
                        if (class6564.method854() != 0) {
                            if (n9 == 16) {
                                break Label_0120;
                            }
                            if (n9 == -1) {
                                break Label_0120;
                            }
                        }
                    }
                    else if (n8 == 16 || n8 == -1) {
                        if (n8 != 16) {
                            --n;
                            n8 = 15;
                        }
                        else {
                            ++n;
                            n8 = 0;
                        }
                        if (n == 16) {
                            break Label_0120;
                        }
                        if (n == -1) {
                            break Label_0120;
                        }
                        final Class7668 class6567 = class6562.method19889()[n];
                        if (class6567 == null) {
                            break Label_0120;
                        }
                        class6565 = class6567.method24339();
                        class6566 = class6567.method24337();
                    }
                }
                else {
                    if (n7 == 16) {
                        break Label_0120;
                    }
                    if (n7 == -1) {
                        break Label_0120;
                    }
                }
                if (class6566 != null) {
                    if (n6 != 15) {
                        final byte method26654 = class6566.method26654(n7, n8, n9);
                        if (method26654 != 15) {
                            if (method26654 > n6) {
                                n6 = method26654 - 1;
                            }
                        }
                        else {
                            n6 = 14;
                        }
                    }
                }
                if (class6565 != null) {
                    if (n5 != 15) {
                        final byte method26655 = class6565.method26654(n7, n8, n9);
                        if (method26655 != 15) {
                            if (method26655 > n5) {
                                n5 = method26655 - 1;
                            }
                        }
                        else if (class6564.method853() != 1) {
                            n5 = 14;
                        }
                        else {
                            n5 = 15;
                        }
                    }
                }
            }
        }
        if (n5 != 0) {
            if (!class6563.method24345()) {
                class6563.method24335(new byte[2028]);
            }
            class6563.method24339().method26656(n2, n3, n4, n5);
        }
        if (n6 != 0) {
            class6563.method24337().method26656(n2, n3, n4, n6);
        }
    }
    
    private static long method35371(final int n, final int n2) {
        return ((long)n & 0x3FFFFFFL) << 38 | ((long)n2 & 0x3FFFFFFL);
    }
    
    static {
        field40871 = Class7504.field29089.method20533(0);
        field40872 = Class7504.field29089.method20533(8591);
        field40873 = Class7504.field29089.method20533(8592);
        Arrays.fill(field40875 = new Byte[2048], -1);
    }
}
