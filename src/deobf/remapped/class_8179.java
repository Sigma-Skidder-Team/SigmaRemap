package remapped;

public class class_8179 extends class_7164<class_7549, class_2344<class_7549>> {
   private static final class_4639 field_41870 = new class_4639("textures/entity/zombie/zombie.png");
   private final float field_41871;

   public class_8179(class_6122 var1, float var2) {
      super(var1, new class_8265(), 0.5F * var2);
      this.field_41871 = var2;
      this.method_29100(new class_6329<class_7549, class_2344<class_7549>>(this));
      this.method_29100(new class_3035<class_7549, class_2344<class_7549>, class_8265>(this, new class_8265(0.5F, true), new class_8265(1.0F, true)));
   }

   public void method_37497(class_7549 var1, class_7966 var2, float var3) {
      var2.method_36062(this.field_41871, this.field_41871, this.field_41871);
   }

   public class_4639 method_37496(class_7549 var1) {
      return field_41870;
   }
}
