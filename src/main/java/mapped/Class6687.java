// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6687 implements Class6686, Class6688
{
    private static String[] field26388;
    private final float[] field26389;
    private final float[][] field26390;
    private final float[][] field26391;
    
    public Class6687() {
        this.field26389 = new float[4];
        this.field26390 = new float[2][24];
        this.field26391 = new float[2][24];
    }
    
    public void method20338(final float[][] array, final int n, final int n2, final float[] array2) {
        for (int i = 0; i < n; ++i) {
            array2[i] = 0.0f;
        }
        for (int j = 0; j < n / 4; ++j) {
            for (int k = 0; k < 4; ++k) {
                this.field26389[k] = array[k][j];
            }
            this.method20339(this.field26389, array2, j * 4);
        }
    }
    
    private void method20339(final float[] array, final float[] array2, final int n) {
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 23; ++j) {
                this.field26390[i][j] = this.field26390[i][j + 1];
                this.field26391[i][j] = this.field26391[i][j + 1];
            }
        }
        for (int k = 0; k < 2; ++k) {
            float n2 = 0.0f;
            for (int l = 0; l < 4; ++l) {
                n2 += Class6687.field26393[k][l] * array[l];
            }
            this.field26390[k][23] = n2;
            float n3 = 0.0f;
            for (int n4 = 0; n4 < 4; ++n4) {
                n3 += Class6687.field26394[k][n4] * array[n4];
            }
            this.field26391[k][23] = n3;
        }
        for (int n5 = 0; n5 < 2; ++n5) {
            float n6 = 0.0f;
            for (int n7 = 0; n7 < 12; ++n7) {
                n6 += Class6687.field26395[n5][n7] * this.field26390[n5][23 - 2 * n7];
            }
            for (int n8 = 0; n8 < 12; ++n8) {
                n6 += Class6687.field26396[n5][n8] * this.field26391[n5][22 - 2 * n8];
            }
            array2[n + n5] = n6;
            float n9 = 0.0f;
            for (int n10 = 0; n10 < 12; ++n10) {
                n9 += Class6687.field26395[3 - n5][n10] * this.field26390[n5][23 - 2 * n10];
            }
            for (int n11 = 0; n11 < 12; ++n11) {
                n9 -= Class6687.field26396[3 - n5][n11] * this.field26391[n5][22 - 2 * n11];
            }
            array2[n + 4 - 1 - n5] = n9;
        }
    }
}
