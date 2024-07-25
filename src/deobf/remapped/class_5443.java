package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;

public class class_5443<E extends class_5886> extends class_5920<E> {
   private static String[] field_27718;
   private final Predicate<class_5834> field_27719;

   public class_5443(Predicate<class_5834> var1) {
      super(ImmutableMap.of(class_6044.field_30884, class_561.field_3320, class_6044.field_30909, class_561.field_3319));
      this.field_27719 = var1;
   }

   public class_5443() {
      this(var0 -> false);
   }

   public void method_24796(class_6331 var1, E var2, long var3) {
      if (!method_24799(var2)) {
         if (!this.method_24797((E)var2)) {
            if (!this.method_24800((E)var2)) {
               if (class_3572.field_17480.test(this.method_24798((E)var2))) {
                  if (this.field_27719.test(this.method_24798((E)var2))) {
                     this.method_24801((E)var2);
                  }
               } else {
                  this.method_24801((E)var2);
               }
            } else {
               this.method_24801((E)var2);
            }
         } else {
            this.method_24801((E)var2);
         }
      } else {
         this.method_24801((E)var2);
      }
   }

   private boolean method_24800(E var1) {
      return this.method_24798((E)var1).world != var1.world;
   }

   private class_5834 method_24798(E var1) {
      return var1.method_26525().<class_5834>method_5138(class_6044.field_30884).get();
   }

   private static <E extends class_5834> boolean method_24799(E var0) {
      Optional var3 = var0.method_26525().<Long>method_5138(class_6044.field_30909);
      return var3.isPresent() && var0.world.method_29546() - (Long)var3.get() > 200L;
   }

   private boolean method_24797(E var1) {
      Optional var4 = var1.method_26525().<class_5834>method_5138(class_6044.field_30884);
      return var4.isPresent() && !((class_5834)var4.get()).isAlive();
   }

   private void method_24801(E var1) {
      var1.method_26525().method_5127(class_6044.field_30884);
   }
}
