package com.mentalfrostbyte.jello.module.impl.render.chestesp;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mojang.blaze3d.systems.RenderSystem;
import lol.TextureImpl;
import mapped.*;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class BoxChestESP extends Module {
    public BoxChestESP() {
        super(ModuleCategory.RENDER, "Box", "Draws a box where chests are");
    }

    @EventTarget
    private void method16297(Render3DEvent var1) {
        if (this.isEnabled()) {
            if (mc.player != null && mc.world != null) {
                this.method16299();
                this.method16298();
                this.method16300();
            }
        }
    }

    private void method16298() {
        int var3 = MultiUtilities.applyAlpha(this.access().parseSettingValueToIntBySettingName("Regular Color"), 0.14F);
        int var4 = MultiUtilities.applyAlpha(this.access().parseSettingValueToIntBySettingName("Ender Color"), 0.14F);
        int var5 = MultiUtilities.applyAlpha(this.access().parseSettingValueToIntBySettingName("Trapped Color"), 0.14F);

        for (TileEntity var7 : mc.world.loadedTileEntityList) {
            boolean var8 = var7 instanceof ChestTileEntity && !(var7 instanceof Class970) && this.access().getBooleanValueFromSettingName("Show Regular Chests");
            boolean var9 = var7 instanceof Class943 && this.access().getBooleanValueFromSettingName("Show Ender Chests");
            boolean var10 = var7 instanceof Class970 && this.access().getBooleanValueFromSettingName("Show Trapped Chests");
            if (var8 || var9 || var10) {
                double var11 = Class9647.method37624(var7.getPos()).field43722;
                double var13 = Class9647.method37624(var7.getPos()).field43723;
                double var15 = Class9647.method37624(var7.getPos()).field43724;
                GL11.glDisable(2929);
                GL11.glEnable(3042);
                int var17 = var3;
                if (!(var7 instanceof Class943)) {
                    if (var7 instanceof Class970) {
                        var17 = var5;
                    }
                } else {
                    var17 = var4;
                }

                Box3D var18 = new Box3D(
                        var7.getBlockState().method23412(mc.world, var7.getPos()).getBoundingBox().offset(var11, var13, var15)
                );
                GL11.glAlphaFunc(519, 0.0F);
                RenderUtil.render3DColoredBox(var18, var17);
                RenderUtil.renderWireframeBox(var18, 2.0F, var17);
                GL11.glDisable(3042);
            }
        }
    }

    private void method16299() {
        GL11.glLineWidth(3.0F);
        GL11.glPointSize(3.0F);
        GL11.glEnable(2832);
        GL11.glEnable(2848);
        GL11.glEnable(3042);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
        GL11.glDisable(3553);
        GL11.glDisable(2903);
        GL11.glDisable(2929);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.gameRenderer.lightmapTexture.method7316();
    }

    private void method16300() {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glEnable(2903);
        RenderSystem.glMultiTexCoord2f(33986, 240.0F, 240.0F);
        TextureImpl.method36180();
        TextureManager var10000 = mc.getTextureManager();
        mc.getTextureManager();
        var10000.bindTexture(TextureManager.field1094);
        mc.gameRenderer.lightmapTexture.method7317();
    }
}
