package remapped;

import com.google.common.collect.ImmutableMap;

public class class_9296<E extends class_2599> extends class_5920<E> {
   private static String[] field_47429;

   public class_9296() {
      super(ImmutableMap.of(class_6044.field_30884, class_561.field_3320, class_6044.field_30864, class_561.field_3319));
   }

   public void method_42773(class_6331 var1, E var2, long var3) {
      if (this.method_42774((E)var2)) {
         class_134.method_470(var2);
      }
   }

   private boolean method_42774(E var1) {
      class_5834 var4 = var1.method_26525().<class_5834>method_5138(class_6044.field_30884).get();
      return var4.method_37387() == class_6629.field_34306 && var4.method_26450();
   }
}
