package mapped;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3410 extends Block {
   private static String[] field19091;
   public static final Class8554 field19092 = Class8820.field39750;
   public static final Class6408[] field19093 = new Class6408[]{
      Class8022.method27425(),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   public Class3410(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19092, Integer.valueOf(1)));
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      switch (Class9444.field43874[var4.ordinal()]) {
         case 1:
            return var1.<Integer>method23463(field19092) < 5;
         case 2:
            return false;
         case 3:
            return false;
         default:
            return false;
      }
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19093[var1.<Integer>method23463(field19092)];
   }

   @Override
   public Class6408 method11502(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19093[var1.<Integer>method23463(field19092) - 1];
   }

   @Override
   public Class6408 method11995(Class7380 var1, Class1665 var2, BlockPos var3) {
      return field19093[var1.<Integer>method23463(field19092)];
   }

   @Override
   public Class6408 method11635(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19093[var1.<Integer>method23463(field19092)];
   }

   @Override
   public boolean method11534(Class7380 var1) {
      return true;
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      Class7380 var6 = var2.method6738(var3.method8313());
      if (var6.method23448(Blocks.ICE) || var6.method23448(Blocks.PACKED_ICE) || var6.method23448(Blocks.field36765)) {
         return false;
      } else {
         return !var6.method23448(Blocks.field37119) && !var6.method23448(Blocks.SOUL_SAND)
            ? Block.method11549(var6.method23414(var2, var3.method8313()), Direction.field673)
               || var6.method23383() == this && var6.<Integer>method23463(field19092) == 8
            : true;
      }
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var1.method23443(var4, var5) ? super.method11491(var1, var2, var3, var4, var5, var6) : Blocks.AIR.method11579();
   }

   @Override
   public void method11484(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      if (var2.method7020(Class1977.field12882, var3) > 11) {
         method11554(var1, var2, var3);
         var2.method6728(var3, false);
      }
   }

   @Override
   public boolean method11497(Class7380 var1, Class5909 var2) {
      int var5 = var1.<Integer>method23463(field19092);
      if (var2.method18357().method32107() != this.method11581() || var5 >= 8) {
         return var5 == 1;
      } else {
         return !var2.method18347() ? true : var2.method18354() == Direction.field673;
      }
   }

   @Nullable
   @Override
   public Class7380 method11495(Class5909 var1) {
      Class7380 var4 = var1.method18360().method6738(var1.method18345());
      if (!var4.method23448(this)) {
         return super.method11495(var1);
      } else {
         int var5 = var4.<Integer>method23463(field19092);
         return var4.method23465(field19092, Integer.valueOf(Math.min(8, var5 + 1)));
      }
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19092);
   }
}
