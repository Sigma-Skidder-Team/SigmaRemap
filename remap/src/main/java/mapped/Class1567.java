// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1567 implements Runnable
{
    private static String[] field8770;
    public final /* synthetic */ int field8771;
    public final /* synthetic */ int field8772;
    public final /* synthetic */ int field8773;
    public final /* synthetic */ int field8774;
    public final /* synthetic */ double[] field8775;
    public final /* synthetic */ Class7992 field8776;
    
    public Class1567(final Class7992 field8776, final int field8777, final int field8778, final int field8779, final int field8780, final double[] field8781) {
        this.field8776 = field8776;
        this.field8771 = field8777;
        this.field8772 = field8778;
        this.field8773 = field8779;
        this.field8774 = field8780;
        this.field8775 = field8781;
    }
    
    @Override
    public void run() {
        for (int i = this.field8771; i < this.field8772; ++i) {
            final int n = 2 * i;
            final int n2 = this.field8773 + (this.field8774 - n) % this.field8774;
            this.field8775[n2] = this.field8775[this.field8773 + n];
            this.field8775[n2 + 1] = -this.field8775[this.field8773 + n + 1];
        }
    }
}
