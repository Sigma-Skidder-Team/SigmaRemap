package mapped;

import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4096 extends Class4057 {
   public Class4096() {
      super(EntityType.field41105, "wolf", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2859();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2859) {
         Class2859 var5 = (Class2859)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("body")) {
               if (!var2.equals("leg1")) {
                  if (!var2.equals("leg2")) {
                     if (!var2.equals("leg3")) {
                        if (!var2.equals("leg4")) {
                           if (!var2.equals("tail")) {
                              return !var2.equals("mane") ? null : (ModelRenderer) Reflector.field43132.method36565(var5, 9);
                           } else {
                              return (ModelRenderer) Reflector.field43132.method36565(var5, 7);
                           }
                        } else {
                           return (ModelRenderer) Reflector.field43132.method36565(var5, 6);
                        }
                     } else {
                        return (ModelRenderer) Reflector.field43132.method36565(var5, 5);
                     }
                  } else {
                     return (ModelRenderer) Reflector.field43132.method36565(var5, 4);
                  }
               } else {
                  return (ModelRenderer) Reflector.field43132.method36565(var5, 3);
               }
            } else {
               return (ModelRenderer) Reflector.field43132.method36565(var5, 2);
            }
         } else {
            return (ModelRenderer) Reflector.field43132.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4", "tail", "mane"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5690 var6 = new Class5690(var5);
      var6.mainModel = (Class2859<WolfEntity>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
