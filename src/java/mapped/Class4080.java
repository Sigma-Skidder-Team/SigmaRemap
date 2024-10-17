package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.optifine.Config;

public class Class4080 extends Class4057 {
   public Class4080() {
      super(EntityType.SILVERFISH, "silverfish", 0.3F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2815();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (!(var1 instanceof Class2815)) {
         return null;
      } else {
         Class2815 var5 = (Class2815)var1;
         String var6 = "body";
         if (!var2.startsWith(var6)) {
            String var11 = "wing";
            if (!var2.startsWith(var11)) {
               return null;
            } else {
               ModelRenderer[] var12 = (ModelRenderer[]) Reflector.method35072(var5, Reflector.field43105);
               if (var12 == null) {
                  return null;
               } else {
                  String var14 = var2.substring(var11.length());
                  int var10 = Config.method26899(var14, -1);
                  var10--;
                  return var10 >= 0 && var10 < var12.length ? var12[var10] : null;
               }
            }
         } else {
            ModelRenderer[] var7 = (ModelRenderer[]) Reflector.method35072(var5, Reflector.field43104);
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
      return new String[]{"body1", "body2", "body3", "body4", "body5", "body6", "body7", "wing1", "wing2", "wing3"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5704 var6 = new Class5704(var5);
      var6.entityModel = (Class2815<Class1107>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
