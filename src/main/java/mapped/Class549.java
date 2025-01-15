// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class549 extends Class548
{
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        super.method2975(n, n2, n3);
        this.method3297(this.field3156, "No Addons - SIGMA", 87, this.field3153 - 10, Class6430.method19118(Class265.field1278.field1292, 0.4f));
        GL11.glPushMatrix();
        GL11.glTranslatef(88.0f, (float)(this.field3153 - 10), 0.0f);
        GL11.glScalef(0.5f, 0.5f, 1.0f);
        GL11.glTranslatef(-88.0f, (float)(-(this.field3153 - 10)), 0.0f);
        this.method3297(this.field3156, "PROD", 280, this.field3153 - 10, Class6430.method19118(Class265.field1278.field1292, 0.4f));
        GL11.glPopMatrix();
    }
    
    @Override
    public boolean method2991() {
        return false;
    }
}
