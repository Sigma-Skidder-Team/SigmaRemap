package remapped;

public class class_5425 extends class_4024 {
   private static String[] field_27631;

   public class_5425(class_3765[] var1, class_7279[] var2) {
      super(var1, var2);
   }

   @Override
   public class_3515 method_17435() {
      return class_5570.field_28301;
   }

   @Override
   public class_978 method_18540(class_978[] var1) {
      switch (var1.length) {
         case 0:
            return field_5005;
         case 1:
            return var1[0];
         case 2:
            return var1[0].method_4279(var1[1]);
         default:
            return (var1x, var2) -> {
               for (class_978 var8 : var1) {
                  if (!var8.method_4277(var1x, var2)) {
                     return false;
                  }
               }

               return true;
            };
      }
   }
}
