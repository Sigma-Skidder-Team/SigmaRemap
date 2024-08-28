package mapped;

import java.util.Optional;

public final class Class6470 implements Class6466<Optional<Class7380>> {
   private static String[] field28417;

   public void method19646(PacketBuffer var1, Optional<Class7380> var2) {
      if (!var2.isPresent()) {
         var1.writeVarInt(0);
      } else {
         var1.writeVarInt(Class3209.method11535((Class7380)var2.get()));
      }
   }

   public Optional<Class7380> method19645(PacketBuffer var1) {
      int var4 = var1.method35714();
      return var4 != 0 ? Optional.<Class7380>of(Class3209.method11536(var4)) : Optional.<Class7380>empty();
   }

   public Optional<Class7380> method19644(Optional<Class7380> var1) {
      return var1;
   }
}
