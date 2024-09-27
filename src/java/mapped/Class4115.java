package mapped;

import net.optifine.Config;

public class Class4115 extends Class4057 {
   public Class4115() {
      super(TileEntityType.field21444, "bed", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2843();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2843) {
         Class2843 var5 = (Class2843)var1;
         if (!var2.equals("head")) {
            if (!var2.equals("foot")) {
               Class7219[] var6 = var5.field17642;
               if (var6 != null) {
                  if (var2.equals("leg1")) {
                     return var6[0];
                  }

                  if (var2.equals("leg2")) {
                     return var6[1];
                  }

                  if (var2.equals("leg3")) {
                     return var6[2];
                  }

                  if (var2.equals("leg4")) {
                     return var6[3];
                  }
               }

               return null;
            } else {
               return var5.field17641;
            }
         } else {
            return var5.field17640;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head", "foot", "leg1", "leg2", "leg3", "leg4"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      TileEntityRendererDispatcher var5 = TileEntityRendererDispatcher.instance;
      Object var6 = var5.method27968(TileEntityType.field21444);
      if (var6 instanceof Class5950) {
         if (((Class5942)var6).method18463() == null) {
            var6 = new Class5950(var5);
         }

         if (var1 instanceof Class2843) {
            Class2843 var7 = (Class2843)var1;
            return (Class9492)var7.method11173((Class5942)var6);
         } else {
            Config.method26811("Not a BedModel: " + var1);
            return null;
         }
      } else {
         return null;
      }
   }
}
