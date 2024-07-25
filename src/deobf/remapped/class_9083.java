package remapped;

public class class_9083 {
   private final String field_46518;
   private final String field_46517;

   public class_9083(String var1, Object var2) {
      this.field_46518 = var1;
      if (var2 != null) {
         if (!(var2 instanceof Throwable)) {
            this.field_46517 = var2.toString();
         } else {
            Throwable var5 = (Throwable)var2;
            this.field_46517 = "~~ERROR~~ " + var5.getClass().getSimpleName() + ": " + var5.getMessage();
         }
      } else {
         this.field_46517 = "~~NULL~~";
      }
   }

   public String method_41815() {
      return this.field_46518;
   }

   public String method_41813() {
      return this.field_46517;
   }
}
