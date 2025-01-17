// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import slick2d.Texture;

public class UglyClickGUICategoryIcon extends Class4841
{
    private static String[] field20591;
    public Texture field20795;
    public Texture field20796;
    
    public UglyClickGUICategoryIcon(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final String s2, final Texture field20795, final Texture field20796) {
        super(class4803, s, n, n2, n3, n4, Class6523.field25964, s2, false);
        this.field20795 = field20795;
        this.field20796 = field20796;
    }
    
    @Override
    public void method14205(final float n) {
        GL11.glAlphaFunc(518, 0.1f);
        Class8154.method26899((float)(this.field20478 + (this.field20480 - 64) / 2), (float)(this.field20479 + 10), 64.0f, 64.0f, this.method14308() ? this.field20796 : this.field20795, Class265.field1278.field1292);
        final int n2 = this.method14276() / 2 + this.field20478;
        final int n3 = this.method14278() / 2 + this.field20479;
        Class8154.method26889(Class9493.field40806, (float)(this.field20478 + (this.method14276() - Class9493.field40806.getWidth(this.field20495)) / 2), (float)(this.field20479 + this.method14278() - 50), this.field20495, this.method14308() ? -319475 : -14869219);
        super.method14205(n);
    }
}
