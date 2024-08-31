package mapped;

import net.minecraft.network.PacketBuffer;

public final class Class6478 implements Class6466<Boolean> {
   private static String[] field28425;

   public void method19646(PacketBuffer var1, Boolean var2) {
      var1.writeBoolean(var2);
   }

   public Boolean method19645(PacketBuffer var1) {
      return var1.readBoolean();
   }

   public Boolean method19644(Boolean var1) {
      return var1;
   }
}
