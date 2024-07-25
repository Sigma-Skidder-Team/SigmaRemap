package remapped;

public class class_1508 {
   private static String[] field_7984;
   private long field_7982;
   private String field_7983;

   public class_1508(String var1, long var2) {
      this.field_7983 = var1;
      this.field_7982 = System.currentTimeMillis() + var2;
   }

   public boolean method_6909() {
      return this.method_6911() < 0L;
   }

   public long method_6911() {
      return this.field_7982 - System.currentTimeMillis();
   }

   public String method_6912() {
      return this.field_7983;
   }
}
