package remapped;

public enum class_2066 {
   field_10427("red", class_4783.field_23594.method_29260()),
   field_10428("brown", class_4783.field_23729.method_29260());

   private final String field_10430;
   private final class_2522 field_10431;

   private class_2066(String var3, class_2522 var4) {
      this.field_10430 = var3;
      this.field_10431 = var4;
   }

   public class_2522 method_9649() {
      return this.field_10431;
   }

   private static class_2066 method_9652(String var0) {
      for (class_2066 var6 : values()) {
         if (var6.field_10430.equals(var0)) {
            return var6;
         }
      }

      return field_10427;
   }
}
