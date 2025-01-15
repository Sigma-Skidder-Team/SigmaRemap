// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1021 implements Runnable
{
    private static String[] field5463;
    public final /* synthetic */ int field5464;
    public final /* synthetic */ int field5465;
    public final /* synthetic */ int field5466;
    public final /* synthetic */ float[][][] field5467;
    public final /* synthetic */ float[] field5468;
    public final /* synthetic */ int field5469;
    public final /* synthetic */ int field5470;
    public final /* synthetic */ Class6362 field5471;
    
    public Class1021(final Class6362 field5471, final int field5472, final int field5473, final int field5474, final float[][][] field5475, final float[] field5476, final int field5477, final int field5478) {
        this.field5471 = field5471;
        this.field5464 = field5472;
        this.field5465 = field5473;
        this.field5466 = field5474;
        this.field5467 = field5475;
        this.field5468 = field5476;
        this.field5469 = field5477;
        this.field5470 = field5478;
    }
    
    @Override
    public void run() {
        for (int i = this.field5464; i < this.field5465; ++i) {
            final int n = i * this.field5466;
            for (int j = 0; j < Class6362.method18998(this.field5471); ++j) {
                System.arraycopy(this.field5467[i][j], 0, this.field5468, n + j * this.field5469, this.field5470);
            }
        }
    }
}
