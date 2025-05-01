// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Texture;
import org.newdawn.slick.TrueTypeFont;

public class Class4871 extends Class4873 implements Class4870
{
    private static String[] field20851;
    public float field20852;
    public boolean field20853;
    
    public Class4871(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Texture class4804, final ColorHelper class4805, final String s2, final TrueTypeFont class4806) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, class4805, s2, class4806);
        this.field20853 = false;
    }
    
    public Class4871(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Texture class4804, final ColorHelper class4805, final String s2) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, class4805, s2);
        this.field20853 = false;
    }
    
    public Class4871(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Texture class4804, final ColorHelper class4805) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, class4805);
        this.field20853 = false;
    }
    
    public Class4871(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Texture class4804) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, new ColorHelper(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.LIGHT_GREYISH_BLUE.color));
        this.field20853 = false;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20853 = this.method14308();
        this.field20852 += ((!this.field20853 && !this.method14386()) ? (-1.0f * this.method14606()) : this.method14606());
        this.field20852 = Math.min(Math.max(1.0f, this.field20852), this.method14605());
    }
    
    @Override
    public void draw(final float partialTicks) {
        final float n2 = this.method14309() ? 0.1f : 0.0f;
        final int n3 = (int)(this.method14276() * this.field20852);
        final int n4 = (int)(this.method14278() * this.field20852);
        final int n5 = this.method14272() - (n3 - this.method14276()) / 2;
        final int n6 = (int)(this.method14274() - (n4 - this.method14278()) / 2 - this.method14278() / 2 * (this.field20852 - 1.0f));
        final float[] method19131 = AllUtils.method19131(this.method14607().getWidth(), this.method14607().getHeight(), (float)n3, (float)n4);
        RenderUtil.method26871(this.method14280() + n5 - this.x, this.method14281() + n6 - this.y, this.method14280() + n5 - this.x + n3, this.method14281() + n6 - this.y + n4, true);
        RenderUtil.drawImage(n5 + method19131[0], n6 + method19131[1], method19131[2], method19131[3], this.method14607(), AllUtils.applyAlpha(AllUtils.method19120(this.field20497.method19729(), this.field20497.method19727(), 1.0f - n2), partialTicks));
        if (this.getTypedText() != null) {
            RenderUtil.method26890(this.method14316(), (float)(n5 + n3 / 2), (float)(n6 + n4 / 2), this.getTypedText(), AllUtils.applyAlpha(this.field20497.method19733(), partialTicks), this.field20497.method19735(), this.field20497.method19737());
        }
        RenderUtil.endScissor();
        final TrueTypeFont method19132 = this.method14316();
        if (this.field20852 > 1.0f) {
            final float n7 = (this.field20852 - 1.0f) / (this.method14605() - 1.0f);
            GL11.glPushMatrix();
            final String s = (this.getTypedText() != null) ? this.getTypedText() : this.field20474;
            GL11.glTranslatef((float)(this.method14272() + this.method14276() / 2 - method19132.getWidth(s) / 2), (float)(this.method14274() + this.method14278() - 40), 0.0f);
            GL11.glScalef(this.field20852 / this.method14605(), this.field20852 / this.method14605(), this.field20852 / this.method14605());
            GL11.glAlphaFunc(519, 0.0f);
            RenderUtil.method26904((1.0f - this.field20852 / this.method14605()) * method19132.getWidth(s) / 2.0f + 1.0f - method19132.getWidth(s) / 2.0f, method19132.getHeight(s) / 3.0f, (float)(method19132.getWidth(s) * 2), method19132.getHeight(s) * 3.0f, ClientAssets.shadow, n7 * 0.6f * partialTicks);
            RenderUtil.drawString(method19132, (1.0f - this.field20852 / this.method14605()) * method19132.getWidth(s) / 2.0f + 1.0f, 40.0f, s, AllUtils.applyAlpha(this.method14318().method19729(), n7 * 0.6f * partialTicks));
            GL11.glPopMatrix();
        }
        super.method14229(partialTicks);
    }
    
    @Override
    public float method14605() {
        return 1.2f;
    }
    
    @Override
    public float method14606() {
        return 0.07f * (30.0f / Minecraft.method5338());
    }
}
