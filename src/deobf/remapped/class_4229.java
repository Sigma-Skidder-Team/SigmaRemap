package remapped;

public class class_4229 extends class_2255<class_557> {
   private static String[] field_20524;

   public class_4229(class_3569 var1) {
      super(var1);
   }

   public void method_19701(class_557 var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      class_240 var9 = var1.method_17403().<class_240>method_10313(class_8474.field_43419);
      class_2831 var10 = var1.method_2670();

      for (int var11 = 0; var11 < var10.size(); var11++) {
         class_6098 var12 = (class_6098)var10.get(var11);
         if (var12 != class_6098.field_31203) {
            var3.method_36063();
            var3.method_36065(0.5, 0.44921875, 0.5);
            class_240 var13 = class_240.method_1040((var11 + var9.method_1031()) % 4);
            float var14 = -var13.method_1028();
            var3.method_36060(class_2426.field_12074.method_11074(var14));
            var3.method_36060(class_2426.field_12080.method_11074(90.0F));
            var3.method_36065(-0.3125, -0.3125, 0.0);
            var3.method_36062(0.375F, 0.375F, 0.375F);
            class_1893.method_8510().method_8511().method_40269(var12, class_5612.field_28495, var5, var6, var3, var4);
            var3.method_36064();
         }
      }
   }
}
