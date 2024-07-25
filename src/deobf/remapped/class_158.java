package remapped;

public class class_158 extends class_5348 {
   private static String[] field_472;
   private final boolean field_471;

   public class_158(String var1, Runnable var2, Runnable var3, boolean var4) {
      super(var1, var2, var3);
      this.field_471 = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_158 var4 = (class_158)var1;
            return this.field_471 == var4.field_471;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return Boolean.hashCode(this.field_471);
   }

   @Override
   public String toString() {
      return this.field_27283 + '[' + this.field_471 + ']';
   }
}
