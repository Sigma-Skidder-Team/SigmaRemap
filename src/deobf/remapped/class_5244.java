package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class class_5244 extends class_5920<class_5834> {
   private static String[] field_26869;
   private final class_6044<class_8150> field_26867;
   private final Predicate<class_236> field_26868;

   public class_5244(class_236 var1, class_6044<class_8150> var2) {
      super(ImmutableMap.of(var2, class_561.field_3320));
      this.field_26868 = var1.method_1007();
      this.field_26867 = var2;
   }

   @Override
   public boolean method_27088(class_6331 var1, class_5834 var2) {
      class_8150 var5 = var2.method_26525().<class_8150>method_5138(this.field_26867).get();
      return var1.method_29545() == var5.method_37408() && var5.method_37409().method_12170(var2.method_37245(), 16.0);
   }

   @Override
   public void method_27080(class_6331 var1, class_5834 var2, long var3) {
      class_1150 var7 = var2.method_26525();
      class_8150 var8 = var7.<class_8150>method_5138(this.field_26867).get();
      class_1331 var9 = var8.method_37409();
      class_6331 var10 = var1.method_29522().method_1697(var8.method_37408());
      if (var10 == null || this.method_23991(var10, var9)) {
         var7.method_5127(this.field_26867);
      } else if (this.method_23990(var10, var9, var2)) {
         var7.method_5127(this.field_26867);
         var1.method_28969().method_6860(var9);
         class_1892.method_8433(var1, var9);
      }
   }

   private boolean method_23990(class_6331 var1, class_1331 var2, class_5834 var3) {
      class_2522 var6 = var1.method_28262(var2);
      return var6.method_8360().method_29299(class_2351.field_11784) && var6.<Boolean>method_10313(class_3633.field_17728) && !var3.method_26507();
   }

   private boolean method_23991(class_6331 var1, class_1331 var2) {
      return !var1.method_28969().method_6869(var2, this.field_26868);
   }
}
