package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.optifine.Config;

public class Class4142 extends Class4057 {
   public Class4142() {
      super(EntityType.field41010, "blaze", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2886();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2886) {
         Class2886 var5 = (Class2886)var1;
         if (var2.equals("head")) {
            return (ModelRenderer) Reflector.method35072(var5, Reflector.field43028);
         } else {
            String var6 = "stick";
            if (!var2.startsWith(var6)) {
               return null;
            } else {
               ModelRenderer[] var7 = (ModelRenderer[]) Reflector.method35072(var5, Reflector.field43029);
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
      return new String[]{"head", "stick1", "stick2", "stick3", "stick4", "stick5", "stick6", "stick7", "stick8", "stick9", "stick10", "stick11", "stick12"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5710 var6 = new Class5710(var5);
      var6.mainModel = (Class2886<Class1103>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
