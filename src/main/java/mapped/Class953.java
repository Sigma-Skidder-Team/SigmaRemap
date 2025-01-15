// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class953 implements Runnable
{
    private static String[] field5043;
    public final /* synthetic */ int field5044;
    public final /* synthetic */ int field5045;
    public final /* synthetic */ int field5046;
    public final /* synthetic */ double[] field5047;
    public final /* synthetic */ double[] field5048;
    public final /* synthetic */ int field5049;
    
    public Class953(final int field5044, final int field5045, final int field5046, final double[] field5047, final double[] field5048, final int field5049) {
        this.field5044 = field5044;
        this.field5045 = field5045;
        this.field5046 = field5046;
        this.field5047 = field5047;
        this.field5048 = field5048;
        this.field5049 = field5049;
    }
    
    @Override
    public void run() {
        final int n = this.field5044 + this.field5045;
        int n2 = 1;
        int i = this.field5046;
        while (i > 512) {
            i >>= 2;
            n2 <<= 2;
            Class9133.method33217(i, this.field5047, n - i, this.field5048, this.field5049 - i);
        }
        Class9133.method33213(i, 0, this.field5047, n - i, this.field5049, this.field5048);
        int n3 = n2 >> 1;
        final int n4 = this.field5044 - i;
        for (int j = this.field5045 - i; j > 0; j -= i) {
            ++n3;
            Class9133.method33213(i, Class9133.method33211(i, j, n3, this.field5047, this.field5044, this.field5049, this.field5048), this.field5047, n4 + j, this.field5049, this.field5048);
        }
    }
}
