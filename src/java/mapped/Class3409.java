package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3409 extends Block {
   private static String[] field19089;
   public static final VoxelShape field19090 = Block.method11539(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   public Class3409(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public VoxelShape method11502(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field19090;
   }

   @Override
   public VoxelShape method11995(BlockState var1, Class1665 var2, BlockPos var3) {
      return VoxelShapes.method27426();
   }

   @Override
   public VoxelShape method11635(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return VoxelShapes.method27426();
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      Class3406.method12045(var2, var3.up(), false);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2 == Direction.field673 && var3.method23448(Blocks.WATER)) {
         var4.method6860().method20726(var5, this, 20);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method11589(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      var2.method6860().method20726(var3, this, 20);
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}
