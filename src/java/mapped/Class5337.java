package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.opengl.GL11;

public class Class5337 extends Class5325 {
    public Class5337() {
        super(ModuleCategory.MOVEMENT, "ClickTP", "TP's you when you click", new Class5236(), new Class5174());
        this.registerSetting(new BooleanSetting("Sneak", "Allows teleport only when sneaking", true));
        this.registerSetting(new BooleanSetting("Auto Disable", "Disable ClickTP after teleporting", true));
        this.registerSetting(new Class6009<Float>("Maximum range", "Maximum range of the teleport", 100.0F, Float.class, 10.0F, 300.0F, 1.0F));
    }

    @EventTarget
    public void method16752(Class4420 var1) {
        if (this.method15996() && (mc.player.method3331() || !this.method15974("Sneak"))) {
            BlockRayTraceResult var4 = Class9217.method34567(mc.player.field5031, mc.player.field5032, this.method15977("Maximum range"));
            BlockPos var5 = null;
            if (var4 != null) {
                var5 = var4.getPos();
            }

            this.method16754(
                    this.method16753(),
                    (double) var5.getX() + 0.5 - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11320(),
                    (double) (var5.getY() + 1) - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11321(),
                    (double) var5.getZ() + 0.5 - Minecraft.getInstance().gameRenderer.getActiveRenderInfo().method37504().method11322()
            );
        }
    }

    private double method16753() {
        return MathHelper.sin((float) Math.toRadians(90.0F - mc.player.field5032)) * 10.0F;
    }

    private void method16754(double var1, double var3, double var5, double var7) {
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glPushMatrix();
        GL11.glTranslated(var3, var5, var7);
        GL11.glRotatef((float) (mc.player.field5055 % 90 * 4), 0.0F, 1.0F, 0.0F);
        this.method16756();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }

    private void method16755(float var1) {
        GL11.glBegin(6);

        for (int var4 = 0; var4 < 360; var4++) {
            double var5 = (double) var4 * Math.PI / 180.0;
            GL11.glVertex2d(Math.cos(var5) * (double) var1, Math.sin(var5) * (double) var1);
        }

        GL11.glEnd();
    }

    private void method16756() {
        for (int var3 = 0; var3 <= 270; var3 += 90) {
            GL11.glPushMatrix();
            GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
            this.method16757(77.0F, (float) (177 + var3 / 10), (float) (206 + var3 / 10));
            GL11.glPopMatrix();
        }

        for (int var4 = 0; var4 <= 270; var4 += 90) {
            GL11.glPushMatrix();
            GL11.glRotatef(var4, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            this.method16757(77.0F, (float) (177 + var4 / 10), (float) (206 + var4 / 10));
            GL11.glPopMatrix();
        }
    }

    private void method16757(float var1, float var2, float var3) {
        GL11.glColor3f(var1 / 255.0F, var2 / 255.0F, var3 / 255.0F);
        GL11.glTranslatef(0.0F, 0.0F, 0.3F);
        GL11.glNormal3f(0.0F, 0.0F, 1.0F);
        GL11.glRotated(-37.0, 1.0, 0.0, 0.0);
        GL11.glBegin(6);
        GL11.glVertex2f(0.0F, 0.4985F);
        GL11.glVertex2f(-0.3F, 0.0F);
        GL11.glVertex2f(0.3F, 0.0F);
        GL11.glEnd();
    }
}
