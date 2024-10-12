package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4107 extends Class4057 {
   public Class4107() {
      super(EntityType.field41017, "creeper", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2890();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2890) {
         Class2890 var5 = (Class2890)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("armor")) {
               if (!var2.equals("body")) {
                  if (!var2.equals("leg1")) {
                     if (!var2.equals("leg2")) {
                        if (!var2.equals("leg3")) {
                           return !var2.equals("leg4") ? null : (ModelRenderer) Reflector.field43037.method36565(var5, 6);
                        } else {
                           return (ModelRenderer) Reflector.field43037.method36565(var5, 5);
                        }
                     } else {
                        return (ModelRenderer) Reflector.field43037.method36565(var5, 4);
                     }
                  } else {
                     return (ModelRenderer) Reflector.field43037.method36565(var5, 3);
                  }
               } else {
                  return (ModelRenderer) Reflector.field43037.method36565(var5, 2);
               }
            } else {
               return (ModelRenderer) Reflector.field43037.method36565(var5, 1);
            }
         } else {
            return (ModelRenderer) Reflector.field43037.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head", "armor", "body", "leg1", "leg2", "leg3", "leg4"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5698 var6 = new Class5698(var5);
      var6.mainModel = (Class2890<Class1081>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
