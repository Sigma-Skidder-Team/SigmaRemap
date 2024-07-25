package remapped;

public class class_9627 extends class_7576 implements class_5312 {
   private String field_49039 = "*";

   @Override
   public void method_24243(String var1) {
      if (var1 != null) {
         this.field_49039 = var1;
      } else {
         throw new IllegalArgumentException("http resource descriptor must not be null");
      }
   }

   @Override
   public String method_41962() {
      return this.field_49039;
   }
}
