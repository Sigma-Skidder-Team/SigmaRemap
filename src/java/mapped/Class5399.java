package mapped;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Class5399 implements Class5391 {
   private static String[] field24074;
   private final int field24075;

   public Class5399(int var1) {
      this.field24075 = var1;
   }

   @Override
   public Class9346 method16977(Entity var1, Random var2) {
      List var5 = Class2348.field16073.method9192().filter(Class6069::method18826).collect(Collectors.toList());
      Class6069 var6 = (Class6069)var5.get(var2.nextInt(var5.size()));
      int var7 = MathHelper.method37782(var2, var6.method18813(), var6.method18809());
      ItemStack var8 = Class3290.method11832(new Class6694(var6, var7));
      int var9 = 2 + var2.nextInt(5 + var7 * 10) + 3 * var7;
      if (var6.method18824()) {
         var9 *= 2;
      }

      if (var9 > 64) {
         var9 = 64;
      }

      return new Class9346(new ItemStack(Class8514.field38049, var9), new ItemStack(Class8514.field37900), var8, 12, this.field24075, 0.2F);
   }
}
