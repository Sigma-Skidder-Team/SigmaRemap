package remapped;

public class class_7787<T extends class_5154> {
   private static String[] field_39464;
   private final T field_39462;
   private final class_3139 field_39465;
   private final String field_39463;

   public class_7787(T var1, class_3139 var2, String var3) {
      this.field_39462 = (T)var1;
      this.field_39465 = var2;
      this.field_39463 = var3;
   }

   public T method_35342() {
      return this.field_39462;
   }

   public void method_35340(class_3362 var1) {
      var1.method_15396(this.field_39465, this.field_39463);
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_7787 var4 = (class_7787)var1;
            if (this.field_39462.equals(var4.field_39462)) {
               return this.field_39465.equals(var4.field_39465) ? this.field_39463.equals(var4.field_39463) : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field_39462.hashCode();
      var3 = 31 * var3 + this.field_39465.hashCode();
      return 31 * var3 + this.field_39463.hashCode();
   }
}
