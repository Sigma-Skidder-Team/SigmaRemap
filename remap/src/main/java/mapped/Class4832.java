// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import org.newdawn.slick.TrueTypeFont;

public class Class4832 extends TextField
{
    private static String[] field20688;
    
    public Class4832(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final ColorHelper class4804, final String s2, final String s3, final TrueTypeFont class4805) {
        super(customGuiScreen, s, n, n2, n3, n4, class4804, s2, s3, class4805);
        this.method14319(new ColorHelper(class4804).method19734(ClientColors.LIGHT_GREYISH_BLUE.color));
        this.method14478(false);
    }
    
    @Override
    public void draw(final float n) {
        this.setFont(ClientFonts.Default);
        RenderUtil.method26876((float)this.x, (float)this.y, (float)(this.x + this.field20480), (float)(this.y + this.field20481), ClientColors.DEEP_TEAL.color);
        RenderUtil.method26879((float)(this.x - 2), (float)this.y, (float)(this.x + this.field20480 + 2), (float)(this.y + this.field20481), 2, ColorUtils.method19120(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.DEEP_TEAL.color, 625.0f));
        super.draw(n);
    }
}
