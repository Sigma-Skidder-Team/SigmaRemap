package mapped;

import com.google.common.base.MoreObjects;
import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.impl.EventHandAnimation;
import com.mentalfrostbyte.jello.module.impl.player.OldHitting;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.world.storage.MapData;
import net.optifine.Config;
import net.optifine.shaders.Shaders;

import java.util.Objects;

public class FirstPersonRenderer {
   private static final RenderType field45076 = RenderType.method14339(new ResourceLocation("textures/map/map_background.png"));
   private static final RenderType field45077 = RenderType.method14339(new ResourceLocation("textures/map/map_background_checkerboard.png"));
   private final Minecraft mc;
   private ItemStack field45079 = ItemStack.EMPTY;
   private ItemStack field45080 = ItemStack.EMPTY;
   private float field45081;
   private float field45082;
   private float field45083;
   private float field45084;
   private final EntityRendererManager field45085;
   private final ItemRenderer field45086;

   public FirstPersonRenderer(Minecraft var1) {
      this.mc = var1;
      this.field45085 = var1.getRenderManager();
      this.field45086 = var1.getItemRenderer();
   }

   public void renderItemSide(LivingEntity var1, ItemStack var2, ItemCameraTransformsTransformType var3, boolean var4, MatrixStack var5, Class7733 var6, int var7) {
      Class7992.method27282(var4);
      if (!var2.isEmpty()) {
         this.field45086.method790(var1, var2, var3, var4, var5, var6, var1.world, var7, OverlayTexture.NO_OVERLAY);
      }

      Class7992.method27282(false);
   }

   private float method37581(float var1) {
      float var4 = 1.0F - var1 / 45.0F + 0.1F;
      var4 = MathHelper.clamp(var4, 0.0F, 1.0F);
      return -MathHelper.cos(var4 * (float) Math.PI) * 0.5F + 0.5F;
   }

   private void method37582(MatrixStack var1, Class7733 var2, int var3, HandSide var4) {
      this.mc.getTextureManager().bindTexture(this.mc.player.method5371());
      PlayerRenderer var7 = (PlayerRenderer)this.field45085.<AbstractClientPlayerEntity>getRenderer(this.mc.player);
      var1.push();
      float var8 = var4 != HandSide.RIGHT ? -1.0F : 1.0F;
      var1.rotate(Vector3f.YP.rotationDegrees(92.0F));
      var1.rotate(Vector3f.XP.rotationDegrees(45.0F));
      var1.rotate(Vector3f.ZP.rotationDegrees(var8 * -41.0F));
      var1.translate((double)(var8 * 0.3F), -1.1F, 0.45F);
      if (var4 != HandSide.RIGHT) {
         var7.method17891(var1, var2, var3, this.mc.player);
      } else {
         var7.method17890(var1, var2, var3, this.mc.player);
      }

      var1.pop();
   }

   private void method37583(MatrixStack var1, Class7733 var2, int var3, float var4, HandSide var5, float var6, ItemStack var7) {
      float var10 = var5 != HandSide.RIGHT ? -1.0F : 1.0F;
      var1.translate((double)(var10 * 0.125F), -0.125, 0.0);
      if (!this.mc.player.isInvisible()) {
         var1.push();
         var1.rotate(Vector3f.ZP.rotationDegrees(var10 * 10.0F));
         this.method37586(var1, var2, var3, var4, var6, var5);
         var1.pop();
      }

      var1.push();
      var1.translate((double)(var10 * 0.51F), (double)(-0.08F + var4 * -1.2F), -0.75);
      float var11 = MathHelper.sqrt(var6);
      float var12 = MathHelper.sin(var11 * (float) Math.PI);
      float var13 = -0.5F * var12;
      float var14 = 0.4F * MathHelper.sin(var11 * (float) (Math.PI * 2));
      float var15 = -0.3F * MathHelper.sin(var6 * (float) Math.PI);
      var1.translate((double)(var10 * var13), (double)(var14 - 0.3F * var12), (double)var15);
      var1.rotate(Vector3f.XP.rotationDegrees(var12 * -45.0F));
      var1.rotate(Vector3f.YP.rotationDegrees(var10 * var12 * -30.0F));
      this.method37585(var1, var2, var3, var7);
      var1.pop();
   }

