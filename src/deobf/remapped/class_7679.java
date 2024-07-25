package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_7679 extends class_5920<class_7666> {
   private static String[] field_39026;
   private final float field_39025;

   public class_7679(float var1) {
      super(
         ImmutableMap.of(
            class_6044.field_30868, class_561.field_3320, class_6044.field_30883, class_561.field_3318, class_6044.field_30907, class_561.field_3320
         )
      );
      this.field_39025 = var1;
   }

   public boolean method_34796(class_6331 var1, class_7666 var2) {
      return !var2.method_26449() ? var2.method_15891().method_13910() == class_4466.field_21775 : false;
   }

   public void method_34794(class_6331 var1, class_7666 var2, long var3) {
      BlockPos var7 = var2.method_26525().<class_8150>method_5138(class_6044.field_30868).get().method_37409();
      Optional var8 = var1.method_28969().method_6870(var7);
      if (var8.isPresent()) {
         class_1225.method_5455(var2, var3x -> this.method_34798((class_236)var8.get(), var3x, var7))
            .findFirst()
            .ifPresent(var4 -> this.method_34795(var1, var2, var4, var7, var4.method_26525().<class_8150>method_5138(class_6044.field_30883).isPresent()));
      }
   }

   private boolean method_34798(class_236 var1, class_7666 var2, BlockPos var3) {
      boolean var6 = var2.method_26525().<class_8150>method_5138(class_6044.field_30868).isPresent();
      if (!var6) {
         Optional var7 = var2.method_26525().<class_8150>method_5138(class_6044.field_30883);
         class_4466 var8 = var2.method_15891().method_13910();
         if (var2.method_15891().method_13910() != class_4466.field_21775 && var8.method_20723().method_1007().test(var1)) {
            return var7.isPresent() ? ((class_8150)var7.get()).method_37409().equals(var3) : this.method_34793(var2, var3, var1);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void method_34795(class_6331 var1, class_7666 var2, class_7666 var3, BlockPos var4, boolean var5) {
      this.method_34797(var2);
      if (!var5) {
         class_1225.method_5446(var3, var4, this.field_39025, 1);
         var3.method_26525().method_5105(class_6044.field_30868, class_8150.method_37410(var1.method_29545(), var4));
         class_1892.method_8433(var1, var4);
      }
   }

   private boolean method_34793(class_7666 var1, BlockPos var2, class_236 var3) {
      class_3998 var6 = var1.method_26927().method_5615(var2, var3.method_1006());
      return var6 != null && var6.method_18433();
   }

   private void method_34797(class_7666 var1) {
      var1.method_26525().method_5127(class_6044.field_30889);
      var1.method_26525().method_5127(class_6044.field_30874);
      var1.method_26525().method_5127(class_6044.field_30868);
   }
}
