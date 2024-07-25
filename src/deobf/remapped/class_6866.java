package remapped;

import java.util.Optional;

public final class class_6866 implements class_1720<Optional<class_2522>> {
   private static String[] field_35376;

   public void method_31491(class_8248 var1, Optional<class_2522> var2) {
      if (!var2.isPresent()) {
         var1.method_37743(0);
      } else {
         var1.method_37743(class_6414.method_29285((class_2522)var2.get()));
      }
   }

   public Optional<class_2522> method_31493(class_8248 var1) {
      int var4 = var1.method_37778();
      return var4 != 0 ? Optional.<class_2522>of(class_6414.method_29293(var4)) : Optional.<class_2522>empty();
   }

   public Optional<class_2522> method_31492(Optional<class_2522> var1) {
      return var1;
   }
}
