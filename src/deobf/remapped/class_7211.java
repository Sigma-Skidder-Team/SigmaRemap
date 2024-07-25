package remapped;

import java.util.Date;

public class class_7211 {
   private static String[] field_37038;
   private static final MinecraftClient field_37040 = MinecraftClient.getInstance();
   public static float field_37037;
   public static float field_37039;
   public static long field_37036;

   public static float method_33002(float var0, float var1, float var2) {
      float var5 = class_9299.method_42810(var1 - var0);
      if (var5 > var2) {
         var5 = var2;
      }

      if (var5 < -var2) {
         var5 = -var2;
      }

      return var0 + var5;
   }

   public static float[] method_33000(class_5834 var0, double var1, double var3, double var5) {
      double[] var9 = class_6811.method_31263(var0);
      double var10 = var9[0] - var1;
      double var12 = var0.method_37309() - (double)field_37040.thePlayer.method_37277() - 0.02F + (double)var0.method_37277() - var3;
      double var14 = var9[2] - var5;
      double var16 = (double)class_9299.method_42842(var10 * var10 + var14 * var14);
      float var18 = method_33002(field_37040.thePlayer.rotationYaw, (float)(Math.atan2(var14, var10) * 180.0 / Math.PI) - 90.0F, 360.0F);
      float var19 = method_33002(field_37040.thePlayer.rotationPitch, (float)(-(Math.atan2(var12, var16) * 180.0 / Math.PI)), 360.0F);
      return new float[]{var18, var19};
   }

   public static float[] method_33013(Entity var0) {
      double var3 = field_37040.thePlayer.method_37302()
         + (field_37040.thePlayer.method_37302() - field_37040.thePlayer.field_41754) * (double)field_37040.method_8554();
      double var5 = field_37040.thePlayer.method_37156()
         + (field_37040.thePlayer.method_37156() - field_37040.thePlayer.field_41724) * (double)field_37040.method_8554();
      double var7 = field_37040.thePlayer.method_37309()
         + (field_37040.thePlayer.method_37309() - field_37040.thePlayer.field_41713) * (double)field_37040.method_8554();
      return method_33014(var0, var3, var7, var5);
   }

   public static float[] method_33014(Entity var0, double var1, double var3, double var5) {
      double var9 = var0.method_37302() + (var0.method_37302() - var0.field_41754) * (double)field_37040.method_8554();
      double var11 = var0.method_37156() + (var0.method_37156() - var0.field_41724) * (double)field_37040.method_8554();
      double var13 = var0.method_37309() + (var0.method_37309() - var0.field_41713) * (double)field_37040.method_8554();
      double var15 = var9 - var1;
      double var17 = var13 - (double)field_37040.thePlayer.method_37277() - 0.02F + (double)var0.method_37277() - var3;
      double var19 = var11 - var5;
      double var21 = (double)class_9299.method_42842(var15 * var15 + var19 * var19);
      float var23 = method_33002(field_37040.thePlayer.rotationYaw, (float)(Math.atan2(var19, var15) * 180.0 / Math.PI) - 90.0F, 360.0F);
      float var24 = method_33002(field_37040.thePlayer.rotationPitch, (float)(-(Math.atan2(var17, var21) * 180.0 / Math.PI)), 360.0F);
      return new float[]{var23, var24};
   }

   public static float[] method_33004(class_5834 var0, double var1, double var3, double var5) {
      double var9 = var0.method_37302() - var1 + 0.25 - Math.random() * 0.5;
      double var11 = var0.method_37309() - (double)field_37040.thePlayer.method_37277() - 0.02F + (double)var0.method_37277() - var3 - Math.random();
      double var13 = var0.method_37156() - var5 + 0.25 - Math.random() * 0.5;
      double var15 = (double)class_9299.method_42842(var9 * var9 + var13 * var13);
      float var17 = method_33002(field_37040.thePlayer.rotationYaw, (float)(Math.atan2(var13, var9) * 180.0 / Math.PI) - 90.0F, 360.0F);
      float var18 = method_33002(field_37040.thePlayer.rotationPitch, (float)(-(Math.atan2(var11, var15) * 180.0 / Math.PI)), 360.0F);
      return new float[]{var17, var18};
   }

