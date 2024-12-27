package net.minecraft.block;

import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;

public class RedstoneLampBlock extends Block {
   private static String[] field18660;
   public static final BooleanProperty field18661 = RedstoneTorchBlock.field18987;

   public RedstoneLampBlock(Properties var1) {
      super(var1);
      this.setDefaultState(this.getDefaultState().with(field18661, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState().with(field18661, Boolean.valueOf(var1.getWorld().method6780(var1.getPos())));
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var2.isRemote) {
         boolean var9 = var1.<Boolean>get(field18661);
         if (var9 != var2.method6780(var3)) {
            if (!var9) {
               var2.setBlockState(var3, var1.method23459(field18661), 2);
            } else {
               var2.method6860().scheduleTick(var3, this, 4);
            }
         }
      }
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>get(field18661) && !var2.method6780(var3)) {
         var2.setBlockState(var3, var1.method23459(field18661), 2);
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18661);
   }
}
