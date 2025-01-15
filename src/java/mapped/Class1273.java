// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1273 implements Runnable
{
    private static String[] field6950;
    public final /* synthetic */ int field6951;
    public final /* synthetic */ int field6952;
    public final /* synthetic */ double[][] field6953;
    public final /* synthetic */ boolean field6954;
    public final /* synthetic */ Class4406 field6955;
    
    public Class1273(final Class4406 field6955, final int field6956, final int field6957, final double[][] field6958, final boolean field6959) {
        this.field6955 = field6955;
        this.field6951 = field6956;
        this.field6952 = field6957;
        this.field6953 = field6958;
        this.field6954 = field6959;
    }
    
    @Override
    public void run() {
        for (int i = this.field6951; i < this.field6952; ++i) {
            Class4406.method13333(this.field6955).method30725(this.field6953[i], this.field6954);
        }
    }
}
