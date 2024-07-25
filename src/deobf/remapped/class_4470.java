package remapped;

import java.util.ArrayList;

public class class_4470 extends class_4575 {
   public class_4470(class_3229 var1) {
      this.field_21794 = var1;
   }

   @Override
   public Object method_43611(class_1621 var1) {
      if (!(var1 instanceof class_1596)) {
         throw new class_8665("while constructing pairs", var1.method_7224(), "expected a sequence, but found " + var1.method_7221(), var1.method_7224());
      } else {
         class_1596 var4 = (class_1596)var1;
         ArrayList var5 = new ArrayList(var4.method_10282().size());

         for (class_1621 var7 : var4.method_10282()) {
            if (!(var7 instanceof class_7984)) {
               throw new class_8665(
                  "while constructingpairs", var1.method_7224(), "expected a mapping of length 1, but found " + var7.method_7221(), var7.method_7224()
               );
            }

            class_7984 var8 = (class_7984)var7;
            if (var8.method_10282().size() != 1) {
               throw new class_8665(
                  "while constructing pairs",
                  var1.method_7224(),
                  "expected a single mapping item, but found " + var8.method_10282().size() + " items",
                  var8.method_7224()
               );
            }

            class_1621 var9 = var8.method_10282().get(0).method_38998();
            class_1621 var10 = var8.method_10282().get(0).method_38999();
            Object var11 = this.field_21794.method_42411(var9);
            Object var12 = this.field_21794.method_42411(var10);
            var5.add(new Object[]{var11, var12});
         }

         return var5;
      }
   }
}
