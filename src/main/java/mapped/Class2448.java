package mapped;

public class Class2448 extends Exception {
   private static String[] field16530;
   private String field16531;

   public Class2448(String var1) {
      this.field16531 = var1;
   }

   public Class2448(Exception var1) {
      this.field16531 = var1.getMessage();
   }

   @Override
   public String getMessage() {
      return this.field16531;
   }
}
