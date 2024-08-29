package mapped;

import java.util.Random;

public class Class3408 extends Block {
   private static String[] field19086;
   public static final Class8554 field19087 = Class8820.field39743;
   public static final VoxelShape field19088 = Block.method11539(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public Class3408(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19087, Integer.valueOf(0)));
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field19088;
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.method23443(var2, var3)) {
         var2.method7179(var3, true);
      }
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.method7007(var3.method8311())) {
         int var7 = 1;

         while (var2.getBlockState(var3.method8340(var7)).method23448(this)) {
            var7++;
         }

         if (var7 < 3) {
            int var8 = var1.<Integer>method23463(field19087);
            if (var8 != 15) {
               var2.method6725(var3, var1.method23465(field19087, Integer.valueOf(var8 + 1)), 4);
            } else {
               var2.method6730(var3.method8311(), this.method11579());
               var2.method6725(var3, var1.method23465(field19087, Integer.valueOf(0)), 4);
            }
         }
      }
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (!var1.method23443(var4, var5)) {
         var4.method6860().method20726(var5, this, 1);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      BlockState var6 = var2.getBlockState(var3.method8313());
      if (var6.getBlock() == this) {
         return true;
      } else {
         if (var6.method23448(Blocks.field36395)
            || var6.method23448(Blocks.field36396)
            || var6.method23448(Blocks.field36397)
            || var6.method23448(Blocks.field36398)
            || var6.method23448(Blocks.SAND)
            || var6.method23448(Blocks.RED_SAND)) {
            BlockPos var7 = var3.method8313();

            for (Direction var9 : Class76.field161) {
               BlockState var10 = var2.getBlockState(var7.method8349(var9));
               Class7379 var11 = var2.method6739(var7.method8349(var9));
               if (var11.method23486(Class8953.field40469) || var10.method23448(Blocks.field36889)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19087);
   }
}
