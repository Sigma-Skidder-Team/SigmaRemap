package com.mentalfrostbyte.jello.module.impl.render.classic.esp;

import com.ibm.icu.text.NumberFormat;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender2D;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import org.lwjgl.opengl.GL11;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class TwoDESP extends Module {
    public static final boolean field23730 = !TwoDESP.class.desiredAssertionStatus();
    public static Map<LivingEntity, double[]> field23728 = new HashMap<LivingEntity, double[]>();
    public static Map<LivingEntity, double[]> field23729 = new HashMap<LivingEntity, double[]>();
    private double field23727;

    public TwoDESP() {
        super(ModuleCategory.RENDER, "2D Esp", "You know what it is");
        this.registerSetting(new BooleanSetting("Show Health", "Shows a health bar", true));
    }

    public static Color method16516(float[] var0, Color[] var1, float var2) {
        Object var5 = null;
        if (var0 == null) {
            throw new IllegalArgumentException("Fractions can't be null");
        } else if (var1 == null) {
            throw new IllegalArgumentException("Colours can't be null");
        } else if (var0.length != var1.length) {
            throw new IllegalArgumentException("Fractions and colours must have equal number of elements");
        } else {
            int[] var6 = method16517(var0, var2);
            if (var6[0] >= 0 && var6[0] < var0.length && var6[1] >= 0 && var6[1] < var0.length) {
                float[] var7 = new float[]{var0[var6[0]], var0[var6[1]]};
                Color[] var8 = new Color[]{var1[var6[0]], var1[var6[1]]};
                float var9 = var7[1] - var7[0];
                float var10 = var2 - var7[0];
                float var11 = var10 / var9;
                return method16518(var8[0], var8[1], 1.0F - var11);
            } else {
                return var1[0];
            }
        }
    }

    public static int[] method16517(float[] var0, float var1) {
        int[] var4 = new int[2];
        int var5 = 0;

        while (var5 < var0.length && var0[var5] <= var1) {
            var5++;
        }

        if (var5 >= var0.length) {
            var5 = var0.length - 1;
        }

        var4[0] = var5 - 1;
        var4[1] = var5;
        return var4;
    }

    public static Color method16518(Color var0, Color var1, double var2) {
        float var6 = (float) var2;
        float var7 = 1.0F - var6;
        float[] var8 = new float[3];
        float[] var9 = new float[3];
        var0.getColorComponents(var8);
        var1.getColorComponents(var9);
        float var10 = var8[0] * var6 + var9[0] * var7;
        float var11 = var8[1] * var6 + var9[1] * var7;
        float var12 = var8[2] * var6 + var9[2] * var7;
        if (var10 < 0.0F) {
            var10 = 0.0F;
        } else if (var10 > 255.0F) {
            var10 = 255.0F;
        }

        if (var11 < 0.0F) {
            var11 = 0.0F;
        } else if (var11 > 255.0F) {
            var11 = 255.0F;
        }

        if (var12 < 0.0F) {
            var12 = 0.0F;
        } else if (var12 > 255.0F) {
            var12 = 255.0F;
        }

        Color var13 = null;

        try {
            var13 = new Color(var10, var11, var12);
        } catch (IllegalArgumentException var16) {
            NumberFormat var15 = NumberFormat.getNumberInstance();
            System.out.println(var15.format(var10) + "; " + var15.format(var11) + "; " + var15.format(var12));
            var16.printStackTrace();
        }

        return var13;
    }

    @EventTarget
    public void method16514(Render3DEvent var1) {
        if (this.isEnabled()) {
            this.method16519();
        }
    }

    @EventTarget
    public void method16515(EventRender2D var1) {
        if (this.isEnabled()) {
            boolean var4 = this.access().getBooleanValueFromSetttingName("Show Invisibles");
            boolean var5 = this.getBooleanValueFromSetttingName("Show Health");
            RenderSystem.pushMatrix();

            for (Entity var7 : field23728.keySet()) {
                double[] var8 = field23728.get(var7);
                double[] var9 = field23729.get(var7);
                if (var8[3] > 0.0 || var8[3] <= 1.0) {
                    RenderSystem.pushMatrix();
                    if ((var4 || !var7.isInvisible()) && var7 instanceof PlayerEntity && !(var7 instanceof ClientPlayerEntity)) {
                        this.method16520(var7);

                        try {
                            float var10 = (float) var8[1];
                            float var11 = (float) var9[1];
                            float var12 = var11 - var10;
                            float var13 = (float) var8[0] - var12 / 4.0F;
                            float var14 = (float) var9[0] + var12 / 4.0F;
                            if (var13 > var14) {
                                var14 = var13;
                                var13 = (float) var9[0] + var12 / 4.0F;
                            }

                            RenderSystem.pushMatrix();
                            RenderSystem.scalef(2.0F, 2.0F, 2.0F);
                            RenderSystem.popMatrix();
                            GL11.glEnable(3042);
                            GL11.glDisable(3553);
                            int var15 = -65536;
                            if (!mc.player.canEntityBeSeen(var7)) {
                                var15 = -256;
                            }

                            RenderUtil.method11430(var13, var10, var14, var11, 2.25, Class7211.method22645(0, 0, 0, 0), var15);
                            RenderUtil.method11430(
                                    (double) var13 - 0.5,
                                    (double) var10 - 0.5,
                                    (double) var14 + 0.5,
                                    (double) var11 + 0.5,
                                    0.9,
                                    Class7211.method22643(0, 0),
                                    Class7211.method22642(0)
                            );
                            RenderUtil.method11430(
                                    (double) var13 + 2.5,
                                    (double) var10 + 2.5,
                                    (double) var14 - 2.5,
                                    (double) var11 - 2.5,
                                    0.9,
                                    Class7211.method22643(0, 0),
                                    Class7211.method22642(0)
                            );
                            RenderUtil.method11430(
                                    var13 - 5.0F,
                                    var10 - 1.0F,
                                    var13 - 1.0F,
                                    var11,
                                    1.0,
                                    Class7211.method22643(0, 100),
                                    Class7211.method22643(0, 255)
                            );
                            float var16 = ((PlayerEntity) var7).getHealth();
                            float[] var17 = new float[]{0.0F, 0.5F, 1.0F};
                            Color[] var18 = new Color[]{Color.RED, Color.YELLOW, Color.GREEN};
                            float var19 = var16 * 5.0F * 0.01F;
                            Color var20 = method16516(var17, var18, var19).brighter();
                            float var21 = var11 + (var10 - var11) * var16 * 5.0F * 0.01F;
                            RenderUtil.method11426(var13 - 4.0F, var11 - 1.0F, var13 - 2.0F, var21, var20.getRGB());
                            if ((int) Class9784.method38568(var16 * 5.0F, 1.0) != 100 && var5) {
                                RenderSystem.pushMatrix();
                                RenderSystem.scalef(2.0F, 2.0F, 2.0F);
                                String var22 = (int) Class9784.method38568(var16 * 5.0F, 1.0) + "HP";
                                RenderSystem.popMatrix();
                            }
                        } catch (Exception var23) {
                        }
                    }

                    RenderSystem.popMatrix();
                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                }
            }

            GL11.glScalef(1.0F, 1.0F, 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.popMatrix();
        }
    }

    private void method16519() {
        double var3 = mc.gameRenderer.getActiveRenderInfo().getPos().getX();
        double var5 = mc.gameRenderer.getActiveRenderInfo().getPos().getY();
        double var7 = mc.gameRenderer.getActiveRenderInfo().getPos().getZ();
        field23728.clear();
        field23729.clear();
        float var9 = mc.timer.renderPartialTicks;

        for (Object var11 : mc.world.getEntities()) {
            if (var11 instanceof PlayerEntity && !(var11 instanceof ClientPlayerEntity)) {
                PlayerEntity var12 = (PlayerEntity) var11;
                double var13 = var12.lastTickPosY + (var12.getPosY() - var12.lastTickPosY) * (double) var9 - var5;
                double var15 = var12.lastTickPosX + (var12.getPosX() + 10.0 - (var12.lastTickPosX + 10.0)) * (double) var9 - var3;
                double var17 = var12.lastTickPosZ + (var12.getPosZ() + 10.0 - (var12.lastTickPosZ + 10.0)) * (double) var9 - var7;
                var13 += (double) var12.getHeight() + 0.2;
                double[] var19 = RenderUtil.method11482(var15, var13, var17);
                double var20 = Math.abs(RenderUtil.method11482(var15, var13 + 1.0, var17)[1] - RenderUtil.method11482(var15, var13, var17)[1]);
                if (!field23730 && var19 == null) {
                    throw new AssertionError();
                }

                if (var19[2] >= 0.0 && var19[2] < 1.0) {
                    field23728.put(var12, new double[]{var19[0], var19[1], var20, var19[2]});
                    var13 = var12.lastTickPosY + (var12.getPosY() - 2.2 - (var12.lastTickPosY - 2.2)) * (double) var9 - var5;
                    field23729.put(
                            var12,
                            new double[]{
                                    RenderUtil.method11482(var15, var13, var17)[0],
                                    RenderUtil.method11482(var15, var13, var17)[1],
                                    var20,
                                    RenderUtil.method11482(var15, var13, var17)[2]
                            }
                    );
                }
            }
        }
    }

    private void method16520(Entity var1) {
        float var4 = 1.0F;
        float var5 = (float) ((double) var4 * (1.0));
        if (this.field23727 == 0.0 || Double.isNaN(this.field23727)) {
            this.field23727 = var5;
        }

        this.field23727 = this.field23727 + ((double) var5 - this.field23727) / ((double) Minecraft.getFps() * 0.7);
        var4 = (float) ((double) var4 * this.field23727);
        RenderSystem.scalef(var4, var4, var4);
    }
}
