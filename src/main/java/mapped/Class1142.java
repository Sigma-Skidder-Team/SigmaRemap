// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1142 implements Runnable
{
    private static String[] field6174;
    public final /* synthetic */ long field6175;
    public final /* synthetic */ long field6176;
    public final /* synthetic */ Class17 field6177;
    public final /* synthetic */ Class6733 field6178;
    
    public Class1142(final Class6733 field6178, final long field6179, final long field6180, final Class17 field6181) {
        this.field6178 = field6178;
        this.field6175 = field6179;
        this.field6176 = field6180;
        this.field6177 = field6181;
    }
    
    @Override
    public void run() {
        for (long field6175 = this.field6175; field6175 < this.field6176; ++field6175) {
            final long n = field6175 * Class6733.method20481(this.field6178);
            for (long n2 = 0L; n2 < Class6733.method20482(this.field6178); ++n2) {
                Class6733.method20476(this.field6178).method26075(this.field6177, n + n2 * Class6733.method20483(this.field6178));
            }
        }
    }
}
