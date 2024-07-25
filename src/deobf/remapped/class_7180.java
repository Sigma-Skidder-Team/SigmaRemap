package remapped;

import java.util.Optional;
import java.util.UUID;

public final class class_7180 implements class_1720<Optional<UUID>> {
   private static String[] field_36922;

   public void method_32894(class_8248 var1, Optional<UUID> var2) {
      var1.writeBoolean(var2.isPresent());
      if (var2.isPresent()) {
         var1.method_37746((UUID)var2.get());
      }
   }

   public Optional<UUID> method_32896(class_8248 var1) {
      return var1.readBoolean() ? Optional.<UUID>of(var1.method_37753()) : Optional.<UUID>empty();
   }

   public Optional<UUID> method_32895(Optional<UUID> var1) {
      return var1;
   }
}
