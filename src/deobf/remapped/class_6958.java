package remapped;

public class class_6958 implements class_857 {
   private static String[] field_35765;

   public class_6958(class_5497 var1) {
      this.field_35764 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23248(class_8039.field_41179, 0);
      int var5 = var1.<Integer>method_23248(class_8039.field_41179, 1);
      if (var4 != 1010) {
         if (var4 == 2001) {
            var1.method_23257(class_8039.field_41179, 1, this.field_35764.field_27989.method_27301().method_28217(var5));
         }
      } else {
         var1.method_23257(class_8039.field_41179, 1, this.field_35764.field_27989.method_27301().method_28210(var5));
      }
   }
}
