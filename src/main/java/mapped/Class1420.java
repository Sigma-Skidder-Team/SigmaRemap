// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1420 implements Runnable
{
    private static String[] field7849;
    public final /* synthetic */ int field7850;
    public final /* synthetic */ int field7851;
    public final /* synthetic */ int field7852;
    public final /* synthetic */ int field7853;
    public final /* synthetic */ float[][][] field7854;
    public final /* synthetic */ boolean field7855;
    public final /* synthetic */ Class5934 field7856;
    
    public Class1420(final Class5934 field7856, final int field7857, final int field7858, final int field7859, final int field7860, final float[][][] field7861, final boolean field7862) {
        this.field7856 = field7856;
        this.field7850 = field7857;
        this.field7851 = field7858;
        this.field7852 = field7859;
        this.field7853 = field7860;
        this.field7854 = field7861;
        this.field7855 = field7862;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field7850];
        if (this.field7851 != -1) {
            for (int i = this.field7852; i < Class5934.method17843(this.field7856); i += this.field7853) {
                for (int j = 0; j < Class5934.method17838(this.field7856); ++j) {
                    Class5934.method17840(this.field7856).method30449(this.field7854[i][j], this.field7855);
                }
                if (Class5934.method17841(this.field7856) <= 2) {
                    if (Class5934.method17841(this.field7856) == 2) {
                        for (int k = 0; k < Class5934.method17838(this.field7856); ++k) {
                            array[k] = this.field7854[i][k][0];
                            array[Class5934.method17838(this.field7856) + k] = this.field7854[i][k][1];
                        }
                        Class5934.method17842(this.field7856).method30451(array, 0, this.field7855);
                        Class5934.method17842(this.field7856).method30451(array, Class5934.method17838(this.field7856), this.field7855);
                        for (int l = 0; l < Class5934.method17838(this.field7856); ++l) {
                            this.field7854[i][l][0] = array[l];
                            this.field7854[i][l][1] = array[Class5934.method17838(this.field7856) + l];
                        }
                    }
                }
                else {
                    for (int n = 0; n < Class5934.method17841(this.field7856); n += 4) {
                        for (int n2 = 0; n2 < Class5934.method17838(this.field7856); ++n2) {
                            final int n3 = Class5934.method17838(this.field7856) + n2;
                            array[n2] = this.field7854[i][n2][n];
                            array[n3] = this.field7854[i][n2][n + 1];
                            array[n3 + Class5934.method17838(this.field7856)] = this.field7854[i][n2][n + 2];
                            array[n3 + 2 * Class5934.method17838(this.field7856)] = this.field7854[i][n2][n + 3];
                        }
                        Class5934.method17842(this.field7856).method30451(array, 0, this.field7855);
                        Class5934.method17842(this.field7856).method30451(array, Class5934.method17838(this.field7856), this.field7855);
                        Class5934.method17842(this.field7856).method30451(array, 2 * Class5934.method17838(this.field7856), this.field7855);
                        Class5934.method17842(this.field7856).method30451(array, 3 * Class5934.method17838(this.field7856), this.field7855);
                        for (int n4 = 0; n4 < Class5934.method17838(this.field7856); ++n4) {
                            final int n5 = Class5934.method17838(this.field7856) + n4;
                            this.field7854[i][n4][n] = array[n4];
                            this.field7854[i][n4][n + 1] = array[n5];
                            this.field7854[i][n4][n + 2] = array[n5 + Class5934.method17838(this.field7856)];
                            this.field7854[i][n4][n + 3] = array[n5 + 2 * Class5934.method17838(this.field7856)];
                        }
                    }
                }
            }
        }
        else {
            for (int field7852 = this.field7852; field7852 < Class5934.method17843(this.field7856); field7852 += this.field7853) {
                for (int n6 = 0; n6 < Class5934.method17838(this.field7856); ++n6) {
                    Class5934.method17840(this.field7856).method30445(this.field7854[field7852][n6]);
                }
                if (Class5934.method17841(this.field7856) <= 2) {
                    if (Class5934.method17841(this.field7856) == 2) {
                        for (int n7 = 0; n7 < Class5934.method17838(this.field7856); ++n7) {
                            array[n7] = this.field7854[field7852][n7][0];
                            array[Class5934.method17838(this.field7856) + n7] = this.field7854[field7852][n7][1];
                        }
                        Class5934.method17842(this.field7856).method30447(array, 0);
                        Class5934.method17842(this.field7856).method30447(array, Class5934.method17838(this.field7856));
                        for (int n8 = 0; n8 < Class5934.method17838(this.field7856); ++n8) {
                            this.field7854[field7852][n8][0] = array[n8];
                            this.field7854[field7852][n8][1] = array[Class5934.method17838(this.field7856) + n8];
                        }
                    }
                }
                else {
                    for (int n9 = 0; n9 < Class5934.method17841(this.field7856); n9 += 4) {
                        for (int n10 = 0; n10 < Class5934.method17838(this.field7856); ++n10) {
                            final int n11 = Class5934.method17838(this.field7856) + n10;
                            array[n10] = this.field7854[field7852][n10][n9];
                            array[n11] = this.field7854[field7852][n10][n9 + 1];
                            array[n11 + Class5934.method17838(this.field7856)] = this.field7854[field7852][n10][n9 + 2];
                            array[n11 + 2 * Class5934.method17838(this.field7856)] = this.field7854[field7852][n10][n9 + 3];
                        }
                        Class5934.method17842(this.field7856).method30447(array, 0);
                        Class5934.method17842(this.field7856).method30447(array, Class5934.method17838(this.field7856));
                        Class5934.method17842(this.field7856).method30447(array, 2 * Class5934.method17838(this.field7856));
                        Class5934.method17842(this.field7856).method30447(array, 3 * Class5934.method17838(this.field7856));
                        for (int n12 = 0; n12 < Class5934.method17838(this.field7856); ++n12) {
                            final int n13 = Class5934.method17838(this.field7856) + n12;
                            this.field7854[field7852][n12][n9] = array[n12];
                            this.field7854[field7852][n12][n9 + 1] = array[n13];
                            this.field7854[field7852][n12][n9 + 2] = array[n13 + Class5934.method17838(this.field7856)];
                            this.field7854[field7852][n12][n9 + 3] = array[n13 + 2 * Class5934.method17838(this.field7856)];
                        }
                    }
                }
            }
        }
    }
}
