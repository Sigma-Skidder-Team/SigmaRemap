package remapped;

public class class_7148 extends class_2733 {
   public class_7148() {
      super(class_6629.field_34236, "salmon", 0.3F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_3363();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_3363) {
         class_3363 var5 = (class_3363)var1;
         if (!var2.equals("body_front")) {
            if (!var2.equals("body_back")) {
               if (!var2.equals("head")) {
                  if (var2.equals("fin_back_1")) {
                     class_1549 var6 = (class_1549)class_7860.field_40111.method_39231(var5, 0);
                     if (var6 != null) {
                        return var6.method_7041(0);
                     }
                  }

                  if (var2.equals("fin_back_2")) {
                     class_1549 var7 = (class_1549)class_7860.field_40111.method_39231(var5, 1);
                     if (var7 != null) {
                        return var7.method_7041(1);
                     }
                  }

                  if (var2.equals("tail")) {
                     class_1549 var8 = (class_1549)class_7860.field_40111.method_39231(var5, 1);
                     if (var8 != null) {
                        return var8.method_7041(0);
                     }
                  }

                  if (!var2.equals("fin_right")) {
                     return !var2.equals("fin_left") ? null : (class_1549)class_7860.field_40111.method_39231(var5, 4);
                  } else {
                     return (class_1549)class_7860.field_40111.method_39231(var5, 3);
                  }
               } else {
                  return (class_1549)class_7860.field_40111.method_39231(var5, 2);
               }
            } else {
               return (class_1549)class_7860.field_40111.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_40111.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"body_front", "body_back", "head", "fin_back_1", "fin_back_2", "tail", "fin_right", "fin_left"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.method_8510().method_8587();
      class_4990 var6 = new class_4990(var5);
      var6.field_32487 = (class_3363<class_1260>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}
