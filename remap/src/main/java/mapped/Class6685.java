// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class6685 implements Class6686, Class6691, Class6690
{
    private static final float[][] field26375;
    private static final float[][] field26376;
    private final int field26377;
    private final int field26378;
    private final int field26379;
    private final int field26380;
    private final int field26381;
    
    public Class6685(final int field26377) {
        this.field26377 = field26377;
        this.field26379 = field26377 / 4;
        this.field26378 = field26377 / 8;
        this.field26380 = this.field26378 / 4;
        this.field26381 = (this.field26379 - this.field26380) / 2;
    }
    
    public void method20335(final float[] array, final float[] array2, final int n, final int n2, final Class303 class303) throws AACException {
        final float[] array3 = new float[this.field26377];
        if (!class303.equals(Class303.field1766)) {
            for (int i = 0; i < 4; ++i) {
                for (int j = 0; j < this.field26379; ++j) {
                    if (i % 2 != 0) {
                        array3[this.field26379 * i + j] = array[this.field26379 * i + this.field26379 - 1 - j];
                    }
                    else {
                        array3[this.field26379 * i + j] = array[this.field26379 * i + j];
                    }
                }
            }
        }
        else {
            for (int k = 0; k < 4; ++k) {
                for (int l = 0; l < 8; ++l) {
                    for (int n3 = 0; n3 < this.field26380; ++n3) {
                        if (k % 2 != 0) {
                            array3[this.field26379 * k + this.field26380 * l + n3] = array[this.field26378 * l + this.field26380 * k + this.field26380 - 1 - n3];
                        }
                        else {
                            array3[this.field26379 * k + this.field26380 * l + n3] = array[this.field26378 * l + this.field26380 * k + n3];
                        }
                    }
                }
            }
        }
        for (int n4 = 0; n4 < 4; ++n4) {
            this.method20336(array3, array2, class303, n, n2, n4);
        }
    }
    
    private void method20336(final float[] array, final float[] array2, final Class303 class303, final int n, final int n2, final int n3) throws AACException {
        final float[] array3 = new float[this.field26379];
        final float[] array4 = new float[this.field26379 * 2];
        final float[] array5 = new float[this.field26379 * 2];
        final float[] array6 = new float[this.field26380 * 2];
        final float[] array7 = new float[this.field26380 * 2];
        switch (Class6511.field25887[class303.ordinal()]) {
            case 1: {
                for (int i = 0; i < this.field26379; ++i) {
                    array5[i] = Class6685.field26375[n2][i];
                    array5[this.field26379 * 2 - 1 - i] = Class6685.field26375[n][i];
                }
                break;
            }
            case 2: {
                for (int j = 0; j < this.field26380; ++j) {
                    array6[j] = Class6685.field26376[n2][j];
                    array6[this.field26380 * 2 - 1 - j] = Class6685.field26376[n][j];
                    array7[j] = Class6685.field26376[n][j];
                    array7[this.field26380 * 2 - 1 - j] = Class6685.field26376[n][j];
                }
                break;
            }
            case 3: {
                if (this.field26379 >= 0) System.arraycopy(Class6685.field26375[n2], 0, array5, 0, this.field26379);
                for (int l = 0; l < this.field26381; ++l) {
                    array5[l + this.field26379] = 1.0f;
                }
                for (int n4 = 0; n4 < this.field26380; ++n4) {
                    array5[n4 + this.field26381 + this.field26379] = Class6685.field26376[n][this.field26380 - 1 - n4];
                }
                for (int n5 = 0; n5 < this.field26381; ++n5) {
                    array5[n5 + this.field26381 + this.field26379 + this.field26380] = 0.0f;
                }
                break;
            }
            case 4: {
                for (int n6 = 0; n6 < this.field26381; ++n6) {
                    array5[n6] = 0.0f;
                }
                if (this.field26380 >= 0)
                    System.arraycopy(Class6685.field26376[n2], 0, array5, 0 + this.field26381, this.field26380);
                for (int n8 = 0; n8 < this.field26381; ++n8) {
                    array5[n8 + this.field26381 + this.field26380] = 1.0f;
                }
                for (int n9 = 0; n9 < this.field26379; ++n9) {
                    array5[n9 + this.field26381 + this.field26380 + this.field26381] = Class6685.field26375[n][this.field26379 - 1 - n9];
                }
                break;
            }
        }
        if (class303.equals(Class303.field1766)) {
            for (int n10 = 0; n10 < 8; ++n10) {
                for (int n11 = 0; n11 < this.field26380; ++n11) {
                    array3[n11] = array[n3 * this.field26379 + n10 * this.field26380 + n11];
                }
                if (n10 == 0) {
                    System.arraycopy(array6, 0, array5, 0, this.field26380 * 2);
                }
                else {
                    System.arraycopy(array7, 0, array5, 0, this.field26380 * 2);
                }
                this.method20337(array3, array4, array5, this.field26380);
                for (int n12 = 0; n12 < this.field26380 * 2; ++n12) {
                    array2[n3 * this.field26379 * 2 + n10 * this.field26380 * 2 + n12] = array4[n12] / 32.0f;
                }
            }
        }
        else {
            System.arraycopy(array, n3 * this.field26379 + 0, array3, 0, this.field26379);
            this.method20337(array3, array4, array5, this.field26379);
            for (int n14 = 0; n14 < this.field26379 * 2; ++n14) {
                array2[n3 * this.field26379 * 2 + n14] = array4[n14] / 256.0f;
            }
        }
    }
    
    private void method20337(final float[] array, final float[] array2, final float[] array3, final int n) throws AACException {
        final int n2 = n / 2;
        float[][] array4;
        float[][] array5;
        if (n != 256) {
            if (n != 32) {
                throw new Class2348("gain control: unexpected IMDCT length");
            }
            array4 = Class6685.field26417;
            array5 = Class6685.field26419;
        }
        else {
            array4 = Class6685.field26416;
            array5 = Class6685.field26418;
        }
        final float[] array6 = new float[n];
        for (int i = 0; i < n2; ++i) {
            array6[i] = array[2 * i];
        }
        for (int j = n2; j < n; ++j) {
            array6[j] = -array[2 * n - 1 - 2 * j];
        }
        final float[][] array7 = new float[n2][2];
        for (int k = 0; k < n2; ++k) {
            array7[k][0] = array4[k][0] * array6[2 * k] - array4[k][1] * array6[2 * k + 1];
            array7[k][1] = array4[k][0] * array6[2 * k + 1] + array4[k][1] * array6[2 * k];
        }
        Class8586.method29073(array7, n2);
        for (int l = 0; l < n2; ++l) {
            array6[l] = array5[l][0] * array7[l][0] + array5[l][1] * array7[n2 - 1 - l][0] + array5[l][2] * array7[l][1] + array5[l][3] * array7[n2 - 1 - l][1];
            array6[n - 1 - l] = array5[l][2] * array7[l][0] - array5[l][3] * array7[n2 - 1 - l][0] - array5[l][0] * array7[l][1] + array5[l][1] * array7[n2 - 1 - l][1];
        }
        System.arraycopy(array6, n2, array2, 0, n2);
        for (int n3 = n2; n3 < n * 3 / 2; ++n3) {
            array2[n3] = -array6[n * 3 / 2 - 1 - n3];
        }
        for (int n4 = n * 3 / 2; n4 < n * 2; ++n4) {
            array2[n4] = -array6[n4 - n * 3 / 2];
        }
        for (int n5 = 0; n5 < n; ++n5) {
            final int n6 = n5;
            array2[n6] *= array3[n5];
        }
    }
    
    static {
        field26375 = new float[][] { Class6685.field26412, Class6685.field26414 };
        field26376 = new float[][] { Class6685.field26413, Class6685.field26415 };
    }
}
