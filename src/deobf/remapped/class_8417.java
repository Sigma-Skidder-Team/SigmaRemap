package remapped;

public class class_8417 extends class_4556<class_9490, class_7236<class_9490>> {
   private static final class_4639 field_43044 = new class_4639("textures/entity/creeper/creeper_armor.png");
   private final class_7236<class_9490> field_43045 = new class_7236<class_9490>(2.0F);

   public class_8417(class_2514<class_9490, class_7236<class_9490>> var1) {
      super(var1);
   }

   @Override
   public float method_21123(float var1) {
      return var1 * 0.01F;
   }

   @Override
   public class_4639 method_21124() {
      return field_43044;
   }

   @Override
   public class_6521<class_9490> method_21122() {
      return this.field_43045;
   }
}