   public static float[] method_32996(class_5834 var0, double var1, double var3, double var5) {
      double var9 = Math.sin((double)(System.currentTimeMillis() - 500L) / 521.0) * 0.2;
      double var11 = Math.sin((double)System.currentTimeMillis() / 300.0) * 0.65;
      double var13 = Math.cos(((double)System.currentTimeMillis() - 150.0) / 705.0) * 0.2;
      double var15 = var0.method_37302() - var1 + var9;
      double var17 = var0.method_37309() - var3 - (double)field_37040.thePlayer.method_37277() + (double)var0.method_37277() - 0.02F - 0.6F - var11;
      double var19 = var0.method_37156() - var5 + var13;
      double var21 = (double)class_9299.method_42842(var15 * var15 + var19 * var19);
      float var23 = method_33002(field_37040.thePlayer.rotationYaw, (float)(Math.atan2(var19, var15) * 180.0 / Math.PI) - 90.0F, 360.0F);
      float var24 = method_33002(field_37040.thePlayer.rotationPitch, (float)(-(Math.atan2(var17, var21) * 180.0 / Math.PI)), 360.0F);
      return new float[]{var23, var24};
   }

   public static float[] method_32995(class_5834 var0, double var1, double var3, double var5, float var7) {
      Entity var10 = class_314.method_1458(field_37037, field_37039, var7, 0.0);
      if (var10 == null) {
         if (field_37036 <= new Date().getTime() - 500L) {
            double var11 = Math.sin((double)(System.currentTimeMillis() - 500L) / 521.0) * 0.2;
            double var13 = Math.sin((double)System.currentTimeMillis() / 421.0) * 0.65;
            double var15 = Math.cos(((double)System.currentTimeMillis() - 150.0) / 7051.0) * 0.2;
            double var17 = var0.method_37302() - var1 + var11;
            double var19 = var0.method_37309() - var3 - (double)field_37040.thePlayer.method_37277() + (double)var0.method_37277() - 0.02F - 0.6F - var13;
            double var21 = var0.method_37156() - var5 + var15;
            double var23 = (double)class_9299.method_42842(var17 * var17 + var21 * var21);
            field_37037 = method_33002(field_37040.thePlayer.rotationYaw, (float)(Math.atan2(var21, var17) * 180.0 / Math.PI) - 90.0F, 360.0F);
            field_37039 = method_33002(field_37040.thePlayer.rotationPitch, (float)(-(Math.atan2(var19, var23) * 180.0 / Math.PI)), 360.0F);
            return new float[]{field_37037, field_37039};
         } else {
            return new float[]{field_37037, field_37039};
         }
      } else {
         field_37036 = new Date().getTime();
         return new float[]{field_37037, field_37039};
      }
   }

   public static float method_33011(float var0, float var1) {
      float var4 = Math.abs(var0 - var1) % 360.0F;
      float var5 = !(var4 > 180.0F) ? var4 : 360.0F - var4;
      int var6 = var0 - var1 >= 0.0F && var0 - var1 <= 180.0F || var0 - var1 <= -180.0F && var0 - var1 >= -360.0F ? -1 : 1;
      return var5 * (float)var6;
   }

   public static float method_32998(float var0, float var1) {
      float var4 = Math.abs(var0 - var1) % 360.0F;
      if (var4 > 180.0F) {
         var4 = 360.0F - var4;
      }

      return var4;
   }

   public static float[] method_33006(double var0, double var2, double var4) {
      double var8 = var0 - field_37040.thePlayer.method_37302();
      double var10 = var2 - field_37040.thePlayer.method_37156();
      double var12 = var4 - field_37040.thePlayer.method_37309() - 1.2;
      double var14 = (double)class_9299.method_42842(var8 * var8 + var10 * var10);
      float var16 = (float)(Math.atan2(var10, var8) * 180.0 / Math.PI) - 90.0F;
      float var17 = (float)(-(Math.atan2(var12, var14) * 180.0 / Math.PI));
      return new float[]{var16, var17};
   }

   public static float[] method_33007(class_1343 var0, class_1343 var1) {
      double var4 = var1.field_7336 - var0.field_7336;
      double var6 = var1.field_7334 - var0.field_7334;
      double var8 = var1.field_7333 - var0.field_7333;
      double var10 = (double)class_9299.method_42842(var4 * var4 + var6 * var6);
      float var12 = method_33002(0.0F, (float)(Math.atan2(var6, var4) * 180.0 / Math.PI) - 90.0F, 360.0F);
      float var13 = method_33002(field_37040.thePlayer.rotationPitch, (float)(-(Math.atan2(var8, var10) * 180.0 / Math.PI)), 360.0F);
      return new float[]{var12, var13};
   }

