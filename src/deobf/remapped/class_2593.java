package remapped;

public interface class_2593 extends class_5978, class_4582 {
   @Override
   default boolean method_21238(class_6163 var1, class_1331 var2, class_2522 var3, class_2340 var4) {
      return !var3.<Boolean>method_10313(class_6023.field_30719) && var4 == class_8532.field_43674;
   }

   @Override
   default boolean method_21237(class_9379 var1, class_1331 var2, class_2522 var3, class_4774 var4) {
      if (!var3.<Boolean>method_10313(class_6023.field_30719) && var4.method_22005() == class_8532.field_43674) {
         if (!var1.method_22567()) {
            var1.method_7513(var2, var3.method_10308(class_6023.field_30719, Boolean.valueOf(true)), 3);
            var1.method_43362().method_14011(var2, var4.method_22005(), var4.method_22005().method_10711(var1));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default class_2340 method_27280(class_9379 var1, class_1331 var2, class_2522 var3) {
      if (!var3.<Boolean>method_10313(class_6023.field_30719)) {
         return class_8532.field_43673;
      } else {
         var1.method_7513(var2, var3.method_10308(class_6023.field_30719, Boolean.valueOf(false)), 3);
         return class_8532.field_43674;
      }
   }
}
