package remapped;

public final class class_7440 implements class_2498 {
   private static String[] field_37924;

   @Override
   public class_5167 method_11411(class_5167 var1, Integer[] var2) {
      class_9530 var5;
      if (var2.length != 1) {
         if (var2.length != 2) {
            return var1;
         }

         var5 = new class_9530(var2[0], (byte)1, var2[1].shortValue(), null);
      } else {
         var5 = new class_9530(var2[0], (byte)1, (short)0, null);
      }

      class_9330.method_43074(var5);
      var1.method_23687().add(new class_7579(class_8039.field_41184, var5));
      return var1;
   }
}
