// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1538 implements Runnable
{
    private static String[] field8593;
    public final /* synthetic */ long field8594;
    public final /* synthetic */ long field8595;
    public final /* synthetic */ Class17 field8596;
    public final /* synthetic */ boolean field8597;
    public final /* synthetic */ Class7796 field8598;
    
    public Class1538(final Class7796 field8598, final long field8599, final long field8600, final Class17 field8601, final boolean field8602) {
        this.field8598 = field8598;
        this.field8594 = field8599;
        this.field8595 = field8600;
        this.field8596 = field8601;
        this.field8597 = field8602;
    }
    
    @Override
    public void run() {
        for (long field8594 = this.field8594; field8594 < this.field8595; ++field8594) {
            final long n = field8594 * Class7796.method25151(this.field8598);
            for (long n2 = 0L; n2 < Class7796.method25152(this.field8598); ++n2) {
                Class7796.method25146(this.field8598).method18043(this.field8596, n + n2 * Class7796.method25153(this.field8598), this.field8597);
            }
        }
    }
}
