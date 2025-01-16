// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class629 extends Class624
{
    public final /* synthetic */ RealmsMainScreen field3613;
    
    public Class629(final RealmsMainScreen field3613) {
        this.field3613 = field3613;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        this.method3633(n, n3, n2, n6, n7);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        RealmsMainScreen.method15833(this.field3613, true);
        return true;
    }
    
    private void method3633(final int n, final int n2, final int n3, final int n4, final int n5) {
        final int n6 = n3 + 8;
        int n7 = 0;
        final String string = RealmsScreen.getLocalizedString("mco.trial.message.line1") + "\\n" + RealmsScreen.getLocalizedString("mco.trial.message.line2");
        int n8 = 0;
        if (n2 <= n4) {
            if (n4 <= RealmsMainScreen.method15824(this.field3613).method15530()) {
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
            this.field3613.drawCenteredString(split[i], this.field3613.width() / 2, n6 + n7, n9);
            n7 += 10;
        }
    }
}
