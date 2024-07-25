package remapped;

public class class_4231 extends Exception {
   private static String[] field_20536;
   private String field_20537;

   public class_4231(String var1) {
      this.field_20537 = var1;
   }

   public class_4231(Exception var1) {
      this.field_20537 = var1.getMessage();
   }

   @Override
   public String getMessage() {
      return this.field_20537;
   }
}
