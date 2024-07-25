package remapped;

public class class_8682 extends class_2733 {
   public class_8682() {
      super(class_6629.field_34314, "silverfish", 0.3F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_7661();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (!(var1 instanceof class_7661)) {
         return null;
      } else {
         class_7661 var5 = (class_7661)var1;
         String var6 = "body";
         if (!var2.startsWith(var6)) {
            String var11 = "wing";
            if (!var2.startsWith(var11)) {
               return null;
            } else {
               class_1549[] var12 = (class_1549[])class_7860.method_35557(var5, class_7860.field_40225);
               if (var12 == null) {
                  return null;
               } else {
                  String var14 = var2.substring(var11.length());
                  int var10 = class_3111.method_14361(var14, -1);
                  var10--;
                  return var10 >= 0 && var10 < var12.length ? var12[var10] : null;
               }
            }
         } else {
            class_1549[] var7 = (class_1549[])class_7860.method_35557(var5, class_7860.field_40101);
            if (var7 == null) {
               return null;
            } else {
               String var8 = var2.substring(var6.length());
               int var9 = class_3111.method_14361(var8, -1);
               var9--;
               return var9 >= 0 && var9 < var7.length ? var7[var9] : null;
            }
         }
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"body1", "body2", "body3", "body4", "body5", "body6", "body7", "wing1", "wing2", "wing3"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_5385 var6 = new class_5385(var5);
      var6.field_32487 = (class_7661<class_6174>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
