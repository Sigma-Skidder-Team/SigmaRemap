package remapped;

public class class_8317 extends class_7164<class_9490, class_7236<class_9490>> {
   private static final Identifier field_42610 = new Identifier("textures/entity/creeper/creeper.png");

   public class_8317(class_6122 var1) {
      super(var1, new class_7236<class_9490>(), 0.5F);
      this.method_29100(new class_8417(this));
   }

   public void method_38348(class_9490 var1, class_7966 var2, float var3) {
      float var6 = var1.method_43830(var3);
      float var7 = 1.0F + class_9299.method_42818(var6 * 100.0F) * var6 * 0.01F;
      var6 = class_9299.method_42828(var6, 0.0F, 1.0F);
      var6 *= var6;
      var6 *= var6;
      float var8 = (1.0F + var6 * 0.4F) * var7;
      float var9 = (1.0F + var6 * 0.1F) / var7;
      var2.method_36062(var8, var9, var8);
   }

   public float method_38346(class_9490 var1, float var2) {
      float var5 = var1.method_43830(var2);
      return (int)(var5 * 10.0F) % 2 != 0 ? class_9299.method_42828(var5, 0.5F, 1.0F) : 0.0F;
   }

   public Identifier method_38347(class_9490 var1) {
      return field_42610;
   }
}
