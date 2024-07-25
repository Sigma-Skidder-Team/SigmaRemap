package remapped;

public class class_6287 {
   private static String[] field_32134;
   private long field_32136;
   private class_6310 field_32133;

   public class_6287(class_6310<?> var1, long var2, long param4) {
      this.field_32135 = var1;
      this.field_32133 = var2;
      this.field_32136 = System.currentTimeMillis() + var3;
   }

   public boolean method_28689() {
      return this.field_32136 - System.currentTimeMillis() < 0L;
   }

   public class_6310 method_28687() {
      return this.field_32133;
   }
}
