package mapped;

public class Class5730 extends Class5715<Class905> {
   private static final ResourceLocation field25138 = new ResourceLocation("textures/entity/shulker/spark.png");
   private static final Class4520 field25139 = Class4520.method14318(field25138);
   private final Class2821<Class905> field25140 = new Class2821<Class905>();

   public Class5730(Class8853 var1) {
      super(var1);
   }

   public int method17858(Class905 var1, BlockPos var2) {
      return 15;
   }

   public void method17853(Class905 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.method35294();
      float var9 = MathHelper.method37828(var1.field5033, var1.field5031, var3);
      float var10 = MathHelper.method37821(var3, var1.field5034, var1.field5032);
      float var11 = (float)var1.field5055 + var3;
      var4.method35291(0.0, 0.15F, 0.0);
      var4.method35293(Class7680.field32900.method25286(MathHelper.method37763(var11 * 0.1F) * 180.0F));
      var4.method35293(Class7680.field32898.method25286(MathHelper.method37764(var11 * 0.1F) * 180.0F));
      var4.method35293(Class7680.field32902.method25286(MathHelper.method37763(var11 * 0.15F) * 360.0F));
      var4.method35292(-0.5F, -0.5F, 0.5F);
      this.field25140.method10998(var1, 0.0F, 0.0F, 0.0F, var9, var10);
      Class5422 var12 = var5.method25597(this.field25140.method11028(field25138));
      this.field25140.method11016(var4, var12, var6, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.method35292(1.5F, 1.5F, 1.5F);
      Class5422 var13 = var5.method25597(field25139);
      this.field25140.method11016(var4, var13, var6, Class213.field798, 1.0F, 1.0F, 1.0F, 0.15F);
      var4.method35295();
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public ResourceLocation method17843(Class905 var1) {
      return field25138;
   }
}