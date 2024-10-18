package mapped;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.util.Util;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.optifine.Config;
import net.optifine.shaders.Shaders;

public class FogRenderer {
   private static String[] field40347;
   public static float field40348;
   public static float field40349;
   public static float field40350;
   private static int field40351 = -1;
   private static int field40352 = -1;
   private static long field40353 = -1L;
   public static boolean field40354 = false;

   public static void method32584(ActiveRenderInfo var0, float var1, ClientWorld var2, int var3, float var4) {
      FluidState var7 = var0.method37512();
      if (!var7.method23486(FluidTags.field40469)) {
         if (!var7.method23486(FluidTags.field40470)) {
            float var8 = 0.25F + 0.75F * (float)var3 / 32.0F;
            var8 = 1.0F - (float)Math.pow((double)var8, 0.25);
            Vector3d var9 = var2.method6873(var0.getBlockPos(), var1);
            var9 = Class9680.method37877(var9, var2, var0.getRenderViewEntity(), var1);
            float var10 = (float)var9.x;
            float var11 = (float)var9.y;
            float var12 = (float)var9.z;
            float var13 = MathHelper.clamp(MathHelper.cos(var2.method7001(var1) * (float) (Math.PI * 2)) * 2.0F + 0.5F, 0.0F, 1.0F);
            BiomeManager var14 = var2.getBiomeManager();
            Vector3d var15 = var0.getPos().method11337(2.0, 2.0, 2.0).scale(0.25);
            Vector3d var16 = Class8430.method29626(
               var15, (var3x, var4x, var5) -> var2.func_239132_a_().method19299(Vector3d.unpack(var14.getBiomeAtPosition(var3x, var4x, var5).getFogColor()), var13)
            );
            var16 = Class9680.method37876(var16, var2, var0.getRenderViewEntity(), var1);
            field40348 = (float)var16.getX();
            field40349 = (float)var16.getY();
            field40350 = (float)var16.getZ();
            if (var3 >= 4) {
               float var17 = !(MathHelper.sin(var2.method6750(var1)) > 0.0F) ? 1.0F : -1.0F;
               Vector3f var18 = new Vector3f(var17, 0.0F, 0.0F);
               float var21 = var0.method37516().method25279(var18);
               if (var21 < 0.0F) {
                  var21 = 0.0F;
               }

               if (var21 > 0.0F) {
                  float[] var22 = var2.func_239132_a_().func_230492_a_(var2.method7001(var1), var1);
                  if (var22 != null) {
                     var21 *= var22[3];
                     field40348 = field40348 * (1.0F - var21) + var22[0] * var21;
                     field40349 = field40349 * (1.0F - var21) + var22[1] * var21;
                     field40350 = field40350 * (1.0F - var21) + var22[2] * var21;
                  }
               }
            }

            field40348 = field40348 + (var10 - field40348) * var8;
            field40349 = field40349 + (var11 - field40349) * var8;
            field40350 = field40350 + (var12 - field40350) * var8;
            float var44 = var2.method6792(var1);
            if (var44 > 0.0F) {
               float var46 = 1.0F - var44 * 0.5F;
               float var52 = 1.0F - var44 * 0.4F;
               field40348 *= var46;
               field40349 *= var46;
               field40350 *= var52;
            }

            float var47 = var2.method6790(var1);
            if (var47 > 0.0F) {
               float var53 = 1.0F - var47 * 0.5F;
               field40348 *= var53;
               field40349 *= var53;
               field40350 *= var53;
            }

            field40353 = -1L;
         } else {
            field40348 = 0.6F;
            field40349 = 0.1F;
            field40350 = 0.0F;
            field40353 = -1L;
         }
      } else {
         long var19 = Util.milliTime();
         int var25 = var2.getBiome(new BlockPos(var0.getPos())).getWaterFogColor();
         if (field40353 < 0L) {
            field40351 = var25;
            field40352 = var25;
            field40353 = var19;
         }

         int var32 = field40351 >> 16 & 0xFF;
         int var38 = field40351 >> 8 & 0xFF;
         int var39 = field40351 & 0xFF;
         int var40 = field40352 >> 16 & 0xFF;
         int var41 = field40352 >> 8 & 0xFF;
         int var43 = field40352 & 0xFF;
         float var45 = MathHelper.clamp((float)(var19 - field40353) / 5000.0F, 0.0F, 1.0F);
         float var48 = MathHelper.lerp(var45, (float)var40, (float)var32);
         float var54 = MathHelper.lerp(var45, (float)var41, (float)var38);
         float var55 = MathHelper.lerp(var45, (float)var43, (float)var39);
         field40348 = var48 / 255.0F;
         field40349 = var54 / 255.0F;
         field40350 = var55 / 255.0F;
         if (field40351 != var25) {
            field40351 = var25;
            field40352 = MathHelper.floor(var48) << 16 | MathHelper.floor(var54) << 8 | MathHelper.floor(var55);
            field40353 = var19;
         }
      }

      double var49 = var0.getPos().y * var2.getWorldInfo().method20053();
      if (var0.getRenderViewEntity() instanceof LivingEntity && ((LivingEntity)var0.getRenderViewEntity()).isPotionActive(Effects.BLINDNESS)) {
         int var26 = ((LivingEntity)var0.getRenderViewEntity()).getActivePotionEffect(Effects.BLINDNESS).method8628();
         if (var26 >= 20) {
            var49 = 0.0;
         } else {
            var49 *= (double)(1.0F - (float)var26 / 20.0F);
         }
      }

      if (var49 < 1.0 && !var7.method23486(FluidTags.field40470)) {
         if (var49 < 0.0) {
            var49 = 0.0;
         }

         var49 *= var49;
         field40348 = (float)((double)field40348 * var49);
         field40349 = (float)((double)field40349 * var49);
         field40350 = (float)((double)field40350 * var49);
      }

      if (var4 > 0.0F) {
         field40348 = field40348 * (1.0F - var4) + field40348 * 0.7F * var4;
         field40349 = field40349 * (1.0F - var4) + field40349 * 0.6F * var4;
         field40350 = field40350 * (1.0F - var4) + field40350 * 0.6F * var4;
      }

      if (!var7.method23486(FluidTags.field40469)) {
         if (var0.getRenderViewEntity() instanceof LivingEntity && ((LivingEntity)var0.getRenderViewEntity()).isPotionActive(Effects.NIGHT_VISION)) {
            float var27 = GameRenderer.method750((LivingEntity)var0.getRenderViewEntity(), var1);
            float var33 = Math.min(1.0F / field40348, Math.min(1.0F / field40349, 1.0F / field40350));
            if (Float.isInfinite(var33)) {
               var33 = Math.nextAfter(var33, 0.0);
            }

            field40348 = field40348 * (1.0F - var27) + field40348 * var33 * var27;
            field40349 = field40349 * (1.0F - var27) + field40349 * var33 * var27;
            field40350 = field40350 * (1.0F - var27) + field40350 * var33 * var27;
         }
      } else {
         float var28 = 0.0F;
         if (var0.getRenderViewEntity() instanceof ClientPlayerEntity) {
            ClientPlayerEntity var34 = (ClientPlayerEntity)var0.getRenderViewEntity();
            var28 = var34.method5416();
         }

         float var35 = Math.min(1.0F / field40348, Math.min(1.0F / field40349, 1.0F / field40350));
         if (Float.isInfinite(var35)) {
            var35 = Math.nextAfter(var35, 0.0);
         }

         field40348 = field40348 * (1.0F - var28) + field40348 * var35 * var28;
         field40349 = field40349 * (1.0F - var28) + field40349 * var35 * var28;
         field40350 = field40350 * (1.0F - var28) + field40350 * var35 * var28;
      }

      if (!var7.method23486(FluidTags.field40469)) {
         if (var7.method23486(FluidTags.field40470)) {
            Entity var29 = var0.getRenderViewEntity();
            Vector3d var36 = Class9680.method37872(var2, var29.getPosX(), var29.getPosY() + 1.0, var29.getPosZ());
            if (var36 != null) {
               field40348 = (float)var36.x;
               field40349 = (float)var36.y;
               field40350 = (float)var36.z;
            }
         }
      } else {
         Entity var30 = var0.getRenderViewEntity();
         Vector3d var37 = Class9680.method37871(var2, var30.getPosX(), var30.getPosY() + 1.0, var30.getPosZ());
         if (var37 != null) {
            field40348 = (float)var37.x;
            field40349 = (float)var37.y;
            field40350 = (float)var37.z;
         }
      }

      if (Reflector.field42800.exists()) {
         Object var31 = Reflector.method35087(Reflector.field42800, var0, var1, field40348, field40349, field40350);
         Reflector.method35086(var31);
         field40348 = Reflector.callFloat(var31, Reflector.field42801);
         field40349 = Reflector.callFloat(var31, Reflector.field42802);
         field40350 = Reflector.callFloat(var31, Reflector.field42803);
      }

      Shaders.method33048(field40348, field40349, field40350, 0.0F);
      RenderSystem.clearColor(field40348, field40349, field40350, 0.0F);
   }

