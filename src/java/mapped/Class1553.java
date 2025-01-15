// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1553 implements Runnable
{
    private static String[] field8682;
    public final /* synthetic */ int field8683;
    public final /* synthetic */ int field8684;
    public final /* synthetic */ double[][][] field8685;
    public final /* synthetic */ boolean field8686;
    public final /* synthetic */ Class7796 field8687;
    
    public Class1553(final Class7796 field8687, final int field8688, final int field8689, final double[][][] field8690, final boolean field8691) {
        this.field8687 = field8687;
        this.field8683 = field8688;
        this.field8684 = field8689;
        this.field8685 = field8690;
        this.field8686 = field8691;
    }
    
    @Override
    public void run() {
        for (int i = this.field8683; i < this.field8684; ++i) {
            for (int j = 0; j < Class7796.method25144(this.field8687); ++j) {
                Class7796.method25146(this.field8687).method18040(this.field8685[i][j], this.field8686);
            }
        }
    }
}
