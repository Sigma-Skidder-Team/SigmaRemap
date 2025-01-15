// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1143 implements Runnable
{
    private static String[] field6179;
    public final /* synthetic */ int field6180;
    public final /* synthetic */ int field6181;
    public final /* synthetic */ int field6182;
    public final /* synthetic */ int field6183;
    public final /* synthetic */ float[] field6184;
    public final /* synthetic */ boolean field6185;
    public final /* synthetic */ Class5934 field6186;
    
    public Class1143(final Class5934 field6186, final int field6187, final int field6188, final int field6189, final int field6190, final float[] field6191, final boolean field6192) {
        this.field6186 = field6186;
        this.field6180 = field6187;
        this.field6181 = field6188;
        this.field6182 = field6189;
        this.field6183 = field6190;
        this.field6184 = field6191;
        this.field6185 = field6192;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field6180];
        if (this.field6181 != -1) {
            for (int i = this.field6182; i < Class5934.method17843(this.field6186); i += this.field6183) {
                final int n = i * Class5934.method17837(this.field6186);
                for (int j = 0; j < Class5934.method17838(this.field6186); ++j) {
                    Class5934.method17840(this.field6186).method30451(this.field6184, n + j * Class5934.method17839(this.field6186), this.field6185);
                }
                if (Class5934.method17841(this.field6186) <= 2) {
                    if (Class5934.method17841(this.field6186) == 2) {
                        for (int k = 0; k < Class5934.method17838(this.field6186); ++k) {
                            final int n2 = n + k * Class5934.method17839(this.field6186);
                            array[k] = this.field6184[n2];
                            array[Class5934.method17838(this.field6186) + k] = this.field6184[n2 + 1];
                        }
                        Class5934.method17842(this.field6186).method30451(array, 0, this.field6185);
                        Class5934.method17842(this.field6186).method30451(array, Class5934.method17838(this.field6186), this.field6185);
                        for (int l = 0; l < Class5934.method17838(this.field6186); ++l) {
                            final int n3 = n + l * Class5934.method17839(this.field6186);
                            this.field6184[n3] = array[l];
                            this.field6184[n3 + 1] = array[Class5934.method17838(this.field6186) + l];
                        }
                    }
                }
                else {
                    for (int n4 = 0; n4 < Class5934.method17841(this.field6186); n4 += 4) {
                        for (int n5 = 0; n5 < Class5934.method17838(this.field6186); ++n5) {
                            final int n6 = n + n5 * Class5934.method17839(this.field6186) + n4;
                            final int n7 = Class5934.method17838(this.field6186) + n5;
                            array[n5] = this.field6184[n6];
                            array[n7] = this.field6184[n6 + 1];
                            array[n7 + Class5934.method17838(this.field6186)] = this.field6184[n6 + 2];
                            array[n7 + 2 * Class5934.method17838(this.field6186)] = this.field6184[n6 + 3];
                        }
                        Class5934.method17842(this.field6186).method30451(array, 0, this.field6185);
                        Class5934.method17842(this.field6186).method30451(array, Class5934.method17838(this.field6186), this.field6185);
                        Class5934.method17842(this.field6186).method30451(array, 2 * Class5934.method17838(this.field6186), this.field6185);
                        Class5934.method17842(this.field6186).method30451(array, 3 * Class5934.method17838(this.field6186), this.field6185);
                        for (int n8 = 0; n8 < Class5934.method17838(this.field6186); ++n8) {
                            final int n9 = n + n8 * Class5934.method17839(this.field6186) + n4;
                            final int n10 = Class5934.method17838(this.field6186) + n8;
                            this.field6184[n9] = array[n8];
                            this.field6184[n9 + 1] = array[n10];
                            this.field6184[n9 + 2] = array[n10 + Class5934.method17838(this.field6186)];
                            this.field6184[n9 + 3] = array[n10 + 2 * Class5934.method17838(this.field6186)];
                        }
                    }
                }
            }
        }
        else {
            for (int field6182 = this.field6182; field6182 < Class5934.method17843(this.field6186); field6182 += this.field6183) {
                final int n11 = field6182 * Class5934.method17837(this.field6186);
                for (int n12 = 0; n12 < Class5934.method17838(this.field6186); ++n12) {
                    Class5934.method17840(this.field6186).method30447(this.field6184, n11 + n12 * Class5934.method17839(this.field6186));
                }
                if (Class5934.method17841(this.field6186) <= 2) {
                    if (Class5934.method17841(this.field6186) == 2) {
                        for (int n13 = 0; n13 < Class5934.method17838(this.field6186); ++n13) {
                            final int n14 = n11 + n13 * Class5934.method17839(this.field6186);
                            array[n13] = this.field6184[n14];
                            array[Class5934.method17838(this.field6186) + n13] = this.field6184[n14 + 1];
                        }
                        Class5934.method17842(this.field6186).method30447(array, 0);
                        Class5934.method17842(this.field6186).method30447(array, Class5934.method17838(this.field6186));
                        for (int n15 = 0; n15 < Class5934.method17838(this.field6186); ++n15) {
                            final int n16 = n11 + n15 * Class5934.method17839(this.field6186);
                            this.field6184[n16] = array[n15];
                            this.field6184[n16 + 1] = array[Class5934.method17838(this.field6186) + n15];
                        }
                    }
                }
                else {
                    for (int n17 = 0; n17 < Class5934.method17841(this.field6186); n17 += 4) {
                        for (int n18 = 0; n18 < Class5934.method17838(this.field6186); ++n18) {
                            final int n19 = n11 + n18 * Class5934.method17839(this.field6186) + n17;
                            final int n20 = Class5934.method17838(this.field6186) + n18;
                            array[n18] = this.field6184[n19];
                            array[n20] = this.field6184[n19 + 1];
                            array[n20 + Class5934.method17838(this.field6186)] = this.field6184[n19 + 2];
                            array[n20 + 2 * Class5934.method17838(this.field6186)] = this.field6184[n19 + 3];
                        }
                        Class5934.method17842(this.field6186).method30447(array, 0);
                        Class5934.method17842(this.field6186).method30447(array, Class5934.method17838(this.field6186));
                        Class5934.method17842(this.field6186).method30447(array, 2 * Class5934.method17838(this.field6186));
                        Class5934.method17842(this.field6186).method30447(array, 3 * Class5934.method17838(this.field6186));
                        for (int n21 = 0; n21 < Class5934.method17838(this.field6186); ++n21) {
                            final int n22 = n11 + n21 * Class5934.method17839(this.field6186) + n17;
                            final int n23 = Class5934.method17838(this.field6186) + n21;
                            this.field6184[n22] = array[n21];
                            this.field6184[n22 + 1] = array[n23];
                            this.field6184[n22 + 2] = array[n23 + Class5934.method17838(this.field6186)];
                            this.field6184[n22 + 3] = array[n23 + 2 * Class5934.method17838(this.field6186)];
                        }
                    }
                }
            }
        }
    }
}
