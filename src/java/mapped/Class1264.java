// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1264 implements Runnable
{
    private static String[] field6892;
    public final /* synthetic */ long field6893;
    public final /* synthetic */ long field6894;
    public final /* synthetic */ Class17 field6895;
    public final /* synthetic */ boolean field6896;
    public final /* synthetic */ Class9033 field6897;
    
    public Class1264(final Class9033 field6897, final long field6898, final long field6899, final Class17 field6900, final boolean field6901) {
        this.field6897 = field6897;
        this.field6893 = field6898;
        this.field6894 = field6899;
        this.field6895 = field6900;
        this.field6896 = field6901;
    }
    
    @Override
    public void run() {
        for (long field6893 = this.field6893; field6893 < this.field6894; ++field6893) {
            Class9033.method32452(this.field6897).method18039(this.field6895, field6893 * Class9033.method32455(this.field6897), this.field6896);
        }
    }
}
