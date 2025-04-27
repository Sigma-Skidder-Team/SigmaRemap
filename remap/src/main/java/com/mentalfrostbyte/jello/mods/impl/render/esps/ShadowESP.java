// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render.esps;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.ColorSetting;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class ShadowESP extends Module
{
    public static Class2092 field16038;
    public IRenderTypeBuffer.Impl field16039;
    
    public ShadowESP() {
        super(Category.RENDER, "Shadow", "Draws a line arround entities");
        this.field16039 = IRenderTypeBuffer.method25213(ShadowESP.mc.method5333().field16262, new BufferBuilder(256));
        this.addSetting(new ColorSetting("Color", "The tracers color", ClientColors.LIGHT_GREYISH_BLUE.color));
    }
    
    @EventListener
    private void method10719(final Custom3DRenderEvent custom3DRenderEvent) {
        if (!this.isEnabled()) {
            return;
        }
        if (ShadowESP.mc.player != null && ShadowESP.mc.world != null) {
            this.method10726();
            RenderUtil.method26926();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.method10721(Class2092.field12099);
            RenderUtil.method26927(Class2225.field13695);
            GL11.glLineWidth(1.0f);
            this.method10720();
            this.method10721(Class2092.field12100);
            RenderSystem.method30000(518, 0.0f);
            RenderSystem.enableAlphaTest();
            GL11.glColor4f(1.0f, 0.0f, 1.0f, 0.1f);
            GL11.glEnable(3042);
            GL11.glDisable(2896);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            RenderUtil.method26928();
            this.method10727();
            this.field16039.finish();
        }
    }
    
    private void method10720() {
        ShadowESP.mc.world.field10072.forEach((p1, class399) -> {
            ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.8f);
            if (this.method10725(class399)) {
                final double field38854 = Class8591.method29094(class399).field38854;
                final double field38855 = Class8591.method29094(class399).field38855;
                final double field38856 = Class8591.method29094(class399).field38856;
                GL11.glPushMatrix();
                GL11.glAlphaFunc(519, 0.0f);
                GL11.glTranslated(field38854, field38855, field38856);
                GL11.glTranslatef(0.0f, class399.method1931(), 0.0f);
                GL11.glTranslatef(0.0f, 0.1f, 0.0f);
                GL11.glRotatef(ShadowESP.mc.field4644.method5833().method18164(), 0.0f, -1.0f, 0.0f);
                GL11.glScalef(-0.11f, -0.11f, -0.11f);
                RenderUtil.method26900(-class399.method1930() * 22.0f, -class399.method1931() * 5.5f, class399.method1930() * 44.0f, class399.method1931() * 21.0f, ClientAssets.shadow, n, false);
                ClientAssets.shout.bind();
                GL11.glPopMatrix();
            }
        });
    }
    
    private void method10721(final Class2092 field16038) {
        GL11.glDepthFunc(519);
        ShadowESP.field16038 = field16038;
        final int method9885 = this.method9885("Color");
        final float n = (method9885 >> 24 & 0xFF) / 255.0f;
        final float n2 = (method9885 >> 16 & 0xFF) / 255.0f;
        final float n3 = (method9885 >> 8 & 0xFF) / 255.0f;
        final float n4 = (method9885 & 0xFF) / 255.0f;
        GL11.glEnable(2896);
        GL11.glLightModelfv(2899, new float[] { n2, n3, n4, n });
        RenderSystem.method30001();
        if (ShadowESP.field16038 == Class2092.field12100) {
            GL11.glEnable(10754);
            GL11.glLineWidth(2.0f);
            GL11.glPolygonMode(1032, 6913);
            GL11.glDisable(3553);
            GL11.glEnable(3008);
            GL11.glEnable(2896);
        }
        for (final Entity class399 : ShadowESP.mc.world.method6806()) {
            if (!this.method10725(class399)) {
                continue;
            }
            GL11.glPushMatrix();
            final Vec3d method9886 = ShadowESP.mc.field4644.method5833().method18161();
            final double method9887 = method9886.getX();
            final double method9888 = method9886.getY();
            final double method9889 = method9886.getZ();
            final MatrixStack class400 = new MatrixStack();
            final boolean field16039 = ShadowESP.mc.gameSettings.field23420;
            RenderSystem.method30002();
            RenderSystem.method30068(0.0f, 0.0f, 1.0f, 0.5f);
            RenderSystem.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
            RenderSystem.enableBlend();
            ShadowESP.mc.gameSettings.field23420 = false;
            final int method9890 = class399.method1666();
            final boolean method9891 = class399.method1829(0);
            class399.method1665(0);
            class399.setFlag(0, false);
            this.method10722(class399, method9887, method9888, method9889, ShadowESP.mc.timer.field26528, class400, this.field16039);
            class399.method1665(method9890);
            class399.setFlag(0, method9891);
            ShadowESP.mc.gameSettings.field23420 = field16039;
            GL11.glPopMatrix();
        }
        this.field16039.method25217(Class6332.method18767(Class1774.field9853));
        this.field16039.method25217(Class6332.method18768(Class1774.field9853));
        this.field16039.method25217(Class6332.method18770(Class1774.field9853));
        this.field16039.method25217(Class6332.method18774(Class1774.field9853));
        this.field16039.method25217(Class6332.method18791());
        this.field16039.finish();
        if (ShadowESP.field16038 == Class2092.field12100) {
            GL11.glPolygonMode(1032, 6914);
            GL11.glDisable(10754);
        }
        ShadowESP.field16038 = Class2092.field12098;
        GL11.glDepthFunc(515);
    }
    
    public void method10722(final Entity class399, final double n, final double n2, final double n3, final float n4, final MatrixStack class400, final IRenderTypeBuffer class401) {
        ShadowESP.mc.worldRenderer.field9290.method28706(class399, MathHelper.lerp(n4, class399.lastTickPosX, class399.getPosX()) - n, MathHelper.lerp(n4, class399.lastTickPosY, class399.getPosY()) - n2, MathHelper.lerp(n4, class399.lastTickPosZ, class399.getPosZ()) - n3, MathHelper.method35700(n4, class399.prevRotationYaw, class399.rotationYaw), n4, class400, class401, 255);
    }
    
    @EventListener
    public void method10723(final Class5729 class5729) {
        if (this.isEnabled()) {
            if (ShadowESP.field16038 != Class2092.field12098) {
                class5729.method17020(false);
            }
        }
    }
    
    @EventListener
    public void method10724(final Class5749 class5749) {
        if (this.isEnabled()) {
            if (ShadowESP.field16038 != Class2092.field12098) {
                if (class5749.method17056() instanceof PlayerEntity) {
                    class5749.setCancelled(true);
                }
            }
        }
    }
    
    private boolean method10725(final Entity class399) {
        return class399 instanceof LivingEntity && class399 instanceof PlayerEntity && !(class399 instanceof ClientPlayerEntity) && !class399.method1823() && !Client.getInstance().getBotManager().isBot(class399);
    }
    
    private void method10726() {
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
        ShadowESP.mc.field4644.field9396.method1417();
    }
    
    private void method10727() {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glEnable(2903);
        RenderSystem.method30084(33986, 240.0f, 240.0f);
        Class7777.method24931();
        final Class1663 method5290 = ShadowESP.mc.method5290();
        ShadowESP.mc.method5290();
        method5290.method5849(Class1663.field9428);
        ShadowESP.mc.field4644.field9396.method1418();
        GL11.glLightModelfv(2899, new float[] { 0.4f, 0.4f, 0.4f, 1.0f });
        ShadowESP.field16038 = Class2092.field12098;
    }
    
    static {
        ShadowESP.field16038 = Class2092.field12098;
    }
}
