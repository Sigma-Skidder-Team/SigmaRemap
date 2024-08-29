package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class9169 {
   private static String[] field42088;
   private double field42089;
   private double field42090;

   public double method34245(Class9169 var1) {
      double var4 = this.field42089 - var1.field42089;
      double var6 = this.field42090 - var1.field42090;
      return Math.sqrt(var4 * var4 + var6 * var6);
   }

   public void method34246() {
      double var3 = (double)this.method34247();
      this.field42089 /= var3;
      this.field42090 /= var3;
   }

   public float method34247() {
      return MathHelper.method37766(this.field42089 * this.field42089 + this.field42090 * this.field42090);
   }

   public void method34248(Class9169 var1) {
      this.field42089 = this.field42089 - var1.field42089;
      this.field42090 = this.field42090 - var1.field42090;
   }

   public boolean method34249(double var1, double var3, double var5, double var7) {
      boolean var11 = false;
      if (!(this.field42089 < var1)) {
         if (this.field42089 > var5) {
            this.field42089 = var5;
            var11 = true;
         }
      } else {
         this.field42089 = var1;
         var11 = true;
      }

      if (!(this.field42090 < var3)) {
         if (this.field42090 > var7) {
            this.field42090 = var7;
            var11 = true;
         }
      } else {
         this.field42090 = var3;
         var11 = true;
      }

      return var11;
   }

   public int method34250(Class1665 var1, int var2) {
      Mutable var5 = new Mutable(this.field42089, (double)(var2 + 1), this.field42090);
      boolean var6 = var1.getBlockState(var5).isAir();
      var5.method8379(Direction.DOWN);
      boolean var7 = var1.getBlockState(var5).isAir();

      while (var5.getY() > 0) {
         var5.method8379(Direction.DOWN);
         boolean var8 = var1.getBlockState(var5).isAir();
         if (!var8 && var7 && var6) {
            return var5.getY() + 1;
         }

         var6 = var7;
         var7 = var8;
      }

      return var2 + 1;
   }

   public boolean method34251(Class1665 var1, int var2) {
      BlockPos var5 = new BlockPos(this.field42089, (double)(this.method34250(var1, var2) - 1), this.field42090);
      BlockState var6 = var1.getBlockState(var5);
      Class8649 var7 = var6.method23384();
      return var5.getY() < var2 && !var7.method31085() && var7 != Class8649.field38945;
   }

   public void method34252(Random var1, double var2, double var4, double var6, double var8) {
      this.field42089 = MathHelper.method37784(var1, var2, var6);
      this.field42090 = MathHelper.method37784(var1, var4, var8);
   }

   // $VF: synthetic method
   public static double method34253(Class9169 var0, double var1) {
      return var0.field42089 = var1;
   }

   // $VF: synthetic method
   public static double method34254(Class9169 var0) {
      return var0.field42089;
   }

   // $VF: synthetic method
   public static double method34255(Class9169 var0, double var1) {
      return var0.field42090 = var1;
   }

   // $VF: synthetic method
   public static double method34256(Class9169 var0) {
      return var0.field42090;
   }
}
