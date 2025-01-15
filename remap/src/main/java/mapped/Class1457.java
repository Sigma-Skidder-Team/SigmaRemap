// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1457 implements Runnable
{
    private static String[] field8076;
    public final /* synthetic */ int field8077;
    public final /* synthetic */ int field8078;
    public final /* synthetic */ int field8079;
    public final /* synthetic */ int field8080;
    public final /* synthetic */ float[] field8081;
    public final /* synthetic */ boolean field8082;
    public final /* synthetic */ Class5934 field8083;
    
    public Class1457(final Class5934 field8083, final int field8084, final int field8085, final int field8086, final int field8087, final float[] field8088, final boolean field8089) {
        this.field8083 = field8083;
        this.field8077 = field8084;
        this.field8078 = field8085;
        this.field8079 = field8086;
        this.field8080 = field8087;
        this.field8081 = field8088;
        this.field8082 = field8089;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field8077];
        if (this.field8078 != -1) {
            if (Class5934.method17841(this.field8083) <= 2) {
                if (Class5934.method17841(this.field8083) == 2) {
                    for (int i = this.field8079; i < Class5934.method17838(this.field8083); i += this.field8080) {
                        final int n = i * Class5934.method17839(this.field8083);
                        for (int j = 0; j < Class5934.method17843(this.field8083); ++j) {
                            final int n2 = j * Class5934.method17837(this.field8083) + n;
                            array[j] = this.field8081[n2];
                            array[Class5934.method17843(this.field8083) + j] = this.field8081[n2 + 1];
                        }
                        Class5934.method17844(this.field8083).method30451(array, 0, this.field8082);
                        Class5934.method17844(this.field8083).method30451(array, Class5934.method17843(this.field8083), this.field8082);
                        for (int k = 0; k < Class5934.method17843(this.field8083); ++k) {
                            final int n3 = k * Class5934.method17837(this.field8083) + n;
                            this.field8081[n3] = array[k];
                            this.field8081[n3 + 1] = array[Class5934.method17843(this.field8083) + k];
                        }
                    }
                }
            }
            else {
                for (int l = this.field8079; l < Class5934.method17838(this.field8083); l += this.field8080) {
                    final int n4 = l * Class5934.method17839(this.field8083);
                    for (int n5 = 0; n5 < Class5934.method17841(this.field8083); n5 += 4) {
                        for (int n6 = 0; n6 < Class5934.method17843(this.field8083); ++n6) {
                            final int n7 = n6 * Class5934.method17837(this.field8083) + n4 + n5;
                            final int n8 = Class5934.method17843(this.field8083) + n6;
                            array[n6] = this.field8081[n7];
                            array[n8] = this.field8081[n7 + 1];
                            array[n8 + Class5934.method17843(this.field8083)] = this.field8081[n7 + 2];
                            array[n8 + 2 * Class5934.method17843(this.field8083)] = this.field8081[n7 + 3];
                        }
                        Class5934.method17844(this.field8083).method30451(array, 0, this.field8082);
                        Class5934.method17844(this.field8083).method30451(array, Class5934.method17843(this.field8083), this.field8082);
                        Class5934.method17844(this.field8083).method30451(array, 2 * Class5934.method17843(this.field8083), this.field8082);
                        Class5934.method17844(this.field8083).method30451(array, 3 * Class5934.method17843(this.field8083), this.field8082);
                        for (int n9 = 0; n9 < Class5934.method17843(this.field8083); ++n9) {
                            final int n10 = n9 * Class5934.method17837(this.field8083) + n4 + n5;
                            final int n11 = Class5934.method17843(this.field8083) + n9;
                            this.field8081[n10] = array[n9];
                            this.field8081[n10 + 1] = array[n11];
                            this.field8081[n10 + 2] = array[n11 + Class5934.method17843(this.field8083)];
                            this.field8081[n10 + 3] = array[n11 + 2 * Class5934.method17843(this.field8083)];
                        }
                    }
                }
            }
        }
        else if (Class5934.method17841(this.field8083) <= 2) {
            if (Class5934.method17841(this.field8083) == 2) {
                for (int field8079 = this.field8079; field8079 < Class5934.method17838(this.field8083); field8079 += this.field8080) {
                    final int n12 = field8079 * Class5934.method17839(this.field8083);
                    for (int n13 = 0; n13 < Class5934.method17843(this.field8083); ++n13) {
                        final int n14 = n13 * Class5934.method17837(this.field8083) + n12;
                        array[n13] = this.field8081[n14];
                        array[Class5934.method17843(this.field8083) + n13] = this.field8081[n14 + 1];
                    }
                    Class5934.method17844(this.field8083).method30447(array, 0);
                    Class5934.method17844(this.field8083).method30447(array, Class5934.method17843(this.field8083));
                    for (int n15 = 0; n15 < Class5934.method17843(this.field8083); ++n15) {
                        final int n16 = n15 * Class5934.method17837(this.field8083) + n12;
                        this.field8081[n16] = array[n15];
                        this.field8081[n16 + 1] = array[Class5934.method17843(this.field8083) + n15];
                    }
                }
            }
        }
        else {
            for (int field8080 = this.field8079; field8080 < Class5934.method17838(this.field8083); field8080 += this.field8080) {
                final int n17 = field8080 * Class5934.method17839(this.field8083);
                for (int n18 = 0; n18 < Class5934.method17841(this.field8083); n18 += 4) {
                    for (int n19 = 0; n19 < Class5934.method17843(this.field8083); ++n19) {
                        final int n20 = n19 * Class5934.method17837(this.field8083) + n17 + n18;
                        final int n21 = Class5934.method17843(this.field8083) + n19;
                        array[n19] = this.field8081[n20];
                        array[n21] = this.field8081[n20 + 1];
                        array[n21 + Class5934.method17843(this.field8083)] = this.field8081[n20 + 2];
                        array[n21 + 2 * Class5934.method17843(this.field8083)] = this.field8081[n20 + 3];
                    }
                    Class5934.method17844(this.field8083).method30447(array, 0);
                    Class5934.method17844(this.field8083).method30447(array, Class5934.method17843(this.field8083));
                    Class5934.method17844(this.field8083).method30447(array, 2 * Class5934.method17843(this.field8083));
                    Class5934.method17844(this.field8083).method30447(array, 3 * Class5934.method17843(this.field8083));
                    for (int n22 = 0; n22 < Class5934.method17843(this.field8083); ++n22) {
                        final int n23 = n22 * Class5934.method17837(this.field8083) + n17 + n18;
                        final int n24 = Class5934.method17843(this.field8083) + n22;
                        this.field8081[n23] = array[n22];
                        this.field8081[n23 + 1] = array[n24];
                        this.field8081[n23 + 2] = array[n24 + Class5934.method17843(this.field8083)];
                        this.field8081[n23 + 3] = array[n24 + 2 * Class5934.method17843(this.field8083)];
                    }
                }
            }
        }
    }
}
