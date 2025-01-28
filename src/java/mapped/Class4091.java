package mapped;

import net.minecraft.tileentity.TileEntityType;
import net.optifine.Config;

import java.util.Map;

public class Class4091 extends Class4057 {
   public Class4091() {
      super(TileEntityType.field21435, "head_creeper", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2844(0, 0, 64, 32);
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
      TileEntityRendererDispatcher var5 = TileEntityRendererDispatcher.instance;
      Object var6 = var5.method27968(TileEntityType.field21435);
      if (var6 instanceof Class5952) {
         if (((Class5942)var6).method18463() == null) {
            var6 = new Class5952(var5);
         }

         Map var7 = (Map) Reflector.field43169.method20234();
         if (var7 != null) {
            var7.put(Class2136.field13993, var1);
            return (Class9492)var6;
         } else {
            Config.method26811("Field not found: TileEntitySkullRenderer.MODELS");
            return null;
         }
      } else {
         return null;
      }
   }
}
