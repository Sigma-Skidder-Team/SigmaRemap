// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1395 implements Runnable
{
    private static String[] field7692;
    public final /* synthetic */ long field7693;
    public final /* synthetic */ long field7694;
    public final /* synthetic */ Class17 field7695;
    public final /* synthetic */ boolean field7696;
    public final /* synthetic */ Class7568 field7697;
    
    public Class1395(final Class7568 field7697, final long field7698, final long field7699, final Class17 field7700, final boolean field7701) {
        this.field7697 = field7697;
        this.field7693 = field7698;
        this.field7694 = field7699;
        this.field7695 = field7700;
        this.field7696 = field7701;
    }
    
    @Override
    public void run() {
        for (long field7693 = this.field7693; field7693 < this.field7694; ++field7693) {
            final long n = field7693 * Class7568.method23776(this.field7697);
            for (long n2 = 0L; n2 < Class7568.method23785(this.field7697); ++n2) {
                Class7568.method23779(this.field7697).method30728(this.field7695, n + n2 * Class7568.method23778(this.field7697), this.field7696);
            }
        }
    }
}
