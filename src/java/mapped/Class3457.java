package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.IGrowable;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3457 extends Class3456 implements IGrowable {
   private static String[] field19277;

   public Class3457(Properties var1) {
      super(var1);
   }

   @Override
   public boolean method11497(BlockState var1, BlockItemUseContext var2) {
      return false;
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      method11557(var1, var3, new ItemStack(this));
   }
}
