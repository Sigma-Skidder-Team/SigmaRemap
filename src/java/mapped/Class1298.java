// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1298 implements Runnable
{
    private static String[] field7099;
    public final /* synthetic */ long field7100;
    public final /* synthetic */ long field7101;
    public final /* synthetic */ Class17 field7102;
    public final /* synthetic */ boolean field7103;
    public final /* synthetic */ Class5815 field7104;
    
    public Class1298(final Class5815 field7104, final long field7105, final long field7106, final Class17 field7107, final boolean field7108) {
        this.field7104 = field7104;
        this.field7100 = field7105;
        this.field7101 = field7106;
        this.field7102 = field7107;
        this.field7103 = field7108;
    }
    
    @Override
    public void run() {
        for (long field7100 = this.field7100; field7100 < this.field7101; ++field7100) {
            final long n = field7100 * Class5815.method17508(this.field7104);
            for (long n2 = 0L; n2 < Class5815.method17505(this.field7104); ++n2) {
                Class5815.method17500(this.field7104).method21393(this.field7102, n + n2 * Class5815.method17509(this.field7104), this.field7103);
            }
        }
    }
}
