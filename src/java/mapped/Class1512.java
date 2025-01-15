// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1512 implements Runnable
{
    private static String[] field8419;
    public final /* synthetic */ int field8420;
    public final /* synthetic */ int field8421;
    public final /* synthetic */ int field8422;
    public final /* synthetic */ int field8423;
    public final /* synthetic */ int field8424;
    public final /* synthetic */ float[] field8425;
    public final /* synthetic */ Class6362 field8426;
    
    public Class1512(final Class6362 field8426, final int field8427, final int field8428, final int field8429, final int field8430, final int field8431, final float[] field8432) {
        this.field8426 = field8426;
        this.field8420 = field8427;
        this.field8421 = field8428;
        this.field8422 = field8429;
        this.field8423 = field8430;
        this.field8424 = field8431;
        this.field8425 = field8432;
    }
    
    @Override
    public void run() {
        for (int i = this.field8420; i < this.field8421; ++i) {
            final int n = (Class6362.method19003(this.field8426) - i) % Class6362.method19003(this.field8426) * this.field8422;
            final int n2 = i * this.field8422;
            for (int j = 0; j < Class6362.method18998(this.field8426); ++j) {
                final int n3 = (Class6362.method18998(this.field8426) - j) % Class6362.method18998(this.field8426) * this.field8423;
                final int n4 = j * this.field8423;
                for (int k = 1; k < Class6362.method19001(this.field8426); k += 2) {
                    final int n5 = n + n3 + this.field8424 - k;
                    final int n6 = n2 + n4 + k;
                    this.field8425[n5] = -this.field8425[n6 + 2];
                    this.field8425[n5 - 1] = this.field8425[n6 + 1];
                }
            }
        }
    }
}
