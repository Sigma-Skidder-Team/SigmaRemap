// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class4877 extends Class4868
{
    private static String[] field20591;
    public final Class2199 field20866;
    public boolean field20867;
    public Class9572 field20868;
    
    public Class4877(final Class4803 class4803, final String s, final int n, final int n2, final Class2199 field20866) {
        super(class4803, s, n, n2, 18, 18);
        this.field20866 = field20866;
        (this.field20868 = new Class9572(250, 250)).method35855(Class2186.field12965);
    }
    
    @Override
    public void method14205(final float n) {
        if (this.field20867) {
            if (n == 1.0f) {
                this.field20868.method35855(Class2186.field12964);
            }
        }
        final int n2 = (int)(Class7707.method24587(this.field20868.method35858(), 0.0f, 1.0f, 1.0f, 7.0f) * 3.0f);
        Class8154.method26888((float)(this.field20478 + this.field20480 / 2), (float)(this.field20479 + this.field20481 / 2), 25.0f, Class6430.method19118(Class265.field1273.field1292, 0.025f * n * this.field20868.method35858()));
        Class8154.method26888((float)(this.field20478 + this.field20480 / 2), (float)(this.field20479 + this.field20481 / 2), 23.0f, Class6430.method19118(Class265.field1273.field1292, 0.05f * n * this.field20868.method35858()));
        Class8154.method26888((float)(this.field20478 + this.field20480 / 2), (float)(this.field20479 + this.field20481 / 2), (float)(18 + n2), Class6430.method19118(Class265.field1278.field1292, n * this.field20868.method35858()));
        Class8154.method26888((float)(this.field20478 + this.field20480 / 2), (float)(this.field20479 + this.field20481 / 2), (float)(18 - n2), Class6430.method19118(this.field20866.field13388, n));
        GL11.glPushMatrix();
        super.method14229(n);
        GL11.glPopMatrix();
    }
}
