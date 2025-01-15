// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1445 implements Runnable
{
    private static String[] field8001;
    public final /* synthetic */ int field8002;
    public final /* synthetic */ int field8003;
    public final /* synthetic */ int field8004;
    public final /* synthetic */ int field8005;
    public final /* synthetic */ double[] field8006;
    public final /* synthetic */ double[] field8007;
    public final /* synthetic */ Class7992 field8008;
    
    public Class1445(final Class7992 field8008, final int field8009, final int field8010, final int field8011, final int field8012, final double[] field8013, final double[] field8014) {
        this.field8008 = field8008;
        this.field8002 = field8009;
        this.field8003 = field8010;
        this.field8004 = field8011;
        this.field8005 = field8012;
        this.field8006 = field8013;
        this.field8007 = field8014;
    }
    
    @Override
    public void run() {
        if (this.field8002 <= 0) {
            for (int i = this.field8003; i < this.field8004; ++i) {
                final int n = 2 * i;
                final int n2 = n + 1;
                final int n3 = this.field8005 + n;
                final int n4 = this.field8005 + n2;
                this.field8006[n3] = Class7992.method26151(this.field8008)[n] * this.field8007[n] + Class7992.method26151(this.field8008)[n2] * this.field8007[n2];
                this.field8006[n4] = -Class7992.method26151(this.field8008)[n2] * this.field8007[n] + Class7992.method26151(this.field8008)[n] * this.field8007[n2];
            }
        }
        else {
            for (int j = this.field8003; j < this.field8004; ++j) {
                final int n5 = 2 * j;
                final int n6 = n5 + 1;
                final int n7 = this.field8005 + n5;
                final int n8 = this.field8005 + n6;
                this.field8006[n7] = Class7992.method26151(this.field8008)[n5] * this.field8007[n5] - Class7992.method26151(this.field8008)[n6] * this.field8007[n6];
                this.field8006[n8] = Class7992.method26151(this.field8008)[n6] * this.field8007[n5] + Class7992.method26151(this.field8008)[n5] * this.field8007[n6];
            }
        }
    }
}
