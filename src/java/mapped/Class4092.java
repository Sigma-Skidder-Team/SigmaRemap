package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4092 extends Class4057 {
   public Class4092() {
      super(EntityType.field41024, "dragon", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2875();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2875) {
         Class2875 var5 = (Class2875)var1;
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
                                                                     : (Class7219)Class9299.method35075(var5, Class9299.field43039, 19);
                                                               } else {
                                                                  return (Class7219)Class9299.method35075(var5, Class9299.field43039, 18);
                                                               }
                                                            } else {
                                                               return (Class7219)Class9299.method35075(var5, Class9299.field43039, 17);
                                                            }
                                                         } else {
                                                            return (Class7219)Class9299.method35075(var5, Class9299.field43039, 16);
                                                         }
                                                      } else {
                                                         return (Class7219)Class9299.method35075(var5, Class9299.field43039, 15);
                                                      }
                                                   } else {
                                                      return (Class7219)Class9299.method35075(var5, Class9299.field43039, 14);
                                                   }
                                                } else {
                                                   return (Class7219)Class9299.method35075(var5, Class9299.field43039, 13);
                                                }
                                             } else {
                                                return (Class7219)Class9299.method35075(var5, Class9299.field43039, 12);
                                             }
                                          } else {
                                             return (Class7219)Class9299.method35075(var5, Class9299.field43039, 11);
                                          }
                                       } else {
                                          return (Class7219)Class9299.method35075(var5, Class9299.field43039, 10);
                                       }
                                    } else {
                                       return (Class7219)Class9299.method35075(var5, Class9299.field43039, 9);
                                    }
                                 } else {
                                    return (Class7219)Class9299.method35075(var5, Class9299.field43039, 8);
                                 }
                              } else {
                                 return (Class7219)Class9299.method35075(var5, Class9299.field43039, 7);
                              }
                           } else {
                              return (Class7219)Class9299.method35075(var5, Class9299.field43039, 6);
                           }
                        } else {
                           return (Class7219)Class9299.method35075(var5, Class9299.field43039, 5);
                        }
                     } else {
                        return (Class7219)Class9299.method35075(var5, Class9299.field43039, 4);
                     }
                  } else {
                     return (Class7219)Class9299.method35075(var5, Class9299.field43039, 3);
                  }
               } else {
                  return (Class7219)Class9299.method35075(var5, Class9299.field43039, 2);
               }
            } else {
               return (Class7219)Class9299.method35075(var5, Class9299.field43039, 1);
            }
         } else {
            return (Class7219)Class9299.method35075(var5, Class9299.field43039, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
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
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5718 var6 = new Class5718(var5);
      if (Class9299.field43009.method20238()) {
         Class9299.method35082(var6, Class9299.field43009, var1);
         var6.field25098 = var2;
         return (Class9492)var6;
      } else {
         Class7944.method26811("Field not found: EnderDragonRenderer.model");
         return null;
      }
   }
}
