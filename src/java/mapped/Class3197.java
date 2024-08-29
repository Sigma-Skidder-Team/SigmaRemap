package mapped;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3197 extends Class3198 implements Class3196 {
   private static String[] field18478;
   public static final Class8554 field18479 = Class8820.field39739;
   public static final Class6408[] field18480 = new Class6408[]{
      Block.method11539(11.0, 7.0, 6.0, 15.0, 12.0, 10.0),
      Block.method11539(9.0, 5.0, 5.0, 15.0, 12.0, 11.0),
      Block.method11539(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   public static final Class6408[] field18481 = new Class6408[]{
      Block.method11539(1.0, 7.0, 6.0, 5.0, 12.0, 10.0),
      Block.method11539(1.0, 5.0, 5.0, 7.0, 12.0, 11.0),
      Block.method11539(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   public static final Class6408[] field18482 = new Class6408[]{
      Block.method11539(6.0, 7.0, 1.0, 10.0, 12.0, 5.0),
      Block.method11539(5.0, 5.0, 1.0, 11.0, 12.0, 7.0),
      Block.method11539(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   public static final Class6408[] field18483 = new Class6408[]{
      Block.method11539(6.0, 7.0, 11.0, 10.0, 12.0, 15.0),
      Block.method11539(5.0, 5.0, 9.0, 11.0, 12.0, 15.0),
      Block.method11539(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   public Class3197(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18484, Direction.NORTH).method23465(field18479, Integer.valueOf(0)));
   }

   @Override
   public boolean method11499(BlockState var1) {
      return var1.<Integer>method23463(field18479) < 2;
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.field9016.nextInt(5) == 0) {
         int var7 = var1.<Integer>method23463(field18479);
         if (var7 < 2) {
            var2.method6725(var3, var1.method23465(field18479, Integer.valueOf(var7 + 1)), 2);
         }
      }
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      Block var6 = var2.getBlockState(var3.method8349(var1.<Direction>method23463(field18484))).getBlock();
      return var6.method11540(Class7645.field32756);
   }

   @Override
   public Class6408 method11483(BlockState var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      int var7 = var1.<Integer>method23463(field18479);
      switch (Class9737.field45471[var1.<Direction>method23463(field18484).ordinal()]) {
         case 1:
            return field18483[var7];
         case 2:
         default:
            return field18482[var7];
         case 3:
            return field18481[var7];
         case 4:
            return field18480[var7];
      }
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = this.method11579();
      World var5 = var1.method18360();
      BlockPos var6 = var1.method18345();

      for (Direction var10 : var1.method18349()) {
         if (var10.method544().method324()) {
            var4 = var4.method23465(field18484, var10);
            if (var4.method23443(var5, var6)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == var1.method23463(field18484) && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11486(Class1665 var1, BlockPos var2, BlockState var3, boolean var4) {
      return var3.<Integer>method23463(field18479) < 2;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      var1.method6725(var3, var4.method23465(field18479, Integer.valueOf(var4.<Integer>method23463(field18479) + 1)), 2);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18484, field18479);
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
