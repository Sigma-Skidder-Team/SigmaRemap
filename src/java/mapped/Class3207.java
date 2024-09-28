package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public interface Class3207 extends Class3405, Class3449 {
   @Override
   default boolean method11531(IBlockReader var1, BlockPos var2, BlockState var3, Fluid var4) {
      return !var3.<Boolean>get(BlockStateProperties.field39710) && var4 == Class9479.field44066;
   }

   @Override
   default boolean method11532(Class1660 var1, BlockPos var2, BlockState var3, FluidState var4) {
      if (!var3.<Boolean>get(BlockStateProperties.field39710) && var4.method23472() == Class9479.field44066) {
         if (!var1.isRemote()) {
            var1.setBlockState(var2, var3.with(BlockStateProperties.field39710, Boolean.valueOf(true)), 3);
            var1.method6861().method20726(var2, var4.method23472(), var4.method23472().method25057(var1));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default Fluid method11533(Class1660 var1, BlockPos var2, BlockState var3) {
      if (!var3.<Boolean>get(BlockStateProperties.field39710)) {
         return Class9479.field44064;
      } else {
         var1.setBlockState(var2, var3.with(BlockStateProperties.field39710, Boolean.valueOf(false)), 3);
         return Class9479.field44066;
      }
   }
}
