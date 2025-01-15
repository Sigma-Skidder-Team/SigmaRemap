// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6503
{
    private static String[] field25877;
    private static final int[] field25878;
    
    public static void method19587(final Class4197 class4197, final float[][][] array, final float[][][] array2, final int n) {
        final float[][] array3 = new float[64][2];
        final float[][] array4 = new float[64][2];
        final int field18857 = class4197.field18857;
        final int n2 = class4197.field18808[n][0];
        final int n3 = class4197.field18808[n][class4197.field18805[n]];
        method19591(class4197, n);
        if (n == 0) {
            if (class4197.field18847) {
                method19592(class4197);
            }
        }
        for (int i = 0; i < class4197.field18829; ++i) {
            for (int j = 0; j < class4197.field18830[i]; ++j) {
                int n4 = class4197.field18788 + j;
                for (int k = 0; k < i; ++k) {
                    n4 += class4197.field18830[k];
                }
                final int n5 = class4197.field18831[i] + j;
                final float n6 = class4197.field18827[n][class4197.field18800[n4]];
                final float n7 = n6 * n6;
                if (n7 <= 0.0f) {
                    for (int l = n2; l < n3; ++l) {
                        array2[l + field18857][n4][0] = array[l + field18857][n5][0];
                        array2[l + field18857][n4][1] = array[l + field18857][n5][1];
                    }
                }
                else {
                    method19589(class4197, array, array3, array4, n5);
                    final float n8 = array3[n5][0] * n6;
                    final float n9 = array4[n5][0] * n7;
                    final float n10 = array3[n5][1] * n6;
                    final float n11 = array4[n5][1] * n7;
                    float n12 = array[n2 - 2 + field18857][n5][0];
                    float n13 = array[n2 - 1 + field18857][n5][0];
                    float n14 = array[n2 - 2 + field18857][n5][1];
                    float n15 = array[n2 - 1 + field18857][n5][1];
                    for (int n16 = n2; n16 < n3; ++n16) {
                        final float n17 = n12;
                        n12 = n13;
                        n13 = array[n16 + field18857][n5][0];
                        final float n18 = n14;
                        n14 = n15;
                        n15 = array[n16 + field18857][n5][1];
                        array2[n16 + field18857][n4][0] = n13 + (n8 * n12 - n10 * n14 + n9 * n17 - n11 * n18);
                        array2[n16 + field18857][n4][1] = n15 + (n10 * n12 + n8 * n14 + n11 * n17 + n9 * n18);
                    }
                }
            }
        }
        if (class4197.field18847) {
            Class4202.method12646(class4197);
        }
    }
    
    private static void method19588(final Class4197 class4197, final Class8461 class4198, final float[][][] array, final int n, final int n2) {
        float n3 = 0.0f;
        float n4 = 0.0f;
        float n5 = 0.0f;
        float n6 = 0.0f;
        float n7 = 0.0f;
        final float n8 = 0.99999905f;
        final int field18857 = class4197.field18857;
        float n9 = array[field18857 - 2][n][0];
        float n10 = array[field18857 - 2][n][1];
        float n11 = array[field18857 - 1][n][0];
        float n12 = array[field18857 - 1][n][1];
        final float n13 = n9;
        final float n14 = n10;
        final float n15 = n11;
        final float n16 = n12;
        for (int i = field18857; i < n2 + field18857; ++i) {
            final float n17 = n9;
            final float n18 = n10;
            n9 = n11;
            n10 = n12;
            n11 = array[i][n][0];
            n12 = array[i][n][1];
            n3 += n11 * n9 + n12 * n10;
            n4 += n12 * n9 - n11 * n10;
            n5 += n11 * n17 + n12 * n18;
            n6 += n12 * n17 - n11 * n18;
            n7 += n9 * n9 + n10 * n10;
        }
        class4198.field34738[0] = n3 - (n11 * n9 + n12 * n10) + (n15 * n13 + n16 * n14);
        class4198.field34738[1] = n4 - (n12 * n9 - n11 * n10) + (n16 * n13 - n15 * n14);
        class4198.field34739[0] = n7 - (n9 * n9 + n10 * n10) + (n13 * n13 + n14 * n14);
        class4198.field34735[0] = n3;
        class4198.field34735[1] = n4;
        class4198.field34736[0] = n5;
        class4198.field34736[1] = n6;
        class4198.field34737[0] = n7;
        class4198.field34740 = class4198.field34737[0] * class4198.field34739[0] - n8 * (class4198.field34738[0] * class4198.field34738[0] + class4198.field34738[1] * class4198.field34738[1]);
    }
    
    private static void method19589(final Class4197 class4197, final float[][][] array, final float[][] array2, final float[][] array3, final int n) {
        final Class8461 class4198 = new Class8461(null);
        method19588(class4197, class4198, array, n, class4197.field18854 + 6);
        if (class4198.field34740 != 0.0f) {
            final float n2 = 1.0f / class4198.field34740;
            array3[n][0] = (class4198.field34735[0] * class4198.field34738[0] - class4198.field34735[1] * class4198.field34738[1] - class4198.field34736[0] * class4198.field34737[0]) * n2;
            array3[n][1] = (class4198.field34735[1] * class4198.field34738[0] + class4198.field34735[0] * class4198.field34738[1] - class4198.field34736[1] * class4198.field34737[0]) * n2;
        }
        else {
            array3[n][0] = 0.0f;
            array3[n][1] = 0.0f;
        }
        if (class4198.field34737[0] != 0.0f) {
            final float n3 = 1.0f / class4198.field34737[0];
            array2[n][0] = -(class4198.field34735[0] + array3[n][0] * class4198.field34738[0] + array3[n][1] * class4198.field34738[1]) * n3;
            array2[n][1] = -(class4198.field34735[1] + array3[n][1] * class4198.field34738[0] - array3[n][0] * class4198.field34738[1]) * n3;
        }
        else {
            array2[n][0] = 0.0f;
            array2[n][1] = 0.0f;
        }
        if (array2[n][0] * array2[n][0] + array2[n][1] * array2[n][1] >= 16.0f || array3[n][0] * array3[n][0] + array3[n][1] * array3[n][1] >= 16.0f) {
            array2[n][0] = 0.0f;
            array2[n][1] = 0.0f;
            array3[n][0] = 0.0f;
            array3[n][1] = 0.0f;
        }
    }
    
    private static float method19590(final int n, final int n2) {
        switch (n) {
            case 1: {
                if (n2 == 0) {
                    return 0.6f;
                }
                return 0.75f;
            }
            case 2: {
                return 0.9f;
            }
            case 3: {
                return 0.98f;
            }
            default: {
                if (n2 == 1) {
                    return 0.6f;
                }
                return 0.0f;
            }
        }
    }
    
    private static void method19591(final Class4197 class4197, final int n) {
        for (int i = 0; i < class4197.field18793; ++i) {
            class4197.field18827[n][i] = method19590(class4197.field18825[n][i], class4197.field18826[n][i]);
            if (class4197.field18827[n][i] >= class4197.field18828[n][i]) {
                class4197.field18827[n][i] = class4197.field18827[n][i] * 0.90625f + class4197.field18828[n][i] * 0.09375f;
            }
            else {
                class4197.field18827[n][i] = class4197.field18827[n][i] * 0.75f + class4197.field18828[n][i] * 0.25f;
            }
            if (class4197.field18827[n][i] < 0.015625f) {
                class4197.field18827[n][i] = 0.0f;
            }
            if (class4197.field18827[n][i] >= 0.99609375f) {
                class4197.field18827[n][i] = 0.99609375f;
            }
            class4197.field18828[n][i] = class4197.field18827[n][i];
            class4197.field18826[n][i] = class4197.field18825[n][i];
        }
    }
    
    private static void method19592(final Class4197 class4197) {
        int n = class4197.field18787;
        int field18788 = class4197.field18788;
        final int n2 = Class6503.field25878[class4197.field18781.method8182()];
        class4197.field18829 = 0;
        int n3;
        if (n2 >= class4197.field18788 + class4197.field18789) {
            n3 = class4197.field18790;
        }
        else {
            int n4 = 0;
            n3 = 0;
            while (class4197.field18796[n4] < n2) {
                n3 = n4 + 1;
                ++n4;
            }
        }
        if (class4197.field18790 != 0) {
            while (true) {
                int n5 = n3 + 1;
                int n6;
                int n7;
                do {
                    --n5;
                    n6 = class4197.field18796[n5];
                    n7 = (n6 - 2 + class4197.field18787) % 2;
                } while (n6 > class4197.field18787 - 1 + n - n7);
                class4197.field18830[class4197.field18829] = Math.max(n6 - field18788, 0);
                class4197.field18831[class4197.field18829] = class4197.field18787 - n7 - class4197.field18830[class4197.field18829];
                if (class4197.field18830[class4197.field18829] <= 0) {
                    n = class4197.field18788;
                }
                else {
                    field18788 = n6;
                    n = n6;
                    ++class4197.field18829;
                }
                if (class4197.field18796[n3] - n6 < 3) {
                    n3 = class4197.field18790;
                }
                if (n6 != class4197.field18788 + class4197.field18789) {
                    continue;
                }
                break;
            }
            if (class4197.field18830[class4197.field18829 - 1] < 3) {
                if (class4197.field18829 > 1) {
                    --class4197.field18829;
                }
            }
            class4197.field18829 = Math.min(class4197.field18829, 5);
            return;
        }
        class4197.field18829 = 0;
        class4197.field18830[0] = 0;
        class4197.field18831[0] = 0;
    }
    
    static {
        field25878 = new int[] { 21, 23, 32, 43, 46, 64, 85, 93, 128, 0, 0, 0 };
    }
}
