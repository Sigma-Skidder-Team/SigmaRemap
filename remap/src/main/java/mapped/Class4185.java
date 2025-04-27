// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.sourceforge.jaad.aac.AACException;

public class Class4185 implements Class4178, Class4186, Class4187
{
    private static String[] field18711;
    private final float[][] field18712;
    private final float[][] field18713;
    private final int field18714;
    private final int field18715;
    private final int field18716;
    private final int field18717;
    private final Class7108 field18718;
    private final Class7108 field18719;
    private final float[] field18720;
    private final float[][] field18721;
    
    public Class4185(final boolean b, final int n) throws AACException {
        if (!b) {
            this.field18714 = 1024;
            this.field18715 = 128;
            this.field18712 = new float[][] { Class4185.field18722, Class4185.field18726 };
            this.field18713 = new float[][] { Class4185.field18723, Class4185.field18727 };
        }
        else {
            this.field18714 = 960;
            this.field18715 = 120;
            this.field18712 = new float[][] { Class4185.field18724, Class4185.field18728 };
            this.field18713 = new float[][] { Class4185.field18725, Class4185.field18729 };
        }
        this.field18716 = (this.field18714 - this.field18715) / 2;
        this.field18717 = this.field18715 / 2;
        this.field18718 = new Class7108(this.field18715 * 2);
        this.field18719 = new Class7108(this.field18714 * 2);
        this.field18721 = new float[n][this.field18714];
        this.field18720 = new float[2 * this.field18714];
    }
    
    public void method12571(final Class303 class303, final int n, final int n2, final float[] array, final float[] array2, final int n3) {
        final float[] array3 = this.field18721[n3];
        switch (Class9421.field40419[class303.ordinal()]) {
            case 1: {
                this.field18719.method21824(array, 0, this.field18720, 0);
                for (int i = 0; i < this.field18714; ++i) {
                    array2[i] = array3[i] + this.field18720[i] * this.field18712[n2][i];
                }
                for (int j = 0; j < this.field18714; ++j) {
                    array3[j] = this.field18720[this.field18714 + j] * this.field18712[n][this.field18714 - 1 - j];
                }
                break;
            }
            case 2: {
                this.field18719.method21824(array, 0, this.field18720, 0);
                for (int k = 0; k < this.field18714; ++k) {
                    array2[k] = array3[k] + this.field18720[k] * this.field18712[n2][k];
                }
                if (this.field18716 >= 0)
                    System.arraycopy(this.field18720, this.field18714 + 0, array3, 0, this.field18716);
                for (int n4 = 0; n4 < this.field18715; ++n4) {
                    array3[this.field18716 + n4] = this.field18720[this.field18714 + this.field18716 + n4] * this.field18713[n][this.field18715 - n4 - 1];
                }
                for (int n5 = 0; n5 < this.field18716; ++n5) {
                    array3[this.field18716 + this.field18715 + n5] = 0.0f;
                }
                break;
            }
            case 3: {
                for (int n6 = 0; n6 < 8; ++n6) {
                    this.field18718.method21824(array, n6 * this.field18715, this.field18720, 2 * n6 * this.field18715);
                }
                if (this.field18716 >= 0) System.arraycopy(array3, 0, array2, 0, this.field18716);
                for (int n8 = 0; n8 < this.field18715; ++n8) {
                    array2[this.field18716 + n8] = array3[this.field18716 + n8] + this.field18720[n8] * this.field18713[n2][n8];
                    array2[this.field18716 + this.field18715 + n8] = array3[this.field18716 + this.field18715 + n8] + this.field18720[this.field18715 + n8] * this.field18713[n][this.field18715 - 1 - n8] + this.field18720[this.field18715 * 2 + n8] * this.field18713[n][n8];
                    array2[this.field18716 + 2 * this.field18715 + n8] = array3[this.field18716 + this.field18715 * 2 + n8] + this.field18720[this.field18715 * 3 + n8] * this.field18713[n][this.field18715 - 1 - n8] + this.field18720[this.field18715 * 4 + n8] * this.field18713[n][n8];
                    array2[this.field18716 + 3 * this.field18715 + n8] = array3[this.field18716 + this.field18715 * 3 + n8] + this.field18720[this.field18715 * 5 + n8] * this.field18713[n][this.field18715 - 1 - n8] + this.field18720[this.field18715 * 6 + n8] * this.field18713[n][n8];
                    if (n8 < this.field18717) {
                        array2[this.field18716 + 4 * this.field18715 + n8] = array3[this.field18716 + this.field18715 * 4 + n8] + this.field18720[this.field18715 * 7 + n8] * this.field18713[n][this.field18715 - 1 - n8] + this.field18720[this.field18715 * 8 + n8] * this.field18713[n][n8];
                    }
                }
                for (int n9 = 0; n9 < this.field18715; ++n9) {
                    if (n9 >= this.field18717) {
                        array3[this.field18716 + 4 * this.field18715 + n9 - this.field18714] = this.field18720[this.field18715 * 7 + n9] * this.field18713[n][this.field18715 - 1 - n9] + this.field18720[this.field18715 * 8 + n9] * this.field18713[n][n9];
                    }
                    array3[this.field18716 + 5 * this.field18715 + n9 - this.field18714] = this.field18720[this.field18715 * 9 + n9] * this.field18713[n][this.field18715 - 1 - n9] + this.field18720[this.field18715 * 10 + n9] * this.field18713[n][n9];
                    array3[this.field18716 + 6 * this.field18715 + n9 - this.field18714] = this.field18720[this.field18715 * 11 + n9] * this.field18713[n][this.field18715 - 1 - n9] + this.field18720[this.field18715 * 12 + n9] * this.field18713[n][n9];
                    array3[this.field18716 + 7 * this.field18715 + n9 - this.field18714] = this.field18720[this.field18715 * 13 + n9] * this.field18713[n][this.field18715 - 1 - n9] + this.field18720[this.field18715 * 14 + n9] * this.field18713[n][n9];
                    array3[this.field18716 + 8 * this.field18715 + n9 - this.field18714] = this.field18720[this.field18715 * 15 + n9] * this.field18713[n][this.field18715 - 1 - n9];
                }
                for (int n10 = 0; n10 < this.field18716; ++n10) {
                    array3[this.field18716 + this.field18715 + n10] = 0.0f;
                }
                break;
            }
            case 4: {
                this.field18719.method21824(array, 0, this.field18720, 0);
                if (this.field18716 >= 0) System.arraycopy(array3, 0, array2, 0, this.field18716);
                for (int n12 = 0; n12 < this.field18715; ++n12) {
                    array2[this.field18716 + n12] = array3[this.field18716 + n12] + this.field18720[this.field18716 + n12] * this.field18713[n2][n12];
                }
                for (int n13 = 0; n13 < this.field18716; ++n13) {
                    array2[this.field18716 + this.field18715 + n13] = array3[this.field18716 + this.field18715 + n13] + this.field18720[this.field18716 + this.field18715 + n13];
                }
                for (int n14 = 0; n14 < this.field18714; ++n14) {
                    array3[n14] = this.field18720[this.field18714 + n14] * this.field18712[n][this.field18714 - 1 - n14];
                }
                break;
            }
        }
    }
    
