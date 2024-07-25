package remapped;

public class class_4257 extends class_1174 {
   private static String[] field_20634;
   private static final long field_20631 = 50L;
   private static final long field_20633 = 20L;
   private long field_20630 = 0L;
   private boolean field_20632 = true;

   public class_4257(class_1455 var1) {
      super(var1);
   }

   public void method_19835() {
      this.field_20630 = Math.max(this.field_20630 + 50L, System.currentTimeMillis() - 1000L);
   }

   public long method_19836() {
      return this.field_20630;
   }

   public boolean method_19838() {
      return this.field_20632;
   }

   public void method_19837(boolean var1) {
      this.field_20632 = var1;
   }
}
