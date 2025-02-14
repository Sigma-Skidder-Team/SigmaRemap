package mapped;

import net.minecraft.network.PacketBuffer;

public final class Class6468 implements Class6466<Integer> {
   private static String[] field28415;

   public void method19646(PacketBuffer var1, Integer var2) {
      var1.writeVarInt(var2);
   }

   public Integer method19645(PacketBuffer var1) {
      return var1.readVarInt();
   }

   public Integer method19644(Integer var1) {
      return var1;
   }
}
