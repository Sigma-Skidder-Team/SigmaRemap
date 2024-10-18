package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.optifine.Config;

public class Class4069 extends Class4057 {
   public Class4069() {
      super(EntityType.field41026, "endermite", 0.3F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2807();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (!(var1 instanceof Class2807)) {
         return null;
      } else {
         Class2807 var5 = (Class2807)var1;
         String var6 = "body";
         if (!var2.startsWith(var6)) {
            return null;
         } else {
            ModelRenderer[] var7 = (ModelRenderer[]) Reflector.getFieldValue(var5, Reflector.field43043);
            if (var7 == null) {
               return null;
            } else {
               String var8 = var2.substring(var6.length());
               int var9 = Config.method26899(var8, -1);
               var9--;
               return var9 >= 0 && var9 < var7.length ? var7[var9] : null;
            }
         }
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"body1", "body2", "body3", "body4"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5673 var6 = new Class5673(var5);
      var6.entityModel = (Class2807<Class1104>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
