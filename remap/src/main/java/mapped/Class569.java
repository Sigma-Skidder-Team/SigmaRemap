// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class569 extends AbstractGui implements Class570
{
    private static final ResourceLocation field3394;
    public static final ResourceLocation field3395;
    private final Minecraft field3396;
    private long field3397;
    private Class9039 field3398;
    
    public Class569(final Minecraft field3396) {
        this.field3396 = field3396;
    }
    
    public void method3320(final int n) {
        this.field3397 = Util.method27837();
        if (this.field3398 == null) {
            this.field3398 = new Class9039(this);
        }
        else {
            this.field3398.method32496(n);
        }
    }
    
    private float method3321() {
        return MathHelper.clamp((this.field3397 - Util.method27837() + 5000L) / 2000.0f, 0.0f, 1.0f);
    }
    
    public void method3322(final float n) {
        if (this.field3398 != null) {
            final float method3321 = this.method3321();
            if (method3321 > 0.0f) {
                final int n2 = this.field3396.method5332().method7696() / 2;
                final int method3322 = this.getBlitOffset();
                this.setBlitOffset(-90);
                this.method3323(method3321, n2, MathHelper.method35642(this.field3396.method5332().method7697() - 22.0f * method3321), this.field3398.method32500());
                this.setBlitOffset(method3322);
            }
            else {
                this.field3398.method32497();
            }
        }
    }
    
    public void method3323(final float n, final int n2, final int n3, final Class9311 class9311) {
        RenderSystem.enableRescaleNormal();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, n);
        this.field3396.method5290().method5849(Class569.field3394);
        this.blit(n2 - 91, n3, 0, 0, 182, 22);
        if (class9311.method34432() >= 0) {
            this.blit(n2 - 91 - 1 + class9311.method34432() * 20, n3 - 1, 0, 22, 24, 22);
        }
        for (int i = 0; i < 9; ++i) {
            this.method3324(i, this.field3396.method5332().method7696() / 2 - 90 + i * 20 + 2, (float)(n3 + 3), n, class9311.method34431(i));
        }
        RenderSystem.disableRescaleNormal();
        RenderSystem.disableBlend();
    }
    
    private void method3324(final int n, final int n2, final float n3, final float n4, final Class6991 class6991) {
        this.field3396.method5290().method5849(Class569.field3395);
        if (class6991 != Class9039.field38256) {
            final int n5 = (int)(n4 * 255.0f);
            RenderSystem.pushMatrix();
            RenderSystem.translatef((float)n2, n3, 0.0f);
            final float n6 = class6991.method21405() ? 1.0f : 0.25f;
            RenderSystem.method30068(n6, n6, n6, n4);
            class6991.method21404(n6, n5);
            RenderSystem.popMatrix();
            final String value = String.valueOf(this.field3396.gameSettings.field23457[n].method1068());
            if (n5 > 3) {
                if (class6991.method21405()) {
                    this.field3396.fontRenderer.drawStringWithShadow(value, (float)(n2 + 19 - 2 - this.field3396.fontRenderer.getStringWidth(value)), n3 + 6.0f + 3.0f, 16777215 + (n5 << 24));
                }
            }
        }
    }
    
    public void method3325() {
        final int n = (int)(this.method3321() * 255.0f);
        if (n > 3) {
            if (this.field3398 != null) {
                final Class6991 method32494 = this.field3398.method32494();
                final String s = (method32494 != Class9039.field38256) ? method32494.method21403().getFormattedText() : this.field3398.method32495().method21401().getFormattedText();
                if (s != null) {
                    final int n2 = (this.field3396.method5332().method7696() - this.field3396.fontRenderer.getStringWidth(s)) / 2;
                    final int n3 = this.field3396.method5332().method7697() - 35;
                    RenderSystem.pushMatrix();
                    RenderSystem.enableBlend();
                    RenderSystem.defaultBlendFunc();
                    this.field3396.fontRenderer.drawStringWithShadow(s, (float)n2, (float)n3, 16777215 + (n << 24));
                    RenderSystem.disableBlend();
                    RenderSystem.popMatrix();
                }
            }
        }
    }
    
    @Override
    public void method3326(final Class9039 class9039) {
        this.field3398 = null;
        this.field3397 = 0L;
    }
    
    public boolean method3327() {
        return this.field3398 != null;
    }
    
    public void method3328(final double n) {
        int i;
        for (i = this.field3398.method32498() + (int)n; i >= 0; i += (int)n) {
            if (i > 8) {
                break;
            }
            if (this.field3398.method32492(i) != Class9039.field38256 && this.field3398.method32492(i).method21405()) {
                break;
            }
        }
        if (i >= 0) {
            if (i <= 8) {
                this.field3398.method32496(i);
                this.field3397 = Util.method27837();
            }
        }
    }
    
    public void method3329() {
        this.field3397 = Util.method27837();
        if (!this.method3327()) {
            this.field3398 = new Class9039(this);
        }
        else {
            final int method32498 = this.field3398.method32498();
            if (method32498 != -1) {
                this.field3398.method32496(method32498);
            }
        }
    }
    
    static {
        field3394 = new ResourceLocation("textures/gui/widgets.png");
        field3395 = new ResourceLocation("textures/gui/spectator_widgets.png");
    }
}
