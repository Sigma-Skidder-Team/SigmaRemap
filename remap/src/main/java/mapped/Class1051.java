// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1051 implements Runnable
{
    private static String[] field5636;
    public final /* synthetic */ int field5637;
    public final /* synthetic */ int field5638;
    public final /* synthetic */ float[] field5639;
    public final /* synthetic */ int field5640;
    public final /* synthetic */ float[] field5641;
    public final /* synthetic */ Class8770 field5642;
    
    public Class1051(final Class8770 field5642, final int field5643, final int field5644, final float[] field5645, final int field5646, final float[] field5647) {
        this.field5642 = field5642;
        this.field5637 = field5643;
        this.field5638 = field5644;
        this.field5639 = field5645;
        this.field5640 = field5646;
        this.field5641 = field5647;
    }
    
    @Override
    public void run() {
        for (int i = this.field5637; i < this.field5638; ++i) {
            final int n = 2 * i;
            final int n2 = n + 1;
            this.field5639[this.field5640 + i] = this.field5641[n] - this.field5641[n2];
            this.field5639[this.field5640 + Class8770.method30453(this.field5642) - i] = this.field5641[n] + this.field5641[n2];
        }
    }
}
