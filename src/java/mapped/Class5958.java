package mapped;

public class Class5958 extends Class5957<Class957> {
   private static final ResourceLocation field25982 = new ResourceLocation("textures/entity/end_gateway_beam.png");

   public Class5958(Class8086 var1) {
      super(var1);
   }

   public void method18462(Class957 var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      if (var1.method3872() || var1.method3873()) {
         float var9 = !var1.method3872() ? var1.method3875(var2) : var1.method3874(var2);
         double var10 = !var1.method3872() ? 50.0 : 256.0;
         var9 = MathHelper.method37763(var9 * (float) Math.PI);
         int var12 = MathHelper.method37769((double)var9 * var10);
         float[] var13 = !var1.method3872() ? Class112.field396.method311() : Class112.field388.method311();
         long var14 = var1.method3734().method6783();
         Class5946.method18469(var3, var4, field25982, var2, var9, var14, 0, var12, var13, 0.15F, 0.175F);
         Class5946.method18469(var3, var4, field25982, var2, var9, var14, 0, -var12, var13, 0.15F, 0.175F);
      }

      super.method18462(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public int method18489(double var1) {
      return super.method18489(var1) + 1;
   }

   @Override
   public float method18490() {
      return 1.0F;
   }
}