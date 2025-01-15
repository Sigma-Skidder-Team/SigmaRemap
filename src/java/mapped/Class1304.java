// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1304 implements Runnable
{
    private static String[] field7139;
    public final /* synthetic */ long field7140;
    public final /* synthetic */ long field7141;
    public final /* synthetic */ Class17 field7142;
    public final /* synthetic */ Class17 field7143;
    public final /* synthetic */ long field7144;
    public final /* synthetic */ boolean field7145;
    public final /* synthetic */ Class6733 field7146;
    
    public Class1304(final Class6733 field7146, final long field7147, final long field7148, final Class17 field7149, final Class17 field7150, final long field7151, final boolean field7152) {
        this.field7146 = field7146;
        this.field7140 = field7147;
        this.field7141 = field7148;
        this.field7142 = field7149;
        this.field7143 = field7150;
        this.field7144 = field7151;
        this.field7145 = field7152;
    }
    
    @Override
    public void run() {
        for (long field7140 = this.field7140; field7140 < this.field7141; ++field7140) {
            final long n = field7140 * Class6733.method20481(this.field7146);
            for (long n2 = 0L; n2 < Class6733.method20482(this.field7146); ++n2) {
                Class8601.method29154(this.field7142, n + n2 * Class6733.method20483(this.field7146), this.field7143, field7140 * Class6733.method20482(this.field7146) * this.field7144 + n2 * this.field7144, Class6733.method20484(this.field7146));
                Class6733.method20476(this.field7146).method26095(this.field7143, field7140 * Class6733.method20482(this.field7146) * this.field7144 + n2 * this.field7144, this.field7145);
            }
        }
    }
}
