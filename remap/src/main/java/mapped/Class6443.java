// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;

public class Class6443 implements Class6441
{
    private static String[] field25575;
    private float[] field25576;
    private int field25577;
    private int field25578;
    
    public Class6443(final int field25578) {
        this.field25578 = field25578;
        this.field25576 = new float[2 * field25578 * 10];
        this.field25577 = 0;
    }
    
    public void method19212() {
        Arrays.fill(this.field25576, 0.0f);
    }
    
    public void method19213(final Class4197 class4197, final float[] array, final float[][][] array2, final int n, final int n2) {
        final float[] array3 = new float[64];
        final float[] array4 = new float[32];
        final float[] array5 = new float[32];
        final float[] array6 = new float[32];
        final float[] array7 = new float[32];
        int n3 = 0;
        for (int i = 0; i < class4197.field18854; ++i) {
            for (int j = 31; j >= 0; --j) {
                this.field25576[this.field25577 + j] = (this.field25576[this.field25577 + j + 320] = array[n3++]);
            }
            for (int k = 0; k < 64; ++k) {
                array3[k] = this.field25576[this.field25577 + k] * Class6443.field25569[2 * k] + this.field25576[this.field25577 + k + 64] * Class6443.field25569[2 * (k + 64)] + this.field25576[this.field25577 + k + 128] * Class6443.field25569[2 * (k + 128)] + this.field25576[this.field25577 + k + 192] * Class6443.field25569[2 * (k + 192)] + this.field25576[this.field25577 + k + 256] * Class6443.field25569[2 * (k + 256)];
            }
            this.field25577 -= 32;
            if (this.field25577 < 0) {
                this.field25577 = 288;
            }
            array5[31] = array3[1];
            array4[0] = array3[0];
            for (int l = 1; l < 31; ++l) {
                array5[31 - l] = array3[l + 1];
                array4[l] = -array3[64 - l];
            }
            array5[0] = array3[32];
            array4[31] = -array3[33];
            Class9261.method34168(array4, array5, array6, array7);
            for (int n4 = 0; n4 < 16; ++n4) {
                if (2 * n4 + 1 >= n2) {
                    if (2 * n4 >= n2) {
                        array2[i + n][2 * n4][0] = 0.0f;
                        array2[i + n][2 * n4][1] = 0.0f;
                    }
                    else {
                        array2[i + n][2 * n4][0] = 2.0f * array6[n4];
                        array2[i + n][2 * n4][1] = 2.0f * array7[n4];
                    }
                    array2[i + n][2 * n4 + 1][0] = 0.0f;
                    array2[i + n][2 * n4 + 1][1] = 0.0f;
                }
                else {
                    array2[i + n][2 * n4][0] = 2.0f * array6[n4];
                    array2[i + n][2 * n4][1] = 2.0f * array7[n4];
                    array2[i + n][2 * n4 + 1][0] = -2.0f * array7[31 - n4];
                    array2[i + n][2 * n4 + 1][1] = -2.0f * array6[31 - n4];
                }
            }
        }
    }
}
