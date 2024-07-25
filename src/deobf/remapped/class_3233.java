package remapped;

public class class_3233 extends class_2733 {
   public class_3233() {
      super(class_133.field_373, "trapped_chest", 0.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_7231();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_7231) {
         class_7231 var5 = (class_7231)var1;
         if (!var2.equals("lid")) {
            if (!var2.equals("base")) {
               return !var2.equals("knob") ? null : var5.field_37108;
            } else {
               return var5.field_37107;
            }
         } else {
            return var5.field_37109;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"lid", "base", "knob"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_3569 var5 = class_3569.field_17468;
      Object var6 = var5.method_16594(class_133.field_373);
      if (var6 instanceof class_4732) {
         if (((class_2255)var6).method_10365() == null) {
            var6 = new class_4732(var5);
         }

         if (var1 instanceof class_7231) {
            class_7231 var7 = (class_7231)var1;
            return (class_8599)var7.method_33095((class_2255)var6);
         } else {
            class_3111.method_14317("Not a chest model: " + var1);
            return null;
         }
      } else {
         return null;
      }
   }
}
