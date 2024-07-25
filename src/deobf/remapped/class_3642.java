package remapped;

import java.util.function.Supplier;

public class class_3642<T> {
   private static String[] field_17765;
   private Supplier<T> field_17764;
   private T field_17766;

   public class_3642(Supplier<T> var1) {
      this.field_17764 = var1;
   }

   public T method_16960() {
      Supplier var3 = this.field_17764;
      if (var3 != null) {
         this.field_17766 = (T)var3.get();
         this.field_17764 = null;
      }

      return this.field_17766;
   }
}
