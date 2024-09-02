package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class Class3494 extends Class3194 {
   private static String[] field18470;
   public static final VoxelShape field19364 = Block.method11539(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   public Class3494(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public void method11523(BlockState var1, World var2, BlockPos var3, Entity var4) {
      super.method11523(var1, var2, var3, var4);
      if (var2 instanceof ServerWorld && var4 instanceof BoatEntity) {
         var2.method7180(new BlockPos(var3), true, var4);
      }
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field19364;
   }

   @Override
   public boolean method11490(BlockState var1, Class1665 var2, BlockPos var3) {
      FluidState var6 = var2.getFluidState(var3);
      FluidState var7 = var2.getFluidState(var3.up());
      return (var6.method23472() == Class9479.field44066 || var1.method23384() == Class8649.field38964) && var7.method23472() == Class9479.field44064;
   }
}
