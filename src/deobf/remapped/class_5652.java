package remapped;

import java.util.Random;

public final class class_5652 {
   private static String[] field_28667;
   private final byte[] field_28671;
   public final double field_28668;
   public final double field_28670;
   public final double field_28669;

   public class_5652(Random var1) {
      this.field_28668 = var1.nextDouble() * 256.0;
      this.field_28670 = var1.nextDouble() * 256.0;
      this.field_28669 = var1.nextDouble() * 256.0;
      this.field_28671 = new byte[256];

      for (int var4 = 0; var4 < 256; var4++) {
         this.field_28671[var4] = (byte)var4;
      }

      for (int var7 = 0; var7 < 256; var7++) {
         int var5 = var1.nextInt(256 - var7);
         byte var6 = this.field_28671[var7];
         this.field_28671[var7] = this.field_28671[var7 + var5];
         this.field_28671[var7 + var5] = var6;
      }
   }

   public double method_25572(double var1, double var3, double var5, double var7, double var9) {
      double var13 = var1 + this.field_28668;
      double var15 = var3 + this.field_28670;
      double var17 = var5 + this.field_28669;
      int var19 = class_9299.method_42847(var13);
      int var20 = class_9299.method_42847(var15);
      int var21 = class_9299.method_42847(var17);
      double var22 = var13 - (double)var19;
      double var24 = var15 - (double)var20;
      double var26 = var17 - (double)var21;
      double var28 = class_9299.method_42845(var22);
      double var30 = class_9299.method_42845(var24);
      double var32 = class_9299.method_42845(var26);
      double var34;
      if (var7 == 0.0) {
         var34 = 0.0;
      } else {
         double var36 = Math.min(var9, var24);
         var34 = (double)class_9299.method_42847(var36 / var7) * var7;
      }

      return this.method_25568(var19, var20, var21, var22, var24 - var34, var26, var28, var30, var32);
   }

   private static double method_25571(int var0, double var1, double var3, double var5) {
      int var9 = var0 & 15;
      return class_6567.method_30009(class_6567.field_33494[var9], var1, var3, var5);
   }

   private int method_25570(int var1) {
      return this.field_28671[var1 & 0xFF] & 0xFF;
   }

   public double method_25568(int var1, int var2, int var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      int var18 = this.method_25570(var1) + var2;
      int var19 = this.method_25570(var18) + var3;
      int var20 = this.method_25570(var18 + 1) + var3;
      int var21 = this.method_25570(var1 + 1) + var2;
      int var22 = this.method_25570(var21) + var3;
      int var23 = this.method_25570(var21 + 1) + var3;
      double var24 = method_25571(this.method_25570(var19), var4, var6, var8);
      double var26 = method_25571(this.method_25570(var22), var4 - 1.0, var6, var8);
      double var28 = method_25571(this.method_25570(var20), var4, var6 - 1.0, var8);
      double var30 = method_25571(this.method_25570(var23), var4 - 1.0, var6 - 1.0, var8);
      double var32 = method_25571(this.method_25570(var19 + 1), var4, var6, var8 - 1.0);
      double var34 = method_25571(this.method_25570(var22 + 1), var4 - 1.0, var6, var8 - 1.0);
      double var36 = method_25571(this.method_25570(var20 + 1), var4, var6 - 1.0, var8 - 1.0);
      double var38 = method_25571(this.method_25570(var23 + 1), var4 - 1.0, var6 - 1.0, var8 - 1.0);
      return class_9299.method_42807(var10, var12, var14, var24, var26, var28, var30, var32, var34, var36, var38);
   }
}
