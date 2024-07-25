package remapped;

public class class_1442 extends class_2733 {
   public class_1442() {
      this("end_crystal");
   }

   public class_1442(String var1) {
      super(class_6629.field_34273, var1, 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_3987();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_3987) {
         class_3987 var5 = (class_3987)var1;
         if (!var2.equals("cube")) {
            if (!var2.equals("glass")) {
               return !var2.equals("base") ? null : var5.field_19384;
            } else {
               return var5.field_19383;
            }
         } else {
            return var5.field_19385;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"cube", "glass", "base"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_7067 var6 = var5.method_28130().get(class_6629.field_34273);
      if (var6 instanceof class_8205) {
         class_8205 var7 = (class_8205)var6;
         if (var7.method_32557() == null) {
            var7 = new class_8205(var5);
         }

         if (var1 instanceof class_3987) {
            class_3987 var8 = (class_3987)var1;
            var7 = var8.method_18384(var7);
            var7.field_36492 = var2;
            return (class_8599)var7;
         } else {
            class_3111.method_14317("Not a EnderCrystalModel model: " + var1);
            return null;
         }
      } else {
         class_3111.method_14317("Not an instance of RenderEnderCrystal: " + var6);
         return null;
      }
   }
}
