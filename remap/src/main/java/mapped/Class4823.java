// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4823 extends Class4817
{
    private static String[] field20637;
    
    public Class4823(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4);
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26876((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), ColorUtils.applyAlpha(ClientColors.MID_GREY.color, 0.35f));
        RenderUtil.method26879((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), 2, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.14f));
        super.draw(n);
    }
}
