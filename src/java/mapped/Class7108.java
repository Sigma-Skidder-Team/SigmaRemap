// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class7108 implements Class7109
{
    private final int field27726;
    private final int field27727;
    private final int field27728;
    private final int field27729;
    private final float[][] field27730;
    private final Class8567 field27731;
    private final float[][] field27732;
    private final float[] field27733;
    
    public Class7108(final int n) throws AACException {
        this.field27726 = n;
        this.field27727 = n >> 1;
        this.field27728 = n >> 2;
        this.field27729 = n >> 3;
        Label_0141: {
            switch (n) {
                case 2048: {
                    this.field27730 = Class7108.field27734;
                    break Label_0141;
                }
                case 256: {
                    this.field27730 = Class7108.field27735;
                    break Label_0141;
                }
                case 1920: {
                    this.field27730 = Class7108.field27736;
                    break Label_0141;
                }
                case 240: {
                    this.field27730 = Class7108.field27737;
                    break;
                }
            }
            throw new Class2348("unsupported MDCT length: " + n);
        }
        this.field27731 = new Class8567(this.field27728);
        this.field27732 = new float[this.field27728][2];
        this.field27733 = new float[2];
    }
    
    public void method21824(final float[] array, final int n, final float[] array2, final int n2) {
        for (int i = 0; i < this.field27728; ++i) {
            this.field27732[i][1] = array[n + 2 * i] * this.field27730[i][0] + array[n + this.field27727 - 1 - 2 * i] * this.field27730[i][1];
            this.field27732[i][0] = array[n + this.field27727 - 1 - 2 * i] * this.field27730[i][0] - array[n + 2 * i] * this.field27730[i][1];
        }
        this.field27731.method28801(this.field27732, false);
        for (int j = 0; j < this.field27728; ++j) {
            this.field27733[0] = this.field27732[j][0];
            this.field27733[1] = this.field27732[j][1];
            this.field27732[j][1] = this.field27733[1] * this.field27730[j][0] + this.field27733[0] * this.field27730[j][1];
            this.field27732[j][0] = this.field27733[0] * this.field27730[j][0] - this.field27733[1] * this.field27730[j][1];
        }
        for (int k = 0; k < this.field27729; k += 2) {
            array2[n2 + 2 * k] = this.field27732[this.field27729 + k][1];
            array2[n2 + 2 + 2 * k] = this.field27732[this.field27729 + 1 + k][1];
            array2[n2 + 1 + 2 * k] = -this.field27732[this.field27729 - 1 - k][0];
            array2[n2 + 3 + 2 * k] = -this.field27732[this.field27729 - 2 - k][0];
            array2[n2 + this.field27728 + 2 * k] = this.field27732[k][0];
            array2[n2 + this.field27728 + 2 + 2 * k] = this.field27732[1 + k][0];
            array2[n2 + this.field27728 + 1 + 2 * k] = -this.field27732[this.field27728 - 1 - k][1];
            array2[n2 + this.field27728 + 3 + 2 * k] = -this.field27732[this.field27728 - 2 - k][1];
            array2[n2 + this.field27727 + 2 * k] = this.field27732[this.field27729 + k][0];
            array2[n2 + this.field27727 + 2 + 2 * k] = this.field27732[this.field27729 + 1 + k][0];
            array2[n2 + this.field27727 + 1 + 2 * k] = -this.field27732[this.field27729 - 1 - k][1];
            array2[n2 + this.field27727 + 3 + 2 * k] = -this.field27732[this.field27729 - 2 - k][1];
            array2[n2 + this.field27727 + this.field27728 + 2 * k] = -this.field27732[k][1];
            array2[n2 + this.field27727 + this.field27728 + 2 + 2 * k] = -this.field27732[1 + k][1];
            array2[n2 + this.field27727 + this.field27728 + 1 + 2 * k] = this.field27732[this.field27728 - 1 - k][0];
            array2[n2 + this.field27727 + this.field27728 + 3 + 2 * k] = this.field27732[this.field27728 - 2 - k][0];
        }
    }
    
    public void method21825(final float[] array, final float[] array2) {
        for (int i = 0; i < this.field27729; ++i) {
            final int n = i << 1;
            this.field27733[0] = array[this.field27726 - this.field27728 - 1 - n] + array[this.field27726 - this.field27728 + n];
            this.field27733[1] = array[this.field27728 + n] - array[this.field27728 - 1 - n];
            this.field27732[i][0] = this.field27733[0] * this.field27730[i][0] + this.field27733[1] * this.field27730[i][1];
            this.field27732[i][1] = this.field27733[1] * this.field27730[i][0] - this.field27733[0] * this.field27730[i][1];
            final float[] array3 = this.field27732[i];
            final int n2 = 0;
            array3[n2] *= this.field27726;
            final float[] array4 = this.field27732[i];
            final int n3 = 1;
            array4[n3] *= this.field27726;
            this.field27733[0] = array[this.field27727 - 1 - n] - array[n];
            this.field27733[1] = array[this.field27727 + n] + array[this.field27726 - 1 - n];
            this.field27732[i + this.field27729][0] = this.field27733[0] * this.field27730[i + this.field27729][0] + this.field27733[1] * this.field27730[i + this.field27729][1];
            this.field27732[i + this.field27729][1] = this.field27733[1] * this.field27730[i + this.field27729][0] - this.field27733[0] * this.field27730[i + this.field27729][1];
            final float[] array5 = this.field27732[i + this.field27729];
            final int n4 = 0;
            array5[n4] *= this.field27726;
            final float[] array6 = this.field27732[i + this.field27729];
            final int n5 = 1;
            array6[n5] *= this.field27726;
        }
        this.field27731.method28801(this.field27732, true);
        for (int j = 0; j < this.field27728; ++j) {
            final int n6 = j << 1;
            this.field27733[0] = this.field27732[j][0] * this.field27730[j][0] + this.field27732[j][1] * this.field27730[j][1];
            this.field27733[1] = this.field27732[j][1] * this.field27730[j][0] - this.field27732[j][0] * this.field27730[j][1];
            array2[n6] = -this.field27733[0];
            array2[this.field27727 - 1 - n6] = this.field27733[1];
            array2[this.field27727 + n6] = -this.field27733[1];
            array2[this.field27726 - 1 - n6] = this.field27733[0];
        }
    }
}
