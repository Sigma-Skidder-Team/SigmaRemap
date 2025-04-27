// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import net.sourceforge.jaad.aac.AACException;

public class Class6689 implements Class6686
{
    private static String[] field26397;
    private final int field26398;
    private final int field26399;
    private final int field26400;
    private final Class6685 field26401;
    private final Class6687 field26402;
    private final float[] field26403;
    private final float[] field26404;
    private final float[][] field26405;
    private final float[][] field26406;
    private int field26407;
    private int[][][] field26408;
    private final int[][][] field26409;
    private int[][][] field26410;
    private final int[][][] field26411;
    
    public Class6689(final int field26398) {
        this.field26398 = field26398;
        this.field26399 = field26398 / 4;
        this.field26400 = this.field26399 / 8;
        this.field26401 = new Class6685(field26398);
        this.field26402 = new Class6687();
        this.field26409 = new int[0][][];
        this.field26411 = new int[0][][];
        this.field26403 = new float[field26398 / 2];
        this.field26405 = new float[4][this.field26399];
        this.field26404 = new float[this.field26399 * 2];
        this.field26406 = new float[4][this.field26399 * 2];
    }
    
    public void method20340(final Class8157 class8157, final Class303 class8158) throws AACException {
        this.field26407 = class8157.method26940(2) + 1;
        int n = 0;
        int n2 = 0;
        switch (Class8791.field36947[class8158.ordinal()]) {
            case 1: {
                n = 1;
                n2 = 5;
                final int n3 = 5;
                break;
            }
            case 2: {
                n = 8;
                n2 = 2;
                final int n3 = 2;
                break;
            }
            case 3: {
                n = 2;
                n2 = 4;
                final int n3 = 2;
                break;
            }
            case 4: {
                n = 2;
                n2 = 4;
                final int n3 = 5;
                break;
            }
            default: {
                return;
            }
        }
        this.field26408 = new int[this.field26407][n][];
        this.field26410 = new int[this.field26407][n][];
        for (int i = 1; i < this.field26407; ++i) {
            for (int j = 0; j < n; ++j) {
                final int method26940 = class8157.method26940(3);
                this.field26408[i][j] = new int[method26940];
                this.field26410[i][j] = new int[method26940];
                for (int k = 0; k < method26940; ++k) {
                    this.field26408[i][j][k] = class8157.method26940(4);
                    final int n3;
                    this.field26410[i][j][k] = class8157.method26940((j == 0) ? n2 : n3);
                }
            }
        }
    }
    
    public void method20341(final float[] array, final int n, final int n2, final Class303 class303) throws AACException {
        this.field26401.method20335(array, this.field26403, n, n2, class303);
        for (int i = 0; i < 4; ++i) {
            this.method20342(this.field26403, this.field26405, class303, i);
        }
        this.field26402.method20338(this.field26405, this.field26398, this.field26407, array);
    }
    
    private void method20342(final float[] array, final float[][] array2, final Class303 class303, final int n) {
        if (!class303.equals(Class303.field1766)) {
            this.method20343(this.field26399 * 2, n, class303, 0);
            for (int i = 0; i < this.field26399 * 2; ++i) {
                final int n2 = n * this.field26399 * 2 + i;
                array[n2] *= this.field26404[i];
            }
            for (int j = 0; j < this.field26399; ++j) {
                array2[n][j] = this.field26406[n][j] + array[n * this.field26399 * 2 + j];
            }
            for (int k = 0; k < this.field26399; ++k) {
                this.field26406[n][k] = array[n * this.field26399 * 2 + this.field26399 + k];
            }
            final int equals = class303.equals(Class303.field1764) ? 1 : 0;
            this.field26411[n][0] = Arrays.copyOf(this.field26410[n][equals], this.field26410[n][equals].length);
            this.field26409[n][0] = Arrays.copyOf(this.field26408[n][equals], this.field26408[n][equals].length);
        }
        else {
            for (int l = 0; l < 8; ++l) {
                this.method20343(this.field26400 * 2, n, class303, l);
                for (int n3 = 0; n3 < this.field26400 * 2; ++n3) {
                    final int n4 = n * this.field26399 * 2 + l * this.field26400 * 2 + n3;
                    array[n4] *= this.field26404[n3];
                }
                for (int n5 = 0; n5 < this.field26400; ++n5) {
                    final int n6 = n5 + this.field26399 * 7 / 16 + this.field26400 * l;
                    final int n7 = n * this.field26399 * 2 + l * this.field26400 * 2 + n5;
                    final float[] array3 = this.field26406[n];
                    final int n8 = n6;
                    array3[n8] += array[n7];
                }
                for (int n9 = 0; n9 < this.field26400; ++n9) {
                    this.field26406[n][n9 + this.field26399 * 7 / 16 + this.field26400 * (l + 1)] = array[n * this.field26399 * 2 + l * this.field26400 * 2 + this.field26400 + n9];
                }
                this.field26411[n][0] = Arrays.copyOf(this.field26410[n][l], this.field26410[n][l].length);
                this.field26409[n][0] = Arrays.copyOf(this.field26408[n][l], this.field26408[n][l].length);
            }
            System.arraycopy(this.field26406[n], 0, array2[n], 0, this.field26399);
            System.arraycopy(this.field26406[n], this.field26399, this.field26406[n], 0, this.field26399);
        }
    }
    
