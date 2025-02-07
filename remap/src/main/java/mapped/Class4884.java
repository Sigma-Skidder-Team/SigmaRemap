// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4884 extends Class4841
{
    private static String[] field20879;
    public int field20880;
    
    public Class4884(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final int field20880) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20880 = -16711936;
        this.field20880 = field20880;
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26888(this.x + this.field20480 / 2.0f, this.y + this.field20480 / 2.0f, (float)this.field20480, ColorUtils.applyAlpha(ColorUtils.method19120(this.field20880, ClientColors.DEEP_TEAL.color, 0.8f), n));
        RenderUtil.method26888(this.x + this.field20480 / 2.0f, this.y + this.field20480 / 2.0f, (float)(this.field20480 - 2), ColorUtils.applyAlpha(this.field20880, n));
        if (this.method14309()) {
            RenderUtil.method26888(this.x + this.field20480 / 2.0f, this.y + this.field20480 / 2.0f, (float)(this.field20480 - 2), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, n * 0.2f));
        }
        super.draw(n);
    }
}
