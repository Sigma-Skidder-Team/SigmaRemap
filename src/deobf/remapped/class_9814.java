package remapped;

public final class class_9814 {
   private final String field_49740;
   private final String field_49741;

   public class_9814(String var1, String var2) {
      if (var1 != null) {
         if (var2 != null) {
            this.field_49740 = var1;
            this.field_49741 = var2;
         } else {
            throw new NullPointerException("realm == null");
         }
      } else {
         throw new NullPointerException("scheme == null");
      }
   }

   public String method_45239() {
      return this.field_49740;
   }

   public String method_45241() {
      return this.field_49741;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class_9814 && ((class_9814)var1).field_49740.equals(this.field_49740) && ((class_9814)var1).field_49741.equals(this.field_49741);
   }

   @Override
   public int hashCode() {
      int var3 = 29;
      var3 = 31 * var3 + this.field_49741.hashCode();
      return 31 * var3 + this.field_49740.hashCode();
   }

   @Override
   public String toString() {
      return this.field_49740 + " realm=\"" + this.field_49741 + "\"";
   }
}
