package remapped;

public class class_5895 extends class_7164<class_378, class_1290<class_378>> {
   private static final Identifier field_29940 = new Identifier("textures/entity/slime/slime.png");

   public class_5895(EntityRenderDispatcher var1) {
      super(var1, new class_1290<class_378>(16), 0.25F);
      this.method_29100(new class_3860<class_378>(this));
   }

   public void method_26958(class_378 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      this.field_36492 = 0.25F * (float)var1.method_1860();
      super.method_32866(var1, var2, var3, var4, var5, var6);
   }

   public void method_26959(class_378 var1, class_7966 var2, float var3) {
      float var6 = 0.999F;
      var2.method_36062(0.999F, 0.999F, 0.999F);
      var2.method_36065(0.0, 0.001F, 0.0);
      float var7 = (float)var1.method_1860();
      float var8 = MathHelper.method_42795(var3, var1.field_1533, var1.field_1538) / (var7 * 0.5F + 1.0F);
      float var9 = 1.0F / (var8 + 1.0F);
      var2.method_36062(var9 * var7, 1.0F / var9 * var7, var9 * var7);
   }

   public Identifier method_26957(class_378 var1) {
      return field_29940;
   }
}
