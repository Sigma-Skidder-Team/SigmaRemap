// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import slick2d.TrueTypeFont;

public class Class4832 extends Class4831
{
    private static String[] field20688;
    
    public Class4832(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class6523 class4804, final String s2, final String s3, final TrueTypeFont class4805) {
        super(class4803, s, n, n2, n3, n4, class4804, s2, s3, class4805);
        this.method14319(new Class6523(class4804).method19734(ClientColors.LIGHT_GREYISH_BLUE.color));
        this.method14478(false);
    }
    
    @Override
    public void draw(final float n) {
        this.method14317(ClientFonts.Default);
        RenderUtil.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), ClientColors.field1273.color);
        RenderUtil.method26879((float)(this.field20478 - 2), (float)this.field20479, (float)(this.field20478 + this.field20480 + 2), (float)(this.field20479 + this.field20481), 2, ColorUtils.method19120(ClientColors.LIGHT_GREYISH_BLUE.color, ClientColors.field1273.color, 625.0f));
        super.draw(n);
    }
}
