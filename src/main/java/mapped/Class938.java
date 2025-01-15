// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class938 implements Runnable
{
    private static String[] field4944;
    public final /* synthetic */ int field4945;
    public final /* synthetic */ int field4946;
    public final /* synthetic */ int field4947;
    public final /* synthetic */ int field4948;
    public final /* synthetic */ float[][][] field4949;
    public final /* synthetic */ boolean field4950;
    public final /* synthetic */ Class6498 field4951;
    
    public Class938(final Class6498 field4951, final int field4952, final int field4953, final int field4954, final int field4955, final float[][][] field4956, final boolean field4957) {
        this.field4951 = field4951;
        this.field4945 = field4952;
        this.field4946 = field4953;
        this.field4947 = field4954;
        this.field4948 = field4955;
        this.field4949 = field4956;
        this.field4950 = field4957;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field4945];
        if (this.field4946 != -1) {
            for (int i = this.field4947; i < Class6498.method19570(this.field4951); i += this.field4948) {
                for (int j = 0; j < Class6498.method19565(this.field4951); ++j) {
                    Class6498.method19567(this.field4951).method34185(this.field4949[i][j], this.field4950);
                }
                if (Class6498.method19568(this.field4951) <= 2) {
                    if (Class6498.method19568(this.field4951) == 2) {
                        for (int k = 0; k < Class6498.method19565(this.field4951); ++k) {
                            array[k] = this.field4949[i][k][0];
                            array[Class6498.method19565(this.field4951) + k] = this.field4949[i][k][1];
                        }
                        Class6498.method19569(this.field4951).method34187(array, 0, this.field4950);
                        Class6498.method19569(this.field4951).method34187(array, Class6498.method19565(this.field4951), this.field4950);
                        for (int l = 0; l < Class6498.method19565(this.field4951); ++l) {
                            this.field4949[i][l][0] = array[l];
                            this.field4949[i][l][1] = array[Class6498.method19565(this.field4951) + l];
                        }
                    }
                }
                else {
                    for (int n = 0; n < Class6498.method19568(this.field4951); n += 4) {
                        for (int n2 = 0; n2 < Class6498.method19565(this.field4951); ++n2) {
                            final int n3 = Class6498.method19565(this.field4951) + n2;
                            array[n2] = this.field4949[i][n2][n];
                            array[n3] = this.field4949[i][n2][n + 1];
                            array[n3 + Class6498.method19565(this.field4951)] = this.field4949[i][n2][n + 2];
                            array[n3 + 2 * Class6498.method19565(this.field4951)] = this.field4949[i][n2][n + 3];
                        }
                        Class6498.method19569(this.field4951).method34187(array, 0, this.field4950);
                        Class6498.method19569(this.field4951).method34187(array, Class6498.method19565(this.field4951), this.field4950);
                        Class6498.method19569(this.field4951).method34187(array, 2 * Class6498.method19565(this.field4951), this.field4950);
                        Class6498.method19569(this.field4951).method34187(array, 3 * Class6498.method19565(this.field4951), this.field4950);
                        for (int n4 = 0; n4 < Class6498.method19565(this.field4951); ++n4) {
                            final int n5 = Class6498.method19565(this.field4951) + n4;
                            this.field4949[i][n4][n] = array[n4];
                            this.field4949[i][n4][n + 1] = array[n5];
                            this.field4949[i][n4][n + 2] = array[n5 + Class6498.method19565(this.field4951)];
                            this.field4949[i][n4][n + 3] = array[n5 + 2 * Class6498.method19565(this.field4951)];
                        }
                    }
                }
            }
        }
        else {
            for (int field4947 = this.field4947; field4947 < Class6498.method19570(this.field4951); field4947 += this.field4948) {
                for (int n6 = 0; n6 < Class6498.method19565(this.field4951); ++n6) {
                    Class6498.method19567(this.field4951).method34181(this.field4949[field4947][n6], this.field4950);
                }
                if (Class6498.method19568(this.field4951) <= 2) {
                    if (Class6498.method19568(this.field4951) == 2) {
                        for (int n7 = 0; n7 < Class6498.method19565(this.field4951); ++n7) {
                            array[n7] = this.field4949[field4947][n7][0];
                            array[Class6498.method19565(this.field4951) + n7] = this.field4949[field4947][n7][1];
                        }
                        Class6498.method19569(this.field4951).method34183(array, 0, this.field4950);
                        Class6498.method19569(this.field4951).method34183(array, Class6498.method19565(this.field4951), this.field4950);
                        for (int n8 = 0; n8 < Class6498.method19565(this.field4951); ++n8) {
                            this.field4949[field4947][n8][0] = array[n8];
                            this.field4949[field4947][n8][1] = array[Class6498.method19565(this.field4951) + n8];
                        }
                    }
                }
                else {
                    for (int n9 = 0; n9 < Class6498.method19568(this.field4951); n9 += 4) {
                        for (int n10 = 0; n10 < Class6498.method19565(this.field4951); ++n10) {
                            final int n11 = Class6498.method19565(this.field4951) + n10;
                            array[n10] = this.field4949[field4947][n10][n9];
                            array[n11] = this.field4949[field4947][n10][n9 + 1];
                            array[n11 + Class6498.method19565(this.field4951)] = this.field4949[field4947][n10][n9 + 2];
                            array[n11 + 2 * Class6498.method19565(this.field4951)] = this.field4949[field4947][n10][n9 + 3];
                        }
                        Class6498.method19569(this.field4951).method34183(array, 0, this.field4950);
                        Class6498.method19569(this.field4951).method34183(array, Class6498.method19565(this.field4951), this.field4950);
                        Class6498.method19569(this.field4951).method34183(array, 2 * Class6498.method19565(this.field4951), this.field4950);
                        Class6498.method19569(this.field4951).method34183(array, 3 * Class6498.method19565(this.field4951), this.field4950);
                        for (int n12 = 0; n12 < Class6498.method19565(this.field4951); ++n12) {
                            final int n13 = Class6498.method19565(this.field4951) + n12;
                            this.field4949[field4947][n12][n9] = array[n12];
                            this.field4949[field4947][n12][n9 + 1] = array[n13];
                            this.field4949[field4947][n12][n9 + 2] = array[n13 + Class6498.method19565(this.field4951)];
                            this.field4949[field4947][n12][n9 + 3] = array[n13 + 2 * Class6498.method19565(this.field4951)];
                        }
                    }
                }
            }
        }
    }
}
