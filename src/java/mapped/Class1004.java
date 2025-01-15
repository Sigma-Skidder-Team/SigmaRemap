// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1004 implements Runnable
{
    private static String[] field5353;
    public final /* synthetic */ int field5354;
    public final /* synthetic */ int field5355;
    public final /* synthetic */ double[] field5356;
    public final /* synthetic */ int field5357;
    public final /* synthetic */ boolean field5358;
    public final /* synthetic */ Class8983 field5359;
    
    public Class1004(final Class8983 field5359, final int field5360, final int field5361, final double[] field5362, final int field5363, final boolean field5364) {
        this.field5359 = field5359;
        this.field5354 = field5360;
        this.field5355 = field5361;
        this.field5356 = field5362;
        this.field5357 = field5363;
        this.field5358 = field5364;
    }
    
    @Override
    public void run() {
        for (int i = this.field5354; i < this.field5355; ++i) {
            Class8983.method31975(this.field5359).method26078(this.field5356, i * this.field5357, this.field5358);
        }
    }
}
