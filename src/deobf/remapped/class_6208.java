package remapped;

public class class_6208 implements class_857 {
   public class_6208(class_7796 var1) {
      this.field_31730 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      String var4 = var1.<String>method_23248(class_8039.field_41171, 0);
      if (var4.equalsIgnoreCase("MC|BSign")) {
         class_9530 var5 = var1.<class_9530>method_23261(class_8039.field_41149);
         if (var5 != null) {
            var5.method_43965(387);
            class_5825.method_26374(var5);
         }
      }

      if (var4.equalsIgnoreCase("MC|AutoCmd")) {
         var1.method_23257(class_8039.field_41171, 0, "MC|AdvCdm");
         var1.method_23236(class_8039.field_41133, (byte)0);
         var1.<Integer>method_23261(class_8039.field_41179);
         var1.<Integer>method_23261(class_8039.field_41179);
         var1.<Integer>method_23261(class_8039.field_41179);
         var1.<String>method_23261(class_8039.field_41171);
         var1.<Boolean>method_23261(class_8039.field_41161);
         var1.method_23246();
      }

      if (var4.equalsIgnoreCase("MC|AdvCmd")) {
         var1.method_23257(class_8039.field_41171, 0, "MC|AdvCdm");
      }
   }
}
