package remapped;

public class class_1971 extends class_2733 {
   public class_1971() {
      super(EntityType.field_34301, "blaze", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_5107();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_5107) {
         class_5107 var5 = (class_5107)var1;
         if (var2.equals("head")) {
            return (class_1549)class_7860.method_35557(var5, class_7860.field_40115);
         } else {
            String var6 = "stick";
            if (!var2.startsWith(var6)) {
               return null;
            } else {
               class_1549[] var7 = (class_1549[])class_7860.method_35557(var5, class_7860.field_40134);
               if (var7 == null) {
                  return null;
               } else {
                  String var8 = var2.substring(var6.length());
                  int var9 = Config.method_14361(var8, -1);
                  var9--;
                  return var9 >= 0 && var9 < var7.length ? var7[var9] : null;
               }
            }
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head", "stick1", "stick2", "stick3", "stick4", "stick5", "stick6", "stick7", "stick8", "stick9", "stick10", "stick11", "stick12"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_7531 var6 = new class_7531(var5);
      var6.field_32487 = (class_5107<class_2806>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
