// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1280 implements Runnable
{
    private static String[] field6993;
    public final /* synthetic */ int field6994;
    public final /* synthetic */ int field6995;
    public final /* synthetic */ int field6996;
    public final /* synthetic */ int field6997;
    public final /* synthetic */ float[][] field6998;
    public final /* synthetic */ boolean field6999;
    public final /* synthetic */ Class7706 field7000;
    
    public Class1280(final Class7706 field7000, final int field7001, final int field7002, final int field7003, final int field7004, final float[][] field7005, final boolean field7006) {
        this.field7000 = field7000;
        this.field6994 = field7001;
        this.field6995 = field7002;
        this.field6996 = field7003;
        this.field6997 = field7004;
        this.field6998 = field7005;
        this.field6999 = field7006;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field6994];
        if (Class7706.method24576(this.field7000) <= 2) {
            if (Class7706.method24576(this.field7000) == 2) {
                for (int i = 0; i < Class7706.method24578(this.field7000); ++i) {
                    final int n = i;
                    array[n] = this.field6998[i][2 * this.field6996];
                    array[n + Class7706.method24578(this.field7000)] = this.field6998[i][2 * this.field6996 + 1];
                }
                if (this.field6995 != -1) {
                    Class7706.method24579(this.field7000).method29695(array, 0, this.field6999);
                    Class7706.method24579(this.field7000).method29695(array, Class7706.method24578(this.field7000), this.field6999);
                }
                else {
                    Class7706.method24579(this.field7000).method29691(array, 0, this.field6999);
                    Class7706.method24579(this.field7000).method29691(array, Class7706.method24578(this.field7000), this.field6999);
                }
                for (int j = 0; j < Class7706.method24578(this.field7000); ++j) {
                    final int n2 = j;
                    this.field6998[j][2 * this.field6996] = array[n2];
                    this.field6998[j][2 * this.field6996 + 1] = array[n2 + Class7706.method24578(this.field7000)];
                }
            }
        }
        else if (this.field6995 != -1) {
            for (int k = 4 * this.field6996; k < Class7706.method24576(this.field7000); k += 4 * this.field6997) {
                for (int l = 0; l < Class7706.method24578(this.field7000); ++l) {
                    final int n3 = Class7706.method24578(this.field7000) + l;
                    array[l] = this.field6998[l][k];
                    array[n3] = this.field6998[l][k + 1];
                    array[n3 + Class7706.method24578(this.field7000)] = this.field6998[l][k + 2];
                    array[n3 + 2 * Class7706.method24578(this.field7000)] = this.field6998[l][k + 3];
                }
                Class7706.method24579(this.field7000).method29695(array, 0, this.field6999);
                Class7706.method24579(this.field7000).method29695(array, Class7706.method24578(this.field7000), this.field6999);
                Class7706.method24579(this.field7000).method29695(array, 2 * Class7706.method24578(this.field7000), this.field6999);
                Class7706.method24579(this.field7000).method29695(array, 3 * Class7706.method24578(this.field7000), this.field6999);
                for (int n4 = 0; n4 < Class7706.method24578(this.field7000); ++n4) {
                    final int n5 = Class7706.method24578(this.field7000) + n4;
                    this.field6998[n4][k] = array[n4];
                    this.field6998[n4][k + 1] = array[n5];
                    this.field6998[n4][k + 2] = array[n5 + Class7706.method24578(this.field7000)];
                    this.field6998[n4][k + 3] = array[n5 + 2 * Class7706.method24578(this.field7000)];
                }
            }
        }
        else {
            for (int n6 = 4 * this.field6996; n6 < Class7706.method24576(this.field7000); n6 += 4 * this.field6997) {
                for (int n7 = 0; n7 < Class7706.method24578(this.field7000); ++n7) {
                    final int n8 = Class7706.method24578(this.field7000) + n7;
                    array[n7] = this.field6998[n7][n6];
                    array[n8] = this.field6998[n7][n6 + 1];
                    array[n8 + Class7706.method24578(this.field7000)] = this.field6998[n7][n6 + 2];
                    array[n8 + 2 * Class7706.method24578(this.field7000)] = this.field6998[n7][n6 + 3];
                }
                Class7706.method24579(this.field7000).method29691(array, 0, this.field6999);
                Class7706.method24579(this.field7000).method29691(array, Class7706.method24578(this.field7000), this.field6999);
                Class7706.method24579(this.field7000).method29691(array, 2 * Class7706.method24578(this.field7000), this.field6999);
                Class7706.method24579(this.field7000).method29691(array, 3 * Class7706.method24578(this.field7000), this.field6999);
                for (int n9 = 0; n9 < Class7706.method24578(this.field7000); ++n9) {
                    final int n10 = Class7706.method24578(this.field7000) + n9;
                    this.field6998[n9][n6] = array[n9];
                    this.field6998[n9][n6 + 1] = array[n10];
                    this.field6998[n9][n6 + 2] = array[n10 + Class7706.method24578(this.field7000)];
                    this.field6998[n9][n6 + 3] = array[n10 + 2 * Class7706.method24578(this.field7000)];
                }
            }
        }
    }
}
