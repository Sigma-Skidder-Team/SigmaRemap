// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;
import org.lwjgl.opengl.GL11;
import slick2d.Texture;
import slick2d.TrueTypeFont;

public class Class4874 extends Class4873 implements Class4870
{
    private static String[] field20855;
    public boolean field20858;
    public Class9572 field20859;
    
    public Class4874(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Texture class4804, final Class6523 class4805, final String s2, final TrueTypeFont class4806) {
        super(class4803, s, n, n2, n3, n4, class4804, class4805, s2, class4806);
        this.field20858 = false;
        this.field20859 = new Class9572(90, 90, Class2186.field12965);
    }
    
    public Class4874(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Texture class4804, final Class6523 class4805, final String s2) {
        super(class4803, s, n, n2, n3, n4, class4804, class4805, s2);
        this.field20858 = false;
        this.field20859 = new Class9572(90, 90, Class2186.field12965);
    }
    
    public Class4874(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Texture class4804, final Class6523 class4805) {
        super(class4803, s, n, n2, n3, n4, class4804, class4805);
        this.field20858 = false;
        this.field20859 = new Class9572(90, 90, Class2186.field12965);
    }
    
    public Class4874(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Texture class4804) {
        super(class4803, s, n, n2, n3, n4, class4804, new Class6523(Class265.field1278.field1292, Class265.field1278.field1292));
        this.field20858 = false;
        this.field20859 = new Class9572(90, 90, Class2186.field12965);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20858 = this.method14308();
        this.field20859.method35855(this.field20858 ? Class2186.field12964 : Class2186.field12965);
    }
    
    @Override
    public void method14205(final float n) {
        final float n2 = 1.0f + this.field20859.method35858() * 0.2f;
        final float n3 = this.method14309() ? 0.1f : 0.0f;
        final int n4 = (int)(this.method14276() * n2);
        final int n5 = (int)(this.method14278() * n2);
        final int n6 = this.method14272() - (n4 - this.method14276()) / 2;
        final int n7 = (int)(this.method14274() - (n5 - this.method14278()) / 2 - this.method14278() / 2 * (n2 - 1.0f));
        final float[] method19131 = Class6430.method19131(this.method14607().method24920(), this.method14607().method24919(), (float)n4, (float)n5);
        Class8154.method26870(this.method14280() + n6 - this.field20478, this.method14281() + n7 - this.field20479, this.method14280() + n6 - this.field20478 + n4, this.method14281() + n7 - this.field20479 + n5);
        Class8154.method26899(n6 + method19131[0], n7 + method19131[1], method19131[2], method19131[3], this.method14607(), Class6430.method19118(Class6430.method19120(this.field20497.method19729(), this.field20497.method19727(), 1.0f - n3), n));
        if (this.method14314() != null) {
            Class8154.method26890(this.method14316(), (float)(n6 + n4 / 2), (float)(n7 + n5 / 2), this.method14314(), Class6430.method19118(this.field20497.method19733(), n), this.field20497.method19735(), this.field20497.method19737());
        }
        Class8154.method26872();
        final TrueTypeFont method19132 = this.method14316();
        if (n2 > 1.0f) {
            final float n8 = (n2 - 1.0f) / (this.method14605() - 1.0f);
            GL11.glPushMatrix();
            final String s = (this.method14314() != null) ? this.method14314() : this.field20474;
            GL11.glTranslatef((float)(this.method14272() + this.method14276() / 2 - method19132.getWidth(s) / 2), (float)(this.method14274() + this.method14278() - 40), 0.0f);
            GL11.glScalef(n2 / this.method14605(), n2 / this.method14605(), n2 / this.method14605());
            GL11.glAlphaFunc(519, 0.0f);
            Class8154.method26904((1.0f - n2 / this.method14605()) * method19132.getWidth(s) / 2.0f + 1.0f - method19132.getWidth(s) / 2.0f, method19132.getHeight(s) / 3.0f, (float)(method19132.getWidth(s) * 2), method19132.getHeight(s) * 3.0f, ClientAssets.shadow, n8 * 0.6f);
            Class8154.method26889(method19132, (1.0f - n2 / this.method14605()) * method19132.getWidth(s) / 2.0f + 1.0f, 40.0f, s, Class6430.method19118(this.method14318().method19729(), n8 * 0.6f));
            GL11.glPopMatrix();
        }
        super.method14229(n);
    }
    
    @Override
    public float method14605() {
        return 1.2f;
    }
    
    @Override
    public float method14606() {
        return 0.07f * (30.0f / Minecraft.method5338());
    }
}
