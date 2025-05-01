// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;
import java.awt.Color;

public class Class9096
{
    private static String[] field38515;
    private final float field38516;
    private final float field38517;
    public float field38518;
    public float field38519;
    public float field38520;
    private float field38521;
    private float field38522;
    private float field38523;
    private boolean field38524;
    private final float field38525;
    private final Class2316 field38526;
    private float field38527;
    public float field38528;
    public Color field38529;
    
    public Class9096(final float n, final float n2) {
        this.field38525 = 1.0f;
        this.field38526 = new Class2316();
        this.field38527 = 1.0f;
        this.field38529 = new Color(1.0f, 1.0f, 1.0f, 0.5f);
        this.field38516 = n;
        this.field38518 = n;
        this.field38517 = n2;
        this.field38519 = n2;
        this.field38520 = this.field38526.nextInt(1, 4) + this.field38526.nextFloat();
        this.field38522 = 0.5f - this.field38526.nextFloat();
        this.field38523 = 0.5f - this.field38526.nextFloat();
        this.field38527 = this.field38526.nextFloat();
        this.field38522 *= 0.7f;
        this.field38523 *= 0.7f;
    }
    
    public void method32867(final float n) {
        method32868(this.field38518 * 2.0f, this.field38519 * 2.0f, this.field38520 * 2.0f, AllUtils.applyAlpha(this.field38529.getRGB(), n * this.field38527));
    }
    
    public static void method32868(float n, float n2, float n3, final int n4) {
        n3 *= 1.0f;
        n *= 2.0f;
        n2 *= 2.0f;
        final float n5 = 0.19634953f;
        final float n6 = (float)Math.cos(n5);
        final float n7 = (float)Math.sin(n5);
        float n8 = n3;
        float n9 = 0.0f;
        GL11.glEnable(3042);
        GL11.glDisable(3553);
        GL11.glPushMatrix();
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        GL11.glBegin(2);
        GL11.glColor4fv(AllUtils.method19139(n4));
        for (int i = 0; i < 32; ++i) {
            GL11.glVertex2f(n8 + n, n9 + n2);
            GL11.glVertex2f(n, n2);
            final float n10 = n8;
            n8 = n6 * n8 - n7 * n9;
            n9 = n7 * n10 + n6 * n9;
        }
        GL11.glEnd();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glPopMatrix();
        GL11.glDisable(3042);
        GL11.glEnable(3553);
    }
    
    public void method32869() {
        this.field38518 += this.field38522;
        this.field38519 += this.field38523;
        this.field38527 = Math.max(0.0f, Math.min(1.0f, this.field38527 - 0.003f + 5.0E-4f * this.field38520));
    }
}
