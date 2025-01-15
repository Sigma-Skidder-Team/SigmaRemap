// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1198 implements Runnable
{
    private static String[] field6491;
    public final /* synthetic */ long field6492;
    public final /* synthetic */ long field6493;
    public final /* synthetic */ Class17 field6494;
    public final /* synthetic */ boolean field6495;
    public final /* synthetic */ Class4406 field6496;
    
    public Class1198(final Class4406 field6496, final long field6497, final long field6498, final Class17 field6499, final boolean field6500) {
        this.field6496 = field6496;
        this.field6492 = field6497;
        this.field6493 = field6498;
        this.field6494 = field6499;
        this.field6495 = field6500;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class4406.method13337(this.field6496), false);
        for (long field6492 = this.field6492; field6492 < this.field6493; ++field6492) {
            for (long n = 0L; n < Class4406.method13337(this.field6496); ++n) {
                class17.method171(n, this.field6494.method137(n * Class4406.method13336(this.field6496) + field6492));
            }
            Class4406.method13335(this.field6496).method30722(class17, this.field6495);
            for (long n2 = 0L; n2 < Class4406.method13337(this.field6496); ++n2) {
                this.field6494.method171(n2 * Class4406.method13336(this.field6496) + field6492, class17.method137(n2));
            }
        }
    }
}
