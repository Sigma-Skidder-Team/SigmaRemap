package remapped;

public class class_9382 extends class_6906<class_2048> {
   private static String[] field_47951;

   public class_9382(class_6122 var1) {
      super(var1);
   }

   public void method_43385(class_2048 var1, float var2, class_2522 var3, class_7966 var4, class_2565 var5, int var6) {
      int var9 = var1.method_9572();
      if (var9 > -1 && (float)var9 - var2 + 1.0F < 10.0F) {
         float var10 = 1.0F - ((float)var9 - var2 + 1.0F) / 10.0F;
         var10 = class_9299.method_42828(var10, 0.0F, 1.0F);
         var10 *= var10;
         var10 *= var10;
         float var11 = 1.0F + var10 * 0.3F;
         var4.method_36062(var11, var11, var11);
      }

      method_43384(var3, var4, var5, var6, var9 > -1 && var9 / 5 % 2 == 0);
   }

   public static void method_43384(class_2522 var0, class_7966 var1, class_2565 var2, int var3, boolean var4) {
      int var7;
      if (!var4) {
         var7 = class_5367.field_27381;
      } else {
         var7 = class_5367.method_24487(class_5367.method_24485(1.0F), 10);
      }

      if (class_3111.method_14424() && var4) {
         class_6588.method_30135(1.0F, 1.0F, 1.0F, 0.5F);
      }

      MinecraftClient.method_8510().method_8505().method_3713(var0, var1, var2, var3, var7);
      if (class_3111.method_14424()) {
         class_6588.method_30135(0.0F, 0.0F, 0.0F, 0.0F);
      }
   }
}