   private void method37584(MatrixStack var1, Class7733 var2, int var3, float var4, float var5, float var6) {
      float var9 = MathHelper.sqrt(var6);
      float var10 = -0.2F * MathHelper.sin(var6 * (float) Math.PI);
      float var11 = -0.4F * MathHelper.sin(var9 * (float) Math.PI);
      var1.translate(0.0, (double)(-var10 / 2.0F), (double)var11);
      float var12 = this.method37581(var4);
      var1.translate(0.0, (double)(0.04F + var5 * -1.2F + var12 * -0.5F), -0.72F);
      var1.rotate(Vector3f.XP.rotationDegrees(var12 * -85.0F));
      if (!this.mc.player.isInvisible()) {
         var1.push();
         var1.rotate(Vector3f.YP.rotationDegrees(90.0F));
         this.method37582(var1, var2, var3, HandSide.RIGHT);
         this.method37582(var1, var2, var3, HandSide.LEFT);
         var1.pop();
      }

      float var13 = MathHelper.sin(var9 * (float) Math.PI);
      var1.rotate(Vector3f.XP.rotationDegrees(var13 * 20.0F));
      var1.scale(2.0F, 2.0F, 2.0F);
      this.method37585(var1, var2, var3, this.field45079);
   }

   private void method37585(MatrixStack var1, Class7733 var2, int var3, ItemStack var4) {
      var1.rotate(Vector3f.YP.rotationDegrees(180.0F));
      var1.rotate(Vector3f.ZP.rotationDegrees(180.0F));
      var1.scale(0.38F, 0.38F, 0.38F);
      var1.translate(-0.5, -0.5, 0.0);
      var1.scale(0.0078125F, 0.0078125F, 0.0078125F);
      MapData var7 = Class3316.method11861(var4, this.mc.world);
      IVertexBuilder var8 = var2.method25597(var7 != null ? field45077 : field45076);
      Matrix4f var9 = var1.getLast().getMatrix();
      var8.pos(var9, -7.0F, 135.0F, 0.0F).color(255, 255, 255, 255).tex(0.0F, 1.0F).method17034(var3).endVertex();
      var8.pos(var9, 135.0F, 135.0F, 0.0F).color(255, 255, 255, 255).tex(1.0F, 1.0F).method17034(var3).endVertex();
      var8.pos(var9, 135.0F, -7.0F, 0.0F).color(255, 255, 255, 255).tex(1.0F, 0.0F).method17034(var3).endVertex();
      var8.pos(var9, -7.0F, -7.0F, 0.0F).color(255, 255, 255, 255).tex(0.0F, 0.0F).method17034(var3).endVertex();
      if (var7 != null) {
         this.mc.gameRenderer.method756().method593(var1, var2, var7, false, var3);
      }
   }

   private void method37586(MatrixStack var1, Class7733 var2, int var3, float var4, float var5, HandSide var6) {
      boolean var9 = var6 != HandSide.LEFT;
      float var10 = !var9 ? -1.0F : 1.0F;
      float var11 = MathHelper.sqrt(var5);
      float var12 = -0.3F * MathHelper.sin(var11 * (float) Math.PI);
      float var13 = 0.4F * MathHelper.sin(var11 * (float) (Math.PI * 2));
      float var14 = -0.4F * MathHelper.sin(var5 * (float) Math.PI);
      var1.translate((double)(var10 * (var12 + 0.64000005F)), (double)(var13 + -0.6F + var4 * -0.6F), (double)(var14 + -0.71999997F));
      var1.rotate(Vector3f.YP.rotationDegrees(var10 * 45.0F));
      float var15 = MathHelper.sin(var5 * var5 * (float) Math.PI);
      float var16 = MathHelper.sin(var11 * (float) Math.PI);
      var1.rotate(Vector3f.YP.rotationDegrees(var10 * var16 * 70.0F));
      var1.rotate(Vector3f.ZP.rotationDegrees(var10 * var15 * -20.0F));
      ClientPlayerEntity var17 = this.mc.player;
      this.mc.getTextureManager().bindTexture(var17.method5371());
      var1.translate((double)(var10 * -1.0F), 3.6F, 3.5);
      var1.rotate(Vector3f.ZP.rotationDegrees(var10 * 120.0F));
      var1.rotate(Vector3f.XP.rotationDegrees(200.0F));
      var1.rotate(Vector3f.YP.rotationDegrees(var10 * -135.0F));
      var1.translate((double)(var10 * 5.6F), 0.0, 0.0);
      PlayerRenderer var18 = (PlayerRenderer)this.field45085.<AbstractClientPlayerEntity>getRenderer(var17);
      if (!var9) {
         var18.method17891(var1, var2, var3, var17);
      } else {
         var18.method17890(var1, var2, var3, var17);
      }
   }

