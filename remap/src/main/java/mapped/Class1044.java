// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1044 implements Runnable
{
    private static String[] field5599;
    public final /* synthetic */ long field5600;
    public final /* synthetic */ long field5601;
    public final /* synthetic */ long field5602;
    public final /* synthetic */ Class22 field5603;
    public final /* synthetic */ Class22 field5604;
    public final /* synthetic */ Class8673 field5605;
    
    public Class1044(final Class8673 field5605, final long field5606, final long field5607, final long field5608, final Class22 field5609, final Class22 field5610) {
        this.field5605 = field5605;
        this.field5600 = field5606;
        this.field5601 = field5607;
        this.field5602 = field5608;
        this.field5603 = field5609;
        this.field5604 = field5610;
    }
    
    @Override
    public void run() {
        for (long field5600 = this.field5600; field5600 < this.field5601; ++field5600) {
            final long n = 2L * field5600;
            this.field5603.method169(this.field5602 + field5600, Class8673.method29704(this.field5605).method135(n) * this.field5604.method135(n) - Class8673.method29704(this.field5605).method135(n + 1L) * this.field5604.method135(n + 1L));
        }
    }
}
