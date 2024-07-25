package remapped;

public final class class_3818 extends class_8085 {
   private static String[] field_18680;

   @Override
   public class_6098 method_43688(class_8743 var1, class_6098 var2) {
      class_6331 var5 = var1.method_40140();
      Direction var6 = var1.method_40141().<Direction>method_10313(class_6451.field_32900);
      class_1331 var7 = var1.method_40142().method_6098(var6);
      if (var5.method_22548(var7) && class_9373.method_43349(var5, var7, var2)) {
         var5.method_7513(
            var7,
            class_4783.field_23444
               .method_29260()
               .method_10308(class_3725.field_18230, Integer.valueOf(var6.method_1029() != class_9249.field_47216 ? var6.method_1046().method_1031() * 4 : 0)),
            3
         );
         class_3757 var8 = var5.method_28260(var7);
         if (var8 instanceof class_4797) {
            class_9373.method_43348(var5, var7, (class_4797)var8);
         }

         var2.method_27970(1);
         this.method_36717(true);
      } else {
         this.method_36717(class_8228.method_37666(var1, var2));
      }

      return var2;
   }
}
