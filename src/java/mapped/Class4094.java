package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4094 extends Class4057 {
   public Class4094() {
      super(EntityType.VILLAGER, "villager", 0.5F);
   }

   public Class4094(EntityType var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class2828 method12822() {
      return new Class2802(0.0F);
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2802) {
         Class2802 var5 = (Class2802)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("headwear")) {
               if (!var2.equals("headwear2")) {
                  if (!var2.equals("body")) {
                     if (!var2.equals("bodywear")) {
                        if (!var2.equals("arms")) {
                           if (!var2.equals("right_leg")) {
                              if (!var2.equals("left_leg")) {
                                 return !var2.equals("nose") ? null : (ModelRenderer) Reflector.field43125.method36565(var5, 8);
                              } else {
                                 return (ModelRenderer) Reflector.field43125.method36565(var5, 7);
                              }
                           } else {
                              return (ModelRenderer) Reflector.field43125.method36565(var5, 6);
                           }
                        } else {
                           return (ModelRenderer) Reflector.field43125.method36565(var5, 5);
                        }
                     } else {
                        return (ModelRenderer) Reflector.field43125.method36565(var5, 4);
                     }
                  } else {
                     return (ModelRenderer) Reflector.field43125.method36565(var5, 3);
                  }
               } else {
                  return (ModelRenderer) Reflector.field43125.method36565(var5, 2);
               }
            } else {
               return (ModelRenderer) Reflector.field43125.method36565(var5, 1);
            }
         } else {
            return (ModelRenderer) Reflector.field43125.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head", "headwear", "headwear2", "body", "bodywear", "arms", "right_leg", "left_leg", "nose"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      IReloadableResourceManager var5 = (IReloadableResourceManager) Minecraft.getInstance().getResourceManager();
      EntityRendererManager var6 = Minecraft.getInstance().getRenderManager();
      Class5692 var7 = new Class5692(var6, var5);
      var7.entityModel = (Class2802<VillagerEntity>)var1;
      var7.shadowSize = var2;
      return (Class9492)var7;
   }
}
