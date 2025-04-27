// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render.esps;

import java.util.HashMap;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.ColorSetting;
import mapped.*;
import net.minecraft.entity.LivingEntity;
import org.lwjgl.opengl.GL11;
import java.awt.Color;
import java.util.Map;

public class SkeletonESP extends Module
{
    private static Map<PlayerEntity, float[][]> field15939;
    
    public SkeletonESP() {
        super(Category.RENDER, "Skeleton", "Skeleton ESP.");
        this.addSetting(new ColorSetting("Color", "The Skeleton color", ClientColors.LIGHT_GREYISH_BLUE.color));
        this.addSetting(new BooleanSetting("CSGO", "Add a CSGO look.", true));
    }
    
    @EventListener
    public void method10560(final Custom3DRenderEvent custom3DRenderEvent) {
        if (this.isEnabled()) {
        }
    }
    
    private void method10561(final Custom3DRenderEvent custom3DRenderEvent, final PlayerEntity class5740) {
        final Color color = new Color(Client.getInstance().getFriendManager().method29879(class5740.getName().getFormattedText()) ? -8401409 : (class5740.getName().getFormattedText().equalsIgnoreCase(SkeletonESP.mc.player.getName().getFormattedText()) ? -6684775 : new Color(16775672).getRGB()));
        if (!class5740.method1823()) {
            final float[][] array = SkeletonESP.field15939.get(class5740);
            if (array != null) {
                if (class5740.isAlive()) {
                    if (class5740 != SkeletonESP.mc.player) {
                        if (!class5740.method2783()) {
                            GL11.glPushMatrix();
                            GL11.glLineWidth(2.0f);
                            GL11.glColor4f((float)(color.getRed() / 255), (float)(color.getGreen() / 255), (float)(color.getBlue() / 255), 1.0f);
                            final Class9407 method10562 = this.method10562(custom3DRenderEvent, class5740);
                            GL11.glTranslated(method10562.method34993() - SkeletonESP.mc.method5306().field35906.method18161().x, method10562.method34994() - SkeletonESP.mc.method5306().field35906.method18161().y, method10562.method34995() - SkeletonESP.mc.method5306().field35906.method18161().z);
                            final float n = class5740.field2952 + (class5740.field2951 - class5740.field2952) * SkeletonESP.mc.method5314();
                            GL11.glRotatef(-n, 0.0f, 1.0f, 0.0f);
                            GL11.glTranslated(0.0, 0.0, class5740.method1809() ? -0.235 : 0.0);
                            final float n2 = class5740.method1809() ? 0.6f : 0.75f;
                            GL11.glPushMatrix();
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                            GL11.glTranslated(-0.125, n2, 0.0);
                            if (array[3][0] != 0.0f) {
                                GL11.glRotatef(array[3][0] * 57.295776f, 1.0f, 0.0f, 0.0f);
                            }
                            if (array[3][1] != 0.0f) {
                                GL11.glRotatef(array[3][1] * 57.295776f, 0.0f, 1.0f, 0.0f);
                            }
                            if (array[3][2] != 0.0f) {
                                GL11.glRotatef(array[3][2] * 57.295776f, 0.0f, 0.0f, 1.0f);
                            }
                            GL11.glBegin(3);
                            GL11.glVertex3d(0.0, 0.0, 0.0);
                            GL11.glVertex3d(0.0, -n2, 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glPushMatrix();
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                            GL11.glTranslated(0.125, n2, 0.0);
                            if (array[4][0] != 0.0f) {
                                GL11.glRotatef(array[4][0] * 57.295776f, 1.0f, 0.0f, 0.0f);
                            }
                            if (array[4][1] != 0.0f) {
                                GL11.glRotatef(array[4][1] * 57.295776f, 0.0f, 1.0f, 0.0f);
                            }
                            if (array[4][2] != 0.0f) {
                                GL11.glRotatef(array[4][2] * 57.295776f, 0.0f, 0.0f, 1.0f);
                            }
                            GL11.glBegin(3);
                            GL11.glVertex3d(0.0, 0.0, 0.0);
                            GL11.glVertex3d(0.0, -n2, 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glTranslated(0.0, 0.0, class5740.method1809() ? 0.25 : 0.0);
                            GL11.glPushMatrix();
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                            GL11.glTranslated(0.0, class5740.method1809() ? -0.05 : 0.0, class5740.method1809() ? -0.01725 : 0.0);
                            GL11.glPushMatrix();
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                            GL11.glTranslated(-0.375, n2 + 0.55, 0.0);
                            if (array[1][0] != 0.0f) {
                                GL11.glRotatef(array[1][0] * 57.295776f, 1.0f, 0.0f, 0.0f);
                            }
                            if (array[1][1] != 0.0f) {
                                GL11.glRotatef(array[1][1] * 57.295776f, 0.0f, 1.0f, 0.0f);
                            }
                            if (array[1][2] != 0.0f) {
                                GL11.glRotatef(-array[1][2] * 57.295776f, 0.0f, 0.0f, 1.0f);
                            }
                            GL11.glBegin(3);
                            GL11.glVertex3d(0.0, 0.0, 0.0);
                            GL11.glVertex3d(0.0, -0.5, 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glPushMatrix();
                            GL11.glTranslated(0.375, n2 + 0.55, 0.0);
                            if (array[2][0] != 0.0f) {
                                GL11.glRotatef(array[2][0] * 57.295776f, 1.0f, 0.0f, 0.0f);
                            }
                            if (array[2][1] != 0.0f) {
                                GL11.glRotatef(array[2][1] * 57.295776f, 0.0f, 1.0f, 0.0f);
                            }
                            if (array[2][2] != 0.0f) {
                                GL11.glRotatef(-array[2][2] * 57.295776f, 0.0f, 0.0f, 1.0f);
                            }
                            GL11.glBegin(3);
                            GL11.glVertex3d(0.0, 0.0, 0.0);
                            GL11.glVertex3d(0.0, -0.5, 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glRotatef(n - class5740.field2953, 0.0f, 1.0f, 0.0f);
                            GL11.glPushMatrix();
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                            GL11.glTranslated(0.0, n2 + 0.55, 0.0);
                            if (array[0][0] != 0.0f) {
                                GL11.glRotatef(array[0][0] * 57.295776f, 1.0f, 0.0f, 0.0f);
                            }
                            GL11.glBegin(3);
                            GL11.glVertex3d(0.0, 0.0, 0.0);
                            GL11.glVertex3d(0.0, 0.3, 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glPopMatrix();
                            GL11.glRotatef(class5740.method1809() ? 25.0f : 0.0f, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslated(0.0, class5740.method1809() ? -0.16175 : 0.0, class5740.method1809() ? -0.48025 : 0.0);
                            GL11.glPushMatrix();
                            GL11.glTranslated(0.0, n2, 0.0);
                            GL11.glBegin(3);
                            GL11.glVertex3d(-0.125, 0.0, 0.0);
                            GL11.glVertex3d(0.125, 0.0, 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glPushMatrix();
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                            GL11.glTranslated(0.0, n2, 0.0);
                            GL11.glBegin(3);
                            GL11.glVertex3d(0.0, 0.0, 0.0);
                            GL11.glVertex3d(0.0, 0.55, 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glPushMatrix();
                            GL11.glTranslated(0.0, n2 + 0.55, 0.0);
                            GL11.glBegin(3);
                            GL11.glVertex3d(-0.375, 0.0, 0.0);
                            GL11.glVertex3d(0.375, 0.0, 0.0);
                            GL11.glEnd();
                            GL11.glPopMatrix();
                            GL11.glPopMatrix();
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                        }
                    }
                }
            }
        }
    }
    
    private Class9407 method10562(final Custom3DRenderEvent custom3DRenderEvent, final PlayerEntity class5740) {
        final float method5314 = SkeletonESP.mc.method5314();
        return new Class9407(class5740.lastTickPosX + (class5740.posX - class5740.lastTickPosX) * method5314, class5740.lastTickPosY + (class5740.posY - class5740.lastTickPosY) * method5314, class5740.lastTickPosZ + (class5740.posZ - class5740.lastTickPosZ) * method5314);
    }
    
    public static void method10563(final PlayerEntity playerEntity, final Class5860<PlayerEntity> class513) {
        SkeletonESP.field15939.put(playerEntity, new float[][] { { class513.field23993.field25183, class513.field23993.field25184, class513.field23993.field25185 }, { class513.field23996.field25183, class513.field23996.field25184, class513.field23996.field25185 }, { class513.field23997.field25183, class513.field23997.field25184, class513.field23997.field25185 }, { class513.field23998.field25183, class513.field23998.field25184, class513.field23998.field25185 }, { class513.field23999.field25183, class513.field23999.field25184, class513.field23999.field25185 } });
    }
    
    private boolean method10564(final PlayerEntity playerEntity) {
        return !SkeletonESP.mc.world.getPlayers().contains(playerEntity);
    }
    
    private void method10565(final boolean b) {
        if (!b) {
            GL11.glDisable(3042);
            GL11.glDisable(2848);
            GL11.glEnable(2929);
            GL11.glEnable(3553);
            GL11.glPopMatrix();
        }
        else {
            GL11.glPopMatrix();
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glDisable(2929);
            GL11.glDisable(3553);
            GL11.glBlendFunc(770, 771);
            GL11.glHint(3154, 4354);
        }
        GL11.glDepthMask(b);
    }
    
    private int method10566(final LivingEntity class511) {
        final float method2664 = class511.method2664();
        final float method2665 = class511.method2701();
        return Color.HSBtoRGB(Math.max(0.0f, Math.min(method2664, method2665) / method2665) / 3.0f, 1.0f, 1.0f) | 0xFF000000;
    }
    
    static {
        SkeletonESP.field15939 = new HashMap<PlayerEntity, float[][]>();
    }
}
