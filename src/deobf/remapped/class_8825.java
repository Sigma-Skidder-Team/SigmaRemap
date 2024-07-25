package remapped;

public class class_8825 extends class_9873 {
   public static final Identifier field_45139 = new Identifier("textures/entity/trident.png");
   private final class_1549 field_45138 = new class_1549(32, 32, 0, 6);

   public class_8825() {
      super(class_3581::method_16734);
      this.field_45138.method_7049(-0.5F, 2.0F, -0.5F, 1.0F, 25.0F, 1.0F, 0.0F);
      class_1549 var3 = new class_1549(32, 32, 4, 0);
      var3.method_7048(-1.5F, 0.0F, -0.5F, 3.0F, 2.0F, 1.0F);
      this.field_45138.method_7043(var3);
      class_1549 var4 = new class_1549(32, 32, 4, 3);
      var4.method_7048(-2.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F);
      this.field_45138.method_7043(var4);
      class_1549 var5 = new class_1549(32, 32, 0, 0);
      var5.method_7049(-0.5F, -4.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F);
      this.field_45138.method_7043(var5);
      class_1549 var6 = new class_1549(32, 32, 4, 3);
      var6.field_8197 = true;
      var6.method_7048(1.5F, -3.0F, -0.5F, 1.0F, 4.0F, 1.0F);
      this.field_45138.method_7043(var6);
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.field_45138.method_7061(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