    public void method12572(final Class303 class303, final int n, final int n2, final float[] array, final float[] array2) {
        switch (Class9421.field40419[class303.ordinal()]) {
            case 1: {
                for (int i = this.field18714 - 1; i >= 0; --i) {
                    this.field18720[i] = array[i] * this.field18712[n2][i];
                    this.field18720[i + this.field18714] = array[i + this.field18714] * this.field18712[n][this.field18714 - 1 - i];
                }
                break;
            }
            case 2: {
                for (int j = 0; j < this.field18714; ++j) {
                    this.field18720[j] = array[j] * this.field18712[n2][j];
                }
                if (this.field18716 >= 0)
                    System.arraycopy(array, 0 + this.field18714, this.field18720, 0 + this.field18714, this.field18716);
                for (int l = 0; l < this.field18715; ++l) {
                    this.field18720[l + this.field18714 + this.field18716] = array[l + this.field18714 + this.field18716] * this.field18713[n][this.field18715 - 1 - l];
                }
                for (int n3 = 0; n3 < this.field18716; ++n3) {
                    this.field18720[n3 + this.field18714 + this.field18716 + this.field18715] = 0.0f;
                }
                break;
            }
            case 4: {
                for (int n4 = 0; n4 < this.field18716; ++n4) {
                    this.field18720[n4] = 0.0f;
                }
                for (int n5 = 0; n5 < this.field18715; ++n5) {
                    this.field18720[n5 + this.field18716] = array[n5 + this.field18716] * this.field18713[n2][n5];
                }
                for (int n6 = 0; n6 < this.field18716; ++n6) {
                    this.field18720[n6 + this.field18716 + this.field18715] = array[n6 + this.field18716 + this.field18715];
                }
                for (int n7 = 0; n7 < this.field18714; ++n7) {
                    this.field18720[n7 + this.field18714] = array[n7 + this.field18714] * this.field18712[n][this.field18714 - 1 - n7];
                }
                break;
            }
        }
        this.field18719.method21825(this.field18720, array2);
    }
    
    public float[] method12573(final int n) {
        return this.field18721[n];
    }
}
