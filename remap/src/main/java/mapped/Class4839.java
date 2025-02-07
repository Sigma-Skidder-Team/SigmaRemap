// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;

public class Class4839 extends Class4825
{
    private static String[] field20591;
    
    public Class4839(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
    }
    
    @Override
    public void draw(final float n) {
        if (this.method14296()) {
            RenderUtil.drawImage((float)(this.x + 30), (float)(this.y + 30), 187.0f, 36.0f, ClientAssets.gem, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
        }
    }
}
