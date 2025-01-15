// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class4840 extends Class4825
{
    private static String[] field20591;
    public Class7617 field20745;
    public float field20746;
    
    public Class4840(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20745 = new Class7617();
        this.field20746 = 0.0f;
        this.field20745.method23932();
    }
    
    @Override
    public void method14205(final float n) {
        this.field20746 += (this.method14304() ? 0.2f : -0.2f);
        this.field20746 = Math.min(1.0f, Math.max(0.0f, this.field20746));
        final float n2 = (float)(this.field20745.method23935() / 75L % 12L);
        if (this.field20746 != 0.0f) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(this.field20478 + this.field20480 / 2), (float)(this.field20479 + this.field20481 / 2), 0.0f);
            GL11.glRotatef(n2 * 30.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef((float)(-this.field20478 - this.field20480 / 2), (float)(-this.field20479 - this.field20481 / 2), 0.0f);
            Class8154.method26899((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, Class7853.field32203, Class6430.method19118(Class265.field1273.field1292, this.field20746 * n));
            GL11.glPopMatrix();
        }
    }
}
