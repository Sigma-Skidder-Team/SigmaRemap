// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class4175 extends Class4176 implements Class4178
{
    private static String[] field18593;
    public static final int field18594 = 0;
    public static final int field18595 = 1;
    public static final int field18596 = 2;
    private static final float[] field18597;
    private final Class4192 field18598;
    private float[] field18599;
    private int field18600;
    private int field18601;
    private final boolean[] field18602;
    private final int[] field18603;
    private final int[] field18604;
    private final float[][] field18605;
    
    public Class4175(final int n) {
        this.field18598 = new Class4192(n);
        this.field18602 = new boolean[8];
        this.field18603 = new int[8];
        this.field18604 = new int[8];
        this.field18605 = new float[16][120];
    }
    
    public int method12502() {
        return this.field18600;
    }
    
    public int method12503() {
        return this.field18601;
    }
    
    public boolean method12504(final int n) {
        return this.field18602[n];
    }
    
    public int method12505(final int n) {
        return this.field18603[n];
    }
    
    public int method12506(final int n) {
        return this.field18604[n];
    }
    
    public void method12507(final Class8157 class8157, final Class4179 class8158) throws AACException {
        this.field18600 = 2 * class8157.method26941();
        this.field18601 = class8157.method26940(3);
        int n = 0;
        for (int i = 0; i <= this.field18601; ++i) {
            ++n;
            this.field18602[i] = class8157.method26942();
            this.field18603[i] = class8157.method26940(4);
            if (!this.field18602[i]) {
                this.field18604[i] = 2;
            }
            else {
                this.field18604[i] = class8157.method26940(2);
                if (this.field18604[i] == 3) {
                    ++n;
                }
            }
        }
        this.field18600 += class8157.method26941();
        this.field18600 |= this.field18600 >> 1;
        final boolean method26942 = class8157.method26942();
        final double n2 = Class4175.field18597[class8157.method26940(2)];
        this.field18598.method12582(class8157, false, class8158);
        final Class4182 method26943 = this.field18598.method12588();
        final int method26944 = method26943.method12554();
        final int method26945 = method26943.method12549();
        final int[][] array = null;
        for (int j = 0; j < n; ++j) {
            int n3 = 0;
            int n4 = 1;
            int n5 = 0;
            float n6 = 1.0f;
            if (j > 0) {
                n4 = ((this.field18600 != 2) ? class8157.method26941() : 1);
                n5 = ((n4 != 0) ? (Class7841.method25335(class8157) - 60) : 0);
                n6 = (float)Math.pow(n2, -n5);
            }
            if (this.field18600 != 2) {
                for (int k = 0; k < method26944; ++k) {
                    for (int l = 0; l < method26945; ++l, ++n3) {
                        if (array[k][l] != 0) {
                            if (n4 == 0) {
                                final int n7 = Class7841.method25335(class8157) - 60;
                                if (n7 != 0) {
                                    int n8 = 1;
                                    int n9;
                                    n5 = (n9 = n5 + n7);
                                    if (!method26942) {
                                        n8 -= 2 * (n9 & 0x1);
                                        n9 >>= 1;
                                    }
                                    n6 = (float)(Math.pow(n2, -n9) * n8);
                                }
                            }
                            this.field18605[j][n3] = n6;
                        }
                    }
                }
            }
            else {
                this.field18605[j][0] = n6;
            }
        }
    }
    
    public void method12508() throws AACException {
        this.field18599 = this.field18598.method12587();
    }
    
    public void method12509(final int n, final float[] array) {
        final double n2 = this.field18605[n][0];
        for (int i = 0; i < array.length; ++i) {
            final int n3 = i;
            array[n3] += (float)(n2 * this.field18599[i]);
        }
    }
    
    public void method12510(final int n, final float[] array) {
        final Class4182 method12588 = this.field18598.method12588();
        final int[] method12589 = method12588.method12551();
        final int method12590 = method12588.method12554();
        final int method12591 = method12588.method12549();
        final int[][] array2 = null;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (int i = 0; i < method12590; ++i) {
            final int method12592 = method12588.method12555(i);
            for (int j = 0; j < method12591; ++j, ++n4) {
                if (array2[i][j] != 0) {
                    final float n5 = this.field18605[n][n4];
                    for (int k = 0; k < method12592; ++k) {
                        for (int l = method12589[j]; l < method12589[j + 1]; ++l) {
                            final int n6 = n3 + k * 128 + l;
                            array[n6] += n5 * this.field18599[n2 + k * 128 + l];
                        }
                    }
                }
            }
            n3 += method12592 * 128;
            n2 += method12592 * 128;
        }
    }
    
    static {
        field18597 = new float[] { 1.0905077f, 1.1892071f, 1.4142135f, 2.0f };
    }
}
