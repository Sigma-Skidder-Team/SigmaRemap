package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class3171 implements Class2982 {
   public final Class3895 field18417;

   public Class3171(Class3895 var1) {
      this.field18417 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30559(Class4750.field22544);
      List<Class5624> var5 = new ArrayList();

      for (int var6 = 0; var6 < var4; var6++) {
         String var7 = var1.<String>method30559(Class4750.field22539);
         String[] var8 = var7.split("\\.");
         byte var9 = 0;
         int var10 = -1;
         int var11 = var1.<Integer>method30559(Class4750.field22544);
         if (var8.length == 2) {
            var9 = 8;
            Integer var12 = Class7711.field33103.get(var7);
            if (var12 != null) {
               var10 = var12;
            } else {
               ViaVersion3.method27613().getLogger().warning("Could not find 1.13 -> 1.12.2 statistic mapping for " + var7);
            }
         } else {
            String var17 = var8[1];
            switch (var17) {
               case "mineBlock":
                  var9 = 0;
                  break;
               case "craftItem":
                  var9 = 1;
                  break;
               case "useItem":
                  var9 = 2;
                  break;
               case "breakItem":
                  var9 = 3;
                  break;
               case "pickup":
                  var9 = 4;
                  break;
               case "drop":
                  var9 = 5;
                  break;
               case "killEntity":
                  var9 = 6;
                  break;
               case "entityKilledBy":
                  var9 = 7;
            }
         }

         if (var10 != -1) {
            var5.add(new Class5624(var9, var10, var11));
         }
      }

      var1.method30560(Class4750.field22544, var5.size());

      for (Class5624 var16 : var5) {
         var1.method30560(Class4750.field22544, var16.method17661());
         var1.method30560(Class4750.field22544, var16.method17662());
         var1.method30560(Class4750.field22544, var16.method17663());
      }
   }
}
