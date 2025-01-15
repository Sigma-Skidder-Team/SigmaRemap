// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.FloatBuffer;
import java.util.Arrays;

public class Class8425
{
    private static String[] field34581;
    
    public static void method28139(final float[] array, final float[] array2, final float[] array3) {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                array[4 * i + j] = array2[4 * i + 0] * array3[0 + j] + array2[4 * i + 1] * array3[4 + j] + array2[4 * i + 2] * array3[8 + j] + array2[4 * i + 3] * array3[12 + j];
            }
        }
    }
    
    public static void method28140(final float[] array, final float[] array2, final float[] array3) {
        array[0] = array2[0] * array3[0] + array2[4] * array3[1] + array2[8] * array3[2] + array2[12] * array3[3];
        array[1] = array2[1] * array3[0] + array2[5] * array3[1] + array2[9] * array3[2] + array2[13] * array3[3];
        array[2] = array2[2] * array3[0] + array2[6] * array3[1] + array2[10] * array3[2] + array2[14] * array3[3];
        array[3] = array2[3] * array3[0] + array2[7] * array3[1] + array2[11] * array3[2] + array2[15] * array3[3];
    }
    
    public static void method28141(final float[] a, final float[] array) {
        a[0] = array[5] * array[10] * array[15] - array[5] * array[11] * array[14] - array[9] * array[6] * array[15] + array[9] * array[7] * array[14] + array[13] * array[6] * array[11] - array[13] * array[7] * array[10];
        a[1] = -array[1] * array[10] * array[15] + array[1] * array[11] * array[14] + array[9] * array[2] * array[15] - array[9] * array[3] * array[14] - array[13] * array[2] * array[11] + array[13] * array[3] * array[10];
        a[2] = array[1] * array[6] * array[15] - array[1] * array[7] * array[14] - array[5] * array[2] * array[15] + array[5] * array[3] * array[14] + array[13] * array[2] * array[7] - array[13] * array[3] * array[6];
        a[3] = -array[1] * array[6] * array[11] + array[1] * array[7] * array[10] + array[5] * array[2] * array[11] - array[5] * array[3] * array[10] - array[9] * array[2] * array[7] + array[9] * array[3] * array[6];
        a[4] = -array[4] * array[10] * array[15] + array[4] * array[11] * array[14] + array[8] * array[6] * array[15] - array[8] * array[7] * array[14] - array[12] * array[6] * array[11] + array[12] * array[7] * array[10];
        a[5] = array[0] * array[10] * array[15] - array[0] * array[11] * array[14] - array[8] * array[2] * array[15] + array[8] * array[3] * array[14] + array[12] * array[2] * array[11] - array[12] * array[3] * array[10];
        a[6] = -array[0] * array[6] * array[15] + array[0] * array[7] * array[14] + array[4] * array[2] * array[15] - array[4] * array[3] * array[14] - array[12] * array[2] * array[7] + array[12] * array[3] * array[6];
        a[7] = array[0] * array[6] * array[11] - array[0] * array[7] * array[10] - array[4] * array[2] * array[11] + array[4] * array[3] * array[10] + array[8] * array[2] * array[7] - array[8] * array[3] * array[6];
        a[8] = array[4] * array[9] * array[15] - array[4] * array[11] * array[13] - array[8] * array[5] * array[15] + array[8] * array[7] * array[13] + array[12] * array[5] * array[11] - array[12] * array[7] * array[9];
        a[9] = -array[0] * array[9] * array[15] + array[0] * array[11] * array[13] + array[8] * array[1] * array[15] - array[8] * array[3] * array[13] - array[12] * array[1] * array[11] + array[12] * array[3] * array[9];
        a[10] = array[0] * array[5] * array[15] - array[0] * array[7] * array[13] - array[4] * array[1] * array[15] + array[4] * array[3] * array[13] + array[12] * array[1] * array[7] - array[12] * array[3] * array[5];
        a[11] = -array[0] * array[5] * array[11] + array[0] * array[7] * array[9] + array[4] * array[1] * array[11] - array[4] * array[3] * array[9] - array[8] * array[1] * array[7] + array[8] * array[3] * array[5];
        a[12] = -array[4] * array[9] * array[14] + array[4] * array[10] * array[13] + array[8] * array[5] * array[14] - array[8] * array[6] * array[13] - array[12] * array[5] * array[10] + array[12] * array[6] * array[9];
        a[13] = array[0] * array[9] * array[14] - array[0] * array[10] * array[13] - array[8] * array[1] * array[14] + array[8] * array[2] * array[13] + array[12] * array[1] * array[10] - array[12] * array[2] * array[9];
        a[14] = -array[0] * array[5] * array[14] + array[0] * array[6] * array[13] + array[4] * array[1] * array[14] - array[4] * array[2] * array[13] - array[12] * array[1] * array[6] + array[12] * array[2] * array[5];
        a[15] = array[0] * array[5] * array[10] - array[0] * array[6] * array[9] - array[4] * array[1] * array[10] + array[4] * array[2] * array[9] + array[8] * array[1] * array[6] - array[8] * array[2] * array[5];
        final float n = array[0] * a[0] + array[1] * a[4] + array[2] * a[8] + array[3] * a[12];
        if (n == 0.0) {
            Arrays.fill(a, 0.0f);
        }
        else {
            for (int i = 0; i < 16; ++i) {
                final int n2 = i;
                a[n2] /= n;
            }
        }
    }
    
    public static void method28142(final FloatBuffer floatBuffer, final FloatBuffer floatBuffer2, final float[] src, final float[] dst) {
        floatBuffer2.get(dst);
        method28141(src, dst);
        floatBuffer.put(src);
    }
}
