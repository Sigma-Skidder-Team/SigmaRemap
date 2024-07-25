package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_7113<E extends class_2599> extends class_5920<E> {
   private static String[] field_36669;
   private final int field_36668;

   public class_7113(int var1) {
      super(ImmutableMap.of(class_6044.field_30897, class_561.field_3320, class_6044.field_30869, class_561.field_3319));
      this.field_36668 = var1;
   }

   public boolean method_32683(class_6331 var1, E var2) {
      if (var2.method_26568().method_28022()) {
         Optional var5 = var2.method_26525().<class_91>method_5138(class_6044.field_30869);
         return var5.isPresent() ? !((class_91)var5.get()).method_37124(var2, (double)this.field_36668) : true;
      } else {
         return false;
      }
   }

   public void method_32682(class_6331 var1, E var2, long var3) {
      var2.method_26525().method_5127(class_6044.field_30897);
   }
}
