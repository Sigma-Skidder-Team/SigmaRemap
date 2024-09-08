package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.fish.SalmonEntity;

public class Class4112 extends Class4057 {
   public Class4112() {
      super(EntityType.field41073, "salmon", 0.3F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2816();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2816) {
         Class2816 var5 = (Class2816)var1;
         if (!var2.equals("body_front")) {
            if (!var2.equals("body_back")) {
               if (!var2.equals("head")) {
                  if (var2.equals("fin_back_1")) {
                     Class7219 var6 = (Class7219)Class9299.field43094.method36565(var5, 0);
                     if (var6 != null) {
                        return var6.method22692(0);
                     }
                  }

                  if (var2.equals("fin_back_2")) {
                     Class7219 var7 = (Class7219)Class9299.field43094.method36565(var5, 1);
                     if (var7 != null) {
                        return var7.method22692(1);
                     }
                  }

                  if (var2.equals("tail")) {
                     Class7219 var8 = (Class7219)Class9299.field43094.method36565(var5, 1);
                     if (var8 != null) {
                        return var8.method22692(0);
                     }
                  }

                  if (!var2.equals("fin_right")) {
                     return !var2.equals("fin_left") ? null : (Class7219)Class9299.field43094.method36565(var5, 4);
                  } else {
                     return (Class7219)Class9299.field43094.method36565(var5, 3);
                  }
               } else {
                  return (Class7219)Class9299.field43094.method36565(var5, 2);
               }
            } else {
               return (Class7219)Class9299.field43094.method36565(var5, 1);
            }
         } else {
            return (Class7219)Class9299.field43094.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"body_front", "body_back", "head", "fin_back_1", "fin_back_2", "tail", "fin_right", "fin_left"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5750 var6 = new Class5750(var5);
      var6.field25086 = (Class2816<SalmonEntity>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
