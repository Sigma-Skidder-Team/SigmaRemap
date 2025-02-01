// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render.esps;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.ColorSetting;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class Class3242 extends Module
{
    public boolean field15730;
    public IRenderTypeBuffer.Impl field15731;
    
    public Class3242() {
        super(Category.RENDER, "Fill", "Fill ESP");
        this.field15730 = false;
        this.field15731 = IRenderTypeBuffer.method25213(Class3242.mc.method5333().field16262, new BufferBuilder(256));
        this.addSetting(new ColorSetting("Color", "The tracers color", ClientColors.LIGHT_GREYISH_BLUE.color));
    }
    
    @EventListener
    private void method10239(final Class5739 class5739) {
        if (!this.method9906()) {
            return;
        }
        if (Class3242.mc.player != null && Class3242.mc.world != null) {
            this.method10245();
            this.method10240();
            this.method10246();
            this.field15731.finish();
        }
    }
    
    private void method10240() {
        this.field15730 = true;
        final int method9885 = this.method9885("Color");
        final float n = (method9885 >> 24 & 0xFF) / 255.0f;
        final float n2 = (method9885 >> 16 & 0xFF) / 255.0f;
        final float n3 = (method9885 >> 8 & 0xFF) / 255.0f;
        final float n4 = (method9885 & 0xFF) / 255.0f;
        GL11.glEnable(2896);
        GL11.glLightModelfv(2899, new float[] { n2, n3, n4, n });
        RenderSystem.method30001();
        GL11.glDepthFunc(519);
        GL11.glEnable(2929);
        GL11.glEnable(32823);
        GL11.glLineWidth(2.0f);
        GL11.glPolygonMode(1032, 6914);
        GL11.glDisable(3553);
        GL11.glEnable(3008);
        GL11.glEnable(2896);
        GL11.glPolygonOffset(-30000.0f, 1.0f);
        for (final Entity class399 : Class3242.mc.world.method6806()) {
            if (!this.method10244(class399)) {
                continue;
            }
            GL11.glPushMatrix();
            final Vec3d method9886 = Class3242.mc.field4644.method5833().method18161();
            final double method9887 = method9886.getX();
            final double method9888 = method9886.getY();
            final double method9889 = method9886.getZ();
            final MatrixStack class400 = new MatrixStack();
            final boolean field23420 = Class3242.mc.gameSettings.field23420;
            RenderSystem.method30002();
            RenderSystem.method30068(0.0f, 0.0f, 1.0f, 0.5f);
            RenderSystem.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
            RenderSystem.enableBlend();
            Class3242.mc.gameSettings.field23420 = false;
            this.method10242(class399, method9887, method9888, method9889, Class3242.mc.timer.field26528, class400, this.field15731);
            Class3242.mc.gameSettings.field23420 = field23420;
            GL11.glPopMatrix();
        }
        this.field15731.method25217(Class6332.method18767(Class1774.field9853));
        this.field15731.method25217(Class6332.method18768(Class1774.field9853));
        this.field15731.method25217(Class6332.method18770(Class1774.field9853));
        this.field15731.method25217(Class6332.method18774(Class1774.field9853));
        this.field15731.method25217(Class6332.method18791());
        this.field15731.finish();
        GL11.glDepthFunc(515);
        GL11.glPolygonMode(1032, 6914);
        GL11.glDisable(32823);
        this.field15730 = false;
    }
    
    @EventListener
    public void method10241(final Class5749 class5749) {
        if (this.method9906()) {
            if (this.field15730) {
                if (class5749.method17056() instanceof PlayerEntity) {
                    class5749.method16961(true);
                }
            }
        }
    }
    
    public void method10242(final Entity class399, final double n, final double n2, final double n3, final float n4, final MatrixStack class400, final IRenderTypeBuffer class401) {
        Class3242.mc.field4636.field9290.method28706(class399, MathHelper.lerp(n4, class399.lastTickPosX, class399.getPosX()) - n, MathHelper.lerp(n4, class399.lastTickPosY, class399.getPosY()) - n2, MathHelper.lerp(n4, class399.lastTickPosZ, class399.getPosZ()) - n3, MathHelper.method35700(n4, class399.prevRotationYaw, class399.rotationYaw), n4, class400, class401, 255);
    }
    
    @EventListener
    public void method10243(final Class5729 class5729) {
        if (this.method9906()) {
            if (this.field15730) {
                class5729.method17020(false);
            }
        }
    }
    
    private boolean method10244(final Entity class399) {
        return class399 instanceof LivingEntity && class399 instanceof PlayerEntity && !(class399 instanceof Class756) && !Client.method35173().method35191().method31751(class399);
    }
    
    private void method10245() {
        GL11.glLineWidth(3.0f);
        GL11.glPointSize(3.0f);
        GL11.glEnable(2832);
        GL11.glEnable(2848);
        GL11.glEnable(3042);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
        GL11.glDisable(3553);
        GL11.glDisable(2903);
        GL11.glDisable(2929);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        Class3242.mc.field4644.field9396.method1417();
    }
    
    private void method10246() {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glEnable(2903);
        RenderSystem.method30084(33986, 240.0f, 240.0f);
        Class7777.method24931();
        final Class1663 method5290 = Class3242.mc.method5290();
        Class3242.mc.method5290();
        method5290.method5849(Class1663.field9428);
        Class3242.mc.field4644.field9396.method1418();
        GL11.glLightModelfv(2899, new float[] { 0.4f, 0.4f, 0.4f, 1.0f });
    }
}
