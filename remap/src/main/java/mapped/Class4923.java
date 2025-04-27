// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;

public class Class4923 extends Class4825
{
    private static String[] field20591;
    public Class8592 field21058;
    private final int field21059;
    private final int field21060;
    
    public Class4923(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Class8592 field21058) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field21059 = -2434342;
        this.field21060 = -6505234;
        this.field21058 = field21058;
    }
    
    @Override
    public void draw(final float n) {
        int n2 = this.x + 20;
        final int n3 = this.y + 5;
        final int method29097 = this.field21058.method29097();
        final int n4 = this.field20481 - 10 - Class4824.method14454();
        int n5 = ColorUtils.applyAlpha(this.field21059, n);
        int n6 = ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, n);
        if (this.field21058.field36094) {
            n5 = ColorUtils.applyAlpha(-15038729, n);
            n2 += 402 - method29097;
            n6 = ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n);
        }
        RenderUtil.method26924((float)n2, (float)n3, (float)method29097, (float)n4, 9.0f, n5);
        int n7 = 0;
        final String[] field36095 = this.field21058.field36095;
        for (int length = field36095.length, i = 0; i < length; ++i) {
            RenderUtil.drawString(ClientFonts.JelloLight18, (float)(n2 + 10), (float)(n3 + 5 + n7 * ClientFonts.JelloLight18.getHeight()), field36095[i], n6);
            ++n7;
        }
        super.draw(n);
    }
}
