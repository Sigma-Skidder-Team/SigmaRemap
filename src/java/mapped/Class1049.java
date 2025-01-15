// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1049 implements Runnable
{
    private static String[] field5624;
    public final /* synthetic */ int field5625;
    public final /* synthetic */ int field5626;
    public final /* synthetic */ float[] field5627;
    public final /* synthetic */ boolean field5628;
    public final /* synthetic */ Class7706 field5629;
    
    public Class1049(final Class7706 field5629, final int field5630, final int field5631, final float[] field5632, final boolean field5633) {
        this.field5629 = field5629;
        this.field5625 = field5630;
        this.field5626 = field5631;
        this.field5627 = field5632;
        this.field5628 = field5633;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class7706.method24578(this.field5629)];
        for (int i = this.field5625; i < this.field5626; ++i) {
            for (int j = 0; j < Class7706.method24578(this.field5629); ++j) {
                array[j] = this.field5627[j * Class7706.method24576(this.field5629) + i];
            }
            Class7706.method24579(this.field5629).method29693(array, this.field5628);
            for (int k = 0; k < Class7706.method24578(this.field5629); ++k) {
                this.field5627[k * Class7706.method24576(this.field5629) + i] = array[k];
            }
        }
    }
}
