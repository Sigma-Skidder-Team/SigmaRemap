package remapped;

public abstract class class_1565 {
   public String field_8237;

   public class_1565(String var1) {
      this.field_8237 = var1;
   }

   public String method_7078() {
      return this.field_8237;
   }

   public abstract boolean method_7080();

   public static class_1565 method_7079(String var0) {
      switch (var0) {
         case "true":
            return new class_5205(var0);
         case "false":
            return new class_9159(var0);
         default:
            return null;
      }
   }
}
