package remapped;

public class class_694 extends class_2733 {
   public class_694() {
      super(class_6629.field_34239, "minecart", 0.5F);
   }

   public class_694(class_6629 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_9873 method_12295() {
      return new class_1921();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_1921) {
         class_1921 var5 = (class_1921)var1;
         class_1549[] var6 = (class_1549[])class_7860.field_39976.method_7980(var5);
         if (var6 != null) {
            if (var2.equals("bottom")) {
               return var6[0];
            }

            if (var2.equals("back")) {
               return var6[1];
            }

            if (var2.equals("front")) {
               return var6[2];
            }

            if (var2.equals("right")) {
               return var6[3];
            }

            if (var2.equals("left")) {
               return var6[4];
            }

            if (var2.equals("dirt")) {
               return var6[5];
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"bottom", "back", "front", "right", "left", "dirt"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.getInstance().method_8587();
      class_6906 var6 = new class_6906(var5);
      if (class_7860.field_40053.method_7978()) {
         class_7860.method_35561(var6, class_7860.field_40053, var1);
         var6.field_36492 = var2;
         return (class_8599)var6;
      } else {
         class_3111.method_14317("Field not found: RenderMinecart.modelMinecart");
         return null;
      }
   }
}
