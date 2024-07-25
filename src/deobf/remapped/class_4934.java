package remapped;

import java.util.Random;

public class class_4934 extends class_7067<class_1453> {
   private static String[] field_25579;

   public class_4934(class_6122 var1) {
      super(var1);
      this.field_36492 = 0.5F;
   }

   public void method_22629(class_1453 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      class_2522 var9 = var1.method_6688();
      if (var9.method_8352() == class_7537.field_38469) {
         class_6486 var10 = var1.method_6689();
         if (var9 != var10.method_28262(var1.method_37075()) && var9.method_8352() != class_7537.field_38470) {
            var4.method_36063();
            class_1331 var11 = new class_1331(var1.method_37302(), var1.method_37241().field_19939, var1.method_37156());
            var4.method_36065(-0.5, 0.0, -0.5);
            class_856 var12 = MinecraftClient.method_8510().method_8505();
            var12.method_3717()
               .method_10103(
                  var10,
                  var12.method_3715(var9),
                  var9,
                  var11,
                  var4,
                  var5.method_11645(class_6416.method_29331(var9)),
                  false,
                  new Random(),
                  var9.method_8371(var1.method_6690()),
                  class_5367.field_27381
               );
            var4.method_36064();
            super.method_32551(var1, var2, var3, var4, var5, var6);
         }
      }
   }

   public class_4639 method_22628(class_1453 var1) {
      return class_8359.field_42824;
   }
}
