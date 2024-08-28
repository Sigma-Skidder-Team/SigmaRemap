package mapped;

import java.util.Random;

public class Class3365 extends Class3241 {
   private static String[] field18932;
   public static final Class6408 field18933 = Block.method11539(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);

   public Class3365(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class956();
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18933;
   }

   @Override
   public void method11523(Class7380 var1, Class1655 var2, BlockPos var3, Entity var4) {
      if (var2 instanceof ServerWorld
         && !var4.method3328()
         && !var4.method3329()
         && var4.method3367()
         && Class8022.method27435(
            Class8022.method27428(var4.method3389().method19667((double)(-var3.method8304()), (double)(-var3.getY()), (double)(-var3.method8306()))),
            var1.method23412(var2, var3),
            Class9477.field44045
         )) {
         Class8705 var7 = var2.method6813() != Class1655.field9001 ? Class1655.field9001 : Class1655.field8999;
         ServerWorld var8 = ((ServerWorld)var2).method6715().method1318(var7);
         if (var8 == null) {
            return;
         }

         var4.method2745(var8);
      }
   }

   @Override
   public void method11512(Class7380 var1, Class1655 var2, BlockPos var3, Random var4) {
      double var7 = (double)var3.method8304() + var4.nextDouble();
      double var9 = (double)var3.getY() + 0.8;
      double var11 = (double)var3.method8306() + var4.nextDouble();
      var2.method6746(Class7940.field34092, var7, var9, var11, 0.0, 0.0, 0.0);
   }

   @Override
   public ItemStack method11569(Class1665 var1, BlockPos var2, Class7380 var3) {
      return ItemStack.field39973;
   }

   @Override
   public boolean method11650(Class7380 var1, Class7631 var2) {
      return false;
   }
}
