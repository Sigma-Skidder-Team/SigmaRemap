// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1535 implements Runnable
{
    private static String[] field8571;
    public final /* synthetic */ int field8572;
    public final /* synthetic */ int field8573;
    public final /* synthetic */ int field8574;
    public final /* synthetic */ int field8575;
    public final /* synthetic */ double[] field8576;
    public final /* synthetic */ boolean field8577;
    public final /* synthetic */ Class7796 field8578;
    
    public Class1535(final Class7796 field8578, final int field8579, final int field8580, final int field8581, final int field8582, final double[] field8583, final boolean field8584) {
        this.field8578 = field8578;
        this.field8572 = field8579;
        this.field8573 = field8580;
        this.field8574 = field8581;
        this.field8575 = field8582;
        this.field8576 = field8583;
        this.field8577 = field8584;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field8572];
        if (this.field8573 != -1) {
            for (int i = this.field8574; i < Class7796.method25149(this.field8578); i += this.field8575) {
                final int n = i * Class7796.method25143(this.field8578);
                for (int j = 0; j < Class7796.method25144(this.field8578); ++j) {
                    Class7796.method25146(this.field8578).method18042(this.field8576, n + j * Class7796.method25145(this.field8578), this.field8577);
                }
                if (Class7796.method25147(this.field8578) <= 2) {
                    if (Class7796.method25147(this.field8578) == 2) {
                        for (int k = 0; k < Class7796.method25144(this.field8578); ++k) {
                            final int n2 = n + k * Class7796.method25145(this.field8578);
                            array[k] = this.field8576[n2];
                            array[Class7796.method25144(this.field8578) + k] = this.field8576[n2 + 1];
                        }
                        Class7796.method25148(this.field8578).method18042(array, 0, this.field8577);
                        Class7796.method25148(this.field8578).method18042(array, Class7796.method25144(this.field8578), this.field8577);
                        for (int l = 0; l < Class7796.method25144(this.field8578); ++l) {
                            final int n3 = n + l * Class7796.method25145(this.field8578);
                            this.field8576[n3] = array[l];
                            this.field8576[n3 + 1] = array[Class7796.method25144(this.field8578) + l];
                        }
                    }
                }
                else {
                    for (int n4 = 0; n4 < Class7796.method25147(this.field8578); n4 += 4) {
                        for (int n5 = 0; n5 < Class7796.method25144(this.field8578); ++n5) {
                            final int n6 = n + n5 * Class7796.method25145(this.field8578) + n4;
                            final int n7 = Class7796.method25144(this.field8578) + n5;
                            array[n5] = this.field8576[n6];
                            array[n7] = this.field8576[n6 + 1];
                            array[n7 + Class7796.method25144(this.field8578)] = this.field8576[n6 + 2];
                            array[n7 + 2 * Class7796.method25144(this.field8578)] = this.field8576[n6 + 3];
                        }
                        Class7796.method25148(this.field8578).method18042(array, 0, this.field8577);
                        Class7796.method25148(this.field8578).method18042(array, Class7796.method25144(this.field8578), this.field8577);
                        Class7796.method25148(this.field8578).method18042(array, 2 * Class7796.method25144(this.field8578), this.field8577);
                        Class7796.method25148(this.field8578).method18042(array, 3 * Class7796.method25144(this.field8578), this.field8577);
                        for (int n8 = 0; n8 < Class7796.method25144(this.field8578); ++n8) {
                            final int n9 = n + n8 * Class7796.method25145(this.field8578) + n4;
                            final int n10 = Class7796.method25144(this.field8578) + n8;
                            this.field8576[n9] = array[n8];
                            this.field8576[n9 + 1] = array[n10];
                            this.field8576[n9 + 2] = array[n10 + Class7796.method25144(this.field8578)];
                            this.field8576[n9 + 3] = array[n10 + 2 * Class7796.method25144(this.field8578)];
                        }
                    }
                }
            }
        }
        else {
            for (int field8574 = this.field8574; field8574 < Class7796.method25149(this.field8578); field8574 += this.field8575) {
                final int n11 = field8574 * Class7796.method25143(this.field8578);
                for (int n12 = 0; n12 < Class7796.method25144(this.field8578); ++n12) {
                    Class7796.method25146(this.field8578).method18038(this.field8576, n11 + n12 * Class7796.method25145(this.field8578), this.field8577);
                }
                if (Class7796.method25147(this.field8578) <= 2) {
                    if (Class7796.method25147(this.field8578) == 2) {
                        for (int n13 = 0; n13 < Class7796.method25144(this.field8578); ++n13) {
                            final int n14 = n11 + n13 * Class7796.method25145(this.field8578);
                            array[n13] = this.field8576[n14];
                            array[Class7796.method25144(this.field8578) + n13] = this.field8576[n14 + 1];
                        }
                        Class7796.method25148(this.field8578).method18038(array, 0, this.field8577);
                        Class7796.method25148(this.field8578).method18038(array, Class7796.method25144(this.field8578), this.field8577);
                        for (int n15 = 0; n15 < Class7796.method25144(this.field8578); ++n15) {
                            final int n16 = n11 + n15 * Class7796.method25145(this.field8578);
                            this.field8576[n16] = array[n15];
                            this.field8576[n16 + 1] = array[Class7796.method25144(this.field8578) + n15];
                        }
                    }
                }
                else {
                    for (int n17 = 0; n17 < Class7796.method25147(this.field8578); n17 += 4) {
                        for (int n18 = 0; n18 < Class7796.method25144(this.field8578); ++n18) {
                            final int n19 = n11 + n18 * Class7796.method25145(this.field8578) + n17;
                            final int n20 = Class7796.method25144(this.field8578) + n18;
                            array[n18] = this.field8576[n19];
                            array[n20] = this.field8576[n19 + 1];
                            array[n20 + Class7796.method25144(this.field8578)] = this.field8576[n19 + 2];
                            array[n20 + 2 * Class7796.method25144(this.field8578)] = this.field8576[n19 + 3];
                        }
                        Class7796.method25148(this.field8578).method18038(array, 0, this.field8577);
                        Class7796.method25148(this.field8578).method18038(array, Class7796.method25144(this.field8578), this.field8577);
                        Class7796.method25148(this.field8578).method18038(array, 2 * Class7796.method25144(this.field8578), this.field8577);
                        Class7796.method25148(this.field8578).method18038(array, 3 * Class7796.method25144(this.field8578), this.field8577);
                        for (int n21 = 0; n21 < Class7796.method25144(this.field8578); ++n21) {
                            final int n22 = n11 + n21 * Class7796.method25145(this.field8578) + n17;
                            final int n23 = Class7796.method25144(this.field8578) + n21;
                            this.field8576[n22] = array[n21];
                            this.field8576[n22 + 1] = array[n23];
                            this.field8576[n22 + 2] = array[n23 + Class7796.method25144(this.field8578)];
                            this.field8576[n22 + 3] = array[n23 + 2 * Class7796.method25144(this.field8578)];
                        }
                    }
                }
            }
        }
    }
}
