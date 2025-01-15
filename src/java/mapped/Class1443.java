// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1443 implements Runnable
{
    private static String[] field7988;
    public final /* synthetic */ long field7989;
    public final /* synthetic */ long field7990;
    public final /* synthetic */ Class17 field7991;
    public final /* synthetic */ boolean field7992;
    public final /* synthetic */ Class8788 field7993;
    
    public Class1443(final Class8788 field7993, final long field7994, final long field7995, final Class17 field7996, final boolean field7997) {
        this.field7993 = field7993;
        this.field7989 = field7994;
        this.field7990 = field7995;
        this.field7991 = field7996;
        this.field7992 = field7997;
    }
    
    @Override
    public void run() {
        for (long field7989 = this.field7989; field7989 < this.field7990; ++field7989) {
            Class8788.method30611(this.field7993).method21393(this.field7991, field7989 * Class8788.method30614(this.field7993), this.field7992);
        }
    }
}
