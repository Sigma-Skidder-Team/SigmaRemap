// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1318 implements Runnable
{
    private static String[] field7233;
    public final /* synthetic */ long field7234;
    public final /* synthetic */ long field7235;
    public final /* synthetic */ Class17 field7236;
    public final /* synthetic */ boolean field7237;
    public final /* synthetic */ Class6733 field7238;
    
    public Class1318(final Class6733 field7238, final long field7239, final long field7240, final Class17 field7241, final boolean field7242) {
        this.field7238 = field7238;
        this.field7234 = field7239;
        this.field7235 = field7240;
        this.field7236 = field7241;
        this.field7237 = field7242;
    }
    
    @Override
    public void run() {
        for (long field7234 = this.field7234; field7234 < this.field7235; ++field7234) {
            final long n = field7234 * Class6733.method20481(this.field7238);
            for (long n2 = 0L; n2 < Class6733.method20482(this.field7238); ++n2) {
                Class6733.method20476(this.field7238).method26079(this.field7236, n + n2 * Class6733.method20483(this.field7238), this.field7237);
            }
        }
    }
}
