// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1471 implements Runnable
{
    private static String[] field8165;
    public final /* synthetic */ int field8166;
    public final /* synthetic */ int field8167;
    public final /* synthetic */ double[] field8168;
    public final /* synthetic */ Class7992 field8169;
    
    public Class1471(final Class7992 field8169, final int field8170, final int field8171, final double[] field8172) {
        this.field8169 = field8169;
        this.field8166 = field8170;
        this.field8167 = field8171;
        this.field8168 = field8172;
    }
    
    @Override
    public void run() {
        for (int i = this.field8166; i < this.field8167; ++i) {
            final int n = 2 * i;
            final int n2 = n + 1;
            final double n3 = this.field8168[n] * Class7992.method26152(this.field8169)[n2] + this.field8168[n2] * Class7992.method26152(this.field8169)[n];
            this.field8168[n] = this.field8168[n] * Class7992.method26152(this.field8169)[n] - this.field8168[n2] * Class7992.method26152(this.field8169)[n2];
            this.field8168[n2] = n3;
        }
    }
}
