// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1628 implements Runnable
{
    private static String[] field9099;
    public final /* synthetic */ int field9100;
    public final /* synthetic */ int field9101;
    public final /* synthetic */ int field9102;
    public final /* synthetic */ int field9103;
    public final /* synthetic */ float[] field9104;
    public final /* synthetic */ boolean field9105;
    public final /* synthetic */ Class7706 field9106;
    
    public Class1628(final Class7706 field9106, final int field9107, final int field9108, final int field9109, final int field9110, final float[] field9111, final boolean field9112) {
        this.field9106 = field9106;
        this.field9100 = field9107;
        this.field9101 = field9108;
        this.field9102 = field9109;
        this.field9103 = field9110;
        this.field9104 = field9111;
        this.field9105 = field9112;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field9100];
        if (Class7706.method24576(this.field9106) <= 2) {
            if (Class7706.method24576(this.field9106) == 2) {
                for (int i = 0; i < Class7706.method24578(this.field9106); ++i) {
                    final int n = i * Class7706.method24576(this.field9106) + 2 * this.field9102;
                    final int n2 = i;
                    array[n2] = this.field9104[n];
                    array[n2 + Class7706.method24578(this.field9106)] = this.field9104[n + 1];
                }
                if (this.field9101 != -1) {
                    Class7706.method24579(this.field9106).method29695(array, 0, this.field9105);
                    Class7706.method24579(this.field9106).method29695(array, Class7706.method24578(this.field9106), this.field9105);
                }
                else {
                    Class7706.method24579(this.field9106).method29691(array, 0, this.field9105);
                    Class7706.method24579(this.field9106).method29691(array, Class7706.method24578(this.field9106), this.field9105);
                }
                for (int j = 0; j < Class7706.method24578(this.field9106); ++j) {
                    final int n3 = j * Class7706.method24576(this.field9106) + 2 * this.field9102;
                    final int n4 = j;
                    this.field9104[n3] = array[n4];
                    this.field9104[n3 + 1] = array[n4 + Class7706.method24578(this.field9106)];
                }
            }
        }
        else if (this.field9101 != -1) {
            for (int k = 4 * this.field9102; k < Class7706.method24576(this.field9106); k += 4 * this.field9103) {
                for (int l = 0; l < Class7706.method24578(this.field9106); ++l) {
                    final int n5 = l * Class7706.method24576(this.field9106) + k;
                    final int n6 = Class7706.method24578(this.field9106) + l;
                    array[l] = this.field9104[n5];
                    array[n6] = this.field9104[n5 + 1];
                    array[n6 + Class7706.method24578(this.field9106)] = this.field9104[n5 + 2];
                    array[n6 + 2 * Class7706.method24578(this.field9106)] = this.field9104[n5 + 3];
                }
                Class7706.method24579(this.field9106).method29693(array, this.field9105);
                Class7706.method24579(this.field9106).method29695(array, Class7706.method24578(this.field9106), this.field9105);
                Class7706.method24579(this.field9106).method29695(array, 2 * Class7706.method24578(this.field9106), this.field9105);
                Class7706.method24579(this.field9106).method29695(array, 3 * Class7706.method24578(this.field9106), this.field9105);
                for (int n7 = 0; n7 < Class7706.method24578(this.field9106); ++n7) {
                    final int n8 = n7 * Class7706.method24576(this.field9106) + k;
                    final int n9 = Class7706.method24578(this.field9106) + n7;
                    this.field9104[n8] = array[n7];
                    this.field9104[n8 + 1] = array[n9];
                    this.field9104[n8 + 2] = array[n9 + Class7706.method24578(this.field9106)];
                    this.field9104[n8 + 3] = array[n9 + 2 * Class7706.method24578(this.field9106)];
                }
            }
        }
        else {
            for (int n10 = 4 * this.field9102; n10 < Class7706.method24576(this.field9106); n10 += 4 * this.field9103) {
                for (int n11 = 0; n11 < Class7706.method24578(this.field9106); ++n11) {
                    final int n12 = n11 * Class7706.method24576(this.field9106) + n10;
                    final int n13 = Class7706.method24578(this.field9106) + n11;
                    array[n11] = this.field9104[n12];
                    array[n13] = this.field9104[n12 + 1];
                    array[n13 + Class7706.method24578(this.field9106)] = this.field9104[n12 + 2];
                    array[n13 + 2 * Class7706.method24578(this.field9106)] = this.field9104[n12 + 3];
                }
                Class7706.method24579(this.field9106).method29691(array, 0, this.field9105);
                Class7706.method24579(this.field9106).method29691(array, Class7706.method24578(this.field9106), this.field9105);
                Class7706.method24579(this.field9106).method29691(array, 2 * Class7706.method24578(this.field9106), this.field9105);
                Class7706.method24579(this.field9106).method29691(array, 3 * Class7706.method24578(this.field9106), this.field9105);
                for (int n14 = 0; n14 < Class7706.method24578(this.field9106); ++n14) {
                    final int n15 = n14 * Class7706.method24576(this.field9106) + n10;
                    final int n16 = Class7706.method24578(this.field9106) + n14;
                    this.field9104[n15] = array[n14];
                    this.field9104[n15 + 1] = array[n16];
                    this.field9104[n15 + 2] = array[n16 + Class7706.method24578(this.field9106)];
                    this.field9104[n15 + 3] = array[n16 + 2 * Class7706.method24578(this.field9106)];
                }
            }
        }
    }
}
