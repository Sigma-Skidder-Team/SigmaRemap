// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4823 extends Class4817
{
    private static String[] field20637;
    
    public Class4823(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4);
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), ColorUtils.applyAlpha(ClientColors.field1281.color, 0.35f));
        RenderUtil.method26879((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), 2, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.14f));
        super.draw(n);
    }
}
