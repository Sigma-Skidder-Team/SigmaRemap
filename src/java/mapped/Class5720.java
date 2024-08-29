package mapped;

import net.minecraft.util.math.BlockPos;

public class Class5720 extends Class5715<Class903> {
   private static final ResourceLocation field25117 = new ResourceLocation("textures/entity/enderdragon/dragon_fireball.png");
   private static final RenderType field25118 = RenderType.getEntityCutoutNoCull(field25117);

   public Class5720(EntityRendererManager var1) {
      super(var1);
   }

   public int method17858(Class903 var1, BlockPos var2) {
      return 15;
   }

   public void method17853(Class903 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      var4.method35292(2.0F, 2.0F, 2.0F);
      var4.method35293(this.field25097.method32230());
      var4.method35293(Class7680.field32900.method25286(180.0F));
      Class8892 var9 = var4.method35296();
      Class9367 var10 = var9.method32361();
      Class8967 var11 = var9.method32362();
      Class5422 var12 = var5.method25597(field25118);
      method17908(var12, var10, var11, var6, 0.0F, 0, 0, 1);
      method17908(var12, var10, var11, var6, 1.0F, 0, 1, 1);
      method17908(var12, var10, var11, var6, 1.0F, 1, 1, 0);
      method17908(var12, var10, var11, var6, 0.0F, 1, 0, 0);
      var4.method35295();
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   private static void method17908(Class5422 var0, Class9367 var1, Class8967 var2, int var3, float var4, int var5, int var6, int var7) {
      var0.method17040(var1, var4 - 0.5F, (float)var5 - 0.25F, 0.0F)
         .color(255, 255, 255, 255)
         .method17027((float)var6, (float)var7)
         .method17035(Class213.field798)
         .method17034(var3)
         .method17041(var2, 0.0F, 1.0F, 0.0F)
         .endVertex();
   }

   public ResourceLocation method17843(Class903 var1) {
      return field25117;
   }
}
