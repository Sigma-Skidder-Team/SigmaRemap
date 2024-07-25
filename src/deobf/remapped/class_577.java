package remapped;

public class class_577 extends class_2520 {
   public class_577() {
      super(class_6629.field_34289, "armor_stand", 0.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_3851();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_3851) {
         class_3851 var5 = (class_3851)var1;
         if (!var2.equals("right")) {
            if (!var2.equals("left")) {
               if (!var2.equals("waist")) {
                  return !var2.equals("base") ? super.method_12291(var5, var2) : (class_1549)class_7860.method_35558(var5, class_7860.field_40220, 3);
               } else {
                  return (class_1549)class_7860.method_35558(var5, class_7860.field_40220, 2);
               }
            } else {
               return (class_1549)class_7860.method_35558(var5, class_7860.field_40220, 1);
            }
         } else {
            return (class_1549)class_7860.method_35558(var5, class_7860.field_40220, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      String[] var3 = super.method_12292();
      return (String[])class_3111.method_14357(var3, new String[]{"right", "left", "waist", "base"});
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.method_8510().method_8587();
      class_3927 var6 = new class_3927(var5);
      var6.field_32487 = (class_8108)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
