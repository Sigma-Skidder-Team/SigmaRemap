package remapped;

public class class_875 extends class_7164<class_1609, class_4845<class_1609>> {
   private static final Identifier field_4520 = new Identifier("textures/entity/witch.png");

   public class_875(EntityRenderDispatcher var1) {
      super(var1, new class_4845<class_1609>(0.0F), 0.5F);
      this.method_29100(new class_5865<class_1609>(this));
   }

   public void method_3772(class_1609 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      this.field_32487.method_22284(!var1.method_26446().method_28022());
      super.method_32866(var1, var2, var3, var4, var5, var6);
   }

   public Identifier method_3771(class_1609 var1) {
      return field_4520;
   }

   public void method_3773(class_1609 var1, class_7966 var2, float var3) {
      float var6 = 0.9375F;
      var2.method_36062(0.9375F, 0.9375F, 0.9375F);
   }
}