// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1513 implements Runnable
{
    private static String[] field8427;
    public final /* synthetic */ int field8428;
    public final /* synthetic */ int field8429;
    public final /* synthetic */ int field8430;
    public final /* synthetic */ int field8431;
    public final /* synthetic */ int field8432;
    public final /* synthetic */ int field8433;
    public final /* synthetic */ double[] field8434;
    public final /* synthetic */ Class6733 field8435;
    
    public Class1513(final Class6733 field8435, final int field8436, final int field8437, final int field8438, final int field8439, final int field8440, final int field8441, final double[] field8442) {
        this.field8435 = field8435;
        this.field8428 = field8436;
        this.field8429 = field8437;
        this.field8430 = field8438;
        this.field8431 = field8439;
        this.field8432 = field8440;
        this.field8433 = field8441;
        this.field8434 = field8442;
    }
    
    @Override
    public void run() {
        for (int i = this.field8428; i < this.field8429; ++i) {
            final int n = (Class6733.method20479(this.field8435) - i) % Class6733.method20479(this.field8435) * this.field8430;
            final int n2 = i * this.field8430;
            for (int j = 1; j < this.field8431; ++j) {
                final int n3 = (Class6733.method20474(this.field8435) - j) * this.field8432;
                final int n4 = j * this.field8432;
                final int n5 = n + n3;
                for (int k = 0; k < Class6733.method20477(this.field8435); ++k) {
                    final int n6 = 2 * k;
                    final int n7 = this.field8433 - n6;
                    final int n8 = n2 + n4 + n6;
                    this.field8434[n5 + n7 % this.field8433] = this.field8434[n8];
                    this.field8434[n5 + (n7 + 1) % this.field8433] = -this.field8434[n8 + 1];
                }
            }
        }
    }
}
