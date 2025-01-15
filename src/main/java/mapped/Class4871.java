// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class4871 extends Class4873 implements Class4870
{
    private static String[] field20851;
    public float field20852;
    public boolean field20853;
    
    public Class4871(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class7776 class4804, final Class6523 class4805, final String s2, final Class7524 class4806) {
        super(class4803, s, n, n2, n3, n4, class4804, class4805, s2, class4806);
        this.field20853 = false;
    }
    
    public Class4871(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class7776 class4804, final Class6523 class4805, final String s2) {
        super(class4803, s, n, n2, n3, n4, class4804, class4805, s2);
        this.field20853 = false;
    }
    
    public Class4871(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class7776 class4804, final Class6523 class4805) {
        super(class4803, s, n, n2, n3, n4, class4804, class4805);
        this.field20853 = false;
    }
    
    public Class4871(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class7776 class4804) {
        super(class4803, s, n, n2, n3, n4, class4804, new Class6523(Class265.field1278.field1292, Class265.field1278.field1292));
        this.field20853 = false;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20853 = this.method14308();
        this.field20852 += ((!this.field20853 && !this.method14386()) ? (-1.0f * this.method14606()) : this.method14606());
        this.field20852 = Math.min(Math.max(1.0f, this.field20852), this.method14605());
    }
    
    @Override
    public void method14205(final float n) {
        final float n2 = this.method14309() ? 0.1f : 0.0f;
        final int n3 = (int)(this.method14276() * this.field20852);
        final int n4 = (int)(this.method14278() * this.field20852);
        final int n5 = this.method14272() - (n3 - this.method14276()) / 2;
        final int n6 = (int)(this.method14274() - (n4 - this.method14278()) / 2 - this.method14278() / 2 * (this.field20852 - 1.0f));
        final float[] method19131 = Class6430.method19131(this.method14607().method24920(), this.method14607().method24919(), (float)n3, (float)n4);
        Class8154.method26871(this.method14280() + n5 - this.field20478, this.method14281() + n6 - this.field20479, this.method14280() + n5 - this.field20478 + n3, this.method14281() + n6 - this.field20479 + n4, true);
        Class8154.method26899(n5 + method19131[0], n6 + method19131[1], method19131[2], method19131[3], this.method14607(), Class6430.method19118(Class6430.method19120(this.field20497.method19729(), this.field20497.method19727(), 1.0f - n2), n));
        if (this.method14314() != null) {
            Class8154.method26890(this.method14316(), (float)(n5 + n3 / 2), (float)(n6 + n4 / 2), this.method14314(), Class6430.method19118(this.field20497.method19733(), n), this.field20497.method19735(), this.field20497.method19737());
        }
        Class8154.method26872();
        final Class7524 method19132 = this.method14316();
        if (this.field20852 > 1.0f) {
            final float n7 = (this.field20852 - 1.0f) / (this.method14605() - 1.0f);
            GL11.glPushMatrix();
            final String s = (this.method14314() != null) ? this.method14314() : this.field20474;
            GL11.glTranslatef((float)(this.method14272() + this.method14276() / 2 - method19132.method23505(s) / 2), (float)(this.method14274() + this.method14278() - 40), 0.0f);
            GL11.glScalef(this.field20852 / this.method14605(), this.field20852 / this.method14605(), this.field20852 / this.method14605());
            GL11.glAlphaFunc(519, 0.0f);
            Class8154.method26904((1.0f - this.field20852 / this.method14605()) * method19132.method23505(s) / 2.0f + 1.0f - method19132.method23505(s) / 2.0f, method19132.method23506(s) / 3.0f, (float)(method19132.method23505(s) * 2), method19132.method23506(s) * 3.0f, Class7853.field32200, n7 * 0.6f * n);
            Class8154.method26889(method19132, (1.0f - this.field20852 / this.method14605()) * method19132.method23505(s) / 2.0f + 1.0f, 40.0f, s, Class6430.method19118(this.method14318().method19729(), n7 * 0.6f * n));
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
        return 0.07f * (30.0f / Class869.method5338());
    }
}
