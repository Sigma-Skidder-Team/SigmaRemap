// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1175 implements Runnable
{
    private static String[] field6367;
    public final /* synthetic */ int field6368;
    public final /* synthetic */ int field6369;
    public final /* synthetic */ int field6370;
    public final /* synthetic */ int field6371;
    public final /* synthetic */ float[] field6372;
    public final /* synthetic */ boolean field6373;
    public final /* synthetic */ Class6498 field6374;
    
    public Class1175(final Class6498 field6374, final int field6375, final int field6376, final int field6377, final int field6378, final float[] field6379, final boolean field6380) {
        this.field6374 = field6374;
        this.field6368 = field6375;
        this.field6369 = field6376;
        this.field6370 = field6377;
        this.field6371 = field6378;
        this.field6372 = field6379;
        this.field6373 = field6380;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field6368];
        if (this.field6369 != -1) {
            for (int i = this.field6370; i < Class6498.method19570(this.field6374); i += this.field6371) {
                final int n = i * Class6498.method19564(this.field6374);
                for (int j = 0; j < Class6498.method19565(this.field6374); ++j) {
                    Class6498.method19567(this.field6374).method34187(this.field6372, n + j * Class6498.method19566(this.field6374), this.field6373);
                }
                if (Class6498.method19568(this.field6374) <= 2) {
                    if (Class6498.method19568(this.field6374) == 2) {
                        for (int k = 0; k < Class6498.method19565(this.field6374); ++k) {
                            final int n2 = n + k * Class6498.method19566(this.field6374);
                            array[k] = this.field6372[n2];
                            array[Class6498.method19565(this.field6374) + k] = this.field6372[n2 + 1];
                        }
                        Class6498.method19569(this.field6374).method34187(array, 0, this.field6373);
                        Class6498.method19569(this.field6374).method34187(array, Class6498.method19565(this.field6374), this.field6373);
                        for (int l = 0; l < Class6498.method19565(this.field6374); ++l) {
                            final int n3 = n + l * Class6498.method19566(this.field6374);
                            this.field6372[n3] = array[l];
                            this.field6372[n3 + 1] = array[Class6498.method19565(this.field6374) + l];
                        }
                    }
                }
                else {
                    for (int n4 = 0; n4 < Class6498.method19568(this.field6374); n4 += 4) {
                        for (int n5 = 0; n5 < Class6498.method19565(this.field6374); ++n5) {
                            final int n6 = n + n5 * Class6498.method19566(this.field6374) + n4;
                            final int n7 = Class6498.method19565(this.field6374) + n5;
                            array[n5] = this.field6372[n6];
                            array[n7] = this.field6372[n6 + 1];
                            array[n7 + Class6498.method19565(this.field6374)] = this.field6372[n6 + 2];
                            array[n7 + 2 * Class6498.method19565(this.field6374)] = this.field6372[n6 + 3];
                        }
                        Class6498.method19569(this.field6374).method34187(array, 0, this.field6373);
                        Class6498.method19569(this.field6374).method34187(array, Class6498.method19565(this.field6374), this.field6373);
                        Class6498.method19569(this.field6374).method34187(array, 2 * Class6498.method19565(this.field6374), this.field6373);
                        Class6498.method19569(this.field6374).method34187(array, 3 * Class6498.method19565(this.field6374), this.field6373);
                        for (int n8 = 0; n8 < Class6498.method19565(this.field6374); ++n8) {
                            final int n9 = n + n8 * Class6498.method19566(this.field6374) + n4;
                            final int n10 = Class6498.method19565(this.field6374) + n8;
                            this.field6372[n9] = array[n8];
                            this.field6372[n9 + 1] = array[n10];
                            this.field6372[n9 + 2] = array[n10 + Class6498.method19565(this.field6374)];
                            this.field6372[n9 + 3] = array[n10 + 2 * Class6498.method19565(this.field6374)];
                        }
                    }
                }
            }
        }
        else {
            for (int field6370 = this.field6370; field6370 < Class6498.method19570(this.field6374); field6370 += this.field6371) {
                final int n11 = field6370 * Class6498.method19564(this.field6374);
                for (int n12 = 0; n12 < Class6498.method19565(this.field6374); ++n12) {
                    Class6498.method19567(this.field6374).method34183(this.field6372, n11 + n12 * Class6498.method19566(this.field6374), this.field6373);
                }
                if (Class6498.method19568(this.field6374) <= 2) {
                    if (Class6498.method19568(this.field6374) == 2) {
                        for (int n13 = 0; n13 < Class6498.method19565(this.field6374); ++n13) {
                            final int n14 = n11 + n13 * Class6498.method19566(this.field6374);
                            array[n13] = this.field6372[n14];
                            array[Class6498.method19565(this.field6374) + n13] = this.field6372[n14 + 1];
                        }
                        Class6498.method19569(this.field6374).method34183(array, 0, this.field6373);
                        Class6498.method19569(this.field6374).method34183(array, Class6498.method19565(this.field6374), this.field6373);
                        for (int n15 = 0; n15 < Class6498.method19565(this.field6374); ++n15) {
                            final int n16 = n11 + n15 * Class6498.method19566(this.field6374);
                            this.field6372[n16] = array[n15];
                            this.field6372[n16 + 1] = array[Class6498.method19565(this.field6374) + n15];
                        }
                    }
                }
                else {
                    for (int n17 = 0; n17 < Class6498.method19568(this.field6374); n17 += 4) {
                        for (int n18 = 0; n18 < Class6498.method19565(this.field6374); ++n18) {
                            final int n19 = n11 + n18 * Class6498.method19566(this.field6374) + n17;
                            final int n20 = Class6498.method19565(this.field6374) + n18;
                            array[n18] = this.field6372[n19];
                            array[n20] = this.field6372[n19 + 1];
                            array[n20 + Class6498.method19565(this.field6374)] = this.field6372[n19 + 2];
                            array[n20 + 2 * Class6498.method19565(this.field6374)] = this.field6372[n19 + 3];
                        }
                        Class6498.method19569(this.field6374).method34183(array, 0, this.field6373);
                        Class6498.method19569(this.field6374).method34183(array, Class6498.method19565(this.field6374), this.field6373);
                        Class6498.method19569(this.field6374).method34183(array, 2 * Class6498.method19565(this.field6374), this.field6373);
                        Class6498.method19569(this.field6374).method34183(array, 3 * Class6498.method19565(this.field6374), this.field6373);
                        for (int n21 = 0; n21 < Class6498.method19565(this.field6374); ++n21) {
                            final int n22 = n11 + n21 * Class6498.method19566(this.field6374) + n17;
                            final int n23 = Class6498.method19565(this.field6374) + n21;
                            this.field6372[n22] = array[n21];
                            this.field6372[n22 + 1] = array[n23];
                            this.field6372[n22 + 2] = array[n23 + Class6498.method19565(this.field6374)];
                            this.field6372[n22 + 3] = array[n23 + 2 * Class6498.method19565(this.field6374)];
                        }
                    }
                }
            }
        }
    }
}
