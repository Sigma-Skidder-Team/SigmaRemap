package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class6701 extends Class6698 {
   public static final Codec<Class6701> field29335 = BlockState.field31585
      .fieldOf("state")
      .xmap(Class7377::getBlock, Block::getDefaultState)
      .xmap(Class6701::new, var0 -> var0.field29336)
      .codec();
   private final Block field29336;

   public Class6701(Block var1) {
      this.field29336 = var1;
   }

   @Override
   public Class9654<?> method20423() {
      return Class9654.field45135;
   }

   @Override
   public BlockState method20424(Random var1, BlockPos var2) {
      Direction.Axis var5 = Direction.Axis.method325(var1);
      return this.field29336.getDefaultState().with(Class3386.field18994, var5);
   }
}
