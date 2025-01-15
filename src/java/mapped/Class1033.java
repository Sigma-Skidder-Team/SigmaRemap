// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1033 implements Runnable
{
    private static String[] field5534;
    public final /* synthetic */ int field5535;
    public final /* synthetic */ int field5536;
    public final /* synthetic */ int field5537;
    public final /* synthetic */ float[] field5538;
    public final /* synthetic */ Class8328 field5539;
    
    public Class1033(final Class8328 field5539, final int field5540, final int field5541, final int field5542, final float[] field5543) {
        this.field5539 = field5539;
        this.field5535 = field5540;
        this.field5536 = field5541;
        this.field5537 = field5542;
        this.field5538 = field5543;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class8328.method27760(this.field5539)];
        for (int i = this.field5535; i < this.field5536; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8328.method27760(this.field5539); ++j) {
                final int n2 = 2 * j;
                final int n3 = j * this.field5537 + n;
                array[n2] = this.field5538[n3];
                array[n2 + 1] = this.field5538[n3 + 1];
            }
            Class8328.method27761(this.field5539).method25925(array);
            for (int k = 0; k < Class8328.method27760(this.field5539); ++k) {
                final int n4 = 2 * k;
                final int n5 = k * this.field5537 + n;
                this.field5538[n5] = array[n4];
                this.field5538[n5 + 1] = array[n4 + 1];
            }
        }
    }
}
