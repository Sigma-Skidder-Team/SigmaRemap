package mapped;

public class Class5722 extends Class5715<Class915> {
   private static final ResourceLocation field25120 = new ResourceLocation("textures/entity/illager/evoker_fangs.png");
   private final Class2804<Class915> field25121 = new Class2804<Class915>();

   public Class5722(Class8853 var1) {
      super(var1);
   }

   public void method17853(Class915 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      float var9 = var1.method3584(var3);
      if (var9 != 0.0F) {
         float var10 = 2.0F;
         if (var9 > 0.9F) {
            var10 = (float)((double)var10 * ((1.0 - (double)var9) / 0.1F));
         }

         var4.method35294();
         var4.method35293(Class7680.field32900.method25286(90.0F - var1.field5031));
         var4.method35292(-var10, -var10, var10);
         float var11 = 0.03125F;
         var4.method35291(0.0, -0.626F, 0.0);
         var4.method35292(0.5F, 0.5F, 0.5F);
         this.field25121.method10998(var1, var9, 0.0F, 0.0F, var1.field5031, var1.field5032);
         Class5422 var12 = var5.method25597(this.field25121.method11028(field25120));
         this.field25121.method11016(var4, var12, var6, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
         var4.method35295();
         super.method17853(var1, var2, var3, var4, var5, var6);
      }
   }

   public ResourceLocation method17843(Class915 var1) {
      return field25120;
   }
}
