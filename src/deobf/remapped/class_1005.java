package remapped;

import com.google.common.collect.ImmutableMap;

public class class_1005 extends class_5920<class_5886> {
   private static String[] field_5172;
   private final float field_5173;

   public class_1005(float var1) {
      super(
         ImmutableMap.of(
            class_6044.field_30889,
            class_561.field_3319,
            class_6044.field_30874,
            class_561.field_3319,
            class_6044.field_30884,
            class_561.field_3320,
            class_6044.field_30901,
            class_561.field_3319
         )
      );
      this.field_5173 = var1;
   }

   public void method_4355(class_6331 var1, class_5886 var2, long var3) {
      class_5834 var7 = var2.method_26525().<class_5834>method_5138(class_6044.field_30884).get();
      if (class_1225.method_5449(var2, var7) && class_1225.method_5451(var2, var7, 1)) {
         this.method_4357(var2);
      } else {
         this.method_4356(var2, var7);
      }
   }

   private void method_4356(class_5834 var1, class_5834 var2) {
      class_1150 var5 = var1.method_26525();
      var5.method_5105(class_6044.field_30874, new class_4843(var2, true));
      class_6651 var6 = new class_6651(new class_4843(var2, false), this.field_5173, 0);
      var5.method_5105(class_6044.field_30889, var6);
   }

   private void method_4357(class_5834 var1) {
      var1.method_26525().method_5127(class_6044.field_30889);
   }
}
