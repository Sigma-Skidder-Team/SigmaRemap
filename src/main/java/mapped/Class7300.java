package mapped;

public class Class7300 extends Class7299 implements Class7293 {
   private String field31281 = "*";

   @Override
   public void method23062(String var1) {
      if (var1 != null) {
         this.field31281 = var1;
      } else {
         throw new IllegalArgumentException("http resource descriptor must not be null");
      }
   }

   @Override
   public String method23063() {
      return this.field31281;
   }
}
