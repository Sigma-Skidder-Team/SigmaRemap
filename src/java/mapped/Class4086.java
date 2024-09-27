package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.optifine.Config;

public class Class4086 extends Class4057 {
   public Class4086() {
      super(EntityType.field41076, "shulker_bullet", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2821();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2821) {
         Class2821 var5 = (Class2821)var1;
         return !var2.equals("bullet") ? null : (ModelRenderer) Reflector.field43098.method20235(var5);
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"bullet"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5730 var6 = new Class5730(var5);
      if (Reflector.field43146.method20238()) {
         Reflector.method35082(var6, Reflector.field43146, var1);
         var6.shadowSize = var2;
         return (Class9492)var6;
      } else {
         Config.method26811("Field not found: RenderShulkerBullet.model");
         return null;
      }
   }
}
