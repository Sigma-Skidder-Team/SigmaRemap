package remapped;

public class class_2621 extends class_2733 {
   public class_2621() {
      super(class_6629.field_34264, "endermite", 0.3F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_7974();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (!(var1 instanceof class_7974)) {
         return null;
      } else {
         class_7974 var5 = (class_7974)var1;
         String var6 = "body";
         if (!var2.startsWith(var6)) {
            return null;
         } else {
            class_1549[] var7 = (class_1549[])class_7860.method_35557(var5, class_7860.field_40153);
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
      return new String[]{"body1", "body2", "body3", "body4"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = class_1893.method_8510().method_8587();
      class_3594 var6 = new class_3594(var5);
      var6.field_32487 = (class_7974<class_2667>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
