// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1166 implements Runnable
{
    private static String[] field6325;
    public final /* synthetic */ int field6326;
    public final /* synthetic */ int field6327;
    public final /* synthetic */ double[][] field6328;
    public final /* synthetic */ boolean field6329;
    public final /* synthetic */ Class8983 field6330;
    
    public Class1166(final Class8983 field6330, final int field6331, final int field6332, final double[][] field6333, final boolean field6334) {
        this.field6330 = field6330;
        this.field6326 = field6331;
        this.field6327 = field6332;
        this.field6328 = field6333;
        this.field6329 = field6334;
    }
    
    @Override
    public void run() {
        for (int i = this.field6326; i < this.field6327; ++i) {
            Class8983.method31975(this.field6330).method26076(this.field6328[i], this.field6329);
        }
    }
}
