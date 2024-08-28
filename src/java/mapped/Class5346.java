package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4418;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Class5346 extends Module {
    private final List<Vector3d> field23896 = new ArrayList<Vector3d>();

    public Class5346() {
        super(ModuleCategory.RENDER, "Breadcrumbs", "Shows your taken path");
        this.method15972(new Class6004("Fade Out", "Makes distant breadcrumbs fade out", true));
        this.method15972(new Class6010("Color", "The crumbs color", Class1979.field12896.field12910));
    }

    @EventTarget
    public void method16768(Class4435 var1) {
        if (this.method15996()) {
            if (var1.method13992() != 0.0 || var1.method13994() != 0.0 || var1.method13996() != 0.0) {
                this.field23896.add(new Vector3d(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ()));
            }
        }
    }

    @EventTarget
    public void method16769(Class4418 var1) {
        if (this.method15996()) {
            this.field23896.clear();
        }
    }

    @Override
    public void method15965() {
        this.field23896.clear();
    }

    public Vector3d method16770(Vector3d var1) {
        return var1.method11338(
                new Vector3d(
                        -Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11320(),
                        -Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11321(),
                        -Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11322()
                )
        );
    }

    @EventTarget
    public void method16771(Class4420 var1) {
        if (this.method15996()) {
            Vector3d var4 = new Vector3d(
                    mc.player.field5048 - (mc.player.field5048 - mc.player.getPosX()) * (double) mc.method1562(),
                    mc.player.field5049 - (mc.player.field5049 - mc.player.getPosY()) * (double) mc.method1562(),
                    mc.player.field5050 - (mc.player.field5050 - mc.player.getPosZ()) * (double) mc.method1562()
            );
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glLineWidth(2.0F);
            GL11.glDisable(3553);
            GL11.glDisable(2929);
            GL11.glDepthMask(false);
            GL11.glColor4fv(Class5628.method17709(Class5628.method17688(this.method15976("Color"), 0.5F)));
            GL11.glBegin(3);

            for (Vector3d var6 : this.field23896) {
                Vector3d var7 = this.method16770(var6);
                double var8 = var6.method11341(var4);
                double var10 = !this.method15974("Fade Out") ? 0.6F : 1.0 - Math.min(1.0, var8 / 14.0);
                if (!(var8 > 24.0)) {
                    GL11.glColor4fv(Class5628.method17709(Class5628.method17688(this.method15976("Color"), (float) var10)));
                    GL11.glVertex3d(var7.field18048, var7.field18049, var7.field18050);
                }
            }

            Vector3d var12 = this.method16770(var4);
            GL11.glVertex3d(var12.field18048, var12.field18049, var12.field18050);
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
