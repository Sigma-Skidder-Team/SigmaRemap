package mapped;

public class FogRenderer {
   private static String[] field40347;
   public static float field40348;
   public static float field40349;
   public static float field40350;
   private static int field40351 = -1;
   private static int field40352 = -1;
   private static long field40353 = -1L;
   public static boolean field40354 = false;

   public static void method32584(Class9624 var0, float var1, Class1656 var2, int var3, float var4) {
      Class7379 var7 = var0.method37512();
      if (!var7.method23486(Class8953.field40469)) {
         if (!var7.method23486(Class8953.field40470)) {
            float var8 = 0.25F + 0.75F * (float)var3 / 32.0F;
            var8 = 1.0F - (float)Math.pow((double)var8, 0.25);
            Vector3d var9 = var2.method6873(var0.method37505(), var1);
            var9 = Class9680.method37877(var9, var2, var0.method37509(), var1);
            float var10 = (float)var9.field18048;
            float var11 = (float)var9.field18049;
            float var12 = (float)var9.field18050;
            float var13 = MathHelper.method37777(MathHelper.method37764(var2.method7001(var1) * (float) (Math.PI * 2)) * 2.0F + 0.5F, 0.0F, 1.0F);
            Class6668 var14 = var2.method6822();
            Vector3d var15 = var0.method37504().method11337(2.0, 2.0, 2.0).method11344(0.25);
            Vector3d var16 = Class8430.method29626(
               var15, (var3x, var4x, var5) -> var2.method6830().method19299(Vector3d.method11327(var14.method20326(var3x, var4x, var5).method32509()), var13)
            );
            var16 = Class9680.method37876(var16, var2, var0.method37509(), var1);
            field40348 = (float)var16.method11320();
            field40349 = (float)var16.method11321();
            field40350 = (float)var16.method11322();
            if (var3 >= 4) {
               float var17 = !(MathHelper.method37763(var2.method6750(var1)) > 0.0F) ? 1.0F : -1.0F;
               Class7680 var18 = new Class7680(var17, 0.0F, 0.0F);
               float var21 = var0.method37516().method25279(var18);
               if (var21 < 0.0F) {
                  var21 = 0.0F;
               }

               if (var21 > 0.0F) {
                  float[] var22 = var2.method6830().method19302(var2.method7001(var1), var1);
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
         int var25 = var2.method7003(new BlockPos(var0.method37504())).method32521();
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
         float var45 = MathHelper.method37777((float)(var19 - field40353) / 5000.0F, 0.0F, 1.0F);
         float var48 = MathHelper.method37821(var45, (float)var40, (float)var32);
         float var54 = MathHelper.method37821(var45, (float)var41, (float)var38);
         float var55 = MathHelper.method37821(var45, (float)var43, (float)var39);
         field40348 = var48 / 255.0F;
         field40349 = var54 / 255.0F;
         field40350 = var55 / 255.0F;
         if (field40351 != var25) {
            field40351 = var25;
            field40352 = MathHelper.method37767(var48) << 16 | MathHelper.method37767(var54) << 8 | MathHelper.method37767(var55);
            field40353 = var19;
         }
      }

      double var49 = var0.method37504().field18049 * var2.getWorldInfo().method20053();
      if (var0.method37509() instanceof Class880 && ((Class880)var0.method37509()).method3033(Class8254.field35481)) {
         int var26 = ((Class880)var0.method37509()).method3034(Class8254.field35481).method8628();
         if (var26 >= 20) {
            var49 = 0.0;
         } else {
            var49 *= (double)(1.0F - (float)var26 / 20.0F);
         }
      }

      if (var49 < 1.0 && !var7.method23486(Class8953.field40470)) {
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

      if (!var7.method23486(Class8953.field40469)) {
         if (var0.method37509() instanceof Class880 && ((Class880)var0.method37509()).method3033(Class8254.field35482)) {
            float var27 = Class214.method750((Class880)var0.method37509(), var1);
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
         if (var0.method37509() instanceof ClientPlayerEntity) {
            ClientPlayerEntity var34 = (ClientPlayerEntity)var0.method37509();
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

      if (!var7.method23486(Class8953.field40469)) {
         if (var7.method23486(Class8953.field40470)) {
            Entity var29 = var0.method37509();
            Vector3d var36 = Class9680.method37872(var2, var29.getPosX(), var29.getPosY() + 1.0, var29.getPosZ());
            if (var36 != null) {
               field40348 = (float)var36.field18048;
               field40349 = (float)var36.field18049;
               field40350 = (float)var36.field18050;
            }
         }
      } else {
         Entity var30 = var0.method37509();
         Vector3d var37 = Class9680.method37871(var2, var30.getPosX(), var30.getPosY() + 1.0, var30.getPosZ());
         if (var37 != null) {
            field40348 = (float)var37.field18048;
            field40349 = (float)var37.field18049;
            field40350 = (float)var37.field18050;
         }
      }

      if (Class9299.field42800.method20241()) {
         Object var31 = Class9299.method35087(Class9299.field42800, var0, var1, field40348, field40349, field40350);
         Class9299.method35086(var31);
         field40348 = Class9299.method35067(var31, Class9299.field42801);
         field40349 = Class9299.method35067(var31, Class9299.field42802);
         field40350 = Class9299.method35067(var31, Class9299.field42803);
      }

      Class8981.method33048(field40348, field40349, field40350, 0.0F);
      RenderSystem.method27875(field40348, field40349, field40350, 0.0F);
   }

   public static void resetFog() {
      RenderSystem.method27844(0.0F);
      RenderSystem.method27842(Class2135.field13986);
   }

   public static void method32586(Class9624 var0, Class2040 var1, float var2, boolean var3) {
      method32587(var0, var1, var2, var3, 0.0F);
   }

   public static void method32587(Class9624 var0, Class2040 var1, float var2, boolean var3, float var4) {
      field40354 = false;
      Class7379 var7 = var0.method37512();
      Entity var8 = var0.method37509();
      float var9 = -1.0F;
      if (Class9299.field42876.method20214()) {
         var9 = Class9299.method35059(Class9299.field42876, var1, var0, var4, 0.1F);
      }

      if (!(var9 >= 0.0F)) {
         if (!var7.method23486(Class8953.field40469)) {
            float var10;
            float var11;
            if (!var7.method23486(Class8953.field40470)) {
               if (var8 instanceof Class880 && ((Class880)var8).method3033(Class8254.field35481)) {
                  int var12 = ((Class880)var8).method3034(Class8254.field35481).method8628();
                  float var13 = MathHelper.method37821(Math.min(1.0F, (float)var12 / 20.0F), var2, 5.0F);
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
                     var10 = var2 * Class7944.method26808();
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
            } else if (var8 instanceof Class880 && ((Class880)var8).method3033(Class8254.field35478)) {
               var10 = 0.0F;
               var11 = 3.0F;
            } else {
               var10 = 0.25F;
               var11 = 1.0F;
            }

            RenderSystem.method27845(var10);
            RenderSystem.method27846(var11);
            RenderSystem.method27842(Class2135.field13984);
            RenderSystem.method27904();
            if (Class9299.field42883.method20214()) {
               Class9299.method35055(Class9299.field42883, var1, var0, var4, var11);
            }
         } else {
            float var14 = 1.0F;
            var14 = 0.05F;
            if (var8 instanceof ClientPlayerEntity) {
               ClientPlayerEntity var16 = (ClientPlayerEntity)var8;
               var14 -= var16.method5416() * var16.method5416() * 0.03F;
               Biome var17 = var16.field5024.method7003(var16.method3432());
               if (var17.method32527() == Class100.field288) {
                  var14 += 0.005F;
               }
            }

            RenderSystem.method27844(var14);
            RenderSystem.method27842(Class2135.field13986);
         }
      } else {
         Class7414.method23782(var9);
      }
   }

   public static void method32588() {
      RenderSystem.method27847(2918, field40348, field40349, field40350, 1.0F);
      if (Class7944.method26921()) {
         Class8981.method33047(field40348, field40349, field40350);
      }
   }
}
