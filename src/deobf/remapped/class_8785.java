package remapped;

public class class_8785 extends class_2733 {
   public class_8785() {
      super(class_133.field_374, "bed", 0.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_6900();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_6900) {
         class_6900 var5 = (class_6900)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("foot")) {
               class_1549[] var6 = var5.field_35474;
               if (var6 != null) {
                  if (var2.equals("leg1")) {
                     return var6[0];
                  }

                  if (var2.equals("leg2")) {
                     return var6[1];
                  }

                  if (var2.equals("leg3")) {
                     return var6[2];
                  }

                  if (var2.equals("leg4")) {
                     return var6[3];
                  }
               }

               return null;
            } else {
               return var5.field_35476;
            }
         } else {
            return var5.field_35475;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head", "foot", "leg1", "leg2", "leg3", "leg4"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_3569 var5 = class_3569.field_17468;
      Object var6 = var5.method_16594(class_133.field_374);
      if (var6 instanceof class_1365) {
         if (((class_2255)var6).method_10365() == null) {
            var6 = new class_1365(var5);
         }

         if (var1 instanceof class_6900) {
            class_6900 var7 = (class_6900)var1;
            return (class_8599)var7.method_31597((class_2255)var6);
         } else {
            Config.method_14317("Not a BedModel: " + var1);
            return null;
         }
      } else {
         return null;
      }
   }
}
