package mapped;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3195 extends Class3194 implements Class3196, Class3207 {
   private static String[] field18471;
   public static final Class8554 field18472 = Class8820.field39758;
   public static final Class8551 field18473 = Class8820.field39710;
   public static final Class6408 field18474 = Block.method11539(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   public static final Class6408 field18475 = Block.method11539(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   public static final Class6408 field18476 = Block.method11539(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   public static final Class6408 field18477 = Block.method11539(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   public Class3195(Class7929 var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18472, Integer.valueOf(1)).method23465(field18473, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public Class7380 method11495(Class5909 var1) {
      Class7380 var4 = var1.method18360().method6738(var1.method18345());
      if (!var4.method23448(this)) {
         Class7379 var5 = var1.method18360().method6739(var1.method18345());
         boolean var6 = var5.method23472() == Class9479.field44066;
         return super.method11495(var1).method23465(field18473, Boolean.valueOf(var6));
      } else {
         return var4.method23465(field18472, Integer.valueOf(Math.min(4, var4.<Integer>method23463(field18472) + 1)));
      }
   }

   public static boolean method11496(Class7380 var0) {
      return !var0.<Boolean>method23463(field18473);
   }

   @Override
   public boolean method11490(Class7380 var1, Class1665 var2, BlockPos var3) {
      return !var1.method23414(var2, var3).method19526(Direction.field673).method19516() || var1.method23454(var2, var3, Direction.field673);
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      BlockPos var6 = var3.method8313();
      return this.method11490(var2.method6738(var6), var2, var6);
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.method23443(var4, var5)) {
         if (var1.<Boolean>method23463(field18473)) {
            var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
         }

         return super.method11491(var1, var2, var3, var4, var5, var6);
      } else {
         return Blocks.AIR.method11579();
      }
   }

   @Override
   public boolean method11497(Class7380 var1, Class5909 var2) {
      return var2.method18357().method32107() == this.method11581() && var1.<Integer>method23463(field18472) < 4 ? true : super.method11497(var1, var2);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      switch (var1.<Integer>method23463(field18472)) {
         case 1:
         default:
            return field18474;
         case 2:
            return field18475;
         case 3:
            return field18476;
         case 4:
            return field18477;
      }
   }

   @Override
   public Class7379 method11498(Class7380 var1) {
      return !var1.<Boolean>method23463(field18473) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18472, field18473);
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
      if (!method11496(var4) && var1.method6738(var3.method8313()).method23446(Class7645.field32783)) {
         byte var7 = 5;
         byte var8 = 1;
         byte var9 = 2;
         int var10 = 0;
         int var11 = var3.method8304() - 2;
         int var12 = 0;

         for (int var13 = 0; var13 < 5; var13++) {
            for (int var14 = 0; var14 < var8; var14++) {
               int var15 = 2 + var3.getY() - 1;

               for (int var16 = var15 - 2; var16 < var15; var16++) {
                  BlockPos var17 = new BlockPos(var11 + var13, var16, var3.method8306() - var12 + var14);
                  if (var17 != var3 && var2.nextInt(6) == 0 && var1.method6738(var17).method23448(Blocks.WATER)) {
                     Class7380 var18 = var1.method6738(var17.method8313());
                     if (var18.method23446(Class7645.field32783)) {
                        var1.method6725(var17, Blocks.field37005.method11579().method23465(field18472, Integer.valueOf(var2.nextInt(4) + 1)), 3);
                     }
                  }
               }
            }

            if (var10 >= 2) {
               var8 -= 2;
               var12--;
            } else {
               var8 += 2;
               var12++;
            }

            var10++;
         }

         var1.method6725(var3, var4.method23465(field18472, Integer.valueOf(4)), 2);
      }
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