   public static float[] method_33005(class_5834 var0) {
      double var3 = field_37040.thePlayer.method_37302()
         + (field_37040.thePlayer.method_37302() - field_37040.thePlayer.field_41754) * (double)field_37040.method_8554();
      double var5 = field_37040.thePlayer.method_37156()
         + (field_37040.thePlayer.method_37156() - field_37040.thePlayer.field_41724) * (double)field_37040.method_8554();
      double var7 = field_37040.thePlayer.method_37309()
         + (field_37040.thePlayer.method_37309() - field_37040.thePlayer.field_41713) * (double)field_37040.method_8554();
      double var9 = var0.method_37302() + (var0.method_37302() - var0.field_41754) * (double)field_37040.method_8554();
      double var11 = var0.method_37156() + (var0.method_37156() - var0.field_41724) * (double)field_37040.method_8554();
      double var13 = var0.method_37309() + (var0.method_37309() - var0.field_41713) * (double)field_37040.method_8554();
      double var15 = (var9 - var0.field_41754) * 0.4;
      double var17 = (var11 - var0.field_41724) * 0.4;
      double var19 = (double)field_37040.thePlayer.method_37175(var0);
      var19 -= var19 % 0.8;
      double var21 = 1.0;
      double var23 = 1.0;
      boolean var25 = var0.method_37321();
      var21 = var19 / 0.8 * var15 * (!var25 ? 1.0 : 1.25);
      var23 = var19 / 0.8 * var17 * (!var25 ? 1.0 : 1.25);
      double var26 = var9 + var21 - var3;
      double var28 = var11 + var23 - var5;
      double var30 = var7 + (double)field_37040.thePlayer.method_37277() - (var13 + (double)var0.method_37074());
      double var32 = (double)field_37040.thePlayer.method_37175(var0);
      float var34 = (float)Math.toDegrees(Math.atan2(var28, var26)) - 90.0F;
      double var35 = (double)class_9299.method_42842(var26 * var26 + var28 * var28);
      float var37 = (float)(-(Math.atan2(var30, var35) * 180.0 / Math.PI)) + (float)var32 * 0.14F;
      return new float[]{var34, -var37};
   }

   public static class_1988 method_32999(Entity var0) {
      float[] var3 = method_33014(var0, field_37040.thePlayer.method_37302(), field_37040.thePlayer.method_37309(), field_37040.thePlayer.method_37156());
      return new class_1988(var3[0], var3[1]);
   }

   public static class_1988 method_33015(class_1343 var0) {
      float[] var3 = method_33007(field_37040.thePlayer.method_37245().method_6214(0.0, (double)field_37040.thePlayer.method_37277(), 0.0), var0);
      return new class_1988(var3[0], var3[1]);
   }

   public static boolean method_32997(class_1343 var0) {
      class_1343 var3 = new class_1343(
         field_37040.thePlayer.method_37302(),
         field_37040.thePlayer.method_37309() + (double)field_37040.thePlayer.method_37277(),
         field_37040.thePlayer.method_37156()
      );
      class_972 var4 = new class_972(var3, var0, class_3132.field_15549, class_9583.field_48747, field_37040.thePlayer);
      class_9529 var5 = field_37040.theWorld.method_28265(var4);
      boolean var6 = var5.method_33990() == class_1430.field_7721 || var5.method_33990() == class_1430.field_7718;
      class_6414 var7 = field_37040.theWorld.method_28262(var5.method_43955()).method_8360();
      return var6;
   }

