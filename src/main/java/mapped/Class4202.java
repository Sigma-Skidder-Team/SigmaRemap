// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class4202 implements Class4198
{
    private static String[] field18927;
    private static final int[] field18928;
    private static final int[][] field18929;
    private static final float[] field18930;
    
    public static int method12639(final int n, final int n2, final Class2077 class2077) {
        final int n3 = Class4202.field18894[class2077.method8182()];
        final int n4 = Class4202.field18895[class2077.method8182()];
        if (n2 == 0) {
            return n3 + Class4202.field18896[6][n];
        }
        return n3 + Class4202.field18896[n4][n];
    }
    
    public static int method12640(final int a, final Class2077 class2077, final int n) {
        if (a == 15) {
            return Math.min(64, n * 3);
        }
        if (a != 14) {
            return Math.min(64, Class4202.field18928[class2077.method8182()] + Class4202.field18929[class2077.method8182()][Math.min(a, 13)]);
        }
        return Math.min(64, n * 2);
    }
    
    public static int method12641(final Class4197 class4197, final int n, final int n2, final boolean b) {
        final int[] array = new int[64];
        if (n2 <= n) {
            class4197.field18790 = 0;
            return 1;
        }
        final int n3 = b ? 2 : 1;
        int a;
        if (!b) {
            a = n2 - n >> 1 << 1;
        }
        else {
            a = n2 - n + 2 >> 2 << 1;
        }
        final int min = Math.min(a, 63);
        if (min > 0) {
            int i = n2 - (n + min * n3);
            for (int j = 0; j < min; ++j) {
                array[j] = n3;
            }
            if (i != 0) {
                final int n4 = (i <= 0) ? 1 : -1;
                int n5 = (i <= 0) ? 0 : (min - 1);
                while (i != 0) {
                    final int[] array2 = array;
                    final int n6 = n5;
                    array2[n6] -= n4;
                    n5 += n4;
                    i += n4;
                }
            }
            class4197.field18796[0] = n;
            for (int k = 1; k <= min; ++k) {
                class4197.field18796[k] = class4197.field18796[k - 1] + array[k - 1];
            }
            class4197.field18790 = min;
            class4197.field18790 = Math.min(class4197.field18790, 64);
            return 0;
        }
        return 1;
    }
    
    public static int method12642(final int n, final int n2, final int n3, final int n4) {
        float n5 = (float)Math.log(2.0);
        if (n != 0) {
            n5 *= 1.3f;
        }
        return (int)(n2 * Math.log(n4 / (float)n3) / n5 + 0.5);
    }
    
    public static float method12643(final int n, final int n2, final int n3) {
        return (float)Math.pow(n3 / (float)n2, 1.0f / n);
    }
    
    public static int method12644(final Class4197 class4197, final int n, final int n2, final int n3, final boolean b) {
        final int[] a = new int[64];
        final int[] array = new int[64];
        final int[] array2 = new int[64];
        final int[] array3 = new int[64];
        final int[] array4 = { 6, 5, 4 };
        if (n2 <= n) {
            class4197.field18790 = 0;
            return 1;
        }
        final int n4 = array4[n3 - 1];
        boolean b2;
        int n5;
        if (n2 / (float)n <= 2.2449) {
            b2 = false;
            n5 = n2;
        }
        else {
            b2 = true;
            n5 = n << 1;
        }
        final int min = Math.min(2 * method12642(0, n4, n, n5), 63);
        if (min <= 0) {
            return 1;
        }
        final float method12643 = method12643(min, n, n5);
        float n6 = (float)n;
        int n7 = (int)(n6 + 0.5f);
        for (int i = 0; i <= min; ++i) {
            final int n8 = n7;
            n6 *= method12643;
            n7 = (int)(n6 + 0.5f);
            a[i] = n7 - n8;
        }
        Arrays.sort(a, 0, min);
        array2[0] = n;
        for (int j = 1; j <= min; ++j) {
            array2[j] = array2[j - 1] + a[j - 1];
            if (a[j - 1] == 0) {
                return 1;
            }
        }
        if (b2) {
            final int min2 = Math.min(2 * method12642(1, n4, n5, n2), 63);
            final float method12644 = method12643(min2, n5, n2);
            float n9 = (float)n5;
            int n10 = (int)(n9 + 0.5f);
            for (int k = 0; k <= min2 - 1; ++k) {
                final int n11 = n10;
                n9 *= method12644;
                n10 = (int)(n9 + 0.5f);
                array[k] = n10 - n11;
            }
            if (array[0] < a[min - 1]) {
                Arrays.sort(array, 0, min2 + 1);
                final int n12 = a[min - 1] - array[0];
                array[0] = a[min - 1];
                array[min2 - 1] -= n12;
            }
            Arrays.sort(array, 0, min2);
            array3[0] = n5;
            for (int l = 1; l <= min2; ++l) {
                array3[l] = array3[l - 1] + array[l - 1];
                if (array[l - 1] == 0) {
                    return 1;
                }
            }
            class4197.field18790 = min + min2;
            class4197.field18790 = Math.min(class4197.field18790, 64);
            for (int n13 = 0; n13 <= min; ++n13) {
                class4197.field18796[n13] = array2[n13];
            }
            for (int n14 = min + 1; n14 <= class4197.field18790; ++n14) {
                class4197.field18796[n14] = array3[n14 - min];
            }
            return 0;
        }
        for (int n15 = 0; n15 <= min; ++n15) {
            class4197.field18796[n15] = array2[n15];
        }
        class4197.field18790 = min;
        class4197.field18790 = Math.min(class4197.field18790, 64);
        return 0;
    }
    
    public static int method12645(final Class4197 class4197, final int n, final int n2) {
        int n3 = 0;
        if (class4197.field18790 <= n) {
            return 1;
        }
        class4197.field18791 = class4197.field18790 - n;
        class4197.field18792 = (class4197.field18791 >> 1) + (class4197.field18791 - (class4197.field18791 >> 1 << 1));
        class4197.field18795[0] = class4197.field18792;
        class4197.field18795[1] = class4197.field18791;
        for (int i = 0; i <= class4197.field18791; ++i) {
            class4197.field18797[1][i] = class4197.field18796[i + n];
        }
        class4197.field18789 = class4197.field18797[1][class4197.field18791] - class4197.field18797[1][0];
        class4197.field18788 = class4197.field18797[1][0];
        if (class4197.field18788 > 32) {
            return 1;
        }
        if (class4197.field18788 + class4197.field18789 <= 64) {
            final int n4 = ((class4197.field18791 & 0x1) != 0x0) ? 1 : 0;
            for (int j = 0; j <= class4197.field18792; ++j) {
                if (j != 0) {
                    n3 = 2 * j - n4;
                }
                else {
                    n3 = 0;
                }
                class4197.field18797[0][j] = class4197.field18797[1][n3];
            }
            class4197.field18793 = 0;
            if (class4197.field18871 != 0) {
                class4197.field18793 = Math.max(1, method12642(0, class4197.field18871, class4197.field18788, n2));
                class4197.field18793 = Math.min(5, class4197.field18793);
            }
            else {
                class4197.field18793 = 1;
            }
            for (int k = 0; k <= class4197.field18793; ++k) {
                if (k != 0) {
                    n3 += (class4197.field18792 - n3) / (class4197.field18793 + 1 - k);
                }
                else {
                    n3 = 0;
                }
                class4197.field18798[k] = class4197.field18797[0][n3];
            }
            for (int l = 0; l < 64; ++l) {
                for (int n5 = 0; n5 < class4197.field18793; ++n5) {
                    if (class4197.field18798[n5] <= l && l < class4197.field18798[n5 + 1]) {
                        class4197.field18800[l] = n5;
                        break;
                    }
                }
            }
            return 0;
        }
        return 1;
    }
    
    public static void method12646(final Class4197 class4197) {
        class4197.field18799[0][0] = class4197.field18797[0][0] - class4197.field18788;
        class4197.field18799[0][1] = class4197.field18797[0][class4197.field18792] - class4197.field18788;
        class4197.field18794[0] = 1;
        for (int i = 1; i < 4; ++i) {
            final int[] a = new int[100];
            final int[] array = new int[64];
            array[0] = class4197.field18788;
            for (int j = 1; j <= class4197.field18829; ++j) {
                array[j] = array[j - 1] + class4197.field18830[j - 1];
            }
            for (int k = 0; k <= class4197.field18792; ++k) {
                a[k] = class4197.field18797[0][k];
            }
            for (int l = 1; l < class4197.field18829; ++l) {
                a[l + class4197.field18792] = array[l];
            }
            Arrays.sort(a, 0, class4197.field18829 + class4197.field18792);
            int n = 1;
            int toIndex = class4197.field18829 + class4197.field18792 - 1;
            if (toIndex < 0) {
                return;
            }
            while (n <= toIndex) {
                float n2;
                if (a[n - 1] == 0) {
                    n2 = 0.0f;
                }
                else {
                    n2 = a[n] / (float)a[n - 1];
                }
                if (n2 >= Class4202.field18930[i - 1]) {
                    ++n;
                }
                else {
                    if (a[n] != a[n - 1]) {
                        int n3 = 0;
                        for (int n4 = 0; n4 <= class4197.field18829; ++n4) {
                            if (a[n] == array[n4]) {
                                n3 = 1;
                            }
                        }
                        if (n3 != 0) {
                            int n5 = 0;
                            for (int n6 = 0; n6 <= class4197.field18829; ++n6) {
                                if (a[n - 1] == array[n6]) {
                                    n5 = 1;
                                }
                            }
                            if (n5 == 0) {
                                a[n - 1] = class4197.field18797[0][class4197.field18792];
                                Arrays.sort(a, 0, class4197.field18829 + class4197.field18792);
                                --toIndex;
                                continue;
                            }
                            ++n;
                            continue;
                        }
                    }
                    a[n] = class4197.field18797[0][class4197.field18792];
                    Arrays.sort(a, 0, toIndex);
                    --toIndex;
                }
            }
            class4197.field18794[i] = toIndex;
            for (int n7 = 0; n7 <= toIndex; ++n7) {
                class4197.field18799[i][n7] = a[n7] - class4197.field18788;
            }
        }
    }
    
    static {
        field18928 = new int[] { 13, 15, 20, 21, 23, 32, 32, 35, 48, 64, 70, 96 };
        field18929 = new int[][] { { 0, 2, 4, 6, 8, 11, 14, 18, 22, 26, 31, 37, 44, 51 }, { 0, 2, 4, 6, 8, 11, 14, 18, 22, 26, 31, 36, 42, 49 }, { 0, 2, 4, 6, 8, 11, 14, 17, 21, 25, 29, 34, 39, 44 }, { 0, 2, 4, 6, 8, 11, 14, 17, 20, 24, 28, 33, 38, 43 }, { 0, 2, 4, 6, 8, 11, 14, 17, 20, 24, 28, 32, 36, 41 }, { 0, 2, 4, 6, 8, 10, 12, 14, 17, 20, 23, 26, 29, 32 }, { 0, 2, 4, 6, 8, 10, 12, 14, 17, 20, 23, 26, 29, 32 }, { 0, 1, 3, 5, 7, 9, 11, 13, 15, 17, 20, 23, 26, 29 }, { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, -1, -2, -3, -4, -5, -6, -6, -6, -6, -6, -6, -6, -6 }, { 0, -3, -6, -9, -12, -15, -18, -20, -22, -24, -26, -28, -30, -32 } };
        field18930 = new float[] { 1.327152f, 1.185093f, 1.119872f };
    }
}
