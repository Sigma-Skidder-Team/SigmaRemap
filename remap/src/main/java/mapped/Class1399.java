// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1399 implements Runnable
{
    private static String[] field7718;
    public final /* synthetic */ int field7719;
    public final /* synthetic */ int field7720;
    public final /* synthetic */ int field7721;
    public final /* synthetic */ int field7722;
    public final /* synthetic */ float[] field7723;
    public final /* synthetic */ boolean field7724;
    public final /* synthetic */ int field7725;
    public final /* synthetic */ Class6362 field7726;
    
    public Class1399(final Class6362 field7726, final int field7727, final int field7728, final int field7729, final int field7730, final float[] field7731, final boolean field7732, final int field7733) {
        this.field7726 = field7726;
        this.field7719 = field7727;
        this.field7720 = field7728;
        this.field7721 = field7729;
        this.field7722 = field7730;
        this.field7723 = field7731;
        this.field7724 = field7732;
        this.field7725 = field7733;
    }
    
    @Override
    public void run() {
        final float[] array = new float[this.field7719];
        for (int i = this.field7720; i >= this.field7721; --i) {
            final int n = i * Class6362.method18997(this.field7726);
            final int n2 = i * this.field7722;
            for (int j = Class6362.method18998(this.field7726) - 1; j >= 0; --j) {
                System.arraycopy(this.field7723, n + j * Class6362.method18999(this.field7726), array, 0, Class6362.method19001(this.field7726));
                Class6362.method19000(this.field7726).method25945(array, this.field7724);
                System.arraycopy(array, 0, this.field7723, n2 + j * this.field7725, this.field7719);
            }
        }
    }
}
