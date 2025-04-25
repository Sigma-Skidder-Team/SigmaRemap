// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import slick2d.Texture;

public class Class4876 extends Class4868
{
    private static String[] field20862;
    private final Texture field20863;
    private boolean field20864;
    private Animation field20865;
    
    public Class4876(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Texture field20863) {
        super(customGuiScreen, s, n, n2, n3, n4);
        this.field20865 = new Animation(150, 190, Direction.FORWARDS);
        this.field20863 = field20863;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        this.field20864 = this.method14308();
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        this.field20865.changeDirection(this.field20864 ? Direction.BACKWARDS : Direction.FORWARDS);
        float n2 = MathUtils.lerp(this.field20865.calcPercent(), 0.07, 0.73, 0.63, 1.01);
        if (this.field20865.getDirection() == Direction.FORWARDS) {
            n2 = MathUtils.lerp(this.field20865.calcPercent(), 0.71, 0.18, 0.95, 0.57);
        }
        RenderUtil.startScissor((float)this.method14272(), this.method14274() - n2 * 3.0f, (float)this.method14276(), (float)this.method14278());
        final int n3 = 40;
        RenderUtil.method26905(n3 * (-Class4939.field21207 / Minecraft.getInstance().window.method7694()), n3 * (-Class4939.field21208 / Minecraft.getInstance().window.method7695()), (float)(Minecraft.getInstance().window.method7694() + n3), (float)(Minecraft.getInstance().window.method7695() + n3), Class568.field3392);
        RenderUtil.endScissor();
        if (this.field20864) {
            RenderUtil.method26874((float)this.method14272(), this.method14274() - n2 * 3.0f, (float)this.method14276(), (float)this.method14278(), ColorUtils.applyAlpha(-12319668, 0.5f));
        }
        RenderUtil.drawImage((float)this.method14272(), this.method14274() - n2 * 3.0f, (float)this.method14276(), (float)this.method14278(), this.field20863, ClientColors.LIGHT_GREYISH_BLUE.color);
        GL11.glPushMatrix();
        super.method14229(n);
        GL11.glPopMatrix();
    }
}
