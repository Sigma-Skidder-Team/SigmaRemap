package remapped;

public class class_8263 extends class_1171 {
   private static final Identifier field_42389 = new Identifier("textures/entity/zombie/husk.png");

   public class_8263(EntityRenderDispatcher var1) {
      super(var1);
   }

   public void method_38083(class_2811 var1, class_7966 var2, float var3) {
      float var6 = 1.0625F;
      var2.method_36062(1.0625F, 1.0625F, 1.0625F);
      super.method_29112(var1, var2, var3);
   }

   @Override
   public Identifier method_7987(class_2811 var1) {
      return field_42389;
   }
}
