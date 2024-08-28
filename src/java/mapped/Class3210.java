package mapped;

import java.util.Random;

public class Class3210 extends Class3209 {
   private static String[] field18617;

   public Class3210(Class7929 var1) {
      super(var1);
   }

   @Override
   public void method11561(Class1655 var1, BlockPos var2, Entity var3) {
      if (!var3.method3249() && var3 instanceof Class880 && !Class7858.method26332((Class880)var3)) {
         var3.method2741(Class8654.field38996, 1.0F);
      }

      super.method11561(var1, var2, var3);
   }

   @Override
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      Class3406.method12045(var2, var3.method8311(), true);
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2 == Direction.field673 && var3.method23448(Class8487.field36413)) {
         var4.method6860().method20726(var5, this, 20);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method11484(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      BlockPos var7 = var3.method8311();
      if (var2.method6739(var3).method23486(Class8953.field40469)) {
         var2.method6742(
            (PlayerEntity)null, var3, Class6067.field26582, Class2266.field14732, 0.5F, 2.6F + (var2.field9016.nextFloat() - var2.field9016.nextFloat()) * 0.8F
         );
         var2.method6939(
            Class7940.field34085, (double)var7.method8304() + 0.5, (double)var7.getY() + 0.25, (double)var7.method8306() + 0.5, 8, 0.5, 0.25, 0.5, 0.0
         );
      }
   }

   @Override
   public void method11589(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      var2.method6860().method20726(var3, this, 20);
   }
}
