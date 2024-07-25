package remapped;

public class class_7811 extends class_2733 {
   public class_7811() {
      super(class_6629.field_34310, "dragon", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_170();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_170) {
         class_170 var5 = (class_170)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("spine")) {
               if (!var2.equals("jaw")) {
                  if (!var2.equals("body")) {
                     if (!var2.equals("left_wing")) {
                        if (!var2.equals("left_wing_tip")) {
                           if (!var2.equals("front_left_leg")) {
                              if (!var2.equals("front_left_shin")) {
                                 if (!var2.equals("front_left_foot")) {
                                    if (!var2.equals("back_left_leg")) {
                                       if (!var2.equals("back_left_shin")) {
                                          if (!var2.equals("back_left_foot")) {
                                             if (!var2.equals("right_wing")) {
                                                if (!var2.equals("right_wing_tip")) {
                                                   if (!var2.equals("front_right_leg")) {
                                                      if (!var2.equals("front_right_shin")) {
                                                         if (!var2.equals("front_right_foot")) {
                                                            if (!var2.equals("back_right_leg")) {
                                                               if (!var2.equals("back_right_shin")) {
                                                                  return !var2.equals("back_right_foot")
                                                                     ? null
                                                                     : (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 19);
                                                               } else {
                                                                  return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 18);
                                                               }
                                                            } else {
                                                               return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 17);
                                                            }
                                                         } else {
                                                            return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 16);
                                                         }
                                                      } else {
                                                         return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 15);
                                                      }
                                                   } else {
                                                      return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 14);
                                                   }
                                                } else {
                                                   return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 13);
                                                }
                                             } else {
                                                return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 12);
                                             }
                                          } else {
                                             return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 11);
                                          }
                                       } else {
                                          return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 10);
                                       }
                                    } else {
                                       return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 9);
                                    }
                                 } else {
                                    return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 8);
                                 }
                              } else {
                                 return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 7);
                              }
                           } else {
                              return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 6);
                           }
                        } else {
                           return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 5);
                        }
                     } else {
                        return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 4);
                     }
                  } else {
                     return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 3);
                  }
               } else {
                  return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 2);
               }
            } else {
               return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 1);
            }
         } else {
            return (class_1549)class_7860.method_35558(var5, class_7860.field_40147, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{
         "head",
         "spine",
         "jaw",
         "body",
         "left_wing",
         "left_wing_tip",
         "front_left_leg",
         "front_left_shin",
         "front_left_foot",
         "back_left_leg",
         "back_left_shin",
         "back_left_foot",
         "right_wing",
         "right_wing_tip",
         "front_right_leg",
         "front_right_shin",
         "front_right_foot",
         "back_right_leg",
         "back_right_shin",
         "back_right_foot"
      };
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_3867 var6 = new class_3867(var5);
      if (class_7860.field_40118.method_7978()) {
         class_7860.method_35561(var6, class_7860.field_40118, var1);
         var6.field_36492 = var2;
         return (class_8599)var6;
      } else {
         Config.method_14317("Field not found: EnderDragonRenderer.model");
         return null;
      }
   }
}
