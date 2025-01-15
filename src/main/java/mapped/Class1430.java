// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1430 implements Runnable
{
    private static String[] field7908;
    public final /* synthetic */ int field7909;
    public final /* synthetic */ int field7910;
    public final /* synthetic */ int field7911;
    public final /* synthetic */ float[] field7912;
    public final /* synthetic */ Class9267 field7913;
    
    public Class1430(final Class9267 field7913, final int field7914, final int field7915, final int field7916, final float[] field7917) {
        this.field7913 = field7913;
        this.field7909 = field7914;
        this.field7910 = field7915;
        this.field7911 = field7916;
        this.field7912 = field7917;
    }
    
    @Override
    public void run() {
        final int n = this.field7909 + Class9267.method34189(this.field7913) - 1;
        for (int i = this.field7910; i < this.field7911; ++i) {
            final int n2 = this.field7909 + i;
            final float n3 = this.field7912[n2];
            final int n4 = n - i;
            this.field7912[n2] = this.field7912[n4];
            this.field7912[n4] = n3;
        }
    }
}
