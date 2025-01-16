// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import java.util.ArrayList;
import java.util.List;

public class Class3291 extends Class3167
{
    private List<Vec3d> field15850;
    
    public Class3291() {
        super(Class8013.field32984, "Breadcrumbs", "Shows your taken path");
        this.field15850 = new ArrayList<Vec3d>();
        this.method9881(new Class4999("Fade Out", "Makes distant breadcrumbs fade out", true));
        this.method9881(new Class5003("Color", "The crumbs color", Class265.field1278.field1292));
    }
    
    @Class6753
    public void method10416(final Class5717 class5717) {
        if (this.method9906()) {
            if (class5717.method16972() == 0.0) {
                if (class5717.method16974() == 0.0) {
                    if (class5717.method16976() == 0.0) {
                        return;
                    }
                }
            }
            this.field15850.add(new Vec3d(Class3291.field15514.field4684.posX, Class3291.field15514.field4684.posY, Class3291.field15514.field4684.posZ));
        }
    }
    
    @Class6753
    public void method10417(final Class5732 class5732) {
        if (this.method9906()) {
            this.field15850.clear();
        }
    }
    
    @Override
    public void method9897() {
        this.field15850.clear();
    }
    
    public Vec3d method10418(final Vec3d class5487) {
        return class5487.add(new Vec3d(-Minecraft.method5277().field4644.method5833().method18161().getX(), -Minecraft.method5277().field4644.method5833().method18161().getY(), -Minecraft.method5277().field4644.method5833().method18161().getZ()));
    }
    
    @Class6753
    public void method10419(final Class5739 class5739) {
        if (this.method9906()) {
            final Vec3d class5740 = new Vec3d(Class3291.field15514.field4684.lastTickPosX - (Class3291.field15514.field4684.lastTickPosX - Class3291.field15514.field4684.posX) * Class3291.field15514.method5314(), Class3291.field15514.field4684.lastTickPosY - (Class3291.field15514.field4684.lastTickPosY - Class3291.field15514.field4684.posY) * Class3291.field15514.method5314(), Class3291.field15514.field4684.lastTickPosZ - (Class3291.field15514.field4684.lastTickPosZ - Class3291.field15514.field4684.posZ) * Class3291.field15514.method5314());
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glLineWidth(2.0f);
            GL11.glDisable(3553);
            GL11.glDisable(2929);
            GL11.glDepthMask(false);
            GL11.glColor4fv(Class6430.method19139(Class6430.method19118(this.method9885("Color"), 0.5f)));
            GL11.glBegin(3);
            for (final Vec3d class5741 : this.field15850) {
                final Vec3d method10418 = this.method10418(class5741);
                final double method10419 = class5741.distanceTo(class5740);
                final double n = this.method9883("Fade Out") ? (1.0 - Math.min(1.0, method10419 / 14.0)) : 0.6000000238418579;
                if (method10419 <= 24.0) {
                    GL11.glColor4fv(Class6430.method19139(Class6430.method19118(this.method9885("Color"), (float)n)));
                    GL11.glVertex3d(method10418.x, method10418.y, method10418.z);
                }
            }
            final Vec3d method10420 = this.method10418(class5740);
            GL11.glVertex3d(method10420.x, method10420.y, method10420.z);
            GL11.glEnd();
            GL11.glEnable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(2848);
            GL11.glDepthMask(true);
            GL11.glDisable(3042);
            GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
        }
    }
}