   public static class_1988 method_33010(Entity var0, boolean var1) {
      class_1343 var4 = class_314.method_1429(var0);
      if (var1 && !method_32997(var4)) {
         for (int var5 = -1; var5 < 2; var5++) {
            double var6 = (double)var5;
            if (var5 != -1) {
               var6 *= var0.field_41712.method_18901();
            } else {
               var6 = (double)(var0.method_37277() - 0.02F);
            }

            double var8 = var0.method_37302();
            double var10 = var0.method_37156();
            double var12 = var0.method_37309() + var6 + 0.05;
            double var14 = var8 - field_37040.thePlayer.method_37302();
            double var16 = var12 - (double)field_37040.thePlayer.method_37277() - 0.02F - field_37040.thePlayer.method_37309();
            double var18 = var10 - field_37040.thePlayer.method_37156();
            double var20 = (double)class_9299.method_42842(var14 * var14 + var18 * var18);
            float var22 = method_33002(field_37040.thePlayer.rotationYaw, (float)(Math.atan2(var18, var14) * 180.0 / Math.PI) - 90.0F, 360.0F);
            float var23 = method_33002(field_37040.thePlayer.rotationPitch, (float)(-(Math.atan2(var16, var20) * 180.0 / Math.PI)), 360.0F);
            boolean var24 = method_32997(new class_1343(var8, var12, var10));
            if (var24) {
               return new class_1988(var22, var23);
            }

            for (byte var25 = -1; var25 < 2; var25 += 2) {
               var8 = var0.method_37302() + (var0.method_37302() - var0.field_41754) * (double)field_37040.method_8554();
               var10 = var0.method_37156() + (var0.method_37156() - var0.field_41724) * (double)field_37040.method_8554();
               var12 = var0.method_37309() + 0.05 + (var0.method_37309() - var0.field_41713) * (double)field_37040.method_8554() + var6;
               double var26 = var0.field_41712.method_18910() / 2.5 * (double)var25;
               double var28 = var0.field_41712.method_18921() / 2.5 * (double)var25;
               if (!(field_37040.thePlayer.method_37302() < var8 + var26)) {
                  if (field_37040.thePlayer.method_37302() > var8 + var26) {
                     if (!(field_37040.thePlayer.method_37156() < var10 - var28)) {
                        var8 += var26;
                     } else {
                        var8 -= var26;
                     }

                     if (!(field_37040.thePlayer.method_37302() > var8 + var26)) {
                        var10 += var28;
                     } else {
                        var10 -= var28;
                     }
                  }
               } else {
                  if (!(field_37040.thePlayer.method_37156() > var10 + var28)) {
                     var8 -= var26;
                  } else {
                     var8 += var26;
                  }

                  if (!(field_37040.thePlayer.method_37302() < var8 - var26)) {
                     var10 -= var28;
                  } else {
                     var10 += var28;
                  }
               }

               var14 = var8 - field_37040.thePlayer.method_37302();
               var16 = var12 - (double)field_37040.thePlayer.method_37277() - 0.02 - field_37040.thePlayer.method_37309();
               var18 = var10 - field_37040.thePlayer.method_37156();
               var20 = (double)class_9299.method_42842(var14 * var14 + var18 * var18);
               var22 = method_33002(field_37040.thePlayer.rotationYaw, (float)(Math.atan2(var18, var14) * 180.0 / Math.PI) - 90.0F, 360.0F);
               var23 = method_33002(field_37040.thePlayer.rotationPitch, (float)(-(Math.atan2(var16, var20) * 180.0 / Math.PI)), 360.0F);
               var24 = method_32997(new class_1343(var8, var12, var10));
               if (var24) {
                  return new class_1988(var22, var23);
               }
            }
         }

         return null;
      } else {
         return method_33015(var4);
      }
   }

   public static float method_33008(float var0, double var1, double var3) {
      double var7 = var1 - field_37040.thePlayer.method_37302();
      double var9 = var3 - field_37040.thePlayer.method_37156();
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

      return class_9299.method_42810(-(var0 - (float)var11));
   }

   public static float method_33009(float var0, float var1) {
      return class_9299.method_42810(-(var0 - var1));
   }

   private double method_33001(double var1, double var3) {
      return var1 + Math.random() * (var3 - var1);
   }

   public static float method_33003(float var0, Entity var1, double var2) {
      double var6 = var1.method_37302() - field_37040.thePlayer.method_37302();
      double var8 = var1.method_37156() - field_37040.thePlayer.method_37156();
      double var10 = var2 - 2.2 + (double)var1.method_37277() - field_37040.thePlayer.method_37309();
      double var12 = (double)class_9299.method_42842(var6 * var6 + var8 * var8);
      double var14 = -Math.toDegrees(Math.atan(var10 / var12));
      return -class_9299.method_42810(var0 - (float)var14) - 2.5F;
   }
}
