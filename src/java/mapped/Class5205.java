package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import org.lwjgl.opengl.GL11;

import java.awt.Color;

public class Class5205 extends Module {
    public Class5205() {
        super(ModuleCategory.RENDER, "Sims", "You know what it is");
    }

    public static void method16214() {
        Color[] var2 = new Color[]{
                new Color(136, 217, 72),
                new Color(124, 189, 72),
                new Color(103, 181, 75),
                new Color(136, 217, 72),
                new Color(124, 189, 72),
                new Color(103, 181, 75),
                new Color(136, 217, 72),
                new Color(103, 181, 75),
                null,
                null
        };

        for (int var3 = 0; var3 <= 315; var3 += 45) {
            GL11.glPushMatrix();
            GL11.glRotatef(var3, 0.0F, 1.0F, 0.0F);
            int var4 = var3 / 45;
            method16215((float) var2[var4].getRed() / 255.0F, (float) var2[var4].getGreen() / 255.0F, (float) var2[var4].getBlue() / 255.0F);
            GL11.glPopMatrix();
        }

        GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);

        for (int var6 = 0; var6 <= 315; var6 += 45) {
            GL11.glPushMatrix();
            GL11.glRotatef(var6, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
            int var7 = var6 / 45;
            Color var5 = new Color(Class5628.method17691(var2[var7].getRGB(), 0.2F), false);
            method16215((float) var5.getRed() / 255.0F, (float) var5.getGreen() / 255.0F, (float) var5.getBlue() / 255.0F);
            GL11.glPopMatrix();
        }
    }

    public static void method16215(float var0, float var1, float var2) {
        GL11.glColor3f(var0, var1, var2);
        GL11.glTranslatef(0.0F, 0.0F, 0.25F);
        GL11.glNormal3f(0.0F, 0.0F, 1.0F);
        GL11.glRotated(-30.0, 1.0, 0.0, 0.0);
        GL11.glBegin(6);
        GL11.glVertex2f(0.0F, 0.5F);
        GL11.glVertex2f(-0.105F, 0.0F);
        GL11.glVertex2f(0.105F, 0.0F);
        GL11.glEnd();
    }

    public static void method16216(double var0, double var2, double var4, Entity var6) {
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glPushMatrix();
        GL11.glTranslated(
                var0 - field23386.field1295.method768().method37504().method11320(),
                var2 - field23386.field1295.method768().method37504().method11321(),
                var4 - field23386.field1295.method768().method37504().method11322()
        );
        GL11.glRotated(var6.field5055 % 180 * 2, 0.0, -1.0, 0.0);
        float var9 = (float) (var6.field5055 % 100 - 50);
        if (var9 < 0.0F) {
            var9 *= -1.0F;
        }

        GL11.glTranslated(0.0, 0.7F + var9 / 500.0F, 0.0);
        method16214();
        GL11.glPopMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(2848);
        GL11.glDepthMask(true);
        GL11.glDisable(3042);
    }

    @EventTarget
    public void method16213(Class4420 var1) {
        if (this.method15996()) {
            for (Entity var5 : Class9217.method34549(Class5628.method17680())) {
                if (var5 != field23386.field1339 && !Client.getInstance().getCombatManager().method29346(var5)) {
                    method16216(
                            var5.field5048 + (var5.getPosX() - var5.field5048) * (double) Minecraft.getInstance().field1284.field40356,
                            var5.field5049 + (double) var5.method3430() + (var5.getPosY() - var5.field5049) * (double) Minecraft.getInstance().field1284.field40356,
                            var5.field5050 + (var5.getPosZ() - var5.field5050) * (double) Minecraft.getInstance().field1284.field40356,
                            var5
                    );
                }
            }
        }
    }
}
