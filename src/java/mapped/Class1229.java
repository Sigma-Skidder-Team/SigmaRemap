// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1229 implements Runnable
{
    private static String[] field6683;
    public final /* synthetic */ int field6684;
    public final /* synthetic */ int field6685;
    public final /* synthetic */ double[] field6686;
    public final /* synthetic */ Class6733 field6687;
    
    public Class1229(final Class6733 field6687, final int field6688, final int field6689, final double[] field6690) {
        this.field6687 = field6687;
        this.field6684 = field6688;
        this.field6685 = field6689;
        this.field6686 = field6690;
    }
    
    @Override
    public void run() {
        for (int i = this.field6684; i < this.field6685; ++i) {
            final int n = i * Class6733.method20473(this.field6687);
            for (int j = 0; j < Class6733.method20474(this.field6687); ++j) {
                Class6733.method20476(this.field6687).method26074(this.field6686, n + j * Class6733.method20475(this.field6687));
            }
        }
    }
}
