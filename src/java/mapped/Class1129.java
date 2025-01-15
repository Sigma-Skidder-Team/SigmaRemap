// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1129 implements Runnable
{
    private static String[] field6095;
    public final /* synthetic */ int field6096;
    public final /* synthetic */ int field6097;
    public final /* synthetic */ int field6098;
    public final /* synthetic */ int field6099;
    public final /* synthetic */ float[] field6100;
    public final /* synthetic */ boolean field6101;
    public final /* synthetic */ Class9117 field6102;
    
    public Class1129(final Class9117 field6102, final int field6103, final int field6104, final int field6105, final int field6106, final float[] field6107, final boolean field6108) {
        this.field6102 = field6102;
        this.field6096 = field6103;
        this.field6097 = field6104;
        this.field6098 = field6105;
        this.field6099 = field6106;
        this.field6100 = field6107;
        this.field6101 = field6108;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field6096];
        if (this.field6097 != -1) {
            for (int i = this.field6098; i < Class9117.method33008(this.field6102); i += this.field6099) {
                final int n = i * Class9117.method33002(this.field6102);
                for (int j = 0; j < Class9117.method33003(this.field6102); ++j) {
                    Class9117.method33005(this.field6102).method29695(this.field6100, n + j * Class9117.method33004(this.field6102), this.field6101);
                }
                if (Class9117.method33006(this.field6102) <= 2) {
                    if (Class9117.method33006(this.field6102) == 2) {
                        for (int k = 0; k < Class9117.method33003(this.field6102); ++k) {
                            final int n2 = n + k * Class9117.method33004(this.field6102);
                            array[k] = this.field6100[n2];
                            array[Class9117.method33003(this.field6102) + k] = this.field6100[n2 + 1];
                        }
                        Class9117.method33007(this.field6102).method29695(array, 0, this.field6101);
                        Class9117.method33007(this.field6102).method29695(array, Class9117.method33003(this.field6102), this.field6101);
                        for (int l = 0; l < Class9117.method33003(this.field6102); ++l) {
                            final int n3 = n + l * Class9117.method33004(this.field6102);
                            this.field6100[n3] = array[l];
                            this.field6100[n3 + 1] = array[Class9117.method33003(this.field6102) + l];
                        }
                    }
                }
                else {
                    for (int n4 = 0; n4 < Class9117.method33006(this.field6102); n4 += 4) {
                        for (int n5 = 0; n5 < Class9117.method33003(this.field6102); ++n5) {
                            final int n6 = n + n5 * Class9117.method33004(this.field6102) + n4;
                            final int n7 = Class9117.method33003(this.field6102) + n5;
                            array[n5] = this.field6100[n6];
                            array[n7] = this.field6100[n6 + 1];
                            array[n7 + Class9117.method33003(this.field6102)] = this.field6100[n6 + 2];
                            array[n7 + 2 * Class9117.method33003(this.field6102)] = this.field6100[n6 + 3];
                        }
                        Class9117.method33007(this.field6102).method29695(array, 0, this.field6101);
                        Class9117.method33007(this.field6102).method29695(array, Class9117.method33003(this.field6102), this.field6101);
                        Class9117.method33007(this.field6102).method29695(array, 2 * Class9117.method33003(this.field6102), this.field6101);
                        Class9117.method33007(this.field6102).method29695(array, 3 * Class9117.method33003(this.field6102), this.field6101);
                        for (int n8 = 0; n8 < Class9117.method33003(this.field6102); ++n8) {
                            final int n9 = n + n8 * Class9117.method33004(this.field6102) + n4;
                            final int n10 = Class9117.method33003(this.field6102) + n8;
                            this.field6100[n9] = array[n8];
                            this.field6100[n9 + 1] = array[n10];
                            this.field6100[n9 + 2] = array[n10 + Class9117.method33003(this.field6102)];
                            this.field6100[n9 + 3] = array[n10 + 2 * Class9117.method33003(this.field6102)];
                        }
                    }
                }
            }
        }
        else {
            for (int field6098 = this.field6098; field6098 < Class9117.method33008(this.field6102); field6098 += this.field6099) {
                final int n11 = field6098 * Class9117.method33002(this.field6102);
                for (int n12 = 0; n12 < Class9117.method33003(this.field6102); ++n12) {
                    Class9117.method33005(this.field6102).method29691(this.field6100, n11 + n12 * Class9117.method33004(this.field6102), this.field6101);
                }
                if (Class9117.method33006(this.field6102) <= 2) {
                    if (Class9117.method33006(this.field6102) == 2) {
                        for (int n13 = 0; n13 < Class9117.method33003(this.field6102); ++n13) {
                            final int n14 = n11 + n13 * Class9117.method33004(this.field6102);
                            array[n13] = this.field6100[n14];
                            array[Class9117.method33003(this.field6102) + n13] = this.field6100[n14 + 1];
                        }
                        Class9117.method33007(this.field6102).method29691(array, 0, this.field6101);
                        Class9117.method33007(this.field6102).method29691(array, Class9117.method33003(this.field6102), this.field6101);
                        for (int n15 = 0; n15 < Class9117.method33003(this.field6102); ++n15) {
                            final int n16 = n11 + n15 * Class9117.method33004(this.field6102);
                            this.field6100[n16] = array[n15];
                            this.field6100[n16 + 1] = array[Class9117.method33003(this.field6102) + n15];
                        }
                    }
                }
                else {
                    for (int n17 = 0; n17 < Class9117.method33006(this.field6102); n17 += 4) {
                        for (int n18 = 0; n18 < Class9117.method33003(this.field6102); ++n18) {
                            final int n19 = n11 + n18 * Class9117.method33004(this.field6102) + n17;
                            final int n20 = Class9117.method33003(this.field6102) + n18;
                            array[n18] = this.field6100[n19];
                            array[n20] = this.field6100[n19 + 1];
                            array[n20 + Class9117.method33003(this.field6102)] = this.field6100[n19 + 2];
                            array[n20 + 2 * Class9117.method33003(this.field6102)] = this.field6100[n19 + 3];
                        }
                        Class9117.method33007(this.field6102).method29691(array, 0, this.field6101);
                        Class9117.method33007(this.field6102).method29691(array, Class9117.method33003(this.field6102), this.field6101);
                        Class9117.method33007(this.field6102).method29691(array, 2 * Class9117.method33003(this.field6102), this.field6101);
                        Class9117.method33007(this.field6102).method29691(array, 3 * Class9117.method33003(this.field6102), this.field6101);
                        for (int n21 = 0; n21 < Class9117.method33003(this.field6102); ++n21) {
                            final int n22 = n11 + n21 * Class9117.method33004(this.field6102) + n17;
                            final int n23 = Class9117.method33003(this.field6102) + n21;
                            this.field6100[n22] = array[n21];
                            this.field6100[n22 + 1] = array[n23];
                            this.field6100[n22 + 2] = array[n23 + Class9117.method33003(this.field6102)];
                            this.field6100[n22 + 3] = array[n23 + 2 * Class9117.method33003(this.field6102)];
                        }
                    }
                }
            }
        }
    }
}
