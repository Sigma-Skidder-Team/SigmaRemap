package mapped;

import java.util.Random;

public class Class3221 extends Block {
   private static String[] field18643;
   public static final Class8554 field18644 = Class8820.field39756;
   public static final Class6408 field18645 = Block.method11539(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);

   public Class3221(Class7929 var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18644, Integer.valueOf(0)));
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2 == Direction.field673 && !var1.method23443(var4, var5)) {
         var4.method6860().method20726(var5, this, 1);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      Class7380 var6 = var2.method6738(var3.method8311());
      return !var6.method23384().method31086() || var6.method23383() instanceof Class3199 || var6.method23383() instanceof Class3356;
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      return this.method11579().method23443(var1.method18360(), var1.method18345()) ? super.method11495(var1) : Blocks.field36396.method11579();
   }

   @Override
   public boolean method11534(Class7380 var1) {
      return true;
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18645;
   }

   @Override
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      if (!var1.method23443(var2, var3)) {
         method11610(var1, var2, var3);
      }
   }

   @Override
   public void method11484(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      int var7 = var1.<Integer>method23463(field18644);
      if (!method11612(var2, var3) && !var2.method6796(var3.method8311())) {
         if (var7 <= 0) {
            if (!method11611(var2, var3)) {
               method11610(var1, var2, var3);
            }
         } else {
            var2.method6725(var3, var1.method23465(field18644, Integer.valueOf(var7 - 1)), 2);
         }
      } else if (var7 < 7) {
         var2.method6725(var3, var1.method23465(field18644, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void method11567(Class1655 var1, BlockPos var2, Entity var3, float var4) {
      if (!var1.field9020
         && var1.field9016.nextFloat() < var4 - 0.5F
         && var3 instanceof Class880
         && (var3 instanceof PlayerEntity || var1.method6789().method17135(Class5462.field24224))
         && var3.method3429() * var3.method3429() * var3.method3430() > 0.512F) {
         method11610(var1.method6738(var2), var1, var2);
      }

      super.method11567(var1, var2, var3, var4);
   }

   public static void method11610(Class7380 var0, Class1655 var1, BlockPos var2) {
      var1.method6730(var2, method11538(var0, Blocks.field36396.method11579(), var1, var2));
   }

   private static boolean method11611(Class1665 var0, BlockPos var1) {
      Block var4 = var0.method6738(var1.method8311()).method23383();
      return var4 instanceof Class3480 || var4 instanceof Class3486 || var4 instanceof Class3493;
   }

   private static boolean method11612(Class1662 var0, BlockPos var1) {
      for (BlockPos var5 : BlockPos.method8359(var1.method8336(-4, 0, -4), var1.method8336(4, 1, 4))) {
         if (var0.method6739(var5).method23486(Class8953.field40469)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18644);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
