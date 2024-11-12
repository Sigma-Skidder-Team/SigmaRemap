package com.mentalfrostbyte.jello.module.impl.render.chestesp;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.PositionUtils;
import com.mojang.blaze3d.systems.RenderSystem;
import lol.ClientColors;
import org.newdawn.slick.opengl.TextureImpl;
import mapped.*;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class OutlineChestESP extends Module {
   public OutlineChestESP() {
      super(ModuleCategory.RENDER, "Outline", "Draws a line arround chests");
   }

   @EventTarget
   private void method16963(Render3DEvent var1) {
      if (this.isEnabled()) {
         if (mc.player != null && mc.world != null) {
            this.method16965();
            RenderUtil.method11476();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.method16964(false);
            RenderUtil.method11477(Class2329.field15941);
            GL11.glLineWidth(3.0F);
            RenderSystem.alphaFunc(518, 0.0F);
            RenderSystem.enableAlphaTest();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.1F);
            GL11.glEnable(3042);
            GL11.glDisable(2896);
            this.method16964(true);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            RenderUtil.method11478();
            this.method16966();
         }
      }
   }

   private void method16964(boolean var1) {
      int var4 = MultiUtilities.applyAlpha(this.access().parseSettingValueToIntBySettingName("Regular Color"), 0.7F);
      int var5 = MultiUtilities.applyAlpha(this.access().parseSettingValueToIntBySettingName("Ender Color"), 0.7F);
      int var6 = MultiUtilities.applyAlpha(this.access().parseSettingValueToIntBySettingName("Trapped Color"), 0.7F);

      for (TileEntity var8 : mc.world.loadedTileEntityList) {
         boolean var9 = var8 instanceof ChestTileEntity && !(var8 instanceof Class970) && this.access().getBooleanValueFromSettingName("Show Regular Chests");
         boolean var10 = var8 instanceof Class943 && this.access().getBooleanValueFromSettingName("Show Ender Chests");
         boolean var11 = var8 instanceof Class970 && this.access().getBooleanValueFromSettingName("Show Trapped Chests");
         if (var9 || var10 || var11) {
            double var12 = PositionUtils.getRelativePosition(var8.getPos()).x;
            double var14 = PositionUtils.getRelativePosition(var8.getPos()).y;
            double var16 = PositionUtils.getRelativePosition(var8.getPos()).z;
            GL11.glDisable(2929);
            GL11.glEnable(3042);
            int var18 = var4;
            if (!(var8 instanceof Class943)) {
               if (var8 instanceof Class970) {
                  var18 = var6;
               }
            } else {
               var18 = var5;
            }

            Box3D var19 = new Box3D(
               var8.getBlockState().getShape(mc.world, var8.getPos()).getBoundingBox().offset(var12, var14, var16)
            );
            if (var1) {
               RenderUtil.renderWireframeBox(var19, 3.0F, var18);
            } else {
               RenderUtil.render3DColoredBox(var19, ClientColors.LIGHT_GREYISH_BLUE.color);
            }

            GL11.glDisable(3042);
         }
      }
   }

   private void method16965() {
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

   private void method16966() {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2896);
      GL11.glEnable(3553);
      GL11.glEnable(2903);
      RenderSystem.glMultiTexCoord2f(33986, 240.0F, 240.0F);
      TextureImpl.unbind();
      TextureManager var10000 = mc.getTextureManager();
      mc.getTextureManager();
      var10000.bindTexture(TextureManager.RESOURCE_LOCATION_EMPTY);
      mc.gameRenderer.lightmapTexture.method7317();
   }
}
