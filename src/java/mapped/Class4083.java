package mapped;

import net.optifine.Config;

import java.util.Map;

public class Class4083 extends Class4057 {
   public Class4083() {
      super(TileEntityType.field21435, "head_zombie", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2845();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2845) {
         Class2845 var5 = (Class2845)var1;
         return !var2.equals("head") ? null : (Class7219) Reflector.field43022.method20235(var5);
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
            var7.put(Class2136.field13992, var1);
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
