package remapped;

public class class_494 extends class_7164<class_9825, class_5861<class_9825>> {
   private static final Identifier field_3073 = new Identifier("textures/entity/phantom.png");

   public class_494(EntityRenderDispatcher var1) {
      super(var1, new class_5861<class_9825>(), 0.75F);
      this.method_29100(new class_1519<class_9825>(this));
   }

   public Identifier method_2401(class_9825 var1) {
      return field_3073;
   }

   public void method_2402(class_9825 var1, class_7966 var2, float var3) {
      int var6 = var1.method_45296();
      float var7 = 1.0F + 0.15F * (float)var6;
      var2.method_36062(var7, var7, var7);
      var2.method_36065(0.0, 1.3125, 0.1875);
   }

   public void method_2400(class_9825 var1, class_7966 var2, float var3, float var4, float var5) {
      super.method_29099(var1, var2, var3, var4, var5);
      var2.method_36060(class_2426.field_12080.method_11074(var1.rotationPitch));
   }
}
