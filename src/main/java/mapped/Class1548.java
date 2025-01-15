// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1548 implements Runnable
{
    private static String[] field8644;
    public final /* synthetic */ int field8645;
    public final /* synthetic */ int field8646;
    public final /* synthetic */ int field8647;
    public final /* synthetic */ int field8648;
    public final /* synthetic */ int field8649;
    public final /* synthetic */ int field8650;
    public final /* synthetic */ float[] field8651;
    public final /* synthetic */ Class6362 field8652;
    
    public Class1548(final Class6362 field8652, final int field8653, final int field8654, final int field8655, final int field8656, final int field8657, final int field8658, final float[] field8659) {
        this.field8652 = field8652;
        this.field8645 = field8653;
        this.field8646 = field8654;
        this.field8647 = field8655;
        this.field8648 = field8656;
        this.field8649 = field8657;
        this.field8650 = field8658;
        this.field8651 = field8659;
    }
    
    @Override
    public void run() {
        for (int i = this.field8645; i < this.field8646; ++i) {
            final int n = (Class6362.method19003(this.field8652) - i) % Class6362.method19003(this.field8652) * this.field8647;
            final int n2 = i * this.field8647;
            for (int j = 1; j < this.field8648; ++j) {
                final int n3 = (Class6362.method18998(this.field8652) - j) * this.field8649;
                final int n4 = j * this.field8649;
                final int n5 = n + n3;
                for (int k = 0; k < Class6362.method19001(this.field8652); ++k) {
                    final int n6 = 2 * k;
                    final int n7 = this.field8650 - n6;
                    final int n8 = n2 + n4 + n6;
                    this.field8651[n5 + n7 % this.field8650] = this.field8651[n8];
                    this.field8651[n5 + (n7 + 1) % this.field8650] = -this.field8651[n8 + 1];
                }
            }
        }
    }
}
