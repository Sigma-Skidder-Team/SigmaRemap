package remapped;

public class class_1106 implements class_6224 {
   private static String[] field_6339;

   public class_1106(class_1289 var1) {
      this.field_6340 = var1;
   }

   @Override
   public void method_28452(Object... var1) {
      Object var4 = var1[0];
      if (!(var4 instanceof String)) {
         if (var4 instanceof byte[]) {
            class_1289.method_5761(this.field_6340, (byte[])var4);
         }
      } else {
         class_1289.method_5771(this.field_6340, (String)var4);
      }
   }
}
