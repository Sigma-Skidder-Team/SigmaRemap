// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1312 implements Runnable
{
    private static String[] field7194;
    public final /* synthetic */ int field7195;
    public final /* synthetic */ int field7196;
    public final /* synthetic */ int field7197;
    public final /* synthetic */ int field7198;
    public final /* synthetic */ float[][][] field7199;
    public final /* synthetic */ boolean field7200;
    public final /* synthetic */ Class9117 field7201;
    
    public Class1312(final Class9117 field7201, final int field7202, final int field7203, final int field7204, final int field7205, final float[][][] field7206, final boolean field7207) {
        this.field7201 = field7201;
        this.field7195 = field7202;
        this.field7196 = field7203;
        this.field7197 = field7204;
        this.field7198 = field7205;
        this.field7199 = field7206;
        this.field7200 = field7207;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field7195];
        if (this.field7196 != -1) {
            if (Class9117.method33006(this.field7201) <= 2) {
                if (Class9117.method33006(this.field7201) == 2) {
                    for (int i = this.field7197; i < Class9117.method33003(this.field7201); i += this.field7198) {
                        for (int j = 0; j < Class9117.method33008(this.field7201); ++j) {
                            array[j] = this.field7199[j][i][0];
                            array[Class9117.method33008(this.field7201) + j] = this.field7199[j][i][1];
                        }
                        Class9117.method33009(this.field7201).method29695(array, 0, this.field7200);
                        Class9117.method33009(this.field7201).method29695(array, Class9117.method33008(this.field7201), this.field7200);
                        for (int k = 0; k < Class9117.method33008(this.field7201); ++k) {
                            this.field7199[k][i][0] = array[k];
                            this.field7199[k][i][1] = array[Class9117.method33008(this.field7201) + k];
                        }
                    }
                }
            }
            else {
                for (int l = this.field7197; l < Class9117.method33003(this.field7201); l += this.field7198) {
                    for (int n = 0; n < Class9117.method33006(this.field7201); n += 4) {
                        for (int n2 = 0; n2 < Class9117.method33008(this.field7201); ++n2) {
                            final int n3 = Class9117.method33008(this.field7201) + n2;
                            array[n2] = this.field7199[n2][l][n];
                            array[n3] = this.field7199[n2][l][n + 1];
                            array[n3 + Class9117.method33008(this.field7201)] = this.field7199[n2][l][n + 2];
                            array[n3 + 2 * Class9117.method33008(this.field7201)] = this.field7199[n2][l][n + 3];
                        }
                        Class9117.method33009(this.field7201).method29695(array, 0, this.field7200);
                        Class9117.method33009(this.field7201).method29695(array, Class9117.method33008(this.field7201), this.field7200);
                        Class9117.method33009(this.field7201).method29695(array, 2 * Class9117.method33008(this.field7201), this.field7200);
                        Class9117.method33009(this.field7201).method29695(array, 3 * Class9117.method33008(this.field7201), this.field7200);
                        for (int n4 = 0; n4 < Class9117.method33008(this.field7201); ++n4) {
                            final int n5 = Class9117.method33008(this.field7201) + n4;
                            this.field7199[n4][l][n] = array[n4];
                            this.field7199[n4][l][n + 1] = array[n5];
                            this.field7199[n4][l][n + 2] = array[n5 + Class9117.method33008(this.field7201)];
                            this.field7199[n4][l][n + 3] = array[n5 + 2 * Class9117.method33008(this.field7201)];
                        }
                    }
                }
            }
        }
        else if (Class9117.method33006(this.field7201) <= 2) {
            if (Class9117.method33006(this.field7201) == 2) {
                for (int field7197 = this.field7197; field7197 < Class9117.method33003(this.field7201); field7197 += this.field7198) {
                    for (int n6 = 0; n6 < Class9117.method33008(this.field7201); ++n6) {
                        array[n6] = this.field7199[n6][field7197][0];
                        array[Class9117.method33008(this.field7201) + n6] = this.field7199[n6][field7197][1];
                    }
                    Class9117.method33009(this.field7201).method29691(array, 0, this.field7200);
                    Class9117.method33009(this.field7201).method29691(array, Class9117.method33008(this.field7201), this.field7200);
                    for (int n7 = 0; n7 < Class9117.method33008(this.field7201); ++n7) {
                        this.field7199[n7][field7197][0] = array[n7];
                        this.field7199[n7][field7197][1] = array[Class9117.method33008(this.field7201) + n7];
                    }
                }
            }
        }
        else {
            for (int field7198 = this.field7197; field7198 < Class9117.method33003(this.field7201); field7198 += this.field7198) {
                for (int n8 = 0; n8 < Class9117.method33006(this.field7201); n8 += 4) {
                    for (int n9 = 0; n9 < Class9117.method33008(this.field7201); ++n9) {
                        final int n10 = Class9117.method33008(this.field7201) + n9;
                        array[n9] = this.field7199[n9][field7198][n8];
                        array[n10] = this.field7199[n9][field7198][n8 + 1];
                        array[n10 + Class9117.method33008(this.field7201)] = this.field7199[n9][field7198][n8 + 2];
                        array[n10 + 2 * Class9117.method33008(this.field7201)] = this.field7199[n9][field7198][n8 + 3];
                    }
                    Class9117.method33009(this.field7201).method29691(array, 0, this.field7200);
                    Class9117.method33009(this.field7201).method29691(array, Class9117.method33008(this.field7201), this.field7200);
                    Class9117.method33009(this.field7201).method29691(array, 2 * Class9117.method33008(this.field7201), this.field7200);
                    Class9117.method33009(this.field7201).method29691(array, 3 * Class9117.method33008(this.field7201), this.field7200);
                    for (int n11 = 0; n11 < Class9117.method33008(this.field7201); ++n11) {
                        final int n12 = Class9117.method33008(this.field7201) + n11;
                        this.field7199[n11][field7198][n8] = array[n11];
                        this.field7199[n11][field7198][n8 + 1] = array[n12];
                        this.field7199[n11][field7198][n8 + 2] = array[n12 + Class9117.method33008(this.field7201)];
                        this.field7199[n11][field7198][n8 + 3] = array[n12 + 2 * Class9117.method33008(this.field7201)];
                    }
                }
            }
        }
    }
}
