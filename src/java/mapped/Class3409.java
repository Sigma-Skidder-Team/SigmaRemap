package mapped;

import java.util.Random;

public class Class3409 extends Block {
   private static String[] field19089;
   public static final Class6408 field19090 = Block.method11539(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   public Class3409(Class7929 var1) {
      super(var1);
   }

   @Override
   public Class6408 method11502(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19090;
   }

   @Override
   public Class6408 method11995(Class7380 var1, Class1665 var2, BlockPos var3) {
      return Class8022.method27426();
   }

   @Override
   public Class6408 method11635(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return Class8022.method27426();
   }

   @Override
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      Class3406.method12045(var2, var3.method8311(), false);
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2 == Direction.field673 && var3.method23448(Blocks.WATER)) {
         var4.method6860().method20726(var5, this, 20);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method11589(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      var2.method6860().method20726(var3, this, 20);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
