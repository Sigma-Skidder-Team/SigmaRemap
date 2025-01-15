// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1473 implements Runnable
{
    private static String[] field8177;
    public final /* synthetic */ long field8178;
    public final /* synthetic */ long field8179;
    public final /* synthetic */ Class17 field8180;
    public final /* synthetic */ boolean field8181;
    public final /* synthetic */ Class7796 field8182;
    
    public Class1473(final Class7796 field8182, final long field8183, final long field8184, final Class17 field8185, final boolean field8186) {
        this.field8182 = field8182;
        this.field8178 = field8183;
        this.field8179 = field8184;
        this.field8180 = field8185;
        this.field8181 = field8186;
    }
    
    @Override
    public void run() {
        for (long field8178 = this.field8178; field8178 < this.field8179; ++field8178) {
            final long n = field8178 * Class7796.method25151(this.field8182);
            for (long n2 = 0L; n2 < Class7796.method25152(this.field8182); ++n2) {
                Class7796.method25146(this.field8182).method18039(this.field8180, n + n2 * Class7796.method25153(this.field8182), this.field8181);
            }
        }
    }
}
