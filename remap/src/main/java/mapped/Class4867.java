// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;
import org.lwjgl.opengl.GL11;

public class Class4867 extends Panel
{
    private static String[] field20591;
    public boolean field20843;
    public Animation field20844;
    
    public Class4867(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20844 = new Animation(70, 90);
    }
    
    public boolean method14600() {
        return this.field20843;
    }
    
    public void method14601(final boolean b) {
        this.method14602(b, true);
    }
    
    public void method14602(final boolean field20843, final boolean b) {
        if (field20843 != this.method14600()) {
            this.field20843 = field20843;
            this.field20844.changeDirection(this.field20843 ? Direction.FORWARDS : Direction.BACKWARDS);
            if (b) {
                this.method14517();
            }
        }
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26925((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, 10.0f, ColorUtils.applyAlpha(-4144960, (this.method14309() ? 0.6f : 0.43f) * this.field20844.calcPercent() * n));
        final float n2 = (1.0f - this.field20844.calcPercent()) * n;
        RenderUtil.method26925((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, 10.0f, ColorUtils.applyAlpha(ColorUtils.method19120(-14047489, ClientColors.DEEP_TEAL.color, this.method14309() ? 0.9f : 1.0f), n2));
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.method14272() + this.method14276() / 2), (float)(this.method14274() + this.method14278() / 2), 0.0f);
        GL11.glScalef(1.5f - 0.5f * n2, 1.5f - 0.5f * n2, 0.0f);
        GL11.glTranslatef((float)(-this.method14272() - this.method14276() / 2), (float)(-this.method14274() - this.method14278() / 2), 0.0f);
        RenderUtil.drawImage((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, ClientAssets.check, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n2));
        GL11.glPopMatrix();
        super.draw(n);
    }
    
    @Override
    public void method14234(final int n, final int n2, final int n3) {
        this.method14602(!this.field20843, true);
    }
}
