package remapped;

import com.google.common.collect.ImmutableMap;

public class class_324 extends class_5920<LivingEntity> {
   private static String[] field_1208;
   private final float field_1207;
   private final int field_1206;

   public class_324(float var1, int var2) {
      super(ImmutableMap.of(class_6044.field_30889, class_561.field_3318, class_6044.field_30874, class_561.field_3320));
      this.field_1207 = var1;
      this.field_1206 = var2;
   }

   @Override
   public void method_27080(class_6331 var1, LivingEntity var2, long var3) {
      class_1150 var7 = var2.method_26525();
      class_7835 var8 = var7.<class_7835>method_5138(class_6044.field_30874).get();
      var7.method_5105(class_6044.field_30889, new class_6651(var8, this.field_1207, this.field_1206));
   }
}
