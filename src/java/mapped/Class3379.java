package mapped;

public class Class3379 extends Class3231 {
   private static String[] field18979;
   public static final Class6408 field18980 = Block.method11539(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

   public Class3379(Class7929 var1) {
      super(var1);
   }

   private static boolean method11971(Entity var0) {
      return var0 instanceof Class880 || var0 instanceof Class916 || var0 instanceof Class1004 || var0 instanceof Class1002;
   }

   @Override
   public Class6408 method11502(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18980;
   }

   @Override
   public void method11567(Class1655 var1, BlockPos var2, Entity var3, float var4) {
      var3.method2863(Class6067.field26664, 1.0F, 1.0F);
      if (!var1.field9020) {
         var1.method6786(var3, (byte)54);
      }

      if (var3.method2921(var4, 0.2F)) {
         var3.method2863(this.field19008.method29716(), this.field19008.method29710() * 0.5F, this.field19008.method29711() * 0.75F);
      }
   }

   @Override
   public void method11523(Class7380 var1, Class1655 var2, BlockPos var3, Entity var4) {
      if (this.method11972(var3, var4)) {
         this.method11973(var4, var3);
         this.method11974(var4);
         this.method11975(var2, var4);
      }

      super.method11523(var1, var2, var3, var4);
   }

   private boolean method11972(BlockPos var1, Entity var2) {
      if (var2.method3226()) {
         return false;
      } else if (!(var2.getPosY() > (double)var1.getY() + 0.9375 - 1.0E-7)) {
         if (var2.method3433().field18049 >= -0.08) {
            return false;
         } else {
            double var5 = Math.abs((double)var1.method8304() + 0.5 - var2.getPosX());
            double var7 = Math.abs((double)var1.method8306() + 0.5 - var2.getPosZ());
            double var9 = 0.4375 + (double)(var2.method3429() / 2.0F);
            return var5 + 1.0E-7 > var9 || var7 + 1.0E-7 > var9;
         }
      } else {
         return false;
      }
   }

   private void method11973(Entity var1, BlockPos var2) {
      if (var1 instanceof Class878 && var1.field5024.method6783() % 20L == 0L) {
         Class9551.field44500.method15057((Class878)var1, var1.field5024.method6738(var2));
      }
   }

   private void method11974(Entity var1) {
      Vector3d var4 = var1.method3433();
      if (!(var4.field18049 < -0.13)) {
         var1.method3434(new Vector3d(var4.field18048, -0.05, var4.field18050));
      } else {
         double var5 = -0.05 / var4.field18049;
         var1.method3434(new Vector3d(var4.field18048 * var5, -0.05, var4.field18050 * var5));
      }

      var1.field5045 = 0.0F;
   }

   private void method11975(Class1655 var1, Entity var2) {
      if (method11971(var2)) {
         if (var1.field9016.nextInt(5) == 0) {
            var2.method2863(Class6067.field26664, 1.0F, 1.0F);
         }

         if (!var1.field9020 && var1.field9016.nextInt(5) == 0) {
            var1.method6786(var2, (byte)53);
         }
      }
   }

   public static void method11976(Entity var0) {
      method11978(var0, 5);
   }

   public static void method11977(Entity var0) {
      method11978(var0, 10);
   }

   private static void method11978(Entity var0, int var1) {
      if (var0.field5024.field9020) {
         Class7380 var4 = Blocks.field37119.method11579();

         for (int var5 = 0; var5 < var1; var5++) {
            var0.field5024.method6746(new Class7439(Class7940.field34051, var4), var0.getPosX(), var0.getPosY(), var0.getPosZ(), 0.0, 0.0, 0.0);
         }
      }
   }
}
