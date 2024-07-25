package remapped;

public class class_3109 implements class_4003 {
   private static String[] field_15449;

   public class_3109(class_1289 var1, class_1289 var2) {
      this.field_15447 = var1;
      this.field_15448 = var2;
   }

   @Override
   public void method_18482(Object[] var1) {
      for (Object var7 : var1) {
         if (!(var7 instanceof String)) {
            if (var7 instanceof byte[]) {
               this.field_15448.field_7072.method_5058((byte[])var7);
            }
         } else {
            this.field_15448.field_7072.method_5056((String)var7);
         }
      }

      class_1289.method_5760(this.field_15448, false);
      class_1289.method_5740(this.field_15448);
   }
}
