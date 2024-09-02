package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

public class Class3471 extends Block {
   private static String[] field19322;
   public static final Class8551 field19323 = Class8820.field39707;

   public Class3471(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19323, Boolean.valueOf(false)));
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.field673
         ? var1.method23465(field19323, Boolean.valueOf(var3.method23448(Blocks.SNOW_BLOCK) || var3.method23448(Blocks.SNOW)))
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = var1.method18360().getBlockState(var1.method18345().up());
      return this.method11579().method23465(field19323, Boolean.valueOf(var4.method23448(Blocks.SNOW_BLOCK) || var4.method23448(Blocks.SNOW)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19323);
   }
}
