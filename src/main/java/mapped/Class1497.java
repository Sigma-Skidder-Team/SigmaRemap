// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1497 implements Runnable
{
    private static String[] field8321;
    public final /* synthetic */ int field8322;
    public final /* synthetic */ int field8323;
    public final /* synthetic */ double[] field8324;
    public final /* synthetic */ boolean field8325;
    public final /* synthetic */ Class9033 field8326;
    
    public Class1497(final Class9033 field8326, final int field8327, final int field8328, final double[] field8329, final boolean field8330) {
        this.field8326 = field8326;
        this.field8322 = field8327;
        this.field8323 = field8328;
        this.field8324 = field8329;
        this.field8325 = field8330;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class9033.method32453(this.field8326)];
        for (int i = this.field8322; i < this.field8323; ++i) {
            for (int j = 0; j < Class9033.method32453(this.field8326); ++j) {
                array[j] = this.field8324[j * Class9033.method32451(this.field8326) + i];
            }
            Class9033.method32454(this.field8326).method18036(array, this.field8325);
            for (int k = 0; k < Class9033.method32453(this.field8326); ++k) {
                this.field8324[k * Class9033.method32451(this.field8326) + i] = array[k];
            }
        }
    }
}
