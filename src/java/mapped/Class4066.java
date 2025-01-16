package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4066 extends Class4057 {
   public Class4066() {
      super(EntityType.IRON_GOLEM, "iron_golem", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2880();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2880) {
         Class2880 var5 = (Class2880)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("body")) {
               if (!var2.equals("right_arm")) {
                  if (!var2.equals("left_arm")) {
                     if (!var2.equals("left_leg")) {
                        return !var2.equals("right_leg") ? null : (ModelRenderer) Reflector.field43061.method36565(var5, 5);
                     } else {
                        return (ModelRenderer) Reflector.field43061.method36565(var5, 4);
                     }
                  } else {
                     return (ModelRenderer) Reflector.field43061.method36565(var5, 3);
                  }
               } else {
                  return (ModelRenderer) Reflector.field43061.method36565(var5, 2);
               }
            } else {
               return (ModelRenderer) Reflector.field43061.method36565(var5, 1);
            }
         } else {
            return (ModelRenderer) Reflector.field43061.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head", "body", "right_arm", "left_arm", "left_leg", "right_leg"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5746 var6 = new Class5746(var5);
      var6.entityModel = (Class2880<IronGolemEntity>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
