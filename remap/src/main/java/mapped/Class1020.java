// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1020 implements Runnable
{
    private static String[] field5457;
    public final /* synthetic */ int field5458;
    public final /* synthetic */ int field5459;
    public final /* synthetic */ double[] field5460;
    public final /* synthetic */ boolean field5461;
    public final /* synthetic */ Class9033 field5462;
    
    public Class1020(final Class9033 field5462, final int field5463, final int field5464, final double[] field5465, final boolean field5466) {
        this.field5462 = field5462;
        this.field5458 = field5463;
        this.field5459 = field5464;
        this.field5460 = field5465;
        this.field5461 = field5466;
    }
    
    @Override
    public void run() {
        final double[] array = new double[Class9033.method32453(this.field5462)];
        for (int i = this.field5458; i < this.field5459; ++i) {
            for (int j = 0; j < Class9033.method32453(this.field5462); ++j) {
                array[j] = this.field5460[j * Class9033.method32451(this.field5462) + i];
            }
            Class9033.method32454(this.field5462).method18040(array, this.field5461);
            for (int k = 0; k < Class9033.method32453(this.field5462); ++k) {
                this.field5460[k * Class9033.method32451(this.field5462) + i] = array[k];
            }
        }
    }
}
