// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1041 implements Runnable
{
    private static String[] field5576;
    public final /* synthetic */ int field5577;
    public final /* synthetic */ int field5578;
    public final /* synthetic */ float[][][] field5579;
    public final /* synthetic */ boolean field5580;
    public final /* synthetic */ Class5934 field5581;
    
    public Class1041(final Class5934 field5581, final int field5582, final int field5583, final float[][][] field5584, final boolean field5585) {
        this.field5581 = field5581;
        this.field5577 = field5582;
        this.field5578 = field5583;
        this.field5579 = field5584;
        this.field5580 = field5585;
    }
    
    @Override
    public void run() {
        for (int i = this.field5577; i < this.field5578; ++i) {
            for (int j = 0; j < Class5934.method17838(this.field5581); ++j) {
                Class5934.method17840(this.field5581).method30449(this.field5579[i][j], this.field5580);
            }
        }
    }
}
