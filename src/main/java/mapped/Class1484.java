// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1484 implements Runnable
{
    private static String[] field8248;
    public final /* synthetic */ int field8249;
    public final /* synthetic */ int field8250;
    public final /* synthetic */ int field8251;
    public final /* synthetic */ double[] field8252;
    public final /* synthetic */ boolean field8253;
    public final /* synthetic */ Class9033 field8254;
    
    public Class1484(final Class9033 field8254, final int field8255, final int field8256, final int field8257, final double[] field8258, final boolean field8259) {
        this.field8254 = field8254;
        this.field8249 = field8255;
        this.field8250 = field8256;
        this.field8251 = field8257;
        this.field8252 = field8258;
        this.field8253 = field8259;
    }
    
    @Override
    public void run() {
        if (this.field8249 != -1) {
            for (int i = this.field8250; i < Class9033.method32453(this.field8254); i += this.field8251) {
                Class9033.method32452(this.field8254).method18042(this.field8252, i * Class9033.method32451(this.field8254), this.field8253);
            }
        }
        else {
            for (int j = this.field8250; j < Class9033.method32453(this.field8254); j += this.field8251) {
                Class9033.method32452(this.field8254).method18038(this.field8252, j * Class9033.method32451(this.field8254), this.field8253);
            }
        }
    }
}