   private void transformEatFirstPerson(MatrixStack var1, float var2, HandSide var3, ItemStack var4) {
      float var7 = (float)this.mc.player.getItemInUseCount() - var2 + 1.0F;
      float var8 = var7 / (float)var4.getUseDuration();
      if (var8 < 0.8F) {
         float var9 = MathHelper.method37771(MathHelper.cos(var7 / 4.0F * (float) Math.PI) * 0.1F);
         var1.translate(0.0, (double)var9, 0.0);
      }

      float var11 = 1.0F - (float)Math.pow((double)var8, 27.0);
      int var10 = var3 != HandSide.RIGHT ? -1 : 1;
      var1.translate((double)(var11 * 0.6F * (float)var10), (double)(var11 * -0.5F), (double)(var11 * 0.0F));
      var1.rotate(Vector3f.YP.rotationDegrees((float)var10 * var11 * 90.0F));
      var1.rotate(Vector3f.XP.rotationDegrees(var11 * 10.0F));
      var1.rotate(Vector3f.ZP.rotationDegrees((float)var10 * var11 * 30.0F));
   }

   private void transformFirstPerson(MatrixStack var1, HandSide var2, float var3) {
      int var6 = var2 != HandSide.RIGHT ? -1 : 1;
      float var7 = MathHelper.sin(var3 * var3 * (float) Math.PI);
      var1.rotate(Vector3f.YP.rotationDegrees((float)var6 * (45.0F + var7 * -20.0F)));
      float var8 = MathHelper.sin(MathHelper.sqrt(var3) * (float) Math.PI);
      var1.rotate(Vector3f.ZP.rotationDegrees((float)var6 * var8 * -20.0F));
      var1.rotate(Vector3f.XP.rotationDegrees(var8 * -80.0F));
      var1.rotate(Vector3f.YP.rotationDegrees((float)var6 * -45.0F));
   }

   private void transformSideFirstPerson(MatrixStack var1, HandSide var2, float var3) {
      int var6 = var2 != HandSide.RIGHT ? -1 : 1;
      var1.translate((double)((float)var6 * 0.56F), (double)(-0.52F + var3 * -0.6F), -0.72F);
   }

   public void method37590(float var1, MatrixStack var2, Class7735 var3, ClientPlayerEntity var4, int var5) {
      float var8 = var4.getSwingProgress(var1);
      Hand var9 = (Hand)MoreObjects.firstNonNull(var4.swingingHand, Hand.MAIN_HAND);
      float var10 = MathHelper.lerp(var1, var4.prevRotationPitch, var4.rotationPitch);
      boolean var11 = true;
      boolean var12 = true;
      if (!var4.isHandActive()) {
         ItemStack var13 = var4.getHeldItemMainhand();
         ItemStack var14 = var4.getHeldItemOffhand();
         if (var13.getItem() instanceof CrossbowItem && CrossbowItem.isCharged(var13)) {
            var12 = !var11;
         }

         if (var14.getItem() instanceof CrossbowItem && CrossbowItem.isCharged(var14)) {
            var11 = !var13.isEmpty();
            var12 = !var11;
         }
      } else {
         ItemStack var17 = var4.getActiveItemStack();
         if (var17.getItem() instanceof Class3262) {
            var11 = var4.getActiveHand() == Hand.MAIN_HAND;
            var12 = !var11;
         }

         Hand var19 = var4.getActiveHand();
         if (var19 == Hand.MAIN_HAND) {
            ItemStack var15 = var4.getHeldItemOffhand();
            if (var15.getItem() instanceof CrossbowItem && CrossbowItem.isCharged(var15)) {
               var12 = false;
            }
         }
      }

      float var18 = MathHelper.lerp(var1, var4.field6138, var4.field6136);
      float var20 = MathHelper.lerp(var1, var4.field6137, var4.field6135);
      var2.rotate(Vector3f.XP.rotationDegrees((var4.getPitch(var1) - var18) * 0.1F));
      var2.rotate(Vector3f.YP.rotationDegrees((var4.getYaw(var1) - var20) * 0.1F));
      if (var11) {
         float var21 = var9 != Hand.MAIN_HAND ? 0.0F : var8;
         float var16 = 1.0F - MathHelper.lerp(var1, this.field45082, this.field45081);
         if (!Reflector.field42894.exists()
            || !Reflector.callBoolean(Reflector.field42894, Hand.MAIN_HAND, var2, var3, var5, var1, var10, var21, var16, this.field45079)) {
            this.method37591(var4, var1, var10, Hand.MAIN_HAND, var21, this.field45079, var16, var2, var3, var5);
         }
      }

      if (var12) {
         float var22 = var9 != Hand.OFF_HAND ? 0.0F : var8;
         float var23 = 1.0F - MathHelper.lerp(var1, this.field45084, this.field45083);
         if (!Reflector.field42894.exists()
            || !Reflector.callBoolean(Reflector.field42894, Hand.OFF_HAND, var2, var3, var5, var1, var10, var22, var23, this.field45080)) {
            this.method37591(var4, var1, var10, Hand.OFF_HAND, var22, this.field45080, var23, var2, var3, var5);
         }
      }

      var3.finish();
   }

