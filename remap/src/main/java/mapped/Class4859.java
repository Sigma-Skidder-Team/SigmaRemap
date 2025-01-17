// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import slick2d.Texture;

public class Class4859 extends Class4841
{
    private static String[] field20591;
    public Class9572 field20815;
    public Texture field20816;
    
    public Class4859(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Texture field20816) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20815 = new Class9572(300, 300, Class2186.field12965);
        this.field20816 = field20816;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        if (this.method14308() && this.field20815.method35858() < 0.1) {
            this.field20815.method35855(Class2186.field12964);
        }
        else if (!this.method14308()) {
            if (this.field20815.method35858() == 1.0f) {
                this.field20815.method35855(Class2186.field12965);
            }
        }
    }
    
    @Override
    public void method14205(final float n) {
        float n2 = Class8862.method31033(this.field20815.method35858(), 0.68, 2.32, 0.06, 0.48);
        if (this.field20815.method35857() == Class2186.field12965) {
            n2 = Class8862.method31033(this.field20815.method35858(), 0.81, 0.38, 0.32, -1.53);
        }
        this.method14294((int)(-25.0f * n2));
        this.method14228();
        Class8154.method26905((float)(this.field20478 + 20), (float)this.field20479, 100.0f, 100.0f, this.field20816);
        final int n3 = this.field20478 + 12 - (Class9493.field40807.getWidth(this.field20474) - this.field20480) / 2;
        final int n4 = this.field20479 + 102;
        GL11.glAlphaFunc(516, 0.1f);
        Class8154.method26889(Class9493.field40807, (float)n3, (float)(n4 + 1), this.field20474, Class6430.method19118(Class265.field1273.field1292, 0.5f));
        Class8154.method26889(Class9493.field40807, (float)n3, (float)n4, this.field20474, Class265.field1278.field1292);
        GL11.glAlphaFunc(519, 0.0f);
        super.method14229(n);
    }
}
