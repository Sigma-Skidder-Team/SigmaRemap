package remapped;

public class class_5660 {
   private static String[] field_28699;
   private long field_28697;
   private class_6310<?> field_28698;

   public class_5660(class_6310<?> var1, long var2, long param4) {
      this.field_28696 = var1;
      this.field_28698 = var2;
      this.field_28697 = System.currentTimeMillis() + var3;
   }

   public boolean method_25618() {
      return this.field_28697 - System.currentTimeMillis() < 0L;
   }

   public class_6310<?> method_25620() {
      return this.field_28698;
   }
}
