// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1650 implements Runnable
{
    private static String[] field9236;
    public final /* synthetic */ int field9237;
    public final /* synthetic */ int field9238;
    public final /* synthetic */ float[][] field9239;
    public final /* synthetic */ Class6874 field9240;
    
    public Class1650(final Class6874 field9240, final int field9241, final int field9242, final float[][] field9243) {
        this.field9240 = field9240;
        this.field9237 = field9241;
        this.field9238 = field9242;
        this.field9239 = field9243;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class6874.method21035(this.field9240)];
        for (int i = this.field9237; i < this.field9238; ++i) {
            for (int j = 0; j < Class6874.method21035(this.field9240); ++j) {
                array[j] = this.field9239[j][i];
            }
            Class6874.method21036(this.field9240).method30445(array);
            for (int k = 0; k < Class6874.method21035(this.field9240); ++k) {
                this.field9239[k][i] = array[k];
            }
        }
    }
}
