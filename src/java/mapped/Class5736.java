package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.storage.MapData;
import net.optifine.Config;
import net.optifine.reflect.ReflectorForge;
import net.optifine.shaders.Shaders;

public class Class5736 extends EntityRenderer<ItemFrameEntity> {
   private static final Class1997 field25153 = new Class1997("item_frame", "map=false");
   private static final Class1997 field25154 = new Class1997("item_frame", "map=true");
   private final Minecraft field25155 = Minecraft.getInstance();
   private final ItemRenderer field25156;
   private static double field25157 = 4096.0;

   public Class5736(EntityRendererManager var1, ItemRenderer var2) {
      super(var1);
      this.field25156 = var2;
   }

   public void render(ItemFrameEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
      matrixStackIn.push();
      Direction var9 = entityIn.getHorizontalFacing();
      Vector3d var10 = this.getRenderOffset(entityIn, partialTicks);
      matrixStackIn.translate(-var10.getX(), -var10.getY(), -var10.getZ());
      double var11 = 0.46875;
      matrixStackIn.translate((double)var9.getXOffset() * 0.46875, (double)var9.getYOffset() * 0.46875, (double)var9.getZOffset() * 0.46875);
      matrixStackIn.rotate(Vector3f.XP.rotationDegrees(entityIn.rotationPitch));
      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180.0F - entityIn.rotationYaw));
      boolean var13 = entityIn.isInvisible();
      if (!var13) {
         BlockRendererDispatcher var14 = this.field25155.getBlockRendererDispatcher();
         ModelManager var15 = var14.getBlockModelShapes().getModelManager();
         Class1997 var16 = !(entityIn.method4090().getItem() instanceof Class3316) ? field25153 : field25154;
         matrixStackIn.push();
         matrixStackIn.translate(-0.5, -0.5, -0.5);
         var14.method812()
            .method24689(
               matrixStackIn.getLast(),
               bufferIn.getBuffer(Class8624.method30906()),
               (BlockState)null,
               var15.method1023(var16),
               1.0F,
               1.0F,
               1.0F,
                    packedLightIn,
               OverlayTexture.NO_OVERLAY
            );
         matrixStackIn.pop();
      }

      ItemStack var19 = entityIn.method4090();
      if (!var19.isEmpty()) {
         boolean var20 = var19.getItem() instanceof Class3316;
         if (!var13) {
            matrixStackIn.translate(0.0, 0.0, 0.4375);
         } else {
            matrixStackIn.translate(0.0, 0.0, 0.5);
         }

         int var21 = !var20 ? entityIn.method4093() : entityIn.method4093() % 4 * 2;
         matrixStackIn.rotate(Vector3f.ZP.rotationDegrees((float)var21 * 360.0F / 8.0F));
         if (!Reflector.postForgeBusEvent(Reflector.field42988, entityIn, this, matrixStackIn, bufferIn, packedLightIn)) {
            if (!var20) {
               matrixStackIn.scale(0.5F, 0.5F, 0.5F);
               if (this.method17917(entityIn)) {
                  this.field25156.renderItem(var19, ItemCameraTransformsTransformType.FIXED, packedLightIn, OverlayTexture.NO_OVERLAY, matrixStackIn, bufferIn);
               }
            } else {
               matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(180.0F));
               float var17 = 0.0078125F;
               matrixStackIn.scale(0.0078125F, 0.0078125F, 0.0078125F);
               matrixStackIn.translate(-64.0, -64.0, 0.0);
               MapData var18 = ReflectorForge.method37048(var19, entityIn.world);
               matrixStackIn.translate(0.0, 0.0, -1.0);
               if (var18 != null) {
                  this.field25155.gameRenderer.method756().method593(matrixStackIn, bufferIn, var18, true, packedLightIn);
               }
            }
         }
      }

      matrixStackIn.pop();
   }

   public Vector3d getRenderOffset(ItemFrameEntity var1, float var2) {
      return new Vector3d((double)((float)var1.getHorizontalFacing().getXOffset() * 0.3F), -0.25, (double)((float)var1.getHorizontalFacing().getZOffset() * 0.3F));
   }

   public ResourceLocation method17843(ItemFrameEntity var1) {
      return AtlasTexture.LOCATION_BLOCKS_TEXTURE;
   }

   public boolean canRenderName(ItemFrameEntity var1) {
      if (Minecraft.isGuiEnabled() && !var1.method4090().isEmpty() && var1.method4090().method32152() && this.field25097.field40019 == var1) {
         double var4 = this.field25097.method32228(var1);
         float var6 = !var1.isDiscrete() ? 64.0F : 32.0F;
         return var4 < (double)(var6 * var6);
      } else {
         return false;
      }
   }

   public void renderName(ItemFrameEntity var1, ITextComponent var2, MatrixStack var3, IRenderTypeBuffer var4, int var5) {
      super.renderName(var1, var1.method4090().method32149(), var3, var4, var5);
   }

   private boolean method17917(ItemFrameEntity var1) {
      if (! Shaders.isShadowPass) {
         if (!Config.field34162) {
            Entity var4 = this.field25155.getRenderViewEntity();
            double var5 = var1.getDistanceSq(var4.getPosX(), var4.getPosY(), var4.getPosZ());
            if (var5 > field25157) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static void method17918() {
      Minecraft var2 = Minecraft.getInstance();
      double var3 = Config.method26833(var2.gameSettings.fov, 1.0, 120.0);
      double var5 = Math.max(6.0 * (double)var2.getMainWindow().getHeight() / var3, 16.0);
      field25157 = var5 * var5;
   }
}
