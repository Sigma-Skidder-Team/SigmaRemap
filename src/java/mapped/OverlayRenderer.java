package mapped;

import javax.annotation.Nullable;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.RenderFireEvent;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;
import org.apache.commons.lang3.tuple.Pair;

public class OverlayRenderer {
   private static final ResourceLocation TEXTURE_UNDERWATER = new ResourceLocation("textures/misc/underwater.png");

   public static void method18789(Minecraft var0, MatrixStack var1) {
      RenderSystem.disableAlphaTest();
      ClientPlayerEntity var4 = var0.player;
      if (!var4.noClip) {
         if (Reflector.field42849.exists() && Reflector.field42822.exists()) {
            Pair var8 = method18791(var4);
            if (var8 != null) {
               Object var6 = Reflector.method35071(Reflector.field42984);
               if (!Reflector.field42849.method20218(var4, var1, var6, var8.getLeft(), var8.getRight())) {
                  TextureAtlasSprite var7 = (TextureAtlasSprite) Reflector.call(
                     var0.getBlockRendererDispatcher().getBlockModelShapes(), Reflector.field42822, var8.getLeft(), var0.world, var8.getRight()
                  );
                  method18792(var0, var7, var1);
               }
            }
         } else {
            BlockState var5 = method18790(var4);
            if (var5 != null) {
               method18792(var0, var0.getBlockRendererDispatcher().getBlockModelShapes().getTexture(var5), var1);
            }
         }
      }

      if (!var0.player.isSpectator()) {
         if (var0.player.areEyesInFluid(FluidTags.field40469) && !Reflector.field42851.method20218(var4, var1)) {
            renderUnderwater(var0, var1);
         }

         if (var0.player.isBurning() && !Reflector.field42850.method20218(var4, var1)) {
            renderFire(var0, var1);
         }
      }

      RenderSystem.enableAlphaTest();
   }

   @Nullable
   private static BlockState method18790(PlayerEntity var0) {
      Pair var3 = method18791(var0);
      return var3 != null ? (BlockState)var3.getLeft() : null;
   }

   private static Pair<BlockState, BlockPos> method18791(PlayerEntity var0) {
      BlockPos.Mutable var3 = new BlockPos.Mutable();

      for (int var4 = 0; var4 < 8; var4++) {
         double var5 = var0.getPosX() + (double)(((float)((var4 >> 0) % 2) - 0.5F) * var0.getWidth() * 0.8F);
         double var7 = var0.getPosYEye() + (double)(((float)((var4 >> 1) % 2) - 0.5F) * 0.1F);
         double var9 = var0.getPosZ() + (double)(((float)((var4 >> 2) % 2) - 0.5F) * var0.getWidth() * 0.8F);
         var3.method8373(var5, var7, var9);
         BlockState var11 = var0.world.getBlockState(var3);
         if (var11.getRenderType() != BlockRenderType.field9885 && var11.method23438(var0.world, var3)) {
            return Pair.of(var11, var3.toImmutable());
         }
      }

      return null;
   }

   private static void method18792(Minecraft var0, TextureAtlasSprite var1, MatrixStack var2) {
      if (SmartAnimations.isActive()) {
         SmartAnimations.spriteRendered(var1);
      }

      var0.getTextureManager().bindTexture(var1.getAtlasTexture().getTextureLocation());
      BufferBuilder var5 = Tessellator.getInstance().getBuffer();
      float var6 = 0.1F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -1.0F;
      float var10 = 1.0F;
      float var11 = -0.5F;
      float var12 = var1.getMinU();
      float var13 = var1.getMaxU();
      float var14 = var1.getMinV();
      float var15 = var1.getMaxV();
      Matrix4f var16 = var2.getLast().getMatrix();
      var5.begin(7, DefaultVertexFormats.POSITION_COLOR_TEX);
      var5.pos(var16, -1.0F, -1.0F, -0.5F).color(0.1F, 0.1F, 0.1F, 1.0F).tex(var13, var15).endVertex();
      var5.pos(var16, 1.0F, -1.0F, -0.5F).color(0.1F, 0.1F, 0.1F, 1.0F).tex(var12, var15).endVertex();
      var5.pos(var16, 1.0F, 1.0F, -0.5F).color(0.1F, 0.1F, 0.1F, 1.0F).tex(var12, var14).endVertex();
      var5.pos(var16, -1.0F, 1.0F, -0.5F).color(0.1F, 0.1F, 0.1F, 1.0F).tex(var13, var14).endVertex();
      var5.finishDrawing();
      WorldVertexBufferUploader.draw(var5);
   }

