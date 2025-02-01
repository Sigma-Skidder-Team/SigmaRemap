// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4893 extends Class4841
{
    private static String[] field20591;
    public float field20918;
    
    public Class4893(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, false);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20918 += (this.method14308() ? 0.14f : -0.14f);
        this.field20918 = Math.min(Math.max(0.0f, this.field20918), 1.0f);
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26888((float)(this.field20478 + this.field20480 / 2), (float)(this.field20479 + this.field20481 / 2), (float)this.field20480, ColorUtils.applyAlpha(ClientColors.field1283.color, (0.5f + this.field20918 * 0.3f + (this.field20492 ? 0.2f : 0.0f)) * n));
        RenderUtil.method26874((float)(this.field20478 + (this.field20480 - 10) / 2), (float)(this.field20479 + this.field20481 / 2 - 1), 10.0f, 2.0f, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.75f * n));
        super.draw(n);
    }
}
