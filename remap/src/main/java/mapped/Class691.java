// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class691 extends Screen implements Class692
{
    public final Screen field3808;
    private Class614 field3809;
    private Class613 field3810;
    private Class609 field3811;
    private final Class7474 field3812;
    private Class608<?> field3813;
    private boolean field3814;
    
    public Class691(final Screen field3808, final Class7474 field3809) {
        super(new Class2259("gui.stats", new Object[0]));
        this.field3814 = true;
        this.field3808 = field3808;
        this.field3812 = field3809;
    }
    
    @Override
    public void init() {
        this.field3814 = true;
        this.minecraft.method5269().method17292(new Class4323(Class2218.field13622));
    }
    
    public void method3855() {
        this.field3809 = new Class614(this, this.minecraft);
        this.field3810 = new Class613(this, this.minecraft);
        this.field3811 = new Class609(this, this.minecraft);
    }
    
    public void method3856() {
        this.addButton(new Class654(this.width / 2 - 120, this.height - 52, 80, 20, Class8822.method30773("stat.generalButton", new Object[0]), class654 -> this.method3859(this.field3809)));
        final Class654 class654 = this.addButton(new Class654(this.width / 2 - 40, this.height - 52, 80, 20, Class8822.method30773("stat.itemsButton", new Object[0]), class654 -> this.method3859(this.field3810)));
        final Class654 class655 = this.addButton(new Class654(this.width / 2 + 40, this.height - 52, 80, 20, Class8822.method30773("stat.mobsButton", new Object[0]), class654 -> this.method3859(this.field3811)));
        this.addButton(new Class654(this.width / 2 - 100, this.height - 28, 200, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.minecraft.displayGuiScreen(this.field3808)));
        if (this.field3810.children().isEmpty()) {
            class654.field3431 = false;
        }
        if (this.field3811.children().isEmpty()) {
            class655.field3431 = false;
        }
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        if (!this.field3814) {
            this.method3858().render(n, n2, n3);
            this.drawCenteredString(this.font, this.title.getFormattedText(), this.width / 2, 20, 16777215);
            super.render(n, n2, n3);
        }
        else {
            this.renderBackground();
            this.drawCenteredString(this.font, Class8822.method30773("multiplayer.downloadingStats", new Object[0]), this.width / 2, this.height / 2, 16777215);
            this.drawCenteredString(this.font, Class691.field3815[(int)(Util.method27837() / 150L % Class691.field3815.length)], this.width / 2, this.height / 2 + 18, 16777215);
        }
    }
    
    @Override
    public void method3857() {
        if (this.field3814) {
            this.method3855();
            this.method3856();
            this.method3859(this.field3809);
            this.field3814 = false;
        }
    }
    
    @Override
    public boolean method2991() {
        return !this.field3814;
    }
    
    @Nullable
    public Class608<?> method3858() {
        return this.field3813;
    }
    
    public void method3859(final Class608<?> field3813) {
        this.children.remove(this.field3809);
        this.children.remove(this.field3810);
        this.children.remove(this.field3811);
        if (field3813 != null) {
            this.children.add(0, field3813);
            this.field3813 = field3813;
        }
    }
    
    private int method3860(final int n) {
        return 115 + 40 * n;
    }
    
    private void method3861(final int n, final int n2, final Item class3820) {
        this.method3862(n + 1, n2 + 1, 0, 0);
        RenderSystem.enableRescaleNormal();
        this.itemRenderer.method6538(class3820.method11741(), n + 2, n2 + 2);
        RenderSystem.disableRescaleNormal();
    }
    
    private void method3862(final int n, final int n2, final int n3, final int n4) {
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.minecraft.method5290().method5849(Class691.STATS_ICON_LOCATION);
        AbstractGui.blit(n, n2, this.getBlitOffset(), (float)n3, (float)n4, 18, 18, 128, 128);
    }
}
