// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1030 implements Runnable
{
    private static String[] field5523;
    public final /* synthetic */ int field5524;
    public final /* synthetic */ int field5525;
    public final /* synthetic */ float[][] field5526;
    public final /* synthetic */ boolean field5527;
    public final /* synthetic */ Class7706 field5528;
    
    public Class1030(final Class7706 field5528, final int field5529, final int field5530, final float[][] field5531, final boolean field5532) {
        this.field5528 = field5528;
        this.field5524 = field5529;
        this.field5525 = field5530;
        this.field5526 = field5531;
        this.field5527 = field5532;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class7706.method24578(this.field5528)];
        for (int i = this.field5524; i < this.field5525; ++i) {
            for (int j = 0; j < Class7706.method24578(this.field5528); ++j) {
                array[j] = this.field5526[j][i];
            }
            Class7706.method24579(this.field5528).method29693(array, this.field5527);
            for (int k = 0; k < Class7706.method24578(this.field5528); ++k) {
                this.field5526[k][i] = array[k];
            }
        }
    }
}
