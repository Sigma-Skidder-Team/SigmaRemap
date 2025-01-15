// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1218 implements Runnable
{
    private static String[] field6612;
    public final /* synthetic */ int field6613;
    public final /* synthetic */ int field6614;
    public final /* synthetic */ float[] field6615;
    public final /* synthetic */ boolean field6616;
    public final /* synthetic */ Class6710 field6617;
    
    public Class1218(final Class6710 field6617, final int field6618, final int field6619, final float[] field6620, final boolean field6621) {
        this.field6617 = field6617;
        this.field6613 = field6618;
        this.field6614 = field6619;
        this.field6615 = field6620;
        this.field6616 = field6621;
    }
    
    @Override
    public void run() {
        for (int i = this.field6613; i < this.field6614; ++i) {
            Class6710.method20381(this.field6617).method34187(this.field6615, i * Class6710.method20380(this.field6617), this.field6616);
        }
    }
}
