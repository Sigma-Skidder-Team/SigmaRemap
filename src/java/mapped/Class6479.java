package mapped;

import net.minecraft.network.PacketBuffer;

public final class Class6479 implements Class6466<String> {
   private static String[] field28426;

   public void method19646(PacketBuffer var1, String var2) {
      var1.writeString(var2);
   }

   public String method19645(PacketBuffer var1) {
      return var1.readString(32767);
   }

   public String method19644(String var1) {
      return var1;
   }
}
