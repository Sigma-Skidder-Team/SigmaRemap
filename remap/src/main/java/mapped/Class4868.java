// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.TrueTypeFont;

public class Class4868 extends Class4841
{
    private static String[] field20591;
    public float field20845;
    private int field20846;
    public int field20847;
    
    public Class4868(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20846 = 0;
        this.field20847 = 0;
    }
    
    public Class4868(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, false);
        this.field20846 = 0;
        this.field20847 = 0;
    }
    
    public Class4868(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, false);
        this.field20846 = 0;
        this.field20847 = 0;
    }
    
    public Class4868(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2, final TrueTypeFont class4805) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, class4805, false);
        this.field20846 = 0;
        this.field20847 = 0;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20845 += (this.method14308() ? 0.1f : -0.1f);
        this.field20845 = Math.min(Math.max(0.0f, this.field20845), 1.0f);
    }
    
    @Override
    public void draw(final float n) {
        final int method19118 = ColorUtils.applyAlpha(ColorUtils.method19120(this.field20497.method19729(), this.field20497.method19727(), 1.0f - (this.isHovered() ? (this.method14386() ? 0.0f : (this.method14309() ? 1.5f : Math.max(n * this.field20845, 0.0f))) : 0.3f)), (this.field20497.method19729() >> 24 & 0xFF) / 255.0f * n);
        if (this.field20847 <= 0) {
            RenderUtil.method26876((float)this.method14272(), (float)this.method14274(), (float)(this.method14272() + this.method14276()), (float)(this.method14274() + this.method14278()), method19118);
        }
        else {
            RenderUtil.method26924((float)this.method14272(), (float)this.method14274(), (float)this.method14276(), (float)this.method14278(), (float)this.field20847, method19118);
        }
        final int n2 = this.method14272() + ((this.field20497.method19735() != Class2056.field11738) ? 0 : ((this.field20497.method19735() != Class2056.field11736) ? (this.method14276() / 2) : this.method14276()));
        final int n3 = this.method14274() + ((this.field20497.method19737() != Class2056.field11738) ? 0 : ((this.field20497.method19737() != Class2056.field11737) ? (this.method14278() / 2) : this.method14278()));
        if (this.getTypedText() != null) {
            RenderUtil.method26890(this.method14316(), (float)(this.field20846 + n2), (float)n3, this.getTypedText(), ColorUtils.applyAlpha(this.field20497.method19733(), n), this.field20497.method19735(), this.field20497.method19737());
        }
        super.draw(n);
    }
    
    public void method14603(final int field20846) {
        this.field20846 = field20846;
    }
    
    public int method14604() {
        return this.field20846;
    }
}
