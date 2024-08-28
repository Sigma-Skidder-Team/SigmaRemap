package mapped;

import java.util.OptionalInt;

public final class Class6473 implements Class6466<OptionalInt> {
   private static String[] field28420;

   public void method19646(PacketBuffer var1, OptionalInt var2) {
      var1.writeVarInt(var2.orElse(-1) + 1);
   }

   public OptionalInt method19645(PacketBuffer var1) {
      int var4 = var1.method35714();
      return var4 != 0 ? OptionalInt.of(var4 - 1) : OptionalInt.empty();
   }

   public OptionalInt method19644(OptionalInt var1) {
      return var1;
   }
}
