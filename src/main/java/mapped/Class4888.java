// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class4888 extends Class4841
{
    private static String[] field20591;
    public Class9572 field20897;
    
    public Class4888(final Class4803 class4803, final String s, final int n, final int n2) {
        super(class4803, s, n, n2, 20, 20, false);
        this.field20897 = new Class9572(1200, 1200, Class2186.field12965);
    }
    
    @Override
    public void method14205(final float n) {
        this.field20897.method35855(this.method14308() ? Class2186.field12964 : Class2186.field12965);
        if (this.field20897.method35858() == 1.0f) {
            if (this.method14308()) {
                this.field20897 = new Class9572(1200, 1200, Class2186.field12964);
            }
        }
        final int n2 = this.method14272() + 10;
        final int n3 = this.method14274() + 10;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)n2, (float)n3, 0.0f);
        GL11.glRotatef(this.field20897.method35858() * 360.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef((float)(-n2), (float)(-n3), 0.0f);
        Class8154.method26905((float)this.field20478, (float)this.field20479, 20.0f, 20.0f, this.method14308() ? Class4809.field20544 : Class4809.field20543);
        GL11.glPopMatrix();
        super.method14205(n);
    }
}
