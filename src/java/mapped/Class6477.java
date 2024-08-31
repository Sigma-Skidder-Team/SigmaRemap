package mapped;

import net.minecraft.network.PacketBuffer;

import java.util.Optional;
import java.util.UUID;

public final class Class6477 implements Class6466<Optional<UUID>> {
   private static String[] field28424;

   public void method19646(PacketBuffer var1, Optional<UUID> var2) {
      var1.writeBoolean(var2.isPresent());
      if (var2.isPresent()) {
         var1.method35716((UUID)var2.get());
      }
   }

   public Optional<UUID> method19645(PacketBuffer var1) {
      return var1.readBoolean() ? Optional.<UUID>of(var1.method35717()) : Optional.<UUID>empty();
   }

   public Optional<UUID> method19644(Optional<UUID> var1) {
      return var1;
   }
}
