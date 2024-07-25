package remapped;

import java.util.EnumSet;
import java.util.Set;

public enum class_8089 {
   field_41423(0),
   field_41427(1),
   field_41424(2),
   field_41428(3),
   field_41429(4);

   private final int field_41425;

   private class_8089(int var3) {
      this.field_41425 = var3;
   }

   private int method_36730() {
      return 1 << this.field_41425;
   }

   private boolean method_36732(int var1) {
      return (var1 & this.method_36730()) == this.method_36730();
   }

   public static Set<class_8089> method_36733(int var0) {
      EnumSet var3 = EnumSet.<class_8089>noneOf(class_8089.class);

      for (class_8089 var7 : values()) {
         if (var7.method_36732(var0)) {
            var3.add(var7);
         }
      }

      return var3;
   }

   public static int method_36734(Set<class_8089> var0) {
      int var3 = 0;

      for (class_8089 var5 : var0) {
         var3 |= var5.method_36730();
      }

      return var3;
   }
}
