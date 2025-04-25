// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import slick2d.Color;
import slick2d.TrueTypeFont;

import java.awt.Font;

public class DefaultFont extends TrueTypeFont
{
    public final int field29870;
    public Minecraft mc;
    
    public DefaultFont(final int size) {
        super(new Font("Arial", 0, size), false);
        this.mc = Minecraft.getInstance();
        this.field29870 = size;
    }
    
    private int method23536(final char c) {
        return (int)Math.ceil(this.mc.fontRenderer.method6618(c) * this.field29870);
    }
    
    @Override
    public int getWidth(final String whatchars) {
        return this.mc.fontRenderer.getStringWidth(whatchars) * this.field29870;
    }
    
    @Override
    public int getHeight() {
        this.mc.fontRenderer.getClass();
        return 9 * this.field29870;
    }
    
    @Override
    public int getHeight(final String str) {
        this.mc.fontRenderer.getClass();
        return 9 * this.field29870;
    }
    
    @Override
    public int getLineHeight() {
        this.mc.fontRenderer.getClass();
        return 9 * this.field29870;
    }
    
    @Override
    public void drawString(final float x, final float y, final String text, final Color color) {
        this.drawString(x, y, text, color, 0, text.length() - 1);
    }
    
    @Override
    public void drawString(final float x, final float y, final String text, final Color color, final int startIndex, final int endIndex) {
        GL11.glPushMatrix();
        GL11.glScalef((float)this.field29870, (float)this.field29870, 0.0f);
        GL11.glTranslatef(-x / this.field29870, -y / this.field29870 + 1.0f, 0.0f);
        this.mc.method5290().method5849(this.mc.fontRenderer.field10031.field10459);
        this.mc.fontRenderer.method6610(text, x, y, new java.awt.Color(color.field14368, color.field14369, color.field14370, color.field14371).getRGB());
        GL11.glPopMatrix();
    }
    
    @Override
    public void drawString(final float x, final float y, final String text) {
        this.drawString(x, y, text, Color.field14355);
    }
}
