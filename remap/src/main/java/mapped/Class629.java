// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class629 extends Class624
{
    public final /* synthetic */ Class5079 field3613;
    
    public Class629(final Class5079 field3613) {
        this.field3613 = field3613;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.method3633(n, n3, n2, n6, n7);
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        Class5079.method15833(this.field3613, true);
        return true;
    }
    
    private void method3633(final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = n3 + 8;
        int n7 = 0;
        final String string = Class5046.method15438("mco.trial.message.line1") + "\\n" + Class5046.method15438("mco.trial.message.line2");
        int n8 = 0;
        if (n2 <= n4) {
            if (n4 <= Class5079.method15824(this.field3613).method15530()) {
                if (n3 <= n5) {
                    if (n5 <= n3 + 32) {
                        n8 = 1;
                    }
                }
            }
        }
        int n9 = 8388479;
        if (n8 != 0) {
            if (!this.field3613.method15745()) {
                n9 = 6077788;
            }
        }
        final String[] split = string.split("\\\\n");
        for (int length = split.length, i = 0; i < length; ++i) {
            this.field3613.method15405(split[i], this.field3613.method15421() / 2, n6 + n7, n9);
            n7 += 10;
        }
    }
}