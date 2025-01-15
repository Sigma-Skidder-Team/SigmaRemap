// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1571 implements Runnable
{
    private static String[] field8797;
    public final /* synthetic */ int field8798;
    public final /* synthetic */ int field8799;
    public final /* synthetic */ float[] field8800;
    public final /* synthetic */ boolean field8801;
    public final /* synthetic */ Class7706 field8802;
    
    public Class1571(final Class7706 field8802, final int field8803, final int field8804, final float[] field8805, final boolean field8806) {
        this.field8802 = field8802;
        this.field8798 = field8803;
        this.field8799 = field8804;
        this.field8800 = field8805;
        this.field8801 = field8806;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class7706.method24578(this.field8802)];
        for (int i = this.field8798; i < this.field8799; ++i) {
            for (int j = 0; j < Class7706.method24578(this.field8802); ++j) {
                array[j] = this.field8800[j * Class7706.method24576(this.field8802) + i];
            }
            Class7706.method24579(this.field8802).method29689(array, this.field8801);
            for (int k = 0; k < Class7706.method24578(this.field8802); ++k) {
                this.field8800[k * Class7706.method24576(this.field8802) + i] = array[k];
            }
        }
    }
}
