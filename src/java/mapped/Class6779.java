package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;

public class Class6779 extends Class6777 {
   private static final BlockState field29568 = Blocks.BASALT.method11579();
   private static final BlockState field29569 = Blocks.field37130.method11579();
   private static final BlockState field29570 = Blocks.GRAVEL.method11579();
   private static final ImmutableList<BlockState> field29571 = ImmutableList.of(field29568, field29569);
   private static final ImmutableList<BlockState> field29572 = ImmutableList.of(field29568);

   public Class6779(Codec<Class8278> var1) {
      super(var1);
   }

   @Override
   public ImmutableList<BlockState> method20662() {
      return field29571;
   }

   @Override
   public ImmutableList<BlockState> method20663() {
      return field29572;
   }

   @Override
   public BlockState method20664() {
      return field29570;
   }
}
