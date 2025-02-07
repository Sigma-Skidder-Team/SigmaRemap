// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;
import org.lwjgl.opengl.GL11;

public class LoadingIndicator extends Class4825
{
    private static String[] field20591;
    public Class7617 field20745;
    public float field20746;
    
    public LoadingIndicator(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20745 = new Class7617();
        this.field20746 = 0.0f;
        this.field20745.method23932();
    }
    
    @Override
    public void draw(final float n) {
        this.field20746 += (this.isHovered() ? 0.2f : -0.2f);
        this.field20746 = Math.min(1.0f, Math.max(0.0f, this.field20746));
        final float n2 = (float)(this.field20745.method23935() / 75L % 12L);
        if (this.field20746 != 0.0f) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(this.x + this.field20480 / 2), (float)(this.y + this.field20481 / 2), 0.0f);
            GL11.glRotatef(n2 * 30.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef((float)(-this.x - this.field20480 / 2), (float)(-this.y - this.field20481 / 2), 0.0f);
            RenderUtil.drawImage((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, ClientAssets.loading_indicator, ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, this.field20746 * n));
            GL11.glPopMatrix();
        }
    }
}
