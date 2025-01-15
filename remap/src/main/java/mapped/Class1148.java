// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1148 implements Runnable
{
    private static String[] field6207;
    public final /* synthetic */ int field6208;
    public final /* synthetic */ int field6209;
    public final /* synthetic */ float[][] field6210;
    public final /* synthetic */ boolean field6211;
    public final /* synthetic */ Class7706 field6212;
    
    public Class1148(final Class7706 field6212, final int field6213, final int field6214, final float[][] field6215, final boolean field6216) {
        this.field6212 = field6212;
        this.field6208 = field6213;
        this.field6209 = field6214;
        this.field6210 = field6215;
        this.field6211 = field6216;
    }
    
    @Override
    public void run() {
        final float[] array = new float[Class7706.method24578(this.field6212)];
        for (int i = this.field6208; i < this.field6209; ++i) {
            for (int j = 0; j < Class7706.method24578(this.field6212); ++j) {
                array[j] = this.field6210[j][i];
            }
            Class7706.method24579(this.field6212).method29689(array, this.field6211);
            for (int k = 0; k < Class7706.method24578(this.field6212); ++k) {
                this.field6210[k][i] = array[k];
            }
        }
    }
}
