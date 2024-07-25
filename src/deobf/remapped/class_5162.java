package remapped;

public class class_5162 extends class_7164<class_9408, class_8875<class_9408>> {
   private static final class_4639 field_26586 = new class_4639("textures/entity/wolf/wolf.png");
   private static final class_4639 field_26585 = new class_4639("textures/entity/wolf/wolf_tame.png");
   private static final class_4639 field_26584 = new class_4639("textures/entity/wolf/wolf_angry.png");

   public class_5162(class_6122 var1) {
      super(var1, new class_8875<class_9408>(), 0.5F);
      this.method_29100(new class_2682(this));
   }

   public float method_23658(class_9408 var1, float var2) {
      return var1.method_43577();
   }

   public void method_23657(class_9408 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      if (var1.method_43588()) {
         float var9 = var1.method_43581(var3);
         this.field_32487.method_17012(var9, var9, var9);
      }

      super.method_32866(var1, var2, var3, var4, var5, var6);
      if (var1.method_43588()) {
         this.field_32487.method_17012(1.0F, 1.0F, 1.0F);
      }
   }

   public class_4639 method_23656(class_9408 var1) {
      if (!var1.method_41215()) {
         return !var1.method_28537() ? field_26586 : field_26584;
      } else {
         return field_26585;
      }
   }
}
