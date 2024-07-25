package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_377 extends class_5920<class_7666> {
   private static String[] field_1528;
   private final class_6044<class_8150> field_1532;
   private final float field_1527;
   private final int field_1529;
   private final int field_1530;
   private final int field_1531;

   public class_377(class_6044<class_8150> var1, float var2, int var3, int var4, int var5) {
      super(ImmutableMap.of(class_6044.field_30909, class_561.field_3319, class_6044.field_30889, class_561.field_3318, var1, class_561.field_3320));
      this.field_1532 = var1;
      this.field_1527 = var2;
      this.field_1529 = var3;
      this.field_1530 = var4;
      this.field_1531 = var5;
   }

   private void method_1845(class_7666 var1, long var2) {
      class_1150 var6 = var1.method_26525();
      var1.method_34704(this.field_1532);
      var6.method_5127(this.field_1532);
      var6.method_5105(class_6044.field_30909, var2);
   }

   public void method_1843(class_6331 var1, class_7666 var2, long var3) {
      class_1150 var7 = var2.method_26525();
      var7.<class_8150>method_5138(this.field_1532)
         .ifPresent(
            var6 -> {
               if (this.method_1842(var1, var6) || this.method_1846(var1, var2)) {
                  this.method_1845(var2, var3);
               } else if (!this.method_1847(var2, var6)) {
                  if (!this.method_1844(var1, var2, var6)) {
                     var7.method_5105(class_6044.field_30889, new class_6651(var6.method_37409(), this.field_1527, this.field_1529));
                  }
               } else {
                  class_1343 var9 = null;
                  int var10 = 0;

                  for (short var11 = 1000;
                     var10 < 1000 && (var9 == null || this.method_1847(var2, class_8150.method_37410(var1.method_29545(), new BlockPos(var9))));
                     var10++
                  ) {
                     var9 = class_3425.method_15837(var2, 15, 7, class_1343.method_6200(var6.method_37409()));
                  }

                  if (var10 == 1000) {
                     this.method_1845(var2, var3);
                     return;
                  }

                  var7.method_5105(class_6044.field_30889, new class_6651(var9, this.field_1527, this.field_1529));
               }
            }
         );
   }

   private boolean method_1846(class_6331 var1, class_7666 var2) {
      Optional var5 = var2.method_26525().<Long>method_5138(class_6044.field_30909);
      return !var5.isPresent() ? false : var1.method_29546() - (Long)var5.get() > (long)this.field_1531;
   }

   private boolean method_1847(class_7666 var1, class_8150 var2) {
      return var2.method_37409().method_12176(var1.method_37075()) > this.field_1530;
   }

   private boolean method_1842(class_6331 var1, class_8150 var2) {
      return var2.method_37408() != var1.method_29545();
   }

   private boolean method_1844(class_6331 var1, class_7666 var2, class_8150 var3) {
      return var3.method_37408() == var1.method_29545() && var3.method_37409().method_12176(var2.method_37075()) <= this.field_1529;
   }
}
