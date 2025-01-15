// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1507 implements Runnable
{
    private static String[] field8385;
    public final /* synthetic */ int field8386;
    public final /* synthetic */ int field8387;
    public final /* synthetic */ int field8388;
    public final /* synthetic */ float[][][] field8389;
    public final /* synthetic */ float[] field8390;
    public final /* synthetic */ int field8391;
    public final /* synthetic */ int field8392;
    public final /* synthetic */ Class6362 field8393;
    
    public Class1507(final Class6362 field8393, final int field8394, final int field8395, final int field8396, final float[][][] field8397, final float[] field8398, final int field8399, final int field8400) {
        this.field8393 = field8393;
        this.field8386 = field8394;
        this.field8387 = field8395;
        this.field8388 = field8396;
        this.field8389 = field8397;
        this.field8390 = field8398;
        this.field8391 = field8399;
        this.field8392 = field8400;
    }
    
    @Override
    public void run() {
        for (int i = this.field8386; i < this.field8387; ++i) {
            final int n = i * this.field8388;
            for (int j = 0; j < Class6362.method18998(this.field8393); ++j) {
                System.arraycopy(this.field8389[i][j], 0, this.field8390, n + j * this.field8391, this.field8392);
            }
        }
    }
}
