package remapped;

public class class_3369 extends class_4556<class_4653, class_379<class_4653>> {
   private static final class_4639 field_16611 = new class_4639("textures/entity/wither/wither_armor.png");
   private final class_379<class_4653> field_16609 = new class_379<class_4653>(0.5F);

   public class_3369(class_2514<class_4653, class_379<class_4653>> var1) {
      super(var1);
   }

   @Override
   public float method_21123(float var1) {
      return class_9299.method_42840(var1 * 0.02F) * 3.0F;
   }

   @Override
   public class_4639 method_21124() {
      return field_16611;
   }

   @Override
   public class_6521<class_4653> method_21122() {
      return this.field_16609;
   }
}
