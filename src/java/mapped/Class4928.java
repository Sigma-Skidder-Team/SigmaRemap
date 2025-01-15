// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class4928 extends Class4800
{
    private float field21083;
    private int field21084;
    private int field21085;
    private boolean field21086;
    
    public Class4928() {
        super("Credits");
        this.field21083 = 0.0f;
        this.field21084 = 0;
        this.field21085 = 0;
        this.field21086 = true;
        this.method14311(false);
    }
    
    @Override
    public void method14205(final float n) {
        super.method14205(n);
        final int method24918 = Class7853.field32204.method24918();
        final int method24919 = Class7853.field32204.method24917();
        final int min = Math.min(method24918, (int)(Class869.method5277().field4632.method7695() / 1.65f));
        final int min2 = Math.min(method24919, (int)(Class869.method5277().field4632.method7695() / 1.65f));
        this.method14789();
        Class8154.method26876(0.0f, 0.0f, (float)this.method14276(), (float)this.method14278(), Class6430.method19118(Class265.field1278.field1292, 0.9f * this.field21083));
        final float method24920 = Class7707.method24584((this.field21083 >= 0.5) ? ((float)(this.field21083 - 0.5) * 2.0f) : 0.0f, 0.0f, 1.0f, 1.0f);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.method14276() / 2), (float)(this.method14278() / 2), 0.0f);
        GL11.glScaled((double)method24920, (double)method24920, 0.0);
        GL11.glTranslatef((float)(-this.method14276() / 2), (float)(-this.method14278() / 2), 0.0f);
        final String s = "Jello by MF & Tomygames";
        final Class7524 field40314 = Class9400.field40314;
        Class8154.method26889(field40314, (float)((this.method14276() - field40314.method23505(s)) / 2), (float)(this.method14278() - 110), s, Class265.field1273.field1292);
        GL11.glPopMatrix();
        Class8154.method26899(this.method14276() / 2 - (min - min * (this.field21083 - 1.0f) * this.field21083) / 2.0f, (float)(Math.max(min2 * 1.2f, (float)(this.method14278() / 2)) - min2 - min2 * Math.sin(this.field21083 * this.field21083 * 3.141592653589793) * Math.sin(this.field21083 * this.field21083 * 3.141592653589793)), min - min * (this.field21083 - 1.0f) * this.field21083, min2 - min2 * (this.field21083 - 1.0f) * this.field21083, Class7853.field32204, Class6430.method19118(Class265.field1278.field1292, Math.min(1.0f, this.field21083)));
        if (this.field21083 >= 0.986) {
            this.field21083 = 1.0f;
        }
        else {
            this.field21083 = (float)Math.max(0.0, Math.min(1.0, this.field21083 + 0.05 * (30.0f / Class869.method5338()) - this.field21083 * 0.04f * (30.0f / Class869.method5338())));
        }
    }
    
    private void method14789() {
        final int field21085 = this.method14320() * -1;
        final float n = this.method14321() / (float)this.method14276() * -114.0f;
        if (this.field21086) {
            this.field21084 = (int)n;
            this.field21085 = field21085;
            this.field21086 = false;
        }
        final float n2 = n - this.field21084;
        final float n3 = (float)(field21085 - this.field21085);
        Class8154.method26905((float)this.field21085, (float)this.field21084, (float)(this.method14276() * 2), (float)(this.method14278() + 114), Class7853.field32177);
        final float n4 = 0.5f;
        if (n != this.field21084) {
            this.field21084 += (int)(n2 * n4);
        }
        if (field21085 != this.field21085) {
            this.field21085 += (int)(n3 * n4);
        }
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            Class869.method5277().method5244(new Class548());
        }
    }
}
