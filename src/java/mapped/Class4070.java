package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4070 extends Class4057 {
   public Class4070() {
      super(EntityType.field41062, "parrot", 0.3F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2814();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2814) {
         Class2814 var5 = (Class2814)var1;
         if (!var2.equals("body")) {
            if (!var2.equals("tail")) {
               if (!var2.equals("left_wing")) {
                  if (!var2.equals("right_wing")) {
                     if (!var2.equals("head")) {
                        if (!var2.equals("left_leg")) {
                           return !var2.equals("right_leg") ? null : (Class7219)Class9299.method35075(var5, Class9299.field43080, 10);
                        } else {
                           return (Class7219)Class9299.method35075(var5, Class9299.field43080, 9);
                        }
                     } else {
                        return (Class7219)Class9299.method35075(var5, Class9299.field43080, 4);
                     }
                  } else {
                     return (Class7219)Class9299.method35075(var5, Class9299.field43080, 3);
                  }
               } else {
                  return (Class7219)Class9299.method35075(var5, Class9299.field43080, 2);
               }
            } else {
               return (Class7219)Class9299.method35075(var5, Class9299.field43080, 1);
            }
         } else {
            return (Class7219)Class9299.method35075(var5, Class9299.field43080, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"body", "tail", "left_wing", "right_wing", "head", "left_leg", "right_leg"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5697 var6 = new Class5697(var5);
      var6.field25086 = (Class2814)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
