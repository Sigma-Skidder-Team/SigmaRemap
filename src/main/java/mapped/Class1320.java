// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1320 implements Runnable
{
    private static String[] field7245;
    public final /* synthetic */ long field7246;
    public final /* synthetic */ int field7247;
    public final /* synthetic */ int field7248;
    public final /* synthetic */ int field7249;
    public final /* synthetic */ Class22 field7250;
    public final /* synthetic */ boolean field7251;
    public final /* synthetic */ Class8328 field7252;
    
    public Class1320(final Class8328 field7252, final long field7253, final int field7254, final int field7255, final int field7256, final Class22 field7257, final boolean field7258) {
        this.field7252 = field7252;
        this.field7246 = field7253;
        this.field7247 = field7254;
        this.field7248 = field7255;
        this.field7249 = field7256;
        this.field7250 = field7257;
        this.field7251 = field7258;
    }
    
    @Override
    public void run() {
        if (this.field7246 != 0L) {
            if (this.field7247 != 1) {
                for (long n = this.field7248; n < Class8328.method27762(this.field7252); n += this.field7249) {
                    Class8328.method27759(this.field7252).method25944(this.field7250, n * Class8328.method27764(this.field7252), this.field7251);
                }
            }
            else {
                for (long n2 = this.field7248; n2 < Class8328.method27762(this.field7252); n2 += this.field7249) {
                    Class8328.method27759(this.field7252).method25936(this.field7250, n2 * Class8328.method27764(this.field7252));
                }
            }
        }
        else if (this.field7247 != -1) {
            for (long n3 = this.field7248; n3 < Class8328.method27762(this.field7252); n3 += this.field7249) {
                Class8328.method27759(this.field7252).method25932(this.field7250, n3 * Class8328.method27764(this.field7252), this.field7251);
            }
        }
        else {
            for (long n4 = this.field7248; n4 < Class8328.method27762(this.field7252); n4 += this.field7249) {
                Class8328.method27759(this.field7252).method25928(this.field7250, n4 * Class8328.method27764(this.field7252));
            }
        }
    }
}
