// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;
import org.lwjgl.opengl.GL11;

public class Class4867 extends Class4841
{
    private static String[] field20591;
    public boolean field20843;
    public Class9572 field20844;
    
    public Class4867(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20844 = new Class9572(70, 90);
    }
    
    public boolean method14600() {
        return this.field20843;
    }
    
    public void method14601(final boolean b) {
        this.method14602(b, true);
    }
    
    public void method14602(final boolean field20843, final boolean b) {
        if (field20843 != this.method14600()) {
            this.field20843 = field20843;
            this.field20844.method35855(this.field20843 ? Class2186.field12965 : Class2186.field12964);
            if (b) {
                this.method14517();
            }
        }
    }
    
    @Override
    public void method14205(final float n) {
        Class8154.method26925((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, 10.0f, Class6430.method19118(-4144960, (this.method14309() ? 0.6f : 0.43f) * this.field20844.method35858() * n));
        final float n2 = (1.0f - this.field20844.method35858()) * n;
        Class8154.method26925((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, 10.0f, Class6430.method19118(Class6430.method19120(-14047489, Class265.field1273.field1292, this.method14309() ? 0.9f : 1.0f), n2));
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.method14272() + this.method14276() / 2), (float)(this.method14274() + this.method14278() / 2), 0.0f);
        GL11.glScalef(1.5f - 0.5f * n2, 1.5f - 0.5f * n2, 0.0f);
        GL11.glTranslatef((float)(-this.method14272() - this.method14276() / 2), (float)(-this.method14274() - this.method14278() / 2), 0.0f);
        Class8154.method26899((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, ClientAssets.check, Class6430.method19118(Class265.field1278.field1292, n2));
        GL11.glPopMatrix();
        super.method14205(n);
    }
    
    @Override
    public void method14234(final int n, final int n2, final int n3) {
        this.method14602(!this.field20843, true);
    }
}
