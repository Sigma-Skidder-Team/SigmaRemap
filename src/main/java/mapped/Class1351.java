// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1351 implements Runnable
{
    private static String[] field7399;
    public final /* synthetic */ int field7400;
    public final /* synthetic */ int field7401;
    public final /* synthetic */ int field7402;
    public final /* synthetic */ int field7403;
    public final /* synthetic */ float[] field7404;
    public final /* synthetic */ boolean field7405;
    public final /* synthetic */ Class8328 field7406;
    
    public Class1351(final Class8328 field7406, final int field7407, final int field7408, final int field7409, final int field7410, final float[] field7411, final boolean field7412) {
        this.field7406 = field7406;
        this.field7400 = field7407;
        this.field7401 = field7408;
        this.field7402 = field7409;
        this.field7403 = field7410;
        this.field7404 = field7411;
        this.field7405 = field7412;
    }
    
    @Override
    public void run() {
        if (this.field7400 != 0) {
            if (this.field7401 != 1) {
                for (int i = this.field7402; i < Class8328.method27760(this.field7406); i += this.field7403) {
                    Class8328.method27759(this.field7406).method25943(this.field7404, i * Class8328.method27763(this.field7406), this.field7405);
                }
            }
            else {
                for (int j = this.field7402; j < Class8328.method27760(this.field7406); j += this.field7403) {
                    Class8328.method27759(this.field7406).method25935(this.field7404, j * Class8328.method27763(this.field7406));
                }
            }
        }
        else if (this.field7401 != -1) {
            for (int k = this.field7402; k < Class8328.method27760(this.field7406); k += this.field7403) {
                Class8328.method27759(this.field7406).method25931(this.field7404, k * Class8328.method27763(this.field7406), this.field7405);
            }
        }
        else {
            for (int l = this.field7402; l < Class8328.method27760(this.field7406); l += this.field7403) {
                Class8328.method27759(this.field7406).method25927(this.field7404, l * Class8328.method27763(this.field7406));
            }
        }
    }
}
