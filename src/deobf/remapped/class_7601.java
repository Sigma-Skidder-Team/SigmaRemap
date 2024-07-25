package remapped;

public class class_7601 extends class_2733 {
   public class_7601() {
      super(class_133.field_382, "banner", 0.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_336();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_336) {
         class_336 var5 = (class_336)var1;
         if (!var2.equals("slate")) {
            if (!var2.equals("stand")) {
               return !var2.equals("top") ? null : var5.field_1247;
            } else {
               return var5.field_1246;
            }
         } else {
            return var5.field_1248;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"slate", "stand", "top"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_3569 var5 = class_3569.field_17468;
      Object var6 = var5.method_16594(class_133.field_382);
      if (var6 instanceof class_9429) {
         if (((class_2255)var6).method_10365() == null) {
            var6 = new class_9429(var5);
         }

         if (var1 instanceof class_336) {
            class_336 var7 = (class_336)var1;
            return (class_8599)var7.method_1541((class_2255)var6);
         } else {
            Config.method_14317("Not a banner model: " + var1);
            return null;
         }
      } else {
         return null;
      }
   }
}
