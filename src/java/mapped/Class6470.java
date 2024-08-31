package mapped;

import net.minecraft.block.BlockState;

import java.util.Optional;

public final class Class6470 implements Class6466<Optional<BlockState>> {
   private static String[] field28417;

   public void method19646(PacketBuffer var1, Optional<BlockState> var2) {
      if (!var2.isPresent()) {
         var1.writeVarInt(0);
      } else {
         var1.writeVarInt(Block.getStateId((BlockState)var2.get()));
      }
   }

   public Optional<BlockState> method19645(PacketBuffer var1) {
      int var4 = var1.method35714();
      return var4 != 0 ? Optional.<BlockState>of(Block.method11536(var4)) : Optional.<BlockState>empty();
   }

   public Optional<BlockState> method19644(Optional<BlockState> var1) {
      return var1;
   }
}
