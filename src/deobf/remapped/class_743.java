package remapped;

public class class_743 extends class_7164<class_8127, class_7946<class_8127>> {
   private static final Identifier field_4046 = new Identifier("textures/entity/iron_golem/iron_golem.png");

   public class_743(EntityRenderDispatcher var1) {
      super(var1, new class_7946<class_8127>(), 0.7F);
      this.method_29100(new class_1650(this));
      this.method_29100(new class_2322(this));
   }

   public Identifier method_3373(class_8127 var1) {
      return field_4046;
   }

   public void method_3372(class_8127 var1, class_7966 var2, float var3, float var4, float var5) {
      super.method_29099(var1, var2, var3, var4, var5);
      if (!((double)var1.field_29643 < 0.01)) {
         float var8 = 13.0F;
         float var9 = var1.field_29671 - var1.field_29643 * (1.0F - var5) + 6.0F;
         float var10 = (Math.abs(var9 % 13.0F - 6.5F) - 3.25F) / 3.25F;
         var2.method_36060(class_2426.field_12076.method_11074(6.5F * var10));
      }
   }
}
