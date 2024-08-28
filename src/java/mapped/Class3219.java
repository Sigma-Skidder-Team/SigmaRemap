package mapped;

import java.util.Random;

public class Class3219 extends Block implements Class3196 {
   private static String[] field18638;

   public Class3219(Class7929 var1) {
      super(var1);
   }

   private static boolean method11609(Class7380 var0, Class1662 var1, BlockPos var2) {
      BlockPos var5 = var2.method8311();
      Class7380 var6 = var1.method6738(var5);
      int var7 = Class200.method649(var1, var0, var2, var6, var5, Direction.field673, var6.method23387(var1, var5));
      return var7 < var1.method7033();
   }

   @Override
   public void method11484(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      if (!method11609(var1, var2, var3)) {
         var2.method6730(var3, Blocks.NETHERRACK.method11579());
      }
   }

   @Override
   public boolean method11486(Class1665 var1, BlockPos var2, Class7380 var3, boolean var4) {
      return var1.method6738(var2.method8311()).method23393();
   }

   @Override
   public boolean method11487(Class1655 var1, Random var2, BlockPos var3, Class7380 var4) {
      return true;
   }

   @Override
   public void method11488(Class1657 var1, Random var2, BlockPos var3, Class7380 var4) {
      Class7380 var7 = var1.method6738(var3);
      BlockPos var8 = var3.method8311();
      if (!var7.method23448(Blocks.field37083)) {
         if (var7.method23448(Blocks.field37074)) {
            Class2946.method11288(var1, var2, var8, Class8529.field38323, 3, 1);
            Class2946.method11288(var1, var2, var8, Class8529.field38324, 3, 1);
            if (var2.nextInt(8) == 0) {
               Class2937.method11277(var1, var2, var8, 3, 1, 2);
            }
         }
      } else {
         Class2946.method11288(var1, var2, var8, Class8529.field38322, 3, 1);
      }
   }
}
