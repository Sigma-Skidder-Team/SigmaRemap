// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class4184 implements Class4178
{
    private static final int field18701 = 6;
    private static final int field18702 = 22;
    private static final int field18703 = 32;
    private static final int field18704 = 16;
    private static final int field18705 = 31;
    private static final int[] field18706;
    private static final int[] field18707;
    private static final int[] field18708;
    private static final int[] field18709;
    private static final int[] field18710;
    
    private static int method12567(int n, final int n2) {
        n = ((n >> Class4184.field18709[0] & Class4184.field18710[0]) | (n << Class4184.field18709[0] & ~Class4184.field18710[0]));
        n = ((n >> Class4184.field18709[1] & Class4184.field18710[1]) | (n << Class4184.field18709[1] & ~Class4184.field18710[1]));
        n = ((n >> Class4184.field18709[2] & Class4184.field18710[2]) | (n << Class4184.field18709[2] & ~Class4184.field18710[2]));
        n = ((n >> Class4184.field18709[3] & Class4184.field18710[3]) | (n << Class4184.field18709[3] & ~Class4184.field18710[3]));
        n = ((n >> Class4184.field18709[4] & Class4184.field18710[4]) | (n << Class4184.field18709[4] & ~Class4184.field18710[4]));
        n >>= 32 - n2;
        return n;
    }
    
    public static int[] method12568(int n, int n2, final int n3) {
        final int[] array = new int[2];
        if (n3 > 32) {
            n2 = ((n2 >> Class4184.field18709[0] & Class4184.field18710[0]) | (n2 << Class4184.field18709[0] & ~Class4184.field18710[0]));
            n = ((n >> Class4184.field18709[0] & Class4184.field18710[0]) | (n << Class4184.field18709[0] & ~Class4184.field18710[0]));
            n2 = ((n2 >> Class4184.field18709[1] & Class4184.field18710[1]) | (n2 << Class4184.field18709[1] & ~Class4184.field18710[1]));
            n = ((n >> Class4184.field18709[1] & Class4184.field18710[1]) | (n << Class4184.field18709[1] & ~Class4184.field18710[1]));
            n2 = ((n2 >> Class4184.field18709[2] & Class4184.field18710[2]) | (n2 << Class4184.field18709[2] & ~Class4184.field18710[2]));
            n = ((n >> Class4184.field18709[2] & Class4184.field18710[2]) | (n << Class4184.field18709[2] & ~Class4184.field18710[2]));
            n2 = ((n2 >> Class4184.field18709[3] & Class4184.field18710[3]) | (n2 << Class4184.field18709[3] & ~Class4184.field18710[3]));
            n = ((n >> Class4184.field18709[3] & Class4184.field18710[3]) | (n << Class4184.field18709[3] & ~Class4184.field18710[3]));
            n2 = ((n2 >> Class4184.field18709[4] & Class4184.field18710[4]) | (n2 << Class4184.field18709[4] & ~Class4184.field18710[4]));
            n = ((n >> Class4184.field18709[4] & Class4184.field18710[4]) | (n << Class4184.field18709[4] & ~Class4184.field18710[4]));
            array[1] = (n >> 64 - n3 | n2 << n3 - 32);
            array[1] = n2 >> 64 - n3;
        }
        else {
            array[0] = 0;
            array[1] = method12567(n2, n3);
        }
        return array;
    }
    
    private static boolean method12569(final int n, final int n2) {
        boolean b = false;
        Label_0023: {
            if (n2 > 0 && n2 <= 11) {
                break Label_0023;
            }
            if (n2 >= 16) {
                if (n2 <= 31) {
                    break Label_0023;
                }
            }
            return b;
        }
        if (n >= 11) {
            b = (n2 == n);
            return b;
        }
        b = (n2 == n || n2 == n + 1);
        return b;
    }
    
    public static void method12570(final Class4192 class4192, final Class8157 class4193, final short[] array, final boolean b) throws AACException {
        final Class4182 method12588 = class4192.method12588();
        final int method12589 = method12588.method12554();
        final int method12590 = method12588.method12549();
        final int[] method12591 = method12588.method12551();
        final int method12592 = method12588.method12552();
        final int[][] array2 = null;
        final int[][] array3 = null;
        final Object o = null;
        final int[][] array4 = null;
        final int[][] array5 = null;
        final int method12593 = class4192.method12597();
        if (method12593 == 0) {
            return;
        }
        final int method12594 = class4192.method12596();
        if (method12594 == 0 || method12594 >= method12593) {
            throw new Class2348("length of longest HCR codeword out of range");
        }
        final int[] array6 = new int[8];
        final int n = array.length / 8;
        array6[0] = 0;
        for (int i = 1; i < method12589; ++i) {
            array6[i] = array6[i - 1] + n * method12588.method12555(i - 1);
        }
        final Class9552[] array7 = new Class9552[512];
        final Class7129[] array8 = new Class7129[512];
        int[] array9;
        if (!b) {
            array9 = Class4184.field18706;
            final int n2 = 6;
        }
        else {
            array9 = Class4184.field18707;
            final int n2 = 22;
        }
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (final int n7 : array9) {
            for (int k = 0; k < method12590; ++k) {
                for (int n8 = 0; 4 * n8 < Math.min(method12591[k + 1], method12592) - method12591[k]; ++n8) {
                    for (int l = 0; l < method12589; ++l) {
                        for (int n9 = 0; n9 < o[l]; ++n9) {
                            if (array2[l][n9] <= k) {
                                if (array3[l][n9] > k) {
                                    final int n10 = array4[l][n9];
                                    if (method12569(n7, n10)) {
                                        final int n11 = array5[l][k + 1] - array5[l][k];
                                        final int n12 = (n10 >= 5) ? 2 : 4;
                                        final int n13 = 4 * method12588.method12555(l) / n12;
                                        final int min = Math.min(Class4184.field18708[n10], method12594);
                                        for (int n14 = 0; n14 < n13; ++n14) {
                                            if (n14 + n8 * n13 >= n11) {
                                                break;
                                            }
                                            final int n15 = array6[l] + array5[l][k] + n12 * (n14 + n8 * n13);
                                            if (n3 != 0) {
                                                Class9552.method35737(array7[n5 - n4], n15, n10);
                                            }
                                            else if (n6 + min > method12593) {
                                                if (n6 < method12593) {
                                                    final int n16 = method12593 - n6;
                                                    array8[n4].method21880(n16, class4193);
                                                    final Class7129 class4194 = array8[n4];
                                                    class4194.field27781 += array8[n4 - 1].field27781;
                                                    array8[n4].method21878();
                                                    if (array8[n4 - 1].field27781 <= 32) {
                                                        array8[n4 - 1].field27779 = array8[n4].field27779 + array8[n4 - 1].method21874(array8[n4 - 1].field27781);
                                                        array8[n4 - 1].field27780 = array8[n4].field27780;
                                                    }
                                                    else {
                                                        array8[n4 - 1].field27780 = array8[n4].field27780 + array8[n4 - 1].method21874(array8[n4 - 1].field27781 - 32);
                                                        array8[n4 - 1].field27779 = array8[n4].field27779 + array8[n4 - 1].method21874(32);
                                                    }
                                                    final Class7129 class4195 = array8[n4 - 1];
                                                    class4195.field27781 += n16;
                                                }
                                                n6 = method12593;
                                                n3 = 1;
                                                Class9552.method35737(array7[0], n15, n10);
                                            }
                                            else {
                                                array8[n4].method21880(min, class4193);
                                                n6 += min;
                                                array8[n4].method21878();
                                                ++n4;
                                            }
                                            ++n5;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (n4 != 0) {
            for (int n17 = n5 / n4, n18 = 1; n18 <= n17; ++n18) {
                for (int n19 = 0; n19 < n4; ++n19) {
                    for (int n20 = 0; n20 < n4; ++n20) {
                        final int n21 = (n19 + n20) % n4;
                        final int n22 = n20 + n18 * n4 - n4;
                        if (n22 >= n5 - n4) {
                            break;
                        }
                        if (array7[n22].field41136 == 0) {
                            if (array8[n21].field27781 > 0) {
                                if (array7[n22].field41138.field27781 != 0) {
                                    array8[n21].method21879(array7[n22].field41138);
                                }
                                final int field27781 = array8[n21].field27781;
                            }
                        }
                    }
                }
                for (int n23 = 0; n23 < n4; ++n23) {
                    array8[n23].method21878();
                }
            }
            return;
        }
        throw new Class2348("no segments in HCR");
    }
    
    static {
        field18706 = new int[] { 11, 9, 7, 5, 3, 1 };
        field18707 = new int[] { 11, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 9, 7, 5, 3, 1 };
        field18708 = new int[] { 0, 11, 9, 20, 16, 13, 11, 14, 12, 17, 14, 49, 0, 0, 0, 0, 14, 17, 21, 21, 25, 25, 29, 29, 29, 29, 33, 33, 33, 37, 37, 41 };
        field18709 = new int[] { 1, 2, 4, 8, 16 };
        field18710 = new int[] { 1431655765, 858993459, 252645135, 16711935, 65535 };
    }
}
