package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public class Class6778 extends Class6777 {
   private static final BlockState field29564 = Blocks.SOUL_SAND.getDefaultState();
   private static final BlockState field29565 = Blocks.SOUL_SOIL.getDefaultState();
   private static final BlockState field29566 = Blocks.GRAVEL.getDefaultState();
   private static final ImmutableList<BlockState> field29567 = ImmutableList.of(field29564, field29565);

   public Class6778(Codec<Class8278> var1) {
      super(var1);
   }

   @Override
   public ImmutableList<BlockState> method20662() {
      return field29567;
   }

   @Override
   public ImmutableList<BlockState> method20663() {
      return field29567;
   }

   @Override
   public BlockState method20664() {
      return field29566;
   }
}
