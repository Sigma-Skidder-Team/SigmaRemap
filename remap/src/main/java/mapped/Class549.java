// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class549 extends MainMenu
{
    @Override
    public void render(final int n, final int n2, final float n3) {
        super.render(n, n2, n3);
        this.drawString(this.font, "No Addons - SIGMA", 87, this.height - 10, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.4f));
        GL11.glPushMatrix();
        GL11.glTranslatef(88.0f, (float)(this.height - 10), 0.0f);
        GL11.glScalef(0.5f, 0.5f, 1.0f);
        GL11.glTranslatef(-88.0f, (float)(-(this.height - 10)), 0.0f);
        this.drawString(this.font, "PROD", 280, this.height - 10, AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.4f));
        GL11.glPopMatrix();
    }
    
    @Override
    public boolean method2991() {
        return false;
    }
}
