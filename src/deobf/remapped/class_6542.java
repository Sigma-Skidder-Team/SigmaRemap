package remapped;

public class class_6542 extends class_7164<class_4653, class_379<class_4653>> {
   private static final Identifier field_33266 = new Identifier("textures/entity/wither/wither_invulnerable.png");
   private static final Identifier field_33268 = new Identifier("textures/entity/wither/wither.png");

   public class_6542(EntityRenderDispatcher var1) {
      super(var1, new class_379<class_4653>(0.0F), 1.0F);
      this.method_29100(new class_3369(this));
   }

   public int method_29838(class_4653 var1, class_1331 var2) {
      return 15;
   }

   public Identifier method_29839(class_4653 var1) {
      int var4 = var1.method_21507();
      return var4 > 0 && (var4 > 80 || var4 / 5 % 2 != 1) ? field_33266 : field_33268;
   }

   public void method_29840(class_4653 var1, class_7966 var2, float var3) {
      float var6 = 2.0F;
      int var7 = var1.method_21507();
      if (var7 > 0) {
         var6 -= ((float)var7 - var3) / 220.0F * 0.5F;
      }

      var2.method_36062(var6, var6, var6);
   }
}
