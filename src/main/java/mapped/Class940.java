// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class940 implements Runnable
{
    private static String[] field4955;
    public final /* synthetic */ int field4956;
    public final /* synthetic */ int field4957;
    public final /* synthetic */ int field4958;
    public final /* synthetic */ int field4959;
    public final /* synthetic */ double[] field4960;
    public final /* synthetic */ Class8983 field4961;
    
    public Class940(final Class8983 field4961, final int field4962, final int field4963, final int field4964, final int field4965, final double[] field4966) {
        this.field4961 = field4961;
        this.field4956 = field4962;
        this.field4957 = field4963;
        this.field4958 = field4964;
        this.field4959 = field4965;
        this.field4960 = field4966;
    }
    
    @Override
    public void run() {
        for (int i = this.field4956; i < this.field4957; ++i) {
            final int n = i * this.field4958;
            final int n2 = (Class8983.method31976(this.field4961) - i + 1) * this.field4958;
            for (int j = this.field4959; j < Class8983.method31979(this.field4961); ++j) {
                final int n3 = 2 * j;
                final int n4 = 2 * (Class8983.method31979(this.field4961) - j);
                this.field4960[n3] = this.field4960[n4];
                this.field4960[n3 + 1] = -this.field4960[n4 + 1];
                final int n5 = n + n3;
                final int n6 = n2 - n3;
                this.field4960[n5] = this.field4960[n6];
                this.field4960[n5 + 1] = -this.field4960[n6 + 1];
            }
        }
    }
}
