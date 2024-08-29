package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class3489 extends Class3194 {
   private static String[] field18470;
   public static final Class8554 field19354 = Class8820.field39740;
   private static final VoxelShape[] field19355 = new VoxelShape[]{
      Block.method11539(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      Block.method11539(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   public Class3489(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19354, Integer.valueOf(0)));
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field19355[var1.<Integer>method23463(field19354)];
   }

   @Override
   public boolean method11490(BlockState var1, Class1665 var2, BlockPos var3) {
      return var1.method23448(Blocks.SOUL_SAND);
   }

   @Override
   public boolean method11499(BlockState var1) {
      return var1.<Integer>method23463(field19354) < 3;
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      int var7 = var1.<Integer>method23463(field19354);
      if (var7 < 3 && var4.nextInt(10) == 0) {
         var1 = var1.method23465(field19354, Integer.valueOf(var7 + 1));
         var2.setBlockState(var3, var1, 2);
      }
   }

   @Override
   public ItemStack getItem(Class1665 var1, BlockPos var2, BlockState var3) {
      return new ItemStack(Items.field37970);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19354);
   }
}
