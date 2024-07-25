package remapped;

public final class class_3138 {
   private final String field_15616;
   private final String field_15618;

   public class_3138(String var1, String var2) {
      if (var2 != null) {
         this.field_15616 = var1;
         this.field_15618 = var2;
      } else {
         throw new NullPointerException("Suffix must be provided.");
      }
   }

   public String method_14508() {
      return this.field_15616;
   }

   public String method_14506() {
      return this.field_15618;
   }
}
