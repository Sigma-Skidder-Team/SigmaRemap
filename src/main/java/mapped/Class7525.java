// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;
import org.lwjgl.opengl.GL11;
import java.awt.Font;

public class Class7525 extends Class7524
{
    public final int field29870;
    public Class869 field29871;
    
    public Class7525(final int n) {
        super(new Font("Arial", 0, n), false);
        this.field29871 = Class869.method5277();
        this.field29870 = n;
    }
    
    private int method23536(final char c) {
        return (int)Math.ceil(this.field29871.field4643.method6618(c) * this.field29870);
    }
    
    @Override
    public int method23505(final String s) {
        return this.field29871.field4643.method6617(s) * this.field29870;
    }
    
    @Override
    public int method23539() {
        this.field29871.field4643.getClass();
        return 9 * this.field29870;
    }
    
    @Override
    public int method23506(final String s) {
        this.field29871.field4643.getClass();
        return 9 * this.field29870;
    }
    
    @Override
    public int method23521() {
        this.field29871.field4643.getClass();
        return 9 * this.field29870;
    }
    
    @Override
    public void method23501(final float n, final float n2, final String s, final Class2427 class2427) {
        this.method23499(n, n2, s, class2427, 0, s.length() - 1);
    }
    
    @Override
    public void method23499(final float n, final float n2, final String s, final Class2427 class2427, final int n3, final int n4) {
        GL11.glPushMatrix();
        GL11.glScalef((float)this.field29870, (float)this.field29870, 0.0f);
        GL11.glTranslatef(-n / this.field29870, -n2 / this.field29870 + 1.0f, 0.0f);
        this.field29871.method5290().method5849(this.field29871.field4643.field10031.field10459);
        this.field29871.field4643.method6610(s, n, n2, new Color(class2427.field14368, class2427.field14369, class2427.field14370, class2427.field14371).getRGB());
        GL11.glPopMatrix();
    }
    
    @Override
    public void method23500(final float n, final float n2, final String s) {
        this.method23501(n, n2, s, Class2427.field14355);
    }
}
