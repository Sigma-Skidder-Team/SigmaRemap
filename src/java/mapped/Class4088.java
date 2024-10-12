package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

public class Class4088 extends Class4057 {
   public Class4088() {
      super(EntityType.field41080, "slime", 0.25F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2826(16);
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2826) {
         Class2826 var5 = (Class2826)var1;
         if (!var2.equals("body")) {
            if (!var2.equals("left_eye")) {
               if (!var2.equals("right_eye")) {
                  return !var2.equals("mouth") ? null : (ModelRenderer) Reflector.method35075(var5, Reflector.field43107, 3);
               } else {
                  return (ModelRenderer) Reflector.method35075(var5, Reflector.field43107, 2);
               }
            } else {
               return (ModelRenderer) Reflector.method35075(var5, Reflector.field43107, 1);
            }
         } else {
            return (ModelRenderer) Reflector.method35075(var5, Reflector.field43107, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"body", "left_eye", "right_eye", "mouth"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5675 var6 = new Class5675(var5);
      var6.mainModel = (Class2826<Class1108>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
