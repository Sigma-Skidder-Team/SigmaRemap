// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.UglyClickGUICategory;
import org.lwjgl.opengl.GL11;

public class Class4888 extends Panel
{
    private static String[] field20591;
    public Animation field20897;
    
    public Class4888(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2) {
        super(customGuiScreen, s, n, n2, 20, 20, false);
        this.field20897 = new Animation(1200, 1200, Direction.FORWARDS);
    }
    
    @Override
    public void draw(final float partialTicks) {
        this.field20897.changeDirection(this.method14308() ? Direction.BACKWARDS : Direction.FORWARDS);
        if (this.field20897.calcPercent() == 1.0f) {
            if (this.method14308()) {
                this.field20897 = new Animation(1200, 1200, Direction.BACKWARDS);
            }
        }
        final int n2 = this.method14272() + 10;
        final int n3 = this.method14274() + 10;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)n2, (float)n3, 0.0f);
        GL11.glRotatef(this.field20897.calcPercent() * 360.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-n2), (float)(-n3), 0.0f);
        RenderUtil.drawImage((float)this.x, (float)this.y, 20.0f, 20.0f, this.method14308() ? UglyClickGUICategory.gear2 : UglyClickGUICategory.gear);
        GL11.glPopMatrix();
        super.draw(partialTicks);
    }
}
