// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1406 implements Runnable
{
    private static String[] field7765;
    public final /* synthetic */ int field7766;
    public final /* synthetic */ int field7767;
    public final /* synthetic */ int field7768;
    public final /* synthetic */ int field7769;
    public final /* synthetic */ double[] field7770;
    public final /* synthetic */ double[] field7771;
    public final /* synthetic */ Class7992 field7772;
    
    public Class1406(final Class7992 field7772, final int field7773, final int field7774, final int field7775, final int field7776, final double[] field7777, final double[] field7778) {
        this.field7772 = field7772;
        this.field7766 = field7773;
        this.field7767 = field7774;
        this.field7768 = field7775;
        this.field7769 = field7776;
        this.field7770 = field7777;
        this.field7771 = field7778;
    }
    
    @Override
    public void run() {
        if (this.field7766 <= 0) {
            for (int i = this.field7767; i < this.field7768; ++i) {
                final int n = 2 * i;
                final int n2 = n + 1;
                final int n3 = this.field7769 + i;
                this.field7770[n] = this.field7771[n3] * Class7992.method26151(this.field7772)[n];
                this.field7770[n2] = -this.field7771[n3] * Class7992.method26151(this.field7772)[n2];
            }
        }
        else {
            for (int j = this.field7767; j < this.field7768; ++j) {
                final int n4 = 2 * j;
                final int n5 = n4 + 1;
                final int n6 = this.field7769 + j;
                this.field7770[n4] = this.field7771[n6] * Class7992.method26151(this.field7772)[n4];
                this.field7770[n5] = this.field7771[n6] * Class7992.method26151(this.field7772)[n5];
            }
        }
    }
}
