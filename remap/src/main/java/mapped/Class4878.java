// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class4878 extends Class4868
{
    private static String[] field20869;
    public static final ColorHelper field20870;
    
    public Class4878(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, Class4878.field20870);
    }
    
    @Override
    public void draw(final float partialTicks) {
        if (partialTicks != 0.0f) {
            final float n2 = this.isHovered() ? (this.method14386() ? 0.0f : (this.method14309() ? 1.5f : Math.max(partialTicks * this.field20845, 0.0f))) : 0.3f;
            RenderUtil.method26924((float)this.method14272(), (float)this.method14274(), (float)this.method14276(), (float)this.method14278(), 5.0f, AllUtils.applyAlpha(this.field20497.method19729(), partialTicks));
            if (this.getTypedText() != null) {
                RenderUtil.method26890(this.method14316(), (float)(this.method14272() + this.method14276() / 2), (float)(this.method14274() + this.method14278() / 2), this.getTypedText(), AllUtils.applyAlpha(this.field20497.method19733(), partialTicks), this.field20497.method19735(), this.field20497.method19737());
            }
            GL11.glPushMatrix();
            super.method14229(partialTicks);
            GL11.glPopMatrix();
        }
    }
    
    static {
        field20870 = new ColorHelper(ClientColors.DARK_BLUE_GREY.color, AllUtils.method19121(ClientColors.DARK_BLUE_GREY.color, 0.1f));
    }
}
