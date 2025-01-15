// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1485 implements Runnable
{
    private static String[] field8255;
    public final /* synthetic */ int field8256;
    public final /* synthetic */ int field8257;
    public final /* synthetic */ float[][][] field8258;
    public final /* synthetic */ Class5934 field8259;
    
    public Class1485(final Class5934 field8259, final int field8260, final int field8261, final float[][][] field8262) {
        this.field8259 = field8259;
        this.field8256 = field8260;
        this.field8257 = field8261;
        this.field8258 = field8262;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class5934.method17838(this.field8259)];
        for (int i = this.field8256; i < this.field8257; ++i) {
            for (int j = 0; j < Class5934.method17841(this.field8259); ++j) {
                for (int k = 0; k < Class5934.method17838(this.field8259); ++k) {
                    array[k] = this.field8258[i][k][j];
                }
                Class5934.method17842(this.field8259).method30445(array);
                for (int l = 0; l < Class5934.method17838(this.field8259); ++l) {
                    this.field8258[i][l][j] = array[l];
                }
            }
        }
    }
}
