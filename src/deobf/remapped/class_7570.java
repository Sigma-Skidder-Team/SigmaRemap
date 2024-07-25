package remapped;

public class class_7570 implements class_857 {
   public class_7570(class_5905 var1) {
      this.field_38580 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      short var4 = var1.<Short>method_23248(class_8039.field_41175, 0);
      short var5 = var1.<Short>method_23248(class_8039.field_41166, 0);
      boolean var6 = var5 == 45 && var4 == 0;
      class_4675 var7 = var1.method_23255().<class_4675>method_6746(class_4675.class);
      if (var7.method_21623() != null && var7.method_21623().equals("minecraft:brewing_stand")) {
         if (var5 == 4) {
            var6 = true;
         }

         if (var5 > 4) {
            var1.method_23257(class_8039.field_41166, 0, (short)(var5 - 1));
         }
      }

      if (var6) {
         var1.method_23260(22, new class_1946(this, var4, var5)).method_23233(class_6890.class);
         var1.method_23257(class_8039.field_41133, 0, (byte)0);
         var1.method_23257(class_8039.field_41133, 1, (byte)0);
         var1.method_23257(class_8039.field_41166, 0, (short)-999);
      }
   }
}
