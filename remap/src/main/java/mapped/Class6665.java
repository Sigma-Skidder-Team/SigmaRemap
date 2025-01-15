// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class6665 extends Class6664
{
    private static String[] field26323;
    private static Class6665 field26329;
    public float[] field26330;
    public float[][] field26331;
    public int field26332;
    public float[] field26333;
    public float[] field26334;
    public float[][] field26335;
    
    public Class6665() {
        super(null, null);
        this.field26330 = new float[6];
        this.field26331 = new float[10][4];
        this.field26333 = new float[16];
        this.field26334 = new float[4];
    }
    
    public boolean method20265(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        for (int i = 0; i < this.field26332; ++i) {
            final float[] array = this.field26331[i];
            if (this.method20269(array, n, n2, n3) <= 0.0) {
                if (this.method20269(array, n4, n2, n3) <= 0.0) {
                    if (this.method20269(array, n, n5, n3) <= 0.0) {
                        if (this.method20269(array, n4, n5, n3) <= 0.0) {
                            if (this.method20269(array, n, n2, n6) <= 0.0) {
                                if (this.method20269(array, n4, n2, n6) <= 0.0) {
                                    if (this.method20269(array, n, n5, n6) <= 0.0) {
                                        if (this.method20269(array, n4, n5, n6) <= 0.0) {
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    private double method20269(final float[] array, final double n, final double n2, final double n3) {
        return array[0] * n + array[1] * n2 + array[2] * n3 + array[3];
    }
    
    private double method20270(final float[] array, final float[] array2) {
        return array[0] * (double)array2[0] + array[1] * (double)array2[1] + array[2] * (double)array2[2];
    }
    
    public static Class6664 method20271() {
        Class6665.field26329.method20281();
        return Class6665.field26329;
    }
    
    private void method20272(final float[] array) {
        final float method35640 = MathHelper.method35640(array[0] * array[0] + array[1] * array[1] + array[2] * array[2]);
        final int n = 0;
        array[n] /= method35640;
        final int n2 = 1;
        array[n2] /= method35640;
        final int n3 = 2;
        array[n3] /= method35640;
        final int n4 = 3;
        array[n4] /= method35640;
    }
    
    private void method20273(final float[] array) {
        float method35640 = MathHelper.method35640(array[0] * array[0] + array[1] * array[1] + array[2] * array[2]);
        if (method35640 == 0.0f) {
            method35640 = 1.0f;
        }
        final int n = 0;
        array[n] /= method35640;
        final int n2 = 1;
        array[n2] /= method35640;
        final int n3 = 2;
        array[n3] /= method35640;
    }
    
    private void method20274(final float[] array, final float n, final float n2, final float n3, final float n4) {
        final float n5 = (float)Math.sqrt(n * n + n2 * n2 + n3 * n3);
        array[0] = n / n5;
        array[1] = n2 / n5;
        array[2] = n3 / n5;
        array[3] = n4 / n5;
    }
    
    private void method20275(final float[] array, final float[] array2) {
        array[0] = array2[0];
        array[1] = array2[1];
        array[2] = array2[2];
        array[3] = array2[3];
    }
    
    private void method20276(final float[] array, final float[] array2, final float[] array3) {
        array[0] = array2[1] * array3[2] - array2[2] * array3[1];
        array[1] = array2[2] * array3[0] - array2[0] * array3[2];
        array[2] = array2[0] * array3[1] - array2[1] * array3[0];
    }
    
    private void method20277(final float[] array) {
        this.method20275(this.field26331[this.field26332++], array);
    }
    
    private float method20278(final float n, final float n2, final float n3) {
        return (float)Math.sqrt(n * n + n2 * n2 + n3 * n3);
    }
    
    private float method20279(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        return this.method20278(n - n4, n2 - n5, n3 - n6);
    }
    
    private void method20280(final float[] array, final float[] array2, final float[] array3, final float[] array4) {
        this.method20276(this.field26334, array2, array3);
        this.method20276(array, this.field26334, array4);
        this.method20273(array);
        final float n = (float)this.method20270(array2, array3);
        final float n2 = (float)this.method20270(array, array3);
        final float n3 = this.method20279(array[0], array[1], array[2], array3[0] * n2, array3[1] * n2, array3[2] * n2) / this.method20279(array2[0], array2[1], array2[2], array3[0] * n, array3[1] * n, array3[2] * n);
        final float n4 = (float)this.method20270(array, array2);
        array[3] = array2[3] * n3 + array3[3] * (this.method20279(array[0], array[1], array[2], array2[0] * n4, array2[1] * n4, array2[2] * n4) / this.method20279(array3[0], array3[1], array3[2], array2[0] * n, array2[1] * n, array2[2] * n));
    }
    
    public void method20281() {
    }
    
    static {
        Class6665.field26329 = new Class6665();
    }
}
