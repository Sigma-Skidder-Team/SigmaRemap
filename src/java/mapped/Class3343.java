package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;

public class Class3343 extends Class3251 {
   private static String[] field18854;
   public static final Class8554 field18855 = Class8820.field39763;
   public static final VoxelShape field18856 = Block.method11539(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public Class3343(Class2137 var1, AbstractBlock var2) {
      super(var1, var2);
      this.method11578(this.field18612.method35393().method23465(field18855, Integer.valueOf(0)));
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18856;
   }

   @Override
   public VoxelShape method11503(BlockState var1, IBlockReader var2, BlockPos var3) {
      return VoxelShapes.method27425();
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23465(field18855, Integer.valueOf(MathHelper.floor((double)(var1.method18352() * 16.0F / 360.0F) + 0.5) & 15));
   }

   @Override
   public BlockState method11500(BlockState var1, Class80 var2) {
      return var1.method23465(field18855, Integer.valueOf(var2.method253(var1.<Integer>method23463(field18855), 16)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23465(field18855, Integer.valueOf(var2.method8748(var1.<Integer>method23463(field18855), 16)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18855);
   }
}
