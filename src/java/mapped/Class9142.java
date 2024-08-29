package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

import java.util.Date;

public class Class9142 {
   private static String[] field42011;
   private static final Minecraft field42012 = Minecraft.getInstance();
   public static float field42013;
   public static float field42014;
   public static long field42015;

   public static float method34135(float var0, float var1, float var2) {
      float var5 = MathHelper.method37792(var1 - var0);
      if (var5 > var2) {
         var5 = var2;
      }

      if (var5 < -var2) {
         var5 = -var2;
      }

      return var0 + var5;
   }

   public static float[] method34136(Class880 var0, double var1, double var3, double var5) {
      double[] var9 = Class9047.method33642(var0);
      double var10 = var9[0] - var1;
      double var12 = var0.getPosY() - (double)field42012.player.method3393() - 0.02F + (double)var0.method3393() - var3;
      double var14 = var9[2] - var5;
      double var16 = (double) MathHelper.method37766(var10 * var10 + var14 * var14);
      float var18 = method34135(field42012.player.rotationYaw, (float)(Math.atan2(var14, var10) * 180.0 / Math.PI) - 90.0F, 360.0F);
      float var19 = method34135(field42012.player.rotationPitch, (float)(-(Math.atan2(var12, var16) * 180.0 / Math.PI)), 360.0F);
      return new float[]{var18, var19};
   }

   public static float[] method34137(Entity var0) {
      double var3 = field42012.player.getPosX() + (field42012.player.getPosX() - field42012.player.lastTickPosX) * (double)field42012.getRenderPartialTicks();
      double var5 = field42012.player.getPosZ() + (field42012.player.getPosZ() - field42012.player.lastTickPosZ) * (double)field42012.getRenderPartialTicks();
      double var7 = field42012.player.getPosY() + (field42012.player.getPosY() - field42012.player.lastTickPosY) * (double)field42012.getRenderPartialTicks();
      return method34138(var0, var3, var7, var5);
   }

   public static float[] method34138(Entity var0, double var1, double var3, double var5) {
      double var9 = var0.getPosX() + (var0.getPosX() - var0.lastTickPosX) * (double)field42012.getRenderPartialTicks();
      double var11 = var0.getPosZ() + (var0.getPosZ() - var0.lastTickPosZ) * (double)field42012.getRenderPartialTicks();
      double var13 = var0.getPosY() + (var0.getPosY() - var0.lastTickPosY) * (double)field42012.getRenderPartialTicks();
      double var15 = var9 - var1;
      double var17 = var13 - (double)field42012.player.method3393() - 0.02F + (double)var0.method3393() - var3;
      double var19 = var11 - var5;
      double var21 = (double) MathHelper.method37766(var15 * var15 + var19 * var19);
      float var23 = method34135(field42012.player.rotationYaw, (float)(Math.atan2(var19, var15) * 180.0 / Math.PI) - 90.0F, 360.0F);
      float var24 = method34135(field42012.player.rotationPitch, (float)(-(Math.atan2(var17, var21) * 180.0 / Math.PI)), 360.0F);
      return new float[]{var23, var24};
   }

   public static float[] method34139(Class880 var0, double var1, double var3, double var5) {
      double var9 = var0.getPosX() - var1 + 0.25 - Math.random() * 0.5;
      double var11 = var0.getPosY() - (double)field42012.player.method3393() - 0.02F + (double)var0.method3393() - var3 - Math.random();
      double var13 = var0.getPosZ() - var5 + 0.25 - Math.random() * 0.5;
      double var15 = (double) MathHelper.method37766(var9 * var9 + var13 * var13);
      float var17 = method34135(field42012.player.rotationYaw, (float)(Math.atan2(var13, var9) * 180.0 / Math.PI) - 90.0F, 360.0F);
      float var18 = method34135(field42012.player.rotationPitch, (float)(-(Math.atan2(var11, var15) * 180.0 / Math.PI)), 360.0F);
      return new float[]{var17, var18};
   }

