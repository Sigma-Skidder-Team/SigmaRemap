// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1199 implements Runnable
{
    private static String[] field6497;
    public final /* synthetic */ long field6498;
    public final /* synthetic */ long field6499;
    public final /* synthetic */ Class17 field6500;
    public final /* synthetic */ boolean field6501;
    public final /* synthetic */ Class4406 field6502;
    
    public Class1199(final Class4406 field6502, final long field6503, final long field6504, final Class17 field6505, final boolean field6506) {
        this.field6502 = field6502;
        this.field6498 = field6503;
        this.field6499 = field6504;
        this.field6500 = field6505;
        this.field6501 = field6506;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class4406.method13337(this.field6502), false);
        for (long field6498 = this.field6498; field6498 < this.field6499; ++field6498) {
            for (long n = 0L; n < Class4406.method13337(this.field6502); ++n) {
                class17.method171(n, this.field6500.method137(n * Class4406.method13336(this.field6502) + field6498));
            }
            Class4406.method13335(this.field6502).method30726(class17, this.field6501);
            for (long n2 = 0L; n2 < Class4406.method13337(this.field6502); ++n2) {
                this.field6500.method171(n2 * Class4406.method13336(this.field6502) + field6498, class17.method137(n2));
            }
        }
    }
}
