package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_234 extends class_5920<class_7666> {
   private static String[] field_756;
   public final float field_757;

   public class_234(float var1) {
      super(ImmutableMap.of(class_6044.field_30868, class_561.field_3320), 1200);
      this.field_757 = var1;
   }

   public boolean method_991(class_6331 var1, class_7666 var2) {
      return var2.method_26525()
         .method_5126()
         .<Boolean>map(var0 -> var0 == class_6275.field_32075 || var0 == class_6275.field_32073 || var0 == class_6275.field_32064)
         .orElse(true);
   }

   public boolean method_990(class_6331 var1, class_7666 var2, long var3) {
      return var2.method_26525().method_5117(class_6044.field_30868);
   }

   public void method_988(class_6331 var1, class_7666 var2, long var3) {
      class_1225.method_5446(var2, var2.method_26525().<class_8150>method_5138(class_6044.field_30868).get().method_37409(), this.field_757, 1);
   }

   public void method_989(class_6331 var1, class_7666 var2, long var3) {
      Optional var7 = var2.method_26525().<class_8150>method_5138(class_6044.field_30868);
      var7.ifPresent(var1x -> {
         BlockPos var4 = var1x.method_37409();
         class_6331 var5 = var1.method_29522().method_1697(var1x.method_37408());
         if (var5 != null) {
            class_1489 var6 = var5.method_28969();
            if (var6.method_6869(var4, var0x -> true)) {
               var6.method_6860(var4);
            }

            class_1892.method_8433(var1, var4);
         }
      });
      var2.method_26525().method_5127(class_6044.field_30868);
   }
}
