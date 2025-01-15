// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1216 implements Runnable
{
    private static String[] field6600;
    public final /* synthetic */ int field6601;
    public final /* synthetic */ int field6602;
    public final /* synthetic */ float[] field6603;
    public final /* synthetic */ boolean field6604;
    public final /* synthetic */ Class6498 field6605;
    
    public Class1216(final Class6498 field6605, final int field6606, final int field6607, final float[] field6608, final boolean field6609) {
        this.field6605 = field6605;
        this.field6601 = field6606;
        this.field6602 = field6607;
        this.field6603 = field6608;
        this.field6604 = field6609;
    }
    
    @Override
    public void run() {
        for (int i = this.field6601; i < this.field6602; ++i) {
            final int n = i * Class6498.method19564(this.field6605);
            for (int j = 0; j < Class6498.method19565(this.field6605); ++j) {
                Class6498.method19567(this.field6605).method34183(this.field6603, n + j * Class6498.method19566(this.field6605), this.field6604);
            }
        }
    }
}
