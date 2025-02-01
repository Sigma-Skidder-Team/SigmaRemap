// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.Texture;

public class Class4914 extends Class4825
{
    private static String[] field21019;
    private Texture field21020;
    
    public Class4914(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Texture field21020) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field21020 = field21020;
    }
    
    @Override
    public void draw(final float n) {
        RenderUtil.method26899((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, this.field21020, ColorUtils.method19120(ClientColors.field1273.color, ClientColors.LIGHT_GREYISH_BLUE.color, this.method14308() ? (this.method14309() ? 0.3f : 0.15f) : 0.0f));
        super.draw(n);
    }
}
