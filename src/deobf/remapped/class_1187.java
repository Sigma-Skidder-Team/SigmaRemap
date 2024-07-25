package remapped;

import java.util.Optional;

public final class class_1187 implements class_1720<Optional<BlockPos>> {
   private static String[] field_6654;

   public void method_5240(class_8248 var1, Optional<BlockPos> var2) {
      var1.writeBoolean(var2.isPresent());
      if (var2.isPresent()) {
         var1.method_37770((BlockPos)var2.get());
      }
   }

   public Optional<BlockPos> method_5242(class_8248 var1) {
      return var1.readBoolean() ? Optional.<BlockPos>of(var1.method_37748()) : Optional.<BlockPos>empty();
   }

   public Optional<BlockPos> method_5241(Optional<BlockPos> var1) {
      return var1;
   }
}
