// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9432
{
    private Class7718 field40457;
    private float[][] field40458;
    private float[][] field40459;
    
    public Class9432(final Class7718 field40457) {
        this.field40457 = null;
        this.field40458 = new float[16][3];
        this.field40459 = new float[16][3];
        this.field40457 = field40457;
    }
    
    public Class7718 method35052() {
        return this.field40457;
    }
    
    public boolean method35053(final Class1848 class1848, final float n, final int[] array, final boolean b) {
        if (this.field40457 == null) {
            return false;
        }
        final int method24639 = this.field40457.method24639();
        if (b && method24639 < 64) {
            return false;
        }
        final int method24640 = this.field40457.method24638();
        if (method24640 >= 16) {
            int n2 = 0;
            if (b) {
                n2 = method24640 * 16 * 2;
            }
            float n3 = 1.1666666f * (class1848.method6842(1.0f) - 0.2f);
            if (class1848.method6848() > 0) {
                n3 = 1.0f;
            }
            final float n4 = Config.method28868(n3) * (method24640 - 1);
            final float n5 = Config.method28868(n + 0.5f) * (method24640 - 1);
            final float method24641 = Config.method28868((float) Config.method28962().field23472);
            final boolean b2 = method24641 > 1.0E-4f;
            final float[][] method24642 = this.field40457.method24631();
            this.method35054(method24642, n4, n2, method24640, this.field40458);
            this.method35054(method24642, n5, n2 + 16 * method24640, method24640, this.field40459);
            final float[] array2 = new float[3];
            for (int i = 0; i < 16; ++i) {
                for (int j = 0; j < 16; ++j) {
                    for (int k = 0; k < 3; ++k) {
                        float method24643 = Config.method28868(this.field40458[i][k] + this.field40459[j][k]);
                        if (b2) {
                            final float n6 = 1.0f - method24643;
                            method24643 = method24641 * (1.0f - n6 * n6 * n6 * n6) + (1.0f - method24641) * method24643;
                        }
                        array2[k] = method24643;
                    }
                    array[i * 16 + j] = (0xFF000000 | (int)(array2[2] * 255.0f) << 16 | (int)(array2[1] * 255.0f) << 8 | (int)(array2[0] * 255.0f));
                }
            }
            return true;
        }
        method35056("Invalid lightmap width: " + method24640);
        this.field40457 = null;
        return false;
    }
    
    private void method35054(final float[][] array, final float n, final int n2, final int n3, final float[][] array2) {
        final int n4 = (int)Math.floor(n);
        final int n5 = (int)Math.ceil(n);
        if (n4 != n5) {
            final float n6 = 1.0f - (n - n4);
            final float n7 = 1.0f - (n5 - n);
            for (int i = 0; i < 16; ++i) {
                final float[] array3 = array[n2 + i * n3 + n4];
                final float[] array4 = array[n2 + i * n3 + n5];
                final float[] array5 = array2[i];
                for (int j = 0; j < 3; ++j) {
                    array5[j] = array3[j] * n6 + array4[j] * n7;
                }
            }
        }
        else {
            for (int k = 0; k < 16; ++k) {
                final float[] array6 = array[n2 + k * n3 + n4];
                final float[] array7 = array2[k];
                for (int l = 0; l < 3; ++l) {
                    array7[l] = array6[l];
                }
            }
        }
    }
    
    private static void method35055(final String str) {
        Config.method28847("CustomColors: " + str);
    }
    
    private static void method35056(final String str) {
        Config.warn("CustomColors: " + str);
    }
}