   public static float[] method34140(Class880 var0, double var1, double var3, double var5) {
      double var9 = Math.sin((double)(System.currentTimeMillis() - 500L) / 521.0) * 0.2;
      double var11 = Math.sin((double)System.currentTimeMillis() / 300.0) * 0.65;
      double var13 = Math.cos(((double)System.currentTimeMillis() - 150.0) / 705.0) * 0.2;
      double var15 = var0.getPosX() - var1 + var9;
      double var17 = var0.getPosY() - var3 - (double)field42012.player.method3393() + (double)var0.method3393() - 0.02F - 0.6F - var11;
      double var19 = var0.getPosZ() - var5 + var13;
      double var21 = (double) MathHelper.method37766(var15 * var15 + var19 * var19);
      float var23 = method34135(field42012.player.rotationYaw, (float)(Math.atan2(var19, var15) * 180.0 / Math.PI) - 90.0F, 360.0F);
      float var24 = method34135(field42012.player.rotationPitch, (float)(-(Math.atan2(var17, var21) * 180.0 / Math.PI)), 360.0F);
      return new float[]{var23, var24};
   }

   public static float[] method34141(Class880 var0, double var1, double var3, double var5, float var7) {
      Entity var10 = Class5628.method17711(field42013, field42014, var7, 0.0);
      if (var10 == null) {
         if (field42015 <= new Date().getTime() - 500L) {
            double var11 = Math.sin((double)(System.currentTimeMillis() - 500L) / 521.0) * 0.2;
            double var13 = Math.sin((double)System.currentTimeMillis() / 421.0) * 0.65;
            double var15 = Math.cos(((double)System.currentTimeMillis() - 150.0) / 7051.0) * 0.2;
            double var17 = var0.getPosX() - var1 + var11;
            double var19 = var0.getPosY() - var3 - (double)field42012.player.method3393() + (double)var0.method3393() - 0.02F - 0.6F - var13;
            double var21 = var0.getPosZ() - var5 + var15;
            double var23 = (double) MathHelper.method37766(var17 * var17 + var21 * var21);
            field42013 = method34135(field42012.player.rotationYaw, (float)(Math.atan2(var21, var17) * 180.0 / Math.PI) - 90.0F, 360.0F);
            field42014 = method34135(field42012.player.rotationPitch, (float)(-(Math.atan2(var19, var23) * 180.0 / Math.PI)), 360.0F);
            return new float[]{field42013, field42014};
         } else {
            return new float[]{field42013, field42014};
         }
      } else {
         field42015 = new Date().getTime();
         return new float[]{field42013, field42014};
      }
   }

   public static float method34142(float var0, float var1) {
      float var4 = Math.abs(var0 - var1) % 360.0F;
      float var5 = !(var4 > 180.0F) ? var4 : 360.0F - var4;
      int var6 = var0 - var1 >= 0.0F && var0 - var1 <= 180.0F || var0 - var1 <= -180.0F && var0 - var1 >= -360.0F ? -1 : 1;
      return var5 * (float)var6;
   }

   public static float method34143(float var0, float var1) {
      float var4 = Math.abs(var0 - var1) % 360.0F;
      if (var4 > 180.0F) {
         var4 = 360.0F - var4;
      }

      return var4;
   }

   public static float[] method34144(double var0, double var2, double var4) {
      double var8 = var0 - field42012.player.getPosX();
      double var10 = var2 - field42012.player.getPosZ();
      double var12 = var4 - field42012.player.getPosY() - 1.2;
      double var14 = (double) MathHelper.method37766(var8 * var8 + var10 * var10);
      float var16 = (float)(Math.atan2(var10, var8) * 180.0 / Math.PI) - 90.0F;
      float var17 = (float)(-(Math.atan2(var12, var14) * 180.0 / Math.PI));
      return new float[]{var16, var17};
   }

   public static float[] method34145(Vector3d var0, Vector3d var1) {
      double var4 = var1.field18048 - var0.field18048;
      double var6 = var1.field18050 - var0.field18050;
      double var8 = var1.field18049 - var0.field18049;
      double var10 = (double) MathHelper.method37766(var4 * var4 + var6 * var6);
      float var12 = method34135(0.0F, (float)(Math.atan2(var6, var4) * 180.0 / Math.PI) - 90.0F, 360.0F);
      float var13 = method34135(field42012.player.rotationPitch, (float)(-(Math.atan2(var8, var10) * 180.0 / Math.PI)), 360.0F);
      return new float[]{var12, var13};
   }

