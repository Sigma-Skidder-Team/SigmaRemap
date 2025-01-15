// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1123 implements Runnable
{
    private static String[] field6054;
    public final /* synthetic */ int field6055;
    public final /* synthetic */ int field6056;
    public final /* synthetic */ float[][] field6057;
    public final /* synthetic */ boolean field6058;
    public final /* synthetic */ Class6874 field6059;
    
    public Class1123(final Class6874 field6059, final int field6060, final int field6061, final float[][] field6062, final boolean field6063) {
        this.field6059 = field6059;
        this.field6055 = field6060;
        this.field6056 = field6061;
        this.field6057 = field6062;
        this.field6058 = field6063;
    }
    
    @Override
    public void run() {
        for (int i = this.field6055; i < this.field6056; ++i) {
            Class6874.method21034(this.field6059).method30449(this.field6057[i], this.field6058);
        }
    }
}