    private void method20343(final int n, final int n2, final Class303 class303, final int n3) {
        final int[] array = new int[10];
        final float[] array2 = new float[10];
        final float[] array3 = new float[n];
        final float[] array4 = new float[n / 2];
        final float[] array5 = new float[n / 2];
        final float[] array6 = new float[n / 2];
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        switch (Class8791.field36947[class303.ordinal()]) {
            case 1:
            case 2: {
                n5 = (n4 = n / 2);
                n6 = 0;
                break;
            }
            case 3: {
                n4 = n / 2;
                n5 = n * 7 / 32;
                n6 = n / 16;
                break;
            }
            case 4: {
                n4 = n / 16;
                n5 = n * 7 / 32;
                n6 = n / 2;
                break;
            }
        }
        this.method20344(n2, 0, true, n4, n, array, array2, array4);
        final float method20344 = this.method20344(n2, class303.equals(Class303.field1766) ? n3 : 0, false, n5, n, array, array2, array5);
        if (class303.equals(Class303.field1765) || class303.equals(Class303.field1767)) {
            this.method20344(n2, 1, false, n6, n, array, array2, array6);
        }
        int n7 = 0;
        if (class303.equals(Class303.field1767)) {
            n7 = n / 2 - n4 - n5;
            for (int i = 0; i < n7; ++i) {
                array3[i] = 1.0f;
            }
        }
        if (class303.equals(Class303.field1764) || class303.equals(Class303.field1766)) {
            array2[0] = 1.0f;
        }
        for (int j = 0; j < n4; ++j) {
            array3[j + n7] = array2[0] * method20344 * array4[j];
        }
        for (int k = 0; k < n5; ++k) {
            array3[k + n7 + n4] = array2[0] * array5[k];
        }
        if (class303.equals(Class303.field1765)) {
            for (int l = 0; l < n6; ++l) {
                array3[l + n4 + n5] = array6[l];
            }
            for (int n8 = n / 2 - n5 - n6, n9 = 0; n9 < n8; ++n9) {
                array3[n9 + n4 + n5 + n6] = 1.0f;
            }
        }
        else if (class303.equals(Class303.field1767)) {
            for (int n10 = 0; n10 < n6; ++n10) {
                array3[n10 + n7 + n4 + n5] = array6[n10];
            }
        }
        for (int n11 = 0; n11 < n; ++n11) {
            this.field26404[n11] = 1.0f / array3[n11];
        }
    }
    
    private float method20344(final int n, final int n2, final boolean b, final int n3, final int n4, final int[] array, final float[] array2, final float[] array3) {
        final int[] array4 = new int[n4 / 2];
        final int[] array5 = b ? this.field26411[n][n2] : this.field26410[n][n2];
        final int[] array6 = b ? this.field26409[n][n2] : this.field26408[n][n2];
        final int length = array5.length;
        for (int i = 0; i < length; ++i) {
            array[i + 1] = 8 * array5[i];
            final int method20345 = this.method20345(array6[i]);
            if (method20345 >= 0) {
                array2[i + 1] = (float)Math.pow(2.0, method20345);
            }
            else {
                array2[i + 1] = 1.0f / (float)Math.pow(2.0, -method20345);
            }
        }
        array[0] = 0;
        if (length != 0) {
            array2[0] = array2[1];
        }
        else {
            array2[0] = 1.0f;
        }
        final float n5 = array2[0];
        array[length + 1] = n3;
        array2[length + 1] = 1.0f;
        for (int j = 0; j < n3; ++j) {
            array4[j] = 0;
            for (int k = 0; k <= length + 1; ++k) {
                if (array[k] <= j) {
                    array4[j] = k;
                }
            }
        }
        for (int l = 0; l < n3; ++l) {
            if (l >= array[array4[l]] && l <= array[array4[l]] + 7) {
                array3[l] = this.method20346(array2[array4[l]], array2[array4[l] + 1], l - array[array4[l]]);
            }
            else {
                array3[l] = array2[array4[l] + 1];
            }
        }
        return n5;
    }
    
    private int method20345(final int n) {
        for (int i = 0; i < 16; ++i) {
            if (n == Class6689.field26387[i]) {
                return i;
            }
        }
        return 0;
    }
    
    private float method20346(final float n, final float n2, final int n3) {
        return (float)Math.pow(2.0, ((8 - n3) * (float)(Math.log(n) / Math.log(2.0)) + n3 * (float)(Math.log(n2) / Math.log(2.0))) / 8.0f);
    }
}
