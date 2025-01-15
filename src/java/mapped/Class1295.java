// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1295 implements Runnable
{
    private static String[] field7078;
    public final /* synthetic */ int field7079;
    public final /* synthetic */ int field7080;
    public final /* synthetic */ int field7081;
    public final /* synthetic */ int field7082;
    public final /* synthetic */ double[] field7083;
    public final /* synthetic */ boolean field7084;
    public final /* synthetic */ Class4406 field7085;
    
    public Class1295(final Class4406 field7085, final int field7086, final int field7087, final int field7088, final int field7089, final double[] field7090, final boolean field7091) {
        this.field7085 = field7085;
        this.field7079 = field7086;
        this.field7080 = field7087;
        this.field7081 = field7088;
        this.field7082 = field7089;
        this.field7083 = field7090;
        this.field7084 = field7091;
    }
    
    @Override
    public void run() {
        final double[] array = new double[this.field7079];
        if (Class4406.method13332(this.field7085) <= 2) {
            if (Class4406.method13332(this.field7085) == 2) {
                for (int i = 0; i < Class4406.method13334(this.field7085); ++i) {
                    final int n = i * Class4406.method13332(this.field7085) + 2 * this.field7081;
                    final int n2 = i;
                    array[n2] = this.field7083[n];
                    array[n2 + Class4406.method13334(this.field7085)] = this.field7083[n + 1];
                }
                if (this.field7080 != -1) {
                    Class4406.method13335(this.field7085).method30727(array, 0, this.field7084);
                    Class4406.method13335(this.field7085).method30727(array, Class4406.method13334(this.field7085), this.field7084);
                }
                else {
                    Class4406.method13335(this.field7085).method30723(array, 0, this.field7084);
                    Class4406.method13335(this.field7085).method30723(array, Class4406.method13334(this.field7085), this.field7084);
                }
                for (int j = 0; j < Class4406.method13334(this.field7085); ++j) {
                    final int n3 = j * Class4406.method13332(this.field7085) + 2 * this.field7081;
                    final int n4 = j;
                    this.field7083[n3] = array[n4];
                    this.field7083[n3 + 1] = array[n4 + Class4406.method13334(this.field7085)];
                }
            }
        }
        else if (this.field7080 != -1) {
            for (int k = 4 * this.field7081; k < Class4406.method13332(this.field7085); k += 4 * this.field7082) {
                for (int l = 0; l < Class4406.method13334(this.field7085); ++l) {
                    final int n5 = l * Class4406.method13332(this.field7085) + k;
                    final int n6 = Class4406.method13334(this.field7085) + l;
                    array[l] = this.field7083[n5];
                    array[n6] = this.field7083[n5 + 1];
                    array[n6 + Class4406.method13334(this.field7085)] = this.field7083[n5 + 2];
                    array[n6 + 2 * Class4406.method13334(this.field7085)] = this.field7083[n5 + 3];
                }
                Class4406.method13335(this.field7085).method30727(array, 0, this.field7084);
                Class4406.method13335(this.field7085).method30727(array, Class4406.method13334(this.field7085), this.field7084);
                Class4406.method13335(this.field7085).method30727(array, 2 * Class4406.method13334(this.field7085), this.field7084);
                Class4406.method13335(this.field7085).method30727(array, 3 * Class4406.method13334(this.field7085), this.field7084);
                for (int n7 = 0; n7 < Class4406.method13334(this.field7085); ++n7) {
                    final int n8 = n7 * Class4406.method13332(this.field7085) + k;
                    final int n9 = Class4406.method13334(this.field7085) + n7;
                    this.field7083[n8] = array[n7];
                    this.field7083[n8 + 1] = array[n9];
                    this.field7083[n8 + 2] = array[n9 + Class4406.method13334(this.field7085)];
                    this.field7083[n8 + 3] = array[n9 + 2 * Class4406.method13334(this.field7085)];
                }
            }
        }
        else {
            for (int n10 = 4 * this.field7081; n10 < Class4406.method13332(this.field7085); n10 += 4 * this.field7082) {
                for (int n11 = 0; n11 < Class4406.method13334(this.field7085); ++n11) {
                    final int n12 = n11 * Class4406.method13332(this.field7085) + n10;
                    final int n13 = Class4406.method13334(this.field7085) + n11;
                    array[n11] = this.field7083[n12];
                    array[n13] = this.field7083[n12 + 1];
                    array[n13 + Class4406.method13334(this.field7085)] = this.field7083[n12 + 2];
                    array[n13 + 2 * Class4406.method13334(this.field7085)] = this.field7083[n12 + 3];
                }
                Class4406.method13335(this.field7085).method30723(array, 0, this.field7084);
                Class4406.method13335(this.field7085).method30723(array, Class4406.method13334(this.field7085), this.field7084);
                Class4406.method13335(this.field7085).method30723(array, 2 * Class4406.method13334(this.field7085), this.field7084);
                Class4406.method13335(this.field7085).method30723(array, 3 * Class4406.method13334(this.field7085), this.field7084);
                for (int n14 = 0; n14 < Class4406.method13334(this.field7085); ++n14) {
                    final int n15 = n14 * Class4406.method13332(this.field7085) + n10;
                    final int n16 = Class4406.method13334(this.field7085) + n14;
                    this.field7083[n15] = array[n14];
                    this.field7083[n15 + 1] = array[n16];
                    this.field7083[n15 + 2] = array[n16 + Class4406.method13334(this.field7085)];
                    this.field7083[n15 + 3] = array[n16 + 2 * Class4406.method13334(this.field7085)];
                }
            }
        }
    }
}
