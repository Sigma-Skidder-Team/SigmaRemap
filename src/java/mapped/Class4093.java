package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4093 extends Class4057 {
   public Class4093() {
      super(EntityType.field41047, "llama", 0.7F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2854(0.0F);
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2854) {
         Class2854 var5 = (Class2854)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("body")) {
               if (!var2.equals("leg1")) {
                  if (!var2.equals("leg2")) {
                     if (!var2.equals("leg3")) {
                        if (!var2.equals("leg4")) {
                           if (!var2.equals("chest_right")) {
                              return !var2.equals("chest_left") ? null : (Class7219)Class9299.field43069.method36565(var5, 7);
                           } else {
                              return (Class7219)Class9299.field43069.method36565(var5, 6);
                           }
                        } else {
                           return (Class7219)Class9299.field43069.method36565(var5, 5);
                        }
                     } else {
                        return (Class7219)Class9299.field43069.method36565(var5, 4);
                     }
                  } else {
                     return (Class7219)Class9299.field43069.method36565(var5, 3);
                  }
               } else {
                  return (Class7219)Class9299.field43069.method36565(var5, 2);
               }
            } else {
               return (Class7219)Class9299.field43069.method36565(var5, 1);
            }
         } else {
            return (Class7219)Class9299.field43069.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4", "chest_right", "chest_left"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5709 var6 = new Class5709(var5);
      var6.field25086 = (Class2854<Class1064>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
