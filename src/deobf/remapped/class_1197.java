package remapped;

public class class_1197 extends class_2733 {
   public class_1197() {
      super(class_6629.field_34212, "wither", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_379(0.0F);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (!(var1 instanceof class_379)) {
         return null;
      } else {
         class_379 var5 = (class_379)var1;
         String var6 = "body";
         if (!var2.startsWith(var6)) {
            String var11 = "head";
            if (!var2.startsWith(var11)) {
               return null;
            } else {
               class_1549[] var12 = (class_1549[])class_7860.method_35557(var5, class_7860.field_40189);
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
            class_1549[] var7 = (class_1549[])class_7860.method_35557(var5, class_7860.field_39937);
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
      return new String[]{"body1", "body2", "body3", "head1", "head2", "head3"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.method_8510().method_8587();
      class_6542 var6 = new class_6542(var5);
      var6.field_32487 = (class_379<class_4653>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
