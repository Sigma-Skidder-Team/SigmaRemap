package mapped;

import org.jetbrains.annotations.Nullable;

public interface Class1867 {
   int method8121();

   @Nullable
   Class1867 method8125();

   String method8124();

   default boolean method8126(Class1867... var1) {
      for (Class1867 var7 : var1) {
         if (this.method8127(var7)) {
            return true;
         }
      }

      return false;
   }

   default boolean method8127(Class1867 var1) {
      return this == var1;
   }

   default boolean method8128(Class1867 var1) {
      Class1867 var4 = this;

      while (!var4.equals(var1)) {
         var4 = var4.method8125();
         if (var4 == null) {
            return false;
         }
      }

      return true;
   }
}
