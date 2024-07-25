package remapped;

public final class class_6337 extends class_8085 {
   private static String[] field_32359;

   @Override
   public class_6098 method_43688(class_8743 var1, class_6098 var2) {
      class_1331 var5 = var1.method_40142().method_6098(var1.method_40141().<class_240>method_10313(class_6451.field_32900));

      for (class_5521 var7 : var1.method_40140()
         .<class_5521>method_25869(class_5521.class, new class_4092(var5), var0 -> var0.method_37330() && !var0.method_25017())) {
         if (var7.method_19043() && var7.method_37166(499, var2)) {
            var2.method_27970(1);
            this.method_36717(true);
            return var2;
         }
      }

      return super.method_43688(var1, var2);
   }
}
