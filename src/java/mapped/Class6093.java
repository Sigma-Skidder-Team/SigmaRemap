package mapped;

import java.util.Random;
import java.util.Map.Entry;

public class Class6093 extends Class6069 {
   private static String[] field27337;

   public Class6093(Class1937 var1, Class2106... var2) {
      super(var1, Class2242.field14673, var2);
   }

   @Override
   public int method18807(int var1) {
      return 10 + 20 * (var1 - 1);
   }

   @Override
   public int method18808(int var1) {
      return super.method18807(var1) + 50;
   }

   @Override
   public int method18809() {
      return 3;
   }

   @Override
   public boolean method18821(Class8848 var1) {
      return !(var1.method32107() instanceof Class3279) ? super.method18821(var1) : true;
   }

   @Override
   public void method18823(Class880 var1, Entity var2, int var3) {
      Random var6 = var1.method3013();
      Entry var7 = Class7858.method26339(Class8122.field34903, var1);
      if (method18830(var3, var6)) {
         if (var2 != null) {
            var2.method2741(Class8654.method31125(var1), (float)method18831(var3, var6));
         }

         if (var7 != null) {
            ((Class8848)var7.getValue()).method32121(2, var1, var1x -> var1x.method3184((Class2106)var7.getKey()));
         }
      }
   }

   public static boolean method18830(int var0, Random var1) {
      return var0 > 0 ? var1.nextFloat() < 0.15F * (float)var0 : false;
   }

   public static int method18831(int var0, Random var1) {
      return var0 <= 10 ? 1 + var1.nextInt(4) : var0 - 10;
   }
}