   public static void resetFog() {
      RenderSystem.method27844(0.0F);
      RenderSystem.method27842(Class2135.field13986);
   }

   public static void method32586(ActiveRenderInfo var0, Class2040 var1, float var2, boolean var3) {
      method32587(var0, var1, var2, var3, 0.0F);
   }

   public static void method32587(ActiveRenderInfo var0, Class2040 var1, float var2, boolean var3, float var4) {
      field40354 = false;
      FluidState var7 = var0.method37512();
      Entity var8 = var0.getRenderViewEntity();
      float var9 = -1.0F;
      if (Reflector.field42876.exists()) {
         var9 = Reflector.method35059(Reflector.field42876, var1, var0, var4, 0.1F);
      }

      if (!(var9 >= 0.0F)) {
         if (!var7.method23486(FluidTags.field40469)) {
            float var10;
            float var11;
            if (!var7.method23486(FluidTags.field40470)) {
               if (var8 instanceof LivingEntity && ((LivingEntity)var8).isPotionActive(Effects.BLINDNESS)) {
                  int var12 = ((LivingEntity)var8).getActivePotionEffect(Effects.BLINDNESS).method8628();
                  float var13 = MathHelper.lerp(Math.min(1.0F, (float)var12 / 20.0F), var2, 5.0F);
                  if (var1 != Class2040.field13337) {
                     var10 = var13 * 0.25F;
                     var11 = var13;
                  } else {
                     var10 = 0.0F;
                     var11 = var13 * 0.8F;
                  }
               } else if (!var3) {
                  if (var1 != Class2040.field13337) {
                     field40354 = true;
                     var10 = var2 * Config.method26808();
                     var11 = var2;
                  } else {
                     field40354 = true;
                     var10 = 0.0F;
                     var11 = var2;
                  }
               } else {
                  field40354 = true;
                  var10 = var2 * 0.05F;
                  var11 = Math.min(var2, 192.0F) * 0.5F;
               }
            } else if (var8 instanceof LivingEntity && ((LivingEntity)var8).isPotionActive(Effects.FIRE_RESISTANCE)) {
               var10 = 0.0F;
               var11 = 3.0F;
            } else {
               var10 = 0.25F;
               var11 = 1.0F;
            }

            RenderSystem.method27845(var10);
            RenderSystem.method27846(var11);
            RenderSystem.method27842(Class2135.field13984);
            RenderSystem.setupNvFogDistance();
            if (Reflector.field42883.exists()) {
               Reflector.callVoid(Reflector.field42883, var1, var0, var4, var11);
            }
         } else {
            float var14 = 1.0F;
            var14 = 0.05F;
            if (var8 instanceof ClientPlayerEntity) {
               ClientPlayerEntity var16 = (ClientPlayerEntity)var8;
               var14 -= var16.method5416() * var16.method5416() * 0.03F;
               Biome var17 = var16.world.getBiome(var16.getPosition());
               if (var17.getCategory() == Biome.Category.SWAMP) {
                  var14 += 0.005F;
               }
            }

            RenderSystem.method27844(var14);
            RenderSystem.method27842(Class2135.field13986);
         }
      } else {
         GlStateManager.method23782(var9);
      }
   }

   public static void method32588() {
      RenderSystem.method27847(2918, field40348, field40349, field40350, 1.0F);
      if (Config.isShaders()) {
         Shaders.method33047(field40348, field40349, field40350);
      }
   }
}