   private void method37591(
           AbstractClientPlayerEntity var1, float var2, float var3, Hand var4, float swingProgress, ItemStack var6, float equippedProgress, MatrixStack matrixStackIn, Class7733 var9, int var10
   ) {
      if (!Config.isShaders() || ! Shaders.method33153(var4)) {
         boolean var13 = var4 == Hand.MAIN_HAND;
         HandSide handside = var13 ? var1.getPrimaryHand() : var1.getPrimaryHand().opposite();
         matrixStackIn.push();
         if (var6.isEmpty()) {
            if (var13 && !var1.isInvisible()) {
               this.method37586(matrixStackIn, var9, var10, equippedProgress, swingProgress, handside);
            }
         } else if (var6.getItem() instanceof Class3316) {
            if (var13 && this.field45080.isEmpty()) {
               this.method37584(matrixStackIn, var9, var10, var3, equippedProgress, swingProgress);
            } else {
               this.method37583(matrixStackIn, var9, var10, equippedProgress, handside, swingProgress, var6);
            }
         } else if (var6.getItem() instanceof CrossbowItem) {
            boolean flag1 = CrossbowItem.isCharged(var6);
            boolean flag2 = handside == HandSide.RIGHT;
            int i = flag2 ? 1 : -1;
            if (var1.isHandActive() && var1.getItemInUseCount() > 0 && var1.getActiveHand() == var4) {
               this.transformSideFirstPerson(matrixStackIn, handside, equippedProgress);
               matrixStackIn.translate((double)((float)i * -0.4785682F), -0.094387F, 0.05731531F);
               matrixStackIn.rotate(Vector3f.XP.rotationDegrees(-11.935F));
               matrixStackIn.rotate(Vector3f.YP.rotationDegrees((float)i * 65.3F));
               matrixStackIn.rotate(Vector3f.ZP.rotationDegrees((float)i * -9.785F));
               float var33 = (float)var6.getUseDuration() - ((float)this.mc.player.getItemInUseCount() - var2 + 1.0F);
               float var37 = var33 / (float) CrossbowItem.method11767(var6);
               if (var37 > 1.0F) {
                  var37 = 1.0F;
               }

               if (var37 > 0.1F) {
                  float var41 = MathHelper.sin((var33 - 0.1F) * 1.3F);
                  float var43 = var37 - 0.1F;
                  float var45 = var41 * var43;
                  matrixStackIn.translate((double)(var45 * 0.0F), (double)(var45 * 0.004F), (double)(var45 * 0.0F));
               }

               matrixStackIn.translate((double)(var37 * 0.0F), (double)(var37 * 0.0F), (double)(var37 * 0.04F));
               matrixStackIn.scale(1.0F, 1.0F, 1.0F + var37 * 0.2F);
               matrixStackIn.rotate(Vector3f.YN.rotationDegrees((float)i * 45.0F));
            } else {
               float var32 = -0.4F * MathHelper.sin(MathHelper.sqrt(swingProgress) * (float) Math.PI);
               float var36 = 0.2F * MathHelper.sin(MathHelper.sqrt(swingProgress) * (float) (Math.PI * 2));
               float var40 = -0.2F * MathHelper.sin(swingProgress * (float) Math.PI);
               matrixStackIn.translate((double)((float)i * var32), (double)var36, (double)var40);
               this.transformSideFirstPerson(matrixStackIn, handside, equippedProgress);
               this.transformFirstPerson(matrixStackIn, handside, swingProgress);
               if (flag1 && swingProgress < 0.001F) {
                  matrixStackIn.translate((double)((float)i * -0.641864F), 0.0, 0.0);
                  matrixStackIn.rotate(Vector3f.YP.rotationDegrees((float)i * 10.0F));
               }
            }

            this.renderItemSide(var1, var6, flag2 ? ItemCameraTransformsTransformType.FIRST_PERSON_RIGHT_HAND : ItemCameraTransformsTransformType.FIRST_PERSON_LEFT_HAND, !flag2, matrixStackIn, var9, var10);
         } else {
            boolean flag2 = handside == HandSide.RIGHT;
            EventHandAnimation eventHandAnimation = new EventHandAnimation(true, swingProgress, equippedProgress, handside, var6, matrixStackIn);

            if (var1.isHandActive() && var1.getItemInUseCount() > 0 && var1.getActiveHand() == var4) {
               int i = flag2 ? 1 : -1;
               switch (Class6063.field26304[var6.getUseAction().ordinal()]) {
                  case 1:
                     this.transformSideFirstPerson(matrixStackIn, handside, equippedProgress);
                     break;
                  case 2:
                  case 3:
                     this.transformEatFirstPerson(matrixStackIn, var2, handside, var6);
                     this.transformSideFirstPerson(matrixStackIn, handside, equippedProgress);
                     break;
                  case 4:
                     this.transformSideFirstPerson(matrixStackIn, handside, equippedProgress);
                     break;
                  case 5:
                     this.transformSideFirstPerson(matrixStackIn, handside, equippedProgress);
                     matrixStackIn.translate((double)((float)i * -0.2785682F), 0.18344387F, 0.15731531F);
                     matrixStackIn.rotate(Vector3f.XP.rotationDegrees(-13.935F));
                     matrixStackIn.rotate(Vector3f.YP.rotationDegrees((float)i * 35.3F));
                     matrixStackIn.rotate(Vector3f.ZP.rotationDegrees((float)i * -9.785F));
                     float f8 = (float)var6.getUseDuration() - ((float)this.mc.player.getItemInUseCount() - var2 + 1.0F);
                     float f11 = f8 / 20.0F;
                     f11 = (f11 * f11 + f11 * 2.0F) / 3.0F;
                     if (f11 > 1.0F) {
                        f11 = 1.0F;
                     }

                     if (f11 > 0.1F) {
                        float f14 = MathHelper.sin((f8 - 0.1F) * 1.3F);
                        float f17 = f11 - 0.1F;
                        float f19 = f14 * f17;
                        matrixStackIn.translate((double)(f19 * 0.0F), (double)(f19 * 0.004F), (double)(f19 * 0.0F));
                     }

                     matrixStackIn.translate((double)(f11 * 0.0F), (double)(f11 * 0.0F), (double)(f11 * 0.04F));
                     matrixStackIn.scale(1.0F, 1.0F, 1.0F + f11 * 0.2F);
                     matrixStackIn.rotate(Vector3f.YN.rotationDegrees((float)i * 45.0F));
                     break;
                  case 6:
                     this.transformSideFirstPerson(matrixStackIn, handside, equippedProgress);
                     matrixStackIn.translate((double)((float)i * -0.5F), 0.7F, 0.1F);
                     matrixStackIn.rotate(Vector3f.XP.rotationDegrees(-55.0F));
                     matrixStackIn.rotate(Vector3f.YP.rotationDegrees((float)i * 35.3F));
                     matrixStackIn.rotate(Vector3f.ZP.rotationDegrees((float)i * -9.785F));
                     float f13 = (float)var6.getUseDuration() - ((float)this.mc.player.getItemInUseCount() - var2 + 1.0F);
                     float f16 = f13 / 10.0F;
                     if (f16 > 1.0F) {
                        f16 = 1.0F;
                     }

                     if (f16 > 0.1F) {
                        float f18 = MathHelper.sin((f13 - 0.1F) * 1.3F);
                        float f20 = f16 - 0.1F;
                        float f5 = f18 * f20;
                        matrixStackIn.translate((double)(f5 * 0.0F), (double)(f5 * 0.004F), (double)(f5 * 0.0F));
                     }

                     matrixStackIn.translate(0.0, 0.0, (double)(f16 * 0.2F));
                     matrixStackIn.scale(1.0F, 1.0F, 1.0F + f16 * 0.2F);
                     matrixStackIn.rotate(Vector3f.YN.rotationDegrees((float)i * 45.0F));
               }
            } else if (var1.isSpinAttacking()) {
               this.transformSideFirstPerson(matrixStackIn, handside, equippedProgress);
               int i = flag2 ? 1 : -1;
               matrixStackIn.translate((double)((float)i * -0.4F), 0.8F, 0.3F);
               matrixStackIn.rotate(Vector3f.YP.rotationDegrees((float)i * 65.0F));
               matrixStackIn.rotate(Vector3f.ZP.rotationDegrees((float)i * -85.0F));
            } else {
               Client.getInstance().getEventManager().call(eventHandAnimation);

               if (!eventHandAnimation.isCancelled()) {
                  float var28 = -0.4F * MathHelper.sin(MathHelper.sqrt(swingProgress) * (float) Math.PI);
                  float var18 = 0.2F * MathHelper.sin(MathHelper.sqrt(swingProgress) * (float) (Math.PI * 2));
                  float var19 = -0.2F * MathHelper.sin(swingProgress * (float) Math.PI);
                  int var20 = flag2 ? 1 : -1;
                  matrixStackIn.translate((double)((float)var20 * var28), (double)var18, (double)var19);
                  this.transformSideFirstPerson(matrixStackIn, handside, equippedProgress);
                  this.transformFirstPerson(matrixStackIn, handside, swingProgress);
               }
            }

            if (eventHandAnimation.isBlocking()) {
               if (var6.getItem() instanceof ShieldItem && Client.getInstance().getModuleManager().getModuleByClass(OldHitting.class).enabled)
                  return;
               this.renderItemSide(var1, var6, flag2 ? ItemCameraTransformsTransformType.FIRST_PERSON_RIGHT_HAND : ItemCameraTransformsTransformType.FIRST_PERSON_LEFT_HAND, !flag2, matrixStackIn, var9, var10);
            }

            eventHandAnimation = new EventHandAnimation(false, swingProgress, equippedProgress, handside, var6, matrixStackIn);
            Client.getInstance().getEventManager().call(eventHandAnimation);
         }

         matrixStackIn.pop();
      }
   }

