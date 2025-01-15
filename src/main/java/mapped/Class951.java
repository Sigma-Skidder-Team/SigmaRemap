// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class951 implements Runnable
{
    private static String[] field5031;
    public final /* synthetic */ int field5032;
    public final /* synthetic */ int field5033;
    public final /* synthetic */ int field5034;
    public final /* synthetic */ int field5035;
    public final /* synthetic */ float[][][] field5036;
    public final /* synthetic */ boolean field5037;
    public final /* synthetic */ Class9117 field5038;
    
    public Class951(final Class9117 field5038, final int field5039, final int field5040, final int field5041, final int field5042, final float[][][] field5043, final boolean field5044) {
        this.field5038 = field5038;
        this.field5032 = field5039;
        this.field5033 = field5040;
        this.field5034 = field5041;
        this.field5035 = field5042;
        this.field5036 = field5043;
        this.field5037 = field5044;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field5032];
        if (this.field5033 != -1) {
            for (int i = this.field5034; i < Class9117.method33008(this.field5038); i += this.field5035) {
                for (int j = 0; j < Class9117.method33003(this.field5038); ++j) {
                    Class9117.method33005(this.field5038).method29693(this.field5036[i][j], this.field5037);
                }
                if (Class9117.method33006(this.field5038) <= 2) {
                    if (Class9117.method33006(this.field5038) == 2) {
                        for (int k = 0; k < Class9117.method33003(this.field5038); ++k) {
                            array[k] = this.field5036[i][k][0];
                            array[Class9117.method33003(this.field5038) + k] = this.field5036[i][k][1];
                        }
                        Class9117.method33007(this.field5038).method29695(array, 0, this.field5037);
                        Class9117.method33007(this.field5038).method29695(array, Class9117.method33003(this.field5038), this.field5037);
                        for (int l = 0; l < Class9117.method33003(this.field5038); ++l) {
                            this.field5036[i][l][0] = array[l];
                            this.field5036[i][l][1] = array[Class9117.method33003(this.field5038) + l];
                        }
                    }
                }
                else {
                    for (int n = 0; n < Class9117.method33006(this.field5038); n += 4) {
                        for (int n2 = 0; n2 < Class9117.method33003(this.field5038); ++n2) {
                            final int n3 = Class9117.method33003(this.field5038) + n2;
                            array[n2] = this.field5036[i][n2][n];
                            array[n3] = this.field5036[i][n2][n + 1];
                            array[n3 + Class9117.method33003(this.field5038)] = this.field5036[i][n2][n + 2];
                            array[n3 + 2 * Class9117.method33003(this.field5038)] = this.field5036[i][n2][n + 3];
                        }
                        Class9117.method33007(this.field5038).method29695(array, 0, this.field5037);
                        Class9117.method33007(this.field5038).method29695(array, Class9117.method33003(this.field5038), this.field5037);
                        Class9117.method33007(this.field5038).method29695(array, 2 * Class9117.method33003(this.field5038), this.field5037);
                        Class9117.method33007(this.field5038).method29695(array, 3 * Class9117.method33003(this.field5038), this.field5037);
                        for (int n4 = 0; n4 < Class9117.method33003(this.field5038); ++n4) {
                            final int n5 = Class9117.method33003(this.field5038) + n4;
                            this.field5036[i][n4][n] = array[n4];
                            this.field5036[i][n4][n + 1] = array[n5];
                            this.field5036[i][n4][n + 2] = array[n5 + Class9117.method33003(this.field5038)];
                            this.field5036[i][n4][n + 3] = array[n5 + 2 * Class9117.method33003(this.field5038)];
                        }
                    }
                }
            }
        }
        else {
            for (int field5034 = this.field5034; field5034 < Class9117.method33008(this.field5038); field5034 += this.field5035) {
                for (int n6 = 0; n6 < Class9117.method33003(this.field5038); ++n6) {
                    Class9117.method33005(this.field5038).method29689(this.field5036[field5034][n6], this.field5037);
                }
                if (Class9117.method33006(this.field5038) <= 2) {
                    if (Class9117.method33006(this.field5038) == 2) {
                        for (int n7 = 0; n7 < Class9117.method33003(this.field5038); ++n7) {
                            array[n7] = this.field5036[field5034][n7][0];
                            array[Class9117.method33003(this.field5038) + n7] = this.field5036[field5034][n7][1];
                        }
                        Class9117.method33007(this.field5038).method29691(array, 0, this.field5037);
                        Class9117.method33007(this.field5038).method29691(array, Class9117.method33003(this.field5038), this.field5037);
                        for (int n8 = 0; n8 < Class9117.method33003(this.field5038); ++n8) {
                            this.field5036[field5034][n8][0] = array[n8];
                            this.field5036[field5034][n8][1] = array[Class9117.method33003(this.field5038) + n8];
                        }
                    }
                }
                else {
                    for (int n9 = 0; n9 < Class9117.method33006(this.field5038); n9 += 4) {
                        for (int n10 = 0; n10 < Class9117.method33003(this.field5038); ++n10) {
                            final int n11 = Class9117.method33003(this.field5038) + n10;
                            array[n10] = this.field5036[field5034][n10][n9];
                            array[n11] = this.field5036[field5034][n10][n9 + 1];
                            array[n11 + Class9117.method33003(this.field5038)] = this.field5036[field5034][n10][n9 + 2];
                            array[n11 + 2 * Class9117.method33003(this.field5038)] = this.field5036[field5034][n10][n9 + 3];
                        }
                        Class9117.method33007(this.field5038).method29691(array, 0, this.field5037);
                        Class9117.method33007(this.field5038).method29691(array, Class9117.method33003(this.field5038), this.field5037);
                        Class9117.method33007(this.field5038).method29691(array, 2 * Class9117.method33003(this.field5038), this.field5037);
                        Class9117.method33007(this.field5038).method29691(array, 3 * Class9117.method33003(this.field5038), this.field5037);
                        for (int n12 = 0; n12 < Class9117.method33003(this.field5038); ++n12) {
                            final int n13 = Class9117.method33003(this.field5038) + n12;
                            this.field5036[field5034][n12][n9] = array[n12];
                            this.field5036[field5034][n12][n9 + 1] = array[n13];
                            this.field5036[field5034][n12][n9 + 2] = array[n13 + Class9117.method33003(this.field5038)];
                            this.field5036[field5034][n12][n9 + 3] = array[n13 + 2 * Class9117.method33003(this.field5038)];
                        }
                    }
                }
            }
        }
    }
}
