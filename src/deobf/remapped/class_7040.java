package remapped;

import java.util.Map;

public class class_7040 extends class_2733 {
   public class_7040() {
      super(class_133.field_386, "head_creeper", 0.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_1570(0, 0, 64, 32);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_1570) {
         class_1570 var5 = (class_1570)var1;
         return !var2.equals("head") ? null : (class_1549)class_7860.field_39983.method_7980(var5);
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head"};
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
            var7.put(class_8469.field_43282, var1);
            return (class_8599)var6;
         } else {
            Config.method_14317("Field not found: TileEntitySkullRenderer.MODELS");
            return null;
         }
      } else {
         return null;
      }
   }
}
