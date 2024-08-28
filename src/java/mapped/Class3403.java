package mapped;

import java.util.Random;

public class Class3403 extends Block {
   private static String[] field19076;
   public static final Class8551 field19077 = Class3383.field18987;

   public Class3403(Class7929 var1) {
      super(var1);
      this.method11578(this.method11579().method23465(field19077, Boolean.valueOf(false)));
   }

   @Override
   public void method11602(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4) {
      method12041(var1, var2, var3);
      super.method11602(var1, var2, var3, var4);
   }

   @Override
   public void method11561(Class1655 var1, BlockPos var2, Entity var3) {
      method12041(var1.method6738(var2), var1, var2);
      super.method11561(var1, var2, var3);
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (!var2.field9020) {
         method12041(var1, var2, var3);
      } else {
         method12042(var2, var3);
      }

      Class8848 var9 = var4.method3094(var5);
      return var9.method32107() instanceof Class3292 && new Class5909(var4, var5, var9, var6).method18346() ? Class2274.field14820 : Class2274.field14818;
   }

   private static void method12041(Class7380 var0, Class1655 var1, BlockPos var2) {
      method12042(var1, var2);
      if (!var0.<Boolean>method23463(field19077)) {
         var1.method6725(var2, var0.method23465(field19077, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean method11499(Class7380 var1) {
      return var1.<Boolean>method23463(field19077);
   }

   @Override
   public void method11484(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method23463(field19077)) {
         var2.method6725(var3, var1.method23465(field19077, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void method11965(Class7380 var1, Class1657 var2, BlockPos var3, Class8848 var4) {
      super.method11965(var1, var2, var3, var4);
      if (Class7858.method26311(Class8122.field34916, var4) == 0) {
         int var7 = 1 + var2.field9016.nextInt(5);
         this.method11558(var2, var3, var7);
      }
   }

   @Override
   public void method11512(Class7380 var1, Class1655 var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>method23463(field19077)) {
         method12042(var2, var3);
      }
   }

   private static void method12042(Class1655 var0, BlockPos var1) {
      double var4 = 0.5625;
      Random var6 = var0.field9016;

      for (Direction var10 : Direction.values()) {
         BlockPos var11 = var1.method8349(var10);
         if (!var0.method6738(var11).method23409(var0, var11)) {
            Class113 var12 = var10.method544();
            double var13 = var12 != Class113.field413 ? (double)var6.nextFloat() : 0.5 + 0.5625 * (double)var10.method539();
            double var15 = var12 != Class113.field414 ? (double)var6.nextFloat() : 0.5 + 0.5625 * (double)var10.method540();
            double var17 = var12 != Class113.field415 ? (double)var6.nextFloat() : 0.5 + 0.5625 * (double)var10.method541();
            var0.method6746(
               Class7437.field32000, (double)var1.method8304() + var13, (double)var1.getY() + var15, (double)var1.method8306() + var17, 0.0, 0.0, 0.0
            );
         }
      }
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19077);
   }
}
