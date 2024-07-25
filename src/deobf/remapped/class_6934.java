package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_6934 extends class_5920<class_5834> {
   private static String[] field_35642;
   private final int field_35643;
   private final int field_35641;
   private int field_35644;

   public class_6934(int var1, int var2) {
      super(ImmutableMap.of(class_6044.field_30899, class_561.field_3320, class_6044.field_30894, class_561.field_3320));
      this.field_35641 = var1 * 20;
      this.field_35644 = 0;
      this.field_35643 = var2;
   }

   @Override
   public void method_27080(class_6331 var1, class_5834 var2, long var3) {
      class_1150 var7 = var2.method_26525();
      Optional var8 = var7.<Long>method_5138(class_6044.field_30894);
      boolean var9 = (Long)var8.get() + 300L <= var3;
      if (this.field_35644 <= this.field_35641 && !var9) {
         class_1331 var10 = var7.<class_8150>method_5138(class_6044.field_30899).get().method_37409();
         if (var10.method_12171(var2.method_37075(), (double)this.field_35643)) {
            this.field_35644++;
         }
      } else {
         var7.method_5127(class_6044.field_30894);
         var7.method_5127(class_6044.field_30899);
         var7.method_5132(var1.method_29584(), var1.method_29546());
         this.field_35644 = 0;
      }
   }
}
