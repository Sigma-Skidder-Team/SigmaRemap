// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1326 implements Runnable
{
    private static String[] field7278;
    public final /* synthetic */ int field7279;
    public final /* synthetic */ int field7280;
    public final /* synthetic */ int field7281;
    public final /* synthetic */ int field7282;
    public final /* synthetic */ int field7283;
    public final /* synthetic */ float[] field7284;
    public final /* synthetic */ Class6362 field7285;
    
    public Class1326(final Class6362 field7285, final int field7286, final int field7287, final int field7288, final int field7289, final int field7290, final float[] field7291) {
        this.field7285 = field7285;
        this.field7279 = field7286;
        this.field7280 = field7287;
        this.field7281 = field7288;
        this.field7282 = field7289;
        this.field7283 = field7290;
        this.field7284 = field7291;
    }
    
    @Override
    public void run() {
        for (int i = this.field7279; i < this.field7280; ++i) {
            final int n = (Class6362.method19003(this.field7285) - i) % Class6362.method19003(this.field7285) * this.field7281;
            final int n2 = i * this.field7281;
            for (int j = 1; j < this.field7282; ++j) {
                final int n3 = n + (Class6362.method18998(this.field7285) - j) * this.field7283;
                final int n4 = n2 + j * this.field7283;
                this.field7284[n3] = this.field7284[n4];
                this.field7284[n3 + 1] = -this.field7284[n4 + 1];
            }
        }
    }
}
