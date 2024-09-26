package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4098 extends Class4057 {
   public Class4098() {
      super(EntityType.field41015, "cod", 0.3F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2822();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2822) {
         Class2822 var5 = (Class2822)var1;
         if (!var2.equals("body")) {
            if (!var2.equals("fin_back")) {
               if (!var2.equals("head")) {
                  if (!var2.equals("nose")) {
                     if (!var2.equals("fin_right")) {
                        if (!var2.equals("fin_left")) {
                           return !var2.equals("tail") ? null : (Class7219) Reflector.field43035.method36565(var5, 6);
                        } else {
                           return (Class7219) Reflector.field43035.method36565(var5, 5);
                        }
                     } else {
                        return (Class7219) Reflector.field43035.method36565(var5, 4);
                     }
                  } else {
                     return (Class7219) Reflector.field43035.method36565(var5, 3);
                  }
               } else {
                  return (Class7219) Reflector.field43035.method36565(var5, 2);
               }
            } else {
               return (Class7219) Reflector.field43035.method36565(var5, 1);
            }
         } else {
            return (Class7219) Reflector.field43035.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"body", "fin_back", "head", "nose", "fin_right", "fin_left", "tail"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5695 var6 = new Class5695(var5);
      var6.field25086 = (Class2822<Class1051>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
