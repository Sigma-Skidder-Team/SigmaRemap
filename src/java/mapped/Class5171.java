package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.opengl.GL11;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Class5171 extends Module {
    private static Map<PlayerEntity, float[][]> field23459 = new HashMap<PlayerEntity, float[][]>();

    public Class5171() {
        super(ModuleCategory.RENDER, "Skeleton", "Skeleton ESP.");
        this.registerSetting(new ColorSetting("Color", "The Skeleton color", ClientColors.LIGHT_GREYISH_BLUE.getColor));
        this.registerSetting(new BooleanSetting("CSGO", "Add a CSGO look.", true));
    }

    @EventTarget
    public void method16088(Render3DEvent var1) {
        if (!this.isEnabled()) {
            ;
        }
    }

    private void method16089(Render3DEvent var1, PlayerEntity var2) {
        Color var5 = new Color(
                !Client.getInstance().getFriendManager().method26998(var2.getName().getString())
                        ? (!var2.getName().getString().equalsIgnoreCase(mc.player.getName().getString()) ? new Color(16775672).getRGB() : -6684775)
                        : -8401409
        );
        if (!var2.method3342()) {
            float[][] var6 = field23459.get(var2);
            if (var6 != null && var2.isAlive() && var2 != mc.player && !var2.isSleeping()) {
                GL11.glPushMatrix();
                GL11.glLineWidth(2.0F);
                GL11.glColor4f((float) (var5.getRed() / 255), (float) (var5.getGreen() / 255), (float) (var5.getBlue() / 255), 1.0F);
                Class8472 var7 = this.method16090(var1, var2);
                double var8 = var7.method29876() - mc.getRenderManager().field40017.method37504().field18048;
                double var10 = var7.method29877() - mc.getRenderManager().field40017.method37504().field18049;
                double var12 = var7.method29878() - mc.getRenderManager().field40017.method37504().field18050;
                GL11.glTranslated(var8, var10, var12);
                float var14 = var2.field4966 + (var2.field4965 - var2.field4966) * mc.getRenderPartialTicks();
                GL11.glRotatef(-var14, 0.0F, 1.0F, 0.0F);
                GL11.glTranslated(0.0, 0.0, !var2.method3331() ? 0.0 : -0.235);
                float var15 = !var2.method3331() ? 0.75F : 0.6F;
                GL11.glPushMatrix();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glTranslated(-0.125, (double) var15, 0.0);
                if (var6[3][0] != 0.0F) {
                    GL11.glRotatef(var6[3][0] * (180.0F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
                }

                if (var6[3][1] != 0.0F) {
                    GL11.glRotatef(var6[3][1] * (180.0F / (float) Math.PI), 0.0F, 1.0F, 0.0F);
                }

                if (var6[3][2] != 0.0F) {
                    GL11.glRotatef(var6[3][2] * (180.0F / (float) Math.PI), 0.0F, 0.0F, 1.0F);
                }

                GL11.glBegin(3);
                GL11.glVertex3d(0.0, 0.0, 0.0);
                GL11.glVertex3d(0.0, (double) (-var15), 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glTranslated(0.125, (double) var15, 0.0);
                if (var6[4][0] != 0.0F) {
                    GL11.glRotatef(var6[4][0] * (180.0F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
                }

                if (var6[4][1] != 0.0F) {
                    GL11.glRotatef(var6[4][1] * (180.0F / (float) Math.PI), 0.0F, 1.0F, 0.0F);
                }

                if (var6[4][2] != 0.0F) {
                    GL11.glRotatef(var6[4][2] * (180.0F / (float) Math.PI), 0.0F, 0.0F, 1.0F);
                }

                GL11.glBegin(3);
                GL11.glVertex3d(0.0, 0.0, 0.0);
                GL11.glVertex3d(0.0, (double) (-var15), 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glTranslated(0.0, 0.0, !var2.method3331() ? 0.0 : 0.25);
                GL11.glPushMatrix();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glTranslated(0.0, !var2.method3331() ? 0.0 : -0.05, !var2.method3331() ? 0.0 : -0.01725);
                GL11.glPushMatrix();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glTranslated(-0.375, (double) var15 + 0.55, 0.0);
                if (var6[1][0] != 0.0F) {
                    GL11.glRotatef(var6[1][0] * (180.0F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
                }

                if (var6[1][1] != 0.0F) {
                    GL11.glRotatef(var6[1][1] * (180.0F / (float) Math.PI), 0.0F, 1.0F, 0.0F);
                }

                if (var6[1][2] != 0.0F) {
                    GL11.glRotatef(-var6[1][2] * (180.0F / (float) Math.PI), 0.0F, 0.0F, 1.0F);
                }

                GL11.glBegin(3);
                GL11.glVertex3d(0.0, 0.0, 0.0);
                GL11.glVertex3d(0.0, -0.5, 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glTranslated(0.375, (double) var15 + 0.55, 0.0);
                if (var6[2][0] != 0.0F) {
                    GL11.glRotatef(var6[2][0] * (180.0F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
                }

                if (var6[2][1] != 0.0F) {
                    GL11.glRotatef(var6[2][1] * (180.0F / (float) Math.PI), 0.0F, 1.0F, 0.0F);
                }

                if (var6[2][2] != 0.0F) {
                    GL11.glRotatef(-var6[2][2] * (180.0F / (float) Math.PI), 0.0F, 0.0F, 1.0F);
                }

                GL11.glBegin(3);
                GL11.glVertex3d(0.0, 0.0, 0.0);
                GL11.glVertex3d(0.0, -0.5, 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glRotatef(var14 - var2.field4967, 0.0F, 1.0F, 0.0F);
                GL11.glPushMatrix();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glTranslated(0.0, (double) var15 + 0.55, 0.0);
                if (var6[0][0] != 0.0F) {
                    GL11.glRotatef(var6[0][0] * (180.0F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
                }

                GL11.glBegin(3);
                GL11.glVertex3d(0.0, 0.0, 0.0);
                GL11.glVertex3d(0.0, 0.3, 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glPopMatrix();
                GL11.glRotatef(!var2.method3331() ? 0.0F : 25.0F, 1.0F, 0.0F, 0.0F);
                GL11.glTranslated(0.0, !var2.method3331() ? 0.0 : -0.16175, !var2.method3331() ? 0.0 : -0.48025);
                GL11.glPushMatrix();
                GL11.glTranslated(0.0, (double) var15, 0.0);
                GL11.glBegin(3);
                GL11.glVertex3d(-0.125, 0.0, 0.0);
                GL11.glVertex3d(0.125, 0.0, 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glTranslated(0.0, (double) var15, 0.0);
                GL11.glBegin(3);
                GL11.glVertex3d(0.0, 0.0, 0.0);
                GL11.glVertex3d(0.0, 0.55, 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glTranslated(0.0, (double) var15 + 0.55, 0.0);
                GL11.glBegin(3);
                GL11.glVertex3d(-0.375, 0.0, 0.0);
                GL11.glVertex3d(0.375, 0.0, 0.0);
                GL11.glEnd();
                GL11.glPopMatrix();
                GL11.glPopMatrix();
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    private Class8472 method16090(Render3DEvent var1, PlayerEntity var2) {
        float var5 = mc.getRenderPartialTicks();
        double var6 = var2.lastTickPosX + (var2.getPosX() - var2.lastTickPosX) * (double) var5;
        double var8 = var2.lastTickPosY + (var2.getPosY() - var2.lastTickPosY) * (double) var5;
        double var10 = var2.lastTickPosZ + (var2.getPosZ() - var2.lastTickPosZ) * (double) var5;
        return new Class8472(var6, var8, var10);
    }

    public static void method16091(PlayerEntity var0, Class2894<PlayerEntity> var1) {
        field23459.put(
                var0,
                new float[][]{
                        {var1.field17432.field31035, var1.field17432.field31036, var1.field17432.field31037},
                        {var1.field17435.field31035, var1.field17435.field31036, var1.field17435.field31037},
                        {var1.field17436.field31035, var1.field17436.field31036, var1.field17436.field31037},
                        {var1.field17437.field31035, var1.field17437.field31036, var1.field17437.field31037},
                        {var1.field17438.field31035, var1.field17438.field31036, var1.field17438.field31037}
                }
        );
    }

    private boolean method16092(PlayerEntity var1) {
        return !mc.world.method6870().contains(var1);
    }

    private void method16093(boolean var1) {
        if (!var1) {
            GL11.glDisable(3042);
            GL11.glDisable(2848);
            GL11.glEnable(2929);
            GL11.glEnable(3553);
            GL11.glPopMatrix();
        } else {
            GL11.glPopMatrix();
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glDisable(2929);
            GL11.glDisable(3553);
            GL11.glBlendFunc(770, 771);
            GL11.glHint(3154, 4354);
        }

        GL11.glDepthMask(var1);
    }

    private int method16094(Class880 var1) {
        float var4 = var1.getHealth();
        float var5 = var1.method3075();
        float var6 = Math.max(0.0F, Math.min(var4, var5) / var5);
        return Color.HSBtoRGB(var6 / 3.0F, 1.0F, 1.0F) | 0xFF000000;
    }
}
