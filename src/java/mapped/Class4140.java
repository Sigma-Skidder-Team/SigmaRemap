package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.optifine.Config;

public class Class4140 extends Class4057 {
   public Class4140() {
      super(EntityType.field41104, "wither_skull", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2844();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2844) {
         Class2844 var5 = (Class2844)var1;
         return !var2.equals("head") ? null : (ModelRenderer) Reflector.field43102.method20235(var5);
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5734 var6 = new Class5734(var5);
      if (Reflector.field43151.exists()) {
         Reflector.method35082(var6, Reflector.field43151, var1);
         var6.shadowSize = var2;
         return (Class9492)var6;
      } else {
         Config.method26811("Field not found: RenderWitherSkull_model");
         return null;
      }
   }
}
