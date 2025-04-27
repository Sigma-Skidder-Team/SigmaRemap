// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.Module;

public class Class4883 extends Panel
{
    public Module field20878;
    
    public Class4883(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Module field20878) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20878 = field20878;
        final Class4864 class4804;
        this.addToList(class4804 = new Class4864(this, "enable", 114, 9, 40, 18));
        class4804.method14589(field20878.isEnabled());
        class4804.method14516(class3169 -> field20878.method9909(class4804.method14588()));
        if (field20878.getSettingMap().size() > 0) {
            final Class4888 class4805;
            this.addToList(class4805 = new Class4888(this, "gear", 132, 32));
            class4805.doThis((class3168, n) -> ((Class4808)this.getParent()).method14328(field20878));
        }
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.drawString(ClassicAssets.field40808, (float)(this.x + 10), (float)(this.y + 8), this.field20878.getFormattedName(), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, this.field20878.isEnabled() ? 0.9f : 0.5f));
        RenderUtil.drawString(ClassicAssets.field40809, (float)(this.x + 15), (float)(this.y + 33), "Bind", ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 1.0f));
        RenderUtil.drawString(ClassicAssets.field40809, (float)(this.x + 15), (float)(this.y + 52), ColorUtils.method19166(this.field20878.method9885("Keybind")), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.7f));
        if (this.field20878.getSettingMap().size() > 1) {
            RenderUtil.drawString(ClassicAssets.field40810, (float)(this.x + 84), (float)(this.y + 34), "Settings", ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 1.0f));
        }
        super.draw(n);
    }
}
