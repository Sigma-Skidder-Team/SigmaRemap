// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;

public class Class4856 extends Class4841
{
    private static String[] field20591;
    public float field20805;
    public String field20806;
    
    public Class4856(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final String s2, final String field20806) {
        super(customGuiScreen, s, n, n2, n3, n4, ColorHelper.field25964, s2, false);
        this.field20806 = field20806;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20805 += (this.method14308() ? 0.14f : -0.14f);
        this.field20805 = Math.min(Math.max(0.0f, this.field20805), 1.0f);
    }
    
    @Override
    public void draw(final float n) {
        if (this.getTypedText() != null) {
            this.method14228();
            this.field20497.method19729();
            final int n2 = this.method14272() + ((this.field20497.method19735() != Class2056.field11738) ? 0 : ((this.field20497.method19735() != Class2056.field11736) ? (this.method14276() / 2) : this.method14276()));
            final int n3 = this.method14274() + ((this.field20497.method19737() != Class2056.field11738) ? 0 : ((this.field20497.method19737() != Class2056.field11737) ? (this.method14278() / 2) : this.method14278()));
            this.method14316().getWidth(this.getTypedText());
            final float n4 = this.field20805 * this.field20805 * this.field20805;
            boolean b = false;
            if (this.method14306()) {
                b = true;
            }
            if (b) {
                RenderUtil.method26876((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), ColorUtils.applyAlpha(-11890462, 1.0f));
            }
            final int n5 = 16;
            final int n6 = 8;
            int n7 = ClientColors.DEEP_TEAL.color;
            if (b) {
                n7 = ClientColors.LIGHT_GREYISH_BLUE.color;
            }
            RenderUtil.drawString(ClientFonts.JelloLight14, (float)(this.x + n5 + 50), (float)(this.y + n6 + 5), this.field20495, ColorUtils.applyAlpha(n7, n));
            RenderUtil.drawString(ClientFonts.JelloLight12, (float)(this.x + n5 + 50), (float)(this.y + n6 + 19), this.field20806, ColorUtils.applyAlpha(n7, n * 0.5f));
            super.draw(n);
        }
    }
}
