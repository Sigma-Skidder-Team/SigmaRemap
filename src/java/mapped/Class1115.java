// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1115 implements Runnable
{
    private static String[] field6004;
    public final /* synthetic */ long field6005;
    public final /* synthetic */ long field6006;
    public final /* synthetic */ Class17 field6007;
    public final /* synthetic */ boolean field6008;
    public final /* synthetic */ Class7568 field6009;
    
    public Class1115(final Class7568 field6009, final long field6010, final long field6011, final Class17 field6012, final boolean field6013) {
        this.field6009 = field6009;
        this.field6005 = field6010;
        this.field6006 = field6011;
        this.field6007 = field6012;
        this.field6008 = field6013;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class7568.method23788(this.field6009), false);
        for (long field6005 = this.field6005; field6005 < this.field6006; ++field6005) {
            final long n = field6005 * Class7568.method23778(this.field6009);
            for (long n2 = 0L; n2 < Class7568.method23787(this.field6009); ++n2) {
                for (long n3 = 0L; n3 < Class7568.method23788(this.field6009); ++n3) {
                    class17.method171(n3, this.field6007.method137(n3 * Class7568.method23776(this.field6009) + n + n2));
                }
                Class7568.method23783(this.field6009).method30726(class17, this.field6008);
                for (long n4 = 0L; n4 < Class7568.method23788(this.field6009); ++n4) {
                    this.field6007.method171(n4 * Class7568.method23776(this.field6009) + n + n2, class17.method137(n4));
                }
            }
        }
    }
}
