package remapped;

import java.util.Optional;

public final class class_1187 implements class_1720<Optional<class_1331>> {
   private static String[] field_6654;

   public void method_5240(class_8248 var1, Optional<class_1331> var2) {
      var1.writeBoolean(var2.isPresent());
      if (var2.isPresent()) {
         var1.method_37770((class_1331)var2.get());
      }
   }

   public Optional<class_1331> method_5242(class_8248 var1) {
      return var1.readBoolean() ? Optional.<class_1331>of(var1.method_37748()) : Optional.<class_1331>empty();
   }

   public Optional<class_1331> method_5241(Optional<class_1331> var1) {
      return var1;
   }
}
