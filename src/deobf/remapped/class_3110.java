package remapped;

public class class_3110 extends class_2733 {
   public class_3110() {
      super(class_6629.field_34278, "tropical_fish_b", 0.2F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_2313(0.0F);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_2313) {
         class_2313 var5 = (class_2313)var1;
         if (!var2.equals("body")) {
            if (!var2.equals("tail")) {
               if (!var2.equals("fin_right")) {
                  if (!var2.equals("fin_left")) {
                     if (!var2.equals("fin_top")) {
                        return !var2.equals("fin_bottom") ? null : (class_1549)class_7860.field_39995.method_39231(var5, 5);
                     } else {
                        return (class_1549)class_7860.field_39995.method_39231(var5, 4);
                     }
                  } else {
                     return (class_1549)class_7860.field_39995.method_39231(var5, 3);
                  }
               } else {
                  return (class_1549)class_7860.field_39995.method_39231(var5, 2);
               }
            } else {
               return (class_1549)class_7860.field_39995.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_39995.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"body", "tail", "fin_right", "fin_left", "fin_top", "fin_bottom"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      Object var6 = var5.method_28130().get(class_6629.field_34278);
      if (var6 instanceof class_5008) {
         if (((class_7067)var6).method_32557() == null) {
            class_5008 var7 = new class_5008(var5);
            var7.field_36492 = var2;
            var6 = var7;
         }

         class_5008 var8 = (class_5008)var6;
         if (class_7860.field_39880.method_7978()) {
            class_7860.field_39880.method_7982(var8, var1);
            return (class_8599)var8;
         } else {
            Config.method_14317("Model field not found: RenderTropicalFish.modelB");
            return null;
         }
      } else {
         Config.method_14317("Not a TropicalFishRenderer: " + var6);
         return null;
      }
   }
}
