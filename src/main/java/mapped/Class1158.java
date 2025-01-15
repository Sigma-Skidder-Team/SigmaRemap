// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1158 implements Runnable
{
    private static String[] field6277;
    public final /* synthetic */ int field6278;
    public final /* synthetic */ int field6279;
    public final /* synthetic */ int field6280;
    public final /* synthetic */ int field6281;
    public final /* synthetic */ int field6282;
    public final /* synthetic */ double[] field6283;
    public final /* synthetic */ Class6733 field6284;
    
    public Class1158(final Class6733 field6284, final int field6285, final int field6286, final int field6287, final int field6288, final int field6289, final double[] field6290) {
        this.field6284 = field6284;
        this.field6278 = field6285;
        this.field6279 = field6286;
        this.field6280 = field6287;
        this.field6281 = field6288;
        this.field6282 = field6289;
        this.field6283 = field6290;
    }
    
    @Override
    public void run() {
        for (int i = this.field6278; i < this.field6279; ++i) {
            final int n = (Class6733.method20479(this.field6284) - i) % Class6733.method20479(this.field6284) * this.field6280;
            final int n2 = i * this.field6280;
            for (int j = 1; j < this.field6281; ++j) {
                final int n3 = n2 + (Class6733.method20474(this.field6284) - j) * this.field6282;
                final int n4 = n + j * this.field6282 + Class6733.method20477(this.field6284);
                final int n5 = n3 + Class6733.method20477(this.field6284);
                final int n6 = n3 + 1;
                this.field6283[n4] = this.field6283[n6];
                this.field6283[n5] = this.field6283[n6];
                this.field6283[n4 + 1] = -this.field6283[n3];
                this.field6283[n5 + 1] = this.field6283[n3];
            }
        }
    }
}
