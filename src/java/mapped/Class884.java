// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class884 implements Runnable
{
    private static String[] field4771;
    public final /* synthetic */ int field4772;
    public final /* synthetic */ int field4773;
    public final /* synthetic */ double[] field4774;
    public final /* synthetic */ boolean field4775;
    public final /* synthetic */ Class8983 field4776;
    
    public Class884(final Class8983 field4776, final int field4777, final int field4778, final double[] field4779, final boolean field4780) {
        this.field4776 = field4776;
        this.field4772 = field4777;
        this.field4773 = field4778;
        this.field4774 = field4779;
        this.field4775 = field4780;
    }
    
    @Override
    public void run() {
        for (int i = this.field4772; i < this.field4773; ++i) {
            Class8983.method31975(this.field4776).method26096(this.field4774, i * Class8983.method31979(this.field4776), this.field4775);
        }
    }
}
