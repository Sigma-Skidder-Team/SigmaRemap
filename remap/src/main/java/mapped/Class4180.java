// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class4180 implements Class4178, Class4181
{
    private static final int field18652 = 20;
    private static final int[] field18653;
    private static final int[] field18654;
    private final int[] field18655;
    private final int[][] field18656;
    private final int[][] field18657;
    private final boolean[][] field18658;
    private final float[][][] field18659;
    
    public Class4180() {
        this.field18655 = new int[8];
        this.field18656 = new int[8][4];
        this.field18658 = new boolean[8][4];
        this.field18657 = new int[8][4];
        this.field18659 = new float[8][4][20];
    }
    
    public void method12545(final Class8157 class8157, final Class4182 class8158) throws AACException {
        final int method12553 = class8158.method12553();
        final int[] array = class8158.method12557() ? Class4180.field18653 : Class4180.field18654;
        for (int i = 0; i < method12553; ++i) {
            if ((this.field18655[i] = class8157.method26940(array[0])) != 0) {
                final int method12554 = class8157.method26941();
                for (int j = 0; j < this.field18655[i]; ++j) {
                    this.field18656[i][j] = class8157.method26940(array[1]);
                    if ((this.field18657[i][j] = class8157.method26940(array[2])) > 20) {
                        throw new Class2348("TNS filter out of range: " + this.field18657[i][j]);
                    }
                    if (this.field18657[i][j] != 0) {
                        this.field18658[i][j] = class8157.method26942();
                        final int method12555 = class8157.method26941();
                        final int n = method12554 + 3 - method12555;
                        final int n2 = 2 * method12555 + method12554;
                        for (int k = 0; k < this.field18657[i][j]; ++k) {
                            this.field18659[i][j][k] = Class4180.field18664[n2][class8157.method26940(n)];
                        }
                    }
                }
            }
        }
    }
    
    public void method12546(final Class4192 class4192, final float[] array, final Class2077 class4193, final boolean b) {
    }
    
    static {
        field18653 = new int[] { 1, 4, 3 };
        field18654 = new int[] { 2, 6, 5 };
    }
}
