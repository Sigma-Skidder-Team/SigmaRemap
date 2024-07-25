package remapped;

public class class_8357 extends class_2733 {
   public class_8357() {
      super(class_6629.field_34315, "puffer_fish_big", 0.2F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_1085();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_1085) {
         class_1085 var5 = (class_1085)var1;
         if (!var2.equals("body")) {
            if (!var2.equals("fin_right")) {
               if (!var2.equals("fin_left")) {
                  if (!var2.equals("spikes_front_top")) {
                     if (!var2.equals("spikes_middle_top")) {
                        if (!var2.equals("spikes_back_top")) {
                           if (!var2.equals("spikes_front_right")) {
                              if (!var2.equals("spikes_front_left")) {
                                 if (!var2.equals("spikes_front_bottom")) {
                                    if (!var2.equals("spikes_middle_bottom")) {
                                       if (!var2.equals("spikes_back_bottom")) {
                                          if (!var2.equals("spikes_back_right")) {
                                             return !var2.equals("spikes_back_left") ? null : (class_1549)class_7860.field_39953.method_39231(var5, 12);
                                          } else {
                                             return (class_1549)class_7860.field_39953.method_39231(var5, 11);
                                          }
                                       } else {
                                          return (class_1549)class_7860.field_39953.method_39231(var5, 10);
                                       }
                                    } else {
                                       return (class_1549)class_7860.field_39953.method_39231(var5, 9);
                                    }
                                 } else {
                                    return (class_1549)class_7860.field_39953.method_39231(var5, 8);
                                 }
                              } else {
                                 return (class_1549)class_7860.field_39953.method_39231(var5, 7);
                              }
                           } else {
                              return (class_1549)class_7860.field_39953.method_39231(var5, 6);
                           }
                        } else {
                           return (class_1549)class_7860.field_39953.method_39231(var5, 5);
                        }
                     } else {
                        return (class_1549)class_7860.field_39953.method_39231(var5, 4);
                     }
                  } else {
                     return (class_1549)class_7860.field_39953.method_39231(var5, 3);
                  }
               } else {
                  return (class_1549)class_7860.field_39953.method_39231(var5, 2);
               }
            } else {
               return (class_1549)class_7860.field_39953.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_39953.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{
         "body",
         "fin_right",
         "fin_left",
         "spikes_front_top",
         "spikes_middle_top",
         "spikes_back_top",
         "spikes_front_right",
         "spikes_front_left",
         "spikes_front_bottom",
         "spikes_middle_bottom",
         "spikes_back_bottom",
         "spikes_back_right",
         "spikes_back_left"
      };
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = class_1893.method_8510().method_8587();
      Object var6 = var5.method_28130().get(class_6629.field_34315);
      if (var6 instanceof class_2207) {
         if (((class_7067)var6).method_32557() == null) {
            class_2207 var7 = new class_2207(var5);
            var7.field_36492 = var2;
            var6 = var7;
         }

         class_2207 var8 = (class_2207)var6;
         if (class_7860.field_40054.method_7978()) {
            class_7860.field_40054.method_7982(var8, var1);
            return (class_8599)var8;
         } else {
            class_3111.method_14317("Model field not found: RenderPufferfish.modelBig");
            return null;
         }
      } else {
         class_3111.method_14317("Not a PufferfishRenderer: " + var6);
         return null;
      }
   }
}
