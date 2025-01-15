// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1122 implements Runnable
{
    private static String[] field6048;
    public final /* synthetic */ int field6049;
    public final /* synthetic */ int field6050;
    public final /* synthetic */ float[] field6051;
    public final /* synthetic */ boolean field6052;
    public final /* synthetic */ Class6874 field6053;
    
    public Class1122(final Class6874 field6053, final int field6054, final int field6055, final float[] field6056, final boolean field6057) {
        this.field6053 = field6053;
        this.field6049 = field6054;
        this.field6050 = field6055;
        this.field6051 = field6056;
        this.field6052 = field6057;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6874.method21035(this.field6053)];
        for (int i = this.field6049; i < this.field6050; ++i) {
            for (int j = 0; j < Class6874.method21035(this.field6053); ++j) {
                array[j] = this.field6051[j * Class6874.method21033(this.field6053) + i];
            }
            Class6874.method21036(this.field6053).method30449(array, this.field6052);
            for (int k = 0; k < Class6874.method21035(this.field6053); ++k) {
                this.field6051[k * Class6874.method21033(this.field6053) + i] = array[k];
            }
        }
    }
}
