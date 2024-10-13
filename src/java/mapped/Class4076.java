package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4076 extends Class4057 {
   public Class4076() {
      super(EntityType.field41085, "spider", 1.0F);
   }

   public Class4076(EntityType var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class2828 method12822() {
      return new Class2813();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2813) {
         Class2813 var5 = (Class2813)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("neck")) {
               if (!var2.equals("body")) {
                  if (!var2.equals("leg1")) {
                     if (!var2.equals("leg2")) {
                        if (!var2.equals("leg3")) {
                           if (!var2.equals("leg4")) {
                              if (!var2.equals("leg5")) {
                                 if (!var2.equals("leg6")) {
                                    if (!var2.equals("leg7")) {
                                       return !var2.equals("leg8") ? null : (ModelRenderer) Reflector.field43111.method36565(var5, 10);
                                    } else {
                                       return (ModelRenderer) Reflector.field43111.method36565(var5, 9);
                                    }
                                 } else {
                                    return (ModelRenderer) Reflector.field43111.method36565(var5, 8);
                                 }
                              } else {
                                 return (ModelRenderer) Reflector.field43111.method36565(var5, 7);
                              }
                           } else {
                              return (ModelRenderer) Reflector.field43111.method36565(var5, 6);
                           }
                        } else {
                           return (ModelRenderer) Reflector.field43111.method36565(var5, 5);
                        }
                     } else {
                        return (ModelRenderer) Reflector.field43111.method36565(var5, 4);
                     }
                  } else {
                     return (ModelRenderer) Reflector.field43111.method36565(var5, 3);
                  }
               } else {
                  return (ModelRenderer) Reflector.field43111.method36565(var5, 2);
               }
            } else {
               return (ModelRenderer) Reflector.field43111.method36565(var5, 1);
            }
         } else {
            return (ModelRenderer) Reflector.field43111.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head", "neck", "body", "leg1", "leg2", "leg3", "leg4", "leg5", "leg6", "leg7", "leg8"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5702 var6 = new Class5702(var5);
      var6.field25086 = (Class2827)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
