// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1120 implements Runnable
{
    private static String[] field6034;
    public final /* synthetic */ int field6035;
    public final /* synthetic */ int field6036;
    public final /* synthetic */ float[][] field6037;
    public final /* synthetic */ boolean field6038;
    public final /* synthetic */ Class6710 field6039;
    
    public Class1120(final Class6710 field6039, final int field6040, final int field6041, final float[][] field6042, final boolean field6043) {
        this.field6039 = field6039;
        this.field6035 = field6040;
        this.field6036 = field6041;
        this.field6037 = field6042;
        this.field6038 = field6043;
    }
    
    @Override
    public void run() {
        for (int i = this.field6035; i < this.field6036; ++i) {
            Class6710.method20381(this.field6039).method34181(this.field6037[i], this.field6038);
        }
    }
}
