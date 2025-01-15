// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1559 implements Runnable
{
    private static String[] field8723;
    public final /* synthetic */ int field8724;
    public final /* synthetic */ int field8725;
    public final /* synthetic */ double[][] field8726;
    public final /* synthetic */ boolean field8727;
    public final /* synthetic */ Class4406 field8728;
    
    public Class1559(final Class4406 field8728, final int field8729, final int field8730, final double[][] field8731, final boolean field8732) {
        this.field8728 = field8728;
        this.field8724 = field8729;
        this.field8725 = field8730;
        this.field8726 = field8731;
        this.field8727 = field8732;
    }
    
    @Override
    public void run() {
        for (int i = this.field8724; i < this.field8725; ++i) {
            Class4406.method13333(this.field8728).method30721(this.field8726[i], this.field8727);
        }
    }
}
