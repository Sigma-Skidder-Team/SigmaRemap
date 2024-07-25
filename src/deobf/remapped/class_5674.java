package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.function.BiPredicate;

public class class_5674<E extends class_5834, T extends Entity> extends class_5920<E> {
   private static String[] field_28761;
   private final int field_28760;
   private final BiPredicate<E, Entity> field_28759;

   public class_5674(int var1, BiPredicate<E, Entity> var2) {
      super(ImmutableMap.of(class_6044.field_30903, class_561.field_3319));
      this.field_28760 = var1;
      this.field_28759 = var2;
   }

   @Override
   public boolean method_27088(class_6331 var1, E var2) {
      Entity var5 = var2.method_37243();
      Entity var6 = var2.method_26525().<Entity>method_5138(class_6044.field_30903).orElse((Entity)null);
      if (var5 == null && var6 == null) {
         return false;
      } else {
         Entity var7 = var5 != null ? var5 : var6;
         return !this.method_25659((E)var2, var7) || this.field_28759.test((E)var2, var7);
      }
   }

   private boolean method_25659(E var1, Entity var2) {
      return var2.method_37330() && var2.method_37124(var1, (double)this.field_28760) && var2.field_41768 == var1.field_41768;
   }

   @Override
   public void method_27080(class_6331 var1, E var2, long var3) {
      var2.method_37390();
      var2.method_26525().method_5127(class_6044.field_30903);
   }
}
