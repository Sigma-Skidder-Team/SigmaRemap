// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;

public class Class4909 extends Class4825
{
    private static String[] field20591;
    public int field21003;
    
    public Class4909(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final String s2, final int field21003) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.method14315(s2);
        this.doThis((class4803, n) -> Minecraft.method5277().method5299().method6422(Class6836.method20933(Class8520.field35662, 1.0f)));
        this.field21003 = field21003;
    }
    
    @Override
    public void draw(final float n) {
        this.setFont(ClientFonts.Default);
        RenderUtil.method26876((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), ColorUtils.applyAlpha(this.field21003, this.isHovered() ? (this.method14308() ? (this.method14309() ? 0.6f : 0.5f) : 0.4f) : 0.25f));
        RenderUtil.method26879((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), 2, ColorUtils.applyAlpha(this.field21003, 0.2f));
        RenderUtil.method26890(ClientFonts.Default, (float)(this.method14272() + this.method14276() / 2), (float)(this.method14274() + this.method14278() / 2), this.field20495, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, this.isHovered() ? 1.0f : 0.5f), Class2056.field11738, Class2056.field11738);
        super.draw(n);
    }
}
