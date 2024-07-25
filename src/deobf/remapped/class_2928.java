package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_2928 extends class_5920<class_7666> {
   private static String[] field_14270;

   public class_2928() {
      super(ImmutableMap.of(class_6044.field_30868, class_561.field_3320));
   }

   public boolean method_13387(class_6331 var1, class_7666 var2) {
      BlockPos var5 = var2.method_26525().<class_8150>method_5138(class_6044.field_30868).get().method_37409();
      return var5.method_12170(var2.method_37245(), 2.0) || var2.method_34698();
   }

   public void method_13386(class_6331 var1, class_7666 var2, long var3) {
      class_8150 var7 = var2.method_26525().<class_8150>method_5138(class_6044.field_30868).get();
      var2.method_26525().method_5127(class_6044.field_30868);
      var2.method_26525().method_5105(class_6044.field_30883, var7);
      var1.method_29587(var2, (byte)14);
      if (var2.method_15891().method_13910() == class_4466.field_21775) {
         class_341 var8 = var1.method_29522();
         Optional.<class_6331>ofNullable(var8.method_1697(var7.method_37408()))
            .<class_236>flatMap(var1x -> var1x.method_28969().method_6870(var7.method_37409()))
            .<class_4466>flatMap(var0 -> class_8669.field_44425.method_39801().filter(var1x -> var1x.method_20723() == var0).findFirst())
            .ifPresent(var2x -> {
               var2.method_34716(var2.method_15891().method_13909(var2x));
               var2.method_34706(var1);
            });
      }
   }
}
