// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;

public class Class4860 extends Panel
{
    private static String[] field20591;
    public Class258 field20817;
    
    public Class4860(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Class258 field20817) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20817 = field20817;
        this.doThis((class4803, n) -> {
            this.field20817 = this.field20817.method896();
            this.method14517();
        });
    }
    
    public Class258 method14577() {
        return this.field20817;
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.startScissor((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481);
        RenderUtil.drawImage((float)(this.x - this.field20817.field1232 * this.field20480), (float)this.y, (float)(this.field20480 * 3), (float)this.field20481, ClientAssets.repeat, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.35f));
        RenderUtil.endScissor();
        super.draw(n);
    }
}
