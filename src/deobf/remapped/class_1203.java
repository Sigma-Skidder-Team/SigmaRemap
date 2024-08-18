package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_1203 extends class_5920<class_4612> {
   private static String[] field_6714;
   private final float field_6713;
   private final int field_6712;
   private final int field_6715;

   public class_1203(float var1) {
      this(var1, 10, 7);
   }

   public class_1203(float var1, int var2, int var3) {
      super(ImmutableMap.of(class_6044.field_30889, class_561.field_3318));
      this.field_6713 = var1;
      this.field_6712 = var2;
      this.field_6715 = var3;
   }

   public void method_5327(class_6331 var1, class_4612 var2, long var3) {
      Optional var7 = Optional.<Vector3d>ofNullable(class_3425.method_15834(var2, this.field_6712, this.field_6715));
      var2.method_26525().method_5106(class_6044.field_30889, var7.map(var1x -> new class_6651(var1x, this.field_6713, 0)));
   }
}
