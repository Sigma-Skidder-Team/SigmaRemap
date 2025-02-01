// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render.esps;

import java.util.HashMap;
import com.ibm.icu.text.NumberFormat;

import java.awt.Color;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.lwjgl.opengl.GL11;
import java.util.Map;

public class Class3335 extends Module
{
    private double field15933;
    public static Map<LivingEntity, double[]> field15934;
    public static Map<LivingEntity, double[]> field15935;
    public static final /* synthetic */ boolean field15936;
    
    public Class3335() {
        super(Category.RENDER, "2D Esp", "You know what it is");
        this.addSetting(new BooleanSetting("Show Health", "Shows a health bar", true));
    }
    
    @EventListener
    public void method10551(final Class5739 class5739) {
        if (this.method9906()) {
            this.method10556();
        }
    }
    
    @EventListener
    public void method10552(final Class5734 class5734) {
        if (!this.method9906()) {
            return;
        }
        final boolean method9883 = this.method9914().method9883("Show Invisibles");
        final boolean method9884 = this.method9883("Show Health");
        RenderSystem.method30059();
        for (final Entity class5735 : Class3335.field15934.keySet()) {
            final double[] array = Class3335.field15934.get(class5735);
            final double[] array2 = Class3335.field15935.get(class5735);
            if (array[3] > 0.0 || array[3] <= 1.0) {
                RenderSystem.method30059();
                if ((method9883 || !class5735.method1823()) && class5735 instanceof PlayerEntity && !(class5735 instanceof Class756)) {
                    this.method10557(class5735);
                    try {
                        final float n = (float)array[1];
                        final float n2 = (float)array2[1];
                        final float n3 = n2 - n;
                        float n4 = (float)array[0] - n3 / 4.0f;
                        float n5 = (float)array2[0] + n3 / 4.0f;
                        if (n4 > n5) {
                            n5 = n4;
                            n4 = (float)array2[0] + n3 / 4.0f;
                        }
                        RenderSystem.method30059();
                        RenderSystem.method30063(2.0f, 2.0f, 2.0f);
                        RenderSystem.method30060();
                        GL11.glEnable(3042);
                        GL11.glDisable(3553);
                        int n6 = -65536;
                        if (!Class3335.mc.player.method2747(class5735)) {
                            n6 = -256;
                        }
                        RenderUtil.method26880(n4, n, n5, n2, 2.25, Class8101.method26626(0, 0, 0, 0), n6);
                        RenderUtil.method26880(n4 - 0.5, n - 0.5, n5 + 0.5, n2 + 0.5, 0.9, Class8101.method26624(0, 0), Class8101.method26623(0));
                        RenderUtil.method26880(n4 + 2.5, n + 2.5, n5 - 2.5, n2 - 2.5, 0.9, Class8101.method26624(0, 0), Class8101.method26623(0));
                        RenderUtil.method26880(n4 - 5.0f, n - 1.0f, n4 - 1.0f, n2, 1.0, Class8101.method26624(0, 100), Class8101.method26624(0, 255));
                        final float method9885 = ((PlayerEntity)class5735).method2664();
                        RenderUtil.method26876(n4 - 4.0f, n2 - 1.0f, n4 - 2.0f, n2 + (n - n2) * (method9885 * 5.0f * 0.01f), method10553(new float[] { 0.0f, 0.5f, 1.0f }, new Color[] { Color.RED, Color.YELLOW, Color.GREEN }, method9885 * 5.0f * 0.01f).brighter().getRGB());
                        if ((int)Class6029.method17958(method9885 * 5.0f, 1.0) != 100 && method9884) {
                            RenderSystem.method30059();
                            RenderSystem.method30063(2.0f, 2.0f, 2.0f);
                            new StringBuilder().append((int)Class6029.method17958(method9885 * 5.0f, 1.0)).append("HP").toString();
                            RenderSystem.method30060();
                        }
                    }
                    catch (final Exception ex) {}
                }
                RenderSystem.method30060();
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
        GL11.glScalef(1.0f, 1.0f, 1.0f);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.method30060();
    }
    
    public static Color method10553(final float[] array, final Color[] array2, final float n) {
        if (array == null) {
            throw new IllegalArgumentException("Fractions can't be null");
        }
        if (array2 == null) {
            throw new IllegalArgumentException("Colours can't be null");
        }
        if (array.length != array2.length) {
            throw new IllegalArgumentException("Fractions and colours must have equal number of elements");
        }
        final int[] method10554 = method10554(array, n);
        if (method10554[0] >= 0) {
            if (method10554[0] < array.length) {
                if (method10554[1] >= 0) {
                    if (method10554[1] < array.length) {
                        final float[] array3 = { array[method10554[0]], array[method10554[1]] };
                        final Color[] array4 = { array2[method10554[0]], array2[method10554[1]] };
                        return method10555(array4[0], array4[1], 1.0f - (n - array3[0]) / (array3[1] - array3[0]));
                    }
                }
            }
        }
        return array2[0];
    }
    
    public static int[] method10554(final float[] array, final float n) {
        final int[] array2 = new int[2];
        int n2;
        for (n2 = 0; n2 < array.length && array[n2] <= n; ++n2) {}
        if (n2 >= array.length) {
            n2 = array.length - 1;
        }
        array2[0] = n2 - 1;
        array2[1] = n2;
        return array2;
    }
    
    public static Color method10555(final Color color, final Color color2, final double n) {
        final float n2 = (float)n;
        final float n3 = 1.0f - n2;
        final float[] compArray = new float[3];
        final float[] compArray2 = new float[3];
        color.getColorComponents(compArray);
        color2.getColorComponents(compArray2);
        float r = compArray[0] * n2 + compArray2[0] * n3;
        float g = compArray[1] * n2 + compArray2[1] * n3;
        float b = compArray[2] * n2 + compArray2[2] * n3;
        if (r < 0.0f) {
            r = 0.0f;
        }
        else if (r > 255.0f) {
            r = 255.0f;
        }
        if (g < 0.0f) {
            g = 0.0f;
        }
        else if (g > 255.0f) {
            g = 255.0f;
        }
        if (b < 0.0f) {
            b = 0.0f;
        }
        else if (b > 255.0f) {
            b = 255.0f;
        }
        Color color3 = null;
        try {
            color3 = new Color(r, g, b);
        }
        catch (final IllegalArgumentException ex) {
            final NumberFormat numberInstance = NumberFormat.getNumberInstance();
            System.out.println(numberInstance.format((double)r) + "; " + numberInstance.format((double)g) + "; " + numberInstance.format((double)b));
            ex.printStackTrace();
        }
        return color3;
    }
    
    private void method10556() {
        final double method16760 = Class3335.mc.field4644.method5833().method18161().getX();
        final double method16761 = Class3335.mc.field4644.method5833().method18161().getY();
        final double method16762 = Class3335.mc.field4644.method5833().method18161().getZ();
        Class3335.field15934.clear();
        Class3335.field15935.clear();
        final float field26528 = Class3335.mc.timer.field26528;
        for (final PlayerEntity next : Class3335.mc.world.method6806()) {
            if (!(next instanceof PlayerEntity)) {
                continue;
            }
            if (next instanceof Class756) {
                continue;
            }
            final PlayerEntity playerEntity = next;
            final double n = playerEntity.lastTickPosY + (playerEntity.posY - playerEntity.lastTickPosY) * field26528 - method16761;
            final double n2 = playerEntity.lastTickPosX + (playerEntity.posX + 10.0 - (playerEntity.lastTickPosX + 10.0)) * field26528 - method16760;
            final double n3 = playerEntity.lastTickPosZ + (playerEntity.posZ + 10.0 - (playerEntity.lastTickPosZ + 10.0)) * field26528 - method16762;
            final double n4 = n + (playerEntity.method1931() + 0.2);
            final double[] method16763 = RenderUtil.method26931(n2, n4, n3);
            final double abs = Math.abs(RenderUtil.method26931(n2, n4 + 1.0, n3)[1] - RenderUtil.method26931(n2, n4, n3)[1]);
            if (!Class3335.field15936 && method16763 == null) {
                throw new AssertionError();
            }
            if (method16763[2] < 0.0) {
                continue;
            }
            if (method16763[2] >= 1.0) {
                continue;
            }
            Class3335.field15934.put(playerEntity, new double[] { method16763[0], method16763[1], abs, method16763[2] });
            final double n5 = playerEntity.lastTickPosY + (playerEntity.posY - 2.2 - (playerEntity.lastTickPosY - 2.2)) * field26528 - method16761;
            Class3335.field15935.put(playerEntity, new double[] { RenderUtil.method26931(n2, n5, n3)[0], RenderUtil.method26931(n2, n5, n3)[1], abs, RenderUtil.method26931(n2, n5, n3)[2] });
        }
    }
    
    private void method10557(final Entity class399) {
        final float n = 1.0f;
        final float n2 = (float)(n * (Class3335.mc.gameSettings.field23471 / Class3335.mc.gameSettings.field23471));
        if (this.field15933 == 0.0 || Double.isNaN(this.field15933)) {
            this.field15933 = n2;
        }
        this.field15933 += (n2 - this.field15933) / (Minecraft.method5338() * 0.7);
        final float n3 = (float)(n * this.field15933);
        RenderSystem.method30063(n3, n3, n3);
    }
    
    static {
        field15936 = !Class3335.class.desiredAssertionStatus();
        Class3335.field15934 = new HashMap<LivingEntity, double[]>();
        Class3335.field15935 = new HashMap<LivingEntity, double[]>();
    }
}
