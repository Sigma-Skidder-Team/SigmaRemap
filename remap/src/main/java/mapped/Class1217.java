// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1217 implements Runnable
{
    private static String[] field6606;
    public final /* synthetic */ int field6607;
    public final /* synthetic */ int field6608;
    public final /* synthetic */ float[][] field6609;
    public final /* synthetic */ boolean field6610;
    public final /* synthetic */ Class6710 field6611;
    
    public Class1217(final Class6710 field6611, final int field6612, final int field6613, final float[][] field6614, final boolean field6615) {
        this.field6611 = field6611;
        this.field6607 = field6612;
        this.field6608 = field6613;
        this.field6609 = field6614;
        this.field6610 = field6615;
    }
    
    @Override
    public void run() {
        for (int i = this.field6607; i < this.field6608; ++i) {
            Class6710.method20381(this.field6611).method34185(this.field6609[i], this.field6610);
        }
    }
}
