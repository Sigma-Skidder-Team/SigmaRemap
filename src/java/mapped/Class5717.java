package mapped;

public class Class5717 extends Class5715<Class883> {
   private static final ResourceLocation field25104 = new ResourceLocation("textures/entity/llama/spit.png");
   private final Class2884<Class883> field25105 = new Class2884<Class883>();

   public Class5717(Class8853 var1) {
      super(var1);
   }

   public void method17853(Class883 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.method35294();
      var4.method35291(0.0, 0.15F, 0.0);
      var4.method35293(Class7680.field32900.method25286(MathHelper.method37821(var3, var1.field5033, var1.field5031) - 90.0F));
      var4.method35293(Class7680.field32902.method25286(MathHelper.method37821(var3, var1.field5034, var1.field5032)));
      this.field25105.method10998(var1, var3, 0.0F, -0.1F, 0.0F, 0.0F);
      Class5422 var9 = var5.method25597(this.field25105.method11028(field25104));
      this.field25105.method11016(var4, var9, var6, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.method35295();
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(Class883 var1) {
      return field25104;
   }
}