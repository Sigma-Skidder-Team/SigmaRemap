package mapped;

import java.util.Random;

public class Class3487 extends Class3194 implements Class3196 {
   private static String[] field19350;
   public static final Class6408 field19351 = Class3209.method11539(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   public Class3487(Class7929 var1) {
      super(var1);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19351;
   }

   @Override
   public boolean method11486(Class1665 var1, BlockPos var2, Class7380 var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method11487(Class1655 var1, Random var2, BlockPos var3, Class7380 var4) {
      return true;
   }

   @Override
   public void method11488(Class1657 var1, Random var2, BlockPos var3, Class7380 var4) {
      Class3456 var7 = (Class3456)(this != Class8487.field36483 ? Class8487.field36801 : Class8487.field36802);
      if (var7.method11579().method23443(var1, var3) && var1.method7007(var3.method8311())) {
         var7.method12129(var1, var3, 2);
      }
   }

   @Override
   public Class2260 method11994() {
      return Class2260.field14704;
   }
}