   public static float[] method34146(Class880 var0) {
      double var3 = field42012.player.getPosX() + (field42012.player.getPosX() - field42012.player.lastTickPosX) * (double)field42012.getRenderPartialTicks();
      double var5 = field42012.player.getPosZ() + (field42012.player.getPosZ() - field42012.player.lastTickPosZ) * (double)field42012.getRenderPartialTicks();
      double var7 = field42012.player.getPosY() + (field42012.player.getPosY() - field42012.player.lastTickPosY) * (double)field42012.getRenderPartialTicks();
      double var9 = var0.getPosX() + (var0.getPosX() - var0.lastTickPosX) * (double)field42012.getRenderPartialTicks();
      double var11 = var0.getPosZ() + (var0.getPosZ() - var0.lastTickPosZ) * (double)field42012.getRenderPartialTicks();
      double var13 = var0.getPosY() + (var0.getPosY() - var0.lastTickPosY) * (double)field42012.getRenderPartialTicks();
      double var15 = (var9 - var0.lastTickPosX) * 0.4;
      double var17 = (var11 - var0.lastTickPosZ) * 0.4;
      double var19 = (double)field42012.player.method3275(var0);
      var19 -= var19 % 0.8;
      double var21 = 1.0;
      double var23 = 1.0;
      boolean var25 = var0.method3337();
      var21 = var19 / 0.8 * var15 * (!var25 ? 1.0 : 1.25);
      var23 = var19 / 0.8 * var17 * (!var25 ? 1.0 : 1.25);
      double var26 = var9 + var21 - var3;
      double var28 = var11 + var23 - var5;
      double var30 = var7 + (double)field42012.player.method3393() - (var13 + (double)var0.method3430());
      double var32 = (double)field42012.player.method3275(var0);
      float var34 = (float)Math.toDegrees(Math.atan2(var28, var26)) - 90.0F;
      double var35 = (double) MathHelper.method37766(var26 * var26 + var28 * var28);
      float var37 = (float)(-(Math.atan2(var30, var35) * 180.0 / Math.PI)) + (float)var32 * 0.14F;
      return new float[]{var34, -var37};
   }

   public static Class7461 method34147(Entity var0) {
      float[] var3 = method34138(var0, field42012.player.getPosX(), field42012.player.getPosY(), field42012.player.getPosZ());
      return new Class7461(var3[0], var3[1]);
   }

   public static Class7461 method34148(Vector3d var0) {
      float[] var3 = method34145(field42012.player.getPositionVec().method11339(0.0, (double)field42012.player.method3393(), 0.0), var0);
      return new Class7461(var3[0], var3[1]);
   }

   public static boolean method34149(Vector3d var0) {
      Vector3d var3 = new Vector3d(
         field42012.player.getPosX(), field42012.player.getPosY() + (double)field42012.player.method3393(), field42012.player.getPosZ()
      );
      Class6809 var4 = new Class6809(var3, var0, Class2271.field14775, Class1985.field12962, field42012.player);
      BlockRayTraceResult var5 = field42012.world.method7036(var4);
      boolean var6 = var5.getType() == RayTraceResult.Type.MISS || var5.getType() == RayTraceResult.Type.ENTITY;
      Block var7 = field42012.world.getBlockState(var5.getPos()).getBlock();
      return var6;
   }

