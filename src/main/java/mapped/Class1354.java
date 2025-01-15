// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1354 implements Runnable
{
    private static String[] field7420;
    public final /* synthetic */ int field7421;
    public final /* synthetic */ int field7422;
    public final /* synthetic */ int field7423;
    public final /* synthetic */ float[] field7424;
    public final /* synthetic */ boolean field7425;
    public final /* synthetic */ Class8328 field7426;
    
    public Class1354(final Class8328 field7426, final int field7427, final int field7428, final int field7429, final float[] field7430, final boolean field7431) {
        this.field7426 = field7426;
        this.field7421 = field7427;
        this.field7422 = field7428;
        this.field7423 = field7429;
        this.field7424 = field7430;
        this.field7425 = field7431;
    }
    
    @Override
    public void run() {
        final float[] array = new float[2 * Class8328.method27760(this.field7426)];
        for (int i = this.field7421; i < this.field7422; ++i) {
            final int n = 2 * i;
            for (int j = 0; j < Class8328.method27760(this.field7426); ++j) {
                final int n2 = 2 * j;
                final int n3 = j * this.field7423 + n;
                array[n2] = this.field7424[n3];
                array[n2 + 1] = this.field7424[n3 + 1];
            }
            Class8328.method27761(this.field7426).method25929(array, this.field7425);
            for (int k = 0; k < Class8328.method27760(this.field7426); ++k) {
                final int n4 = 2 * k;
                final int n5 = k * this.field7423 + n;
                this.field7424[n5] = array[n4];
                this.field7424[n5 + 1] = array[n4 + 1];
            }
        }
    }
}
