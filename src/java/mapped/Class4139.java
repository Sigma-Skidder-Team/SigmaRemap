package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.optifine.Config;

public class Class4139 extends Class4057 {
   public Class4139() {
      super(EntityType.field41049, "magma_cube", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2882();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2882) {
         Class2882 var5 = (Class2882)var1;
         if (var2.equals("core")) {
            return (ModelRenderer) Reflector.method35072(var5, Reflector.field43073);
         } else {
            String var6 = "segment";
            if (!var2.startsWith(var6)) {
               return null;
            } else {
               ModelRenderer[] var7 = (ModelRenderer[]) Reflector.method35072(var5, Reflector.field43074);
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
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"core", "segment1", "segment2", "segment3", "segment4", "segment5", "segment6", "segment7", "segment8"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5652 var6 = new Class5652(var5);
      var6.entityModel = (Class2882<Class1109>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
