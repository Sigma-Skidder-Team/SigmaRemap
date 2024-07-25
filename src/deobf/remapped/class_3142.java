package remapped;

public class class_3142 {
   private static String[] field_15632;
   private int field_15631 = 0;
   private class_1549 field_15630 = null;

   public class_3142(int var1, class_1549 var2) {
      this.field_15631 = var1;
      this.field_15630 = var2;
   }

   public class_1549 method_14529() {
      return this.field_15630;
   }

   public void method_14530(class_2344 var1, class_7966 var2, class_7907 var3, int var4, int var5) {
      class_1549 var8 = class_1347.method_6229(var1, this.field_15631);
      if (var8 != null) {
         var8.method_7057(var2);
      }

      this.field_15630.method_7060(var2, var3, var4, var5);
   }
}
