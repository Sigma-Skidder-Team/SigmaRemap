package mapped;

import java.util.UUID;

public final class Class4038 extends Class3758 {
   public final Class6356 field20368;

   public Class4038(Class6356 var1) {
      this.field20368 = var1;
   }

   @Override
   public void method12725() {
      this.method12733(var1 -> {
         var1.<Integer>method30561(Class4750.field22544);
         int var4 = var1.<Integer>method30561(Class4750.field22526);
         int var5 = var4;

         for (int var6 = 0; var6 < var4; var6++) {
            String var7 = var1.method30559(Class4750.field22539);
            String var8 = field20368.method19376().method18555().get(var7);
            if (var8 == null) {
               var8 = "minecraft:" + var7;
               if (!Class5980.method18544(var8)) {
                  if (!ViaVersion3.method27612().method21941()) {
                     ViaVersion3.method27613().method27366().warning("Invalid attribute: " + var7);
                  }

                  var5--;
                  var1.<Double>method30559(Class4750.field22528);
                  int var11 = var1.<Integer>method30559(Class4750.field22544);

                  for (int var12 = 0; var12 < var11; var12++) {
                     var1.<UUID>method30559(Class4750.field22541);
                     var1.<Double>method30559(Class4750.field22528);
                     var1.<Byte>method30559(Class4750.field22518);
                  }
                  continue;
               }
            }

            var1.method30560(Class4750.field22539, var8);
            var1.<Double>method30561(Class4750.field22528);
            int var9 = var1.<Integer>method30561(Class4750.field22544);

            for (int var10 = 0; var10 < var9; var10++) {
               var1.<UUID>method30561(Class4750.field22541);
               var1.<Double>method30561(Class4750.field22528);
               var1.<Byte>method30561(Class4750.field22518);
            }
         }

         if (var4 != var5) {
            var1.method30558(Class4750.field22526, 0, var5);
         }
      });
   }
}
