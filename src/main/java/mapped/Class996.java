// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class996 implements Runnable
{
    private static String[] field5314;
    public final /* synthetic */ long field5315;
    public final /* synthetic */ long field5316;
    public final /* synthetic */ Class17 field5317;
    public final /* synthetic */ boolean field5318;
    public final /* synthetic */ Class9033 field5319;
    
    public Class996(final Class9033 field5319, final long field5320, final long field5321, final Class17 field5322, final boolean field5323) {
        this.field5319 = field5319;
        this.field5315 = field5320;
        this.field5316 = field5321;
        this.field5317 = field5322;
        this.field5318 = field5323;
    }
    
    @Override
    public void run() {
        final Class17 class17 = new Class17(Class9033.method32456(this.field5319), false);
        for (long field5315 = this.field5315; field5315 < this.field5316; ++field5315) {
            for (long n = 0L; n < Class9033.method32456(this.field5319); ++n) {
                class17.method171(n, this.field5317.method137(n * Class9033.method32455(this.field5319) + field5315));
            }
            Class9033.method32454(this.field5319).method18041(class17, this.field5318);
            for (long n2 = 0L; n2 < Class9033.method32456(this.field5319); ++n2) {
                this.field5317.method171(n2 * Class9033.method32455(this.field5319) + field5315, class17.method137(n2));
            }
        }
    }
}
