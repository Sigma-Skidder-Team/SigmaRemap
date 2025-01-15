// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1591 implements Runnable
{
    private static String[] field8874;
    public final /* synthetic */ long field8875;
    public final /* synthetic */ long field8876;
    public final /* synthetic */ Class22 field8877;
    public final /* synthetic */ long field8878;
    public final /* synthetic */ Class22 field8879;
    public final /* synthetic */ boolean field8880;
    public final /* synthetic */ Class8328 field8881;
    
    public Class1591(final Class8328 field8881, final long field8882, final long field8883, final Class22 field8884, final long field8885, final Class22 field8886, final boolean field8887) {
        this.field8881 = field8881;
        this.field8875 = field8882;
        this.field8876 = field8883;
        this.field8877 = field8884;
        this.field8878 = field8885;
        this.field8879 = field8886;
        this.field8880 = field8887;
    }
    
    @Override
    public void run() {
        for (long field8875 = this.field8875; field8875 < this.field8876; ++field8875) {
            final long n = 2L * field8875;
            for (long n2 = 0L; n2 < Class8328.method27762(this.field8881); ++n2) {
                final long n3 = 2L * n2;
                final long n4 = n2 * Class8328.method27764(this.field8881) + n;
                this.field8877.method171(field8875 * this.field8878 + n3, this.field8879.method135(n4));
                this.field8877.method171(field8875 * this.field8878 + n3 + 1L, this.field8879.method135(n4 + 1L));
            }
            Class8328.method27761(this.field8881).method25932(this.field8877, field8875 * this.field8878, this.field8880);
        }
    }
}
