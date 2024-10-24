package com.mentalfrostbyte.jello.module.impl.render.chestesp;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.PositionUtils;
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
    private void onRender3D(Render3DEvent event) {
        if (this.isEnabled()) {
            if (mc.player != null && mc.world != null) {
                prepareRenderSettings();
                renderChestBoxes();
                applyTextureSettings();
            }
        }
    }

    private void renderChestBoxes() {
        int regularColor = MultiUtilities.applyAlpha(this.access().parseSettingValueToIntBySettingName("Regular Color"), 0.14F);
        int enderColor = MultiUtilities.applyAlpha(this.access().parseSettingValueToIntBySettingName("Ender Color"), 0.14F);
        int trappedColor = MultiUtilities.applyAlpha(this.access().parseSettingValueToIntBySettingName("Trapped Color"), 0.14F);

        for (TileEntity tileEntity : mc.world.loadedTileEntityList) {
            boolean showRegularChests = tileEntity instanceof ChestTileEntity && !(tileEntity instanceof Class970)
                    && this.access().getBooleanValueFromSettingName("Show Regular Chests");
            boolean showEnderChests = tileEntity instanceof Class943 && this.access().getBooleanValueFromSettingName("Show Ender Chests");
            boolean showTrappedChests = tileEntity instanceof Class970 && this.access().getBooleanValueFromSettingName("Show Trapped Chests");

            if (showRegularChests || showEnderChests || showTrappedChests) {
                double x = PositionUtils.getRelativePosition(tileEntity.getPos()).x;
                double y = PositionUtils.getRelativePosition(tileEntity.getPos()).y;
                double z = PositionUtils.getRelativePosition(tileEntity.getPos()).z;

                GL11.glDisable(2929);
                GL11.glEnable(3042);
                int color = regularColor;

                if (tileEntity instanceof Class970) {
                    color = trappedColor;
                } else if (tileEntity instanceof Class943) {
                    color = enderColor;
                }

                Box3D boundingBox = new Box3D(
                        tileEntity.getBlockState().method23412(mc.world, tileEntity.getPos()).getBoundingBox().offset(x, y, z)
                );

                GL11.glAlphaFunc(519, 0.0F);
                RenderUtil.render3DColoredBox(boundingBox, color);
                RenderUtil.renderWireframeBox(boundingBox, 2.0F, color);
                GL11.glDisable(3042);
            }
        }
    }

    private void prepareRenderSettings() {
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

    private void applyTextureSettings() {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3553);
        GL11.glEnable(2903);
        RenderSystem.glMultiTexCoord2f(33986, 240.0F, 240.0F);
        TextureImpl.method36180();
        TextureManager textureManager = mc.getTextureManager();
        textureManager.bindTexture(TextureManager.RESOURCE_LOCATION_EMPTY);
        mc.gameRenderer.lightmapTexture.method7317();
    }
}
