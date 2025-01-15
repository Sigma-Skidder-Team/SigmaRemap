// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1111 implements Runnable
{
    private static String[] field5989;
    public final /* synthetic */ long field5990;
    public final /* synthetic */ long field5991;
    public final /* synthetic */ Class17 field5992;
    public final /* synthetic */ boolean field5993;
    public final /* synthetic */ Class7568 field5994;
    
    public Class1111(final Class7568 field5994, final long field5995, final long field5996, final Class17 field5997, final boolean field5998) {
        this.field5994 = field5994;
        this.field5990 = field5995;
        this.field5991 = field5996;
        this.field5992 = field5997;
        this.field5993 = field5998;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class7568.method23788(this.field5994), false);
        for (long field5990 = this.field5990; field5990 < this.field5991; ++field5990) {
            final long n = field5990 * Class7568.method23786(this.field5994);
            for (long n2 = 0L; n2 < Class7568.method23787(this.field5994); ++n2) {
                for (long n3 = 0L; n3 < Class7568.method23788(this.field5994); ++n3) {
                    class17.method171(n3, this.field5992.method137(n3 * Class7568.method23784(this.field5994) + n + n2));
                }
                Class7568.method23783(this.field5994).method30722(class17, this.field5993);
                for (long n4 = 0L; n4 < Class7568.method23788(this.field5994); ++n4) {
                    this.field5992.method171(n4 * Class7568.method23784(this.field5994) + n + n2, class17.method137(n4));
                }
            }
        }
    }
}
