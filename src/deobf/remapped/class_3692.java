package remapped;

public class class_3692 implements class_857 {
   public class_3692(class_1491 var1) {
      this.field_18093 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_4675 var4 = var1.method_23255().<class_4675>method_6746(class_4675.class);
      if (var4.method_21623() != null && var4.method_21623().equals("minecraft:brewing_stand")) {
         class_9530[] var5 = var1.<class_9530[]>method_23248(class_8039.field_41186, 0);
         class_9530[] var6 = new class_9530[var5.length + 1];

         for (int var7 = 0; var7 < var6.length; var7++) {
            if (var7 <= 4) {
               if (var7 != 4) {
                  var6[var7] = var5[var7];
               }
            } else {
               var6[var7] = var5[var7 - 1];
            }
         }

         var1.method_23257(class_8039.field_41186, 0, var6);
      }
   }
}
