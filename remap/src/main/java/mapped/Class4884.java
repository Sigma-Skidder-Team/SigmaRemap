// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4884 extends Panel
{
    private static String[] field20879;
    public int field20880;
    
    public Class4884(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final int field20880) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20880 = -16711936;
        this.field20880 = field20880;
    }
    
    @Override
    public void draw(final float partialTicks) {
        RenderUtil.method26888(this.x + this.field20480 / 2.0f, this.y + this.field20480 / 2.0f, (float)this.field20480, AllUtils.applyAlpha(AllUtils.method19120(this.field20880, ClientColors.DEEP_TEAL.color, 0.8f), partialTicks));
        RenderUtil.method26888(this.x + this.field20480 / 2.0f, this.y + this.field20480 / 2.0f, (float)(this.field20480 - 2), AllUtils.applyAlpha(this.field20880, partialTicks));
        if (this.method14309()) {
            RenderUtil.method26888(this.x + this.field20480 / 2.0f, this.y + this.field20480 / 2.0f, (float)(this.field20480 - 2), AllUtils.applyAlpha(ClientColors.DEEP_TEAL.color, partialTicks * 0.2f));
        }
        super.draw(partialTicks);
    }
}
