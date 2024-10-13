package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4113 extends Class4057 {
   public Class4113() {
      super(EntityType.field41082, "snow_golem", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2878();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2878) {
         Class2878 var5 = (Class2878)var1;
         if (!var2.equals("body")) {
            if (!var2.equals("body_bottom")) {
               if (!var2.equals("head")) {
                  if (!var2.equals("right_hand")) {
                     return !var2.equals("left_hand") ? null : (ModelRenderer) Reflector.field43109.method36565(var5, 4);
                  } else {
                     return (ModelRenderer) Reflector.field43109.method36565(var5, 3);
                  }
               } else {
                  return (ModelRenderer) Reflector.field43109.method36565(var5, 2);
               }
            } else {
               return (ModelRenderer) Reflector.field43109.method36565(var5, 1);
            }
         } else {
            return (ModelRenderer) Reflector.field43109.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"body", "body_bottom", "head", "right_hand", "left_hand"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5660 var6 = new Class5660(var5);
      var6.entityModel = (Class2878<Class1021>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
