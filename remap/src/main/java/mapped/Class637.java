// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class637 extends Class623<Class637>
{
    private static String[] field3635;
    public final /* synthetic */ Class611 field3636;
    
    public Class637(final Class611 field3636) {
        this.field3636 = field3636;
    }
    
    @Override
    public void method3467(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final boolean b, final float n8) {
        final Class9304 class9304 = Class561.method3276().get(n);
        this.method3663(n3, n2, class9304.field39912);
        this.field3636.field3565.font.method6610(class9304.field39913, (float)(n3 + 18 + 5), (float)(n2 + 6), 16777215);
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (n3 == 0) {
            this.method3662();
        }
        return false;
    }
    
    private void method3662() {
        this.field3636.method3572(this);
        this.field3636.field3565.method3272(true);
        Class561.method3277(this.field3636.field3565).method3377(Class561.method3276().get(this.field3636.children().indexOf(this)).field39914);
        Class561.method3277(this.field3636.field3565).method3392();
    }
    
    private void method3663(final int n, final int n2, final Item class3820) {
        this.method3664(n + 1, n2 + 1);
        RenderSystem.enableRescaleNormal();
        this.field3636.field3565.itemRenderer.method6538(new ItemStack(class3820), n + 2, n2 + 2);
        RenderSystem.disableRescaleNormal();
    }
    
    private void method3664(final int n, final int n2) {
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        Class611.method3573(this.field3636).method5290().method5849(AbstractGui.STATS_ICON_LOCATION);
        AbstractGui.blit(n, n2, this.field3636.field3565.getBlitOffset(), 0.0f, 0.0f, 18, 18, 128, 128);
    }
}
