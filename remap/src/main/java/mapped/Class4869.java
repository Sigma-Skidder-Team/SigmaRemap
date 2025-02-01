// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.TrueTypeFont;

public class Class4869 extends Class4868 implements Class4870
{
    private static String[] field20848;
    public float field20849;
    public boolean field20850;
    
    public Class4869(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final String s2, final TrueTypeFont class4805) {
        super(class4803, s, n, n2, n3, n4, class4804, s2, class4805);
        this.field20850 = false;
    }
    
    public Class4869(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final String s2) {
        super(class4803, s, n, n2, n3, n4, class4804, s2);
        this.field20850 = false;
    }
    
    public Class4869(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804) {
        super(class4803, s, n, n2, n3, n4, class4804);
        this.field20850 = false;
    }
    
    public Class4869(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4);
        this.field20850 = false;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20850 = this.method14308();
        this.field20849 += (this.field20850 ? this.method14606() : (-1.0f * this.method14606()));
        this.field20849 = Math.min(Math.max(1.0f, this.field20849), this.method14605());
    }
    
    @Override
    public void draw(final float n) {
        final float n2 = this.isHovered() ? (this.field20850 ? 0.0f : (this.method14309() ? 1.5f : Math.max(n * this.field20845, 0.0f))) : 0.3f;
        final int n3 = (int)(this.method14276() * this.field20849);
        final int n4 = (int)(this.method14278() * this.field20849);
        final int n5 = this.method14272() - (n3 - this.method14276()) / 2;
        final int n6 = this.method14274() - (n4 - this.method14278()) / 2;
        RenderUtil.method26870(this.method14280() + n5 - this.field20478, this.method14281() + n6 - this.field20479, this.method14280() + n5 - this.field20478 + n3, this.method14281() + n6 - this.field20479 + n4);
        RenderUtil.method26876((float)n5, (float)n6, (float)(n5 + n3), (float)(n6 + n4), ColorUtils.applyAlpha(ColorUtils.method19120(this.field20497.method19729(), this.field20497.method19727(), 1.0f - n2), n));
        if (this.method14314() != null) {
            RenderUtil.method26890(this.method14316(), (float)(n5 + n3 / 2), (float)(n6 + n4 / 2), this.method14314(), ColorUtils.applyAlpha(this.field20497.method19733(), n), this.field20497.method19735(), this.field20497.method19737());
        }
        RenderUtil.method26872();
        super.method14229(n);
    }
    
    @Override
    public float method14605() {
        return 1.3f;
    }
    
    @Override
    public float method14606() {
        return 0.05f;
    }
}
