package remapped;

public class class_6963 extends class_2255<class_4816> {
   private static String[] field_35776;
   private final class_7916<?> field_35775;

   public class_6963(class_7916<?> var1, class_3569 var2) {
      super(var2);
      this.field_35775 = var1;
   }

   public void method_31818(class_4816 var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      Direction var9 = Direction.field_817;
      if (var1.method_17392()) {
         class_2522 var10 = var1.method_17402().method_28262(var1.method_17399());
         if (var10.method_8360() instanceof class_3153) {
            var9 = var10.<Direction>method_10313(class_3153.field_15681);
         }
      }

      class_9077 var14 = var1.method_22192();
      class_2843 var11;
      if (var14 != null) {
         var11 = class_5276.field_26969.get(var14.method_41794());
      } else {
         var11 = class_5276.field_26968;
      }

      var3.method_36063();
      var3.method_36065(0.5, 0.5, 0.5);
      float var12 = 0.9995F;
      var3.method_36062(0.9995F, 0.9995F, 0.9995F);
      var3.method_36060(var9.method_1026());
      var3.method_36062(1.0F, -1.0F, -1.0F);
      var3.method_36065(0.0, -1.0, 0.0);
      class_7907 var13 = var11.method_12943(var4, RenderLayer::method_16755);
      this.field_35775.method_35819().method_7060(var3, var13, var5, var6);
      var3.method_36065(0.0, (double)(-var1.method_22199(var2) * 0.5F), 0.0);
      var3.method_36060(class_2426.field_12074.method_11074(270.0F * var1.method_22199(var2)));
      this.field_35775.method_35818().method_7060(var3, var13, var5, var6);
      var3.method_36064();
   }
}
