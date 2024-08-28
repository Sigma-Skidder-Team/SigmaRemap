package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.opengl.GL11;

import java.util.List;

public class Class5280 extends Module {
    public Class8853 field23731 = mc.method1554();
    public Class7423 field23732 = new Class7423(0.0F, 0.0F, 0.0F);
    public Class7423 field23733 = new Class7423(0.0F, 0.0F, 0.0F);
    public Class7423 field23734 = new Class7423(0.0F, 0.0F, 0.0F);

    public Class5280() {
        super(ModuleCategory.RENDER, "Projectiles", "Predict the path of a projectile");
        this.method16005(false);
    }

    // $VF: synthetic method
    public static Minecraft method16524() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16525() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16526() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16527() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16528() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16529() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16530() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16531() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16532() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16533() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16534() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16535() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16536() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16537() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16538() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16539() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16540() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16541() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16542() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16543() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16544() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16545() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16546() {
        return mc;
    }

    @EventTarget
    public void method16523(Class4420 var1) {
        if (this.method15996()) {
            if (mc.field1339.method3090() != null) {
                Class2309 var4 = Class2309.method9085(mc.field1339.method3090().method32107());
                if (var4 != null) {
                    float var5 = (float) Math.toRadians(mc.field1339.field5031 - 25.0F);
                    float var6 = (float) Math.toRadians(mc.field1339.field5032);
                    double var7 = 0.2F;
                    double var9 = mc.field1339.field5035.method19675() / 2.0;
                    double var11 = (double) MathHelper.method37764(var5) * var9;
                    double var13 = (double) MathHelper.method37763(var5) * var9;
                    double var15 = mc.field1339.field5048
                            + (mc.field1339.getPosX() - mc.field1339.field5048) * (double) mc.field1284.field40356;
                    double var17 = mc.field1339.field5049
                            + (mc.field1339.getPosY() - mc.field1339.field5049) * (double) mc.field1284.field40356;
                    double var19 = mc.field1339.field5050
                            + (mc.field1339.getPosZ() - mc.field1339.field5050) * (double) mc.field1284.field40356;
                    GL11.glPushMatrix();
                    GL11.glEnable(2848);
                    GL11.glBlendFunc(770, 771);
                    GL11.glEnable(3042);
                    GL11.glDisable(3553);
                    GL11.glDisable(2929);
                    GL11.glEnable(32925);
                    GL11.glDisable(2896);
                    GL11.glShadeModel(7425);
                    GL11.glDepthMask(false);
                    GL11.glLineWidth(10.0F);
                    GL11.glColor4d(0.0, 0.0, 0.0, 0.05F);
                    GL11.glAlphaFunc(519, 0.0F);
                    GL11.glBegin(3);
                    List var21 = var4.method9086();

                    for (int var22 = 0; var22 < var21.size(); var22++) {
                        Class9110 var23 = (Class9110) var21.get(var22);
                        double var24 = var11 - (double) ((float) (var22 + 1) / (float) var21.size()) * var11;
                        double var26 = var13 - (double) ((float) (var22 + 1) / (float) var21.size()) * var13;
                        double var28 = var7 - (double) ((float) (var22 + 1) / (float) var21.size()) * var7;
                        float var30 = (float) Math.min(1, var22);
                        GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.05F * var30);
                        GL11.glVertex3d(
                                var23.method33969() - mc.field1295.method768().method37504().method11320() - var24,
                                var23.method33970() - mc.field1295.method768().method37504().method11321() - var28,
                                var23.method33971() - mc.field1295.method768().method37504().method11322() - var26
                        );
                    }

                    GL11.glEnd();
                    GL11.glLineWidth(2.0F * GuiManager.field41348);
                    GL11.glColor4d(1.0, 1.0, 1.0, 0.75);
                    GL11.glBegin(3);

                    for (int var38 = 0; var38 < var21.size(); var38++) {
                        Class9110 var39 = (Class9110) var21.get(var38);
                        double var40 = var11 - (double) ((float) (var38 + 1) / (float) var21.size()) * var11;
                        double var43 = var13 - (double) ((float) (var38 + 1) / (float) var21.size()) * var13;
                        double var46 = var7 - (double) ((float) (var38 + 1) / (float) var21.size()) * var7;
                        float var48 = (float) Math.min(1, var38);
                        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F * var48);
                        GL11.glVertex3d(
                                var39.method33969() - mc.field1295.method768().method37504().method11320() - var40,
                                var39.method33970() - mc.field1295.method768().method37504().method11321() - var46,
                                var39.method33971() - mc.field1295.method768().method37504().method11322() - var43
                        );
                    }

                    GL11.glEnd();
                    GL11.glDisable(2929);
                    if (var4.field15831 == null) {
                        if (var4.field15832 != null) {
                            double var31 = var4.field15832.field5048
                                    + (var4.field15832.getPosX() - var4.field15832.field5048) * (double) mc.field1284.field40356
                                    - mc.field1295.method768().method37504().method11320();
                            double var41 = var4.field15832.field5049
                                    + (var4.field15832.getPosY() - var4.field15832.field5049) * (double) mc.field1284.field40356
                                    - mc.field1295.method768().method37504().method11321();
                            double var44 = var4.field15832.field5050
                                    + (var4.field15832.getPosZ() - var4.field15832.field5050) * (double) mc.field1284.field40356
                                    - mc.field1295.method768().method37504().method11322();
                            double var47 = var4.field15832.method3429() / 2.0F + 0.2F;
                            double var35 = var4.field15832.method3430() + 0.1F;
                            Class9388 var37 = new Class9388(var31 - var47, var41, var44 - var47, var31 + var47, var41 + var35, var44 + var47);
                            Class3192.method11459(var37, Class5628.method17688(Class1979.field12892.field12910, 0.1F));
                            Class3192.method11461(var37, Class5628.method17688(Class1979.field12892.field12910, 0.1F));
                        }
                    } else {
                        double var49 = var4.field15825 - mc.field1295.method768().method37504().method11320();
                        double var42 = var4.field15826 - mc.field1295.method768().method37504().method11321();
                        double var45 = var4.field15827 - mc.field1295.method768().method37504().method11322();
                        GL11.glPushMatrix();
                        GL11.glTranslated(var49, var42, var45);
                        BlockPos var33 = new BlockPos(0, 0, 0).method8349(((Class8711) var4.field15831).method31424());
                        GL11.glRotatef(
                                45.0F,
                                this.field23732.method23931((float) var33.method8304()),
                                this.field23732.method23932((float) (-var33.getY())),
                                this.field23732.method23933((float) var33.method8306())
                        );
                        GL11.glRotatef(
                                90.0F,
                                this.field23733.method23931((float) var33.method8306()),
                                this.field23733.method23932((float) var33.getY()),
                                this.field23733.method23933((float) (-var33.method8304()))
                        );
                        GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
                        Class9388 var34 = new Class9388(0.0, 0.0, 0.0, 1.0, 0.0, 1.0);
                        Class3192.method11459(var34, Class5628.method17688(Class1979.field12903.field12910, 0.1F));
                        Class3192.method11461(var34, Class5628.method17688(Class1979.field12903.field12910, 0.1F));
                        GL11.glPopMatrix();
                    }

                    GL11.glDisable(2896);
                    GL11.glColor3f(1.0F, 1.0F, 1.0F);
                    GL11.glEnable(2896);
                    GL11.glDisable(3042);
                    GL11.glEnable(3553);
                    GL11.glDisable(32925);
                    GL11.glDisable(2848);
                    GL11.glPopMatrix();
                }
            }
        }
    }
}