   public static Class7461 method34150(Entity var0, boolean var1) {
      Vector3d var4 = Class5628.method17751(var0);
      if (var1 && !method34149(var4)) {
         for (int var5 = -1; var5 < 2; var5++) {
            double var6 = (double)var5;
            if (var5 != -1) {
               var6 *= var0.boundingBox.method19677();
            } else {
               var6 = (double)(var0.method3393() - 0.02F);
            }

            double var8 = var0.getPosX();
            double var10 = var0.getPosZ();
            double var12 = var0.getPosY() + var6 + 0.05;
            double var14 = var8 - field42012.player.getPosX();
            double var16 = var12 - (double)field42012.player.method3393() - 0.02F - field42012.player.getPosY();
            double var18 = var10 - field42012.player.getPosZ();
            double var20 = (double) MathHelper.method37766(var14 * var14 + var18 * var18);
            float var22 = method34135(field42012.player.rotationYaw, (float)(Math.atan2(var18, var14) * 180.0 / Math.PI) - 90.0F, 360.0F);
            float var23 = method34135(field42012.player.rotationPitch, (float)(-(Math.atan2(var16, var20) * 180.0 / Math.PI)), 360.0F);
            boolean var24 = method34149(new Vector3d(var8, var12, var10));
            if (var24) {
               return new Class7461(var22, var23);
            }

            for (int var25 = -1; var25 < 2; var25 += 2) {
               var8 = var0.getPosX() + (var0.getPosX() - var0.lastTickPosX) * (double)field42012.getRenderPartialTicks();
               var10 = var0.getPosZ() + (var0.getPosZ() - var0.lastTickPosZ) * (double)field42012.getRenderPartialTicks();
               var12 = var0.getPosY() + 0.05 + (var0.getPosY() - var0.lastTickPosY) * (double)field42012.getRenderPartialTicks() + var6;
               double var26 = var0.boundingBox.method19676() / 2.5 * (double)var25;
               double var28 = var0.boundingBox.method19678() / 2.5 * (double)var25;
               if (!(field42012.player.getPosX() < var8 + var26)) {
                  if (field42012.player.getPosX() > var8 + var26) {
                     if (!(field42012.player.getPosZ() < var10 - var28)) {
                        var8 += var26;
                     } else {
                        var8 -= var26;
                     }

                     if (!(field42012.player.getPosX() > var8 + var26)) {
                        var10 += var28;
                     } else {
                        var10 -= var28;
                     }
                  }
               } else {
                  if (!(field42012.player.getPosZ() > var10 + var28)) {
                     var8 -= var26;
                  } else {
                     var8 += var26;
                  }

                  if (!(field42012.player.getPosX() < var8 - var26)) {
                     var10 -= var28;
                  } else {
                     var10 += var28;
                  }
               }

               var14 = var8 - field42012.player.getPosX();
               var16 = var12 - (double)field42012.player.method3393() - 0.02 - field42012.player.getPosY();
               var18 = var10 - field42012.player.getPosZ();
               var20 = (double) MathHelper.method37766(var14 * var14 + var18 * var18);
               var22 = method34135(field42012.player.rotationYaw, (float)(Math.atan2(var18, var14) * 180.0 / Math.PI) - 90.0F, 360.0F);
               var23 = method34135(field42012.player.rotationPitch, (float)(-(Math.atan2(var16, var20) * 180.0 / Math.PI)), 360.0F);
               var24 = method34149(new Vector3d(var8, var12, var10));
               if (var24) {
                  return new Class7461(var22, var23);
               }
            }
         }

         return null;
      } else {
         return method34148(var4);
      }
   }

   public static float method34151(float var0, double var1, double var3) {
      double var7 = var1 - field42012.player.getPosX();
      double var9 = var3 - field42012.player.getPosZ();
      double var11 = 0.0;
      if (var9 < 0.0 && var7 < 0.0) {
         if (var7 != 0.0) {
            var11 = 90.0 + Math.toDegrees(Math.atan(var9 / var7));
         }
      } else if (var9 < 0.0 && var7 > 0.0) {
         if (var7 != 0.0) {
            var11 = -90.0 + Math.toDegrees(Math.atan(var9 / var7));
         }
      } else if (var9 != 0.0) {
         var11 = Math.toDegrees(-Math.atan(var7 / var9));
      }

      return MathHelper.method37792(-(var0 - (float)var11));
   }

   public static float method34152(float var0, float var1) {
      return MathHelper.method37792(-(var0 - var1));
   }

   private double method34153(double var1, double var3) {
      return var1 + Math.random() * (var3 - var1);
   }

   public static float method34154(float var0, Entity var1, double var2) {
      double var6 = var1.getPosX() - field42012.player.getPosX();
      double var8 = var1.getPosZ() - field42012.player.getPosZ();
      double var10 = var2 - 2.2 + (double)var1.method3393() - field42012.player.getPosY();
      double var12 = (double) MathHelper.method37766(var6 * var6 + var8 * var8);
      double var14 = -Math.toDegrees(Math.atan(var10 / var12));
      return -MathHelper.method37792(var0 - (float)var14) - 2.5F;
   }
}
