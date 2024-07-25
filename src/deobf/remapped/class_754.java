package remapped;

import org.jetbrains.annotations.Nullable;

public interface class_754 {
   int method_3416();

   @Nullable
   class_754 method_3417();

   String method_3419();

   default boolean method_3421(class_754... var1) {
      for (class_754 var7 : var1) {
         if (this.method_3420(var7)) {
            return true;
         }
      }

      return false;
   }

   default boolean method_3420(class_754 var1) {
      return this == var1;
   }

   default boolean method_3418(class_754 var1) {
      class_754 var4 = this;

      while (!var4.equals(var1)) {
         var4 = var4.method_3417();
         if (var4 == null) {
            return false;
         }
      }

      return true;
   }
}
