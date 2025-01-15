// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1050 implements Runnable
{
    private static String[] field5630;
    public final /* synthetic */ int field5631;
    public final /* synthetic */ int field5632;
    public final /* synthetic */ float[] field5633;
    public final /* synthetic */ boolean field5634;
    public final /* synthetic */ Class6498 field5635;
    
    public Class1050(final Class6498 field5635, final int field5636, final int field5637, final float[] field5638, final boolean field5639) {
        this.field5635 = field5635;
        this.field5631 = field5636;
        this.field5632 = field5637;
        this.field5633 = field5638;
        this.field5634 = field5639;
    }
    
    @Override
    public void run() {
        for (int i = this.field5631; i < this.field5632; ++i) {
            final int n = i * Class6498.method19564(this.field5635);
            for (int j = 0; j < Class6498.method19565(this.field5635); ++j) {
                Class6498.method19567(this.field5635).method34187(this.field5633, n + j * Class6498.method19566(this.field5635), this.field5634);
            }
        }
    }
}
