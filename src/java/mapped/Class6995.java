package mapped;

public class Class6995 extends Class6990 {
   private static String[] field30268;

   public Class6995(Class1006 var1, World var2) {
      super(var1, var2);
   }

   @Override
   public Class9597 method21644(int var1) {
      this.field30257 = new Class6763();
      this.field30257.method20644(true);
      return new Class9597(this.field30257, var1);
   }

   @Override
   public boolean method21668() {
      return this.method21675() && this.method21669() || !this.field30243.method3328();
   }

   @Override
   public Vector3d method21667() {
      return this.field30243.getPositionVec();
   }

   @Override
   public Class8238 method21652(Entity var1, int var2) {
      return this.method21651(var1.method3432(), var2);
   }

   @Override
   public void method21658() {
      this.field30247++;
      if (this.field30255) {
         this.method21647();
      }

      if (!this.method21664()) {
         if (!this.method21668()) {
            if (this.field30245 != null && !this.field30245.method28693()) {
               Vector3d var3 = this.field30245.method28703(this.field30243);
               if (MathHelper.method37769(this.field30243.getPosX()) == MathHelper.method37769(var3.field18048)
                  && MathHelper.method37769(this.field30243.getPosY()) == MathHelper.method37769(var3.field18049)
                  && MathHelper.method37769(this.field30243.getPosZ()) == MathHelper.method37769(var3.field18050)) {
                  this.field30245.method28691();
               }
            }
         } else {
            this.method21659();
         }

         Class7393.method23617(this.field30244, this.field30243, this.field30245, this.field30254);
         if (!this.method21664()) {
            Vector3d var4 = this.field30245.method28703(this.field30243);
            this.field30243.method4228().method20813(var4.field18048, var4.field18049, var4.field18050, this.field30246);
         }
      }
   }

   @Override
   public boolean method21671(Vector3d var1, Vector3d var2, int var3, int var4, int var5) {
      int var8 = MathHelper.method37769(var1.field18048);
      int var9 = MathHelper.method37769(var1.field18049);
      int var10 = MathHelper.method37769(var1.field18050);
      double var11 = var2.field18048 - var1.field18048;
      double var13 = var2.field18049 - var1.field18049;
      double var15 = var2.field18050 - var1.field18050;
      double var17 = var11 * var11 + var13 * var13 + var15 * var15;
      if (var17 < 1.0E-8) {
         return false;
      } else {
         double var19 = 1.0 / Math.sqrt(var17);
         var11 *= var19;
         var13 *= var19;
         var15 *= var19;
         double var21 = 1.0 / Math.abs(var11);
         double var23 = 1.0 / Math.abs(var13);
         double var25 = 1.0 / Math.abs(var15);
         double var27 = (double)var8 - var1.field18048;
         double var29 = (double)var9 - var1.field18049;
         double var31 = (double)var10 - var1.field18050;
         if (var11 >= 0.0) {
            var27++;
         }

         if (var13 >= 0.0) {
            var29++;
         }

         if (var15 >= 0.0) {
            var31++;
         }

         var27 /= var11;
         var29 /= var13;
         var31 /= var15;
         int var33 = !(var11 < 0.0) ? 1 : -1;
         int var34 = !(var13 < 0.0) ? 1 : -1;
         int var35 = !(var15 < 0.0) ? 1 : -1;
         int var36 = MathHelper.method37769(var2.field18048);
         int var37 = MathHelper.method37769(var2.field18049);
         int var38 = MathHelper.method37769(var2.field18050);
         int var39 = var36 - var8;
         int var40 = var37 - var9;
         int var41 = var38 - var10;

         while (var39 * var33 > 0 || var40 * var34 > 0 || var41 * var35 > 0) {
            if (var27 < var31 && var27 <= var29) {
               var27 += var21;
               var8 += var33;
               var39 = var36 - var8;
            } else if (var29 < var27 && var29 <= var31) {
               var29 += var23;
               var9 += var34;
               var40 = var37 - var9;
            } else {
               var31 += var25;
               var10 += var35;
               var41 = var38 - var10;
            }
         }

         return true;
      }
   }

   public void method21685(boolean var1) {
      this.field30257.method20645(var1);
   }

   public void method21686(boolean var1) {
      this.field30257.method20644(var1);
   }

   @Override
   public boolean method21672(BlockPos var1) {
      return this.field30244.method6738(var1).method23419(this.field30244, var1, this.field30243);
   }
}