   private static void renderUnderwater(Minecraft var0, MatrixStack var1) {
      RenderSystem.enableTexture();
      var0.getTextureManager().bindTexture(TEXTURE_UNDERWATER);
      if (SmartAnimations.isActive()) {
         SmartAnimations.textureRendered(var0.getTextureManager().getTexture(TEXTURE_UNDERWATER).getGlTextureId());
      }

      BufferBuilder var4 = Tessellator.getInstance().getBuffer();
      float var5 = var0.player.getBrightness();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      float var6 = 4.0F;
      float var7 = -1.0F;
      float var8 = 1.0F;
      float var9 = -1.0F;
      float var10 = 1.0F;
      float var11 = -0.5F;
      float var12 = -var0.player.rotationYaw / 64.0F;
      float var13 = var0.player.rotationPitch / 64.0F;
      Matrix4f var14 = var1.getLast().getMatrix();
      var4.begin(7, DefaultVertexFormats.POSITION_COLOR_TEX);
      var4.pos(var14, -1.0F, -1.0F, -0.5F).color(var5, var5, var5, 0.1F).tex(4.0F + var12, 4.0F + var13).endVertex();
      var4.pos(var14, 1.0F, -1.0F, -0.5F).color(var5, var5, var5, 0.1F).tex(0.0F + var12, 4.0F + var13).endVertex();
      var4.pos(var14, 1.0F, 1.0F, -0.5F).color(var5, var5, var5, 0.1F).tex(0.0F + var12, 0.0F + var13).endVertex();
      var4.pos(var14, -1.0F, 1.0F, -0.5F).color(var5, var5, var5, 0.1F).tex(4.0F + var12, 0.0F + var13).endVertex();
      var4.finishDrawing();
      WorldVertexBufferUploader.draw(var4);
      RenderSystem.disableBlend();
   }

   private static void renderFire(Minecraft minecraftIn, MatrixStack var1) {
      BufferBuilder var4 = Tessellator.getInstance().getBuffer();
      RenderSystem.depthFunc(519);
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableTexture();
      TextureAtlasSprite textureatlassprite = ModelBakery.LOCATION_FIRE_1.getSprite();
      if (SmartAnimations.isActive()) {
         SmartAnimations.spriteRendered(textureatlassprite);
      }

      minecraftIn.getTextureManager().bindTexture(textureatlassprite.getAtlasTexture().getTextureLocation());
      float var6 = textureatlassprite.getMinU();
      float var7 = textureatlassprite.getMaxU();
      float var8 = (var6 + var7) / 2.0F;
      float var9 = textureatlassprite.getMinV();
      float var10 = textureatlassprite.getMaxV();
      float var11 = (var9 + var10) / 2.0F;
      float var12 = textureatlassprite.getUvShrinkRatio();
      float var13 = MathHelper.lerp(var12, var6, var8);
      float var14 = MathHelper.lerp(var12, var7, var8);
      float var15 = MathHelper.lerp(var12, var9, var11);
      float var16 = MathHelper.lerp(var12, var10, var11);
      float var17 = 1.0F;
      RenderFireEvent renderFireEvent = new RenderFireEvent(0.9F);
      Client.getInstance().getEventManager().call(renderFireEvent);

      for (int i = 0; i < 2; i++) {
         var1.push();
         float var20 = -0.5F;
         float var21 = 0.5F;
         float var22 = -0.5F;
         float var23 = 0.5F;
         float var24 = -0.5F;
         var1.translate((double)((float)(-(i * 2 - 1)) * 0.24F), -0.3F, 0.0);
         var1.rotate(Vector3f.YP.rotationDegrees((float)(i * 2 - 1) * 10.0F));
         Matrix4f var25 = var1.getLast().getMatrix();
         var4.begin(7, DefaultVertexFormats.POSITION_COLOR_TEX);
         var4.pos(var25, -0.5F, -0.5F, -0.5F).color(1.0F, 1.0F, 1.0F, renderFireEvent.getFireHeight()).tex(var14, var16).endVertex();
         var4.pos(var25, 0.5F, -0.5F, -0.5F).color(1.0F, 1.0F, 1.0F, renderFireEvent.getFireHeight()).tex(var13, var16).endVertex();
         var4.pos(var25, 0.5F, 0.5F, -0.5F).color(1.0F, 1.0F, 1.0F, renderFireEvent.getFireHeight()).tex(var13, var15).endVertex();
         var4.pos(var25, -0.5F, 0.5F, -0.5F).color(1.0F, 1.0F, 1.0F, renderFireEvent.getFireHeight()).tex(var14, var15).endVertex();
         var4.finishDrawing();
         WorldVertexBufferUploader.draw(var4);
         var1.pop();
      }

      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.depthFunc(515);
   }
}
