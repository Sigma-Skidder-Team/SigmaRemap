// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class4877 extends Class4868
{
    private static String[] field20591;
    public final Class2199 field20866;
    public boolean field20867;
    public Animation field20868;
    
    public Class4877(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final Class2199 field20866) {
        super(customGuiScreen, s, n, n2, 18, 18);
        this.field20866 = field20866;
        (this.field20868 = new Animation(250, 250)).changeDirection(Direction.FORWARDS);
    }
    
    @Override
    public void draw(final float partialTicks) {
        if (this.field20867) {
            if (partialTicks == 1.0f) {
                this.field20868.changeDirection(Direction.BACKWARDS);
            }
        }
        final int n2 = (int)(Class7707.method24587(this.field20868.calcPercent(), 0.0f, 1.0f, 1.0f, 7.0f) * 3.0f);
        RenderUtil.method26888((float)(this.x + this.field20480 / 2), (float)(this.y + this.field20481 / 2), 25.0f, AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.025f * partialTicks * this.field20868.calcPercent()));
        RenderUtil.method26888((float)(this.x + this.field20480 / 2), (float)(this.y + this.field20481 / 2), 23.0f, AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.05f * partialTicks * this.field20868.calcPercent()));
        RenderUtil.method26888((float)(this.x + this.field20480 / 2), (float)(this.y + this.field20481 / 2), (float)(18 + n2), AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, partialTicks * this.field20868.calcPercent()));
        RenderUtil.method26888((float)(this.x + this.field20480 / 2), (float)(this.y + this.field20481 / 2), (float)(18 - n2), AllUtils.applyAlpha(this.field20866.field13388, partialTicks));
        GL11.glPushMatrix();
        super.method14229(partialTicks);
        GL11.glPopMatrix();
    }
}
