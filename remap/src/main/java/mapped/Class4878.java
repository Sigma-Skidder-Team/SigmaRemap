// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class4878 extends Class4868
{
    private static String[] field20869;
    public static final Class6523 field20870;
    
    public Class4878(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, Class4878.field20870);
    }
    
    @Override
    public void draw(final float n) {
        if (n != 0.0f) {
            final float n2 = this.isHovered() ? (this.method14386() ? 0.0f : (this.method14309() ? 1.5f : Math.max(n * this.field20845, 0.0f))) : 0.3f;
            RenderUtil.method26924((float)this.method14272(), (float)this.method14274(), (float)this.method14276(), (float)this.method14278(), 5.0f, ColorUtils.applyAlpha(this.field20497.method19729(), n));
            if (this.method14314() != null) {
                RenderUtil.method26890(this.method14316(), (float)(this.method14272() + this.method14276() / 2), (float)(this.method14274() + this.method14278() / 2), this.method14314(), ColorUtils.applyAlpha(this.field20497.method19733(), n), this.field20497.method19735(), this.field20497.method19737());
            }
            GL11.glPushMatrix();
            super.method14229(n);
            GL11.glPopMatrix();
        }
    }
    
    static {
        field20870 = new Class6523(ClientColors.field1274.color, ColorUtils.method19121(ClientColors.field1274.color, 0.1f));
    }
}
