package remapped;

public final class class_5235 extends class_8085 {
   private static String[] field_26841;

   @Override
   public class_6098 method_43688(class_8743 var1, class_6098 var2) {
      class_240 var5 = var1.method_40141().<class_240>method_10313(class_6451.field_32900);
      class_1331 var6 = var1.method_40142().method_6098(var5);
      class_6331 var7 = var1.method_40140();
      class_2522 var8 = var7.method_28262(var6);
      this.method_36717(true);
      if (!var8.method_8350(class_4783.field_23807)) {
         return super.method_43688(var1, var2);
      } else {
         if (var8.<Integer>method_10313(class_545.field_3268) == 4) {
            this.method_36717(false);
         } else {
            class_545.method_2634(var7, var6, var8);
            var2.method_27970(1);
         }

         return var2;
      }
   }
}
