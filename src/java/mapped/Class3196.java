package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public interface Class3196 {
   boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4);

   boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4);

   void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4);
}
