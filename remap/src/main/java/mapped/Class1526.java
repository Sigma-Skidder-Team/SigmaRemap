// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1526 implements Runnable
{
    private static String[] field8513;
    public final /* synthetic */ long field8514;
    public final /* synthetic */ long field8515;
    public final /* synthetic */ Class17 field8516;
    public final /* synthetic */ boolean field8517;
    public final /* synthetic */ Class9033 field8518;
    
    public Class1526(final Class9033 field8518, final long field8519, final long field8520, final Class17 field8521, final boolean field8522) {
        this.field8518 = field8518;
        this.field8514 = field8519;
        this.field8515 = field8520;
        this.field8516 = field8521;
        this.field8517 = field8522;
    }
    
    @Override
    public void run() {
        for (long field8514 = this.field8514; field8514 < this.field8515; ++field8514) {
            Class9033.method32452(this.field8518).method18043(this.field8516, field8514 * Class9033.method32455(this.field8518), this.field8517);
        }
    }
}
