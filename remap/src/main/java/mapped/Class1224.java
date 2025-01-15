// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1224 implements Runnable
{
    private static String[] field6652;
    public final /* synthetic */ int field6653;
    public final /* synthetic */ int field6654;
    public final /* synthetic */ double[][] field6655;
    public final /* synthetic */ boolean field6656;
    public final /* synthetic */ Class9033 field6657;
    
    public Class1224(final Class9033 field6657, final int field6658, final int field6659, final double[][] field6660, final boolean field6661) {
        this.field6657 = field6657;
        this.field6653 = field6658;
        this.field6654 = field6659;
        this.field6655 = field6660;
        this.field6656 = field6661;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class9033.method32453(this.field6657)];
        for (int i = this.field6653; i < this.field6654; ++i) {
            for (int j = 0; j < Class9033.method32453(this.field6657); ++j) {
                array[j] = this.field6655[j][i];
            }
            Class9033.method32454(this.field6657).method18040(array, this.field6656);
            for (int k = 0; k < Class9033.method32453(this.field6657); ++k) {
                this.field6655[k][i] = array[k];
            }
        }
    }
}
