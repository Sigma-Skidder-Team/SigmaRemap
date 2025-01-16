// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;
import org.lwjgl.opengl.GL11;

public class Class3258 extends Class3247
{
    public Class3258() {
        super(Class8013.field32990, "ClickTP", "TP's you when you click", new Class3167[] { new Class3299(), new Class3283() });
        this.method9881(new Class4999("Sneak", "Allows teleport only when sneaking", true));
        this.method9881(new Class4996("Maximum range", "Maximum range of the teleport", 100.0f, Float.class, 10.0f, 300.0f, 1.0f));
    }
    
    @Class6753
    public void method10272(final Class5739 class5739) {
        if (this.method9906() && (Class3258.field15514.field4684.method1809() || !this.method9883("Sneak"))) {
            final BlockRayTraceResult method13697 = Class4609.method13697(Class3258.field15514.field4684.rotationYaw, Class3258.field15514.field4684.rotationPitch, this.method9886("Maximum range"));
            Vec3i method13698 = null;
            if (method13697 != null) {
                method13698 = method13697.getPos();
            }
            this.method10274(this.method10273(), method13698.getX() + 0.5 - Class869.method5277().field4644.method5833().method18161().getX(), method13698.getY() + 1 - Class869.method5277().field4644.method5833().method18161().getY(), method13698.getZ() + 0.5 - Class869.method5277().field4644.method5833().method18161().getZ());
        }
    }
    
    private double method10273() {
        return MathHelper.sin((float)Math.toRadians(90.0f - Class3258.field15514.field4684.rotationPitch)) * 10.0f;
    }
    
    private void method10274(final double n, final double n2, final double n3, final double n4) {
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glPushMatrix();
        GL11.glTranslated(n2, n3, n4);
        GL11.glRotatef((float)(Class3258.field15514.field4684.ticksExisted % 90 * 4), 0.0f, 1.0f, 0.0f);
        this.method10276();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }
    
    private void method10275(final float n) {
        GL11.glBegin(6);
        for (int i = 0; i < 360; ++i) {
            final double n2 = i * 3.141592653589793 / 180.0;
            GL11.glVertex2d(Math.cos(n2) * n, Math.sin(n2) * n);
        }
        GL11.glEnd();
    }
    
    private void method10276() {
        for (int i = 0; i <= 270; i += 90) {
            GL11.glPushMatrix();
            GL11.glRotatef((float)i, 0.0f, 1.0f, 0.0f);
            this.method10277(77.0f, (float)(177 + i / 10), (float)(206 + i / 10));
            GL11.glPopMatrix();
        }
        for (int j = 0; j <= 270; j += 90) {
            GL11.glPushMatrix();
            GL11.glRotatef((float)j, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
            this.method10277(77.0f, (float)(177 + j / 10), (float)(206 + j / 10));
            GL11.glPopMatrix();
        }
    }
    
    private void method10277(final float n, final float n2, final float n3) {
        GL11.glColor3f(n / 255.0f, n2 / 255.0f, n3 / 255.0f);
        GL11.glTranslatef(0.0f, 0.0f, 0.3f);
        GL11.glNormal3f(0.0f, 0.0f, 1.0f);
        GL11.glRotated(-37.0, 1.0, 0.0, 0.0);
        GL11.glBegin(6);
        GL11.glVertex2f(0.0f, 0.4985f);
        GL11.glVertex2f(-0.3f, 0.0f);
        GL11.glVertex2f(0.3f, 0.0f);
        GL11.glEnd();
    }
}
