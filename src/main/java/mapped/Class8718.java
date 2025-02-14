package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Random;

public final class Class8718 {
   private static String[] field39335;
   private final byte[] field39336;
   public final double field39337;
   public final double field39338;
   public final double field39339;

   public Class8718(Random var1) {
      this.field39337 = var1.nextDouble() * 256.0;
      this.field39338 = var1.nextDouble() * 256.0;
      this.field39339 = var1.nextDouble() * 256.0;
      this.field39336 = new byte[256];

      for (int var4 = 0; var4 < 256; var4++) {
         this.field39336[var4] = (byte)var4;
      }

      for (int var7 = 0; var7 < 256; var7++) {
         int var5 = var1.nextInt(256 - var7);
         byte var6 = this.field39336[var7];
         this.field39336[var7] = this.field39336[var7 + var5];
         this.field39336[var7 + var5] = var6;
      }
   }

   public double method31444(double var1, double var3, double var5, double var7, double var9) {
      double var13 = var1 + this.field39337;
      double var15 = var3 + this.field39338;
      double var17 = var5 + this.field39339;
      int var19 = MathHelper.floor(var13);
      int var20 = MathHelper.floor(var15);
      int var21 = MathHelper.floor(var17);
      double var22 = var13 - (double)var19;
      double var24 = var15 - (double)var20;
      double var26 = var17 - (double)var21;
      double var28 = MathHelper.method37825(var22);
      double var30 = MathHelper.method37825(var24);
      double var32 = MathHelper.method37825(var26);
      double var34;
      if (var7 == 0.0) {
         var34 = 0.0;
      } else {
         double var36 = Math.min(var9, var24);
         var34 = (double) MathHelper.floor(var36 / var7) * var7;
      }

      return this.method31447(var19, var20, var21, var22, var24 - var34, var26, var28, var30, var32);
   }

   private static double method31445(int var0, double var1, double var3, double var5) {
      int var9 = var0 & 15;
      return Class8972.method32929(Class8972.field40557[var9], var1, var3, var5);
   }

   private int method31446(int var1) {
      return this.field39336[var1 & 0xFF] & 0xFF;
   }

   public double method31447(int var1, int var2, int var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      int var18 = this.method31446(var1) + var2;
      int var19 = this.method31446(var18) + var3;
      int var20 = this.method31446(var18 + 1) + var3;
      int var21 = this.method31446(var1 + 1) + var2;
      int var22 = this.method31446(var21) + var3;
      int var23 = this.method31446(var21 + 1) + var3;
      double var24 = method31445(this.method31446(var19), var4, var6, var8);
      double var26 = method31445(this.method31446(var22), var4 - 1.0, var6, var8);
      double var28 = method31445(this.method31446(var20), var4, var6 - 1.0, var8);
      double var30 = method31445(this.method31446(var23), var4 - 1.0, var6 - 1.0, var8);
      double var32 = method31445(this.method31446(var19 + 1), var4, var6, var8 - 1.0);
      double var34 = method31445(this.method31446(var22 + 1), var4 - 1.0, var6, var8 - 1.0);
      double var36 = method31445(this.method31446(var20 + 1), var4, var6 - 1.0, var8 - 1.0);
      double var38 = method31445(this.method31446(var23 + 1), var4 - 1.0, var6 - 1.0, var8 - 1.0);
      return MathHelper.method37824(var10, var12, var14, var24, var26, var28, var30, var32, var34, var36, var38);
   }
}
