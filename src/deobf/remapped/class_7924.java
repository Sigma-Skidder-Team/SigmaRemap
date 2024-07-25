package remapped;

public class class_7924 {
   public static void method_35837(class_6003 var0) {
      class_7831 var3 = var0.<class_7831>method_18997(class_7831.class);
      var3.method_33121(class_3680.field_18020, class_9880.field_50008);
      var3.method_33124(class_3680.field_17972);
      var3.method_33125(class_3680.field_18015, class_9880.field_49982);
      var3.method_33128(class_3680.field_18001, class_7498.field_38252);
      var3.method_33112(class_3680.field_17952);
      var0.method_19015(class_3680.field_18034, new class_3717(var0));
      var0.method_19015(class_3680.field_17975, new class_1487());
   }

   public static class_5531 method_35838(String var0) {
      class_5531 var3 = class_6003.field_30576.method_40674().get(var0);
      if (var3 != null) {
         return var3;
      } else {
         class_3446.method_15886().method_34617().severe("Could not get dimension data of " + var0);
         throw new NullPointerException("Dimension data for " + var0 + " is null!");
      }
   }
}
