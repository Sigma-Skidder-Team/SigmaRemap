package remapped;

import java.util.Map;

public class class_227 extends class_2733 {
   public class_227() {
      super(class_133.field_386, "head_dragon", 0.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_7840(0.0F);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_7840) {
         class_7840 var5 = (class_7840)var1;
         if (!var2.equals("head")) {
            return !var2.equals("jaw") ? null : (class_1549)class_7860.method_35557(var5, class_7860.field_39902);
         } else {
            return (class_1549)class_7860.method_35557(var5, class_7860.field_40088);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head", "jaw"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_3569 var5 = class_3569.field_17468;
      Object var6 = var5.method_16594(class_133.field_386);
      if (var6 instanceof class_903) {
         if (((class_2255)var6).method_10365() == null) {
            var6 = new class_903(var5);
         }

         Map var7 = (Map)class_7860.field_40215.method_7979();
         if (var7 != null) {
            var7.put(class_8469.field_43286, var1);
            return (class_8599)var6;
         } else {
            class_3111.method_14317("Field not found: TileEntitySkullRenderer.MODELS");
            return null;
         }
      } else {
         return null;
      }
   }
}
