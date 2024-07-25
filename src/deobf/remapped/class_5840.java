package remapped;

public class class_5840 {
   private static String[] field_29691;
   private long field_29688;
   private class_6310<?> field_29690;

   public class_5840(class_6310<?> var1, long var2, long param4) {
      this.field_29689 = var1;
      this.field_29690 = var2;
      this.field_29688 = System.currentTimeMillis() + var3;
   }

   public boolean method_26634() {
      return this.field_29688 - System.currentTimeMillis() < 0L;
   }

   public class_6310<?> method_26633() {
      return this.field_29690;
   }
}
