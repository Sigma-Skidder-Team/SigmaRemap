package remapped;

public class class_9641 implements class_857 {
   private static String[] field_49120;

   public class_9641(class_8956 var1) {
      this.field_49119 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23248(class_8039.field_41179, 0);
      int var5 = var1.<Integer>method_23248(class_8039.field_41179, 1);
      class_1455 var6 = var1.method_23255();
      class_9523[] var7 = var1.<class_9523[]>method_23248(class_8039.field_41154, 0);

      for (class_9523 var11 : var7) {
         int var12 = class_2750.method_12391(var11.method_43935());
         class_9371 var13 = new class_9371(var11.method_43936() + var4 * 16, var11.method_43931(), var11.method_43930() + var5 * 16);
         if (class_3446.method_15884().method_25803()) {
            class_7943.method_35960(var6, var13.method_43340(), var13.method_43342(), var13.method_43343(), var12);
         }

         var11.method_43933(class_2750.method_12393(var1.method_23255(), var13, var12));
      }

      if (class_3446.method_15884().method_25803()) {
         for (class_9523 var21 : var7) {
            int var23 = var21.method_43935();
            class_9371 var26 = new class_9371(var21.method_43936() + var4 * 16, var21.method_43931(), var21.method_43930() + var5 * 16);
            class_111 var14 = class_7943.method_35961(var23);
            if (var14 != null) {
               var23 = var14.method_340(var6, var26, var23);
               var21.method_43933(var23);
            }
         }

         var1.method_23235(class_8633.class, true, true);
         var1.method_23245();

         for (class_9523 var22 : var7) {
            class_9371 var25 = new class_9371(var22.method_43936() + var4 * 16, var22.method_43931(), var22.method_43930() + var5 * 16);
            class_7943.method_35972(var6, var25);
         }
      }
   }
}
