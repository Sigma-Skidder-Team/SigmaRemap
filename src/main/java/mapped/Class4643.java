package mapped;

import java.util.LinkedHashMap;

public class Class4643 extends Class4626 {
   public final Class6211 field22169;

   public Class4643(Class6211 var1) {
      this.field22169 = var1;
   }

   @Override
   public Object method14587(Class7255 var1) {
      LinkedHashMap var4 = new LinkedHashMap();
      if (!(var1 instanceof Class7252)) {
         throw new Class2482(
            "while constructing an ordered map", var1.method22782(), "expected a sequence, but found " + var1.method22769(), var1.method22782()
         );
      } else {
         Class7252 var5 = (Class7252)var1;

         for (Class7255 var7 : var5.method22770()) {
            if (!(var7 instanceof Class7254)) {
               throw new Class2482(
                  "while constructing an ordered map",
                  var1.method22782(),
                  "expected a mapping of length 1, but found " + var7.method22769(),
                  var7.method22782()
               );
            }

            Class7254 var8 = (Class7254)var7;
            if (var8.method22770().size() != 1) {
               throw new Class2482(
                  "while constructing an ordered map",
                  var1.method22782(),
                  "expected a single mapping item, but found " + var8.method22770().size() + " items",
                  var8.method22782()
               );
            }

            Class7255 var9 = var8.method22770().get(0).method36417();
            Class7255 var10 = var8.method22770().get(0).method36418();
            Object var11 = this.field22169.method19163(var9);
            Object var12 = this.field22169.method19163(var10);
            var4.put(var11, var12);
         }

         return var4;
      }
   }
}
