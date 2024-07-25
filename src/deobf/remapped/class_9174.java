package remapped;

public class class_9174 extends class_2733 {
   public class_9174() {
      super(class_6629.field_34222, "slime", 0.25F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_1290(16);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_1290) {
         class_1290 var5 = (class_1290)var1;
         if (!var2.equals("body")) {
            if (!var2.equals("left_eye")) {
               if (!var2.equals("right_eye")) {
                  return !var2.equals("mouth") ? null : (class_1549)class_7860.method_35558(var5, class_7860.field_39947, 3);
               } else {
                  return (class_1549)class_7860.method_35558(var5, class_7860.field_39947, 2);
               }
            } else {
               return (class_1549)class_7860.method_35558(var5, class_7860.field_39947, 1);
            }
         } else {
            return (class_1549)class_7860.method_35558(var5, class_7860.field_39947, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"body", "left_eye", "right_eye", "mouth"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = class_1893.method_8510().method_8587();
      class_5895 var6 = new class_5895(var5);
      var6.field_32487 = (class_1290<class_378>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
