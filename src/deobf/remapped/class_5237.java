package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_5237<E extends class_2599> extends class_5920<E> {
   private static String[] field_26843;
   private final int field_26845;
   private final int field_26844;

   public class_5237(int var1, int var2) {
      super(
         ImmutableMap.of(
            class_6044.field_30897,
            class_561.field_3320,
            class_6044.field_30869,
            class_561.field_3320,
            class_6044.field_30893,
            class_561.field_3319,
            class_6044.field_30890,
            class_561.field_3319
         )
      );
      this.field_26845 = var1;
      this.field_26844 = var2;
   }

   public boolean method_23978(class_6331 var1, E var2) {
      return var2.method_26568().method_28022();
   }

   public void method_23977(class_6331 var1, E var2, long var3) {
      class_1150 var7 = var2.method_26525();
      Optional var8 = var7.<Integer>method_5138(class_6044.field_30893);
      if (var8.isPresent()) {
         int var9 = (Integer)var8.get();
         if (var9 <= this.field_26845) {
            var7.method_5105(class_6044.field_30893, var9 + 1);
         } else {
            var7.method_5127(class_6044.field_30897);
            var7.method_5127(class_6044.field_30893);
            var7.method_5107(class_6044.field_30890, true, (long)this.field_26844);
         }
      } else {
         var7.method_5105(class_6044.field_30893, 0);
      }
   }
}
