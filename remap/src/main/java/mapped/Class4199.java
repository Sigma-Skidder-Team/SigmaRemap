// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4199 implements Class4198, Class4200
{
    private static String[] field18916;
    private static final float[] field18917;
    private static final int[] field18918;
    private static final int[] field18919;
    private static final float[] field18920;
    private static final float field18921 = 1.0E-12f;
    private final float[][] field18922;
    private final float[][] field18923;
    private final float[][] field18924;
    
    public Class4199() {
        this.field18922 = new float[5][49];
        this.field18923 = new float[5][49];
        this.field18924 = new float[5][49];
    }
    
    public static int method12631(final Class4197 class4197, final float[][][] array, final int n) {
        final Class4199 class4198 = new Class4199();
        if (class4197.field18883[n] != 0) {
            if (class4197.field18883[n] != 2) {
                if (class4197.field18887[n] != 0) {
                    class4197.field18823[n] = class4197.field18805[n] + 1 - class4197.field18887[n];
                }
                else {
                    class4197.field18823[n] = -1;
                }
            }
            else if (class4197.field18887[n] <= 1) {
                class4197.field18823[n] = -1;
            }
            else {
                class4197.field18823[n] = class4197.field18887[n] - 1;
            }
        }
        else {
            class4197.field18823[n] = -1;
        }
        if (method12633(class4197, class4198, array, n) <= 0) {
            method12635(class4197, class4198, n);
            method12634(class4197, class4198, array, n);
            return 0;
        }
        return 1;
    }
    
    private static int method12632(final Class4197 class4197, final int n, final int n2, final int n3) {
        if (class4197.field18810[n][n2] == 1) {
            if (n2 < class4197.field18823[n]) {
                if (class4197.field18833[n][n3] == 0) {
                    return 0;
                }
                if (!class4197.field18878[n]) {
                    return 0;
                }
            }
            return class4197.field18832[n][n3];
        }
        final int n4 = 2 * n3 - (((class4197.field18791 & 0x1) != 0x0) ? 1 : 0);
        for (int n5 = 2 * (n3 + 1) - (((class4197.field18791 & 0x1) != 0x0) ? 1 : 0), i = n4; i < n5; ++i) {
            if (n2 < class4197.field18823[n]) {
                if (class4197.field18833[n][i] == 0) {
                    continue;
                }
                if (!class4197.field18878[n]) {
                    continue;
                }
            }
            if (class4197.field18832[n][i] == 1) {
                return 1;
            }
        }
        return 0;
    }
    
    private static int method12633(final Class4197 class4197, final Class4199 class4198, final float[][][] array, final int n) {
        if (!class4197.field18874) {
            for (int i = 0; i < class4197.field18805[n]; ++i) {
                for (int j = 0; j < class4197.field18795[class4197.field18810[n][i]]; ++j) {
                    final int n2 = class4197.field18797[class4197.field18810[n][i]][j];
                    for (int n3 = class4197.field18797[class4197.field18810[n][i]][j + 1], k = n2; k < n3; ++k) {
                        float n4 = 0.0f;
                        final int n5 = class4197.field18808[n][i];
                        final int n6 = class4197.field18808[n][i + 1];
                        float n7 = (float)((n6 - n5) * (n3 - n2));
                        if (n7 == 0.0f) {
                            n7 = 1.0f;
                        }
                        for (int l = n5 + class4197.field18857; l < n6 + class4197.field18857; ++l) {
                            for (int n8 = n2; n8 < n3; ++n8) {
                                n4 += array[l][n8][0] * array[l][n8][0] + array[l][n8][1] * array[l][n8][1];
                            }
                        }
                        class4197.field18818[n][k - class4197.field18788][i] = n4 / n7;
                    }
                }
            }
        }
        else {
            for (int n9 = 0; n9 < class4197.field18805[n]; ++n9) {
                final int n10 = class4197.field18808[n][n9];
                final int n11 = class4197.field18808[n][n9 + 1];
                float n12 = (float)(n11 - n10);
                if (n12 == 0.0f) {
                    n12 = 1.0f;
                }
                for (int n13 = 0; n13 < class4197.field18789; ++n13) {
                    float n14 = 0.0f;
                    for (int n15 = n10 + class4197.field18857; n15 < n11 + class4197.field18857; ++n15) {
                        n14 += array[n15][n13 + class4197.field18788][0] * array[n15][n13 + class4197.field18788][0] + array[n15][n13 + class4197.field18788][1] * array[n15][n13 + class4197.field18788][1];
                    }
                    class4197.field18818[n][n13][n9] = n14 / n12;
                }
            }
        }
        return 0;
    }
    
    private static void method12634(final Class4197 class4197, final Class4199 class4198, final float[][][] array, final int n) {
        int n2 = 0;
        int n3;
        if (!class4197.field18847) {
            n3 = class4197.field18834[n];
        }
        else {
            n2 = 1;
            n3 = 0;
        }
        int n4 = class4197.field18835[n];
        for (int i = 0; i < class4197.field18805[n]; ++i) {
            final boolean b = i == class4197.field18823[n] || i == class4197.field18842[n];
            final int n5 = class4197.field18875 ? 0 : 4;
            final int n6 = b ? 0 : n5;
            if (n2 != 0) {
                for (int j = 0; j < 4; ++j) {
                    System.arraycopy(class4198.field18922[i], 0, class4197.field18812[n][j], 0, class4197.field18789);
                    System.arraycopy(class4198.field18923[i], 0, class4197.field18813[n][j], 0, class4197.field18789);
                }
                class4197.field18814[n] = 4;
                n2 = 0;
            }
            for (int k = class4197.field18808[n][i]; k < class4197.field18808[n][i + 1]; ++k) {
                System.arraycopy(class4198.field18922[i], 0, class4197.field18812[n][class4197.field18814[n]], 0, class4197.field18789);
                System.arraycopy(class4198.field18923[i], 0, class4197.field18813[n][class4197.field18814[n]], 0, class4197.field18789);
                for (int l = 0; l < class4197.field18789; ++l) {
                    final float[] array2 = new float[2];
                    float n7 = 0.0f;
                    float n8 = 0.0f;
                    if (n6 == 0) {
                        n7 = class4197.field18812[n][class4197.field18814[n]][l];
                        n8 = class4197.field18813[n][class4197.field18814[n]][l];
                    }
                    else {
                        int n9 = class4197.field18814[n];
                        for (int n10 = 0; n10 <= 4; ++n10) {
                            final float n11 = Class4199.field18917[n10];
                            if (++n9 >= 5) {
                                n9 -= 5;
                            }
                            n7 += class4197.field18812[n][n9][l] * n11;
                            n8 += class4197.field18813[n][n9][l] * n11;
                        }
                    }
                    final float n12 = (class4198.field18924[i][l] == 0.0f && !b) ? n8 : 0.0f;
                    n3 = (n3 + 1 & 0x1FF);
                    array[k + class4197.field18857][l + class4197.field18788][0] = n7 * array[k + class4197.field18857][l + class4197.field18788][0] + n12 * Class4199.field18925[n3][0];
                    if (class4197.field18880 == 3) {
                        if (class4197.field18881 == 42) {
                            array[k + class4197.field18857][l + class4197.field18788][0] = 1.642832E7f;
                        }
                    }
                    array[k + class4197.field18857][l + class4197.field18788][1] = n7 * array[k + class4197.field18857][l + class4197.field18788][1] + n12 * Class4199.field18925[n3][1];
                    final int n13 = ((l + class4197.field18788 & 0x1) == 0x0) ? 1 : -1;
                    array2[0] = class4198.field18924[i][l] * Class4199.field18918[n4];
                    final float[] array3 = array[k + class4197.field18857][l + class4197.field18788];
                    final int n14 = 0;
                    array3[n14] += array2[0];
                    array2[1] = n13 * class4198.field18924[i][l] * Class4199.field18919[n4];
                    final float[] array4 = array[k + class4197.field18857][l + class4197.field18788];
                    final int n15 = 1;
                    array4[n15] += array2[1];
                }
                n4 = (n4 + 1 & 0x3);
                final int[] field18814 = class4197.field18814;
                ++field18814[n];
                if (class4197.field18814[n] >= 5) {
                    class4197.field18814[n] = 0;
                }
            }
        }
        class4197.field18834[n] = n3;
        class4197.field18835[n] = n4;
    }
    
    private static void method12635(final Class4197 class4197, final Class4199 class4198, final int n) {
        int n2 = 0;
        final float[] array = new float[49];
        final float[] array2 = new float[49];
        final float[] array3 = new float[49];
        for (int i = 0; i < class4197.field18805[n]; ++i) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            int n6 = 0;
            final float n7 = (i != class4197.field18823[n] && i != class4197.field18842[n]) ? 1.0f : 0.0f;
            int n8 = method12632(class4197, n, i, n5);
            if (class4197.field18808[n][i + 1] > class4197.field18809[n][n2 + 1]) {
                ++n2;
            }
            for (int j = 0; j < class4197.field18794[class4197.field18872]; ++j) {
                float n9 = 0.0f;
                float n10 = 0.0f;
                float n11 = 0.0f;
                final int n12 = class4197.field18799[class4197.field18872][j];
                final int n13 = class4197.field18799[class4197.field18872][j + 1];
                for (int k = n12; k < n13; ++k) {
                    if (k + class4197.field18788 == class4197.field18797[class4197.field18810[n][i]][n4 + 1]) {
                        ++n4;
                    }
                    n10 += class4197.field18817[n][n4][i];
                    n11 += class4197.field18818[n][k][i];
                }
                final float min = Math.min((1.0E-12f + n10) / (1.0E-12f + n11) * Class4199.field18920[class4197.field18873], 1.0E10f);
                for (int l = n12; l < n13; ++l) {
                    if (l + class4197.field18788 == class4197.field18798[n3 + 1]) {
                        ++n3;
                    }
                    if (l + class4197.field18788 == class4197.field18797[class4197.field18810[n][i]][n5 + 1]) {
                        ++n5;
                        n8 = method12632(class4197, n, i, n5);
                    }
                    if (l + class4197.field18788 == class4197.field18797[1][n6 + 1]) {
                        ++n6;
                    }
                    int n14 = 0;
                    Label_0480: {
                        if (i < class4197.field18823[n]) {
                            if (class4197.field18833[n][n6] == 0) {
                                break Label_0480;
                            }
                            if (!class4197.field18878[n]) {
                                break Label_0480;
                            }
                        }
                        if (l + class4197.field18788 == class4197.field18797[1][n6 + 1] + class4197.field18797[1][n6] >> 1) {
                            n14 = class4197.field18832[n][n6];
                        }
                    }
                    final float n15 = class4197.field18820[n][n3][n2];
                    final float n16 = class4197.field18821[n][n3][n2];
                    final float n17 = class4197.field18817[n][n5][i] * n16;
                    if (n14 != 0) {
                        array3[l] = class4197.field18817[n][n5][i] * n15;
                        n9 += array3[l];
                    }
                    else {
                        array3[l] = 0.0f;
                    }
                    float n18 = class4197.field18817[n][n5][i] / (1.0f + class4197.field18818[n][l][i]);
                    if (n8 == 0 && n7 == 1.0f) {
                        n18 *= n15;
                    }
                    else if (n8 == 1) {
                        n18 *= n16;
                    }
                    if (min <= n18) {
                        array[l] = n17 * min / n18;
                        array2[l] = min;
                    }
                    else {
                        array[l] = n17;
                        array2[l] = n18;
                    }
                    n9 += class4197.field18818[n][l][i] * array2[l];
                    if (n14 == 0) {
                        if (i != class4197.field18823[n]) {
                            n9 += array[l];
                        }
                    }
                }
                final float min2 = Math.min((n10 + 1.0E-12f) / (n9 + 1.0E-12f), 2.5118864f);
                for (int n19 = n12; n19 < n13; ++n19) {
                    class4198.field18922[i][n19] = (float)Math.sqrt(array2[n19] * min2);
                    class4198.field18923[i][n19] = (float)Math.sqrt(array[n19] * min2);
                    if (array3[n19] == 0.0f) {
                        class4198.field18924[i][n19] = 0.0f;
                    }
                    else {
                        class4198.field18924[i][n19] = (float)Math.sqrt(array3[n19] * min2);
                    }
                }
            }
        }
    }
    
    static {
        field18917 = new float[] { 0.0318305f, 0.11516383f, 0.2181695f, 0.30150282f, 0.33333334f };
        field18918 = new int[] { 1, 0, -1, 0 };
        field18919 = new int[] { 0, 1, 0, -1 };
        field18920 = new float[] { 0.5f, 1.0f, 2.0f, 1.0E10f };
    }
}
