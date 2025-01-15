// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import org.lwjgl.opengl.GL11;
import java.util.List;
import java.util.ArrayList;

public class Class4855 extends Class4841
{
    private Class4911 field20801;
    private Class4911 field20802;
    public int field20803;
    private Class9572 field20804;
    
    public Class4855(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final int field20803, final float n5, final float n6, final float n7, final float n8) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20803 = 30;
        this.field20804 = new Class9572(300, 300);
        this.field20803 = field20803;
        this.method14239(this.field20801 = new Class4911(this, 10, "pos1"));
        this.method14239(this.field20802 = new Class4911(this, 10, "pos2"));
        this.method14258((class4803, n) -> this.method14517());
        this.method14568(n5, n6, n7, n8);
    }
    
    public float[] method14567() {
        final int field20803 = this.field20803;
        final float n = (float)(this.field20480 - field20803 * 2);
        return new float[] { (this.field20801.method14272() - field20803) / n, 1.0f - (this.field20801.method14274() - field20803) / n, (this.field20802.method14272() - field20803) / n, 1.0f - (this.field20802.method14274() - field20803) / n };
    }
    
    public void method14568(final float n, final float n2, final float n3, final float n4) {
        final float n5 = (float)(this.field20480 - this.field20803 * 2);
        this.field20801.method14752(this.field20803 + n5 * n, this.field20803 + n5 * (1.0f - n2));
        this.field20802.method14752(this.field20803 + n5 * n3, this.field20803 + n5 * (1.0f - n4));
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public void method14205(final float n) {
        this.field20804.method35855(Class2186.field12964);
        if (this.field20804.method35858() == 1.0f) {
            this.field20804 = new Class9572(1500, 0);
        }
        final float[] method14567 = this.method14567();
        final int field20803 = this.field20803;
        final float n2 = (float)(this.field20480 - field20803 * 2);
        final float n3 = method14567[0];
        final float n4 = method14567[1];
        final float n5 = method14567[2];
        final float n6 = method14567[3];
        Class8154.method26925((float)(this.field20478 + field20803), (float)(this.field20479 + field20803), (float)(this.field20480 - field20803 * 2), (float)(this.field20481 - field20803 * 2), 3.0f, Class6430.method19118(Class265.field1273.field1292, 0.05f * n));
        final ArrayList list = new ArrayList();
        list.add(new Class7202(0.0, 0.0));
        list.add(new Class7202(n3, n4));
        list.add(new Class7202(n5, n6));
        list.add(new Class7202(1.0, 1.0));
        final Class8862 class8862 = new Class8862(1.0f / n2 * 2.0f);
        Class8154.method26888((float)(this.field20478 + n2 * class8862.method31031(list, Math.min(0.8f, this.field20804.method35858()) * 1.25f) + field20803), (float)(this.field20479 - field20803 / 2 + this.field20481), 14.0f, Class6430.method19118(Class265.field1274.field1292, n));
        final List<Class7202> method14568 = class8862.method31032(list);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)(this.field20478 + field20803), (float)(this.field20479 + field20803), 0.0f);
        GL11.glLineWidth(1.0f);
        GL11.glColor4d(0.0, 0.0, 0.0, (double)(0.6f * n));
        GL11.glAlphaFunc(519, 0.0f);
        Class8726.method30011();
        Class8726.method30041();
        Class8726.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
        GL11.glEnable(2848);
        GL11.glBegin(3);
        GL11.glVertex2f(0.0f, n2);
        for (final Class7202 class8863 : method14568) {
            GL11.glVertex2d(class8863.method22096() * n2, (1.0 - class8863.method22097()) * n2);
        }
        GL11.glVertex2f(n2, 0.0f);
        GL11.glEnd();
        GL11.glLineWidth(3.0f);
        GL11.glColor4d(0.0, 0.20000000298023224, 0.4000000059604645, 0.20000000298023224);
        GL11.glBegin(3);
        GL11.glVertex2f(0.0f, n2);
        GL11.glVertex2f((float)(this.field20801.method14272() - field20803 + 5), (float)(this.field20801.method14274() - field20803 + 5));
        GL11.glEnd();
        GL11.glBegin(3);
        GL11.glVertex2f(n2, 0.0f);
        GL11.glVertex2f((float)(this.field20802.method14272() - field20803 + 5), (float)(this.field20802.method14274() - field20803 + 5));
        GL11.glEnd();
        Class8726.method30012();
        Class8726.method30040();
        GL11.glPopMatrix();
        super.method14205(n);
    }
}
