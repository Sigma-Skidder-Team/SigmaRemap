// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;

public class Class4922 extends Class4825
{
    private static String[] field20591;
    public final int field21057;
    
    public Class4922(final Class4803 class4803, final String s, final int n, final int n2, final int field21057, final int n3) {
        super(class4803, s, n, n2, field21057, n3, false);
        this.field21057 = field21057;
    }
    
    @Override
    public void draw(final float n) {
        if (this.method14276() != 0) {
            this.method14228();
            final float n2 = 1.0f - Math.min(1.0f, Math.max(this.method14276() / (float)this.field21057, 0.0f));
            RenderUtil.method26874((float)this.field20478, (float)this.field20479, (float)this.field21057, (float)this.field20481, ColorUtils.applyAlpha(-3254955, n));
            super.draw(n * (1.0f - n2));
            RenderUtil.method26899(0.0f, 0.0f, 20.0f, (float)this.field20481, ClientAssets.shadow_right, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n2 * n));
        }
    }
}
