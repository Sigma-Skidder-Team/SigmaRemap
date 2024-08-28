package mapped;

public class Class5954 extends Class5942<Class940> {
   private static String[] field25965;
   private final Class2887<?> field25966;

   public Class5954(Class2887<?> var1, Class8086 var2) {
      super(var2);
      this.field25966 = var1;
   }

   public void method18462(Class940 var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      Direction var9 = Direction.field673;
      if (var1.method3770()) {
         Class7380 var10 = var1.method3734().method6738(var1.method3774());
         if (var10.method23383() instanceof Class3368) {
            var9 = var10.<Direction>method23463(Class3368.field18939);
         }
      }

      Class112 var14 = var1.method3756();
      Class7826 var11;
      if (var14 != null) {
         var11 = Class8624.field38783.get(var14.method309());
      } else {
         var11 = Class8624.field38782;
      }

      var3.method35294();
      var3.method35291(0.5, 0.5, 0.5);
      float var12 = 0.9995F;
      var3.method35292(0.9995F, 0.9995F, 0.9995F);
      var3.method35293(var9.method532());
      var3.method35292(1.0F, -1.0F, -1.0F);
      var3.method35291(0.0, -1.0, 0.0);
      Class5422 var13 = var11.method26200(var4, Class4520::method14312);
      this.field25966.method11202().method22680(var3, var13, var5, var6);
      var3.method35291(0.0, (double)(-var1.method3755(var2) * 0.5F), 0.0);
      var3.method35293(Class7680.field32900.method25286(270.0F * var1.method3755(var2)));
      this.field25966.method11203().method22680(var3, var13, var5, var6);
      var3.method35295();
   }
}