   public void method37592() {
      this.field45082 = this.field45081;
      this.field45084 = this.field45083;
      ClientPlayerEntity var3 = this.mc.player;
      ItemStack var4 = var3.getHeldItemMainhand();
      ItemStack var5 = var3.getHeldItemOffhand();
      if (ItemStack.areItemStacksEqual(this.field45079, var4)) {
         this.field45079 = var4;
      }

      if (ItemStack.areItemStacksEqual(this.field45080, var5)) {
         this.field45080 = var5;
      }

      if (!var3.isRowingBoat()) {
         float var6 = var3.getCooledAttackStrength(1.0F);
         if (Reflector.field42896.exists()) {
            boolean var7 = Reflector.callBoolean(Reflector.field42896, this.field45079, var4, var3.inventory.currentItem);
            boolean var8 = Reflector.callBoolean(Reflector.field42896, this.field45080, var5, -1);
            if (!var7 && !Objects.equals(this.field45079, var4)) {
               this.field45079 = var4;
            }

            if (!var8 && !Objects.equals(this.field45080, var5)) {
               this.field45080 = var5;
            }
         }

         this.field45081 = this.field45081 + MathHelper.clamp((this.field45079 != var4 ? 0.0F : var6 * var6 * var6) - this.field45081, -0.4F, 0.4F);
         this.field45083 = this.field45083 + MathHelper.clamp((float)(this.field45080 != var5 ? 0 : 1) - this.field45083, -0.4F, 0.4F);
      } else {
         this.field45081 = MathHelper.clamp(this.field45081 - 0.4F, 0.0F, 1.0F);
         this.field45083 = MathHelper.clamp(this.field45083 - 0.4F, 0.0F, 1.0F);
      }

      if (this.field45081 < 0.1F) {
         this.field45079 = var4;
         if (Config.isShaders()) {
            Shaders.method33147(this.field45079);
         }
      }

      if (this.field45083 < 0.1F) {
         this.field45080 = var5;
         if (Config.isShaders()) {
            Shaders.method33148(this.field45080);
         }
      }
   }

   public void resetEquippedProgress(Hand var1) {
      if (var1 != Hand.MAIN_HAND) {
         this.field45083 = 0.0F;
      } else {
         this.field45081 = 0.0F;
      }
   }
}
