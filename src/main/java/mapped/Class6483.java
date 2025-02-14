package mapped;

import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

public final class Class6483 implements Class6466<BlockPos> {
   private static String[] field28430;

   public void method19646(PacketBuffer var1, BlockPos var2) {
      var1.writeBlockPos(var2);
   }

   public BlockPos method19645(PacketBuffer var1) {
      return var1.readBlockPos();
   }

   public BlockPos method19644(BlockPos var1) {
      return var1;
   }
}
