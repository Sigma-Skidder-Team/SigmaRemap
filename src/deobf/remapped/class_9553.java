package remapped;

public class class_9553 extends class_2733 {
   public class_9553() {
      super(class_133.field_361, "chest_large", 0.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_8182();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_8182) {
         class_8182 var5 = (class_8182)var1;
         if (!var2.equals("lid_left")) {
            if (!var2.equals("base_left")) {
               if (!var2.equals("knob_left")) {
                  if (!var2.equals("lid_right")) {
                     if (!var2.equals("base_right")) {
                        return !var2.equals("knob_right") ? null : var5.field_41879;
                     } else {
                        return var5.field_41881;
                     }
                  } else {
                     return var5.field_41880;
                  }
               } else {
                  return var5.field_41884;
               }
            } else {
               return var5.field_41882;
            }
         } else {
            return var5.field_41883;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"lid_left", "base_left", "knob_left", "lid_right", "base_right", "knob_right"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_3569 var5 = class_3569.field_17468;
      Object var6 = var5.method_16594(class_133.field_361);
      if (var6 instanceof class_4732) {
         if (((class_2255)var6).method_10365() == null) {
            var6 = new class_4732(var5);
         }

         if (var1 instanceof class_8182) {
            class_8182 var7 = (class_8182)var1;
            return (class_8599)var7.method_37500((class_2255)var6);
         } else {
            class_3111.method_14317("Not a large chest model: " + var1);
            return null;
         }
      } else {
         return null;
      }
   }
}
