// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import slick2d.Texture;

public class Class4859 extends Class4841
{
    private static String[] field20591;
    public Animation field20815;
    public Texture field20816;
    
    public Class4859(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Texture field20816) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20815 = new Animation(300, 300, Direction.FORWARDS);
        this.field20816 = field20816;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (this.method14308() && this.field20815.calcPercent() < 0.1) {
            this.field20815.changeDirection(Direction.BACKWARDS);
        }
        else if (!this.method14308()) {
            if (this.field20815.calcPercent() == 1.0f) {
                this.field20815.changeDirection(Direction.FORWARDS);
            }
        }
    }
    
    @Override
    public void draw(final float n) {
        float n2 = MathUtils.lerp(this.field20815.calcPercent(), 0.68, 2.32, 0.06, 0.48);
        if (this.field20815.getDirection() == Direction.FORWARDS) {
            n2 = MathUtils.lerp(this.field20815.calcPercent(), 0.81, 0.38, 0.32, -1.53);
        }
        this.drawBackground((int)(-25.0f * n2));
        this.method14228();
        RenderUtil.method26905((float)(this.x + 20), (float)this.y, 100.0f, 100.0f, this.field20816);
        final int n3 = this.x + 12 - (Class9493.field40807.getWidth(this.field20474) - this.field20480) / 2;
        final int n4 = this.y + 102;
        GL11.glAlphaFunc(516, 0.1f);
        RenderUtil.drawString(Class9493.field40807, (float)n3, (float)(n4 + 1), this.field20474, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.5f));
        RenderUtil.drawString(Class9493.field40807, (float)n3, (float)n4, this.field20474, ClientColors.LIGHT_GREYISH_BLUE.color);
        GL11.glAlphaFunc(519, 0.0f);
        super.method14229(n);
    }
}
