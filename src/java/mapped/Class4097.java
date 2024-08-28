package mapped;

public class Class4097 extends Class4057 {
   public Class4097() {
      super(Class8992.field41070, "puffer_fish_medium", 0.2F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2877();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2877) {
         Class2877 var5 = (Class2877)var1;
         if (!var2.equals("body")) {
            if (!var2.equals("fin_right")) {
               if (!var2.equals("fin_left")) {
                  if (!var2.equals("spikes_front_top")) {
                     if (!var2.equals("spikes_back_top")) {
                        if (!var2.equals("spikes_front_right")) {
                           if (!var2.equals("spikes_back_right")) {
                              if (!var2.equals("spikes_back_left")) {
                                 if (!var2.equals("spikes_front_left")) {
                                    if (!var2.equals("spikes_back_bottom")) {
                                       return !var2.equals("spikes_front_bottom") ? null : (Class7219)Class9299.field43084.method36565(var5, 10);
                                    } else {
                                       return (Class7219)Class9299.field43084.method36565(var5, 9);
                                    }
                                 } else {
                                    return (Class7219)Class9299.field43084.method36565(var5, 8);
                                 }
                              } else {
                                 return (Class7219)Class9299.field43084.method36565(var5, 7);
                              }
                           } else {
                              return (Class7219)Class9299.field43084.method36565(var5, 6);
                           }
                        } else {
                           return (Class7219)Class9299.field43084.method36565(var5, 5);
                        }
                     } else {
                        return (Class7219)Class9299.field43084.method36565(var5, 4);
                     }
                  } else {
                     return (Class7219)Class9299.field43084.method36565(var5, 3);
                  }
               } else {
                  return (Class7219)Class9299.field43084.method36565(var5, 2);
               }
            } else {
               return (Class7219)Class9299.field43084.method36565(var5, 1);
            }
         } else {
            return (Class7219)Class9299.field43084.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{
         "body",
         "fin_right",
         "fin_left",
         "spikes_front_top",
         "spikes_back_top",
         "spikes_front_right",
         "spikes_back_right",
         "spikes_back_left",
         "spikes_front_left",
         "spikes_back_bottom",
         "spikes_front_bottom"
      };
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Object var6 = var5.method32232().get(Class8992.field41070);
      if (var6 instanceof Class5748) {
         if (((Class5715)var6).method17898() == null) {
            Class5748 var7 = new Class5748(var5);
            var7.field25098 = var2;
            var6 = var7;
         }

         Class5748 var8 = (Class5748)var6;
         if (Class9299.field43141.method20238()) {
            Class9299.field43141.method20237(var8, var1);
            return (Class9492)var8;
         } else {
            Class7944.method26811("Model field not found: RenderPufferfish.modelMedium");
            return null;
         }
      } else {
         Class7944.method26811("Not a PufferfishRenderer: " + var6);
         return null;
      }
   }
}
