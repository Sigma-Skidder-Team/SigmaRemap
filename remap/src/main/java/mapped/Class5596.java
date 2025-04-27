// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5596 implements Class5595
{
    private static String[] field22867;
    private final int field22868;
    private final int[] field22869;
    private final int[] field22870;
    private final float[][] field22871;
    private final float[][][] field22872;
    private final float[][][] field22873;
    
    public Class5596(final int field22868) {
        this.field22869 = new int[3];
        (this.field22870 = new int[5])[0] = 12;
        this.field22870[1] = 8;
        this.field22870[2] = 4;
        this.field22870[3] = 4;
        this.field22870[4] = 4;
        this.field22869[0] = 8;
        this.field22869[1] = 2;
        this.field22869[2] = 2;
        this.field22868 = field22868;
        this.field22871 = new float[this.field22868 + 12][2];
        this.field22872 = new float[5][2][2];
        this.field22873 = new float[this.field22868][12][2];
    }
    
    public void method16837(final float[][][] array, final float[][][] array2, final boolean b, final int n) {
        int n2 = 0;
        final int n3 = b ? 5 : 3;
        final int[] array3 = b ? this.field22870 : this.field22869;
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < 12; ++j) {
                this.field22871[j][0] = this.field22872[i][j][0];
                this.field22871[j][1] = this.field22872[i][j][1];
            }
            for (int k = 0; k < this.field22868; ++k) {
                this.field22871[12 + k][0] = array[k + 6][i][0];
                this.field22871[12 + k][0] = array[k + 6][i][0];
            }
            for (int l = 0; l < 12; ++l) {
                this.field22872[i][l][0] = this.field22871[this.field22868 + l][0];
                this.field22872[i][l][1] = this.field22871[this.field22868 + l][1];
            }
            switch (array3[i]) {
                case 2: {
                    method16838(this.field22868, Class5596.field22841, this.field22871, this.field22873);
                    break;
                }
                case 4: {
                    method16839(this.field22868, Class5596.field22844, this.field22871, this.field22873);
                    break;
                }
                case 8: {
                    this.method16841(this.field22868, b ? Class5596.field22843 : Class5596.field22840, this.field22871, this.field22873);
                    break;
                }
                case 12: {
                    this.method16843(this.field22868, Class5596.field22842, this.field22871, this.field22873);
                    break;
                }
            }
            for (int n4 = 0; n4 < this.field22868; ++n4) {
                for (int n5 = 0; n5 < array3[i]; ++n5) {
                    array2[n4][n2 + n5][0] = this.field22873[n4][n5][0];
                    array2[n4][n2 + n5][1] = this.field22873[n4][n5][1];
                }
            }
            n2 += array3[i];
        }
        if (!b) {
            for (int n6 = 0; n6 < n; ++n6) {
                final float[] array4 = array2[n6][3];
                final int n7 = 0;
                array4[n7] += array2[n6][4][0];
                final float[] array5 = array2[n6][3];
                final int n8 = 1;
                array5[n8] += array2[n6][4][1];
                array2[n6][4][0] = 0.0f;
                array2[n6][4][1] = 0.0f;
                final float[] array6 = array2[n6][2];
                final int n9 = 0;
                array6[n9] += array2[n6][5][0];
                final float[] array7 = array2[n6][2];
                final int n10 = 1;
                array7[n10] += array2[n6][5][1];
                array2[n6][5][0] = 0.0f;
                array2[n6][5][1] = 0.0f;
            }
        }
    }
    
    public static void method16838(final int n, final float[] array, final float[][] array2, final float[][][] array3) {
        for (int i = 0; i < n; ++i) {
            final float n2 = array[0] * (array2[i][0] + array2[12 + i][0]);
            final float n3 = array[1] * (array2[1 + i][0] + array2[11 + i][0]);
            final float n4 = array[2] * (array2[2 + i][0] + array2[10 + i][0]);
            final float n5 = array[3] * (array2[3 + i][0] + array2[9 + i][0]);
            final float n6 = array[4] * (array2[4 + i][0] + array2[8 + i][0]);
            final float n7 = array[5] * (array2[5 + i][0] + array2[7 + i][0]);
            final float n8 = array[6] * array2[6 + i][0];
            final float n9 = array[0] * (array2[i][1] + array2[12 + i][1]);
            final float n10 = array[1] * (array2[1 + i][1] + array2[11 + i][1]);
            final float n11 = array[2] * (array2[2 + i][1] + array2[10 + i][1]);
            final float n12 = array[3] * (array2[3 + i][1] + array2[9 + i][1]);
            final float n13 = array[4] * (array2[4 + i][1] + array2[8 + i][1]);
            final float n14 = array[5] * (array2[5 + i][1] + array2[7 + i][1]);
            final float n15 = array[6] * array2[6 + i][1];
            array3[i][0][0] = n2 + n3 + n4 + n5 + n6 + n7 + n8;
            array3[i][0][1] = n9 + n10 + n11 + n12 + n13 + n14 + n15;
            array3[i][1][0] = n2 - n3 + n4 - n5 + n6 - n7 + n8;
            array3[i][1][1] = n9 - n10 + n11 - n12 + n13 - n14 + n15;
        }
    }
    
    public static void method16839(final int n, final float[] array, final float[][] array2, final float[][][] array3) {
        final float[] array4 = new float[2];
        final float[] array5 = new float[2];
        final float[] array6 = new float[2];
        final float[] array7 = new float[2];
        for (int i = 0; i < n; ++i) {
            array4[0] = -(array[2] * (array2[i + 2][0] + array2[i + 10][0])) + array[6] * array2[i + 6][0];
            array4[1] = -0.70710677f * (array[1] * (array2[i + 1][0] + array2[i + 11][0]) + array[3] * (array2[i + 3][0] + array2[i + 9][0]) - array[5] * (array2[i + 5][0] + array2[i + 7][0]));
            array6[0] = array[0] * (array2[i][1] - array2[i + 12][1]) - array[4] * (array2[i + 4][1] - array2[i + 8][1]);
            array6[1] = 0.70710677f * (array[1] * (array2[i + 1][1] - array2[i + 11][1]) - array[3] * (array2[i + 3][1] - array2[i + 9][1]) - array[5] * (array2[i + 5][1] - array2[i + 7][1]));
            array5[0] = array[0] * (array2[i][0] - array2[i + 12][0]) - array[4] * (array2[i + 4][0] - array2[i + 8][0]);
            array5[1] = 0.70710677f * (array[1] * (array2[i + 1][0] - array2[i + 11][0]) - array[3] * (array2[i + 3][0] - array2[i + 9][0]) - array[5] * (array2[i + 5][0] - array2[i + 7][0]));
            array7[0] = -(array[2] * (array2[i + 2][1] + array2[i + 10][1])) + array[6] * array2[i + 6][1];
            array7[1] = -0.70710677f * (array[1] * (array2[i + 1][1] + array2[i + 11][1]) + array[3] * (array2[i + 3][1] + array2[i + 9][1]) - array[5] * (array2[i + 5][1] + array2[i + 7][1]));
            array3[i][0][0] = array4[0] + array4[1] + array6[0] + array6[1];
            array3[i][0][1] = -array5[0] - array5[1] + array7[0] + array7[1];
            array3[i][1][0] = array4[0] - array4[1] - array6[0] + array6[1];
            array3[i][1][1] = array5[0] - array5[1] + array7[0] - array7[1];
            array3[i][2][0] = array4[0] - array4[1] + array6[0] - array6[1];
            array3[i][2][1] = -array5[0] + array5[1] + array7[0] - array7[1];
            array3[i][3][0] = array4[0] + array4[1] - array6[0] - array6[1];
            array3[i][3][1] = array5[0] + array5[1] + array7[0] + array7[1];
        }
    }
    
    public static void method16840(final float[] array, final float[] array2) {
        final float n = array2[2] * 0.70710677f;
        final float n2 = array2[0] - n;
        final float n3 = array2[0] + n;
        final float n4 = array2[1] + array2[3];
        final float n5 = array2[1] * 1.306563f;
        final float n6 = n4 * -0.9238795f;
        final float n7 = array2[3] * -0.5411961f;
        final float n8 = n5 + n6;
        final float n9 = n7 - n6;
        array[3] = n3 - n9;
        array[0] = n3 + n9;
        array[2] = n2 - n8;
        array[1] = n2 + n8;
    }
    
    public void method16841(final int n, final float[] array, final float[][] array2, final float[][][] array3) {
        final float[] array4 = new float[4];
        final float[] array5 = new float[4];
        final float[] array6 = new float[4];
        final float[] array7 = new float[4];
        final float[] array8 = new float[4];
        for (int i = 0; i < n; ++i) {
            array4[0] = array[6] * array2[6 + i][0];
            array4[1] = array[5] * (array2[5 + i][0] + array2[7 + i][0]);
            array4[2] = -(array[0] * (array2[i][0] + array2[12 + i][0])) + array[4] * (array2[4 + i][0] + array2[8 + i][0]);
            array4[3] = -(array[1] * (array2[1 + i][0] + array2[11 + i][0])) + array[3] * (array2[3 + i][0] + array2[9 + i][0]);
            array6[0] = array[5] * (array2[7 + i][1] - array2[5 + i][1]);
            array6[1] = array[0] * (array2[12 + i][1] - array2[i][1]) + array[4] * (array2[8 + i][1] - array2[4 + i][1]);
            array6[2] = array[1] * (array2[11 + i][1] - array2[1 + i][1]) + array[3] * (array2[9 + i][1] - array2[3 + i][1]);
            array6[3] = array[2] * (array2[10 + i][1] - array2[2 + i][1]);
            for (int j = 0; j < 4; ++j) {
                array8[j] = array4[j] - array6[3 - j];
            }
            method16840(array8, array8);
            array3[i][7][0] = array8[0];
            array3[i][5][0] = array8[2];
            array3[i][3][0] = array8[3];
            array3[i][1][0] = array8[1];
            for (int k = 0; k < 4; ++k) {
                array8[k] = array4[k] + array6[3 - k];
            }
            method16840(array8, array8);
            array3[i][6][0] = array8[1];
            array3[i][4][0] = array8[3];
            array3[i][2][0] = array8[2];
            array3[i][0][0] = array8[0];
            array7[0] = array[6] * array2[6 + i][1];
            array7[1] = array[5] * (array2[5 + i][1] + array2[7 + i][1]);
            array7[2] = -(array[0] * (array2[i][1] + array2[12 + i][1])) + array[4] * (array2[4 + i][1] + array2[8 + i][1]);
            array7[3] = -(array[1] * (array2[1 + i][1] + array2[11 + i][1])) + array[3] * (array2[3 + i][1] + array2[9 + i][1]);
            array5[0] = array[5] * (array2[7 + i][0] - array2[5 + i][0]);
            array5[1] = array[0] * (array2[12 + i][0] - array2[i][0]) + array[4] * (array2[8 + i][0] - array2[4 + i][0]);
            array5[2] = array[1] * (array2[11 + i][0] - array2[1 + i][0]) + array[3] * (array2[9 + i][0] - array2[3 + i][0]);
            array5[3] = array[2] * (array2[10 + i][0] - array2[2 + i][0]);
            for (int l = 0; l < 4; ++l) {
                array8[l] = array7[l] + array5[3 - l];
            }
            method16840(array8, array8);
            array3[i][7][1] = array8[0];
            array3[i][5][1] = array8[2];
            array3[i][3][1] = array8[3];
            array3[i][1][1] = array8[1];
            for (int n2 = 0; n2 < 4; ++n2) {
                array8[n2] = array7[n2] - array5[3 - n2];
            }
            method16840(array8, array8);
            array3[i][6][1] = array8[1];
            array3[i][4][1] = array8[3];
            array3[i][2][1] = array8[2];
            array3[i][0][1] = array8[0];
        }
    }
    
    public void method16842(final float[] array, final float[] array2) {
        final float n = array2[3] * 0.70710677f;
        final float n2 = array2[0] + n;
        final float n3 = array2[0] - n;
        final float n4 = (array2[1] - array2[5]) * 0.70710677f;
        final float n5 = array2[2] * 0.8660254f + array2[4] * 0.5f;
        final float n6 = n5 - array2[4];
        final float n7 = array2[1] * 0.9659258f + array2[5] * 0.25881904f;
        final float n8 = n7 - n4;
        array[0] = n2 + n7 + n5;
        array[1] = n3 + n4 - array2[4];
        array[2] = n8 + n3 - n6;
        array[3] = n2 - n8 - n6;
        array[4] = n2 - n4 - array2[4];
        array[5] = n3 - n7 + n5;
    }
    
    public void method16843(final int n, final float[] array, final float[][] array2, final float[][][] array3) {
        final float[] array4 = new float[6];
        final float[] array5 = new float[6];
        final float[] array6 = new float[6];
        final float[] array7 = new float[6];
        final float[] array8 = new float[6];
        final float[] array9 = new float[6];
        final float[] array10 = new float[6];
        final float[] array11 = new float[6];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < 6; ++j) {
                if (j != 0) {
                    array4[6 - j] = (array2[j + i][0] + array2[12 - j + i][0]) * array[j];
                    array5[6 - j] = (array2[j + i][1] + array2[12 - j + i][1]) * array[j];
                }
                else {
                    array4[0] = array2[6 + i][0] * array[6];
                    array5[0] = array2[6 + i][1] * array[6];
                }
                array7[j] = (array2[j + i][0] - array2[12 - j + i][0]) * array[j];
                array6[j] = (array2[j + i][1] - array2[12 - j + i][1]) * array[j];
            }
            this.method16842(array8, array4);
            this.method16842(array9, array5);
            this.method16842(array10, array6);
            this.method16842(array11, array7);
            for (int k = 0; k < 6; k += 2) {
                array3[i][k][0] = array8[k] - array10[k];
                array3[i][k][1] = array9[k] + array11[k];
                array3[i][k + 1][0] = array8[k + 1] + array10[k + 1];
                array3[i][k + 1][1] = array9[k + 1] - array11[k + 1];
                array3[i][10 - k][0] = array8[k + 1] - array10[k + 1];
                array3[i][10 - k][1] = array9[k + 1] + array11[k + 1];
                array3[i][11 - k][0] = array8[k] + array10[k];
                array3[i][11 - k][1] = array9[k] - array11[k];
            }
        }
    }
    
    public void method16844(final float[][][] array, final float[][][] array2, final boolean b, final int n) {
        int n2 = 0;
        final int n3 = b ? 5 : 3;
        final int[] array3 = b ? this.field22870 : this.field22869;
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < this.field22868; ++j) {
                array[j][i][0] = 0.0f;
                array[j][i][1] = 0.0f;
                for (int k = 0; k < array3[i]; ++k) {
                    final float[] array4 = array[j][i];
                    final int n4 = 0;
                    array4[n4] += array2[j][n2 + k][0];
                    final float[] array5 = array[j][i];
                    final int n5 = 1;
                    array5[n5] += array2[j][n2 + k][1];
                }
            }
            n2 += array3[i];
        }
    }
}
