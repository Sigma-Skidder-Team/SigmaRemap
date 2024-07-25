package remapped;

import com.google.common.collect.ImmutableMap;

public class class_601<E extends class_2599> extends class_5920<E> {
   private static String[] field_3451;
   private final int field_3452;

   public class_601(int var1) {
      super(
         ImmutableMap.of(
            class_6044.field_30869,
            class_561.field_3320,
            class_6044.field_30897,
            class_561.field_3318,
            class_6044.field_30879,
            class_561.field_3318,
            class_6044.field_30890,
            class_561.field_3318
         )
      );
      this.field_3452 = var1;
   }

   public boolean method_2814(class_6331 var1, E var2) {
      class_91 var5 = var2.method_26525().<class_91>method_5138(class_6044.field_30869).get();
      return class_134.method_491(var5.method_264().method_27960());
   }

   public void method_2813(class_6331 var1, E var2, long var3) {
      var2.method_26525().method_5107(class_6044.field_30897, true, (long)this.field_3452);
   }
}
