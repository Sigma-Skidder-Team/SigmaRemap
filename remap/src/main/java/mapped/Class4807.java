// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import slick2d.TrueTypeFont;

public class Class4807 extends CustomGuiScreen
{
    public Animation field20527;
    
    public Class4807(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4);
        this.field20527 = new Animation(500, 200, Direction.BACKWARDS);
    }
    
    @Override
    public void draw(final float n) {
        GL11.glAlphaFunc(518, 0.1f);
        final float method31033 = MathUtils.lerp(1.0f - this.field20527.calcPercent(), 0.9, 0.0, 0.9, 0.0);
        final float n2 = this.method14276() * method31033 / 2.0f;
        final float n3 = (this.method14278() + 10) * method31033 / 2.0f;
        RenderUtil.method26868(this.method14280() + n2, this.method14281() + n3, this.method14280() + this.method14276() - n2, this.method14281() + this.method14278() - n3);
        if (method31033 != 0.0f) {
            RenderUtil.method26874((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, ColorUtils.applyAlpha(-2500135, 0.9f));
        }
        else {
            RenderUtil.method26925((float)this.x, (float)this.y, (float)(this.field20480 - 1), (float)(this.field20481 - 1), 3.0f, ColorUtils.applyAlpha(-2500135, 0.9f));
        }
        final TrueTypeFont class7524 = this.field20474.equals("Sigma") ? ClassicAssets.field40805 : ClassicAssets.field40806;
        if (!this.field20474.equals("Sigma")) {
            RenderUtil.drawString(class7524, this.x + (this.method14276() - class7524.getWidth(this.field20474)) / 2.0f, (float)(this.y + 18), this.field20474, -16777216);
        }
        else {
            RenderUtil.drawString(class7524, this.x + (this.method14276() - class7524.getWidth(this.field20474)) / 2.0f, (float)(this.y + 10), this.field20474, -13619152);
        }
        super.draw(n);
        RenderUtil.endScissor();
    }
}
