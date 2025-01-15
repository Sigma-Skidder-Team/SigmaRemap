// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1598 implements Runnable
{
    private static String[] field8921;
    public final /* synthetic */ int field8922;
    public final /* synthetic */ int field8923;
    public final /* synthetic */ int field8924;
    public final /* synthetic */ int field8925;
    public final /* synthetic */ float[][][] field8926;
    public final /* synthetic */ boolean field8927;
    public final /* synthetic */ Class5934 field8928;
    
    public Class1598(final Class5934 field8928, final int field8929, final int field8930, final int field8931, final int field8932, final float[][][] field8933, final boolean field8934) {
        this.field8928 = field8928;
        this.field8922 = field8929;
        this.field8923 = field8930;
        this.field8924 = field8931;
        this.field8925 = field8932;
        this.field8926 = field8933;
        this.field8927 = field8934;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field8922];
        if (this.field8923 != -1) {
            if (Class5934.method17841(this.field8928) <= 2) {
                if (Class5934.method17841(this.field8928) == 2) {
                    for (int i = this.field8924; i < Class5934.method17838(this.field8928); i += this.field8925) {
                        for (int j = 0; j < Class5934.method17843(this.field8928); ++j) {
                            array[j] = this.field8926[j][i][0];
                            array[Class5934.method17843(this.field8928) + j] = this.field8926[j][i][1];
                        }
                        Class5934.method17844(this.field8928).method30451(array, 0, this.field8927);
                        Class5934.method17844(this.field8928).method30451(array, Class5934.method17843(this.field8928), this.field8927);
                        for (int k = 0; k < Class5934.method17843(this.field8928); ++k) {
                            this.field8926[k][i][0] = array[k];
                            this.field8926[k][i][1] = array[Class5934.method17843(this.field8928) + k];
                        }
                    }
                }
            }
            else {
                for (int l = this.field8924; l < Class5934.method17838(this.field8928); l += this.field8925) {
                    for (int n = 0; n < Class5934.method17841(this.field8928); n += 4) {
                        for (int n2 = 0; n2 < Class5934.method17843(this.field8928); ++n2) {
                            final int n3 = Class5934.method17843(this.field8928) + n2;
                            array[n2] = this.field8926[n2][l][n];
                            array[n3] = this.field8926[n2][l][n + 1];
                            array[n3 + Class5934.method17843(this.field8928)] = this.field8926[n2][l][n + 2];
                            array[n3 + 2 * Class5934.method17843(this.field8928)] = this.field8926[n2][l][n + 3];
                        }
                        Class5934.method17844(this.field8928).method30451(array, 0, this.field8927);
                        Class5934.method17844(this.field8928).method30451(array, Class5934.method17843(this.field8928), this.field8927);
                        Class5934.method17844(this.field8928).method30451(array, 2 * Class5934.method17843(this.field8928), this.field8927);
                        Class5934.method17844(this.field8928).method30451(array, 3 * Class5934.method17843(this.field8928), this.field8927);
                        for (int n4 = 0; n4 < Class5934.method17843(this.field8928); ++n4) {
                            final int n5 = Class5934.method17843(this.field8928) + n4;
                            this.field8926[n4][l][n] = array[n4];
                            this.field8926[n4][l][n + 1] = array[n5];
                            this.field8926[n4][l][n + 2] = array[n5 + Class5934.method17843(this.field8928)];
                            this.field8926[n4][l][n + 3] = array[n5 + 2 * Class5934.method17843(this.field8928)];
                        }
                    }
                }
            }
        }
        else if (Class5934.method17841(this.field8928) <= 2) {
            if (Class5934.method17841(this.field8928) == 2) {
                for (int field8924 = this.field8924; field8924 < Class5934.method17838(this.field8928); field8924 += this.field8925) {
                    for (int n6 = 0; n6 < Class5934.method17843(this.field8928); ++n6) {
                        array[n6] = this.field8926[n6][field8924][0];
                        array[Class5934.method17843(this.field8928) + n6] = this.field8926[n6][field8924][1];
                    }
                    Class5934.method17844(this.field8928).method30447(array, 0);
                    Class5934.method17844(this.field8928).method30447(array, Class5934.method17843(this.field8928));
                    for (int n7 = 0; n7 < Class5934.method17843(this.field8928); ++n7) {
                        this.field8926[n7][field8924][0] = array[n7];
                        this.field8926[n7][field8924][1] = array[Class5934.method17843(this.field8928) + n7];
                    }
                }
            }
        }
        else {
            for (int field8925 = this.field8924; field8925 < Class5934.method17838(this.field8928); field8925 += this.field8925) {
                for (int n8 = 0; n8 < Class5934.method17841(this.field8928); n8 += 4) {
                    for (int n9 = 0; n9 < Class5934.method17843(this.field8928); ++n9) {
                        final int n10 = Class5934.method17843(this.field8928) + n9;
                        array[n9] = this.field8926[n9][field8925][n8];
                        array[n10] = this.field8926[n9][field8925][n8 + 1];
                        array[n10 + Class5934.method17843(this.field8928)] = this.field8926[n9][field8925][n8 + 2];
                        array[n10 + 2 * Class5934.method17843(this.field8928)] = this.field8926[n9][field8925][n8 + 3];
                    }
                    Class5934.method17844(this.field8928).method30447(array, 0);
                    Class5934.method17844(this.field8928).method30447(array, Class5934.method17843(this.field8928));
                    Class5934.method17844(this.field8928).method30447(array, 2 * Class5934.method17843(this.field8928));
                    Class5934.method17844(this.field8928).method30447(array, 3 * Class5934.method17843(this.field8928));
                    for (int n11 = 0; n11 < Class5934.method17843(this.field8928); ++n11) {
                        final int n12 = Class5934.method17843(this.field8928) + n11;
                        this.field8926[n11][field8925][n8] = array[n11];
                        this.field8926[n11][field8925][n8 + 1] = array[n12];
                        this.field8926[n11][field8925][n8 + 2] = array[n12 + Class5934.method17843(this.field8928)];
                        this.field8926[n11][field8925][n8 + 3] = array[n12 + 2 * Class5934.method17843(this.field8928)];
                    }
                }
            }
        }
    }
}
