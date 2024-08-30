package mapped;

import net.minecraft.entity.Entity;

public class Class233<T extends Class880, M extends Class2894<T>> extends Class231<T, M> {
   private static final ResourceLocation field879 = new ResourceLocation("textures/entity/bee/bee_stinger.png");

   public Class233(Class5712<T, M> var1) {
      super(var1);
   }

   @Override
   public int method835(T var1) {
      return var1.method3078();
   }

   @Override
   public void method836(MatrixStack var1, Class7733 var2, int var3, Entity var4, float var5, float var6, float var7, float var8) {
      float var11 = MathHelper.method37765(var5 * var5 + var7 * var7);
      float var12 = (float)(Math.atan2((double)var5, (double)var7) * 180.0F / (float)Math.PI);
      float var13 = (float)(Math.atan2((double)var6, (double)var11) * 180.0F / (float)Math.PI);
      var1.translate(0.0, 0.0, 0.0);
      var1.rotate(Vector3f.YP.rotationDegrees(var12 - 90.0F));
      var1.rotate(Vector3f.field32902.rotationDegrees(var13));
      float var14 = 0.0F;
      float var15 = 0.125F;
      float var16 = 0.0F;
      float var17 = 0.0625F;
      float var18 = 0.03125F;
      var1.rotate(Vector3f.field32898.rotationDegrees(45.0F));
      var1.method35292(0.03125F, 0.03125F, 0.03125F);
      var1.translate(2.5, 0.0, 0.0);
      Class5422 var19 = var2.method25597(RenderType.getEntityCutoutNoCull(field879));

      for (int var20 = 0; var20 < 4; var20++) {
         var1.rotate(Vector3f.field32898.rotationDegrees(90.0F));
         Class8892 var21 = var1.getLast();
         Matrix4f var22 = var21.getMatrix();
         Class8967 var23 = var21.method32362();
         method837(var19, var22, var23, -4.5F, -1, 0.0F, 0.0F, var3);
         method837(var19, var22, var23, 4.5F, -1, 0.125F, 0.0F, var3);
         method837(var19, var22, var23, 4.5F, 1, 0.125F, 0.0625F, var3);
         method837(var19, var22, var23, -4.5F, 1, 0.0F, 0.0625F, var3);
      }
   }

   private static void method837(Class5422 var0, Matrix4f var1, Class8967 var2, float var3, int var4, float var5, float var6, int var7) {
      var0.pos(var1, var3, (float)var4, 0.0F)
         .color(255, 255, 255, 255)
         .tex(var5, var6)
         .method17035(Class213.field798)
         .method17034(var7)
         .method17041(var2, 0.0F, 1.0F, 0.0F)
         .endVertex();
   }
}
