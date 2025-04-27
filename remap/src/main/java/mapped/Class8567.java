// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class8567 implements Class8568
{
    private final int field35993;
    private final float[][] field35994;
    private final float[][] field35995;
    private final float[] field35996;
    private final float[] field35997;
    private final float[] field35998;
    private final float[] field35999;
    private final float[] field36000;
    private final float[] field36001;
    
    public Class8567(final int n) throws AACException {
        switch (this.field35993 = n) {
            case 64: {
                this.field35994 = Class8567.field36003;
                break;
            }
            case 512: {
                this.field35994 = Class8567.field36002;
                break;
            }
            case 60: {
                this.field35994 = Class8567.field36005;
                break;
            }
            case 480: {
                this.field35994 = Class8567.field36004;
                break;
            }
            default: {
                throw new Class2348("unexpected FFT length: " + n);
            }
        }
        this.field35995 = new float[n][2];
        this.field35996 = new float[2];
        this.field35997 = new float[2];
        this.field35998 = new float[2];
        this.field35999 = new float[2];
        this.field36000 = new float[2];
        this.field36001 = new float[2];
    }
    
    public void method28801(final float[][] array, final boolean b) {
        final int n = b ? 2 : 1;
        final int n2 = b ? this.field35993 : 1;
        int n3 = 0;
        for (int i = 0; i < this.field35993; ++i) {
            this.field35995[i][0] = array[n3][0];
            this.field35995[i][1] = array[n3][1];
            int n4;
            for (n4 = this.field35993 >> 1; n3 >= n4 && n4 > 0; n3 -= n4, n4 >>= 1) {}
            n3 += n4;
        }
        for (int j = 0; j < this.field35993; ++j) {
            array[j][0] = this.field35995[j][0];
            array[j][1] = this.field35995[j][1];
        }
        for (int k = 0; k < this.field35993; k += 4) {
            this.field35996[0] = array[k][0] + array[k + 1][0];
            this.field35996[1] = array[k][1] + array[k + 1][1];
            this.field35997[0] = array[k + 2][0] + array[k + 3][0];
            this.field35997[1] = array[k + 2][1] + array[k + 3][1];
            this.field35998[0] = array[k][0] - array[k + 1][0];
            this.field35998[1] = array[k][1] - array[k + 1][1];
            this.field35999[0] = array[k + 2][0] - array[k + 3][0];
            this.field35999[1] = array[k + 2][1] - array[k + 3][1];
            array[k][0] = this.field35996[0] + this.field35997[0];
            array[k][1] = this.field35996[1] + this.field35997[1];
            array[k + 2][0] = this.field35996[0] - this.field35997[0];
            array[k + 2][1] = this.field35996[1] - this.field35997[1];
            this.field36000[0] = this.field35998[0] - this.field35999[1];
            this.field36000[1] = this.field35998[1] + this.field35999[0];
            this.field36001[0] = this.field35998[0] + this.field35999[1];
            this.field36001[1] = this.field35998[1] - this.field35999[0];
            if (!b) {
                array[k + 1][0] = this.field36000[0];
                array[k + 1][1] = this.field36000[1];
                array[k + 3][0] = this.field36001[0];
                array[k + 3][1] = this.field36001[1];
            }
            else {
                array[k + 1][0] = this.field36001[0];
                array[k + 1][1] = this.field36001[1];
                array[k + 3][0] = this.field36000[0];
                array[k + 3][1] = this.field36000[1];
            }
        }
        for (int l = 4; l < this.field35993; l <<= 1) {
            final int n5 = l << 1;
            final int n6 = this.field35993 / n5;
            for (int n7 = 0; n7 < this.field35993; n7 += n5) {
                for (int n8 = 0; n8 < l; ++n8) {
                    final int n9 = n8 * n6;
                    final float n10 = this.field35994[n9][0];
                    final float n11 = this.field35994[n9][n];
                    final float n12 = array[l + n7 + n8][0] * n10 - array[l + n7 + n8][1] * n11;
                    final float n13 = array[l + n7 + n8][0] * n11 + array[l + n7 + n8][1] * n10;
                    array[l + n7 + n8][0] = (array[n7 + n8][0] - n12) * n2;
                    array[l + n7 + n8][1] = (array[n7 + n8][1] - n13) * n2;
                    array[n7 + n8][0] = (array[n7 + n8][0] + n12) * n2;
                    array[n7 + n8][1] = (array[n7 + n8][1] + n13) * n2;
                }
            }
        }
    }
}
