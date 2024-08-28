package mapped;

import java.util.ArrayList;

public class Class4630 extends Class4626 {
   public final Class6211 field22155;

   public Class4630(Class6211 var1) {
      this.field22155 = var1;
   }

   @Override
   public Object method14587(Class7255 var1) {
      if (!(var1 instanceof Class7252)) {
         throw new Class2482("while constructing pairs", var1.method22782(), "expected a sequence, but found " + var1.method22769(), var1.method22782());
      } else {
         Class7252 var4 = (Class7252)var1;
         ArrayList var5 = new ArrayList(var4.method22770().size());

         for (Class7255 var7 : var4.method22770()) {
            if (!(var7 instanceof Class7254)) {
               throw new Class2482(
                  "while constructingpairs", var1.method22782(), "expected a mapping of length 1, but found " + var7.method22769(), var7.method22782()
               );
            }

            Class7254 var8 = (Class7254)var7;
            if (var8.method22770().size() != 1) {
               throw new Class2482(
                  "while constructing pairs",
                  var1.method22782(),
                  "expected a single mapping item, but found " + var8.method22770().size() + " items",
                  var8.method22782()
               );
            }

            Class7255 var9 = var8.method22770().get(0).method36417();
            Class7255 var10 = var8.method22770().get(0).method36418();
            Object var11 = this.field22155.method19163(var9);
            Object var12 = this.field22155.method19163(var10);
            var5.add(new Object[]{var11, var12});
         }

         return var5;
      }
   }
}
