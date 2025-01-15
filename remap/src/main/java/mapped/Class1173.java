// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1173 implements Runnable
{
    private static String[] field6355;
    public final /* synthetic */ int field6356;
    public final /* synthetic */ int field6357;
    public final /* synthetic */ double[][] field6358;
    public final /* synthetic */ Class8983 field6359;
    
    public Class1173(final Class8983 field6359, final int field6360, final int field6361, final double[][] field6362) {
        this.field6359 = field6359;
        this.field6356 = field6360;
        this.field6357 = field6361;
        this.field6358 = field6362;
    }
    
    @Override
    public void run() {
        for (int i = this.field6356; i < this.field6357; ++i) {
            Class8983.method31975(this.field6359).method26080(this.field6358[i]);
        }
    }
}
