// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Texture;

public class UglyClickGUICategoryIcon extends Panel
{
    private static String[] field20591;
    public Texture field20795;
    public Texture field20796;
    
    public UglyClickGUICategoryIcon(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final String s2, final Texture field20795, final Texture field20796) {
        super(customGuiScreen, s, n, n2, n3, n4, ColorHelper.field25964, s2, false);
        this.field20795 = field20795;
        this.field20796 = field20796;
    }
    
    @Override
    public void draw(final float n) {
        GL11.glAlphaFunc(518, 0.1f);
        RenderUtil.drawImage((float)(this.x + (this.field20480 - 64) / 2), (float)(this.y + 10), 64.0f, 64.0f, this.method14308() ? this.field20796 : this.field20795, ClientColors.LIGHT_GREYISH_BLUE.color);
        final int n2 = this.method14276() / 2 + this.x;
        final int n3 = this.method14278() / 2 + this.y;
        RenderUtil.drawString(ClassicAssets.field40806, (float)(this.x + (this.method14276() - ClassicAssets.field40806.getWidth(this.field20495)) / 2), (float)(this.y + this.method14278() - 50), this.field20495, this.method14308() ? -319475 : -14869219);
        super.draw(n);
    }
}
