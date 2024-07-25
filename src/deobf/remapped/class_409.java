package remapped;

import com.google.common.collect.ImmutableMap;

public class class_409<E extends class_1899> extends class_5920<E> {
   private static String[] field_1717;
   private final class_4376 field_1716;
   private final float field_1718;

   public class_409(class_4376 var1, float var2) {
      super(ImmutableMap.of(class_6044.field_30885, class_561.field_3320, class_6044.field_30889, class_561.field_3318));
      this.field_1716 = var1;
      this.field_1718 = var2;
   }

   public boolean method_2033(class_6331 var1, E var2) {
      if (!var2.method_26449()) {
         return false;
      } else {
         class_1899 var5 = this.method_2032((E)var2);
         return var2.method_37124(var5, (double)(this.field_1716.method_20390() + 1)) && !var2.method_37124(var5, (double)this.field_1716.method_20389());
      }
   }

   public void method_2031(class_6331 var1, E var2, long var3) {
      class_1225.method_5445(var2, this.method_2032((E)var2), this.field_1718, this.field_1716.method_20389() - 1);
   }

   private class_1899 method_2032(E var1) {
      return var1.method_26525().<class_1899>method_5138(class_6044.field_30885).get();
   }
}
