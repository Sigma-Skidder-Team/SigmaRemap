package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4081 extends Class4057 {
   public Class4081() {
      super(EntityType.CHICKEN, "chicken", 0.3F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2874();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2874) {
         Class2874 var5 = (Class2874)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("body")) {
               if (!var2.equals("right_leg")) {
                  if (!var2.equals("left_leg")) {
                     if (!var2.equals("right_wing")) {
                        if (!var2.equals("left_wing")) {
                           if (!var2.equals("bill")) {
                              return !var2.equals("chin") ? null : (ModelRenderer) Reflector.field43033.method36565(var5, 7);
                           } else {
                              return (ModelRenderer) Reflector.field43033.method36565(var5, 6);
                           }
                        } else {
                           return (ModelRenderer) Reflector.field43033.method36565(var5, 5);
                        }
                     } else {
                        return (ModelRenderer) Reflector.field43033.method36565(var5, 4);
                     }
                  } else {
                     return (ModelRenderer) Reflector.field43033.method36565(var5, 3);
                  }
               } else {
                  return (ModelRenderer) Reflector.field43033.method36565(var5, 2);
               }
            } else {
               return (ModelRenderer) Reflector.field43033.method36565(var5, 1);
            }
         } else {
            return (ModelRenderer) Reflector.field43033.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head", "body", "right_leg", "left_leg", "right_wing", "left_wing", "bill", "chin"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5745 var6 = new Class5745(var5);
      var6.entityModel = (Class2874<Class1089>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
