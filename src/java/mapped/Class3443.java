package mapped;

import java.util.Map;

public class Class3443 extends Block {
   private static String[] field19248;
   public static final Class8551 field19249 = Class3392.field19019;
   public static final Class8551 field19250 = Class3392.field19020;
   public static final Class8551 field19251 = Class3392.field19021;
   public static final Class8551 field19252 = Class3392.field19022;
   public static final Class8551 field19253 = Class3392.field19023;
   public static final Class8551 field19254 = Class3392.field19024;
   private static final Map<Direction, Class8551> field19255 = Class3392.field19025;

   public Class3443(AbstractBlock var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field19249, Boolean.valueOf(true))
            .method23465(field19250, Boolean.valueOf(true))
            .method23465(field19251, Boolean.valueOf(true))
            .method23465(field19252, Boolean.valueOf(true))
            .method23465(field19253, Boolean.valueOf(true))
            .method23465(field19254, Boolean.valueOf(true))
      );
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      World var4 = var1.method18360();
      BlockPos var5 = var1.method18345();
      return this.method11579()
         .method23465(field19254, Boolean.valueOf(this != var4.getBlockState(var5.method8313()).getBlock()))
         .method23465(field19253, Boolean.valueOf(this != var4.getBlockState(var5.method8311()).getBlock()))
         .method23465(field19249, Boolean.valueOf(this != var4.getBlockState(var5.method8341()).getBlock()))
         .method23465(field19250, Boolean.valueOf(this != var4.getBlockState(var5.method8347()).getBlock()))
         .method23465(field19251, Boolean.valueOf(this != var4.getBlockState(var5.method8343()).getBlock()))
         .method23465(field19252, Boolean.valueOf(this != var4.getBlockState(var5.method8345()).getBlock()));
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return !var3.method23448(this) ? super.method11491(var1, var2, var3, var4, var5, var6) : var1.method23465(field19255.get(var2), Boolean.valueOf(false));
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field19255.get(var2.method252(Direction.NORTH)), var1.<Boolean>method23463(field19249))
         .method23465(field19255.get(var2.method252(Direction.SOUTH)), var1.<Boolean>method23463(field19251))
         .method23465(field19255.get(var2.method252(Direction.EAST)), var1.<Boolean>method23463(field19250))
         .method23465(field19255.get(var2.method252(Direction.WEST)), var1.<Boolean>method23463(field19252))
         .method23465(field19255.get(var2.method252(Direction.field673)), var1.<Boolean>method23463(field19253))
         .method23465(field19255.get(var2.method252(Direction.DOWN)), var1.<Boolean>method23463(field19254));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23465(field19255.get(var2.method8750(Direction.NORTH)), var1.<Boolean>method23463(field19249))
         .method23465(field19255.get(var2.method8750(Direction.SOUTH)), var1.<Boolean>method23463(field19251))
         .method23465(field19255.get(var2.method8750(Direction.EAST)), var1.<Boolean>method23463(field19250))
         .method23465(field19255.get(var2.method8750(Direction.WEST)), var1.<Boolean>method23463(field19252))
         .method23465(field19255.get(var2.method8750(Direction.field673)), var1.<Boolean>method23463(field19253))
         .method23465(field19255.get(var2.method8750(Direction.DOWN)), var1.<Boolean>method23463(field19254));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19253, field19254, field19249, field19250, field19251, field19252);
   }
}
