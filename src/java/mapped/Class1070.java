// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1070 implements Runnable
{
    private static String[] field5756;
    public final /* synthetic */ long field5757;
    public final /* synthetic */ long field5758;
    public final /* synthetic */ Class22 field5759;
    public final /* synthetic */ boolean field5760;
    public final /* synthetic */ Class6874 field5761;
    
    public Class1070(final Class6874 field5761, final long field5762, final long field5763, final Class22 field5764, final boolean field5765) {
        this.field5761 = field5761;
        this.field5757 = field5762;
        this.field5758 = field5763;
        this.field5759 = field5764;
        this.field5760 = field5765;
    }
    
    @Override
    public void run() {
        for (long field5757 = this.field5757; field5757 < this.field5758; ++field5757) {
            Class6874.method21034(this.field5761).method30452(this.field5759, field5757 * Class6874.method21037(this.field5761), this.field5760);
        }
    }
}
