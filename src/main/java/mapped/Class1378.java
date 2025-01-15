// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1378 implements Runnable
{
    private static String[] field7577;
    public final /* synthetic */ int field7578;
    public final /* synthetic */ int field7579;
    public final /* synthetic */ int field7580;
    public final /* synthetic */ int field7581;
    public final /* synthetic */ int field7582;
    public final /* synthetic */ int field7583;
    public final /* synthetic */ double[] field7584;
    public final /* synthetic */ Class6733 field7585;
    
    public Class1378(final Class6733 field7585, final int field7586, final int field7587, final int field7588, final int field7589, final int field7590, final int field7591, final double[] field7592) {
        this.field7585 = field7585;
        this.field7578 = field7586;
        this.field7579 = field7587;
        this.field7580 = field7588;
        this.field7581 = field7589;
        this.field7582 = field7590;
        this.field7583 = field7591;
        this.field7584 = field7592;
    }
    
    @Override
    public void run() {
        for (int i = this.field7578; i < this.field7579; ++i) {
            final int n = (Class6733.method20479(this.field7585) - i) % Class6733.method20479(this.field7585) * this.field7580;
            final int n2 = i * this.field7580;
            for (int j = 1; j < this.field7581; ++j) {
                final int n3 = (Class6733.method20474(this.field7585) - j) * this.field7582;
                final int n4 = j * this.field7582;
                final int n5 = n + n3;
                for (int k = 0; k < Class6733.method20477(this.field7585); ++k) {
                    final int n6 = 2 * k;
                    final int n7 = this.field7583 - n6;
                    final int n8 = n2 + n4 + n6;
                    this.field7584[n5 + n7 % this.field7583] = this.field7584[n8];
                    this.field7584[n5 + (n7 + 1) % this.field7583] = -this.field7584[n8 + 1];
                }
            }
        }
    }
}
