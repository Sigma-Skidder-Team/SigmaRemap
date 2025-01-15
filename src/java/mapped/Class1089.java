// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1089 implements Runnable
{
    private static String[] field5872;
    public final /* synthetic */ int field5873;
    public final /* synthetic */ int field5874;
    public final /* synthetic */ int field5875;
    public final /* synthetic */ int field5876;
    public final /* synthetic */ double[] field5877;
    public final /* synthetic */ double[] field5878;
    public final /* synthetic */ Class7992 field5879;
    
    public Class1089(final Class7992 field5879, final int field5880, final int field5881, final int field5882, final int field5883, final double[] field5884, final double[] field5885) {
        this.field5879 = field5879;
        this.field5873 = field5880;
        this.field5874 = field5881;
        this.field5875 = field5882;
        this.field5876 = field5883;
        this.field5877 = field5884;
        this.field5878 = field5885;
    }
    
    @Override
    public void run() {
        if (this.field5873 <= 0) {
            for (int i = this.field5874; i < this.field5875; ++i) {
                final int n = 2 * i;
                final int n2 = n + 1;
                final int n3 = this.field5876 + n;
                final int n4 = this.field5876 + n2;
                this.field5877[n] = this.field5878[n3] * Class7992.method26151(this.field5879)[n] + this.field5878[n4] * Class7992.method26151(this.field5879)[n2];
                this.field5877[n2] = -this.field5878[n3] * Class7992.method26151(this.field5879)[n2] + this.field5878[n4] * Class7992.method26151(this.field5879)[n];
            }
        }
        else {
            for (int j = this.field5874; j < this.field5875; ++j) {
                final int n5 = 2 * j;
                final int n6 = n5 + 1;
                final int n7 = this.field5876 + n5;
                final int n8 = this.field5876 + n6;
                this.field5877[n5] = this.field5878[n7] * Class7992.method26151(this.field5879)[n5] - this.field5878[n8] * Class7992.method26151(this.field5879)[n6];
                this.field5877[n6] = this.field5878[n7] * Class7992.method26151(this.field5879)[n6] + this.field5878[n8] * Class7992.method26151(this.field5879)[n5];
            }
        }
    }
}
