// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1240 implements Runnable
{
    private static String[] field6747;
    public final /* synthetic */ int field6748;
    public final /* synthetic */ int field6749;
    public final /* synthetic */ int field6750;
    public final /* synthetic */ int field6751;
    public final /* synthetic */ double[] field6752;
    public final /* synthetic */ boolean field6753;
    public final /* synthetic */ Class5815 field6754;
    
    public Class1240(final Class5815 field6754, final int field6755, final int field6756, final int field6757, final int field6758, final double[] field6759, final boolean field6760) {
        this.field6754 = field6754;
        this.field6748 = field6755;
        this.field6749 = field6756;
        this.field6750 = field6757;
        this.field6751 = field6758;
        this.field6752 = field6759;
        this.field6753 = field6760;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field6748];
        if (this.field6749 != -1) {
            for (int i = this.field6750; i < Class5815.method17503(this.field6754); i += this.field6751) {
                final int n = i * Class5815.method17497(this.field6754);
                for (int j = 0; j < Class5815.method17498(this.field6754); ++j) {
                    Class5815.method17500(this.field6754).method21392(this.field6752, n + j * Class5815.method17499(this.field6754), this.field6753);
                }
                if (Class5815.method17501(this.field6754) <= 2) {
                    if (Class5815.method17501(this.field6754) == 2) {
                        for (int k = 0; k < Class5815.method17498(this.field6754); ++k) {
                            final int n2 = n + k * Class5815.method17499(this.field6754);
                            array[k] = this.field6752[n2];
                            array[Class5815.method17498(this.field6754) + k] = this.field6752[n2 + 1];
                        }
                        Class5815.method17502(this.field6754).method21392(array, 0, this.field6753);
                        Class5815.method17502(this.field6754).method21392(array, Class5815.method17498(this.field6754), this.field6753);
                        for (int l = 0; l < Class5815.method17498(this.field6754); ++l) {
                            final int n3 = n + l * Class5815.method17499(this.field6754);
                            this.field6752[n3] = array[l];
                            this.field6752[n3 + 1] = array[Class5815.method17498(this.field6754) + l];
                        }
                    }
                }
                else {
                    for (int n4 = 0; n4 < Class5815.method17501(this.field6754); n4 += 4) {
                        for (int n5 = 0; n5 < Class5815.method17498(this.field6754); ++n5) {
                            final int n6 = n + n5 * Class5815.method17499(this.field6754) + n4;
                            final int n7 = Class5815.method17498(this.field6754) + n5;
                            array[n5] = this.field6752[n6];
                            array[n7] = this.field6752[n6 + 1];
                            array[n7 + Class5815.method17498(this.field6754)] = this.field6752[n6 + 2];
                            array[n7 + 2 * Class5815.method17498(this.field6754)] = this.field6752[n6 + 3];
                        }
                        Class5815.method17502(this.field6754).method21392(array, 0, this.field6753);
                        Class5815.method17502(this.field6754).method21392(array, Class5815.method17498(this.field6754), this.field6753);
                        Class5815.method17502(this.field6754).method21392(array, 2 * Class5815.method17498(this.field6754), this.field6753);
                        Class5815.method17502(this.field6754).method21392(array, 3 * Class5815.method17498(this.field6754), this.field6753);
                        for (int n8 = 0; n8 < Class5815.method17498(this.field6754); ++n8) {
                            final int n9 = n + n8 * Class5815.method17499(this.field6754) + n4;
                            final int n10 = Class5815.method17498(this.field6754) + n8;
                            this.field6752[n9] = array[n8];
                            this.field6752[n9 + 1] = array[n10];
                            this.field6752[n9 + 2] = array[n10 + Class5815.method17498(this.field6754)];
                            this.field6752[n9 + 3] = array[n10 + 2 * Class5815.method17498(this.field6754)];
                        }
                    }
                }
            }
        }
        else {
            for (int field6750 = this.field6750; field6750 < Class5815.method17503(this.field6754); field6750 += this.field6751) {
                final int n11 = field6750 * Class5815.method17497(this.field6754);
                for (int n12 = 0; n12 < Class5815.method17498(this.field6754); ++n12) {
                    Class5815.method17500(this.field6754).method21388(this.field6752, n11 + n12 * Class5815.method17499(this.field6754));
                }
                if (Class5815.method17501(this.field6754) <= 2) {
                    if (Class5815.method17501(this.field6754) == 2) {
                        for (int n13 = 0; n13 < Class5815.method17498(this.field6754); ++n13) {
                            final int n14 = n11 + n13 * Class5815.method17499(this.field6754);
                            array[n13] = this.field6752[n14];
                            array[Class5815.method17498(this.field6754) + n13] = this.field6752[n14 + 1];
                        }
                        Class5815.method17502(this.field6754).method21388(array, 0);
                        Class5815.method17502(this.field6754).method21388(array, Class5815.method17498(this.field6754));
                        for (int n15 = 0; n15 < Class5815.method17498(this.field6754); ++n15) {
                            final int n16 = n11 + n15 * Class5815.method17499(this.field6754);
                            this.field6752[n16] = array[n15];
                            this.field6752[n16 + 1] = array[Class5815.method17498(this.field6754) + n15];
                        }
                    }
                }
                else {
                    for (int n17 = 0; n17 < Class5815.method17501(this.field6754); n17 += 4) {
                        for (int n18 = 0; n18 < Class5815.method17498(this.field6754); ++n18) {
                            final int n19 = n11 + n18 * Class5815.method17499(this.field6754) + n17;
                            final int n20 = Class5815.method17498(this.field6754) + n18;
                            array[n18] = this.field6752[n19];
                            array[n20] = this.field6752[n19 + 1];
                            array[n20 + Class5815.method17498(this.field6754)] = this.field6752[n19 + 2];
                            array[n20 + 2 * Class5815.method17498(this.field6754)] = this.field6752[n19 + 3];
                        }
                        Class5815.method17502(this.field6754).method21388(array, 0);
                        Class5815.method17502(this.field6754).method21388(array, Class5815.method17498(this.field6754));
                        Class5815.method17502(this.field6754).method21388(array, 2 * Class5815.method17498(this.field6754));
                        Class5815.method17502(this.field6754).method21388(array, 3 * Class5815.method17498(this.field6754));
                        for (int n21 = 0; n21 < Class5815.method17498(this.field6754); ++n21) {
                            final int n22 = n11 + n21 * Class5815.method17499(this.field6754) + n17;
                            final int n23 = Class5815.method17498(this.field6754) + n21;
                            this.field6752[n22] = array[n21];
                            this.field6752[n22 + 1] = array[n23];
                            this.field6752[n22 + 2] = array[n23 + Class5815.method17498(this.field6754)];
                            this.field6752[n22 + 3] = array[n23 + 2 * Class5815.method17498(this.field6754)];
                        }
                    }
                }
            }
        }
    }
}
