package remapped;

public class class_4782 extends class_7164<class_3024, class_472<class_3024>> {
   private static final class_4639 field_23157 = new class_4639("textures/entity/chicken.png");

   public class_4782(class_6122 var1) {
      super(var1, new class_472<class_3024>(), 0.3F);
   }

   public class_4639 method_22018(class_3024 var1) {
      return field_23157;
   }

   public float method_22019(class_3024 var1, float var2) {
      float var5 = class_9299.method_42795(var2, var1.field_14829, var1.field_14831);
      float var6 = class_9299.method_42795(var2, var1.field_14830, var1.field_14827);
      return (class_9299.method_42818(var5) + 1.0F) * var6;
   }
}
