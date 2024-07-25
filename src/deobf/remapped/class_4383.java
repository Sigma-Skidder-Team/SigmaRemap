package remapped;

public class class_4383 implements class_4726 {
   private static String[] field_21499;

   @Override
   public void method_21840(class_7038 var1, class_7038 var2) {
      int var5 = 0;
      int var6 = 0;

      for (class_7038 var8 : var1.method_32134()) {
         if (var8.method_32132() + var8.method_32109() > var5) {
            var5 = var8.method_32132() + var8.method_32109();
         }

         if (var8.method_32173() + var8.method_32137() > var6) {
            var6 = var8.method_32173() + var8.method_32137();
         }
      }

      var1.method_32142(var5);
      var1.method_32158(var6);
   }
}
