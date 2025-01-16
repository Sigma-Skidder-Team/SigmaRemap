// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3i;
import org.lwjgl.opengl.GL11;
import java.util.ArrayList;
import java.util.List;

public class Class3299 extends Class3167
{
    private List<Class9407> field15867;
    private Class7617 field15868;
    
    public Class3299() {
        super(Class8013.field32990, "Basic", "Basic click tp");
        this.field15867 = new ArrayList<Class9407>();
        this.field15868 = new Class7617();
    }
    
    @Override
    public void method9879() {
        this.field15867.clear();
    }
    
    @Override
    public void method9897() {
        this.field15867.clear();
    }
    
    @Class6753
    private void method10454(final Class5748 class5748) {
        if (this.method9906() && (Class3299.field15514.field4684.method1809() || !this.method9914().method9883("Sneak"))) {
            if (class5748.method17055() == Class1958.field10672) {
                final BlockRayTraceResult method13697 = Class4609.method13697(Class3299.field15514.field4684.rotationYaw, Class3299.field15514.field4684.rotationPitch, this.method9914().method9886("Maximum range"));
                Vec3i method13698 = null;
                if (method13697 != null) {
                    method13698 = method13697.getPos();
                }
                if (method13698 == null) {
                    return;
                }
                final double n = method13698.getX() + 0.5;
                final double n2 = method13698.getY() + 1;
                final double n3 = method13698.getZ() + 0.5;
                final double n4 = Class3299.field15514.field4684.posX - n;
                final double n5 = Class3299.field15514.field4684.posZ - n3;
                final double a = Class3299.field15514.field4684.posY - n2;
                final double n6 = (Math.sqrt(n4 * n4 + n5 * n5) + Math.abs(a)) / 8.0;
                final double n7 = n4 / n6;
                final double n8 = n5 / n6;
                final double n9 = a / n6;
                double field2395 = Class3299.field15514.field4684.posX;
                double field2396 = Class3299.field15514.field4684.posZ;
                double field2397 = Class3299.field15514.field4684.posY;
                this.field15867.clear();
                this.field15867.add(new Class9407(field2395, field2397, field2396));
                for (int n10 = 0; n10 < n6 - 1.0; ++n10) {
                    field2395 -= n7;
                    field2396 -= n8;
                    field2397 -= n9;
                    final double n11 = 0.3;
                    if (Class3299.field15514.field4683.method6981(Class3299.field15514.field4684, new AxisAlignedBB(field2395 - n11, field2397, field2396 - n11, field2395 + n11, field2397 + 1.9, field2396 + n11)).count() == 0L) {
                        Class3299.field15514.method5269().method17292(new Class4354(field2395, field2397, field2396, true));
                    }
                    this.field15867.add(new Class9407(field2395, field2397, field2396));
                }
                this.field15867.add(new Class9407(n, n2, n3));
                Class3299.field15514.field4684.setPosition(n, n2, n3);
                this.field15868.method23934();
                this.field15868.method23932();
            }
        }
    }
    
    @Class6753
    public void method10455(final Class5739 class5739) {
        if (this.method9906()) {
            if (this.field15867 != null) {
                if (this.field15867.size() != 0) {
                    if (this.field15868.method23935() > 4000L) {
                        this.field15868.method23933();
                        this.field15868.method23934();
                        this.field15867.clear();
                    }
                    GL11.glPushMatrix();
                    GL11.glEnable(2848);
                    GL11.glBlendFunc(770, 771);
                    GL11.glEnable(3042);
                    GL11.glDisable(3553);
                    GL11.glDisable(2929);
                    GL11.glEnable(32925);
                    GL11.glLineWidth(1.4f);
                    GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
                    GL11.glBegin(3);
                    for (final Class9407 class5740 : this.field15867) {
                        GL11.glVertex3d(class5740.method34993() - Class3299.field15514.field4644.method5833().method18161().getX(), class5740.method34994() - Class3299.field15514.field4644.method5833().method18161().getY(), class5740.method34995() - Class3299.field15514.field4644.method5833().method18161().getZ());
                    }
                    GL11.glEnd();
                    for (final Class9407 class5741 : this.field15867) {
                        final double n = class5741.method34993() - Class3299.field15514.field4644.method5833().method18161().getX();
                        final double n2 = class5741.method34995() - Class3299.field15514.field4644.method5833().method18161().getZ();
                        Class8154.method26909(new Class7644(n - 0.30000001192092896, class5741.method34994() - Class3299.field15514.field4644.method5833().method18161().getY(), n2 - 0.30000001192092896, n + 0.30000001192092896, class5741.method34994() - Class3299.field15514.field4644.method5833().method18161().getY() + 1.600000023841858, n2 + 0.30000001192092896), Class6430.method19118(Class265.field1285.field1292, 0.2f));
                    }
                    GL11.glPushMatrix();
                    GL11.glTranslated(Class3299.field15514.field4644.method5833().method18161().getX(), Class3299.field15514.field4644.method5833().method18161().getY(), Class3299.field15514.field4644.method5833().method18161().getZ());
                    GL11.glPopMatrix();
                    GL11.glDisable(3042);
                    GL11.glEnable(3553);
                    GL11.glEnable(2929);
                    GL11.glDisable(32925);
                    GL11.glDisable(2848);
                    GL11.glPopMatrix();
                }
            }
        }
    }
}
