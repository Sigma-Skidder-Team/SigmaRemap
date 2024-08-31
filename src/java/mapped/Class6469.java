package mapped;

import net.minecraft.network.PacketBuffer;

public final class Class6469 implements Class6466<Direction> {
   private static String[] field28416;

   public void method19646(PacketBuffer var1, Direction var2) {
      var1.method35713(var2);
   }

   public Direction method19645(PacketBuffer var1) {
      return var1.<Direction>method35712(Direction.class);
   }

   public Direction method19644(Direction var1) {
      return var1;
   }
}
