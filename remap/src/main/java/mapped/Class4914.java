// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.Texture;

public class Class4914 extends Class4825
{
    private static String[] field21019;
    private final Texture field21020;
    
    public Class4914(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final Texture field21020) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field21020 = field21020;
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.drawImage((float)this.x, (float)this.y, (float)this.field20480, (float)this.field20481, this.field21020, ColorUtils.method19120(ClientColors.DEEP_TEAL.color, ClientColors.LIGHT_GREYISH_BLUE.color, this.method14308() ? (this.method14309() ? 0.3f : 0.15f) : 0.0f));
        super.draw(n);
    }
}
