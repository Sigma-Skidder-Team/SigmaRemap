package mapped;

import net.minecraft.network.PacketBuffer;
import net.minecraft.util.Direction;

public final class Class6469 implements Class6466<Direction> {
   private static String[] field28416;

   public void method19646(PacketBuffer var1, Direction var2) {
      var1.writeEnumValue(var2);
   }

   public Direction method19645(PacketBuffer var1) {
      return var1.<Direction>readEnumValue(Direction.class);
   }

   public Direction method19644(Direction var1) {
      return var1;
   }
}
