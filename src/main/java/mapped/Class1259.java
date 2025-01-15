// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1259 implements Runnable
{
    private static String[] field6860;
    public final /* synthetic */ int field6861;
    public final /* synthetic */ int field6862;
    public final /* synthetic */ int field6863;
    public final /* synthetic */ int field6864;
    public final /* synthetic */ float[] field6865;
    public final /* synthetic */ boolean field6866;
    public final /* synthetic */ Class9117 field6867;
    
    public Class1259(final Class9117 field6867, final int field6868, final int field6869, final int field6870, final int field6871, final float[] field6872, final boolean field6873) {
        this.field6867 = field6867;
        this.field6861 = field6868;
        this.field6862 = field6869;
        this.field6863 = field6870;
        this.field6864 = field6871;
        this.field6865 = field6872;
        this.field6866 = field6873;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field6861];
        if (this.field6862 != -1) {
            if (Class9117.method33006(this.field6867) <= 2) {
                if (Class9117.method33006(this.field6867) == 2) {
                    for (int i = this.field6863; i < Class9117.method33003(this.field6867); i += this.field6864) {
                        final int n = i * Class9117.method33004(this.field6867);
                        for (int j = 0; j < Class9117.method33008(this.field6867); ++j) {
                            final int n2 = j * Class9117.method33002(this.field6867) + n;
                            array[j] = this.field6865[n2];
                            array[Class9117.method33008(this.field6867) + j] = this.field6865[n2 + 1];
                        }
                        Class9117.method33009(this.field6867).method29695(array, 0, this.field6866);
                        Class9117.method33009(this.field6867).method29695(array, Class9117.method33008(this.field6867), this.field6866);
                        for (int k = 0; k < Class9117.method33008(this.field6867); ++k) {
                            final int n3 = k * Class9117.method33002(this.field6867) + n;
                            this.field6865[n3] = array[k];
                            this.field6865[n3 + 1] = array[Class9117.method33008(this.field6867) + k];
                        }
                    }
                }
            }
            else {
                for (int l = this.field6863; l < Class9117.method33003(this.field6867); l += this.field6864) {
                    final int n4 = l * Class9117.method33004(this.field6867);
                    for (int n5 = 0; n5 < Class9117.method33006(this.field6867); n5 += 4) {
                        for (int n6 = 0; n6 < Class9117.method33008(this.field6867); ++n6) {
                            final int n7 = n6 * Class9117.method33002(this.field6867) + n4 + n5;
                            final int n8 = Class9117.method33008(this.field6867) + n6;
                            array[n6] = this.field6865[n7];
                            array[n8] = this.field6865[n7 + 1];
                            array[n8 + Class9117.method33008(this.field6867)] = this.field6865[n7 + 2];
                            array[n8 + 2 * Class9117.method33008(this.field6867)] = this.field6865[n7 + 3];
                        }
                        Class9117.method33009(this.field6867).method29695(array, 0, this.field6866);
                        Class9117.method33009(this.field6867).method29695(array, Class9117.method33008(this.field6867), this.field6866);
                        Class9117.method33009(this.field6867).method29695(array, 2 * Class9117.method33008(this.field6867), this.field6866);
                        Class9117.method33009(this.field6867).method29695(array, 3 * Class9117.method33008(this.field6867), this.field6866);
                        for (int n9 = 0; n9 < Class9117.method33008(this.field6867); ++n9) {
                            final int n10 = n9 * Class9117.method33002(this.field6867) + n4 + n5;
                            final int n11 = Class9117.method33008(this.field6867) + n9;
                            this.field6865[n10] = array[n9];
                            this.field6865[n10 + 1] = array[n11];
                            this.field6865[n10 + 2] = array[n11 + Class9117.method33008(this.field6867)];
                            this.field6865[n10 + 3] = array[n11 + 2 * Class9117.method33008(this.field6867)];
                        }
                    }
                }
            }
        }
        else if (Class9117.method33006(this.field6867) <= 2) {
            if (Class9117.method33006(this.field6867) == 2) {
                for (int field6863 = this.field6863; field6863 < Class9117.method33003(this.field6867); field6863 += this.field6864) {
                    final int n12 = field6863 * Class9117.method33004(this.field6867);
                    for (int n13 = 0; n13 < Class9117.method33008(this.field6867); ++n13) {
                        final int n14 = n13 * Class9117.method33002(this.field6867) + n12;
                        array[n13] = this.field6865[n14];
                        array[Class9117.method33008(this.field6867) + n13] = this.field6865[n14 + 1];
                    }
                    Class9117.method33009(this.field6867).method29691(array, 0, this.field6866);
                    Class9117.method33009(this.field6867).method29691(array, Class9117.method33008(this.field6867), this.field6866);
                    for (int n15 = 0; n15 < Class9117.method33008(this.field6867); ++n15) {
                        final int n16 = n15 * Class9117.method33002(this.field6867) + n12;
                        this.field6865[n16] = array[n15];
                        this.field6865[n16 + 1] = array[Class9117.method33008(this.field6867) + n15];
                    }
                }
            }
        }
        else {
            for (int field6864 = this.field6863; field6864 < Class9117.method33003(this.field6867); field6864 += this.field6864) {
                final int n17 = field6864 * Class9117.method33004(this.field6867);
                for (int n18 = 0; n18 < Class9117.method33006(this.field6867); n18 += 4) {
                    for (int n19 = 0; n19 < Class9117.method33008(this.field6867); ++n19) {
                        final int n20 = n19 * Class9117.method33002(this.field6867) + n17 + n18;
                        final int n21 = Class9117.method33008(this.field6867) + n19;
                        array[n19] = this.field6865[n20];
                        array[n21] = this.field6865[n20 + 1];
                        array[n21 + Class9117.method33008(this.field6867)] = this.field6865[n20 + 2];
                        array[n21 + 2 * Class9117.method33008(this.field6867)] = this.field6865[n20 + 3];
                    }
                    Class9117.method33009(this.field6867).method29691(array, 0, this.field6866);
                    Class9117.method33009(this.field6867).method29691(array, Class9117.method33008(this.field6867), this.field6866);
                    Class9117.method33009(this.field6867).method29691(array, 2 * Class9117.method33008(this.field6867), this.field6866);
                    Class9117.method33009(this.field6867).method29691(array, 3 * Class9117.method33008(this.field6867), this.field6866);
                    for (int n22 = 0; n22 < Class9117.method33008(this.field6867); ++n22) {
                        final int n23 = n22 * Class9117.method33002(this.field6867) + n17 + n18;
                        final int n24 = Class9117.method33008(this.field6867) + n22;
                        this.field6865[n23] = array[n22];
                        this.field6865[n23 + 1] = array[n24];
                        this.field6865[n23 + 2] = array[n24 + Class9117.method33008(this.field6867)];
                        this.field6865[n23 + 3] = array[n24 + 2 * Class9117.method33008(this.field6867)];
                    }
                }
            }
        }
    }
}
