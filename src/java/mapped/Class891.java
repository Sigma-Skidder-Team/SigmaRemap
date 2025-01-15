// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class891 implements Runnable
{
    private static String[] field4817;
    public final /* synthetic */ int field4818;
    public final /* synthetic */ int field4819;
    public final /* synthetic */ int field4820;
    public final /* synthetic */ int field4821;
    public final /* synthetic */ float[] field4822;
    public final /* synthetic */ Class7978 field4823;
    
    public Class891(final Class7978 field4823, final int field4824, final int field4825, final int field4826, final int field4827, final float[] field4828) {
        this.field4823 = field4823;
        this.field4818 = field4824;
        this.field4819 = field4825;
        this.field4820 = field4826;
        this.field4821 = field4827;
        this.field4822 = field4828;
    }
    
    @Override
    public void run() {
        for (int i = this.field4818; i < this.field4819; ++i) {
            final int n = 2 * i;
            final int n2 = this.field4820 + (this.field4821 - n) % this.field4821;
            this.field4822[n2] = this.field4822[this.field4820 + n];
            this.field4822[n2 + 1] = -this.field4822[this.field4820 + n + 1];
        }
    }
}
