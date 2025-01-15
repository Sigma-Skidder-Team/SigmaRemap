// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1047 implements Runnable
{
    private static String[] field5612;
    public final /* synthetic */ int field5613;
    public final /* synthetic */ int field5614;
    public final /* synthetic */ double[] field5615;
    public final /* synthetic */ boolean field5616;
    public final /* synthetic */ Class6733 field5617;
    
    public Class1047(final Class6733 field5617, final int field5618, final int field5619, final double[] field5620, final boolean field5621) {
        this.field5617 = field5617;
        this.field5613 = field5618;
        this.field5614 = field5619;
        this.field5615 = field5620;
        this.field5616 = field5621;
    }
    
    @Override
    public void run() {
        for (int i = this.field5613; i < this.field5614; ++i) {
            final int n = i * Class6733.method20473(this.field5617);
            for (int j = 0; j < Class6733.method20474(this.field5617); ++j) {
                Class6733.method20476(this.field5617).method26078(this.field5615, n + j * Class6733.method20475(this.field5617), this.field5616);
            }
        }
    }
}
