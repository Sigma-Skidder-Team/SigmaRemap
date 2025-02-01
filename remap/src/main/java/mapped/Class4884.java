// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4884 extends Class4841
{
    private static String[] field20879;
    public int field20880;
    
    public Class4884(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final int field20880) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20880 = -16711936;
        this.field20880 = field20880;
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26888(this.field20478 + this.field20480 / 2.0f, this.field20479 + this.field20480 / 2.0f, (float)this.field20480, ColorUtils.applyAlpha(ColorUtils.method19120(this.field20880, ClientColors.field1273.color, 0.8f), n));
        RenderUtil.method26888(this.field20478 + this.field20480 / 2.0f, this.field20479 + this.field20480 / 2.0f, (float)(this.field20480 - 2), ColorUtils.applyAlpha(this.field20880, n));
        if (this.method14309()) {
            RenderUtil.method26888(this.field20478 + this.field20480 / 2.0f, this.field20479 + this.field20480 / 2.0f, (float)(this.field20480 - 2), ColorUtils.applyAlpha(ClientColors.field1273.color, n * 0.2f));
        }
        super.draw(n);
    }
}
