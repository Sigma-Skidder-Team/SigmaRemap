package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.optifine.Config;

public class Class4082 extends Class4057 {
   public Class4082() {
      super(EntityType.PUFFERFISH, "puffer_fish_small", 0.2F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2885();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2885) {
         Class2885 var5 = (Class2885)var1;
         if (!var2.equals("body")) {
            if (!var2.equals("eye_right")) {
               if (!var2.equals("eye_left")) {
                  if (!var2.equals("fin_right")) {
                     if (!var2.equals("fin_left")) {
                        return !var2.equals("tail") ? null : (ModelRenderer) Reflector.field43086.method36565(var5, 5);
                     } else {
                        return (ModelRenderer) Reflector.field43086.method36565(var5, 4);
                     }
                  } else {
                     return (ModelRenderer) Reflector.field43086.method36565(var5, 3);
                  }
               } else {
                  return (ModelRenderer) Reflector.field43086.method36565(var5, 2);
               }
            } else {
               return (ModelRenderer) Reflector.field43086.method36565(var5, 1);
            }
         } else {
            return (ModelRenderer) Reflector.field43086.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"body", "eye_right", "eye_left", "tail", "fin_right", "fin_left"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Object var6 = var5.method32232().get(EntityType.PUFFERFISH);
      if (var6 instanceof Class5748) {
         if (((EntityRenderer)var6).method17898() == null) {
            Class5748 var7 = new Class5748(var5);
            var7.shadowSize = var2;
            var6 = var7;
         }

         Class5748 var8 = (Class5748)var6;
         if (Reflector.field43140.exists()) {
            Reflector.field43140.method20237(var8, var1);
            return (Class9492)var8;
         } else {
            Config.method26811("Model field not found: RenderPufferfish.modelSmall");
            return null;
         }
      } else {
         Config.method26811("Not a PufferfishRenderer: " + var6);
         return null;
      }
   }
}
