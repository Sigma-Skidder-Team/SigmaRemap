// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1249 implements Runnable
{
    private static String[] field6795;
    public final /* synthetic */ long field6796;
    public final /* synthetic */ long field6797;
    public final /* synthetic */ long field6798;
    public final /* synthetic */ Class22 field6799;
    public final /* synthetic */ Class7978 field6800;
    
    public Class1249(final Class7978 field6800, final long field6801, final long field6802, final long field6803, final Class22 field6804) {
        this.field6800 = field6800;
        this.field6796 = field6801;
        this.field6797 = field6802;
        this.field6798 = field6803;
        this.field6799 = field6804;
    }
    
    @Override
    public void run() {
        if (this.field6796 <= 0L) {
            for (long field6797 = this.field6797; field6797 < this.field6798; ++field6797) {
                final long n = 2L * field6797;
                final long n2 = n + 1L;
                final float n3 = this.field6799.method135(n) * Class7978.method26007(this.field6800).method135(n2) + this.field6799.method135(n2) * Class7978.method26007(this.field6800).method135(n);
                this.field6799.method169(n, this.field6799.method135(n) * Class7978.method26007(this.field6800).method135(n) - this.field6799.method135(n2) * Class7978.method26007(this.field6800).method135(n2));
                this.field6799.method169(n2, n3);
            }
        }
        else {
            for (long field6798 = this.field6797; field6798 < this.field6798; ++field6798) {
                final long n4 = 2L * field6798;
                final long n5 = n4 + 1L;
                final float n6 = -this.field6799.method135(n4) * Class7978.method26007(this.field6800).method135(n5) + this.field6799.method135(n5) * Class7978.method26007(this.field6800).method135(n4);
                this.field6799.method169(n4, this.field6799.method135(n4) * Class7978.method26007(this.field6800).method135(n4) + this.field6799.method135(n5) * Class7978.method26007(this.field6800).method135(n5));
                this.field6799.method169(n5, n6);
            }
        }
    }
}
